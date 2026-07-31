package k;

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
import com.strategylink.Row.Five.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static u0 f5120j;

    /* renamed from: k, reason: collision with root package name */
    public static u0 f5121k;

    /* renamed from: a, reason: collision with root package name */
    public final View f5122a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f5123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5124c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f5125d = new t0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final t0 f5126e = new t0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f5127f;

    /* renamed from: g, reason: collision with root package name */
    public int f5128g;

    /* renamed from: h, reason: collision with root package name */
    public v0 f5129h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5130i;

    public u0(View view, CharSequence charSequence) {
        this.f5122a = view;
        this.f5123b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i7 = D.G.f242a;
        this.f5124c = Build.VERSION.SDK_INT >= 28 ? D.E.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f5127f = Integer.MAX_VALUE;
        this.f5128g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(u0 u0Var) {
        u0 u0Var2 = f5120j;
        if (u0Var2 != null) {
            u0Var2.f5122a.removeCallbacks(u0Var2.f5125d);
        }
        f5120j = u0Var;
        if (u0Var != null) {
            u0Var.f5122a.postDelayed(u0Var.f5125d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        u0 u0Var = f5121k;
        View view = this.f5122a;
        if (u0Var == this) {
            f5121k = null;
            v0 v0Var = this.f5129h;
            if (v0Var != null) {
                View view2 = (View) v0Var.f5137g;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) v0Var.f5136f).getSystemService("window")).removeView(view2);
                }
                this.f5129h = null;
                this.f5127f = Integer.MAX_VALUE;
                this.f5128g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f5120j == this) {
            b(null);
        }
        view.removeCallbacks(this.f5126e);
    }

    public final void c(boolean z5) {
        int height;
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        long longPressTimeout;
        long j4;
        long j7;
        Field field = D.D.f240a;
        View view = this.f5122a;
        if (view.isAttachedToWindow()) {
            b(null);
            u0 u0Var = f5121k;
            if (u0Var != null) {
                u0Var.a();
            }
            f5121k = this;
            this.f5130i = z5;
            Context context = view.getContext();
            v0 v0Var = new v0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            v0Var.f5139i = layoutParams;
            v0Var.f5140j = new Rect();
            v0Var.f5141k = new int[2];
            v0Var.f5142l = new int[2];
            v0Var.f5136f = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            v0Var.f5137g = inflate;
            v0Var.f5138h = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(v0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) v0Var.f5137g;
            Context context2 = (Context) v0Var.f5136f;
            this.f5129h = v0Var;
            int i11 = this.f5127f;
            int i12 = this.f5128g;
            boolean z7 = this.f5130i;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) v0Var.f5139i;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) v0Var.f5138h).setText(this.f5123b);
            int[] iArr = (int[]) v0Var.f5142l;
            int[] iArr2 = (int[]) v0Var.f5141k;
            Rect rect = (Rect) v0Var.f5140j;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i11 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i7 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i13 = i11;
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
                i10 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i8 = i7;
                    z6 = z7;
                    i9 = 0;
                    i10 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i10 = 1;
                    i8 = i7;
                    z6 = z7;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i9 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i9] - iArr[i9];
                iArr2[i9] = i14;
                iArr2[i10] = iArr2[i10] - iArr[i10];
                layoutParams2.x = (i14 + i13) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i10];
                int i16 = ((i15 + i8) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z6) {
                    if (i16 >= 0) {
                        layoutParams2.y = i16;
                    } else {
                        layoutParams2.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams2.y = i17;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f5130i) {
                j7 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i10) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j7 = j4 - longPressTimeout;
            }
            t0 t0Var = this.f5126e;
            view.removeCallbacks(t0Var);
            view.postDelayed(t0Var, j7);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f5129h == null || !this.f5130i) {
            View view2 = this.f5122a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f5127f = Integer.MAX_VALUE;
                        this.f5128g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f5129h == null) {
                    int x6 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int abs = Math.abs(x6 - this.f5127f);
                    int i7 = this.f5124c;
                    if (abs > i7 || Math.abs(y - this.f5128g) > i7) {
                        this.f5127f = x6;
                        this.f5128g = y;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f5127f = view.getWidth() / 2;
        this.f5128g = view.getHeight() / 2;
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
