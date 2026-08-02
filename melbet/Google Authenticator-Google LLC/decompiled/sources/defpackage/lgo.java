package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgo extends jkm implements jkn {
    public static final lgo a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public lgs j;
    public int m;
    public int n;
    public int o;
    public lgs p;
    public int q;
    private byte u = 2;
    public jkx k = jlu.a;

    static {
        lgo lgoVar = new lgo();
        a = lgoVar;
        jkp.I(lgo.class, lgoVar);
    }

    private lgo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.u);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b\u000eင\f", new Object[]{"b", "c", "d", "f", "i", "k", lgn.class, "m", "e", "g", "h", "j", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new lgo();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgo.class);
        }
        this.u = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
