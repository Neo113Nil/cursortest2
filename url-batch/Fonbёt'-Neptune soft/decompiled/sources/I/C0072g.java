package I;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072g extends J0.g implements P0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f641i;

    @Override // P0.l
    public final Object i(Object obj) {
        C0072g c0072g = new C0072g(1, (H0.d) obj);
        F0.h hVar = F0.h.f469a;
        c0072g.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        int i2 = this.f641i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f641i = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i1.a.G(obj);
        return F0.h.f469a;
    }
}
