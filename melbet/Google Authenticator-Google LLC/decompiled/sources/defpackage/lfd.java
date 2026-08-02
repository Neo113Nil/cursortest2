package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfd extends jkp implements jlm {
    public static final lfd a;
    public jkw A;
    public String B;
    public lff C;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public lfy n;
    public int o;
    public lfc p;
    public int q;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public String z;
    public int c = 0;
    private byte D = 2;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        lfd lfdVar = new lfd();
        a = lfdVar;
        jkp.I(lfd.class, lfdVar);
    }

    private lfd() {
        jlu jluVar = jlu.a;
        this.z = "";
        this.A = jlh.a;
        this.B = "";
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.D);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0018\u0001\u0001\u0001\u001d\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001b᠌\f\u001c5\u0000\u001d<\u0000", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", "k", "l", "m", jnw.q, "n", "p", "u", "v", jnw.r, "w", jnw.p, "y", "z", "x", "B", "A", "C", "o", jnw.n, "g", "q", jnw.o, lga.class});
        }
        if (i2 == 3) {
            return new lfd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfd.class);
        }
        this.D = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
