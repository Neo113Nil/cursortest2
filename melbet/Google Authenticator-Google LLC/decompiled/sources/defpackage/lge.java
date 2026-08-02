package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lge extends jkp implements jlm {
    public static final lge a;
    public int b;
    public String c = "";

    static {
        lge lgeVar = new lge();
        a = lgeVar;
        jkp.I(lge.class, lgeVar);
    }

    private lge() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lge();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lge.class);
        }
        throw null;
    }
}
