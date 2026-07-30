package e8;

import java.io.IOException;
import java.util.LinkedHashMap;

/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4484b implements B {

    /* renamed from: b, reason: collision with root package name */
    public static final C4484b f37353b = new C4484b();

    /* renamed from: c, reason: collision with root package name */
    public static final C4484b f37354c = new C4484b();

    /* renamed from: d, reason: collision with root package name */
    public static final C4484b f37355d = new C4484b();

    public static final f a(C4484b c4484b, String str) {
        f fVar = new f(str);
        f.f37374d.put(str, fVar);
        return fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static A c(String javaName) {
        kotlin.jvm.internal.h.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return A.f37339x;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return A.f37338w;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return A.f37337v;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return A.f37340y;
            }
        } else if (javaName.equals("SSLv3")) {
            return A.f37341z;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static t d(String str) {
        t tVar = t.f37502v;
        if (str.equals("http/1.0")) {
            return tVar;
        }
        t tVar2 = t.f37503w;
        if (str.equals("http/1.1")) {
            return tVar2;
        }
        t tVar3 = t.f37506z;
        if (str.equals("h2_prior_knowledge")) {
            return tVar3;
        }
        t tVar4 = t.f37505y;
        if (str.equals("h2")) {
            return tVar4;
        }
        t tVar5 = t.f37504x;
        if (str.equals("spdy/3.1")) {
            return tVar5;
        }
        t tVar6 = t.f37498A;
        if (str.equals("quic")) {
            return tVar6;
        }
        t tVar7 = t.f37499B;
        if (M7.q.I(str, "h3")) {
            return tVar7;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public synchronized f b(String javaName) {
        f fVar;
        String str;
        try {
            kotlin.jvm.internal.h.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = f.f37374d;
            fVar = (f) linkedHashMap.get(javaName);
            if (fVar == null) {
                if (M7.q.I(javaName, "TLS_")) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    str = "SSL_".concat(substring);
                } else if (M7.q.I(javaName, "SSL_")) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring2, "substring(...)");
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
