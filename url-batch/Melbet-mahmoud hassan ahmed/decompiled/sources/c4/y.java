package c4;

import k4.f;

/* loaded from: classes.dex */
final class y implements f.a, f.b {

    /* renamed from: a, reason: collision with root package name */
    private final f.b f2155a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f2156b;

    private y(f.b bVar, f.a aVar) {
        this.f2155a = bVar;
        this.f2156b = aVar;
    }

    @Override // k4.f.b
    public final void a(k4.b bVar) {
        this.f2155a.a(bVar);
    }

    @Override // k4.f.a
    public final void b(k4.e eVar) {
        this.f2156b.b(eVar);
    }
}
