package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esd extends jkm implements jkn {
    public static final esd a;
    public int b;
    public lgv c;
    private byte d = 2;

    static {
        esd esdVar = new esd();
        a = esdVar;
        jkp.I(esd.class, esdVar);
    }

    private esd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new esd();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(esd.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
