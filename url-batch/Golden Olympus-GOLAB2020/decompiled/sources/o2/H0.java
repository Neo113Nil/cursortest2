package o2;

/* loaded from: classes3.dex */
public abstract class H0 extends AbstractC3313G {
    protected final String U() {
        H0 h02;
        H0 c4 = Z.c();
        if (this == c4) {
            return "Dispatchers.Main";
        }
        try {
            h02 = c4.p();
        } catch (UnsupportedOperationException unused) {
            h02 = null;
        }
        if (this == h02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract H0 p();
}
