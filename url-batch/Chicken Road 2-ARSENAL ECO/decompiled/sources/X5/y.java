package X5;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class y implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final x f3078f;

    static {
        n6.i iVar = n6.i.f5525i;
        kotlin.jvm.internal.i.e(iVar, "<this>");
        n6.f fVar = new n6.f();
        fVar.G(iVar);
        f3078f = new x(iVar.f5526f.length, fVar);
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Y5.c.a(e());
    }

    public abstract q d();

    public abstract n6.h e();
}
