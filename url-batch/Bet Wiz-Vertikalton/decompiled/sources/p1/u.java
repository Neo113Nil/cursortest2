package p1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3439a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3440b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3441c;
    public final C1.h d;

    public /* synthetic */ u(Object obj, long j2, C1.h hVar, int i) {
        this.f3439a = i;
        this.f3441c = obj;
        this.f3440b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q1.b.b(h());
    }

    public final long g() {
        switch (this.f3439a) {
        }
        return this.f3440b;
    }

    public final C1.h h() {
        switch (this.f3439a) {
            case 0:
                return (C1.f) this.d;
            default:
                return (C1.p) this.d;
        }
    }
}
