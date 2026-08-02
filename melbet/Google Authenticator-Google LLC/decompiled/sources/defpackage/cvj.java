package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvj extends jkp implements jlm {
    public static final cvj a;
    public jli b = jli.a;

    static {
        cvj cvjVar = new cvj();
        a = cvjVar;
        jkp.I(cvj.class, cvjVar);
    }

    private cvj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ikk(jmr.STRING, "", jmr.MESSAGE, cvi.a)});
        }
        if (i2 == 3) {
            return new cvj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cvj.class);
        }
        throw null;
    }
}
