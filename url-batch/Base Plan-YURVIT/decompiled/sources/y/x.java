package y;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3160a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3161b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0258b c0258b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0258b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0276u.a(viewGroup);
            } else {
                if (!f3161b) {
                    if (f3160a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f3160a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f3161b = true;
                        }
                    }
                    try {
                        Object obj = f3160a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f3161b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0257a) {
                c0258b = new C0258b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0258b != null ? c0258b.f3137b : null);
    }
}
