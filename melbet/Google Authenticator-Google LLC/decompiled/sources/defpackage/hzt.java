package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzt extends jkp implements jlm {
    public static final hzt a;

    static {
        hzt hztVar = new hzt();
        a = hztVar;
        jkp.I(hzt.class, hztVar);
    }

    private hzt() {
        jjq jjqVar = jjq.d;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new hzt();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hzt.class);
        }
        throw null;
    }
}
