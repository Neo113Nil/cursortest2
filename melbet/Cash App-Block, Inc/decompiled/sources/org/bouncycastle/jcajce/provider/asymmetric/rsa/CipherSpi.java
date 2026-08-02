package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.tls.TlsRsaKeyExchange;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.spec.TLSRSAPremasterSecretParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut;
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private CipherParameters param;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;
    private TLSRSAPremasterSecretParameterSpec tlsRsaSpec;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            a$$ExternalSyntheticBUOutline0.m$3(e.getMessage());
            throw null;
        }
    }

    private int getInputLimit() {
        if (this.tlsRsaSpec != null) {
            return TlsRsaKeyExchange.getInputLimit((RSAKeyParameters) ((ParametersWithRandom) this.param).getParameters());
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        boolean z = asymmetricBlockCipher instanceof RSABlindedEngine;
        int inputBlockSize = asymmetricBlockCipher.getInputBlockSize();
        return z ? inputBlockSize + 1 : inputBlockSize;
    }

    private byte[] getOutput() {
        byte[] processBlock;
        try {
            if (this.tlsRsaSpec != null) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) this.param;
                processBlock = TlsRsaKeyExchange.decryptPreMasterSecret(this.bOut.getBuf(), 0, this.bOut.size(), (RSAKeyParameters) parametersWithRandom.getParameters(), this.tlsRsaSpec.getProtocolVersion(), parametersWithRandom.getRandom());
            } else {
                try {
                    processBlock = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
                    if (processBlock == null) {
                        throw new BadBlockException("unable to decrypt block", null);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new BadBlockException("unable to decrypt block", e);
                } catch (InvalidCipherTextException e2) {
                    throw new BadBlockException("unable to decrypt block", e2);
                }
            }
            return processBlock;
        } finally {
            this.bOut.erase();
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 > bArr2.length - engineGetOutputSize(bArr == null ? 0 : i2)) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.cipher.getInputBlockSize();
        } catch (NullPointerException unused) {
            a$$ExternalSyntheticBUOutline0.m$1("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        a$$ExternalSyntheticBUOutline0.m$3("not an RSA key!");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        if (this.tlsRsaSpec != null) {
            return 48;
        }
        try {
            return this.cipher.getOutputBlockSize();
        } catch (NullPointerException unused) {
            a$$ExternalSyntheticBUOutline0.m$1("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("OAEP");
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e) {
                Mod$$ExternalSyntheticBUOutline0.m$3(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        RSAKeyParameters generatePrivateKeyParameter;
        this.tlsRsaSpec = null;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec) && !(algorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        if (key instanceof RSAPublicKey) {
            if (this.privateKeyOnly && i == 1) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("mode 1 requires RSAPrivateKey");
                return;
            }
            generatePrivateKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
        } else if (!(key instanceof RSAPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown key type passed to RSA");
            return;
        } else {
            if (this.publicKeyOnly && i == 1) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("mode 2 requires RSAPublicKey");
                return;
            }
            generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
        }
        this.param = generatePrivateKeyParameter;
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.paramSpec = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("unknown mask generation function specified");
                return;
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("unkown MGF parameters");
                return;
            }
            Digest digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec) {
            CipherParameters cipherParameters = this.param;
            if (!(cipherParameters instanceof RSAKeyParameters) || !((RSAKeyParameters) cipherParameters).isPrivate()) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("RSA private key required for TLS decryption");
                return;
            }
            this.tlsRsaSpec = (TLSRSAPremasterSecretParameterSpec) algorithmParameterSpec;
        }
        CipherParameters cipherParameters2 = this.param;
        this.param = secureRandom != null ? new ParametersWithRandom(cipherParameters2, secureRandom) : new ParametersWithRandom(cipherParameters2, CryptoServicesRegistrar.getSecureRandom());
        this.bOut.reset();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unknown opmode ", " passed to RSA"));
                    }
                }
            }
            this.cipher.init(false, this.param);
            return;
        }
        this.cipher.init(true, this.param);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NONE") || upperCase.equals("ECB")) {
            return;
        }
        if (upperCase.equals("1")) {
            this.privateKeyOnly = true;
            this.publicKeyOnly = false;
        } else {
            if (!upperCase.equals("2")) {
                throw new NoSuchAlgorithmException(Recorder$$ExternalSyntheticOutline2.m("can't support mode ", str));
            }
            this.privateKeyOnly = false;
            this.publicKeyOnly = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.cipher = new RSABlindedEngine();
            return;
        }
        if (upperCase.equals("PKCS1PADDING")) {
            this.cipher = new CustomPKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("ISO9796-1PADDING")) {
            this.cipher = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPPADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(Recorder$$ExternalSyntheticOutline2.m$1(str, " unavailable with RSA."));
            }
            initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        if (i2 <= getInputLimit() - this.bOut.size()) {
            this.bOut.write(bArr, i, i2);
            return null;
        }
        JWK$$ExternalSyntheticBUOutline0.m("too much data for RSA block");
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        engineUpdate(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            engineUpdate(bArr, i, i2);
        }
        return getOutput();
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.cipher = asymmetricBlockCipher;
    }

    public CipherSpi(boolean z, boolean z2, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.publicKeyOnly = z;
        this.privateKeyOnly = z2;
        this.cipher = asymmetricBlockCipher;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString(), e);
            }
        } else {
            parameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }
}
