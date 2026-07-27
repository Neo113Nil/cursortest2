package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1.C1183B;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1183B f11929e;

    public /* synthetic */ z(C1183B c1183b, int i2) {
        this.f11928d = i2;
        this.f11929e = c1183b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11928d) {
            case 0:
                s1.z NavHost = (s1.z) obj;
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                C1183B c1183b = this.f11929e;
                m3.s.i(NavHost, "events", new O.a(-1570730231, true, new C1357A(c1183b, 0)));
                m3.s.i(NavHost, "event/{id}", new O.a(1308581234, true, new C1357A(c1183b, 1)));
                m3.s.i(NavHost, "field/{eid}", new O.a(-962886511, true, new C1357A(c1183b, 2)));
                m3.s.i(NavHost, "caller/{eid}", new O.a(1060613040, true, new C1357A(c1183b, 3)));
                m3.s.i(NavHost, "live", AbstractC1386l.f11889a);
                m3.s.i(NavHost, "journal", AbstractC1386l.f11890b);
                m3.s.i(NavHost, "roster", new O.a(-1458822899, true, new C1357A(c1183b, 4)));
                m3.s.i(NavHost, "athlete/{aid}", new O.a(564676652, true, new C1357A(c1183b, 5)));
                m3.s.i(NavHost, "relay", new O.a(-1706791093, true, new C1357A(c1183b, 6)));
                m3.s.i(NavHost, "records", new O.a(316708458, true, new C1357A(c1183b, 7)));
                m3.s.i(NavHost, "podium/{tid}", new O.a(1674242046, true, new C1357A(c1183b, 8)));
                m3.s.i(NavHost, "rules", AbstractC1386l.f11891c);
                break;
            case 1:
                String id = (String) obj;
                Intrinsics.checkNotNullParameter(id, "id");
                C1183B.l(this.f11929e, "event/" + id, null, 6);
                break;
            case 2:
                String eid = (String) obj;
                Intrinsics.checkNotNullParameter(eid, "eid");
                C1183B.l(this.f11929e, "field/" + eid, null, 6);
                break;
            case 3:
                String eid2 = (String) obj;
                Intrinsics.checkNotNullParameter(eid2, "eid");
                C1183B.l(this.f11929e, "caller/" + eid2, null, 6);
                break;
            case 4:
                String aid = (String) obj;
                Intrinsics.checkNotNullParameter(aid, "aid");
                C1183B.l(this.f11929e, "athlete/" + aid, null, 6);
                break;
            default:
                String tid = (String) obj;
                Intrinsics.checkNotNullParameter(tid, "tid");
                C1183B.l(this.f11929e, "podium/" + tid, null, 6);
                break;
        }
        return Unit.f7487a;
    }
}
