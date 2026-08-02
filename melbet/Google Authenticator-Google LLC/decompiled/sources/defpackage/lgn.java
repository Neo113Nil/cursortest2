package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgn extends jkp implements jlm {
    public static final lgn a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        lgn lgnVar = new lgn();
        a = lgnVar;
        jkp.I(lgn.class, lgnVar);
    }

    private lgn() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new lgn();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgn.class);
        }
        throw null;
    }
}
