package A1;

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
import kotlin.jvm.internal.i;
import y1.k;
import y1.l;
import y1.n;

/* loaded from: classes.dex */
public abstract class e {
    public static y1.c a(l lVar, FoldingFeature foldingFeature) {
        y1.b bVar;
        y1.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = y1.b.f16233h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = y1.b.f16234i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = y1.b.f16231f;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = y1.b.f16232g;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        if (i4 > i6) {
            throw new IllegalArgumentException(AbstractC0005f.i(i4, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i5 > i7) {
            throw new IllegalArgumentException(AbstractC0005f.i(i5, i7, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect a3 = lVar.f16256a.a();
        int i8 = i7 - i5;
        if (i8 == 0 && i6 - i4 == 0) {
            return null;
        }
        int i9 = i6 - i4;
        if (i9 != a3.width() && i8 != a3.height()) {
            return null;
        }
        if (i9 < a3.width() && i8 < a3.height()) {
            return null;
        }
        if (i9 == a3.width() && i8 == a3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new y1.c(new v1.b(bounds2), bVar, bVar2);
    }

    public static k b(Context context, WindowLayoutInfo info) {
        l lVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(info, "info");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            if (i4 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i5 = n.f16259b;
            return c(n.a((Activity) context), info);
        }
        int i6 = n.f16259b;
        if (i4 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z = context2 instanceof Activity;
                if (!z && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        i.d(context2, "iterator.baseContext");
                    }
                }
                if (z) {
                    lVar = n.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    i.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i7 = Build.VERSION.SDK_INT;
                    e0 b4 = (i7 >= 34 ? new Q() : i7 >= 31 ? new P() : i7 >= 30 ? new O() : i7 >= 29 ? new N() : new L()).b();
                    i.d(b4, "Builder().build()");
                    lVar = new l(new v1.b(rect), b4);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        e0 a3 = e0.a(null, windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(new v1.b(bounds), a3);
        return c(lVar, info);
    }

    public static k c(l lVar, WindowLayoutInfo info) {
        y1.c cVar;
        i.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                i.d(feature, "feature");
                cVar = a(lVar, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }
}
