package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0208c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4420a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4421b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4420a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4421b = cls2 != null;
    }

    public static boolean a() {
        return (f4420a == null || f4421b) ? false : true;
    }
}
