package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvh extends jkp implements jlm {
    public static final cvh a;
    public jli b;
    private jli c;

    static {
        cvh cvhVar = new cvh();
        a = cvhVar;
        jkp.I(cvh.class, cvhVar);
    }

    private cvh() {
        jli jliVar = jli.a;
        this.b = jliVar;
        this.c = jliVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jmr jmrVar = jmr.STRING;
            return new jlv(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"b", new ikk(jmrVar, "", jmr.MESSAGE, cvg.a), "c", new ikk(jmrVar, "", jmr.BOOL, false)});
        }
        if (i2 == 3) {
            return new cvh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cvh.class);
        }
        throw null;
    }
}
