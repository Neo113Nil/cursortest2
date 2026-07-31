package q3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends a1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f6161e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f6162f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f6163g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f6164h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f6165c;

    /* renamed from: d, reason: collision with root package name */
    public i3.c f6166d;

    public v0() {
        this.f6165c = i();
    }

    private static WindowInsets i() {
        if (!f6162f) {
            try {
                f6161e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
            }
            f6162f = true;
        }
        Field field = f6161e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f6164h) {
            try {
                f6163g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f6164h = true;
        }
        Constructor constructor = f6163g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // q3.a1
    public l1 b() {
        a();
        l1 d8 = l1.d(null, this.f6165c);
        i3.c[] cVarArr = this.f6074b;
        i1 i1Var = d8.f6127a;
        i1Var.q(cVarArr);
        i1Var.s(this.f6166d);
        return d8;
    }

    @Override // q3.a1
    public void e(i3.c cVar) {
        this.f6166d = cVar;
    }

    @Override // q3.a1
    public void g(i3.c cVar) {
        WindowInsets windowInsets = this.f6165c;
        if (windowInsets != null) {
            this.f6165c = windowInsets.replaceSystemWindowInsets(cVar.f3421a, cVar.f3422b, cVar.f3423c, cVar.f3424d);
        }
    }

    public v0(l1 l1Var) {
        super(l1Var);
        this.f6165c = l1Var.c();
    }
}
