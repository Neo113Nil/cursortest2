package l;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public static Field f954b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f955c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f956d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f957e = false;

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f958a = c();

    private static WindowInsets c() {
        if (!f955c) {
            try {
                f954b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f955c = true;
        }
        Field field = f954b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f957e) {
            try {
                f956d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f957e = true;
        }
        Constructor constructor = f956d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // l.h
    public q b() {
        a();
        q a2 = q.a(null, this.f958a);
        o oVar = a2.f977a;
        oVar.n(null);
        oVar.p(null);
        return a2;
    }
}
