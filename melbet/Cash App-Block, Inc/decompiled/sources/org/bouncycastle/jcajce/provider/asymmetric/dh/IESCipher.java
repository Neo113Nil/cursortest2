package org.bouncycastle.jcajce.provider.asymmetric.dh;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.parsers.DHIESPublicKeyParser;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class IESCipher extends BaseCipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private IESEngine engine;
    private AlgorithmParameters engineParam;
    private IESParameterSpec engineSpec;
    private final JcaJceHelper helper;
    private final int ivLength;
    private AsymmetricKeyParameter key;
    private AsymmetricKeyParameter otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class IES extends IESCipher {
        public IES() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1()), new PaddedBufferedBlockCipher(CBCBlockCipher.newInstance(AESEngine.newInstance()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1()), new PaddedBufferedBlockCipher(CBCBlockCipher.newInstance(new DESedeEngine()))), 8);
        }
    }

    public IESCipher(IESEngine iESEngine) {
        this.helper = new BCJcaJceHelper();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iESEngine;
        this.ivLength = 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        CipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.engineSpec.getDerivationV(), this.engineSpec.getEncodingV(), this.engineSpec.getMacKeySize(), this.engineSpec.getCipherKeySize());
        byte[] nonce = this.engineSpec.getNonce();
        if (nonce != null) {
            iESWithCipherParameters = new ParametersWithIV(iESWithCipherParameters, nonce);
        }
        DHParameters parameters = ((DHKeyParameters) this.key).getParameters();
        AsymmetricKeyParameter asymmetricKeyParameter = this.otherKeyParameter;
        int i3 = this.state;
        if (asymmetricKeyParameter != null) {
            try {
                if (i3 == 1 || i3 == 3) {
                    this.engine.init(true, asymmetricKeyParameter, this.key, iESWithCipherParameters);
                } else {
                    this.engine.init(false, this.key, asymmetricKeyParameter, iESWithCipherParameters);
                }
                return this.engine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        if (i3 == 1 || i3 == 3) {
            DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
            dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.random, parameters));
            try {
                this.engine.init(this.key, iESWithCipherParameters, new EphemeralKeyPairGenerator(dHKeyPairGenerator, new KeyEncoder() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // org.bouncycastle.crypto.KeyEncoder
                    public byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter2) {
                        int bitLength = (((DHKeyParameters) asymmetricKeyParameter2).getParameters().getP().bitLength() + 7) / 8;
                        byte[] bArr2 = new byte[bitLength];
                        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters) asymmetricKeyParameter2).getY());
                        if (asUnsignedByteArray.length <= bitLength) {
                            System.arraycopy(asUnsignedByteArray, 0, bArr2, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
                            return bArr2;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Senders's public key longer than expected.");
                        return null;
                    }
                }));
                return this.engine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        }
        if (i3 != 2 && i3 != 4) {
            a$$ExternalSyntheticBUOutline0.m$1("IESCipher not initialised");
            return null;
        }
        try {
            IESEngine iESEngine = this.engine;
            AsymmetricKeyParameter asymmetricKeyParameter2 = this.key;
            iESEngine.init(asymmetricKeyParameter2, iESWithCipherParameters, new DHIESPublicKeyParser(((DHKeyParameters) asymmetricKeyParameter2).getParameters()));
            return this.engine.processBlock(byteArray, 0, byteArray.length);
        } catch (InvalidCipherTextException e3) {
            throw new BadBlockException("unable to process block", e3);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        BufferedBlockCipher cipher = this.engine.getCipher();
        if (cipher == null) {
            return 0;
        }
        return cipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        IESParameterSpec iESParameterSpec = this.engineSpec;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        a$$ExternalSyntheticBUOutline0.m$3("not a DH key");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        BufferedBlockCipher cipher;
        if (this.key == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cipher not initialised");
            return 0;
        }
        int macSize = this.engine.getMac().getMacSize();
        int bitLength = this.otherKeyParameter == null ? (((((DHKeyParameters) this.key).getParameters().getP().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (this.engine.getCipher() != null) {
            int i2 = this.state;
            if (i2 == 1 || i2 == 3) {
                cipher = this.engine.getCipher();
            } else {
                if (i2 != 2 && i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("cipher not initialised");
                    return 0;
                }
                cipher = this.engine.getCipher();
                i = (i - macSize) - bitLength;
            }
            i = cipher.getOutputSize(i);
        }
        int i3 = this.state;
        if (i3 == 1 || i3 == 3) {
            return this.buffer.size() + macSize + bitLength + i;
        }
        if (i3 == 2 || i3 == 4) {
            return ((this.buffer.size() - macSize) - bitLength) + i;
        }
        a$$ExternalSyntheticBUOutline0.m$1("IESCipher not initialised");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("IES");
                this.engineParam = createAlgorithmParameters;
                createAlgorithmParameters.init(this.engineSpec);
            } catch (Exception e) {
                Mod$$ExternalSyntheticBUOutline0.m$3(e);
                return null;
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        IESParameterSpec iESParameterSpec;
        AsymmetricKeyParameter generatePublicKeyParameter;
        PrivateKey privateKey;
        if (algorithmParameterSpec == null && this.ivLength == 0) {
            iESParameterSpec = IESUtil.guessParameterSpec(this.engine.getCipher(), null);
        } else {
            if (!(algorithmParameterSpec instanceof IESParameterSpec)) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("must be passed IES parameters");
                return;
            }
            iESParameterSpec = (IESParameterSpec) algorithmParameterSpec;
        }
        this.engineSpec = iESParameterSpec;
        byte[] nonce = this.engineSpec.getNonce();
        int i2 = this.ivLength;
        if (i2 != 0 && (nonce == null || nonce.length != i2)) {
            throw new InvalidAlgorithmParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.ivLength, " bytes long", new StringBuilder("NONCE in IES Parameters needs to be ")));
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof DHPublicKey)) {
                if (!(key instanceof IESKey)) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$2("must be passed recipient's public DH key for encryption");
                    return;
                }
                IESKey iESKey = (IESKey) key;
                this.key = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(iESKey.getPublic());
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
                this.random = secureRandom;
                this.state = i;
                this.buffer.reset();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("must be passed EC key");
                return;
            }
            if (key instanceof DHPrivateKey) {
                privateKey = (PrivateKey) key;
            } else if (!(key instanceof IESKey)) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("must be passed recipient's private DH key for decryption");
                return;
            } else {
                IESKey iESKey2 = (IESKey) key;
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(iESKey2.getPublic());
                privateKey = iESKey2.getPrivate();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(privateKey);
        }
        this.key = generatePublicKeyParameter;
        this.random = secureRandom;
        this.state = i;
        this.buffer.reset();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NONE")) {
            this.dhaesMode = false;
        } else if (upperCase.equals("DHAES")) {
            this.dhaesMode = true;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("can't support mode ", str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals("NOPADDING") && !upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }

    public IESCipher(IESEngine iESEngine, int i) {
        this.helper = new BCJcaJceHelper();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iESEngine;
        this.ivLength = i;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            Path$$ExternalSyntheticBUOutline0.m(e.getMessage(), "cannot handle supplied parameter spec: ");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(IESParameterSpec.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("cannot recognise parameters: ")));
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }
}
