package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2807a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2808b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2809c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.h f2810d;

    public /* synthetic */ z(Object obj, long j2, v1.h hVar, int i) {
        this.f2807a = i;
        this.f2809c = obj;
        this.f2808b = j2;
        this.f2810d = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.b.b(h());
    }

    public final long g() {
        switch (this.f2807a) {
        }
        return this.f2808b;
    }

    public final v1.h h() {
        switch (this.f2807a) {
            case 0:
                return (v1.f) this.f2810d;
            default:
                return (v1.q) this.f2810d;
        }
    }
}
