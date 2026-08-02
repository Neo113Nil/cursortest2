package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfs extends jkp implements jlm {
    public static final lfs a;
    public int b;
    public long c;
    public String d = "";
    public lfq e;
    public jkx f;
    public jmh g;
    public jkb h;
    public int i;
    public lfr j;
    public jkx k;
    public lfl l;
    public jkx m;
    public jkx n;
    public lfp o;

    static {
        lfs lfsVar = new lfs();
        a = lfsVar;
        jkp.I(lfs.class, lfsVar);
    }

    private lfs() {
        jlu jluVar = jlu.a;
        this.f = jluVar;
        this.k = jluVar;
        this.m = jluVar;
        this.n = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0004\u0000\u0001စ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0005င\u0006\u0006ဉ\u0007\u0007\u001b\b\u001b\nဉ\u0002\u000bဉ\u0005\fဉ\b\r\u001a\u000e\u001a\u000fဉ\t", new Object[]{"b", "c", "d", "g", "i", "j", "k", lfx.class, "f", lfo.class, "e", "h", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new lfs();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfs.class);
        }
        throw null;
    }
}
