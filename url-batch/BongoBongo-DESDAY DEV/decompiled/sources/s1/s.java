package s1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3713a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3714b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3715c;
    public final F1.h d;

    public /* synthetic */ s(Object obj, long j2, F1.h hVar, int i) {
        this.f3713a = i;
        this.f3715c = obj;
        this.f3714b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t1.b.b(h());
    }

    public final long g() {
        switch (this.f3713a) {
        }
        return this.f3714b;
    }

    public final F1.h h() {
        switch (this.f3713a) {
            case 0:
                return (F1.f) this.d;
            default:
                return (F1.p) this.d;
        }
    }
}
