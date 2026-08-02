package E;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class D extends K {

    /* renamed from: d, reason: collision with root package name */
    public static Field f246d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f247e = false;
    public static Constructor f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f248g = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f249c;

    public D() {
        this.f249c = h();
    }

    private static WindowInsets h() {
        if (!f247e) {
            try {
                f246d = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f247e = true;
        }
        Field field = f246d;
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
        if (!f248g) {
            try {
                f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f248g = true;
        }
        Constructor constructor = f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // E.K
    public W b() {
        a();
        W b3 = W.b(this.f249c, null);
        x.b[] bVarArr = this.f252b;
        T t3 = b3.f270a;
        t3.o(bVarArr);
        t3.q(null);
        return b3;
    }

    @Override // E.K
    public void f(x.b bVar) {
        WindowInsets windowInsets = this.f249c;
        if (windowInsets != null) {
            this.f249c = windowInsets.replaceSystemWindowInsets(bVar.f10694a, bVar.f10695b, bVar.f10696c, bVar.f10697d);
        }
    }

    public D(W w3) {
        super(w3);
        this.f249c = w3.a();
    }
}
