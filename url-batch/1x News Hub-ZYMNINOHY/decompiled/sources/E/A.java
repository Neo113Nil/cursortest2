package E;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static Field f243a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f244b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0001b c0001b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0001b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0022x.a(viewGroup);
            } else {
                if (!f244b) {
                    if (f243a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f243a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f244b = true;
                        }
                    }
                    try {
                        Object obj = f243a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f244b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0000a) {
                c0001b = new C0001b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0001b != null ? c0001b.f276b : null);
    }
}
