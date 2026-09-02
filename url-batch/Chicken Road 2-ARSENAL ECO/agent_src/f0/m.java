package f0;

import D.K;
import D.M;
import D.N;
import D.Y;
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
import c0.C0269b;
import j0.C0434a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l5.C0503g;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4197b = 0;

    static {
        new ArrayList(new C0503g(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) {
        Rect rect;
        Y b7;
        WindowMetrics currentWindowMetrics;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            kotlin.jvm.internal.i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i7 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e4) {
                Log.w("m", e4);
                rect = b(activity);
            } catch (NoSuchFieldException e7) {
                Log.w("m", e7);
                rect = b(activity);
            } catch (NoSuchMethodException e8) {
                Log.w("m", e8);
                rect = b(activity);
            } catch (InvocationTargetException e9) {
                Log.w("m", e9);
                rect = b(activity);
            }
        } else if (i7 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i8 = rect.bottom + dimensionPixelSize;
                if (i8 == point.y) {
                    rect.bottom = i8;
                } else {
                    int i9 = rect.right + dimensionPixelSize;
                    if (i9 == point.x) {
                        rect.right = i9;
                    }
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            b7 = (i10 >= 30 ? new N() : i10 >= 29 ? new M() : new K()).b();
            kotlin.jvm.internal.i.d(b7, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i10 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b7 = C0434a.f4875a.a(activity);
        }
        return new k(new C0269b(rect), b7);
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
        } catch (IllegalAccessException e4) {
            Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e7) {
            Log.w("m", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e8) {
            Log.w("m", e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e9) {
            Log.w("m", e9);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        kotlin.jvm.internal.i.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i7 = rect.bottom + dimensionPixelSize;
            if (i7 == point.y) {
                rect.bottom = i7;
            } else {
                int i8 = rect.right + dimensionPixelSize;
                if (i8 == point.x) {
                    rect.right = i8;
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
                if (B.b.z(obj2)) {
                    displayCutout = B.b.n(obj2);
                }
            } catch (ClassNotFoundException e10) {
                Log.w("m", e10);
            } catch (IllegalAccessException e11) {
                Log.w("m", e11);
            } catch (InstantiationException e12) {
                Log.w("m", e12);
            } catch (NoSuchFieldException e13) {
                Log.w("m", e13);
            } catch (NoSuchMethodException e14) {
                Log.w("m", e14);
            } catch (InvocationTargetException e15) {
                Log.w("m", e15);
            }
            if (displayCutout != null) {
                int i9 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i9 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i10 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i10 == safeInsetRight) {
                    int i11 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i11;
                }
                int i12 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i12 == safeInsetTop) {
                    rect.top = 0;
                }
                int i13 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i13 == safeInsetBottom) {
                    int i14 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i14;
                }
            }
        }
        return rect;
    }
}
