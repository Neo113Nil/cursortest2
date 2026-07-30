package h6;

/* loaded from: classes2.dex */
public interface h {
    g a(String str);

    default f get() {
        return a("noop").build();
    }
}
