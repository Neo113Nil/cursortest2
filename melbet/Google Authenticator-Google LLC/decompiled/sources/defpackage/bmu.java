package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmu extends jkp implements jlm {
    public static final bmu a;
    public int b;
    public int d;
    public int f;
    public jkx c = jlu.a;
    public int e = 1;

    static {
        bmu bmuVar = new bmu();
        a = bmuVar;
        jkp.I(bmu.class, bmuVar);
    }

    private bmu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", bmv.class, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new bmu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(bmu.class);
        }
        throw null;
    }
}
