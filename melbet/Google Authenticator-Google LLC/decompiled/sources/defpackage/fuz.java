package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuz extends jkp implements jlm {
    public static final fuz a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        fuz fuzVar = new fuz();
        a = fuzVar;
        jkp.I(fuz.class, fuzVar);
    }

    private fuz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new fuz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fuz.class);
        }
        throw null;
    }
}
