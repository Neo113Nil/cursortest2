package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khd {
    public static final jzw b;
    public static final jzw c;
    public static final jzw d;
    public static final jzw e;
    public static final jzw f;
    static final jzw g;
    public static final jzw h;
    public static final jzw i;
    public static final jzw j;
    public static final gzz k;
    public static final kbd l;
    public static final jwv m;
    public static final kmh n;
    public static final kmh o;
    public static final hac p;
    private static final jxb s;
    private static final Logger q = Logger.getLogger(khd.class.getName());
    private static final Set r = DesugarCollections.unmodifiableSet(EnumSet.of(kbn.OK, kbn.INVALID_ARGUMENT, kbn.NOT_FOUND, kbn.ALREADY_EXISTS, kbn.FAILED_PRECONDITION, kbn.ABORTED, kbn.OUT_OF_RANGE, kbn.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        khc khcVar = new khc(0);
        int i2 = jzw.d;
        b = new jzq("grpc-timeout", khcVar);
        c = new jzq("grpc-encoding", kaa.b);
        d = jyr.a("grpc-accept-encoding", new khf(1));
        e = new jzq("content-encoding", kaa.b);
        f = jyr.a("accept-encoding", new khf(1));
        g = new jzq("content-length", kaa.b);
        h = new jzq("content-type", kaa.b);
        i = new jzq("te", kaa.b);
        j = new jzq("user-agent", kaa.b);
        gzz b2 = gzz.b(',');
        gyv gyvVar = gyu.b;
        gyvVar.getClass();
        k = new gzz(b2.c, b2.b, gyvVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        l = new kka();
        m = new jwv("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        s = new jxb();
        n = new kgz();
        o = new kha();
        p = new khb(0);
    }

    private khd() {
    }

    public static kbq a(int i2) {
        kbn kbnVar;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    kbnVar = kbn.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    kbnVar = kbn.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    kbnVar = kbn.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    kbnVar = kbn.UNAVAILABLE;
                } else {
                    kbnVar = kbn.UNIMPLEMENTED;
                }
            }
            kbnVar = kbn.INTERNAL;
        } else {
            kbnVar = kbn.INTERNAL;
        }
        return kbnVar.a().e(a.Y(i2, "HTTP status code "));
    }

    public static kbq b(kbq kbqVar) {
        Set set = r;
        kbn kbnVar = kbqVar.o;
        if (!set.contains(kbnVar)) {
            return kbqVar;
        }
        String str = kbqVar.p;
        return kbq.k.e("Inappropriate status code from control plane: " + kbnVar.toString() + " " + str).d(kbqVar.q);
    }

    static kfj c(jze jzeVar, boolean z) {
        kfj kfjVar;
        jzh jzhVar = jzeVar.b;
        if (jzhVar != null) {
            ken kenVar = (ken) jzhVar;
            hoq.I(kenVar.g, "Subchannel is not started");
            kfjVar = kenVar.f.a();
        } else {
            kfjVar = null;
        }
        if (kfjVar != null) {
            return kfjVar;
        }
        kbq kbqVar = jzeVar.c;
        if (!kbqVar.g()) {
            if (jzeVar.d) {
                return new kgq(b(kbqVar), kfh.c);
            }
            if (!z) {
                return new kgq(b(kbqVar), kfh.a);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i3, e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    static void e(kmo kmoVar) {
        while (true) {
            InputStream e2 = kmoVar.e();
            if (e2 == null) {
                return;
            } else {
                f(e2);
            }
        }
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            q.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static ThreadFactory g(String str) {
        ids idsVar = new ids((char[]) null, (byte[]) null);
        idsVar.m(true);
        idsVar.n(str);
        return ids.p(idsVar);
    }

    public static jxb[] h(jww jwwVar) {
        List list = jwwVar.d;
        int size = list.size();
        jxb[] jxbVarArr = new jxb[size + 1];
        jwwVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jxbVarArr[i2] = ((iwv) list.get(i2)).a();
        }
        jxbVarArr[size] = s;
        return jxbVarArr;
    }
}
