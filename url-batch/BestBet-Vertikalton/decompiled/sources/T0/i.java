package T0;

import K.F;
import K.Q;
import a0.C0057a;
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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.fortunequest.neontrack.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1051c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1053f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f1054g;
    public final Context h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final SnackbarContentLayout f1055j;

    /* renamed from: k, reason: collision with root package name */
    public int f1056k;

    /* renamed from: m, reason: collision with root package name */
    public int f1058m;

    /* renamed from: n, reason: collision with root package name */
    public int f1059n;

    /* renamed from: o, reason: collision with root package name */
    public int f1060o;

    /* renamed from: p, reason: collision with root package name */
    public int f1061p;

    /* renamed from: q, reason: collision with root package name */
    public int f1062q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1063r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f1064s;

    /* renamed from: u, reason: collision with root package name */
    public static final C0057a f1043u = AbstractC0395a.f4571b;

    /* renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f1044v = AbstractC0395a.f4570a;

    /* renamed from: w, reason: collision with root package name */
    public static final C0057a f1045w = AbstractC0395a.d;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1047y = {R.attr.snackbarStyle};

    /* renamed from: z, reason: collision with root package name */
    public static final String f1048z = i.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    public static final Handler f1046x = new Handler(Looper.getMainLooper(), new c());

    /* renamed from: l, reason: collision with root package name */
    public final d f1057l = new d(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final f f1065t = new f(this);

    public i(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f1054g = viewGroup;
        this.f1055j = snackbarContentLayout2;
        this.h = context;
        L0.k.c(context, L0.k.f775a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1047y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        h hVar = (h) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = hVar;
        hVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = hVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f2358b.setTextColor(H1.l.Q(actionTextColorAlpha, H1.l.A(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f2358b.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(hVar.getMaxInlineActionWidth());
        hVar.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = Q.f578a;
        hVar.setAccessibilityLiveRegion(1);
        hVar.setImportantForAccessibility(1);
        hVar.setFitsSystemWindows(true);
        F.u(hVar, new e(this));
        Q.l(hVar, new D0.e(3, this));
        this.f1064s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f1051c = H1.l.b0(context, R.attr.motionDurationLong2, 250);
        this.f1049a = H1.l.b0(context, R.attr.motionDurationLong2, 150);
        this.f1050b = H1.l.b0(context, R.attr.motionDurationMedium1, 75);
        this.d = H1.l.c0(context, R.attr.motionEasingEmphasizedInterpolator, f1044v);
        this.f1053f = H1.l.c0(context, R.attr.motionEasingEmphasizedInterpolator, f1045w);
        this.f1052e = H1.l.c0(context, R.attr.motionEasingEmphasizedInterpolator, f1043u);
    }

    public final void a(int i) {
        m m2 = m.m();
        f fVar = this.f1065t;
        synchronized (m2.f1073a) {
            try {
                if (m2.o(fVar)) {
                    m2.c((l) m2.f1075c, i);
                } else {
                    l lVar = (l) m2.d;
                    if (lVar != null && lVar.f1069a.get() == fVar) {
                        m2.c((l) m2.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        m m2 = m.m();
        f fVar = this.f1065t;
        synchronized (m2.f1073a) {
            try {
                if (m2.o(fVar)) {
                    m2.f1075c = null;
                    if (((l) m2.d) != null) {
                        m2.y();
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
        m m2 = m.m();
        f fVar = this.f1065t;
        synchronized (m2.f1073a) {
            try {
                if (m2.o(fVar)) {
                    m2.x((l) m2.f1075c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.f1064s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        h hVar = this.i;
        if (z2) {
            hVar.post(new d(this, 2));
            return;
        }
        if (hVar.getParent() != null) {
            hVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        h hVar = this.i;
        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f1048z;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (hVar.f1041j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (hVar.getParent() == null) {
            return;
        }
        int i = this.f1058m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = hVar.f1041j;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.f1059n;
        int i4 = rect.right + this.f1060o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            hVar.requestLayout();
        }
        if ((z3 || this.f1062q != this.f1061p) && Build.VERSION.SDK_INT >= 29 && this.f1061p > 0) {
            ViewGroup.LayoutParams layoutParams2 = hVar.getLayoutParams();
            if ((layoutParams2 instanceof x.d) && (((x.d) layoutParams2).f4525a instanceof SwipeDismissBehavior)) {
                d dVar = this.f1057l;
                hVar.removeCallbacks(dVar);
                hVar.post(dVar);
            }
        }
    }
}
