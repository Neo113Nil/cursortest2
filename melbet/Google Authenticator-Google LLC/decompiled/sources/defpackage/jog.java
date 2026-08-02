package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jog extends jkp implements jlm {
    public static final jog a;
    public String b = "";
    public jkx c = jlu.a;

    static {
        jog jogVar = new jog();
        a = jogVar;
        jkp.I(jog.class, jogVar);
    }

    private jog() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0001\u0000\u0002Ȉ\u0004\u001b", new Object[]{"b", "c", joe.class});
        }
        if (i2 == 3) {
            return new jog();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jog.class);
        }
        throw null;
    }
}
