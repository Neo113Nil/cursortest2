package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f6885c = new h(i.f6890a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        g gVar = (g) obj;
        r6.k.f(gVar, "builder");
        byte b9 = aVar.b(this.f6944b, i7);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.f6880a;
        int i8 = gVar.f6881b;
        gVar.f6881b = i8 + 1;
        bArr[i8] = b9;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        byte[] bArr = (byte[]) obj;
        r6.k.f(bArr, "<this>");
        g gVar = new g();
        gVar.f6880a = bArr;
        gVar.f6881b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new byte[0];
    }
}
