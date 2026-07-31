package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1289e0 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f11956a;

    /* renamed from: androidx.core.view.e0$a */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: androidx.core.view.e0$b */
    static class b {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: androidx.core.view.e0$c */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
        }

        static int b(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f11956a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static int a(Resources resources, int i4, A.i iVar, int i5) {
        int dimensionPixelSize;
        return i4 != -1 ? (i4 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i4)) < 0) ? i5 : dimensionPixelSize : ((Integer) iVar.get()).intValue();
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        if (f11956a != null) {
            try {
                return ((Integer) r0.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i4, i5, i6);
        }
        if (!k(i4, i5, i6)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d4 = d(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d4, new A.i() { // from class: androidx.core.view.c0
            @Override // A.i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(Context context, final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i4, i5, i6);
        }
        if (!k(i4, i5, i6)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int e4 = e(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e4, new A.i() { // from class: androidx.core.view.d0
            @Override // A.i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    private static boolean k(int i4, int i5, int i6) {
        InputDevice device = InputDevice.getDevice(i4);
        return (device == null || device.getMotionRange(i5, i6) == null) ? false : true;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int c4 = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return c4 != 0 && resources.getBoolean(c4);
    }
}
