package C0;

import A0.l;
import A0.m;
import C4.p;
import I.a0;
import I.b0;
import I.c0;
import I.d0;
import I.e0;
import I.f0;
import I.g0;
import I.v0;
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
import kotlin.jvm.internal.Intrinsics;
import x0.C0995b;

/* loaded from: classes.dex */
public abstract class e {
    public static A0.c a(m windowMetrics, FoldingFeature oemFeature) {
        A0.b bVar;
        A0.b bVar2;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVar = A0.b.f54o;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = A0.b.f55p;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar2 = A0.b.f52m;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = A0.b.f53n;
        }
        Rect rect = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(rect, "oemFeature.bounds");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i2 = rect.left;
        int i5 = rect.top;
        int i7 = rect.right;
        int i8 = rect.bottom;
        if (i2 > i7) {
            throw new IllegalArgumentException(p.j("Left must be less than or equal to right, left: ", ", right: ", i2, i7).toString());
        }
        if (i5 > i8) {
            throw new IllegalArgumentException(p.j("top must be less than or equal to bottom, top: ", ", bottom: ", i5, i8).toString());
        }
        Rect a7 = windowMetrics.f81a.a();
        int i9 = i8 - i5;
        if (i9 == 0 && i7 - i2 == 0) {
            return null;
        }
        int i10 = i7 - i2;
        if (i10 != a7.width() && i9 != a7.height()) {
            return null;
        }
        if (i10 < a7.width() && i9 < a7.height()) {
            return null;
        }
        if (i10 == a7.width() && i9 == a7.height()) {
            return null;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        return new A0.c(new C0995b(bounds), bVar, bVar2);
    }

    public static l b(m windowMetrics, WindowLayoutInfo info) {
        A0.c cVar;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                cVar = a(windowMetrics, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new l(arrayList);
    }

    public static l c(Context context, WindowLayoutInfo info) {
        m mVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            A0.p pVar = A0.p.f84b;
            return b(A0.p.a((Activity) context), info);
        }
        A0.p pVar2 = A0.p.f84b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i2 < 30) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z7 = context2 instanceof Activity;
                if (!z7 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "iterator.baseContext");
                    }
                }
                if (z7) {
                    mVar = A0.p.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    Intrinsics.checkNotNullExpressionValue(defaultDisplay, "wm.defaultDisplay");
                    Point c7 = A0.p.c(defaultDisplay);
                    Rect rect = new Rect(0, 0, c7.x, c7.y);
                    int i5 = Build.VERSION.SDK_INT;
                    v0 b7 = (i5 >= 36 ? new g0() : i5 >= 35 ? new f0() : i5 >= 34 ? new e0() : i5 >= 31 ? new d0() : i5 >= 30 ? new c0() : i5 >= 29 ? new b0() : new a0()).b();
                    Intrinsics.checkNotNullExpressionValue(b7, "Builder().build()");
                    mVar = new m(rect, b7);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        v0 c8 = v0.c(windowInsets, null);
        Intrinsics.checkNotNullExpressionValue(c8, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
        mVar = new m(bounds, c8);
        return b(mVar, info);
    }
}
