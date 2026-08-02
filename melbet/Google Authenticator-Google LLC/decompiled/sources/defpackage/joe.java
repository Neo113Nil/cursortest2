package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joe extends jkp implements jlm {
    public static final joe a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        joe joeVar = new joe();
        a = joeVar;
        jkp.I(joe.class, joeVar);
    }

    private joe() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001\u0003\u0004Ȉ\u0006Ȉ\bȈ", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new joe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(joe.class);
        }
        throw null;
    }
}
