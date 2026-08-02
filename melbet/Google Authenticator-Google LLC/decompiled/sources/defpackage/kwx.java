package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwx extends lcs implements kwc, kwq {
    public kxb d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    @Override // defpackage.kwq
    public final kxg bP() {
        return null;
    }

    @Override // defpackage.kwc
    public final void bQ() {
        Object B;
        kxb e = e();
        do {
            B = e.B();
            if (B instanceof kwx) {
                if (B != this) {
                    return;
                }
            } else {
                if (!(B instanceof kxa)) {
                    if (!(B instanceof kwq) || ((kwq) B).bP() == null) {
                        return;
                    }
                    m();
                    return;
                }
                if (!kxc.a) {
                    kxg kxgVar = ((kxa) B).a;
                    m();
                    return;
                }
                while (true) {
                    Object f = f();
                    if ((f instanceof lcw) || ksp.b(f, this)) {
                        return;
                    }
                    if (f instanceof lcs) {
                        if (this.e.d(f, ((lcs) f).i())) {
                            return;
                        }
                    }
                }
            }
        } while (!e.e.d(B, kxc.h));
    }

    @Override // defpackage.kwq
    public final boolean bR() {
        return true;
    }

    public final kxb e() {
        kxb kxbVar = this.d;
        if (kxbVar != null) {
            return kxbVar;
        }
        ksp.a("job");
        return null;
    }

    @Override // defpackage.lcs
    public final String toString() {
        return kvp.a(this) + "@" + kvp.b(this) + "[job@" + kvp.b(e()) + "]";
    }
}
