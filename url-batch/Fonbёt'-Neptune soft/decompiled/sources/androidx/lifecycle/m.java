package androidx.lifecycle;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public g f1774a;

    /* renamed from: b, reason: collision with root package name */
    public b f1775b;

    public final void a(l lVar, f fVar) {
        g a2 = fVar.a();
        g gVar = this.f1774a;
        Q0.h.e(gVar, "state1");
        if (a2.compareTo(gVar) < 0) {
            gVar = a2;
        }
        this.f1774a = gVar;
        this.f1775b.a(lVar, fVar);
        this.f1774a = a2;
    }
}
