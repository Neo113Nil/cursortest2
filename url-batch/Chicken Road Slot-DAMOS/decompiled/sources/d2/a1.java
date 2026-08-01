package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3330d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f3331e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f3332i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f3333r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(v vVar, c1 c1Var, Function2 function2) {
        super(2);
        this.f3332i = vVar;
        this.f3331e = c1Var;
        this.f3333r = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3330d) {
            case 0:
                n0.i0 i0Var = (n0.i0) obj;
                int intValue = ((Number) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    i0Var.W(866651995);
                    d1.a(this.f3332i, this.f3331e.f3361k, this.f3333r, i0Var, 0);
                    i0Var.p(false);
                } else {
                    i0Var.R();
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.f3331e.a(this.f3332i, this.f3333r, (n0.i0) obj, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, v vVar, Function2 function2, int i3) {
        super(2);
        this.f3331e = c1Var;
        this.f3332i = vVar;
        this.f3333r = function2;
    }
}
