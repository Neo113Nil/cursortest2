package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hra extends jkp implements jlm {
    public static final hra a;
    public int b;
    public int c;

    static {
        hra hraVar = new hra();
        a = hraVar;
        jkp.I(hra.class, hraVar);
    }

    private hra() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", bmw.r});
        }
        if (i2 == 3) {
            return new hra();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hra.class);
        }
        throw null;
    }
}
