package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkx extends jkm implements dky {
    public static final dkx a;
    public int b;
    public hre d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte i = 2;
    public jkt c = jkq.a;

    static {
        dkx dkxVar = new dkx();
        a = dkxVar;
        jkp.I(dkx.class, dkxVar);
    }

    private dkx() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", bmw.u, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new dkx();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dkx.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
