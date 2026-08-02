package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijd extends jkp implements jlm {
    public static final ijd a;
    public int b;
    private int c;

    static {
        ijd ijdVar = new ijd();
        a = ijdVar;
        jkp.I(ijd.class, ijdVar);
    }

    private ijd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", hrn.m});
        }
        if (i2 == 3) {
            return new ijd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijd.class);
        }
        throw null;
    }
}
