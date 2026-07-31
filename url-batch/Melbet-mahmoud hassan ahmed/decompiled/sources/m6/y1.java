package m6;

/* loaded from: classes.dex */
public abstract class y1 extends f0 {
    public abstract y1 R();

    protected final String S() {
        y1 y1Var;
        y1 c7 = w0.c();
        if (this == c7) {
            return "Dispatchers.Main";
        }
        try {
            y1Var = c7.R();
        } catch (UnsupportedOperationException unused) {
            y1Var = null;
        }
        if (this == y1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // m6.f0
    public String toString() {
        String S = S();
        if (S != null) {
            return S;
        }
        return q0.a(this) + '@' + q0.b(this);
    }
}
