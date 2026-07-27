package E;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2212e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f2213i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(long j4, Function2 function2, int i2) {
        super(2);
        this.f2211d = i2;
        this.f2212e = j4;
        this.f2213i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2211d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    v.c(this.f2212e, this.f2213i, c0216p, 0);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    v.c(this.f2212e, this.f2213i, c0216p2, 0);
                }
                break;
        }
        return Unit.f7487a;
    }
}
