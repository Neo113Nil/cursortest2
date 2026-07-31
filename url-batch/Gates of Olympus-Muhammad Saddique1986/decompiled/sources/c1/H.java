package c1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H extends K {

    /* renamed from: e, reason: collision with root package name */
    public static Field f5562e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f5563f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f5564g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5565h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f5566c;

    /* renamed from: d, reason: collision with root package name */
    public X0.c f5567d;

    public H() {
        this.f5566c = i();
    }

    private static WindowInsets i() {
        if (!f5563f) {
            try {
                f5562e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f5563f = true;
        }
        Field field = f5562e;
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
        if (!f5565h) {
            try {
                f5564g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f5565h = true;
        }
        Constructor constructor = f5564g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // c1.K
    public U b() {
        a();
        U b3 = U.b(null, this.f5566c);
        X0.c[] cVarArr = this.f5570b;
        Q q3 = b3.f5589a;
        q3.p(cVarArr);
        q3.r(this.f5567d);
        return b3;
    }

    @Override // c1.K
    public void e(X0.c cVar) {
        this.f5567d = cVar;
    }

    @Override // c1.K
    public void g(X0.c cVar) {
        WindowInsets windowInsets = this.f5566c;
        if (windowInsets != null) {
            this.f5566c = windowInsets.replaceSystemWindowInsets(cVar.f4623a, cVar.f4624b, cVar.f4625c, cVar.f4626d);
        }
    }

    public H(U u3) {
        super(u3);
        this.f5566c = u3.a();
    }
}
