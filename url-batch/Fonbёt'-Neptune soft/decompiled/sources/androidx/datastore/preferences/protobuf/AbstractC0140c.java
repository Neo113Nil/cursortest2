package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0140c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1671a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1672b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1671a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1672b = cls2 != null;
    }

    public static boolean a() {
        return (f1671a == null || f1672b) ? false : true;
    }
}
