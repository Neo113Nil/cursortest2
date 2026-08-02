package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsk extends jkp implements jlm {
    public static final gsk a;
    public int b;
    public gsj c;
    public gsi d;

    static {
        gsk gskVar = new gsk();
        a = gskVar;
        jkp.I(gsk.class, gskVar);
    }

    private gsk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new gsk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gsk.class);
        }
        throw null;
    }
}
