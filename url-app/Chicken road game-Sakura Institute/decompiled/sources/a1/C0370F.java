package a1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: a1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370F extends AbstractC0374J {

    /* renamed from: e, reason: collision with root package name */
    public static Field f4844e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4845f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f4846g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4847h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f4848c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c f4849d;

    public C0370F() {
        this.f4848c = i();
    }

    private static WindowInsets i() {
        if (!f4845f) {
            try {
                f4844e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f4845f = true;
        }
        Field field = f4844e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f4847h) {
            try {
                f4846g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f4847h = true;
        }
        Constructor constructor = f4846g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // a1.AbstractC0374J
    public C0383T b() {
        a();
        C0383T b4 = C0383T.b(null, this.f4848c);
        V0.c[] cVarArr = this.f4852b;
        C0380P c0380p = b4.f4871a;
        c0380p.p(cVarArr);
        c0380p.r(this.f4849d);
        return b4;
    }

    @Override // a1.AbstractC0374J
    public void e(V0.c cVar) {
        this.f4849d = cVar;
    }

    @Override // a1.AbstractC0374J
    public void g(V0.c cVar) {
        WindowInsets windowInsets = this.f4848c;
        if (windowInsets != null) {
            this.f4848c = windowInsets.replaceSystemWindowInsets(cVar.f4143a, cVar.f4144b, cVar.f4145c, cVar.f4146d);
        }
    }

    public C0370F(C0383T c0383t) {
        super(c0383t);
        this.f4848c = c0383t.a();
    }
}
