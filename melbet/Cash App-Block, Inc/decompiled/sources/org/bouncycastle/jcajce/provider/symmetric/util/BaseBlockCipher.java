package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.fpe.FPEEngine;
import org.bouncycastle.crypto.fpe.FPEFF1Engine;
import org.bouncycastle.crypto.fpe.FPEFF3_1Engine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.FPEParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class[] availableSpecs = {RC2ParameterSpec.class, RC5ParameterSpec.class, GcmSpecUtil.gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
    private AEADParameters aeadParams;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADCipher cipher;

        static {
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = loadClass != null ? findExceptionConstructor(loadClass) : null;
        }

        public AEADGenericBlockCipher(AEADCipher aEADCipher) {
            this.cipher = aEADCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            AEADCipher aEADCipher = this.cipher;
            return aEADCipher instanceof AEADBlockCipher ? ((AEADBlockCipher) aEADCipher).getUnderlyingCipher().getAlgorithmName() : aEADCipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            AEADCipher aEADCipher = this.cipher;
            if (aEADCipher instanceof AEADBlockCipher) {
                return ((AEADBlockCipher) aEADCipher).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private FPEEngine cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        public BufferedFPEBlockCipher(FPEEngine fPEEngine) {
            this.cipher = fPEEngine;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.processBlock(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.eOut.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) {
            this.eOut.write(b);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            this.eOut.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i);

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters);

        int processByte(byte b, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.ivLength = aEADBlockCipher.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        ParametersWithIV parametersWithIV;
        if (cipherParameters instanceof ParametersWithIV) {
            CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                parametersWithIV = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec.getSBox());
                if (gOST28147ParameterSpec.getIV() == null || this.ivLength == 0) {
                    return parametersWithSBox;
                }
                parametersWithIV = new ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
            }
            this.ivParam = parametersWithIV;
            return parametersWithIV;
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            ParametersWithIV parametersWithIV2 = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = parametersWithIV2;
            return parametersWithIV2;
        }
        if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
            GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
            ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec2.getSBox());
            return (gOST28147ParameterSpec2.getIV() == null || this.ivLength == 0) ? parametersWithSBox2 : new ParametersWithIV(parametersWithSBox2, gOST28147ParameterSpec2.getIV());
        }
        return cipherParameters;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int processBytes;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                bArr3 = bArr2;
                i4 = i3;
                processBytes = this.cipher.processBytes(bArr, i, i2, bArr3, i4);
            } catch (OutputLengthException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            } catch (DataLengthException e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            bArr3 = bArr2;
            i4 = i3;
            processBytes = 0;
        }
        return processBytes + this.cipher.doFinal(bArr3, i4 + processBytes);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        BlockCipher blockCipher = this.baseEngine;
        if (blockCipher == null) {
            return -1;
        }
        return blockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters createParametersInstance2 = createParametersInstance(PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
                        this.engineParams = createParametersInstance2;
                        createParametersInstance2.init(new DEROctetString(this.aeadParams.getNonce()).getEncoded());
                    } catch (Exception e) {
                        Mod$$ExternalSyntheticBUOutline0.m$3(e);
                        return null;
                    }
                } else {
                    try {
                        AlgorithmParameters createParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = createParametersInstance3;
                        createParametersInstance3.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                    } catch (Exception e2) {
                        Mod$$ExternalSyntheticBUOutline0.m$3(e2);
                        return null;
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance4;
                    createParametersInstance4.init(new IvParameterSpec(this.ivParam.getIV()));
                } catch (Exception e3) {
                    Mod$$ExternalSyntheticBUOutline0.m$3(e3);
                    return null;
                }
            }
        }
        return this.engineParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x00f3, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x013f, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01f3, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r8 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r21.ivParam = (org.bouncycastle.crypto.params.ParametersWithIV) r6;
        r6 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0474 A[Catch: Exception -> 0x049b, IllegalArgumentException -> 0x04a6, TryCatch #3 {IllegalArgumentException -> 0x04a6, Exception -> 0x049b, blocks: (B:72:0x044b, B:73:0x0461, B:74:0x0462, B:75:0x046e, B:77:0x0474, B:79:0x0478, B:83:0x0469), top: B:67:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        CipherParameters cipherParameters;
        CipherParameters fPEParameters;
        ParametersWithIV parametersWithIV;
        CipherParameters cipherParameters2;
        GenericBlockCipher genericBlockCipher;
        AEADParameters aEADParameters;
        CipherParameters cipherParameters3;
        CipherParameters cipherParameters4;
        BlockCipher blockCipher;
        CipherParameters cipherParameters5 = null;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Key for algorithm "), key != null ? key.getAlgorithm() : null, " not suitable for symmetric enryption."));
        }
        if (algorithmParameterSpec == null && (blockCipher = this.baseEngine) != null && blockCipher.getAlgorithmName().startsWith("RC5-64")) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("RC5 requires an RC5ParametersSpec to be passed in.");
            return;
        }
        int i2 = this.scheme;
        if (i2 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z = secretKey instanceof PBEKey;
                if (z && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        AesGcmSiv$$ExternalSyntheticLambda0.m$1("PBEKey requires parameters to specify salt");
                        return;
                    }
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$2("Algorithm requires a PBE key");
                    return;
                }
                if (key instanceof BCPBEKey) {
                    CipherParameters param = ((BCPBEKey) key).getParam();
                    if (!(param instanceof ParametersWithIV)) {
                        if (param != null) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Algorithm requires a PBE key suitable for PKCS12");
                            return;
                        }
                        param = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                    cipherParameters = param;
                } else {
                    cipherParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                boolean z2 = cipherParameters instanceof ParametersWithIV;
                cipherParameters3 = cipherParameters;
                cipherParameters5 = cipherParameters;
            } catch (Exception unused) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            CipherParameters makePBEParameters = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z3 = makePBEParameters instanceof ParametersWithIV;
            cipherParameters3 = makePBEParameters;
            cipherParameters5 = makePBEParameters;
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                cipherParameters4 = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("PBE requires PBE parameters to be set.");
                return;
            } else {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                cipherParameters4 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z4 = cipherParameters4 instanceof ParametersWithIV;
            cipherParameters3 = cipherParameters4;
            cipherParameters5 = cipherParameters4;
        } else {
            if (key instanceof PBEKey) {
                PBEKey pBEKey2 = (PBEKey) key;
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.pbeSpec = pBEParameterSpec;
                if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                    this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
                }
                CipherParameters makePBEParameters2 = PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                boolean z5 = makePBEParameters2 instanceof ParametersWithIV;
                cipherParameters3 = makePBEParameters2;
                cipherParameters5 = makePBEParameters2;
            } else if (!(key instanceof RepeatedSecretKeySpec)) {
                if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 5) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$2("Algorithm requires a PBE key");
                    return;
                }
                cipherParameters5 = new KeyParameter(key.getEncoded());
            }
            try {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    if (algorithmParameterSpec instanceof IvParameterSpec) {
                        if (this.ivLength != 0) {
                            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                            if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                                throw new InvalidAlgorithmParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.ivLength, " bytes long.", new StringBuilder("IV must be ")));
                            }
                            ParametersWithIV parametersWithIV2 = cipherParameters5 instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) cipherParameters5).getParameters(), ivParameterSpec.getIV()) : new ParametersWithIV(cipherParameters5, ivParameterSpec.getIV());
                            this.ivParam = parametersWithIV2;
                            fPEParameters = parametersWithIV2;
                        } else {
                            String str = this.modeName;
                            fPEParameters = cipherParameters5;
                            if (str != null) {
                                fPEParameters = cipherParameters5;
                                if (str.equals("ECB")) {
                                    AesGcmSiv$$ExternalSyntheticLambda0.m$1("ECB mode does not use an IV");
                                    return;
                                }
                            }
                        }
                    } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                        GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                        ParametersWithSBox parametersWithSBox = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec.getSBox());
                        fPEParameters = parametersWithSBox;
                        if (gOST28147ParameterSpec.getIV() != null) {
                            fPEParameters = parametersWithSBox;
                            if (this.ivLength != 0) {
                                parametersWithIV = new ParametersWithIV(parametersWithSBox, gOST28147ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                        RC2Parameters rC2Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        fPEParameters = rC2Parameters;
                        if (rC2ParameterSpec.getIV() != null) {
                            fPEParameters = rC2Parameters;
                            if (this.ivLength != 0) {
                                parametersWithIV = new ParametersWithIV(rC2Parameters, rC2ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                        RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                        RC5Parameters rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (!this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m$1("RC5 parameters passed to a cipher that is not RC5.");
                            return;
                        }
                        if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                            if (rC5ParameterSpec.getWordSize() != 32) {
                                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + ".");
                            }
                        } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
                        }
                        fPEParameters = rC5Parameters;
                        if (rC5ParameterSpec.getIV() != null) {
                            fPEParameters = rC5Parameters;
                            if (this.ivLength != 0) {
                                parametersWithIV = new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                                this.ivParam = parametersWithIV;
                                fPEParameters = parametersWithIV;
                            }
                        }
                    } else if (algorithmParameterSpec instanceof FPEParameterSpec) {
                        FPEParameterSpec fPEParameterSpec = (FPEParameterSpec) algorithmParameterSpec;
                        fPEParameters = new FPEParameters((KeyParameter) cipherParameters5, fPEParameterSpec.getRadixConverter(), fPEParameterSpec.getTweak(), fPEParameterSpec.isUsingInverseFunction());
                    } else {
                        fPEParameters = cipherParameters5;
                        if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m$1("GCMParameterSpec can only be used with AEAD modes.");
                                return;
                            }
                            aEADParameters = GcmSpecUtil.extractAeadParameters(cipherParameters5 instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParameters5).getParameters() : (KeyParameter) cipherParameters5, algorithmParameterSpec);
                        } else if (algorithmParameterSpec != null) {
                            fPEParameters = cipherParameters5;
                            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m$1("unknown parameter type.");
                                return;
                            }
                        }
                    }
                    cipherParameters2 = fPEParameters;
                    if (this.ivLength != 0) {
                        boolean z6 = fPEParameters instanceof ParametersWithIV;
                        cipherParameters2 = fPEParameters;
                        if (!z6) {
                            boolean z7 = fPEParameters instanceof AEADParameters;
                            cipherParameters2 = fPEParameters;
                            if (!z7) {
                                SecureRandom secureRandom2 = secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom;
                                if (i == 1 || i == 3) {
                                    byte[] bArr = new byte[this.ivLength];
                                    secureRandom2.nextBytes(bArr);
                                    ParametersWithIV parametersWithIV3 = new ParametersWithIV(fPEParameters, bArr);
                                    this.ivParam = parametersWithIV3;
                                    cipherParameters2 = parametersWithIV3;
                                } else {
                                    cipherParameters2 = fPEParameters;
                                    if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                                        AesGcmSiv$$ExternalSyntheticLambda0.m$1("no IV set when one expected");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (secureRandom != null && this.padded) {
                        cipherParameters2 = new ParametersWithRandom(cipherParameters2, secureRandom);
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new InvalidParameterException("unknown opmode " + i + " passed");
                                }
                            }
                        }
                        this.cipher.init(false, cipherParameters2);
                        genericBlockCipher = this.cipher;
                        if ((genericBlockCipher instanceof AEADGenericBlockCipher) && this.aeadParams == null) {
                            this.aeadParams = new AEADParameters((KeyParameter) this.ivParam.getParameters(), ((AEADGenericBlockCipher) genericBlockCipher).cipher.getMac().length * 8, this.ivParam.getIV());
                            return;
                        }
                        return;
                    }
                    this.cipher.init(true, cipherParameters2);
                    genericBlockCipher = this.cipher;
                    if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$1("AEADParameterSpec can only be used with AEAD modes.");
                    return;
                } else {
                    AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                    aEADParameters = new AEADParameters(cipherParameters5 instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParameters5).getParameters() : (KeyParameter) cipherParameters5, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
                }
                if (i != 1) {
                }
                this.cipher.init(true, cipherParameters2);
                genericBlockCipher = this.cipher;
                if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                }
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException(e.getMessage(), e);
            } catch (Exception e2) {
                throw new BaseWrapCipher.InvalidKeyOrParametersException(e2.getMessage(), e2);
            }
            this.aeadParams = aEADParameters;
            fPEParameters = aEADParameters;
            cipherParameters2 = fPEParameters;
            if (this.ivLength != 0) {
            }
            if (secureRandom != null) {
                cipherParameters2 = new ParametersWithRandom(cipherParameters2, secureRandom);
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(CBCBlockCipher.newInstance(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(CFBBlockCipher.newInstance(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher2 = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(CFBBlockCipher.newInstance(blockCipher2, blockCipher2.getBlockSize() * 8));
                return;
            }
        }
        boolean startsWith = this.modeName.startsWith("PGPCFB");
        String str2 = this.modeName;
        if (startsWith) {
            boolean equals = str2.equals("PGPCFBWITHIV");
            if (equals || this.modeName.length() == 6) {
                this.ivLength = this.baseEngine.getBlockSize();
                this.cipher = new BufferedGenericBlockCipher(new PGPCFBBlockCipher(this.baseEngine, equals));
                return;
            } else {
                throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
            }
        }
        if (str2.equals("OPENPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(new OpenPGPCFBBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF3-1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF3_1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize < 16) {
                a$$ExternalSyntheticBUOutline0.m$3("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                return;
            } else {
                this.fixedIv = false;
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(SICBlockCipher.newInstance(this.baseEngine)));
                return;
            }
        }
        if (this.modeName.equals("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            BlockCipher blockCipher3 = this.baseEngine;
            if (blockCipher3 instanceof DSTU7624Engine) {
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new KCTRBlockCipher(blockCipher3)));
                return;
            } else {
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(SICBlockCipher.newInstance(blockCipher3)));
                return;
            }
        }
        if (this.modeName.equals("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(CBCBlockCipher.newInstance(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CCM")) {
            this.ivLength = 12;
            if (this.baseEngine instanceof DSTU7624Engine) {
                this.cipher = new AEADGenericBlockCipher(new KCCMBlockCipher(this.baseEngine));
                return;
            } else {
                this.cipher = new AEADGenericBlockCipher(CCMBlockCipher.newInstance(this.baseEngine));
                return;
            }
        }
        if (this.modeName.equals("OCB")) {
            if (this.engineProvider == null) {
                throw new NoSuchAlgorithmException(Recorder$$ExternalSyntheticOutline2.m("can't support mode ", str));
            }
            this.ivLength = 15;
            this.cipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
            return;
        }
        if (this.modeName.equals("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("GCM-SIV")) {
            this.ivLength = 12;
            this.cipher = new AEADGenericBlockCipher(new GCMSIVBlockCipher(this.baseEngine));
        } else {
            if (!this.modeName.equals("GCM")) {
                throw new NoSuchAlgorithmException(Recorder$$ExternalSyntheticOutline2.m("can't support mode ", str));
            }
            BlockCipher blockCipher4 = this.baseEngine;
            if (blockCipher4 instanceof DSTU7624Engine) {
                this.ivLength = blockCipher4.getBlockSize();
                this.cipher = new AEADGenericBlockCipher(new KGCMBlockCipher(this.baseEngine));
            } else {
                this.ivLength = 12;
                this.cipher = new AEADGenericBlockCipher(GCMBlockCipher.newInstance(this.baseEngine));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        if (this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                this.cipher = new BufferedGenericBlockCipher(new DefaultBufferedBlockCipher(this.cipher.getUnderlyingCipher()));
                return;
            }
            return;
        }
        if (upperCase.equals("WITHCTS") || upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
            return;
        }
        this.padded = true;
        if (isAEADModeName(this.modeName)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals("ZEROBYTEPADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
            return;
        }
        if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
            return;
        }
        if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
            return;
        }
        if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
        } else {
            if (!upperCase.equals("TBCPADDING")) {
                throw new NoSuchPaddingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Padding ", str, " unknown."));
            }
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        if (processBytes == 0) {
            return null;
        }
        if (processBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[processBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), remaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int min = Math.min(512, remaining);
            byteBuffer.get(bArr2, 0, min);
            engineUpdateAAD(bArr2, 0, min);
            remaining -= min;
        } while (remaining > 0);
        Arrays.fill(bArr2, (byte) 0);
    }

    public static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        public BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }

        public BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this(blockCipher, new PKCS7Padding());
        }

        public BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.cipher.getUpdateOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        } catch (DataLengthException e) {
            Path$$ExternalSyntheticBUOutline0.m((Object) e);
            return 0;
        }
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i) {
        this(blockCipher, true, i);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(BlockCipher blockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
        this(bufferedBlockCipher, true, i);
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(BlockCipher blockCipher) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADCipher aEADCipher, boolean z, int i) {
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADCipher);
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal > engineGetOutputSize) {
                throw new IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, availableSpecs);
            if (algorithmParameterSpec == null) {
                Mod$$ExternalSyntheticBUOutline0.m(algorithmParameters);
                return;
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }
}
