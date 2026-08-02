package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfe extends jkp implements jlm {
    public static final dfe a;
    public int b;
    public dfg c;
    public long d;

    static {
        dfe dfeVar = new dfe();
        a = dfeVar;
        jkp.I(dfe.class, dfeVar);
    }

    private dfe() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new dfe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dfe.class);
        }
        throw null;
    }
}
