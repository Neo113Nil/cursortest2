package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkw extends jkm implements jkn {
    public static final dkw a;
    public int b;
    public int c;
    private byte e = 2;
    public jkt d = jkq.a;

    static {
        dkw dkwVar = new dkw();
        a = dkwVar;
        jkp.I(dkw.class, dkwVar);
    }

    private dkw() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"b", "c", hrn.a, "d"});
        }
        if (i2 == 3) {
            return new dkw();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dkw.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
