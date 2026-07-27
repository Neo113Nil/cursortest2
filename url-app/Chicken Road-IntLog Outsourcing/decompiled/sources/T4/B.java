package T4;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class B implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final A f2804a;

    static {
        j5.i iVar = j5.i.f10496d;
        kotlin.jvm.internal.i.e(iVar, "<this>");
        j5.f fVar = new j5.f();
        fVar.G(iVar);
        f2804a = new A(null, iVar.f10497a.length, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] a() {
        long b6 = b();
        if (b6 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + b6);
        }
        j5.h g6 = g();
        byte[] th = null;
        try {
            byte[] l2 = g6.l();
            try {
                g6.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = l2;
        } catch (Throwable th3) {
            th = th3;
            if (g6 != null) {
                try {
                    g6.close();
                } catch (Throwable th4) {
                    K1.b.C(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (b6 == -1 || b6 == length) {
            return th;
        }
        throw new IOException("Content-Length (" + b6 + ") and stream length (" + length + ") disagree");
    }

    public abstract long b();

    public abstract s c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        U4.c.b(g());
    }

    public abstract j5.h g();
}
