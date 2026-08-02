package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmi extends jkp implements jlm {
    public static final dmi a;
    public int b;
    public int c = 250;
    public dmg d;
    private int e;

    static {
        dmi dmiVar = new dmi();
        a = dmiVar;
        jkp.I(dmi.class, dmiVar);
    }

    private dmi() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"e", "b", bmw.g, "c", "d"});
        }
        if (i2 == 3) {
            return new dmi();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dmi.class);
        }
        throw null;
    }
}
