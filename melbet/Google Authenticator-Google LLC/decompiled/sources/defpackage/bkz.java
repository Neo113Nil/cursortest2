package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkz implements bld, blb {
    public volatile blb a;
    public volatile blb b;
    private final Object c;
    private final bld d;
    private blc e;
    private blc f;

    public bkz(Object obj, bld bldVar) {
        blc blcVar = blc.CLEARED;
        this.e = blcVar;
        this.f = blcVar;
        this.c = obj;
        this.d = bldVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [bld] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.bld
    public final bld a() {
        ?? r2;
        synchronized (this.c) {
            bld bldVar = this.d;
            this = this;
            if (bldVar != null) {
                r2 = bldVar.a();
            }
        }
        return r2;
    }

    @Override // defpackage.blb
    public final void b() {
        synchronized (this.c) {
            blc blcVar = this.e;
            blc blcVar2 = blc.RUNNING;
            if (blcVar != blcVar2) {
                this.e = blcVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.blb
    public final void c() {
        synchronized (this.c) {
            blc blcVar = blc.CLEARED;
            this.e = blcVar;
            this.a.c();
            if (this.f != blcVar) {
                this.f = blcVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.bld
    public final void d(blb blbVar) {
        synchronized (this.c) {
            if (blbVar.equals(this.b)) {
                this.f = blc.FAILED;
                bld bldVar = this.d;
                if (bldVar != null) {
                    bldVar.d(this);
                }
                return;
            }
            this.e = blc.FAILED;
            blc blcVar = this.f;
            blc blcVar2 = blc.RUNNING;
            if (blcVar != blcVar2) {
                this.f = blcVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.bld
    public final void e(blb blbVar) {
        synchronized (this.c) {
            if (blbVar.equals(this.a)) {
                this.e = blc.SUCCESS;
            } else if (blbVar.equals(this.b)) {
                this.f = blc.SUCCESS;
            }
            bld bldVar = this.d;
            if (bldVar != null) {
                bldVar.e(this);
            }
        }
    }

    @Override // defpackage.blb
    public final void f() {
        synchronized (this.c) {
            blc blcVar = this.e;
            blc blcVar2 = blc.RUNNING;
            if (blcVar == blcVar2) {
                this.e = blc.PAUSED;
                this.a.f();
            }
            if (this.f == blcVar2) {
                this.f = blc.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.bld
    public final boolean g(blb blbVar) {
        boolean z;
        synchronized (this.c) {
            bld bldVar = this.d;
            z = false;
            if ((bldVar == null || bldVar.g(this)) && blbVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r5 != false) goto L20;
     */
    @Override // defpackage.bld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(blb blbVar) {
        boolean z;
        boolean z2;
        synchronized (this.c) {
            bld bldVar = this.d;
            z = false;
            if (bldVar == null || bldVar.h(this)) {
                blc blcVar = this.e;
                blc blcVar2 = blc.FAILED;
                if (blcVar != blcVar2) {
                    z2 = blbVar.equals(this.a);
                } else {
                    if (blbVar.equals(this.b)) {
                        blc blcVar3 = this.f;
                        if (blcVar3 == blc.SUCCESS) {
                            z2 = true;
                        } else if (blcVar3 == blcVar2) {
                            z = true;
                        }
                    }
                    z2 = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.bld
    public final boolean i(blb blbVar) {
        boolean z;
        synchronized (this.c) {
            bld bldVar = this.d;
            z = true;
            if (bldVar != null && !bldVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bld, defpackage.blb
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            blc blcVar = this.e;
            blc blcVar2 = blc.CLEARED;
            z = false;
            if (blcVar == blcVar2 && this.f == blcVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            blc blcVar = this.e;
            blc blcVar2 = blc.SUCCESS;
            z = true;
            if (blcVar != blcVar2 && this.f != blcVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean m(blb blbVar) {
        if (blbVar instanceof bkz) {
            bkz bkzVar = (bkz) blbVar;
            if (this.a.m(bkzVar.a) && this.b.m(bkzVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.blb
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            blc blcVar = this.e;
            blc blcVar2 = blc.RUNNING;
            z = true;
            if (blcVar != blcVar2 && this.f != blcVar2) {
                z = false;
            }
        }
        return z;
    }
}
