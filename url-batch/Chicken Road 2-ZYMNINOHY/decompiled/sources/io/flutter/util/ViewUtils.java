package io.flutter.util;

import C1.b;
import D0.a;
import D0.d;
import E.AbstractC0005f;
import E.L;
import E.N;
import E.O;
import E.P;
import E.Q;
import E.e0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.i;
import y1.m;
import y1.n;

/* loaded from: classes.dex */
public final class ViewUtils {

    public interface DisplayUpdater {
        void updateDisplayMetrics(float f4, float f5, float f6);
    }

    public interface ViewVisitor {
        boolean run(View view);
    }

    public static void calculateMaximumDisplayMetrics(Context context, DisplayUpdater displayUpdater) {
        Rect rect;
        e0 _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity activity = getActivity(context);
        if (activity != null) {
            m.f16258a.getClass();
            int i4 = n.f16259b;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                maximumWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activity.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                i.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i5 < 30) {
                _windowInsetsCompat = (i5 >= 34 ? new Q() : i5 >= 31 ? new P() : i5 >= 30 ? new O() : i5 >= 29 ? new N() : new L()).b();
                i.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i5 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = b.f261a.a(activity);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new IllegalArgumentException(AbstractC0005f.i(i6, i8, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i7 > i9) {
                throw new IllegalArgumentException(AbstractC0005f.i(i7, i9, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            i.e(_windowInsetsCompat, "_windowInsetsCompat");
            displayUpdater.updateDisplayMetrics(new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(View view) {
        return traverseHierarchy(view, new d(20));
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(View view, Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new a(17, clsArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasChildViewOfType$0(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(View view, ViewVisitor viewVisitor) {
        if (view != null) {
            if (viewVisitor.run(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    if (traverseHierarchy(viewGroup.getChildAt(i4), viewVisitor)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
