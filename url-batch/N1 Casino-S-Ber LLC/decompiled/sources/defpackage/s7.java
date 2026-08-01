package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class s7 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final r7 i;
    public final SnackbarContentLayout j;
    public final m7 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final AccessibilityManager r;
    public final p7 s = new p7(this);
    public static final zi t = w2.b;
    public static final LinearInterpolator u = w2.a;
    public static final zi v = w2.d;
    public static final int[] x = {R.attr.snackbarStyle};
    public static final String y = s7.class.getSimpleName();
    public static final Handler w = new Handler(Looper.getMainLooper(), new l7());

    public s7(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.k = new m7(this, i);
        if (view == null) {
            t8.k("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            t8.k("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        o8.l(context, o8.o, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        r7 r7Var = (r7) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = r7Var;
        r7Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = r7Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.g.setTextColor(jw.I(jw.X(snackbarContentLayout2.getContext(), zo.L(snackbarContentLayout2, R.attr.colorSurface)), snackbarContentLayout2.g.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(r7Var.getMaxInlineActionWidth());
        }
        r7Var.addView(view);
        r7Var.setAccessibilityLiveRegion(1);
        r7Var.setImportantForAccessibility(1);
        r7Var.setFitsSystemWindows(true);
        n7 n7Var = new n7(this);
        WeakHashMap weakHashMap = x80.a;
        p80.c(r7Var, n7Var);
        x80.m(r7Var, new o7(i, this));
        this.r = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = o8.i0(context, R.attr.motionDurationLong2, 250);
        this.a = o8.i0(context, R.attr.motionDurationLong2, 150);
        this.b = o8.i0(context, R.attr.motionDurationMedium1, 75);
        this.d = o8.j0(context, R.attr.motionEasingEmphasizedInterpolator, u);
        this.f = o8.j0(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.e = o8.j0(context, R.attr.motionEasingEmphasizedInterpolator, t);
    }

    public final void a(int i) {
        we o = we.o();
        p7 p7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(p7Var)) {
                    o.e((y20) o.h, i);
                } else {
                    y20 y20Var = (y20) o.i;
                    if (y20Var != null && y20Var.a.get() == p7Var) {
                        o.e((y20) o.i, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        we o = we.o();
        p7 p7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(p7Var)) {
                    o.h = null;
                    if (((y20) o.i) != null) {
                        o.A();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        we o = we.o();
        p7 p7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(p7Var)) {
                    o.z((y20) o.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        r7 r7Var = this.i;
        if (z) {
            r7Var.post(new m7(this, 2));
            return;
        }
        if (r7Var.getParent() != null) {
            r7Var.setVisibility(0);
        }
        c();
    }

    public final void e() {
        r7 r7Var = this.i;
        ViewGroup.LayoutParams layoutParams = r7Var.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = y;
        if (!z) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (r7Var.o == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (r7Var.getParent() == null) {
            return;
        }
        int i = this.l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = r7Var.o;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.m;
        int i4 = rect.right + this.n;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            r7Var.requestLayout();
        }
        if ((z2 || this.p != this.o) && Build.VERSION.SDK_INT >= 29 && this.o > 0) {
            ViewGroup.LayoutParams layoutParams2 = r7Var.getLayoutParams();
            if ((layoutParams2 instanceof qd) && (((qd) layoutParams2).a instanceof SwipeDismissBehavior)) {
                m7 m7Var = this.k;
                r7Var.removeCallbacks(m7Var);
                r7Var.post(m7Var);
            }
        }
    }
}
