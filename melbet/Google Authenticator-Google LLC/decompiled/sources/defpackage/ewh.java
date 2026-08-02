package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewh extends jkp implements jlm {
    public static final ewh a;
    public int b;
    public String c = "";

    static {
        ewh ewhVar = new ewh();
        a = ewhVar;
        jkp.I(ewh.class, ewhVar);
    }

    private ewh() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ewh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ewh.class);
        }
        throw null;
    }
}
