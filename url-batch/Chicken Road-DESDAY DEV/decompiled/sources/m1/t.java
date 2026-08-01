package m1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3261c;
    public final z1.h d;

    public /* synthetic */ t(Object obj, long j2, z1.h hVar, int i) {
        this.f3259a = i;
        this.f3261c = obj;
        this.f3260b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n1.b.b(h());
    }

    public final long g() {
        switch (this.f3259a) {
        }
        return this.f3260b;
    }

    public final z1.h h() {
        switch (this.f3259a) {
            case 0:
                return (z1.f) this.d;
            default:
                return (z1.p) this.d;
        }
    }
}
