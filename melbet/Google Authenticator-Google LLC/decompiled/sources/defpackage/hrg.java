package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrg extends jkp implements jlm {
    public static final hrg a;
    public int b;
    public long c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        hrg hrgVar = new hrg();
        a = hrgVar;
        jkp.I(hrg.class, hrgVar);
    }

    private hrg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new hrg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrg.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
