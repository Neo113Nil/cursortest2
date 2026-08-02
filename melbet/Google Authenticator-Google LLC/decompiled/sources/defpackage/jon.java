package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jon extends jkm implements jkn {
    public static final jon a;
    public int b;
    public joa c;
    public int d;
    public iik e;
    private byte f = 2;

    static {
        jon jonVar = new jon();
        a = jonVar;
        jkp.I(jon.class, jonVar);
    }

    private jon() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", jnw.f, "e"});
        }
        if (i2 == 3) {
            return new jon();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jon.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
