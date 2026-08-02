package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ice extends jkp implements jlm {
    public static final ice a;
    public static final iwq e;
    public int b;
    public long c;
    public jkx d = jlu.a;

    static {
        ice iceVar = new ice();
        a = iceVar;
        jkp.I(ice.class, iceVar);
        e = jkp.O(job.a, iceVar, iceVar, 182135729, jmr.MESSAGE);
    }

    private ice() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ice();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ice.class);
        }
        throw null;
    }
}
