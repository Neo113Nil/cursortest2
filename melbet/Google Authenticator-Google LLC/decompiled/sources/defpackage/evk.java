package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evk extends jkp implements jlm {
    public static final evk a;
    public jkx b = jlu.a;

    static {
        evk evkVar = new evk();
        a = evkVar;
        jkp.I(evk.class, evkVar);
    }

    private evk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new evk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(evk.class);
        }
        throw null;
    }
}
