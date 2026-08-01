package s5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements b, e, g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f8449c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f8450d = new c(1);

    /* renamed from: e, reason: collision with root package name */
    public static final c f8451e = new c(2);

    /* renamed from: f, reason: collision with root package name */
    public static final c f8452f = new c(3);
    public static final c g = new c(4);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8453b;

    public /* synthetic */ c(int i3) {
        this.f8453b = i3;
    }

    @Override // s5.b
    public Rect a(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i3 = this.f8453b;
        a aVar = b.f8448a;
        DisplayCutout displayCutout = null;
        switch (i3) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i10 = rect.bottom + dimensionPixelSize;
                    if (i10 == point.y) {
                        rect.bottom = i10;
                    } else {
                        int i11 = rect.right + dimensionPixelSize;
                        if (i11 == point.x) {
                            rect.right = i11;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect2.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect2.set((Rect) invoke2);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    aVar.getClass();
                    Log.w(a.f8447b, e2);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i12 = rect2.bottom + dimensionPixelSize2;
                    if (i12 == point2.y) {
                        rect2.bottom = i12;
                    } else {
                        int i13 = rect2.right + dimensionPixelSize2;
                        if (i13 == point2.x) {
                            rect2.right = i13;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (p3.c.h(obj2)) {
                            displayCutout = p3.c.c(obj2);
                        }
                    } catch (Exception e9) {
                        if (!(e9 instanceof ClassNotFoundException) && !(e9 instanceof NoSuchMethodException) && !(e9 instanceof NoSuchFieldException) && !(e9 instanceof IllegalAccessException) && !(e9 instanceof InvocationTargetException) && !(e9 instanceof InstantiationException)) {
                            throw e9;
                        }
                        aVar.getClass();
                        Log.w(a.f8447b, e9);
                    }
                    if (displayCutout != null) {
                        int i14 = rect2.left;
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        if (i14 == safeInsetLeft) {
                            rect2.left = 0;
                        }
                        int i15 = point2.x - rect2.right;
                        safeInsetRight = displayCutout.getSafeInsetRight();
                        if (i15 == safeInsetRight) {
                            int i16 = rect2.right;
                            safeInsetRight2 = displayCutout.getSafeInsetRight();
                            rect2.right = safeInsetRight2 + i16;
                        }
                        int i17 = rect2.top;
                        safeInsetTop = displayCutout.getSafeInsetTop();
                        if (i17 == safeInsetTop) {
                            rect2.top = 0;
                        }
                        int i18 = point2.y - rect2.bottom;
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        if (i18 == safeInsetBottom) {
                            int i19 = rect2.bottom;
                            safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                            rect2.bottom = safeInsetBottom2 + i19;
                        }
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    aVar.getClass();
                    Log.w(a.f8447b, e10);
                    return f8450d.a(activity);
                }
        }
    }

    @Override // s5.e
    public float b(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // s5.g
    public r5.a c(ContextWrapper contextWrapper, e eVar) {
        eVar.getClass();
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            b.f8448a.getClass();
            int i3 = Build.VERSION.SDK_INT;
            return new r5.a(new q5.a((i3 >= 30 ? d.f8454b : i3 >= 29 ? f8451e : i3 >= 28 ? f8450d : f8449c).a(activity)), eVar.b(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            a1.e("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new r5.a(new Rect(0, 0, point.x, point.y), eVar.b(contextWrapper));
    }
}
