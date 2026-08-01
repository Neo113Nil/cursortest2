package k1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2909c;
    public final x1.h d;

    public /* synthetic */ v(Object obj, long j2, x1.h hVar, int i) {
        this.f2907a = i;
        this.f2909c = obj;
        this.f2908b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l1.b.b(h());
    }

    public final long f() {
        switch (this.f2907a) {
        }
        return this.f2908b;
    }

    public final x1.h h() {
        switch (this.f2907a) {
            case 0:
                return (x1.f) this.d;
            default:
                return (x1.p) this.d;
        }
    }
}
