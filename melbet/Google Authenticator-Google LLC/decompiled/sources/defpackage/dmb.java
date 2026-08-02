package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmb extends jkp implements jlm {
    public static final dmb a;
    public int b;
    public String c = "";
    public boolean d;

    static {
        dmb dmbVar = new dmb();
        a = dmbVar;
        jkp.I(dmb.class, dmbVar);
    }

    private dmb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new dmb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dmb.class);
        }
        throw null;
    }
}
