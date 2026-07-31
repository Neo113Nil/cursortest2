package b1;

import w0.b0;
import w0.c0;
import w0.e0;
import w0.n;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: f, reason: collision with root package name */
    private final long f1622f;

    /* renamed from: g, reason: collision with root package name */
    private final n f1623g;

    class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f1624a;

        a(b0 b0Var) {
            this.f1624a = b0Var;
        }

        @Override // w0.b0
        public boolean g() {
            return this.f1624a.g();
        }

        @Override // w0.b0
        public b0.a i(long j7) {
            b0.a i7 = this.f1624a.i(j7);
            c0 c0Var = i7.f22874a;
            c0 c0Var2 = new c0(c0Var.f22879a, c0Var.f22880b + d.this.f1622f);
            c0 c0Var3 = i7.f22875b;
            return new b0.a(c0Var2, new c0(c0Var3.f22879a, c0Var3.f22880b + d.this.f1622f));
        }

        @Override // w0.b0
        public long j() {
            return this.f1624a.j();
        }
    }

    public d(long j7, n nVar) {
        this.f1622f = j7;
        this.f1623g = nVar;
    }

    @Override // w0.n
    public e0 d(int i7, int i8) {
        return this.f1623g.d(i7, i8);
    }

    @Override // w0.n
    public void i(b0 b0Var) {
        this.f1623g.i(new a(b0Var));
    }

    @Override // w0.n
    public void j() {
        this.f1623g.j();
    }
}
