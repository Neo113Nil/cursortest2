package A1;

import D.N1;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f795e;

    public /* synthetic */ y0(String str, int i2) {
        this.f794d = i2;
        this.f795e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f794d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b(this.f795e, null, 0L, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131062);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    N1.b(this.f795e, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 0, 0, 131070);
                }
                break;
        }
        return Unit.f7487a;
    }
}
