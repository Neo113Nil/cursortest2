package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvy extends jkp implements jlm {
    public static final gvy a;
    public int b;
    public long c;
    public long d;
    public jkx e;
    public long f;
    public long g;
    public int h;
    public gsk i;
    public int j;
    public jkx k;
    public jkx l;

    static {
        gvy gvyVar = new gvy();
        a = gvyVar;
        jkp.I(gvy.class, gvyVar);
    }

    private gvy() {
        jlu jluVar = jlu.a;
        this.e = jluVar;
        this.k = jluVar;
        this.l = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\n\u0000\u0001\u0001\r\n\u0000\u0003\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\nဉ\u0005\u000b᠌\u0006\f\u001a\r\u001a", new Object[]{"b", "c", "d", "e", gtx.class, "f", "g", "h", "i", "j", bmw.p, "k", "l"});
        }
        if (i2 == 3) {
            return new gvy();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gvy.class);
        }
        throw null;
    }
}
