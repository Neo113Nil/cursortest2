package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0170c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4620a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4621b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4620a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4621b = cls2 != null;
    }

    public static boolean a() {
        return (f4620a == null || f4621b) ? false : true;
    }
}
