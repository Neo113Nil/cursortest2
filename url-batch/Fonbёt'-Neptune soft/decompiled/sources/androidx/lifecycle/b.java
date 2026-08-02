package androidx.lifecycle;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.b f1764a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1765b;

    public b(io.flutter.embedding.engine.renderer.b bVar, b bVar2) {
        this.f1764a = bVar;
        this.f1765b = bVar2;
    }

    public final void a(l lVar, f fVar) {
        int i2 = a.f1763a[fVar.ordinal()];
        io.flutter.embedding.engine.renderer.b bVar = this.f1764a;
        if (i2 == 3) {
            bVar.a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        b bVar2 = this.f1765b;
        if (bVar2 != null) {
            bVar2.a(lVar, fVar);
        }
    }
}
