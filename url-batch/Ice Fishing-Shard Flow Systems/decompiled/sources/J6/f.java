package J6;

import T6.j;
import T6.p;
import T6.u;
import T6.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: d, reason: collision with root package name */
    public final j f1406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1407e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f1408i;

    public f(h hVar) {
        this.f1408i = hVar;
        this.f1406d = new j(((p) hVar.f1413c.f332l).f2637d.b());
    }

    @Override // T6.u
    public final y b() {
        return this.f1406d;
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1407e) {
            return;
        }
        this.f1407e = true;
        j jVar = this.f1406d;
        h hVar = this.f1408i;
        h.k(hVar, jVar);
        hVar.f1414d = 3;
    }

    @Override // T6.u, java.io.Flushable
    public final void flush() {
        if (this.f1407e) {
            return;
        }
        ((p) this.f1408i.f1413c.f332l).flush();
    }

    @Override // T6.u
    public final void x(long j, T6.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f1407e) {
            throw new IllegalStateException("closed");
        }
        long j7 = source.f2617e;
        byte[] bArr = E6.c.f709a;
        if (j >= 0 && 0 <= j7 && j7 >= j) {
            ((p) this.f1408i.f1413c.f332l).x(j, source);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j7 + ", offset=0, count=0");
    }
}
