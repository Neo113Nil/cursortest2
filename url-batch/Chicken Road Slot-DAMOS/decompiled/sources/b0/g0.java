package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f845d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f846e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f847i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f848r;

    public /* synthetic */ g0(int i3, a2.o0 o0Var, int i10) {
        this.f846e = i3;
        this.f847i = o0Var;
        this.f848r = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f845d) {
            case 0:
                ((a2.n0) obj).h(this.f847i, this.f846e, this.f848r, 0.0f);
                break;
            default:
                ((a2.n0) obj).h(this.f847i, yd.c.a((this.f846e - r0.f131d) / 2.0f), yd.c.a((this.f848r - r0.f132e) / 2.0f), 0.0f);
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ g0(a2.o0 o0Var, int i3, int i10) {
        this.f847i = o0Var;
        this.f846e = i3;
        this.f848r = i10;
    }
}
