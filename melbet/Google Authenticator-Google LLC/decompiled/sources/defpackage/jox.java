package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jox extends jkm implements jkn {
    public static final jox a;
    public int b;
    public double c;
    public double d;
    private byte e = 2;

    static {
        jox joxVar = new jox();
        a = joxVar;
        jkp.I(jox.class, joxVar);
    }

    private jox() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new jox();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jox.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
