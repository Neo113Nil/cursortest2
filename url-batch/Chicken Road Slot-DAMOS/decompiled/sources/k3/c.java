package k3;

import android.os.Build;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5376a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final int f5377b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5378c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5379d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5380e;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f5377b = i3 >= 30 ? b.f5375a.a(30) : 0;
        f5378c = i3 >= 30 ? b.f5375a.a(31) : 0;
        f5379d = i3 >= 30 ? b.f5375a.a(33) : 0;
        f5380e = i3 >= 30 ? b.f5375a.a(1000000) : 0;
    }

    private c() {
    }
}
