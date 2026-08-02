package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiz extends jkp implements jlm {
    public static final iiz a;
    public ija b;
    public iiy c;
    private int d;

    static {
        iiz iizVar = new iiz();
        a = iizVar;
        jkp.I(iiz.class, iizVar);
    }

    private iiz() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new iiz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iiz.class);
        }
        throw null;
    }
}
