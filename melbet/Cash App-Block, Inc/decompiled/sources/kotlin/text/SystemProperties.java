package kotlin.text;

/* loaded from: classes10.dex */
public final class SystemProperties {
    public static final SystemProperties INSTANCE = new SystemProperties();
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        property.getClass();
        LINE_SEPARATOR = property;
    }
}
