package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eft extends jkp implements jlm {
    public static final eft a;
    public int b;
    public hrd c;

    static {
        eft eftVar = new eft();
        a = eftVar;
        jkp.I(eft.class, eftVar);
    }

    private eft() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new eft();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(eft.class);
        }
        throw null;
    }
}
