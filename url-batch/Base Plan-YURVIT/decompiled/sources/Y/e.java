package Y;

import P0.h;
import W.k;
import W.l;
import W.n;
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
import y.C0255E;
import y.C0256F;
import y.G;
import y.Q;

/* loaded from: classes.dex */
public abstract class e {
    public static W.c a(l lVar, FoldingFeature foldingFeature) {
        W.b bVar;
        W.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = W.b.f876k;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = W.b.f877l;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = W.b.f874i;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = W.b.f875j;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        if (i2 > i4) {
            throw new IllegalArgumentException(L.d.f("Left must be less than or equal to right, left: ", i2, ", right: ", i4).toString());
        }
        if (i3 > i5) {
            throw new IllegalArgumentException(L.d.f("top must be less than or equal to bottom, top: ", i3, ", bottom: ", i5).toString());
        }
        Rect a2 = lVar.f900a.a();
        int i6 = i5 - i3;
        if (i6 == 0 && i4 - i2 == 0) {
            return null;
        }
        int i7 = i4 - i2;
        if (i7 != a2.width() && i6 != a2.height()) {
            return null;
        }
        if (i7 < a2.width() && i6 < a2.height()) {
            return null;
        }
        if (i7 == a2.width() && i6 == a2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new W.c(new T.b(bounds2), bVar, bVar2);
    }

    public static k b(l lVar, WindowLayoutInfo windowLayoutInfo) {
        W.c cVar;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVar = a(lVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }

    public static k c(Context context, WindowLayoutInfo windowLayoutInfo) {
        l lVar;
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
            int i3 = n.f903b;
            return b(n.a((Activity) context), windowLayoutInfo);
        }
        int i4 = n.f903b;
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
                    lVar = n.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i5 = Build.VERSION.SDK_INT;
                    Q b2 = (i5 >= 30 ? new G() : i5 >= 29 ? new C0256F() : new C0255E()).b();
                    h.d(b2, "Builder().build()");
                    lVar = new l(new T.b(rect), b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Q a2 = Q.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(new T.b(bounds), a2);
        return b(lVar, windowLayoutInfo);
    }
}
