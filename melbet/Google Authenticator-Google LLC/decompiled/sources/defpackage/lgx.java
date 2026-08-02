package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgx extends jkp implements jlm {
    public static final lgx a;
    public int b;
    public Object d;
    public lha e;
    public int c = 0;
    private byte f = 2;

    static {
        lgx lgxVar = new lgx();
        a = lgxVar;
        jkp.I(lgx.class, lgxVar);
    }

    private lgx() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", lfs.class, "e", lhg.class});
        }
        if (i2 == 3) {
            return new lgx();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgx.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
