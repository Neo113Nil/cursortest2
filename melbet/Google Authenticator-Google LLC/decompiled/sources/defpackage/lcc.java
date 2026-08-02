package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcc extends kvy implements kqx, kqj {
    public final kvj a;
    public final kqj b;
    public Object c;
    public final Object d;
    public final kuk f;

    public lcc(kvj kvjVar, kqj kqjVar) {
        super(-1);
        this.a = kvjVar;
        this.b = kqjVar;
        this.c = lcd.a;
        this.d = ldd.a(bU());
        this.f = new kuk(null, kul.a);
    }

    public final void a(kqn kqnVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(kqnVar, this);
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return this.b.bU();
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        Object b = ixg.b(obj);
        kvj kvjVar = this.a;
        if (lcd.c(kvjVar, bU())) {
            this.c = b;
            this.e = 0;
            lcd.b(kvjVar, bU(), this);
            return;
        }
        boolean z = kvo.a;
        ThreadLocal threadLocal = kxv.a;
        kwf a = kxv.a();
        if (a.p()) {
            this.c = b;
            this.e = 0;
            a.n(this);
            return;
        }
        a.o(true);
        try {
            kqn bU = bU();
            Object b2 = ldd.b(bU, this.d);
            try {
                this.b.ca(obj);
                while (a.r()) {
                }
            } finally {
                ldd.c(bU, b2);
            }
        } catch (Throwable th) {
            try {
                G(th);
            } finally {
                a.m(true);
            }
        }
    }

    @Override // defpackage.kqx
    public final StackTraceElement f() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kqj, kqx] */
    @Override // defpackage.kqx
    public final kqx g() {
        return this.b;
    }

    @Override // defpackage.kvy
    public final Object o() {
        Object obj = this.c;
        boolean z = kvo.a;
        this.c = lcd.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + kvp.c(this.b) + "]";
    }

    @Override // defpackage.kvy
    public final kqj s() {
        return this;
    }
}
