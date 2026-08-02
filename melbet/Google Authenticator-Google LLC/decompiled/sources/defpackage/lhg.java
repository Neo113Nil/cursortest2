package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhg extends jkp implements jlm {
    public static final lhg a;
    public int b;
    public long c;
    public jkx d;
    public jmh e;
    public jkb f;
    public lhe g;
    public int h;
    public boolean i;
    public jkx j;
    public jkx k;
    public float l;
    public jkx m;
    private byte n = 2;

    static {
        lhg lhgVar = new lhg();
        a = lhgVar;
        jkp.I(lhg.class, lhgVar);
    }

    private lhg() {
        jlu jluVar = jlu.a;
        this.d = jluVar;
        this.j = jluVar;
        this.k = jluVar;
        this.m = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0004\u0001\u0001စ\u0000\u0003Л\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007᠌\u0004\bဇ\u0005\n\u001a\u000b\u001a\fခ\u0006\r\u001b", new Object[]{"b", "c", "d", lhf.class, "e", "f", "g", "h", lgb.i, "i", "j", "k", "l", "m", let.class});
        }
        if (i2 == 3) {
            return new lhg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lhg.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
