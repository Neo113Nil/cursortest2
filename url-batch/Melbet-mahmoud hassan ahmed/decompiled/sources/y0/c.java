package y0;

import o2.a0;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23218c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23219d;

    private c(int i7, int i8, int i9, int i10) {
        this.f23216a = i7;
        this.f23217b = i8;
        this.f23218c = i9;
        this.f23219d = i10;
    }

    public static c b(a0 a0Var) {
        int p7 = a0Var.p();
        a0Var.P(8);
        int p8 = a0Var.p();
        int p9 = a0Var.p();
        a0Var.P(4);
        int p10 = a0Var.p();
        a0Var.P(12);
        return new c(p7, p8, p9, p10);
    }

    public boolean a() {
        return (this.f23217b & 16) == 16;
    }

    @Override // y0.a
    public int getType() {
        return 1751742049;
    }
}
