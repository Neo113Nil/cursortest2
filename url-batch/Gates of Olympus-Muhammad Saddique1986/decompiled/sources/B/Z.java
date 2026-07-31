package B;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class Z extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, int i3) {
        super(0);
        this.f335e = i3;
        this.f336f = a0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f335e) {
            case 0:
                a0 a0Var = this.f336f;
                a0Var.b(true);
                a0Var.k();
                break;
            case 1:
                a0 a0Var2 = this.f336f;
                a0Var2.d();
                a0Var2.k();
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                a0 a0Var3 = this.f336f;
                a0Var3.l();
                a0Var3.k();
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f336f.m();
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                this.f336f.l();
                break;
            case 5:
                this.f336f.f(true);
                break;
            case 6:
                this.f336f.b(true);
                break;
            default:
                this.f336f.d();
                break;
        }
        return Boolean.TRUE;
    }
}
