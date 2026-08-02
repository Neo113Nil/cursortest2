package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grz extends jkp implements jlm {
    public static final grz a;
    public int b;
    public gsc c;
    public long d;
    public long e;
    public int f;

    static {
        grz grzVar = new grz();
        a = grzVar;
        jkp.I(grz.class, grzVar);
    }

    private grz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new grz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(grz.class);
        }
        throw null;
    }
}
