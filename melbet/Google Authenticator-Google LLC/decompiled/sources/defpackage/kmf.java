package defpackage;

import j$.util.DesugarCollections;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmf {
    private kmf() {
    }

    public static Set a(Map map, String str) {
        kbn kbnVar;
        List f = ixb.f(map, str);
        if (f == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(kbn.class);
        for (Object obj : f) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                hoq.t(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                kbnVar = kbq.b(intValue).o;
                hoq.t(kbnVar.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new haj("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    kbn kbnVar2 = kbn.OK;
                    kbnVar = (kbn) Enum.valueOf(kbn.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new haj(a.aj(obj, "Status code ", " is not valid"), e);
                }
            }
            noneOf.add(kbnVar);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }

    public static final PasswordAuthentication b(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            kka.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static khx c() {
        return kkg.a == null ? new kkg() : new keo();
    }
}
