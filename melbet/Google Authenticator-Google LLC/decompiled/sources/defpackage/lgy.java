package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgy extends jkp implements jlm {
    public static final lgy a;
    public int b;
    public jmh d;
    public int e;
    private byte f = 2;
    public jkx c = jlu.a;

    static {
        lgy lgyVar = new lgy();
        a = lgyVar;
        jkp.I(lgy.class, lgyVar);
    }

    private lgy() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", lgx.class, "d", "e", lgb.g});
        }
        if (i2 == 3) {
            return new lgy();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgy.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
