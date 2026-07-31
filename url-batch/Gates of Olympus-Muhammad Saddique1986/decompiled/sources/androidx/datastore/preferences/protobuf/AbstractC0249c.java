package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0249c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5051a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5052b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5051a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5052b = cls2 != null;
    }

    public static boolean a() {
        return (f5051a == null || f5052b) ? false : true;
    }
}
