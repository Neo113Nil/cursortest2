package m;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class t0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f8190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, int i2) {
        super(0);
        this.f8189d = i2;
        this.f8190e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8189d) {
            case 0:
                return Boolean.valueOf(this.f8190e.f8194a.d() > 0);
            default:
                u0 u0Var = this.f8190e;
                return Boolean.valueOf(u0Var.f8194a.d() < u0Var.f8197d.d());
        }
    }
}
