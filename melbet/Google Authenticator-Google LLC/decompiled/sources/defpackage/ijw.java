package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijw extends jkp implements jlm {
    public static final jku a = new eue(3);
    public static final ijw b;
    public int c;
    public jkt d = jkq.a;
    public ijv e;

    static {
        ijw ijwVar = new ijw();
        b = ijwVar;
        jkp.I(ijw.class, ijwVar);
    }

    private ijw() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠬ\u0002ဉ\u0000", new Object[]{"c", "d", hrn.l, "e"});
        }
        if (i2 == 3) {
            return new ijw();
        }
        if (i2 == 4) {
            return new jkj(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return jkp.D(ijw.class);
        }
        throw null;
    }
}
