package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0073c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1423a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1424b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1423a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1424b = cls2 != null;
    }

    public static boolean a() {
        return (f1423a == null || f1424b) ? false : true;
    }
}
