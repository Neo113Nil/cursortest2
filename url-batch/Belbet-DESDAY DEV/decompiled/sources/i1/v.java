package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2534b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.h f2535c;

    public /* synthetic */ v(long j2, v1.h hVar, int i) {
        this.f2533a = i;
        this.f2534b = j2;
        this.f2535c = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(f());
    }

    public final long e() {
        switch (this.f2533a) {
        }
        return this.f2534b;
    }

    public final v1.h f() {
        switch (this.f2533a) {
            case 0:
                return (v1.f) this.f2535c;
            default:
                return (v1.p) this.f2535c;
        }
    }
}
