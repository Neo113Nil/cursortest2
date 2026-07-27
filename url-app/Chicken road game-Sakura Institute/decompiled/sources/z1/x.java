package z1;

import D.AbstractC0165r0;
import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1367K f11924e;

    public /* synthetic */ x(C1367K c1367k, int i2) {
        this.f11923d = i2;
        this.f11924e = c1367k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f11923d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    AbstractC0165r0.a(this.f11924e.f11829c, null, 0L, c0216p, 48, 12);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    N1.b(this.f11924e.f11828b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 0, 0, 131070);
                }
                break;
        }
        return Unit.f7487a;
    }
}
