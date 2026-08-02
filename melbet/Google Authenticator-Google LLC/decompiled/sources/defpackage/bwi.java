package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwi extends jkp implements jlm {
    public static final bwi a;
    public int b;
    public int c;
    public int d;

    static {
        bwi bwiVar = new bwi();
        a = bwiVar;
        jkp.I(bwi.class, bwiVar);
    }

    private bwi() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new bwi();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(bwi.class);
        }
        throw null;
    }
}
