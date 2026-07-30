package D6;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class E implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final D f443d;

    static {
        T6.i iVar = T6.i.f2618l;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        T6.f fVar = new T6.f();
        fVar.F(iVar);
        long length = iVar.f2619d.length;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        f443d = new D(length, fVar);
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E6.c.a(g());
    }

    public abstract u d();

    public abstract T6.h g();
}
