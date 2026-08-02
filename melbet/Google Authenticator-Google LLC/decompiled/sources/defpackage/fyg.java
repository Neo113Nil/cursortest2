package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyg extends jkp implements jlm {
    public static final fyg a;
    public jli b = jli.a;

    static {
        fyg fygVar = new fyg();
        a = fygVar;
        jkp.I(fyg.class, fygVar);
    }

    private fyg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ikk(jmr.STRING, "", jmr.INT32, 0)});
        }
        if (i2 == 3) {
            return new fyg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fyg.class);
        }
        throw null;
    }

    public final jli b() {
        jli jliVar = this.b;
        if (!jliVar.b) {
            this.b = jliVar.a();
        }
        return this.b;
    }
}
