package s3;

import kotlin.jvm.internal.Intrinsics;
import q3.l;
import z3.C1448f;
import z3.D;
import z3.H;
import z3.n;
import z3.x;

/* loaded from: classes.dex */
public final class e implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f10605d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10606e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f10607i;

    public e(l lVar) {
        this.f10607i = lVar;
        this.f10605d = new n(((x) lVar.f9430e).f12040d.c());
    }

    @Override // z3.D
    public final H c() {
        return this.f10605d;
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10606e) {
            return;
        }
        this.f10606e = true;
        l lVar = this.f10607i;
        l.i(lVar, this.f10605d);
        lVar.f9426a = 3;
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f10606e) {
            throw new IllegalStateException("closed");
        }
        long j5 = source.f11999e;
        byte[] bArr = n3.b.f8558a;
        if (j4 < 0 || 0 > j5 || j5 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((x) this.f10607i.f9430e).e(source, j4);
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        if (this.f10606e) {
            return;
        }
        ((x) this.f10607i.f9430e).flush();
    }
}
