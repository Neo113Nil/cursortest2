package E;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static Field f375a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f376b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0001b c0001b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0001b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = E.a(viewGroup);
            } else {
                if (!f376b) {
                    if (f375a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f375a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f376b = true;
                        }
                    }
                    try {
                        Object obj = f375a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f376b = true;
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
        viewGroup.setAccessibilityDelegate(c0001b != null ? c0001b.f405b : null);
    }
}
