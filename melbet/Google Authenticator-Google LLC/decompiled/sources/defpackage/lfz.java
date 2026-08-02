package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfz extends jkp implements jlm {
    public static final lfz a;
    public int b;
    public lfy c;

    static {
        lfz lfzVar = new lfz();
        a = lfzVar;
        jkp.I(lfz.class, lfzVar);
    }

    private lfz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lfz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfz.class);
        }
        throw null;
    }
}
