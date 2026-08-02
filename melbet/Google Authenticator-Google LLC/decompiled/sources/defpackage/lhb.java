package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhb extends jkp implements jlm {
    public static final lhb a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        lhb lhbVar = new lhb();
        a = lhbVar;
        jkp.I(lhb.class, lhbVar);
    }

    private lhb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lhb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lhb.class);
        }
        throw null;
    }
}
