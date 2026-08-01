package m1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3293b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3294c;
    public final z1.h d;

    public /* synthetic */ u(Object obj, long j2, z1.h hVar, int i) {
        this.f3292a = i;
        this.f3294c = obj;
        this.f3293b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n1.b.b(h());
    }

    public final long g() {
        switch (this.f3292a) {
        }
        return this.f3293b;
    }

    public final z1.h h() {
        switch (this.f3292a) {
            case 0:
                return (z1.f) this.d;
            default:
                return (z1.p) this.d;
        }
    }
}
