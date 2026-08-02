package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eto extends jkp implements jlm {
    public static final eto a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        eto etoVar = new eto();
        a = etoVar;
        jkp.I(eto.class, etoVar);
    }

    private eto() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new eto();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(eto.class);
        }
        throw null;
    }
}
