package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epe extends jkp implements jlm {
    public static final epe a;
    public int b;
    public String c = "";
    private int d;

    static {
        epe epeVar = new epe();
        a = epeVar;
        jkp.I(epe.class, epeVar);
    }

    private epe() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"d", "b", bmw.i, "c"});
        }
        if (i2 == 3) {
            return new epe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(epe.class);
        }
        throw null;
    }
}
