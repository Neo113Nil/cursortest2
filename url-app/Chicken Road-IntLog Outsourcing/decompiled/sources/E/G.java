package E;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static Field f566a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f567b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0027b c0027b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0027b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = C.a(viewGroup);
            } else {
                if (!f567b) {
                    if (f566a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f566a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f567b = true;
                        }
                    }
                    try {
                        Object obj = f566a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f567b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0026a) {
                c0027b = new C0027b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0027b != null ? c0027b.f600b : null);
    }
}
