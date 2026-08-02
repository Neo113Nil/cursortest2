package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihk extends jkp implements jlm {
    public static final ihk a;
    public int b;
    public int c;

    static {
        ihk ihkVar = new ihk();
        a = ihkVar;
        jkp.I(ihk.class, ihkVar);
    }

    private ihk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", hrn.f});
        }
        if (i2 == 3) {
            return new ihk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihk.class);
        }
        throw null;
    }
}
