package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frr extends jkp implements jlm {
    public static final frr a;
    public boolean b;
    private int c;

    static {
        frr frrVar = new frr();
        a = frrVar;
        jkp.I(frr.class, frrVar);
    }

    private frr() {
        jlu jluVar = jlu.a;
        jkq jkqVar = jkq.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0005", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new frr();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(frr.class);
        }
        throw null;
    }
}
