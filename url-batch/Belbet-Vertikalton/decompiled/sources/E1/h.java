package E1;

import M1.p;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312a;

    /* renamed from: b, reason: collision with root package name */
    public final long f313b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f314c;

    /* renamed from: d, reason: collision with root package name */
    public final M1.h f315d;

    public /* synthetic */ h(Object obj, long j, M1.h hVar, int i) {
        this.f312a = i;
        this.f314c = obj;
        this.f313b = j;
        this.f315d = hVar;
    }

    public final long a() {
        switch (this.f312a) {
        }
        return this.f313b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A1.c.b(d());
    }

    public final M1.h d() {
        switch (this.f312a) {
            case 0:
                return (p) this.f315d;
            default:
                return (M1.f) this.f315d;
        }
    }
}
