package kotlin.text;

/* loaded from: classes3.dex */
final class v {
    public static final v INSTANCE = new v();
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        kotlin.jvm.internal.s.checkNotNull(property);
        LINE_SEPARATOR = property;
    }

    private v() {
    }
}
