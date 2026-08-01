package v;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f9873e;

    public /* synthetic */ r0(z0 z0Var, int i3) {
        this.f9872d = i3;
        this.f9873e = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9872d) {
            case 0:
                z0 z0Var = this.f9873e;
                return Boolean.valueOf((Intrinsics.a(z0Var.f9920d.getValue(), z0Var.f9917a.l()) && z0Var.g.h() == Long.MIN_VALUE && !((Boolean) z0Var.f9923h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f9873e.b());
        }
    }
}
