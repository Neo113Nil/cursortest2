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
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.moontiko.really.admiralcasino.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class f8 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final e8 i;
    public final SnackbarContentLayout j;
    public c8 k;
    public final y7 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final AccessibilityManager t;
    public final b8 u = new b8(this);
    public static final hl v = g3.b;
    public static final LinearInterpolator w = g3.a;
    public static final hl x = g3.d;
    public static final int[] z = {R.attr.snackbarStyle};
    public static final String A = f8.class.getSimpleName();
    public static final Handler y = new Handler(Looper.getMainLooper(), new x7());

    public f8(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.l = new y7(this, i);
        if (view == null) {
            g9.i("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            g9.i("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        la0.n(context, la0.p, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        e8 e8Var = (e8) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = e8Var;
        e8Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = e8Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.g.setTextColor(xf.z(xf.G(snackbarContentLayout2.getContext(), b9.N(snackbarContentLayout2, R.attr.colorSurface)), snackbarContentLayout2.g.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(e8Var.getMaxInlineActionWidth());
        }
        e8Var.addView(view);
        e8Var.setAccessibilityLiveRegion(1);
        e8Var.setImportantForAccessibility(1);
        e8Var.setFitsSystemWindows(true);
        z7 z7Var = new z7(this);
        WeakHashMap weakHashMap = ic0.a;
        ac0.c(e8Var, z7Var);
        ic0.m(e8Var, new a8(i, this));
        this.t = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = kr.W(context, R.attr.motionDurationLong2, 250);
        this.a = kr.W(context, R.attr.motionDurationLong2, 150);
        this.b = kr.W(context, R.attr.motionDurationMedium1, 75);
        this.d = kr.X(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.f = kr.X(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.e = kr.X(context, R.attr.motionEasingEmphasizedInterpolator, v);
    }

    public final void a(int i) {
        rg o = rg.o();
        b8 b8Var = this.u;
        synchronized (o.f) {
            try {
                if (o.q(b8Var)) {
                    o.e((a60) o.h, i);
                } else {
                    a60 a60Var = (a60) o.i;
                    if (a60Var != null && a60Var.a.get() == b8Var) {
                        o.e((a60) o.i, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View b() {
        c8 c8Var = this.k;
        if (c8Var == null) {
            return null;
        }
        return (View) c8Var.g.get();
    }

    public final void c() {
        rg o = rg.o();
        b8 b8Var = this.u;
        synchronized (o.f) {
            try {
                if (o.q(b8Var)) {
                    o.h = null;
                    if (((a60) o.i) != null) {
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

    public final void d() {
        rg o = rg.o();
        b8 b8Var = this.u;
        synchronized (o.f) {
            try {
                if (o.q(b8Var)) {
                    o.z((a60) o.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        e8 e8Var = this.i;
        if (z2) {
            e8Var.post(new y7(this, 2));
            return;
        }
        if (e8Var.getParent() != null) {
            e8Var.setVisibility(0);
        }
        d();
    }

    public final void f() {
        e8 e8Var = this.i;
        ViewGroup.LayoutParams layoutParams = e8Var.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = A;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (e8Var.o == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (e8Var.getParent() == null) {
            return;
        }
        int i = b() != null ? this.p : this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = e8Var.o;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            e8Var.requestLayout();
        }
        if ((z3 || this.r != this.q) && Build.VERSION.SDK_INT >= 29 && this.q > 0) {
            ViewGroup.LayoutParams layoutParams2 = e8Var.getLayoutParams();
            if ((layoutParams2 instanceof re) && (((re) layoutParams2).a instanceof SwipeDismissBehavior) && b() == null) {
                y7 y7Var = this.l;
                e8Var.removeCallbacks(y7Var);
                e8Var.post(y7Var);
            }
        }
    }
}
