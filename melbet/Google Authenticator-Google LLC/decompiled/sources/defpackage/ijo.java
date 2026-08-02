package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ijo extends jkp implements jlm {
    public static final ijo a;
    public int b;
    public jjd c;
    public jjd d;
    public boolean e;
    public int f;

    static {
        ijo ijoVar = new ijo();
        a = ijoVar;
        jkp.I(ijo.class, ijoVar);
    }

    private ijo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", hrn.o});
        }
        if (i2 == 3) {
            return new ijo();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijo.class);
        }
        throw null;
    }
}
