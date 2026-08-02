package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lff extends jkp implements jlm {
    public static final lff a;
    public int b;
    public int c;

    static {
        lff lffVar = new lff();
        a = lffVar;
        jkp.I(lff.class, lffVar);
    }

    private lff() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lff();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lff.class);
        }
        throw null;
    }
}
