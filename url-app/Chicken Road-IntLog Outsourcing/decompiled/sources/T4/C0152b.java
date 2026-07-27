package T4;

import java.io.IOException;
import java.util.LinkedHashMap;

/* renamed from: T4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152b implements E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0152b f2827b = new C0152b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0152b f2828c = new C0152b();

    /* renamed from: d, reason: collision with root package name */
    public static final C0152b f2829d = new C0152b();

    public static final f a(C0152b c0152b, String str) {
        f fVar = new f(str);
        f.f2849d.put(str, fVar);
        return fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static D c(String javaName) {
        kotlin.jvm.internal.i.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return D.f2811e;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return D.f2810d;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return D.f2809c;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return D.f2812f;
            }
        } else if (javaName.equals("SSLv3")) {
            return D.f2813g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static v d(String str) {
        v vVar = v.f2986c;
        if (!str.equals("http/1.0")) {
            vVar = v.f2987d;
            if (!str.equals("http/1.1")) {
                vVar = v.f2990g;
                if (!str.equals("h2_prior_knowledge")) {
                    vVar = v.f2989f;
                    if (!str.equals("h2")) {
                        vVar = v.f2988e;
                        if (!str.equals("spdy/3.1")) {
                            vVar = v.f2991h;
                            if (!str.equals("quic")) {
                                vVar = v.f2992i;
                                if (!B4.r.O(str, "h3", false)) {
                                    throw new IOException("Unexpected protocol: ".concat(str));
                                }
                            }
                        }
                    }
                }
            }
        }
        return vVar;
    }

    public synchronized f b(String javaName) {
        f fVar;
        String str;
        try {
            kotlin.jvm.internal.i.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = f.f2849d;
            fVar = (f) linkedHashMap.get(javaName);
            if (fVar == null) {
                if (B4.r.O(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring, "substring(...)");
                    str = "SSL_".concat(substring);
                } else if (B4.r.O(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring2, "substring(...)");
                    str = "TLS_".concat(substring2);
                } else {
                    str = javaName;
                }
                fVar = (f) linkedHashMap.get(str);
                if (fVar == null) {
                    fVar = new f(javaName);
                }
                linkedHashMap.put(javaName, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
