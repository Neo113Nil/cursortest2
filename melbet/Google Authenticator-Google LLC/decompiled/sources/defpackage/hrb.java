package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrb extends jkp implements jlm {
    public static final hrb a;
    public int b;
    public int c;

    static {
        hrb hrbVar = new hrb();
        a = hrbVar;
        jkp.I(hrb.class, hrbVar);
    }

    private hrb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", bmw.s});
        }
        if (i2 == 3) {
            return new hrb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrb.class);
        }
        throw null;
    }
}
