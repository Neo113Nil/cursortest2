package W2;

/* loaded from: classes.dex */
public interface h {
    g a(String str);

    default f get() {
        return a("noop").build();
    }
}
