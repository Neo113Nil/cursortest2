package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h80 implements yd1 {
    public Float d;
    public Float e;
    public final av0 g;
    public lg1 h;
    public boolean i;
    public boolean j;
    public long k;
    public final /* synthetic */ j80 l;

    public h80(j80 j80Var, Float f, Float f2, g80 g80Var) {
        this.l = j80Var;
        this.d = f;
        this.e = f2;
        this.g = gb0.F(f);
        this.h = new lg1(g80Var, p4.o, this.d, this.e, null);
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return this.g.getValue();
    }
}
