package A0;

import I.a0;
import I.b0;
import I.c0;
import I.d0;
import I.e0;
import I.f0;
import I.g0;
import I.v0;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.collections.C0631j;
import kotlin.jvm.internal.Intrinsics;
import x0.C0995b;

/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final p f84b = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final String f85c;

    static {
        String simpleName = p.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f85c = simpleName;
        Integer[] elements = {1, 2, 4, 8, 16, 32, 64, 128};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        new ArrayList(new C0631j(elements, true));
    }

    public static m a(Activity activity) {
        Rect rect;
        v0 b7;
        WindowMetrics currentWindowMetrics;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect, "wm.currentWindowMetrics.bounds");
        } else if (i2 >= 29) {
            String str = f85c;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e7) {
                Log.w(str, e7);
                rect = b(activity);
            } catch (NoSuchFieldException e8) {
                Log.w(str, e8);
                rect = b(activity);
            } catch (NoSuchMethodException e9) {
                Log.w(str, e9);
                rect = b(activity);
            } catch (InvocationTargetException e10) {
                Log.w(str, e10);
                rect = b(activity);
            }
        } else if (i2 >= 28) {
            rect = b(activity);
        } else {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Rect rect2 = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect2);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (!activity.isInMultiWindowMode()) {
                Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
                Point c7 = c(defaultDisplay);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i5 = rect2.bottom + dimensionPixelSize;
                if (i5 == c7.y) {
                    rect2.bottom = i5;
                } else {
                    int i7 = rect2.right + dimensionPixelSize;
                    if (i7 == c7.x) {
                        rect2.right = i7;
                    }
                }
            }
            rect = rect2;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            if (i8 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b7 = E0.b.f657a.a(activity);
        } else {
            b7 = (i8 >= 36 ? new g0() : i8 >= 35 ? new f0() : i8 >= 34 ? new e0() : i8 >= 31 ? new d0() : i8 >= 30 ? new c0() : i8 >= 29 ? new b0() : new a0()).b();
            Intrinsics.checkNotNullExpressionValue(b7, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new m(new C0995b(rect), b7);
    }

    public static Rect b(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        String str = f85c;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w(str, e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e8) {
            Log.w(str, e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e9) {
            Log.w(str, e9);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e10) {
            Log.w(str, e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Intrinsics.checkNotNullExpressionValue(display, "currentDisplay");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i5 = rect.right + dimensionPixelSize;
                if (i5 == point.x) {
                    rect.right = i5;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (!activity.isInMultiWindowMode()) {
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(display, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (o.v(obj2)) {
                        displayCutout = o.k(obj2);
                    }
                } catch (ClassNotFoundException e11) {
                    Log.w(str, e11);
                } catch (IllegalAccessException e12) {
                    Log.w(str, e12);
                } catch (InstantiationException e13) {
                    Log.w(str, e13);
                } catch (NoSuchFieldException e14) {
                    Log.w(str, e14);
                } catch (NoSuchMethodException e15) {
                    Log.w(str, e15);
                } catch (InvocationTargetException e16) {
                    Log.w(str, e16);
                }
                if (displayCutout != null) {
                    int i7 = rect.left;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (i7 == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int i8 = point.x - rect.right;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (i8 == safeInsetRight) {
                        int i9 = rect.right;
                        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = safeInsetRight2 + i9;
                    }
                    int i10 = rect.top;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (i10 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int i11 = point.y - rect.bottom;
                    Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (i11 == safeInsetBottom) {
                        int i12 = rect.bottom;
                        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = safeInsetBottom2 + i12;
                    }
                }
            }
        }
        return rect;
    }

    public static Point c(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
        return point;
    }
}
