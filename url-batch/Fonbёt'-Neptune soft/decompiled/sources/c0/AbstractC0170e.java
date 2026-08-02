package c0;

import A.G;
import A.I;
import A.J;
import A.T;
import Q0.h;
import a0.C0134b;
import a0.C0135c;
import a0.k;
import a0.l;
import a0.o;
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
import java.util.ArrayList;
import java.util.List;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0170e {
    public static C0135c a(l lVar, FoldingFeature foldingFeature) {
        C0134b c0134b;
        C0134b c0134b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0134b = C0134b.f1259k;
        } else {
            if (type != 2) {
                return null;
            }
            c0134b = C0134b.f1260l;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0134b2 = C0134b.f1257i;
        } else {
            if (state != 2) {
                return null;
            }
            c0134b2 = C0134b.f1258j;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        X.b bVar = new X.b(bounds);
        Rect c2 = lVar.f1283a.c();
        if (bVar.a() == 0 && bVar.b() == 0) {
            return null;
        }
        if (bVar.b() != c2.width() && bVar.a() != c2.height()) {
            return null;
        }
        if (bVar.b() < c2.width() && bVar.a() < c2.height()) {
            return null;
        }
        if (bVar.b() == c2.width() && bVar.a() == c2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new C0135c(new X.b(bounds2), c0134b, c0134b2);
    }

    public static k b(l lVar, WindowLayoutInfo windowLayoutInfo) {
        C0135c c0135c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0135c = a(lVar, foldingFeature);
            } else {
                c0135c = null;
            }
            if (c0135c != null) {
                arrayList.add(c0135c);
            }
        }
        return new k(arrayList);
    }

    public static k c(Context context, WindowLayoutInfo windowLayoutInfo) {
        l lVar;
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        h.e(windowLayoutInfo, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = o.f1287b;
            return b(o.a((Activity) context), windowLayoutInfo);
        }
        int i4 = o.f1287b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z2 = context2 instanceof Activity;
                if (!z2 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        h.d(context2, "iterator.baseContext");
                    }
                }
                if (z2) {
                    lVar = o.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService2 = context.getSystemService("window");
                    h.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i5 = Build.VERSION.SDK_INT;
                    T b2 = (i5 >= 30 ? new J() : i5 >= 29 ? new I() : new G()).b();
                    h.d(b2, "Builder().build()");
                    lVar = new l(rect, b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        systemService = context.getSystemService((Class<Object>) WindowManager.class);
        WindowManager windowManager = (WindowManager) systemService;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        T a2 = T.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(bounds, a2);
        return b(lVar, windowLayoutInfo);
    }
}
