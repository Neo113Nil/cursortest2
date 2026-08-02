package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsi extends jkp implements jlm {
    public static final gsi a;
    public int b;
    public long c;
    public int d;

    static {
        gsi gsiVar = new gsi();
        a = gsiVar;
        jkp.I(gsi.class, gsiVar);
    }

    private gsi() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new gsi();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gsi.class);
        }
        throw null;
    }
}
