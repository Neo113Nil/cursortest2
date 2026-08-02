package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgh extends jkp implements jlm {
    public static final lgh a;
    public int b;
    public int c;
    public int d;

    static {
        lgh lghVar = new lgh();
        a = lghVar;
        jkp.I(lgh.class, lghVar);
    }

    private lgh() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", lgb.d, "d"});
        }
        if (i2 == 3) {
            return new lgh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgh.class);
        }
        throw null;
    }
}
