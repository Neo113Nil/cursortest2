package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3483a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3484b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3483a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3484b = cls2 != null;
    }

    public static boolean a() {
        return (f3483a == null || f3484b) ? false : true;
    }
}
