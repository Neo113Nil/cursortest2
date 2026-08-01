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
import com.trembin.nirefon.betfury.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class q8 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final p8 i;
    public final SnackbarContentLayout j;
    public int k;
    public final k8 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final AccessibilityManager s;
    public final n8 t = new n8(this);
    public static final ho u = o3.b;
    public static final LinearInterpolator v = o3.a;
    public static final ho w = o3.d;
    public static final int[] y = {R.attr.snackbarStyle};
    public static final String z = q8.class.getSimpleName();
    public static final Handler x = new Handler(Looper.getMainLooper(), new j8());

    public q8(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.l = new k8(this, i);
        if (view == null) {
            s9.k("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            s9.k("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        d50.h(context, d50.h, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        p8 p8Var = (p8) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = p8Var;
        p8Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = p8Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.g.setTextColor(bi.J(bi.W(snackbarContentLayout2.getContext(), n9.M(snackbarContentLayout2, R.attr.colorSurface)), snackbarContentLayout2.g.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(p8Var.getMaxInlineActionWidth());
        }
        p8Var.addView(view);
        p8Var.setAccessibilityLiveRegion(1);
        p8Var.setImportantForAccessibility(1);
        p8Var.setFitsSystemWindows(true);
        l8 l8Var = new l8(this);
        WeakHashMap weakHashMap = hm0.a;
        zl0.c(p8Var, l8Var);
        hm0.m(p8Var, new m8(i, this));
        this.s = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = d50.R(context, R.attr.motionDurationLong2, 250);
        this.a = d50.R(context, R.attr.motionDurationLong2, 150);
        this.b = d50.R(context, R.attr.motionDurationMedium1, 75);
        this.d = d50.S(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = d50.S(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.e = d50.S(context, R.attr.motionEasingEmphasizedInterpolator, u);
    }

    public final void a(int i) {
        wi i2 = wi.i();
        n8 n8Var = this.t;
        synchronized (i2.f) {
            try {
                if (i2.l(n8Var)) {
                    i2.d((de0) i2.h, i);
                } else {
                    de0 de0Var = (de0) i2.i;
                    if (de0Var != null && de0Var.a.get() == n8Var) {
                        i2.d((de0) i2.i, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        wi i = wi.i();
        n8 n8Var = this.t;
        synchronized (i.f) {
            try {
                if (i.l(n8Var)) {
                    i.h = null;
                    if (((de0) i.i) != null) {
                        i.t();
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
        wi i = wi.i();
        n8 n8Var = this.t;
        synchronized (i.f) {
            try {
                if (i.l(n8Var)) {
                    i.s((de0) i.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        p8 p8Var = this.i;
        if (z2) {
            p8Var.post(new k8(this, 2));
            return;
        }
        if (p8Var.getParent() != null) {
            p8Var.setVisibility(0);
        }
        c();
    }

    public final void e() {
        p8 p8Var = this.i;
        ViewGroup.LayoutParams layoutParams = p8Var.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = z;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (p8Var.o == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (p8Var.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = p8Var.o;
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
            p8Var.requestLayout();
        }
        if ((z3 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = p8Var.getLayoutParams();
            if ((layoutParams2 instanceof kg) && (((kg) layoutParams2).a instanceof SwipeDismissBehavior)) {
                k8 k8Var = this.l;
                p8Var.removeCallbacks(k8Var);
                p8Var.post(k8Var);
            }
        }
    }
}
