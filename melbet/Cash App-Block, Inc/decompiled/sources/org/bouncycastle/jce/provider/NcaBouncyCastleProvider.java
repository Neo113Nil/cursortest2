package org.bouncycastle.jce.provider;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.netcetera.threeds.sdk.infrastructure.getSDKInfo;
import com.netcetera.threeds.sdk.infrastructure.removeParam;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.internal.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.mlkem.MLKEMKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public final class NcaBouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] ConfigParameters;
    private static final Logger ThreeDS2Service;
    private static final String[] ThreeDS2ServiceInitializationCallback;
    private static String ThreeDS2ServiceInstance = null;
    private static final String[] addParam;
    private static int apiKey = 0;
    private static final String[] cleanup;
    private static int configureScheme = 1;
    private static final String[] createTransaction;
    private static final Class get;
    private static int getParamValue;
    private static final CryptoServiceProperties[] getSDKInfo;
    private static final String[] getSDKVersion;
    public static final ProviderConfiguration getWarnings;
    private static final Map initialize;
    private static final String[] onCompleted;
    private Map<String, Provider.Service> onError;

    public static class initialize implements CryptoServiceProperties {
        private final String ThreeDS2Service;
        private final int getWarnings;

        public initialize(String str, int i) {
            this.ThreeDS2Service = str;
            this.getWarnings = i;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public int bitsOfSecurity() {
            return this.getWarnings;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public Object getParams() {
            return null;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public CryptoServicePurpose getPurpose() {
            return CryptoServicePurpose.ANY;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public String getServiceName() {
            return this.ThreeDS2Service;
        }
    }

    static {
        ThreeDS2Service();
        ThreeDS2Service = Logger.getLogger(NcaBouncyCastleProvider.class.getName());
        ThreeDS2ServiceInstance = "NCA BouncyCastle Security Provider v1.79";
        getWarnings = new BouncyCastleProviderConfiguration();
        initialize = new HashMap();
        get = ClassUtil.loadClass(BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
        cleanup = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        getSDKVersion = new String[]{"SipHash", "SipHash128", "Poly1305"};
        Object[] objArr = new Object[1];
        a(true, 2 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 3, "\u000b�\ufff9", (KeyEvent.getMaxKeyCode() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, objArr);
        getSDKInfo = new CryptoServiceProperties[]{ThreeDS2ServiceInstance(((String) objArr[0]).intern(), 256), ThreeDS2ServiceInstance("ARC4", 20), ThreeDS2ServiceInstance("ARIA", 256), ThreeDS2ServiceInstance("Blowfish", 128), ThreeDS2ServiceInstance("Camellia", 256), ThreeDS2ServiceInstance("CAST5", 128), ThreeDS2ServiceInstance("CAST6", 256), ThreeDS2ServiceInstance("ChaCha", 128), ThreeDS2ServiceInstance("DES", 56), ThreeDS2ServiceInstance("DESede", 112), ThreeDS2ServiceInstance("GOST28147", 128), ThreeDS2ServiceInstance("Grainv1", 128), ThreeDS2ServiceInstance("Grain128", 128), ThreeDS2ServiceInstance("HC128", 128), ThreeDS2ServiceInstance("HC256", 256), ThreeDS2ServiceInstance("IDEA", 128), ThreeDS2ServiceInstance("Noekeon", 128), ThreeDS2ServiceInstance("RC2", 128), ThreeDS2ServiceInstance("RC5", 128), ThreeDS2ServiceInstance("RC6", 256), ThreeDS2ServiceInstance("Rijndael", 256), ThreeDS2ServiceInstance("Salsa20", 128), ThreeDS2ServiceInstance("SEED", 128), ThreeDS2ServiceInstance("Serpent", 256), ThreeDS2ServiceInstance("Shacal2", 128), ThreeDS2ServiceInstance("Skipjack", 80), ThreeDS2ServiceInstance("SM4", 128), ThreeDS2ServiceInstance("TEA", 128), ThreeDS2ServiceInstance("Twofish", 256), ThreeDS2ServiceInstance("Threefish", 128), ThreeDS2ServiceInstance("VMPC", 128), ThreeDS2ServiceInstance("VMPCKSA3", 128), ThreeDS2ServiceInstance("XTEA", 128), ThreeDS2ServiceInstance("XSalsa20", 128), ThreeDS2ServiceInstance("OpenSSLPBKDF", 128), ThreeDS2ServiceInstance("DSTU7624", 256), ThreeDS2ServiceInstance("GOST3412_2015", 256), ThreeDS2ServiceInstance("Zuc", 128)};
        ThreeDS2ServiceInitializationCallback = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        createTransaction = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM"};
        onCompleted = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        addParam = new String[]{BouncyCastleProvider.PROVIDER_NAME, "BCFKS", "PKCS12"};
        ConfigParameters = new String[]{"DRBG"};
        int i = configureScheme + 1;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public NcaBouncyCastleProvider() {
        super("NCABC", 1.79d, ThreeDS2ServiceInstance);
        this.onError = new ConcurrentHashMap();
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.3
            private static int get = 1;
            private static int getWarnings;

            public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
                return ThreeDS2ServiceInstance(objArr);
            }

            private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
                ((Number) objArr[0]).longValue();
                ((Number) objArr[1]).longValue();
                int i = get;
                getWarnings = (((i | 73) << 1) - (i ^ 73)) % 128;
                try {
                    Object[] objArr2 = {((Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 77, (char) (10196 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 7934 - TextUtils.lastIndexOf("", '0', 0))).getField("getWarnings").get(null), Boolean.TRUE};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1643948346);
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 78, (char) (59653 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7711)).getMethod("get", (Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 78, (char) (10196 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 7935 - TextUtils.getCapsMode("", 0, 0)), Boolean.TYPE);
                        map.put(-1643948346, obj);
                    }
                    ((Method) obj).invoke(null, objArr2);
                    int i2 = getWarnings + 37;
                    get = i2 % 128;
                    if (i2 % 2 != 0) {
                        return null;
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }

            public static void get(long j, long j2) {
                ThreeDS2Service(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, -188269274, 188269274, (int) System.currentTimeMillis());
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                NcaBouncyCastleProvider.getWarnings(NcaBouncyCastleProvider.this);
                return null;
            }
        });
    }

    private void ThreeDS2Service(String str, CryptoServiceProperties[] cryptoServicePropertiesArr) {
        configureScheme = (apiKey + 45) % 128;
        for (int i = 0; i != cryptoServicePropertiesArr.length; i++) {
            apiKey = (configureScheme + 107) % 128;
            CryptoServiceProperties cryptoServiceProperties = cryptoServicePropertiesArr[i];
            try {
                CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties);
                ThreeDS2Service(new Object[]{this, str, cryptoServiceProperties.getServiceName()}, 464930167, -464930166, System.identityHashCode(this));
            } catch (CryptoServiceConstraintsException unused) {
                Logger logger = ThreeDS2Service;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("service for " + cryptoServiceProperties.getServiceName() + " ignored due to constraints");
                }
            }
        }
    }

    private static CryptoServiceProperties ThreeDS2ServiceInstance(String str, int i) {
        initialize initializeVar = new initialize(str, i);
        apiKey = (configureScheme + 35) % 128;
        return initializeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        int i4;
        Throwable cause;
        int i5;
        Object method;
        $11 = ($10 + 5) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getParamValue);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                    method = obj;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(67 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45769), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4878);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr[i7] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') + 12374)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = i5;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        int i8 = i6;
        if (i > 0) {
            $11 = ($10 + 87) % 128;
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            i4 = i8;
            System.arraycopy(cArr, i4, cArr2, i4, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, i4, cArr, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr2, i10, cArr, i4, i2 - i10);
        } else {
            i4 = i8;
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                cArr3[i11] = cArr[(i2 - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - TextUtils.getCapsMode("", 0, 0), (char) Drawable.resolveOpacity(0, 0), 12373 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private void get() {
        apiKey = (configureScheme + 101) % 128;
        ThreeDS2Service("org.bouncycastle.jcajce.provider.digest.", onCompleted);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.symmetric.", cleanup);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.symmetric.", getSDKVersion);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.symmetric.", getSDKInfo);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.asymmetric.", ThreeDS2ServiceInitializationCallback);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.asymmetric.", createTransaction);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.keystore.", addParam);
        ThreeDS2Service("org.bouncycastle.jcajce.provider.drbg.", ConfigParameters);
        getWarnings();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (get != null) {
            configureScheme = (apiKey + 15) % 128;
            put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            apiKey = (configureScheme + 75) % 128;
        } else {
            put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) {
        apiKey = (configureScheme + 91) % 128;
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) ThreeDS2Service(new Object[]{privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()}, -838192268, 838192268, (int) System.currentTimeMillis());
        if (asymmetricKeyInfoConverter != null) {
            return asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
        }
        configureScheme = (apiKey + 93) % 128;
        return null;
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        configureScheme = (apiKey + 47) % 128;
        if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(BCObjectIdentifiers.picnic_key)) {
            return new PicnicKeyFactorySpi().generatePublic(subjectPublicKeyInfo);
        }
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) ThreeDS2Service(new Object[]{subjectPublicKeyInfo.getAlgorithm().getAlgorithm()}, -838192268, 838192268, (int) System.currentTimeMillis());
        if (asymmetricKeyInfoConverter != null) {
            return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
        }
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
        return null;
    }

    private void getWarnings() {
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_128s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_128f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_128s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_128f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_128s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_128f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_192s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_192f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_192s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_192f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_192s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_192f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_256s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_256f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_256s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_256f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_256s_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_256f_r3);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_128s);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_sha2_192s);
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s, new SPHINCSPlusKeyFactorySpi());
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, new ASN1ObjectIdentifier("1.3.9999.6.4.10"));
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_128f);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_192f);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(this, BCObjectIdentifiers.sphincsPlus_shake_256f);
        addKeyInfoConverter(PQCObjectIdentifiers.sphincs256, new Sphincs256KeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.newHope, new NHKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.picnic_key, new PicnicKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_512, new FalconKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_1024, new FalconKeyFactorySpi());
        addKeyInfoConverter(NISTObjectIdentifiers.id_alg_ml_kem_512, new MLKEMKeyFactorySpi());
        addKeyInfoConverter(NISTObjectIdentifiers.id_alg_ml_kem_768, new MLKEMKeyFactorySpi());
        addKeyInfoConverter(NISTObjectIdentifiers.id_alg_ml_kem_1024, new MLKEMKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium2, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium3, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium5, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium2_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium3_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium5_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece348864_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece460896_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece6688128_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece6960119_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece8192128_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike128, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike192, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike256, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc128, new HQCKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc192, new HQCKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc256, new HQCKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber512_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber768_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber1024_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048509, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048677, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps4096821, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhrss701, new NTRUKeyFactorySpi());
        int i = configureScheme + 13;
        apiKey = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object initialize(NcaBouncyCastleProvider ncaBouncyCastleProvider, Object obj) {
        int i = apiKey + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            ncaBouncyCastleProvider.remove(obj);
            throw null;
        }
        Object remove = ncaBouncyCastleProvider.remove(obj);
        configureScheme = (apiKey + 23) % 128;
        return remove;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2, Map<String, String> map) {
        addAlgorithm(str, aSN1ObjectIdentifier, str2);
        addAttributes(str + "." + aSN1ObjectIdentifier, map);
        addAttributes(str + ".OID." + aSN1ObjectIdentifier, map);
        configureScheme = (apiKey + 125) % 128;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        put(str + " ImplementedIn", "Software");
        for (String str2 : map.keySet()) {
            String m = Recorder$$ExternalSyntheticOutline2.m(str, " ", str2);
            if (containsKey(m)) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("duplicate provider attribute key (", m, ") found"));
                return;
            }
            put(m, map.get(str2));
        }
        configureScheme = (apiKey + 23) % 128;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = initialize;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = configureScheme + 51;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return (AsymmetricKeyInfoConverter) initialize.get(aSN1ObjectIdentifier);
        }
        throw null;
    }

    @Override // java.security.Provider
    public final Provider.Service getService(final String str, final String str2) {
        Provider.Service service;
        final String m = Recorder$$ExternalSyntheticOutline2.m(str, ".", Strings.toUpperCase(str2));
        Provider.Service service2 = this.onError.get(m);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            try {
                service = !this.onError.containsKey(m) ? (Provider.Service) AccessController.doPrivileged(new PrivilegedAction<Provider.Service>() { // from class: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.5
                    @Override // java.security.PrivilegedAction
                    /* renamed from: getWarnings, reason: merged with bridge method [inline-methods] */
                    public Provider.Service run() {
                        Provider.Service ThreeDS2Service2 = NcaBouncyCastleProvider.ThreeDS2Service(NcaBouncyCastleProvider.this, str, str2);
                        if (ThreeDS2Service2 == null || ThreeDS2Service2.getClassName() == null) {
                            return null;
                        }
                        NcaBouncyCastleProvider.get(NcaBouncyCastleProvider.this).put(m, ThreeDS2Service2);
                        NcaBouncyCastleProvider.initialize(NcaBouncyCastleProvider.this, ThreeDS2Service2.getType() + "." + ThreeDS2Service2.getAlgorithm());
                        NcaBouncyCastleProvider.get(NcaBouncyCastleProvider.this, ThreeDS2Service2);
                        return ThreeDS2Service2;
                    }
                }) : this.onError.get(m);
            } catch (Throwable th) {
                throw th;
            }
        }
        return service;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044 A[RETURN] */
    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasAlgorithm(String str, String str2) {
        boolean z;
        int i;
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                z = false;
                i = configureScheme + 59;
                apiKey = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        z = true;
        i = configureScheme + 59;
        apiKey = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = getWarnings;
        synchronized (providerConfiguration) {
            ((BouncyCastleProviderConfiguration) providerConfiguration).setParameter(str, obj);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2, Map<String, String> map) {
        int i = apiKey + 93;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            addAlgorithm(str, str2);
            addAttributes(str, map);
            int i2 = 17 / 0;
        } else {
            addAlgorithm(str, str2);
            addAttributes(str, map);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        addAlgorithm(str + "." + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + ".OID." + aSN1ObjectIdentifier, str2);
        configureScheme = (apiKey + 45) % 128;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        int i = configureScheme + 63;
        apiKey = i % 128;
        if (i % 2 == 0) {
            if (!containsKey(str)) {
                put(str, str2);
                int i2 = apiKey + 35;
                configureScheme = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("duplicate provider key (", str, ") found"));
            return;
        }
        containsKey(str);
        throw null;
    }

    public static /* synthetic */ Provider.Service ThreeDS2Service(NcaBouncyCastleProvider ncaBouncyCastleProvider, String str, String str2) {
        apiKey = (configureScheme + 99) % 128;
        Provider.Service service = super.getService(str, str2);
        configureScheme = (apiKey + 57) % 128;
        return service;
    }

    private void ThreeDS2Service(String str, String[] strArr) {
        apiKey = (configureScheme + 79) % 128;
        int i = 0;
        while (i != strArr.length) {
            ThreeDS2Service(new Object[]{this, str, strArr[i]}, 464930167, -464930166, System.identityHashCode(this));
            i++;
            configureScheme = (apiKey + 11) % 128;
        }
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-344)) + (i * (-344));
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        return ((~(i7 | i3)) * 345) + ((((~(i | i6)) | (~(i5 | (~i3)))) * 345) + ((((~i7) | (~(i5 | i3))) * 345) + i4)) != 1 ? get(objArr) : getWarnings(objArr);
    }

    public static void ThreeDS2Service() {
        getParamValue = 1141902485;
    }

    public static /* synthetic */ void get(NcaBouncyCastleProvider ncaBouncyCastleProvider, Provider.Service service) {
        int i = apiKey + 45;
        configureScheme = i % 128;
        int i2 = i % 2;
        ncaBouncyCastleProvider.putService(service);
        if (i2 == 0) {
            throw null;
        }
        configureScheme = (apiKey + 3) % 128;
    }

    public static /* synthetic */ Map get(NcaBouncyCastleProvider ncaBouncyCastleProvider) {
        int i = apiKey;
        configureScheme = (i + 39) % 128;
        Map<String, Provider.Service> map = ncaBouncyCastleProvider.onError;
        configureScheme = (i + 111) % 128;
        return map;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) objArr[0];
        Map map = initialize;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    private static AsymmetricKeyInfoConverter get(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (AsymmetricKeyInfoConverter) ThreeDS2Service(new Object[]{aSN1ObjectIdentifier}, -838192268, 838192268, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        NcaBouncyCastleProvider ncaBouncyCastleProvider = (NcaBouncyCastleProvider) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Class loadClass = ClassUtil.loadClass(BouncyCastleProvider.class, str + str2 + "$Mappings");
        if (loadClass == null) {
            return null;
        }
        int i = configureScheme + 45;
        apiKey = i % 128;
        try {
            if (i % 2 != 0) {
                ((AlgorithmProvider) loadClass.newInstance()).configure(ncaBouncyCastleProvider);
                int i2 = 69 / 0;
            } else {
                ((AlgorithmProvider) loadClass.newInstance()).configure(ncaBouncyCastleProvider);
            }
            return null;
        } catch (Exception e) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e);
        }
    }

    public static /* synthetic */ void getWarnings(NcaBouncyCastleProvider ncaBouncyCastleProvider) {
        configureScheme = (apiKey + 43) % 128;
        ncaBouncyCastleProvider.get();
        apiKey = (configureScheme + 89) % 128;
    }

    private void getWarnings(String str, String str2) {
        ThreeDS2Service(new Object[]{this, str, str2}, 464930167, -464930166, System.identityHashCode(this));
    }
}
