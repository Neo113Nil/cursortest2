package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fpk {
    private fph A;
    private final AccessibilityManager C;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final fpj j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final SnackbarContentLayout t;
    private final TimeInterpolator z;
    private static final TimeInterpolator v = fes.b;
    private static final TimeInterpolator w = fes.a;
    private static final TimeInterpolator x = fes.d;
    private static final int[] y = {R.attr.snackbarStyle};
    public static final String b = "fpk";
    static final Handler a = new Handler(Looper.getMainLooper(), new fpd());
    public final boolean l = false;
    private final Runnable B = new fnh(this, 4, null);
    public final kee u = new kee(this);

    protected fpk(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.t = snackbarContentLayout;
        this.i = context;
        fjw.b(context);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        fpj fpjVar = (fpj) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.j = fpjVar;
        fpjVar.a = this;
        float f = fpjVar.d;
        if (f != 1.0f) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(fhq.e(fhq.c(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((SnackbarContentLayout) view).d = fpjVar.e;
        fpjVar.addView(view);
        fpjVar.setAccessibilityLiveRegion(1);
        fpjVar.setImportantForAccessibility(1);
        fpjVar.setFitsSystemWindows(true);
        fpe fpeVar = new fpe(this, 0);
        int i = yq.a;
        yi.c(fpjVar, fpeVar);
        yq.l(fpjVar, new fpf(this));
        this.C = (AccessibilityManager) context.getSystemService("accessibility");
        this.e = fny.i(context, R.attr.motionDurationLong2, 250);
        this.c = fny.i(context, R.attr.motionDurationLong2, 150);
        this.d = fny.i(context, R.attr.motionDurationMedium1, 75);
        this.z = fny.p(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.g = fny.p(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.f = fny.p(context, R.attr.motionEasingEmphasizedInterpolator, v);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        fpj fpjVar = this.j;
        int height = fpjVar.getHeight();
        ViewGroup.LayoutParams layoutParams = fpjVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.z);
        ofFloat.addUpdateListener(new fpa(this, 0));
        return ofFloat;
    }

    public final View d() {
        fph fphVar = this.A;
        if (fphVar == null) {
            return null;
        }
        return (View) fphVar.a.get();
    }

    public final void e(int i) {
        fpp a2 = fpp.a();
        Object obj = a2.a;
        kee keeVar = this.u;
        synchronized (obj) {
            if (a2.g(keeVar)) {
                a2.d(a2.c, i);
            } else if (a2.h(keeVar)) {
                a2.d(a2.d, i);
            }
        }
    }

    final void f() {
        fpp a2 = fpp.a();
        Object obj = a2.a;
        kee keeVar = this.u;
        synchronized (obj) {
            if (a2.g(keeVar)) {
                a2.b(a2.c);
            }
        }
    }

    public final void g() {
        fpp a2 = fpp.a();
        Object obj = a2.a;
        int a3 = a();
        kee keeVar = this.u;
        synchronized (obj) {
            if (a2.g(keeVar)) {
                fpo fpoVar = a2.c;
                fpoVar.a = a3;
                a2.b.removeCallbacksAndMessages(fpoVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(keeVar)) {
                a2.d.a = a3;
            } else {
                a2.d = new fpo(a3, keeVar);
            }
            fpo fpoVar2 = a2.c;
            if (fpoVar2 == null || !a2.d(fpoVar2, 4)) {
                a2.c = null;
                a2.c();
            }
        }
    }

    public final void h() {
        boolean j = j();
        fpj fpjVar = this.j;
        if (j) {
            fpjVar.post(new fnh(this, 6, null));
            return;
        }
        if (fpjVar.getParent() != null) {
            fpjVar.setVisibility(0);
        }
        f();
    }

    public final void i() {
        fpj fpjVar = this.j;
        ViewGroup.LayoutParams layoutParams = fpjVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (fpjVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (fpjVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = fpjVar.f.bottom + (d() != null ? this.p : this.m);
        int i2 = fpjVar.f.left + this.n;
        int i3 = fpjVar.f.right + this.o;
        int i4 = fpjVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            fpjVar.requestLayout();
        } else if (this.r == this.q) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || this.q <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = fpjVar.getLayoutParams();
        if ((layoutParams2 instanceof tz) && (((tz) layoutParams2).a instanceof SwipeDismissBehavior) && d() == null) {
            Runnable runnable = this.B;
            fpjVar.removeCallbacks(runnable);
            fpjVar.post(runnable);
        }
    }

    final boolean j() {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void k() {
        fpp a2 = fpp.a();
        Object obj = a2.a;
        kee keeVar = this.u;
        synchronized (obj) {
            if (a2.g(keeVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        fpj fpjVar = this.j;
        ViewParent parent = fpjVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(fpjVar);
        }
    }

    public final void l(View view) {
        fph fphVar;
        fph fphVar2 = this.A;
        if (fphVar2 != null) {
            fphVar2.a();
        }
        if (view == null) {
            fphVar = null;
        } else {
            fph fphVar3 = new fph(this, view);
            if (view.isAttachedToWindow()) {
                fik.f(view, fphVar3);
            }
            view.addOnAttachStateChangeListener(fphVar3);
            fphVar = fphVar3;
        }
        this.A = fphVar;
    }
}
