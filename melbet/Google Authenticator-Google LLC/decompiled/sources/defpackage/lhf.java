package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhf extends jkp implements jlm {
    public static final lhf a;
    public int b;
    public int d;
    public int e;
    public jkb f;
    public jkb g;
    public jkb h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public lew m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int u;
    private byte v = 2;
    public String c = "";

    static {
        lhf lhfVar = new lhf();
        a = lhfVar;
        jkp.I(lhf.class, lhfVar);
    }

    private lhf() {
        jlh jlhVar = jlh.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bᐉ\n\fဂ\u000b\rဂ\f\u000eင\r\u000fင\u000e\u0010င\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", lgb.h, "k", "l", "m", "n", "o", "p", "q", "u"});
        }
        if (i2 == 3) {
            return new lhf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lhf.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
