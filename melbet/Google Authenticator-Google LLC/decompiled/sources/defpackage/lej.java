package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lej extends jkp implements jlm {
    public static final lej a;
    public int b;
    public int c;
    public long d;
    public lew g;
    public int h;
    public long i;
    public les j;
    public long k;
    public long l;
    private byte m = 2;
    public String e = "";
    public String f = "";

    static {
        lej lejVar = new lej();
        a = lejVar;
        jkp.I(lej.class, lejVar);
    }

    private lej() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            jks jksVar = jnw.i;
            return new jlv(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", jksVar, "h", jksVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new lej();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lej.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
