package h0;

import D.K;
import D.M;
import D.N;
import D.Y;
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
import c0.C0269b;
import f0.C0362b;
import f0.j;
import f0.k;
import f0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class e {
    public static f0.c a(k kVar, FoldingFeature foldingFeature) {
        C0362b c0362b;
        C0362b c0362b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0362b = C0362b.f4172l;
        } else {
            if (type != 2) {
                return null;
            }
            c0362b = C0362b.f4173m;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0362b2 = C0362b.f4170j;
        } else {
            if (state != 2) {
                return null;
            }
            c0362b2 = C0362b.f4171k;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        int i7 = bounds.left;
        int i8 = bounds.top;
        int i9 = bounds.right;
        int i10 = bounds.bottom;
        if (i7 > i9) {
            throw new IllegalArgumentException(C1.c.f(i7, i9, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i8 > i10) {
            throw new IllegalArgumentException(C1.c.f(i8, i10, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect a7 = kVar.f4194a.a();
        int i11 = i10 - i8;
        if (i11 == 0 && i9 - i7 == 0) {
            return null;
        }
        int i12 = i9 - i7;
        if (i12 != a7.width() && i11 != a7.height()) {
            return null;
        }
        if (i12 < a7.width() && i11 < a7.height()) {
            return null;
        }
        if (i12 == a7.width() && i11 == a7.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new f0.c(new C0269b(bounds2), c0362b, c0362b2);
    }

    public static j b(Context context, WindowLayoutInfo info) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(info, "info");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            if (i7 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i8 = m.f4197b;
            return c(m.a((Activity) context), info);
        }
        int i9 = m.f4197b;
        if (i7 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z5 = context2 instanceof Activity;
                if (!z5 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        i.d(context2, "iterator.baseContext");
                    }
                }
                if (z5) {
                    kVar = m.a((Activity) context);
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
                    int i10 = Build.VERSION.SDK_INT;
                    Y b7 = (i10 >= 30 ? new N() : i10 >= 29 ? new M() : new K()).b();
                    i.d(b7, "Builder().build()");
                    kVar = new k(new C0269b(rect), b7);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Y c7 = Y.c(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new k(new C0269b(bounds), c7);
        return c(kVar, info);
    }

    public static j c(k kVar, WindowLayoutInfo info) {
        f0.c cVar;
        i.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                i.d(feature, "feature");
                cVar = a(kVar, feature);
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
