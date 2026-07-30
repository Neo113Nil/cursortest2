package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
public abstract class h implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f16024a;

    public h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16024a = vVar;
    }

    private v b() {
        return this.f16024a;
    }

    @Override // com.anythink.core.common.n.c.v
    public void a(c cVar, long j9) {
        this.f16024a.a(cVar, j9);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16024a.close();
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        this.f16024a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16024a.toString() + ")";
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16024a.a();
    }
}
