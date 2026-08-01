package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2516a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2517b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.h f2518c;

    public /* synthetic */ u(long j2, v1.h hVar, int i) {
        this.f2516a = i;
        this.f2517b = j2;
        this.f2518c = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(f());
    }

    public final long e() {
        switch (this.f2516a) {
        }
        return this.f2517b;
    }

    public final v1.h f() {
        switch (this.f2516a) {
            case 0:
                return (v1.f) this.f2518c;
            default:
                return (v1.p) this.f2518c;
        }
    }
}
