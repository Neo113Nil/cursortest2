package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joh extends jkp implements jlm {
    public static final joh a;
    public int b;
    public int c;
    public jof d;
    public String e;
    public jli f;
    private int g;
    private jli h;

    static {
        joh johVar = new joh();
        a = johVar;
        jkp.I(joh.class, johVar);
    }

    private joh() {
        jli jliVar = jli.a;
        this.f = jliVar;
        this.h = jliVar;
        jlu jluVar = jlu.a;
        this.e = "";
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jmr jmrVar = jmr.UINT32;
            jmr jmrVar2 = jmr.MESSAGE;
            jog jogVar = jog.a;
            return new jlv(a, "\u0000\u0006\u0000\u0001\u0001\u0019\u0006\u0002\u0000\u0000\u0001\f\u0006\u000b\nဉ\u0000\u000eȈ\u00102\u00192", new Object[]{"g", "b", "c", "d", "e", "f", new ikk(jmrVar, 0, jmrVar2, jogVar), "h", new ikk(jmrVar, 0, jmrVar2, jogVar)});
        }
        if (i2 == 3) {
            return new joh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(joh.class);
        }
        throw null;
    }
}
