package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blh implements bld, blb {
    public volatile blb a;
    public volatile blb b;
    private final bld c;
    private final Object d;
    private blc e;
    private blc f;
    private boolean g;

    public blh(Object obj, bld bldVar) {
        blc blcVar = blc.CLEARED;
        this.e = blcVar;
        this.f = blcVar;
        this.d = obj;
        this.c = bldVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [bld] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.bld
    public final bld a() {
        ?? r2;
        synchronized (this.d) {
            bld bldVar = this.c;
            this = this;
            if (bldVar != null) {
                r2 = bldVar.a();
            }
        }
        return r2;
    }

    @Override // defpackage.blb
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != blc.SUCCESS) {
                    blc blcVar = this.f;
                    blc blcVar2 = blc.RUNNING;
                    if (blcVar != blcVar2) {
                        this.f = blcVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    blc blcVar3 = this.e;
                    blc blcVar4 = blc.RUNNING;
                    if (blcVar3 != blcVar4) {
                        this.e = blcVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.blb
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            blc blcVar = blc.CLEARED;
            this.e = blcVar;
            this.f = blcVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.bld
    public final void d(blb blbVar) {
        synchronized (this.d) {
            if (!blbVar.equals(this.a)) {
                this.f = blc.FAILED;
                return;
            }
            this.e = blc.FAILED;
            bld bldVar = this.c;
            if (bldVar != null) {
                bldVar.d(this);
            }
        }
    }

    @Override // defpackage.bld
    public final void e(blb blbVar) {
        synchronized (this.d) {
            if (blbVar.equals(this.b)) {
                this.f = blc.SUCCESS;
                return;
            }
            this.e = blc.SUCCESS;
            bld bldVar = this.c;
            if (bldVar != null) {
                bldVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.blb
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = blc.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = blc.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.bld
    public final boolean g(blb blbVar) {
        boolean z;
        synchronized (this.d) {
            bld bldVar = this.c;
            z = false;
            if ((bldVar == null || bldVar.g(this)) && blbVar.equals(this.a) && this.e != blc.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bld
    public final boolean h(blb blbVar) {
        boolean z;
        synchronized (this.d) {
            bld bldVar = this.c;
            z = false;
            if ((bldVar == null || bldVar.h(this)) && blbVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bld
    public final boolean i(blb blbVar) {
        boolean z;
        synchronized (this.d) {
            bld bldVar = this.c;
            z = false;
            if ((bldVar == null || bldVar.i(this)) && (blbVar.equals(this.a) || this.e != blc.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bld, defpackage.blb
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == blc.CLEARED;
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == blc.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean m(blb blbVar) {
        if (blbVar instanceof blh) {
            blh blhVar = (blh) blbVar;
            if (this.a != null ? this.a.m(blhVar.a) : blhVar.a == null) {
                if (this.b == null) {
                    if (blhVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(blhVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.blb
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == blc.RUNNING;
        }
        return z;
    }
}
