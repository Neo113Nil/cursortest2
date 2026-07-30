package D6;

import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements InterfaceC0094b, H {

    /* renamed from: c, reason: collision with root package name */
    public static final l f536c = new l();

    /* renamed from: d, reason: collision with root package name */
    public static final l f537d = new l();

    /* renamed from: e, reason: collision with root package name */
    public static final l f538e = new l();

    public static final C0099g a(l lVar, String str) {
        C0099g c0099g = new C0099g(str);
        C0099g.f488d.put(str, c0099g);
        return c0099g;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static G c(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return G.f450m;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return G.f449l;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return G.f448i;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return G.f451n;
            }
        } else if (javaName.equals("SSLv3")) {
            return G.f452o;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static x d(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        x xVar = x.f624i;
        if (protocol.equals("http/1.0")) {
            return xVar;
        }
        x xVar2 = x.f625l;
        if (protocol.equals("http/1.1")) {
            return xVar2;
        }
        x xVar3 = x.f628o;
        if (protocol.equals("h2_prior_knowledge")) {
            return xVar3;
        }
        x xVar4 = x.f627n;
        if (protocol.equals("h2")) {
            return xVar4;
        }
        x xVar5 = x.f626m;
        if (protocol.equals("spdy/3.1")) {
            return xVar5;
        }
        x xVar6 = x.f629p;
        if (protocol.equals("quic")) {
            return xVar6;
        }
        x xVar7 = x.f630q;
        if (kotlin.text.p.l(protocol, "h3")) {
            return xVar7;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }

    public static String e(String str) {
        if (kotlin.text.p.l(str, "TLS_")) {
            StringBuilder sb = new StringBuilder("SSL_");
            String substring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        if (!kotlin.text.p.l(str, "SSL_")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("TLS_");
        String substring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public synchronized C0099g b(String javaName) {
        C0099g c0099g;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = C0099g.f488d;
            c0099g = (C0099g) linkedHashMap.get(javaName);
            if (c0099g == null) {
                c0099g = (C0099g) linkedHashMap.get(e(javaName));
                if (c0099g == null) {
                    c0099g = new C0099g(javaName);
                }
                linkedHashMap.put(javaName, c0099g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0099g;
    }
}
