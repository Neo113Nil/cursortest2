package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0193c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3850a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3851b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3850a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3851b = cls2 != null;
    }

    public static boolean a() {
        return (f3850a == null || f3851b) ? false : true;
    }
}
