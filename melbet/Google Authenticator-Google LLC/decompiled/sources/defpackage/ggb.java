package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggb {
    public byte a;
    public Object b;
    private boolean c;
    private Object d;

    public final ggc a() {
        Object obj;
        Object obj2;
        if (this.a == 1 && (obj = this.b) != null && (obj2 = this.d) != null) {
            return new ggc((jjq) obj, (gga) obj2, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" data");
        }
        if (this.d == null) {
            sb.append(" type");
        }
        if (this.a == 0) {
            sb.append(" containsPii");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    public final void c(jjq jjqVar) {
        if (jjqVar == null) {
            throw new NullPointerException("Null data");
        }
        this.b = jjqVar;
    }

    public final void d(gga ggaVar) {
        if (ggaVar == null) {
            throw new NullPointerException("Null type");
        }
        this.d = ggaVar;
    }

    public final ftt e() {
        Object obj = this.d;
        if (obj != null) {
            this.b = ((heg) obj).g();
        } else if (this.b == null) {
            int i = hel.d;
            this.b = his.a;
        }
        if (this.a == 1) {
            return new ftt(this.c, (hel) this.b);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    public final void f(Class cls) {
        if (this.d == null) {
            int i = hel.d;
            this.d = new heg(4);
        }
        ((heg) this.d).h(cls);
    }

    public final void g(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public final chy h() {
        Object obj;
        if (this.a == 3 && (obj = this.d) != null) {
            return new chy((String) obj, null, this.b, this.c, false);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" accountType");
        }
        if ((this.a & 1) == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        if ((this.a & 2) == 0) {
            sb.append(" includeTransientAccounts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountType");
        }
        this.d = str;
    }

    public final void j(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 1);
    }
}
