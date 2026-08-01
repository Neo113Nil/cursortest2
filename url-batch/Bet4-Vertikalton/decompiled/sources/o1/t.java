package o1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3393a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3394b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3395c;
    public final B1.h d;

    public /* synthetic */ t(Object obj, long j2, B1.h hVar, int i) {
        this.f3393a = i;
        this.f3395c = obj;
        this.f3394b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p1.b.b(h());
    }

    public final long g() {
        switch (this.f3393a) {
        }
        return this.f3394b;
    }

    public final B1.h h() {
        switch (this.f3393a) {
            case 0:
                return (B1.f) this.d;
            default:
                return (B1.p) this.d;
        }
    }
}
