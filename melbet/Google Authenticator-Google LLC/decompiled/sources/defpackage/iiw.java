package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiw extends jkp implements jlm {
    public static final iiw a;
    public int b;
    public int c;
    public jli d = jli.a;

    static {
        iiw iiwVar = new iiw();
        a = iiwVar;
        jkp.I(iiw.class, iiwVar);
    }

    private iiw() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jmr jmrVar = jmr.STRING;
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", new ikk(jmrVar, "", jmrVar, "")});
        }
        if (i2 == 3) {
            return new iiw();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iiw.class);
        }
        throw null;
    }

    public final jli b() {
        jli jliVar = this.d;
        if (!jliVar.b) {
            this.d = jliVar.a();
        }
        return this.d;
    }
}
