package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqu extends jkp implements jlm {
    public static final hqu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public jkb h;
    public int i;
    public int j;
    public String k = "";

    static {
        hqu hquVar = new hqu();
        a = hquVar;
        jkp.I(hqu.class, hquVar);
    }

    private hqu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\bင\u0007\tဌ\b\nဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new hqu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hqu.class);
        }
        throw null;
    }
}
