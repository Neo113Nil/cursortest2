package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lez extends jkp implements jlm {
    public static final lez a;
    public int b;
    public boolean c;

    static {
        lez lezVar = new lez();
        a = lezVar;
        jkp.I(lez.class, lezVar);
    }

    private lez() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lez();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lez.class);
        }
        throw null;
    }
}
