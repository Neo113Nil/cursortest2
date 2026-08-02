package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jne extends jkp implements jlm {
    public static final jne a;
    public jjq b = jjq.d;

    static {
        jne jneVar = new jne();
        a = jneVar;
        jkp.I(jne.class, jneVar);
    }

    private jne() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new jne();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jne.class);
        }
        throw null;
    }
}
