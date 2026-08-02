package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfq extends jkp implements jlm {
    public static final lfq a;
    public int b = 0;
    public Object c;

    static {
        lfq lfqVar = new lfq();
        a = lfqVar;
        jkp.I(lfq.class, lfqVar);
    }

    private lfq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00014\u0000\u00024\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new lfq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfq.class);
        }
        throw null;
    }
}
