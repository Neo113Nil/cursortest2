package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ee3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f4579a = Logger.getLogger(ee3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, ce3> f4580b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, be3> f4581c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f4582d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, xc3<?>> f4583e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, vd3<?, ?>> f4584f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap<String, gd3> f4585g = new ConcurrentHashMap();

    private ee3() {
    }

    @Deprecated
    public static xc3<?> a(String str) {
        String valueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap<String, xc3<?>> concurrentMap = f4583e;
        Locale locale = Locale.US;
        xc3<?> xc3Var = concurrentMap.get(str.toLowerCase(locale));
        if (xc3Var != null) {
            return xc3Var;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call MacConfig.register().";
        } else {
            if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            valueOf = String.valueOf(format);
            str2 = "Maybe call SignatureConfig.register().";
        }
        format = valueOf.concat(str2);
        throw new GeneralSecurityException(format);
    }

    public static dd3<?> b(String str) {
        return p(str).a();
    }

    public static synchronized qk3 c(tk3 tk3Var) {
        qk3 e7;
        synchronized (ee3.class) {
            dd3<?> b7 = b(tk3Var.J());
            if (!f4582d.get(tk3Var.J()).booleanValue()) {
                String valueOf = String.valueOf(tk3Var.J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            e7 = b7.e(tk3Var.I());
        }
        return e7;
    }

    public static synchronized kr3 d(tk3 tk3Var) {
        kr3 a7;
        synchronized (ee3.class) {
            dd3<?> b7 = b(tk3Var.J());
            if (!f4582d.get(tk3Var.J()).booleanValue()) {
                String valueOf = String.valueOf(tk3Var.J());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            a7 = b7.a(tk3Var.I());
        }
        return a7;
    }

    public static Class<?> e(Class<?> cls) {
        vd3<?, ?> vd3Var = f4584f.get(cls);
        if (vd3Var == null) {
            return null;
        }
        return vd3Var.zza();
    }

    public static <P> P f(qk3 qk3Var, Class<P> cls) {
        return (P) q(qk3Var.J(), qk3Var.I(), cls);
    }

    public static <P> P g(String str, kr3 kr3Var, Class<P> cls) {
        return (P) o(str, cls).b(kr3Var);
    }

    public static <P> P h(String str, byte[] bArr, Class<P> cls) {
        return (P) q(str, uo3.J(bArr), cls);
    }

    public static <B, P> P i(ud3<B> ud3Var, Class<P> cls) {
        vd3<?, ?> vd3Var = f4584f.get(cls);
        if (vd3Var == null) {
            String name = ud3Var.d().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        if (vd3Var.zza().equals(ud3Var.d())) {
            return (P) vd3Var.b(ud3Var);
        }
        String obj = vd3Var.zza().toString();
        String obj2 = ud3Var.d().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 44 + obj2.length());
        sb.append("Wrong input primitive class, expected ");
        sb.append(obj);
        sb.append(", got ");
        sb.append(obj2);
        throw new GeneralSecurityException(sb.toString());
    }

    static synchronized Map<String, gd3> j() {
        Map<String, gd3> unmodifiableMap;
        synchronized (ee3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f4585g);
        }
        return unmodifiableMap;
    }

    public static synchronized <KeyProtoT extends kr3, PublicKeyProtoT extends kr3> void k(xd3<KeyProtoT, PublicKeyProtoT> xd3Var, ld3<PublicKeyProtoT> ld3Var, boolean z6) {
        Class<?> g7;
        synchronized (ee3.class) {
            r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", xd3Var.getClass(), xd3Var.a().d(), true);
            r("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", ld3Var.getClass(), Collections.emptyMap(), false);
            if (!qf3.a(1)) {
                String valueOf = String.valueOf(xd3Var.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            if (!qf3.a(1)) {
                String valueOf2 = String.valueOf(ld3Var.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            }
            ConcurrentMap<String, ce3> concurrentMap = f4580b;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (g7 = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").g()) != null && !g7.getName().equals(ld3Var.getClass().getName())) {
                f4579a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", xd3Var.getClass().getName(), g7.getName(), ld3Var.getClass().getName()));
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").g() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new ae3(xd3Var, ld3Var));
                f4581c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new be3(xd3Var));
                s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", xd3Var.a().d());
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = f4582d;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zd3(ld3Var));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }

    public static synchronized <P> void l(dd3<P> dd3Var, boolean z6) {
        synchronized (ee3.class) {
            if (dd3Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String d7 = dd3Var.d();
            r(d7, dd3Var.getClass(), Collections.emptyMap(), z6);
            f4580b.putIfAbsent(d7, new yd3(dd3Var));
            f4582d.put(d7, Boolean.valueOf(z6));
        }
    }

    public static synchronized <KeyProtoT extends kr3> void m(ld3<KeyProtoT> ld3Var, boolean z6) {
        synchronized (ee3.class) {
            String f7 = ld3Var.f();
            r(f7, ld3Var.getClass(), ld3Var.a().d(), true);
            if (!qf3.a(ld3Var.i())) {
                String valueOf = String.valueOf(ld3Var.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            ConcurrentMap<String, ce3> concurrentMap = f4580b;
            if (!concurrentMap.containsKey(f7)) {
                concurrentMap.put(f7, new zd3(ld3Var));
                f4581c.put(f7, new be3(ld3Var));
                s(f7, ld3Var.a().d());
            }
            f4582d.put(f7, Boolean.TRUE);
        }
    }

    public static synchronized <B, P> void n(vd3<B, P> vd3Var) {
        synchronized (ee3.class) {
            if (vd3Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> a7 = vd3Var.a();
            ConcurrentMap<Class<?>, vd3<?, ?>> concurrentMap = f4584f;
            if (concurrentMap.containsKey(a7)) {
                vd3<?, ?> vd3Var2 = concurrentMap.get(a7);
                if (!vd3Var.getClass().getName().equals(vd3Var2.getClass().getName())) {
                    f4579a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(a7.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a7.getName(), vd3Var2.getClass().getName(), vd3Var.getClass().getName()));
                }
            }
            concurrentMap.put(a7, vd3Var);
        }
    }

    private static <P> dd3<P> o(String str, Class<P> cls) {
        ce3 p7 = p(str);
        if (p7.b().contains(cls)) {
            return p7.d(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(p7.c());
        Set<Class<?>> b7 = p7.b();
        StringBuilder sb = new StringBuilder();
        boolean z6 = true;
        for (Class<?> cls2 : b7) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z6 = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(name.length() + 77 + valueOf.length() + sb2.length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    private static synchronized ce3 p(String str) {
        ce3 ce3Var;
        synchronized (ee3.class) {
            ConcurrentMap<String, ce3> concurrentMap = f4580b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            ce3Var = concurrentMap.get(str);
        }
        return ce3Var;
    }

    private static <P> P q(String str, uo3 uo3Var, Class<P> cls) {
        return (P) o(str, cls).f(uo3Var);
    }

    private static synchronized <KeyProtoT extends kr3, KeyFormatProtoT extends kr3> void r(String str, Class cls, Map<String, id3<KeyFormatProtoT>> map, boolean z6) {
        synchronized (ee3.class) {
            ConcurrentMap<String, ce3> concurrentMap = f4580b;
            ce3 ce3Var = concurrentMap.get(str);
            if (ce3Var != null && !ce3Var.c().equals(cls)) {
                f4579a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, ce3Var.c().getName(), cls.getName()));
            }
            if (z6) {
                ConcurrentMap<String, Boolean> concurrentMap2 = f4582d;
                if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                }
                if (concurrentMap.containsKey(str)) {
                    for (Map.Entry<String, id3<KeyFormatProtoT>> entry : map.entrySet()) {
                        if (!f4585g.containsKey(entry.getKey())) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(key);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry<String, id3<KeyFormatProtoT>> entry2 : map.entrySet()) {
                        if (f4585g.containsKey(entry2.getKey())) {
                            String valueOf = String.valueOf(entry2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    private static <KeyFormatProtoT extends kr3> void s(String str, Map<String, id3<KeyFormatProtoT>> map) {
        for (Map.Entry<String, id3<KeyFormatProtoT>> entry : map.entrySet()) {
            f4585g.put(entry.getKey(), gd3.d(str, entry.getValue().f6619a.d(), entry.getValue().f6620b));
        }
    }
}
