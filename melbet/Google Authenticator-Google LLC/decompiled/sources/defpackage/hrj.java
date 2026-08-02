package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrj extends jkp implements jlm {
    public static final hrj a;
    public int b;
    public long e;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public jkx f = jlu.a;

    static {
        hrj hrjVar = new hrj();
        a = hrjVar;
        jkp.I(hrj.class, hrjVar);
    }

    private hrj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", hri.class});
        }
        if (i2 == 3) {
            return new hrj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrj.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
