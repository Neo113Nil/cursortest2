package b;

/* loaded from: classes.dex */
public final class E implements InterfaceC0243c {

    /* renamed from: d, reason: collision with root package name */
    public final w f4130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f4131e;

    public E(F f3, w wVar) {
        Z1.i.f(wVar, "onBackPressedCallback");
        this.f4131e = f3;
        this.f4130d = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y1.a, Z1.g] */
    @Override // b.InterfaceC0243c
    public final void cancel() {
        F f3 = this.f4131e;
        M1.j jVar = f3.f4133b;
        w wVar = this.f4130d;
        jVar.remove(wVar);
        if (Z1.i.a(f3.f4134c, wVar)) {
            wVar.a();
            f3.f4134c = null;
        }
        wVar.f4201b.remove(this);
        ?? r02 = wVar.f4202c;
        if (r02 != 0) {
            r02.b();
        }
        wVar.f4202c = null;
    }
}
