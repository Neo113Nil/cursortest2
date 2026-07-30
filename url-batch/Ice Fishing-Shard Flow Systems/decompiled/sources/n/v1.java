package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public static v1 f6914s;

    /* renamed from: t, reason: collision with root package name */
    public static v1 f6915t;

    /* renamed from: d, reason: collision with root package name */
    public final View f6916d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f6917e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6918i;

    /* renamed from: l, reason: collision with root package name */
    public final u1 f6919l;

    /* renamed from: m, reason: collision with root package name */
    public final u1 f6920m;

    /* renamed from: n, reason: collision with root package name */
    public int f6921n;

    /* renamed from: o, reason: collision with root package name */
    public int f6922o;

    /* renamed from: p, reason: collision with root package name */
    public w1 f6923p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6924q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6925r;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.u1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [n.u1] */
    public v1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f6919l = new Runnable(this) { // from class: n.u1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ v1 f6910e;

            {
                this.f6910e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f6910e.c(false);
                        break;
                    default:
                        this.f6910e.a();
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f6920m = new Runnable(this) { // from class: n.u1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ v1 f6910e;

            {
                this.f6910e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f6910e.c(false);
                        break;
                    default:
                        this.f6910e.a();
                        break;
                }
            }
        };
        this.f6916d = view;
        this.f6917e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = I.U.f1158a;
        this.f6918i = Build.VERSION.SDK_INT >= 28 ? C.b.k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f6925r = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(v1 v1Var) {
        v1 v1Var2 = f6914s;
        if (v1Var2 != null) {
            v1Var2.f6916d.removeCallbacks(v1Var2.f6919l);
        }
        f6914s = v1Var;
        if (v1Var != null) {
            v1Var.f6916d.postDelayed(v1Var.f6919l, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        v1 v1Var = f6915t;
        View view = this.f6916d;
        if (v1Var == this) {
            f6915t = null;
            w1 w1Var = this.f6923p;
            if (w1Var != null) {
                View view2 = (View) w1Var.f6942e;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) w1Var.f6941d).getSystemService("window")).removeView(view2);
                }
                this.f6923p = null;
                this.f6925r = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f6914s == this) {
            b(null);
        }
        view.removeCallbacks(this.f6920m);
    }

    public final void c(boolean z7) {
        int height;
        int i2;
        int i5;
        boolean z8;
        int i7;
        int i8;
        long longPressTimeout;
        long j;
        long j7;
        WeakHashMap weakHashMap = I.T.f1153a;
        View view = this.f6916d;
        if (view.isAttachedToWindow()) {
            b(null);
            v1 v1Var = f6915t;
            if (v1Var != null) {
                v1Var.a();
            }
            f6915t = this;
            this.f6924q = z7;
            Context context = view.getContext();
            w1 w1Var = new w1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            w1Var.f6944l = layoutParams;
            w1Var.f6945m = new Rect();
            w1Var.f6946n = new int[2];
            w1Var.f6947o = new int[2];
            w1Var.f6941d = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            w1Var.f6942e = inflate;
            w1Var.f6943i = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(w1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) w1Var.f6942e;
            Context context2 = (Context) w1Var.f6941d;
            this.f6923p = w1Var;
            int i9 = this.f6921n;
            int i10 = this.f6922o;
            boolean z9 = this.f6924q;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) w1Var.f6944l;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) w1Var.f6943i).setText(this.f6917e);
            int[] iArr = (int[]) w1Var.f6947o;
            int[] iArr2 = (int[]) w1Var.f6946n;
            Rect rect = (Rect) w1Var.f6945m;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i10 + dimensionPixelOffset2;
                i2 = i10 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z9 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i11 = i9;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i8 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i5 = i2;
                    z8 = z9;
                    i7 = 0;
                    i8 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i8 = 1;
                    i5 = i2;
                    z8 = z9;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i7 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i7] - iArr[i7];
                iArr2[i7] = i12;
                iArr2[i8] = iArr2[i8] - iArr[i8];
                layoutParams2.x = (i12 + i11) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, i7);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i8];
                int i14 = ((i13 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z8) {
                    if (i14 >= 0) {
                        layoutParams2.y = i14;
                    } else {
                        layoutParams2.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i14;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f6924q) {
                j7 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i8) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j7 = j - longPressTimeout;
            }
            u1 u1Var = this.f6920m;
            view.removeCallbacks(u1Var);
            view.postDelayed(u1Var, j7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f6922o) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6923p == null || !this.f6924q) {
            View view2 = this.f6916d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f6925r = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f6923p == null) {
                    int x7 = (int) motionEvent.getX();
                    int y7 = (int) motionEvent.getY();
                    if (!this.f6925r) {
                        int abs = Math.abs(x7 - this.f6921n);
                        int i2 = this.f6918i;
                        if (abs <= i2) {
                        }
                    }
                    this.f6921n = x7;
                    this.f6922o = y7;
                    this.f6925r = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f6921n = view.getWidth() / 2;
        this.f6922o = view.getHeight() / 2;
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
