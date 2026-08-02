package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgu extends jkp implements jlm {
    public static final lgu a;
    public int b;
    public int c;
    private lgt e;
    private byte f = 2;
    public int d = 1;

    static {
        lgu lguVar = new lgu();
        a = lguVar;
        jkp.I(lgu.class, lguVar);
    }

    private lgu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", lgb.f, "d", "e"});
        }
        if (i2 == 3) {
            return new lgu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgu.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
