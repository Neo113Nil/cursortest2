package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s1 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final s1 f9438c;

    static {
        hd.t.f4523e.getClass();
        f9438c = new s1(t1.f9441a);
    }

    @Override // te.a
    public final int h(Object obj) {
        return ((hd.v) obj).f4528d.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        r1 r1Var = (r1) obj;
        r1Var.getClass();
        f1 f1Var = this.f9380b;
        f1Var.getClass();
        lVar.b(f1Var.h(i3));
        byte byteValue = ((Byte) lVar.e()).byteValue();
        hd.s sVar = hd.t.f4523e;
        r1Var.b(r1Var.d() + 1);
        byte[] bArr = r1Var.f9434a;
        int i10 = r1Var.f9435b;
        r1Var.f9435b = i10 + 1;
        bArr[i10] = byteValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        byte[] bArr = ((hd.v) obj).f4528d;
        r1 r1Var = new r1();
        r1Var.f9434a = bArr;
        r1Var.f9435b = bArr.length;
        r1Var.b(10);
        return r1Var;
    }

    @Override // te.g1
    public final Object n() {
        return new hd.v(new byte[0]);
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        byte[] bArr = ((hd.v) obj).f4528d;
        for (int i10 = 0; i10 < i3; i10++) {
            e3.o h10 = oVar.h(this.f9380b, i10);
            byte b10 = bArr[i10];
            hd.s sVar = hd.t.f4523e;
            h10.b(b10);
        }
    }
}
