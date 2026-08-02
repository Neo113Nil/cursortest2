package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfl extends jkp implements jlm {
    public static final lfl a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        lfl lflVar = new lfl();
        a = lflVar;
        jkp.I(lfl.class, lflVar);
    }

    private lfl() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new lfl();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfl.class);
        }
        throw null;
    }
}
