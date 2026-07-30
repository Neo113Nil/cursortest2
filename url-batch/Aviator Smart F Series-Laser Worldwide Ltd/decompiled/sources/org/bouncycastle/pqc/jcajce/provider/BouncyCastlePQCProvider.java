package org.bouncycastle.pqc.jcajce.provider;

import cn.hutool.core.text.l;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public class BouncyCastlePQCProvider extends Provider implements w6.a {
    private static final String ALGORITHM_PACKAGE = "org.bouncycastle.pqc.jcajce.provider.";
    public static final w6.b CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.69";
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] ALGORITHMS = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastlePQCProvider.this.setup();
            return null;
        }
    }

    static class b implements PrivilegedAction {
        final /* synthetic */ String val$className;

        b(String str) {
            this.val$className = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.val$className);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.67d, info);
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
            Class loadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i8] + "$Mappings");
            if (loadClass != null) {
                try {
                    ((x6.a) loadClass.newInstance()).configure(this);
                } catch (Exception e8) {
                    throw new InternalError("cannot create instance of " + str + strArr[i8] + "$Mappings : " + e8);
                }
            }
        }
    }

    static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
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
        synchronized (CONFIGURATION) {
        }
    }

    @Override // w6.a
    public void addAlgorithm(String str, o oVar, String str2) {
        if (!containsKey(str + "." + str2)) {
            throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
        }
        addAlgorithm(str + "." + oVar, str2);
        addAlgorithm(str + ".OID." + oVar, str2);
    }
}
