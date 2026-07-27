package m0;

import E.O;
import E.Q;
import E.S;
import E.b0;
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
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import g4.C0462g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11121b = 0;

    static {
        new ArrayList(new C0462g(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static l a(Activity activity) {
        Rect rect;
        b0 b6;
        WindowMetrics currentWindowMetrics;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            kotlin.jvm.internal.i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e3) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e3);
                rect = b(activity);
            } catch (NoSuchFieldException e6) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e6);
                rect = b(activity);
            } catch (NoSuchMethodException e7) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e7);
                rect = b(activity);
            } catch (InvocationTargetException e8) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e8);
                rect = b(activity);
            }
        } else if (i2 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect.bottom = i3;
                } else {
                    int i6 = rect.right + dimensionPixelSize;
                    if (i6 == point.x) {
                        rect.right = i6;
                    }
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            b6 = (i7 >= 30 ? new S() : i7 >= 29 ? new Q() : new O()).b();
            kotlin.jvm.internal.i.d(b6, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i7 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b6 = q0.a.f11663a.a(activity);
        }
        return new l(new j0.b(rect), b6);
    }

    public static Rect b(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e3) {
            Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e6) {
            Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e7) {
            Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e8) {
            Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        kotlin.jvm.internal.i.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (io.flutter.plugin.platform.c.o(obj2)) {
                    displayCutout = io.flutter.plugin.platform.c.f(obj2);
                }
            } catch (ClassNotFoundException e9) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e9);
            } catch (IllegalAccessException e10) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e10);
            } catch (InstantiationException e11) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e11);
            } catch (NoSuchFieldException e12) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e12);
            } catch (NoSuchMethodException e13) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e13);
            } catch (InvocationTargetException e14) {
                Log.w(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, e14);
            }
            if (displayCutout != null) {
                int i6 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i6 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i7 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i7 == safeInsetRight) {
                    int i8 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i8;
                }
                int i9 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i9 == safeInsetTop) {
                    rect.top = 0;
                }
                int i10 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i10 == safeInsetBottom) {
                    int i11 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i11;
                }
            }
        }
        return rect;
    }
}
