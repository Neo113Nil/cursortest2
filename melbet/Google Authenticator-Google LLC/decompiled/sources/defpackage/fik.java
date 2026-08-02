package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fik {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Rect b(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Rect d(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static InputMethodManager e(View view) {
        return (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
    }

    public static void f(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void g(View view, fka fkaVar) {
        fjy fjyVar = new fjy(fkaVar, new fkb(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()));
        int i = yq.a;
        yi.c(view, fjyVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new fjz());
        }
    }

    public static void h(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean i(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
