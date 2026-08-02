package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ang extends anh {
    private final int a;

    public ang(amj amjVar, String str, int i) {
        super(amjVar, str);
        this.a = i;
    }

    @Override // defpackage.amh
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.amh
    public final long b(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final String c(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh, java.lang.AutoCloseable
    public final void close() {
        p();
    }

    @Override // defpackage.amh
    public final String d(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        yi.h(25, "column index out of range");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void f(int i, double d) {
        o();
        yi.h(25, "column index out of range");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void g(int i, long j) {
        o();
        yi.h(25, "column index out of range");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void h(int i) {
        o();
        yi.h(25, "column index out of range");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void i(int i, String str) {
        str.getClass();
        o();
        yi.h(25, "column index out of range");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void j() {
        o();
    }

    @Override // defpackage.amh
    public final boolean k(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final boolean l() {
        int i = this.a - 1;
        if (i == 0) {
            amj amjVar = this.f;
            amjVar.f();
            amjVar.d();
        } else if (i == 1) {
            this.f.d();
        } else if (i == 2) {
            this.f.b();
        } else if (i != 3) {
            amj amjVar2 = this.f;
            if (yj.k() == null || yj.l() == null) {
                ((ams) amjVar2).b();
            } else {
                Method k = yj.k();
                k.getClass();
                Method l = yj.l();
                l.getClass();
                Object invoke = l.invoke(((ams) amjVar2).e, null);
                if (invoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                k.invoke(invoke, 0, null, 0, null);
            }
        } else {
            this.f.c();
        }
        return false;
    }

    @Override // defpackage.amh
    public final byte[] m(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }
}
