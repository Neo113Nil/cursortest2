package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    private final c f8688a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8689b;

    /* renamed from: c, reason: collision with root package name */
    private long f8690c;

    /* renamed from: d, reason: collision with root package name */
    private long f8691d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.v f8692e = com.anythink.basead.exoplayer.v.f8915a;

    public z(c cVar) {
        this.f8688a = cVar;
    }

    public final void a() {
        if (this.f8689b) {
            return;
        }
        this.f8691d = this.f8688a.a();
        this.f8689b = true;
    }

    public final void b() {
        if (this.f8689b) {
            a(d());
            this.f8689b = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        long j9 = this.f8690c;
        if (!this.f8689b) {
            return j9;
        }
        long a9 = this.f8688a.a() - this.f8691d;
        com.anythink.basead.exoplayer.v vVar = this.f8692e;
        return (vVar.f8916b == 1.0f ? com.anythink.basead.exoplayer.b.b(a9) : vVar.a(a9)) + j9;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v e() {
        return this.f8692e;
    }

    public final void a(long j9) {
        this.f8690c = j9;
        if (this.f8689b) {
            this.f8691d = this.f8688a.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v a(com.anythink.basead.exoplayer.v vVar) {
        if (this.f8689b) {
            a(d());
        }
        this.f8692e = vVar;
        return vVar;
    }
}
