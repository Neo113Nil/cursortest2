package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdu implements bdv, bmn {
    private static final wq a = bmp.a(20, new bex(1));
    private final bmq b = new bmq();
    private bdv c;
    private boolean d;
    private boolean e;

    static bdu d(bdv bdvVar) {
        bdu bduVar = (bdu) a.a();
        bduVar.e = false;
        bduVar.d = true;
        bduVar.c = bdvVar;
        return bduVar;
    }

    @Override // defpackage.bdv
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.bmn
    public final bmq bp() {
        return this.b;
    }

    @Override // defpackage.bdv
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.bdv
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (this.d) {
            return;
        }
        this.c.e();
        this.c = null;
        a.b(this);
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
