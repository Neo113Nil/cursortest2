package x;

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
import s.C0094b;
import v.C0099b;
import v.C0100c;
import v.C0108k;
import v.C0109l;
import v.C0111n;

/* loaded from: classes.dex */
public abstract class e {
    public static C0100c a(C0109l c0109l, FoldingFeature foldingFeature) {
        C0099b c0099b;
        C0099b c0099b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0099b = C0099b.f1267h;
        } else {
            if (type != 2) {
                return null;
            }
            c0099b = C0099b.f1268i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0099b2 = C0099b.f1265f;
        } else {
            if (state != 2) {
                return null;
            }
            c0099b2 = C0099b.f1266g;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        C0094b c0094b = new C0094b(bounds);
        Rect c2 = c0109l.f1291a.c();
        if (c0094b.a() == 0 && c0094b.b() == 0) {
            return null;
        }
        if (c0094b.b() != c2.width() && c0094b.a() != c2.height()) {
            return null;
        }
        if (c0094b.b() < c2.width() && c0094b.a() < c2.height()) {
            return null;
        }
        if (c0094b.b() == c2.width() && c0094b.a() == c2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new C0100c(new C0094b(bounds2), c0099b, c0099b2);
    }

    public static C0108k b(Context context, WindowLayoutInfo windowLayoutInfo) {
        C0109l c0109l;
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
            int i3 = C0111n.f1294b;
            return c(C0111n.a((Activity) context), windowLayoutInfo);
        }
        int i4 = C0111n.f1294b;
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
                    c0109l = C0111n.a((Activity) context);
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
                    c0109l = new C0109l(rect, b2);
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
        c0109l = new C0109l(bounds, a2);
        return c(c0109l, windowLayoutInfo);
    }

    public static C0108k c(C0109l c0109l, WindowLayoutInfo windowLayoutInfo) {
        C0100c c0100c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0100c = a(c0109l, foldingFeature);
            } else {
                c0100c = null;
            }
            if (c0100c != null) {
                arrayList.add(c0100c);
            }
        }
        return new C0108k(arrayList);
    }
}
