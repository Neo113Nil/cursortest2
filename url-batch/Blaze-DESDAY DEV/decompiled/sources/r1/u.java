package r1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3539a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3540b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3541c;
    public final E1.h d;

    public /* synthetic */ u(Object obj, long j2, E1.h hVar, int i) {
        this.f3539a = i;
        this.f3541c = obj;
        this.f3540b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s1.b.b(h());
    }

    public final long g() {
        switch (this.f3539a) {
        }
        return this.f3540b;
    }

    public final E1.h h() {
        switch (this.f3539a) {
            case 0:
                return (E1.f) this.d;
            default:
                return (E1.p) this.d;
        }
    }
}
