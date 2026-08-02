package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hre extends jkp implements jlm {
    public static final hre a;
    public int b;
    public int d;
    public hrf e;
    private byte f = 2;
    public int c = -1;

    static {
        hre hreVar = new hre();
        a = hreVar;
        jkp.I(hre.class, hreVar);
    }

    private hre() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new hre();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hre.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
