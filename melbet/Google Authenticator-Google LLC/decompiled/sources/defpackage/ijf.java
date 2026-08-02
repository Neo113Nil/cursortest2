package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijf extends jkp implements jlm {
    public static final ijf a;
    public int b;
    private int c;

    static {
        ijf ijfVar = new ijf();
        a = ijfVar;
        jkp.I(ijf.class, ijfVar);
    }

    private ijf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", hrn.s});
        }
        if (i2 == 3) {
            return new ijf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijf.class);
        }
        throw null;
    }
}
