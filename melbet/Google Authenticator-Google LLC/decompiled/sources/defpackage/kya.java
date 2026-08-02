package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kya extends lcy {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kya(kqn kqnVar, kqj kqjVar) {
        super(kqnVar.get(r0) == null ? kqnVar.plus(r0) : kqnVar, kqjVar);
        kyb kybVar = kyb.a;
        this.b = new ThreadLocal();
        if (kqjVar.bU().get(kqk.b) instanceof kvj) {
            return;
        }
        Object b = ldd.b(kqnVar, null);
        ldd.c(kqnVar, b);
        R(kqnVar, b);
    }

    private final void T() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            kol kolVar = (kol) threadLocal.get();
            if (kolVar != null) {
                ldd.c((kqn) kolVar.a, kolVar.b);
            }
            threadLocal.remove();
        }
    }

    public final void R(kqn kqnVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new kol(kqnVar, obj));
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.lcy, defpackage.kum
    protected final void bX(Object obj) {
        T();
        kqj kqjVar = this.c;
        Object a = ixg.a(obj, kqjVar);
        kqn bU = kqjVar.bU();
        Object b = ldd.b(bU, null);
        kya c = b != ldd.a ? kvi.c(kqjVar, bU, b) : null;
        try {
            kqjVar.ca(a);
            if (c == null || c.S()) {
                ldd.c(bU, b);
            }
        } catch (Throwable th) {
            if (c == null || c.S()) {
                ldd.c(bU, b);
            }
            throw th;
        }
    }

    @Override // defpackage.lcy
    public final void m() {
        T();
    }
}
