package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lcs {
    private final kuk a;
    public final kuk e;
    public final kuk f;

    public lcs() {
        kul kulVar = kul.a;
        this.e = new kuk(this, kulVar);
        this.f = new kuk(this, kulVar);
        this.a = new kuk(null, kulVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r4.e.d(r3, ((defpackage.lcw) r5).a) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0018, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final lcs a() {
        while (true) {
            kuk kukVar = this.f;
            lcs lcsVar = (lcs) kukVar.a;
            lcs lcsVar2 = lcsVar;
            while (true) {
                lcs lcsVar3 = null;
                while (true) {
                    Object obj = lcsVar2.e.a;
                    if (obj == this) {
                        if (lcsVar != lcsVar2 && !kukVar.d(lcsVar, lcsVar2)) {
                        }
                    } else {
                        if (bT()) {
                            return null;
                        }
                        if (!(obj instanceof lcw)) {
                            obj.getClass();
                            lcsVar3 = lcsVar2;
                            lcsVar2 = (lcs) obj;
                        } else {
                            if (lcsVar3 != null) {
                                break;
                            }
                            lcsVar2 = (lcs) lcsVar2.f.a;
                        }
                    }
                }
                lcsVar2 = lcsVar3;
            }
        }
    }

    public boolean bT() {
        return f() instanceof lcw;
    }

    public final Object f() {
        return this.e.a;
    }

    public final lcs g() {
        Object f = f();
        lcw lcwVar = f instanceof lcw ? (lcw) f : null;
        if (lcwVar != null) {
            return lcwVar.a;
        }
        f.getClass();
        return (lcs) f;
    }

    public final lcs h() {
        lcs a = a();
        if (a != null) {
            return a;
        }
        Object obj = this.f.a;
        while (true) {
            lcs lcsVar = (lcs) obj;
            if (!lcsVar.bT()) {
                return lcsVar;
            }
            obj = lcsVar.f.a;
        }
    }

    public final lcw i() {
        kuk kukVar = this.a;
        lcw lcwVar = (lcw) kukVar.a;
        if (lcwVar != null) {
            return lcwVar;
        }
        lcw lcwVar2 = new lcw(this);
        kukVar.b(lcwVar2);
        return lcwVar2;
    }

    public final void j(int i) {
        l(new lcp(i), i);
    }

    public final void k(lcs lcsVar) {
        kuk kukVar;
        lcs lcsVar2;
        do {
            kukVar = lcsVar.f;
            lcsVar2 = (lcs) kukVar.a;
            if (f() != lcsVar) {
                return;
            }
        } while (!kukVar.d(lcsVar2, this));
        if (bT()) {
            lcsVar.a();
        }
    }

    public final boolean l(lcs lcsVar, int i) {
        lcs h;
        do {
            h = h();
            if (h instanceof lcp) {
                return (((lcp) h).a & i) == 0 && h.l(lcsVar, i);
            }
            lcsVar.f.b(h);
            lcsVar.e.b(this);
        } while (!h.e.d(this, lcsVar));
        lcsVar.k(this);
        return true;
    }

    public final void m() {
        Object f;
        lcs lcsVar;
        do {
            f = f();
            if (f instanceof lcw) {
                lcs lcsVar2 = ((lcw) f).a;
                return;
            } else if (f == this) {
                return;
            } else {
                f.getClass();
                lcsVar = (lcs) f;
            }
        } while (!this.e.d(f, lcsVar.i()));
        lcsVar.a();
    }

    public String toString() {
        return new ksr(this) { // from class: lcr
            @Override // defpackage.ksr
            public final Object g() {
                return kvp.a(this.c);
            }
        } + "@" + kvp.b(this);
    }
}
