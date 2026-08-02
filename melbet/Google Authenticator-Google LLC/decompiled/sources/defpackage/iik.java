package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iik extends jkp implements jlm {
    public static final iik a;
    public int b;
    public String c = "";
    public iij d;

    static {
        iik iikVar = new iik();
        a = iikVar;
        jkp.I(iik.class, iikVar);
    }

    private iik() {
        jjq jjqVar = jjq.d;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new iik();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iik.class);
        }
        throw null;
    }
}
