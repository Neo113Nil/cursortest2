package w;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3075a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3076b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0256b c0256b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0256b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0274u.a(viewGroup);
            } else {
                if (!f3076b) {
                    if (f3075a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f3075a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f3076b = true;
                        }
                    }
                    try {
                        Object obj = f3075a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f3076b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0255a) {
                c0256b = new C0256b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0256b != null ? c0256b.f3052b : null);
    }
}
