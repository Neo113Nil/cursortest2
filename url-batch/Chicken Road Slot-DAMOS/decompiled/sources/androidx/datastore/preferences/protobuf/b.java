package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f513a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f514b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f513a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f514b = cls2 != null;
    }

    public static boolean a() {
        return (f513a == null || f514b) ? false : true;
    }
}
