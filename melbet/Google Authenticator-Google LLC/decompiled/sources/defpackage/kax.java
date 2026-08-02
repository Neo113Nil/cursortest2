package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kax extends ixf {
    private final jxr a;
    private final ixf b;

    public kax(ixf ixfVar, jxr jxrVar) {
        this();
        this.b = ixfVar;
        this.a = jxrVar;
    }

    @Override // defpackage.ixf
    public final void a() {
        jxr a = this.a.a();
        try {
            this.b.a();
        } finally {
            this.a.f(a);
        }
    }

    @Override // defpackage.ixf
    public final void b() {
        jxr a = this.a.a();
        try {
            this.b.b();
        } finally {
            this.a.f(a);
        }
    }

    @Override // defpackage.ixf
    public final void c() {
        jxr a = this.a.a();
        try {
            this.b.c();
        } finally {
            this.a.f(a);
        }
    }

    @Override // defpackage.ixf
    public final void d(Object obj) {
        jxr a = this.a.a();
        try {
            this.b.d(obj);
        } finally {
            this.a.f(a);
        }
    }

    @Override // defpackage.ixf
    public final void e() {
        jxr a = this.a.a();
        try {
            this.b.e();
        } finally {
            this.a.f(a);
        }
    }

    protected final ixf l() {
        return this.b;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", l());
        return T.toString();
    }

    public kax() {
    }
}
