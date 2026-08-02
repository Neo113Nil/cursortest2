package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijn extends jkp implements jlm {
    public static final ijn a;
    public int b;
    public float c;
    public String d = "";

    static {
        ijn ijnVar = new ijn();
        a = ijnVar;
        jkp.I(ijn.class, ijnVar);
    }

    private ijn() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ijn();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijn.class);
        }
        throw null;
    }
}
