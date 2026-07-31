package t2;

/* loaded from: classes3.dex */
abstract /* synthetic */ class I {

    /* renamed from: a, reason: collision with root package name */
    private static final int f46208a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f46208a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
