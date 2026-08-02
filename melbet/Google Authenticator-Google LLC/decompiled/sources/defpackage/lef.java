package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lef extends jkp implements jlm {
    public static final lef a;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        lef lefVar = new lef();
        a = lefVar;
        jkp.I(lef.class, lefVar);
    }

    private lef() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002=\u0000\u0005=\u0000\u0006ဇ\u0003", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new lef();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lef.class);
        }
        throw null;
    }
}
