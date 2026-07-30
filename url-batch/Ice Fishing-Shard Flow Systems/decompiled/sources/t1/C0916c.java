package t1;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916c implements InterfaceC0915b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1.a f7924a;

    public C0916c(I1.a aVar) {
        this.f7924a = aVar;
    }

    @Override // t1.InterfaceC0915b
    public final void a(q1.b bVar) {
        boolean b7 = bVar.b();
        I1.a aVar = this.f7924a;
        if (b7) {
            aVar.h(null, aVar.f4376C);
            return;
        }
        C0921h c0921h = aVar.f4395t;
        if (c0921h != null) {
            ((r1.l) c0921h.f7958a).onConnectionFailed(bVar);
        }
    }
}
