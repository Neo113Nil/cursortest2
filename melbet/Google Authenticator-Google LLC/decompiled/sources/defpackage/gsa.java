package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsa extends jkp implements jlm {
    public static final gsa a;
    public int b;
    public long e;
    public long c = -1;
    public jkx d = jlu.a;
    public jkt f = jkq.a;

    static {
        gsa gsaVar = new gsa();
        a = gsaVar;
        jkp.I(gsa.class, gsaVar);
    }

    private gsa() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", grz.class, "e", "f"});
        }
        if (i2 == 3) {
            return new gsa();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gsa.class);
        }
        throw null;
    }
}
