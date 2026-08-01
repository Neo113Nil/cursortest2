package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2511b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.h f2512c;

    public /* synthetic */ u(long j2, v1.h hVar, int i) {
        this.f2510a = i;
        this.f2511b = j2;
        this.f2512c = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(f());
    }

    public final long e() {
        switch (this.f2510a) {
        }
        return this.f2511b;
    }

    public final v1.h f() {
        switch (this.f2510a) {
            case 0:
                return (v1.f) this.f2512c;
            default:
                return (v1.o) this.f2512c;
        }
    }
}
