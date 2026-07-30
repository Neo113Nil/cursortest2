package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f16056a;

    /* renamed from: b, reason: collision with root package name */
    private final c f16057b;

    /* renamed from: c, reason: collision with root package name */
    private s f16058c;

    /* renamed from: d, reason: collision with root package name */
    private int f16059d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16060e;

    /* renamed from: f, reason: collision with root package name */
    private long f16061f;

    public p(e eVar) {
        this.f16056a = eVar;
        c c4 = eVar.c();
        this.f16057b = c4;
        s sVar = c4.f16004b;
        this.f16058c = sVar;
        this.f16059d = sVar != null ? sVar.f16073d : -1;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16056a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j9) {
        s sVar;
        s sVar2;
        if (this.f16060e) {
            throw new IllegalStateException("closed");
        }
        s sVar3 = this.f16058c;
        if (sVar3 != null && (sVar3 != (sVar2 = this.f16057b.f16004b) || this.f16059d != sVar2.f16073d)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        this.f16056a.b(this.f16061f + j9);
        if (this.f16058c == null && (sVar = this.f16057b.f16004b) != null) {
            this.f16058c = sVar;
            this.f16059d = sVar.f16073d;
        }
        long min = Math.min(j9, this.f16057b.f16005c - this.f16061f);
        if (min <= 0) {
            return -1L;
        }
        this.f16057b.a(cVar, this.f16061f, min);
        this.f16061f += min;
        return min;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16060e = true;
    }
}
