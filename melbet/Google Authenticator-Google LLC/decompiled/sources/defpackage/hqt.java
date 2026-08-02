package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqt extends jkp implements jlm {
    public static final hqt a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        hqt hqtVar = new hqt();
        a = hqtVar;
        jkp.I(hqt.class, hqtVar);
    }

    private hqt() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new hqt();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hqt.class);
        }
        throw null;
    }
}
