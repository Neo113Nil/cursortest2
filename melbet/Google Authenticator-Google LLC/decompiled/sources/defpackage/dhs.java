package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhs implements jrw {
    private final jsb a;

    public dhs(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dhr b() {
        dhr dhhVar;
        Map map = (Map) ((jrx) this.a).a;
        int size = map.size();
        if (size == 0) {
            dhhVar = new dhh();
        } else {
            if (size != 1) {
                throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
            }
            dhhVar = (dhr) hnu.X(map.keySet());
        }
        dhhVar.d();
        dhhVar.d();
        dhhVar.d();
        hoq.L(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        dhhVar.e();
        dhhVar.e();
        hoq.J(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        dhhVar.a();
        dhhVar.a();
        dhhVar.a();
        hoq.L(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        dhhVar.b();
        dhhVar.b();
        hoq.J(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        dhhVar.c();
        dhhVar.c();
        dhhVar.c();
        hoq.L(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        dhhVar.f();
        dhhVar.f();
        dhhVar.getClass();
        return dhhVar;
    }
}
