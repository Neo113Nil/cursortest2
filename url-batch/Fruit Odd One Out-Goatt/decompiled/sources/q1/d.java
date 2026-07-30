package q1;

import k1.d0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final d f1111e;

    /* renamed from: d, reason: collision with root package name */
    public b f1112d;

    static {
        int i2 = i.f1119c;
        int i3 = i.f1120d;
        long j2 = i.f1121e;
        String str = i.f1117a;
        d dVar = new d();
        dVar.f1112d = new b(i2, i3, j2, str);
        f1111e = dVar;
    }

    @Override // k1.p
    public final void b(v0.h hVar, Runnable runnable) {
        this.f1112d.b(runnable, i.f1123g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // k1.p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
