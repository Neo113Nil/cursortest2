package G3;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1047b;

    /* renamed from: c, reason: collision with root package name */
    public final T3.i f1048c;

    public /* synthetic */ z(long j4, T3.i iVar, int i4) {
        this.f1046a = i4;
        this.f1047b = j4;
        this.f1048c = iVar;
    }

    public final long a() {
        switch (this.f1046a) {
        }
        return this.f1047b;
    }

    public final T3.i b() {
        switch (this.f1046a) {
            case 0:
                return (T3.g) this.f1048c;
            default:
                return (T3.p) this.f1048c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        H3.b.c(b());
    }
}
