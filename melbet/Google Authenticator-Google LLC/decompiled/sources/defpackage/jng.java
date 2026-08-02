package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jng extends jkp implements jlm {
    public static final jng a;
    public String b = "";
    public boolean c;

    static {
        jng jngVar = new jng();
        a = jngVar;
        jkp.I(jng.class, jngVar);
    }

    private jng() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new jng();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jng.class);
        }
        throw null;
    }
}
