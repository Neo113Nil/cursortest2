package a1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class F extends I {

    /* renamed from: e, reason: collision with root package name */
    public static Field f3516e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3517f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f3518g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3519h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f3520c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c f3521d;

    public F() {
        this.f3520c = i();
    }

    private static WindowInsets i() {
        if (!f3517f) {
            try {
                f3516e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f3517f = true;
        }
        Field field = f3516e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f3519h) {
            try {
                f3518g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f3519h = true;
        }
        Constructor constructor = f3518g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // a1.I
    public Q b() {
        a();
        Q b2 = Q.b(null, this.f3520c);
        V0.c[] cVarArr = this.f3524b;
        O o3 = b2.f3542a;
        o3.p(cVarArr);
        o3.r(this.f3521d);
        return b2;
    }

    @Override // a1.I
    public void e(V0.c cVar) {
        this.f3521d = cVar;
    }

    @Override // a1.I
    public void g(V0.c cVar) {
        WindowInsets windowInsets = this.f3520c;
        if (windowInsets != null) {
            this.f3520c = windowInsets.replaceSystemWindowInsets(cVar.f3349a, cVar.f3350b, cVar.f3351c, cVar.f3352d);
        }
    }

    public F(Q q2) {
        super(q2);
        this.f3520c = q2.a();
    }
}
