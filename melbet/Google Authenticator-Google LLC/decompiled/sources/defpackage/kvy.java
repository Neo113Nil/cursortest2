package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvy extends ldp {
    public int e;

    public kvy(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void G(Throwable th) {
        kvp.i(s().bU(), new kvn(a.ab(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object o();

    public Throwable r(Object obj) {
        kve kveVar = obj instanceof kve ? (kve) obj : null;
        if (kveVar != null) {
            return kveVar.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kqj, kqx] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = kvo.a;
        try {
            lcc lccVar = (lcc) s();
            ?? r1 = lccVar.b;
            Object obj = lccVar.d;
            kqn bU = r1.bU();
            Object b = ldd.b(bU, obj);
            kwu kwuVar = null;
            kya c = b != ldd.a ? kvi.c(r1, bU, b) : null;
            try {
                kqn bU2 = r1.bU();
                Object o = o();
                Throwable r = r(o);
                if (r == null && ixh.e(this.e)) {
                    kwuVar = (kwu) bU2.get(kwu.d);
                }
                if (kwuVar != null && !kwuVar.t()) {
                    Throwable p = kwuVar.p();
                    E(p);
                    if (kvo.b) {
                        p = lda.a(p, r1);
                    }
                    r1.ca(ixc.X(p));
                } else if (r != null) {
                    r1.ca(ixc.X(r));
                } else {
                    r1.ca(n(o));
                }
                if (c != null && !c.S()) {
                    return;
                }
                ldd.c(bU, b);
            } catch (Throwable th) {
                if (c == null || c.S()) {
                    ldd.c(bU, b);
                }
                throw th;
            }
        } catch (kvw e) {
            kvp.i(s().bU(), e.a);
        } catch (Throwable th2) {
            G(th2);
        }
    }

    public abstract kqj s();

    public void E(Throwable th) {
    }

    public Object n(Object obj) {
        return obj;
    }
}
