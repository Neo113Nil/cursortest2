package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iii extends jkp implements jlm {
    public static final iii a;
    public int b;
    public long c;
    public long d;

    static {
        iii iiiVar = new iii();
        a = iiiVar;
        jkp.I(iii.class, iiiVar);
    }

    private iii() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new iii();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iii.class);
        }
        throw null;
    }
}
