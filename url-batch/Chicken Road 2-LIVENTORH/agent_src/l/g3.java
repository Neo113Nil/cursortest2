package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.oriondriftchasers.arordrft.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p, reason: collision with root package name */
    public static g3 f2309p;

    /* renamed from: q, reason: collision with root package name */
    public static g3 f2310q;

    /* renamed from: f, reason: collision with root package name */
    public final View f2311f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2312g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2313h;
    public final f3 i;

    /* renamed from: j, reason: collision with root package name */
    public final f3 f2314j;

    /* renamed from: k, reason: collision with root package name */
    public int f2315k;

    /* renamed from: l, reason: collision with root package name */
    public int f2316l;

    /* renamed from: m, reason: collision with root package name */
    public h3 f2317m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2318n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2319o;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.f3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.f3] */
    public g3(View view, CharSequence charSequence) {
        final int i = 0;
        this.i = new Runnable(this) { // from class: l.f3

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ g3 f2305g;

            {
                this.f2305g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f2305g.c(false);
                        break;
                    default:
                        this.f2305g.a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f2314j = new Runnable(this) { // from class: l.f3

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ g3 f2305g;

            {
                this.f2305g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f2305g.c(false);
                        break;
                    default:
                        this.f2305g.a();
                        break;
                }
            }
        };
        this.f2311f = view;
        this.f2312g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = n0.m0.f2762a;
        this.f2313h = Build.VERSION.SDK_INT >= 28 ? g0.a.g(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2319o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(g3 g3Var) {
        g3 g3Var2 = f2309p;
        if (g3Var2 != null) {
            g3Var2.f2311f.removeCallbacks(g3Var2.i);
        }
        f2309p = g3Var;
        if (g3Var != null) {
            g3Var.f2311f.postDelayed(g3Var.i, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        g3 g3Var = f2310q;
        View view = this.f2311f;
        if (g3Var == this) {
            f2310q = null;
            h3 h3Var = this.f2317m;
            if (h3Var != null) {
                View view2 = h3Var.f2338b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) h3Var.f2337a).getSystemService("window")).removeView(view2);
                }
                this.f2317m = null;
                this.f2319o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2309p == this) {
            b(null);
        }
        view.removeCallbacks(this.f2314j);
    }

    public final void c(boolean z3) {
        int height;
        int i;
        int i4;
        boolean z4;
        int i5;
        int i6;
        long longPressTimeout;
        long j4;
        long j5;
        View view = this.f2311f;
        if (view.isAttachedToWindow()) {
            b(null);
            g3 g3Var = f2310q;
            if (g3Var != null) {
                g3Var.a();
            }
            f2310q = this;
            this.f2318n = z3;
            h3 h3Var = new h3(view.getContext());
            Context context = (Context) h3Var.f2337a;
            this.f2317m = h3Var;
            int i7 = this.f2315k;
            int i8 = this.f2316l;
            boolean z5 = this.f2318n;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) h3Var.d;
            View view2 = h3Var.f2338b;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            h3Var.f2339c.setText(this.f2312g);
            int[] iArr = (int[]) h3Var.f2342g;
            int[] iArr2 = (int[]) h3Var.f2341f;
            Rect rect = (Rect) h3Var.f2340e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i7 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i8 + dimensionPixelOffset2;
                i = i8 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z5 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i9 = i7;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i6 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i;
                    z4 = z5;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i4 = i;
                    z4 = z5;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i10;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i10 + i9) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[i6];
                int i12 = ((i11 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i12 >= 0) {
                        layoutParams.y = i12;
                    } else {
                        layoutParams.y = i13;
                    }
                } else if (measuredHeight + i13 <= rect.height()) {
                    layoutParams.y = i13;
                } else {
                    layoutParams.y = i12;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f2318n) {
                j5 = 2500;
            } else {
                WeakHashMap weakHashMap = n0.l0.f2757a;
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            f3 f3Var = this.f2314j;
            view.removeCallbacks(f3Var);
            view.postDelayed(f3Var, j5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2316l) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2317m == null || !this.f2318n) {
            View view2 = this.f2311f;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f2319o = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f2317m == null) {
                    int x3 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (!this.f2319o) {
                        int abs = Math.abs(x3 - this.f2315k);
                        int i = this.f2313h;
                        if (abs <= i) {
                        }
                    }
                    this.f2315k = x3;
                    this.f2316l = y3;
                    this.f2319o = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2315k = view.getWidth() / 2;
        this.f2316l = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
