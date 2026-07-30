package e8;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class y implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final x f37539n;

    static {
        u8.h hVar = u8.h.f41278w;
        kotlin.jvm.internal.h.e(hVar, "<this>");
        u8.e eVar = new u8.e();
        eVar.K(hVar);
        f37539n = new x(hVar.f41279n.length, eVar);
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f8.c.a(z());
    }

    public abstract q j();

    public abstract u8.g z();
}
