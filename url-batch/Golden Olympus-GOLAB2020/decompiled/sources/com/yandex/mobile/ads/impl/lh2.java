package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.yandex.mobile.ads.impl.ew1;
import j2.AbstractC3185a;
import kotlin.KotlinVersion;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final wh2 f28592a = new wh2(new kf1(), new xh2());

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28593b = 0;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f28594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f28595b;

        a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f28594a = onPreDrawListener;
            this.f28595b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f28594a.onPreDraw();
            this.f28595b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public static final int a(int i4, float f4) {
        return Color.argb(kotlin.ranges.g.d(0, kotlin.ranges.g.g(KotlinVersion.MAX_COMPONENT_VALUE, (int) ((KotlinVersion.MAX_COMPONENT_VALUE * (100 - f4)) / 100.0f))), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    public static final float b(int i4, float f4) {
        return ((i4 + 0.0f) / f4) + 0.5f;
    }

    public static final boolean c(@Nullable View view) {
        if (view == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int width = view.getWidth() + i4;
        int i5 = iArr[1];
        Rect rect = new Rect(i4, i5, width, view.getHeight() + i5);
        Rect rect2 = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect2);
        } catch (NullPointerException unused) {
        }
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    public static final boolean d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isShown()) {
            if (!(view.getAlpha() == 0.0f)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static final int b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isShown()) {
            return f28592a.a(view);
        }
        return 0;
    }

    public static final int a(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC3185a.c(i4 / context.getResources().getDisplayMetrics().density);
    }

    public static final int d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) b(i4, context.getResources().getDisplayMetrics().density);
    }

    public static final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int c4 = c(context);
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) b(c4, context.getResources().getDisplayMetrics().density);
    }

    public static final void a(@NotNull View view, @NotNull ViewTreeObserver.OnPreDrawListener callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, callback));
    }

    public static final int a(@NotNull Context context, float f4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC3185a.c(TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics()));
    }

    public static final int a(@Nullable View view) {
        int b4;
        if (view == null || !view.isShown() || (b4 = b(view)) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (b4 * 100) / (height * width);
    }

    public static final int c(@NotNull Context context) {
        Object m243constructorimpl;
        int i4;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && a4.I()) {
            try {
                Result.Companion companion = Result.Companion;
                Object systemService = context.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i4 = bounds.height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    i4 = displayMetrics.heightPixels;
                }
                m243constructorimpl = Result.m243constructorimpl(Integer.valueOf(i4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Integer valueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = valueOf;
            }
            return ((Number) m243constructorimpl).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final boolean a(@Nullable View view, int i4) {
        return a(view) >= i4;
    }

    public static final void a(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int a(@NotNull Context context, @NotNull cf1 requestedOrientation) {
        cf1 cf1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestedOrientation, "requestedOrientation");
        cf1 b4 = xr.b(context);
        if (b4 != requestedOrientation && b4 != (cf1Var = cf1.f24194e) && (requestedOrientation != cf1Var || b4 == cf1.f24192c)) {
            return d(context);
        }
        return b(context);
    }
}
