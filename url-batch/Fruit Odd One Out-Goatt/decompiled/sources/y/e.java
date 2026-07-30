package y;

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
import f0.l;
import java.util.ArrayList;
import java.util.List;
import l.g;
import l.h;
import l.r;
import w.j;
import w.k;
import w.m;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class e {
    public static w.c a(k kVar, FoldingFeature foldingFeature) {
        w.b bVar;
        w.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = w.b.f1203h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = w.b.f1204i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = w.b.f1201f;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = w.b.f1202g;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        if (i2 > i4) {
            l.e("Left must be less than or equal to right, left: ", i2, ", right: ", i4);
            return null;
        }
        if (i3 > i5) {
            l.e("top must be less than or equal to bottom, top: ", i3, ", bottom: ", i5);
            return null;
        }
        Rect a2 = kVar.f1223a.a();
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
        bounds2.getClass();
        return new w.c(new t.b(bounds2), bVar, bVar2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        windowLayoutInfo.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = m.f1226b;
            return c(m.a((Activity) context), windowLayoutInfo);
        }
        int i4 = m.f1226b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z2 = context2 instanceof Activity;
                if (!z2 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        context2.getClass();
                    }
                }
                if (z2) {
                    kVar = m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    systemService.getClass();
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    defaultDisplay.getClass();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i5 = Build.VERSION.SDK_INT;
                    r b2 = (i5 >= 30 ? new h() : i5 >= 29 ? new g() : new l.f()).b();
                    b2.getClass();
                    kVar = new k(new t.b(rect), b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        r a2 = r.a(windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        bounds.getClass();
        kVar = new k(new t.b(bounds), a2);
        return c(kVar, windowLayoutInfo);
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        w.c cVar;
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                cVar = a(kVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new j(arrayList);
    }
}
