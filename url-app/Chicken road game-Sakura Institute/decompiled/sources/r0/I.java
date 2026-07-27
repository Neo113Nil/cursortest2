package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import s0.C1166s;

/* loaded from: classes.dex */
public final class I extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f9627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f9628e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l4, g0 g0Var, long j4) {
        super(0);
        this.f9627d = l4;
        this.f9628e = g0Var;
        this.f9629i = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        P M02;
        L l4 = this.f9627d;
        AbstractC0953N abstractC0953N = null;
        if (AbstractC1065f.r(l4.f9674a)) {
            a0 a0Var = l4.a().f9764t;
            if (a0Var != null) {
                abstractC0953N = a0Var.f9704o;
            }
        } else {
            a0 a0Var2 = l4.a().f9764t;
            if (a0Var2 != null && (M02 = a0Var2.M0()) != null) {
                abstractC0953N = M02.f9704o;
            }
        }
        if (abstractC0953N == null) {
            abstractC0953N = ((C1166s) this.f9628e).getPlacementScope();
        }
        P M03 = l4.a().M0();
        Intrinsics.c(M03);
        AbstractC0953N.e(abstractC0953N, M03, this.f9629i);
        return Unit.f7487a;
    }
}
