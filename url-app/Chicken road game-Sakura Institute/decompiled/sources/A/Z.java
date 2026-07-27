package A;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class Z extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f78e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, int i2) {
        super(0);
        this.f77d = i2;
        this.f78e = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f77d) {
            case 0:
                a0 a0Var = this.f78e;
                a0Var.b(true);
                a0Var.k();
                break;
            case 1:
                a0 a0Var2 = this.f78e;
                a0Var2.d();
                a0Var2.k();
                break;
            case 2:
                a0 a0Var3 = this.f78e;
                a0Var3.l();
                a0Var3.k();
                break;
            case 3:
                this.f78e.m();
                break;
            case 4:
                this.f78e.l();
                break;
            case 5:
                this.f78e.f(true);
                break;
            case 6:
                this.f78e.b(true);
                break;
            default:
                this.f78e.d();
                break;
        }
        return Boolean.TRUE;
    }
}
