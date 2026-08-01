package w;

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
import e0.h;
import java.util.ArrayList;
import java.util.List;
import l.g;
import l.q;
import u.C0088b;
import u.C0089c;
import u.k;
import u.l;
import u.n;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099e {
    public static C0089c a(l lVar, FoldingFeature foldingFeature) {
        C0088b c0088b;
        C0088b c0088b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0088b = C0088b.f1264h;
        } else {
            if (type != 2) {
                return null;
            }
            c0088b = C0088b.f1265i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0088b2 = C0088b.f1262f;
        } else {
            if (state != 2) {
                return null;
            }
            c0088b2 = C0088b.f1263g;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        r.b bVar = new r.b(bounds);
        Rect c2 = lVar.f1288a.c();
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
        return new C0089c(new r.b(bounds2), c0088b, c0088b2);
    }

    public static k b(Context context, WindowLayoutInfo windowLayoutInfo) {
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
            int i3 = n.f1291b;
            return c(n.a((Activity) context), windowLayoutInfo);
        }
        int i4 = n.f1291b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z = context2 instanceof Activity;
                if (!z && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        h.d(context2, "iterator.baseContext");
                    }
                }
                if (z) {
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
                    q b2 = (i5 >= 30 ? new g() : i5 >= 29 ? new l.f() : new l.e()).b();
                    h.d(b2, "Builder().build()");
                    lVar = new l(rect, b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        q a2 = q.a(null, windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(bounds, a2);
        return c(lVar, windowLayoutInfo);
    }

    public static k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        C0089c c0089c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0089c = a(lVar, foldingFeature);
            } else {
                c0089c = null;
            }
            if (c0089c != null) {
                arrayList.add(c0089c);
            }
        }
        return new k(arrayList);
    }
}
