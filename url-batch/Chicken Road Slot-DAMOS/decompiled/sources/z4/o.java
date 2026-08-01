package z4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o extends j5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10805b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, int i3) {
        super(i3);
        this.f10805b = qVar;
    }

    @Override // j5.a
    public final void c(k5.d dVar) {
        this.f10805b.c(new l5.a(dVar));
    }

    @Override // j5.a
    public final void d(k5.d dVar, int i3, int i10) {
        f(dVar, i3, i10);
    }

    @Override // j5.a
    public final void e(k5.d dVar) {
        l5.a aVar = new l5.a(dVar);
        q qVar = this.f10805b;
        qVar.e(aVar);
        qVar.f10813h = dVar;
    }

    @Override // j5.a
    public final void f(k5.d dVar, int i3, int i10) {
        this.f10805b.d(new l5.a(dVar), i3, i10);
    }
}
