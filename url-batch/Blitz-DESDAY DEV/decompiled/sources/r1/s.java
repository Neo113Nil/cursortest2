package r1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3556b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3557c;
    public final E1.h d;

    public /* synthetic */ s(Object obj, long j2, E1.h hVar, int i) {
        this.f3555a = i;
        this.f3557c = obj;
        this.f3556b = j2;
        this.d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s1.b.b(h());
    }

    public final long g() {
        switch (this.f3555a) {
        }
        return this.f3556b;
    }

    public final E1.h h() {
        switch (this.f3555a) {
            case 0:
                return (E1.f) this.d;
            default:
                return (E1.p) this.d;
        }
    }
}
