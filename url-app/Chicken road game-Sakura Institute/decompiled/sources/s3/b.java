package s3;

import kotlin.jvm.internal.Intrinsics;
import q3.l;
import z3.C1448f;
import z3.D;
import z3.H;
import z3.n;
import z3.x;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f10596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10597e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f10598i;

    public b(l lVar) {
        this.f10598i = lVar;
        this.f10596d = new n(((x) lVar.f9430e).f12040d.c());
    }

    @Override // z3.D
    public final H c() {
        return this.f10596d;
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f10597e) {
            return;
        }
        this.f10597e = true;
        ((x) this.f10598i.f9430e).m("0\r\n\r\n");
        l.i(this.f10598i, this.f10596d);
        this.f10598i.f9426a = 3;
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f10597e) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return;
        }
        l lVar = this.f10598i;
        x xVar = (x) lVar.f9430e;
        if (xVar.f12042i) {
            throw new IllegalStateException("closed");
        }
        xVar.f12041e.z(j4);
        xVar.a();
        x xVar2 = (x) lVar.f9430e;
        xVar2.m("\r\n");
        xVar2.e(source, j4);
        xVar2.m("\r\n");
    }

    @Override // z3.D, java.io.Flushable
    public final synchronized void flush() {
        if (this.f10597e) {
            return;
        }
        ((x) this.f10598i.f9430e).flush();
    }
}
