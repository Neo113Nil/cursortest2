package b;

/* renamed from: b.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300D implements InterfaceC0307c {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0327w f5265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0301E f5266e;

    public C0300D(C0301E c0301e, AbstractC0327w abstractC0327w) {
        f2.j.f(abstractC0327w, "onBackPressedCallback");
        this.f5266e = c0301e;
        this.f5265d = abstractC0327w;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.a, f2.h] */
    @Override // b.InterfaceC0307c
    public final void cancel() {
        C0301E c0301e = this.f5266e;
        S1.j jVar = c0301e.f5268b;
        AbstractC0327w abstractC0327w = this.f5265d;
        jVar.remove(abstractC0327w);
        if (f2.j.a(c0301e.f5269c, abstractC0327w)) {
            abstractC0327w.a();
            c0301e.f5269c = null;
        }
        abstractC0327w.f5338b.remove(this);
        ?? r02 = abstractC0327w.f5339c;
        if (r02 != 0) {
            r02.b();
        }
        abstractC0327w.f5339c = null;
    }
}
