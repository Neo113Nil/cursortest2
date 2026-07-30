package org.bouncycastle.jce.provider;

import c7.e;
import cn.hutool.core.text.l;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.o;
import org.bouncycastle.pqc.jcajce.provider.xmss.c;
import w6.b;

/* loaded from: classes5.dex */
public final class BouncyCastleProvider extends Provider implements w6.a {
    private static final String ASYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.asymmetric.";
    private static final String DIGEST_PACKAGE = "org.bouncycastle.jcajce.provider.digest.";
    private static final String KEYSTORE_PACKAGE = "org.bouncycastle.jcajce.provider.keystore.";
    private static final String SECURE_RANDOM_PACKAGE = "org.bouncycastle.jcajce.provider.drbg.";
    private static final String SYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.symmetric.";
    private static String info = "BouncyCastle Security Provider v1.69";
    public static final b CONFIGURATION = new org.bouncycastle.jce.provider.a();
    private static final Map keyInfoConverters = new HashMap();
    private static final Class revChkClass = org.bouncycastle.jcajce.provider.symmetric.util.a.loadClass(BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
    private static final String[] SYMMETRIC_GENERIC = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    private static final String[] SYMMETRIC_MACS = {"SipHash", "SipHash128", "Poly1305"};
    private static final String[] SYMMETRIC_CIPHERS = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
    private static final String[] ASYMMETRIC_GENERIC = {"X509", "IES", "COMPOSITE"};
    private static final String[] ASYMMETRIC_CIPHERS = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    private static final String[] DIGESTS = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
    public static final String PROVIDER_NAME = "BC";
    private static final String[] KEYSTORES = {PROVIDER_NAME, "BCFKS", "PKCS12"};
    private static final String[] SECURE_RANDOMS = {"DRBG"};

    class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastleProvider.this.setup();
            return null;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.69d, info);
        AccessController.doPrivileged(new a());
    }

    private static x6.b getAsymmetricKeyInfoConverter(o oVar) {
        x6.b bVar;
        Map map = keyInfoConverters;
        synchronized (map) {
            bVar = (x6.b) map.get(oVar);
        }
        return bVar;
    }

    public static PrivateKey getPrivateKey(t6.b bVar) {
        x6.b asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(bVar.getPrivateKeyAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(bVar);
    }

    public static PublicKey getPublicKey(v6.b bVar) {
        x6.b asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(bVar.getAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(bVar);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i8 = 0; i8 != strArr.length; i8++) {
            Class loadClass = org.bouncycastle.jcajce.provider.symmetric.util.a.loadClass(BouncyCastleProvider.class, str + strArr[i8] + "$Mappings");
            if (loadClass != null) {
                try {
                    ((x6.a) loadClass.newInstance()).configure(this);
                } catch (Exception e8) {
                    throw new InternalError("cannot create instance of " + str + strArr[i8] + "$Mappings : " + e8);
                }
            }
        }
    }

    private void loadPQCKeys() {
        addKeyInfoConverter(e.sphincs256, new org.bouncycastle.pqc.jcajce.provider.sphincs.a());
        addKeyInfoConverter(e.newHope, new org.bouncycastle.pqc.jcajce.provider.newhope.a());
        addKeyInfoConverter(e.xmss, new org.bouncycastle.pqc.jcajce.provider.xmss.b());
        addKeyInfoConverter(r6.a.id_alg_xmss, new org.bouncycastle.pqc.jcajce.provider.xmss.b());
        addKeyInfoConverter(e.xmss_mt, new c());
        addKeyInfoConverter(r6.a.id_alg_xmssmt, new c());
        addKeyInfoConverter(e.mcEliece, new org.bouncycastle.pqc.jcajce.provider.mceliece.b());
        addKeyInfoConverter(e.mcElieceCca2, new org.bouncycastle.pqc.jcajce.provider.mceliece.a());
        addKeyInfoConverter(e.rainbow, new g7.a());
        addKeyInfoConverter(e.qTESLA_p_I, new org.bouncycastle.pqc.jcajce.provider.qtesla.a());
        addKeyInfoConverter(e.qTESLA_p_III, new org.bouncycastle.pqc.jcajce.provider.qtesla.a());
        addKeyInfoConverter(t6.a.id_alg_hss_lms_hashsig, new org.bouncycastle.pqc.jcajce.provider.lms.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        String str;
        String str2;
        loadAlgorithms(DIGEST_PACKAGE, DIGESTS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_GENERIC);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_MACS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_CIPHERS);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_GENERIC);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_CIPHERS);
        loadAlgorithms(KEYSTORE_PACKAGE, KEYSTORES);
        loadAlgorithms(SECURE_RANDOM_PACKAGE, SECURE_RANDOMS);
        loadPQCKeys();
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
        Class cls = revChkClass;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // w6.a
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // w6.a
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + l.SPACE + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    @Override // w6.a
    public void addKeyInfoConverter(o oVar, x6.b bVar) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(oVar, bVar);
        }
    }

    @Override // w6.a
    public x6.b getKeyInfoConverter(o oVar) {
        return (x6.b) keyInfoConverters.get(oVar);
    }

    @Override // w6.a
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // w6.a
    public void setParameter(String str, Object obj) {
        b bVar = CONFIGURATION;
        synchronized (bVar) {
            ((org.bouncycastle.jce.provider.a) bVar).setParameter(str, obj);
        }
    }

    @Override // w6.a
    public void addAlgorithm(String str, o oVar, String str2) {
        addAlgorithm(str + "." + oVar, str2);
        addAlgorithm(str + ".OID." + oVar, str2);
    }
}
