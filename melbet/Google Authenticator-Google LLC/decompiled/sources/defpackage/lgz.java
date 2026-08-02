package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgz extends jkp implements jlm {
    public static final lgz a;
    public int b;
    public long c;
    public lew d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    private byte i = 2;

    static {
        lgz lgzVar = new lgz();
        a = lgzVar;
        jkp.I(lgz.class, lgzVar);
    }

    private lgz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဃ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new lgz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgz.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
