package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joj extends jkp implements jlm {
    public static final joj a;
    public int b;
    public float c;

    static {
        joj jojVar = new joj();
        a = jojVar;
        jkp.I(joj.class, jojVar);
    }

    private joj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new joj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(joj.class);
        }
        throw null;
    }
}
