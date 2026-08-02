package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lex extends jkp implements jlm {
    public static final lex a;

    static {
        lex lexVar = new lex();
        a = lexVar;
        jkp.I(lex.class, lexVar);
    }

    private lex() {
        jkq jkqVar = jkq.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new lex();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lex.class);
        }
        throw null;
    }
}
