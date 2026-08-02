package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihj extends jkp implements jlm {
    public static final ihj a;
    public int b;
    public int c;
    public long d;
    public lew e;
    public ihf f;
    public hrh g;
    public ihg h;
    public jkx i;
    public ihi j;
    public double k;
    private byte l = 2;

    static {
        ihj ihjVar = new ihj();
        a = ihjVar;
        jkp.I(ihj.class, ihjVar);
    }

    private ihj() {
        jjq jjqVar = jjq.d;
        this.i = jlu.a;
        jlh jlhVar = jlh.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\t\u0000\u0001\u0002\u0010\t\u0000\u0001\u0002\u0002ဉ\u0005\u0003ᐉ\u0006\u0007ဉ\u0007\t\u001b\u000bက\u000b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\t", new Object[]{"b", "f", "g", "h", "i", ihl.class, "k", "c", hrn.e, "d", "e", "j"});
        }
        if (i2 == 3) {
            return new ihj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihj.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
