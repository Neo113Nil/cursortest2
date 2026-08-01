package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v1 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f9453c;

    static {
        hd.x.f4529e.getClass();
        f9453c = new v1(w1.f9458a);
    }

    @Override // te.a
    public final int h(Object obj) {
        return ((hd.y) obj).f4531d.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        u1 u1Var = (u1) obj;
        u1Var.getClass();
        f1 f1Var = this.f9380b;
        f1Var.getClass();
        lVar.b(f1Var.h(i3));
        int c10 = lVar.c();
        hd.w wVar = hd.x.f4529e;
        u1Var.b(u1Var.d() + 1);
        int[] iArr = u1Var.f9446a;
        int i10 = u1Var.f9447b;
        u1Var.f9447b = i10 + 1;
        iArr[i10] = c10;
    }

    @Override // te.a
    public final Object k(Object obj) {
        int[] iArr = ((hd.y) obj).f4531d;
        u1 u1Var = new u1();
        u1Var.f9446a = iArr;
        u1Var.f9447b = iArr.length;
        u1Var.b(10);
        return u1Var;
    }

    @Override // te.g1
    public final Object n() {
        return new hd.y(new int[0]);
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        int[] iArr = ((hd.y) obj).f4531d;
        for (int i10 = 0; i10 < i3; i10++) {
            e3.o h10 = oVar.h(this.f9380b, i10);
            int i11 = iArr[i10];
            hd.w wVar = hd.x.f4529e;
            h10.i(i11);
        }
    }
}
