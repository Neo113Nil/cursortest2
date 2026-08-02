package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kmq {
    public static final kay b;
    public static final kay c;
    public static final kay d;
    public static final kay e;
    public final kag a;

    static {
        kay kayVar;
        kaf a = kaf.a();
        b = a.d("grpc.subchannel.disconnections", hnu.D("grpc.target"), hnu.D("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        c = a.d("grpc.subchannel.connection_attempts_succeeded", hnu.D("grpc.target"), hnu.D("grpc.lb.backend_service", "grpc.lb.locality"));
        d = a.d("grpc.subchannel.connection_attempts_failed", hnu.D("grpc.target"), hnu.D("grpc.lb.backend_service", "grpc.lb.locality"));
        ArrayList D = hnu.D("grpc.target");
        ArrayList D2 = hnu.D("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality");
        hoq.y(!hoq.S("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (a.a) {
            Set set = a.b;
            if (set.contains("grpc.subchannel.open_connections")) {
                throw new IllegalStateException(a.Z("grpc.subchannel.open_connections", "Metric with name ", " already exists"));
            }
            int i = a.c;
            if (i + 1 == a.d.length) {
                a.b();
            }
            kayVar = new kay(i, "grpc.subchannel.open_connections", D, D2);
            a.d[i] = kayVar;
            set.add("grpc.subchannel.open_connections");
            a.c++;
        }
        e = kayVar;
    }

    public kmq(kag kagVar) {
        this.a = kagVar;
    }
}
