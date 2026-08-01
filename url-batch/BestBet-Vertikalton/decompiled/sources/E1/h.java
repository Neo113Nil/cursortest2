package E1;

import M1.p;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239a;

    /* renamed from: b, reason: collision with root package name */
    public final long f240b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f241c;
    public final M1.h d;

    public /* synthetic */ h(Object obj, long j2, M1.h hVar, int i) {
        this.f239a = i;
        this.f241c = obj;
        this.f240b = j2;
        this.d = hVar;
    }

    public final long a() {
        switch (this.f239a) {
        }
        return this.f240b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A1.c.b(d());
    }

    public final M1.h d() {
        switch (this.f239a) {
            case 0:
                return (p) this.d;
            default:
                return (M1.f) this.d;
        }
    }
}
