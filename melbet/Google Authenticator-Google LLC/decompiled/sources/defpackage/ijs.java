package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijs extends jkp implements jlm {
    public static final ijs a;
    public jkx b = jlu.a;

    static {
        ijs ijsVar = new ijs();
        a = ijsVar;
        jkp.I(ijs.class, ijsVar);
    }

    private ijs() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ijr.class});
        }
        if (i2 == 3) {
            return new ijs();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijs.class);
        }
        throw null;
    }
}
