package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lft extends jkp implements jlm {
    public static final lft a;
    public int b;
    public lfw c;

    static {
        lft lftVar = new lft();
        a = lftVar;
        jkp.I(lft.class, lftVar);
    }

    private lft() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lft();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lft.class);
        }
        throw null;
    }
}
