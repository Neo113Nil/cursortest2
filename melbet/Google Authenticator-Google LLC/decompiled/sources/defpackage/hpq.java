package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpq extends jkp implements jlm {
    public static final hpq a;
    public String b = "";
    private int c;

    static {
        hpq hpqVar = new hpq();
        a = hpqVar;
        jkp.I(hpq.class, hpqVar);
    }

    private hpq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new hpq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hpq.class);
        }
        throw null;
    }
}
