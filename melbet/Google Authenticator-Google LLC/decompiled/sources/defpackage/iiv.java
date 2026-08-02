package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiv extends jkp implements jlm {
    public static final iiv a;
    public int b;
    public int c;
    public iit d;

    static {
        iiv iivVar = new iiv();
        a = iivVar;
        jkp.I(iiv.class, iivVar);
    }

    private iiv() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0003", new Object[]{"b", "c", iig.a, "d"});
        }
        if (i2 == 3) {
            return new iiv();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iiv.class);
        }
        throw null;
    }
}
