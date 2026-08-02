package i0;

import E.D;
import E.F;
import E.H;
import E.I;
import E.J;
import E.W;
import E1.AbstractC0033i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.C0295b;
import g0.C0330b;
import g0.C0331c;
import g0.k;
import g0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class e {
    public static C0331c a(k kVar, FoldingFeature foldingFeature) {
        C0330b c0330b;
        C0330b c0330b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0330b = C0330b.f5013g;
        } else {
            if (type != 2) {
                return null;
            }
            c0330b = C0330b.f5014h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0330b2 = C0330b.f5012e;
        } else {
            if (state != 2) {
                return null;
            }
            c0330b2 = C0330b.f;
        }
        Rect bounds = foldingFeature.getBounds();
        j.d(bounds, "oemFeature.bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (i3 > i5) {
            throw new IllegalArgumentException(AbstractC0033i.g(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(AbstractC0033i.g(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect a3 = kVar.f5033a.a();
        int i7 = i6 - i4;
        if (i7 == 0 && i5 - i3 == 0) {
            return null;
        }
        int i8 = i5 - i3;
        if (i8 != a3.width() && i7 != a3.height()) {
            return null;
        }
        if (i8 < a3.width() && i7 < a3.height()) {
            return null;
        }
        if (i8 == a3.width() && i7 == a3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        j.d(bounds2, "oemFeature.bounds");
        return new C0331c(new C0295b(bounds2), c0330b, c0330b2);
    }

    public static g0.j b(Context context, WindowLayoutInfo info) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        j.e(info, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            if (i3 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i4 = m.f5036b;
            return c(m.a((Activity) context), info);
        }
        int i5 = m.f5036b;
        if (i3 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z = context2 instanceof Activity;
                if (!z && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        j.d(context2, "iterator.baseContext");
                    }
                }
                if (z) {
                    kVar = m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    j.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i6 = Build.VERSION.SDK_INT;
                    W b3 = (i6 >= 34 ? new J() : i6 >= 31 ? new I() : i6 >= 30 ? new H() : i6 >= 29 ? new F() : new D()).b();
                    j.d(b3, "Builder().build()");
                    kVar = new k(new C0295b(rect), b3);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        W b4 = W.b(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        j.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new k(new C0295b(bounds), b4);
        return c(kVar, info);
    }

    public static g0.j c(k kVar, WindowLayoutInfo info) {
        C0331c c0331c;
        j.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        j.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                j.d(feature, "feature");
                c0331c = a(kVar, feature);
            } else {
                c0331c = null;
            }
            if (c0331c != null) {
                arrayList.add(c0331c);
            }
        }
        return new g0.j(arrayList);
    }
}
