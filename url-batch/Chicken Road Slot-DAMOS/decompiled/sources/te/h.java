package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f9381c;

    static {
        wd.b.f10140a.getClass();
        f9381c = new h(i.f9386a);
    }

    @Override // te.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        this.f9380b.getClass();
        byte byteValue = ((Byte) lVar.e()).byteValue();
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.f9376a;
        int i10 = gVar.f9377b;
        gVar.f9377b = i10 + 1;
        bArr[i10] = byteValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        g gVar = new g();
        gVar.f9376a = bArr;
        gVar.f9377b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // te.g1
    public final Object n() {
        return new byte[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            byte b10 = bArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.b(b10);
        }
    }
}
