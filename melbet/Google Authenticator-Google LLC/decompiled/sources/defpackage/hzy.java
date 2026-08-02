package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class hzy extends jkp implements jlm {
    public static final hzy a;

    static {
        hzy hzyVar = new hzy();
        a = hzyVar;
        jkp.I(hzy.class, hzyVar);
    }

    private hzy() {
        jlu jluVar = jlu.a;
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
            return new hzy();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hzy.class);
        }
        throw null;
    }
}
