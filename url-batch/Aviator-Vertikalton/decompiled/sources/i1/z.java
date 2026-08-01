package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2803a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2804b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2805c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.h f2806d;

    public /* synthetic */ z(Object obj, long j2, v1.h hVar, int i) {
        this.f2803a = i;
        this.f2805c = obj;
        this.f2804b = j2;
        this.f2806d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(h());
    }

    public final long g() {
        switch (this.f2803a) {
        }
        return this.f2804b;
    }

    public final v1.h h() {
        switch (this.f2803a) {
            case 0:
                return (v1.f) this.f2806d;
            default:
                return (v1.q) this.f2806d;
        }
    }
}
