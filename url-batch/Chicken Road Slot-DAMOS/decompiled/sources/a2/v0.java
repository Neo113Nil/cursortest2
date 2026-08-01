package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1.l f169e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hd.c f170i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f171r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Function1 function1, d1.l lVar, int i3) {
        super(2);
        this.f168d = 2;
        this.f170i = function1;
        this.f169e = lVar;
        this.f171r = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f168d;
        n0.i0 i0Var = (n0.i0) obj;
        ((Number) obj2).intValue();
        switch (i3) {
            case 0:
                q.b(this.f169e, (Function2) this.f170i, i0Var, n0.h.z(this.f171r | 1));
                break;
            case 1:
                k7.e.c(this.f169e, (Function2) this.f170i, i0Var, n0.h.z(this.f171r | 1));
                break;
            default:
                a3.o.a(n0.h.z(this.f171r | 1), this.f169e, (Function1) this.f170i, i0Var);
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(d1.l lVar, Function2 function2, int i3, int i10) {
        super(2);
        this.f168d = i10;
        this.f169e = lVar;
        this.f170i = function2;
        this.f171r = i3;
    }
}
