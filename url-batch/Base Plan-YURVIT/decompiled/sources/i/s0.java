package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.crane.slab.beam.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import y.AbstractC0252B;

/* loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static s0 f2299j;

    /* renamed from: k, reason: collision with root package name */
    public static s0 f2300k;

    /* renamed from: a, reason: collision with root package name */
    public final View f2301a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2303c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f2304d = new r0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final r0 f2305e = new r0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f2306f;

    /* renamed from: g, reason: collision with root package name */
    public int f2307g;

    /* renamed from: h, reason: collision with root package name */
    public t0 f2308h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2309i;

    public s0(View view, CharSequence charSequence) {
        this.f2301a = view;
        this.f2302b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0252B.f3101a;
        this.f2303c = Build.VERSION.SDK_INT >= 28 ? y.z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2306f = Integer.MAX_VALUE;
        this.f2307g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s0 s0Var) {
        s0 s0Var2 = f2299j;
        if (s0Var2 != null) {
            s0Var2.f2301a.removeCallbacks(s0Var2.f2304d);
        }
        f2299j = s0Var;
        if (s0Var != null) {
            s0Var.f2301a.postDelayed(s0Var.f2304d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s0 s0Var = f2300k;
        View view = this.f2301a;
        if (s0Var == this) {
            f2300k = null;
            t0 t0Var = this.f2308h;
            if (t0Var != null) {
                View view2 = t0Var.f2314b;
                if (view2.getParent() != null) {
                    ((WindowManager) t0Var.f2313a.getSystemService("window")).removeView(view2);
                }
                this.f2308h = null;
                this.f2306f = Integer.MAX_VALUE;
                this.f2307g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2299j == this) {
            b(null);
        }
        view.removeCallbacks(this.f2305e);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j2;
        long j3;
        Field field = y.x.f3160a;
        View view = this.f2301a;
        if (view.isAttachedToWindow()) {
            b(null);
            s0 s0Var = f2300k;
            if (s0Var != null) {
                s0Var.a();
            }
            f2300k = this;
            this.f2309i = z2;
            t0 t0Var = new t0(view.getContext());
            this.f2308h = t0Var;
            int i7 = this.f2306f;
            int i8 = this.f2307g;
            boolean z3 = this.f2309i;
            View view2 = t0Var.f2314b;
            ViewParent parent = view2.getParent();
            Context context = t0Var.f2313a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            t0Var.f2315c.setText(this.f2302b);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = t0Var.f2316d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i7 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i8 + dimensionPixelOffset2;
                i2 = i8 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
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
                Rect rect = t0Var.f2317e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = i7;
                    i4 = i2;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i3 = i7;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = t0Var.f2319g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = t0Var.f2318f;
                view.getLocationOnScreen(iArr2);
                int i9 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i9;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i9 + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i10 = iArr2[i6];
                int i11 = ((i10 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i12 = i10 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i11 >= 0) {
                        layoutParams.y = i11;
                    } else {
                        layoutParams.y = i12;
                    }
                } else if (measuredHeight + i12 <= rect.height()) {
                    layoutParams.y = i12;
                } else {
                    layoutParams.y = i11;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f2309i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            r0 r0Var = this.f2305e;
            view.removeCallbacks(r0Var);
            view.postDelayed(r0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2308h == null || !this.f2309i) {
            View view2 = this.f2301a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f2306f = Integer.MAX_VALUE;
                        this.f2307g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f2308h == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    int abs = Math.abs(x2 - this.f2306f);
                    int i2 = this.f2303c;
                    if (abs > i2 || Math.abs(y2 - this.f2307g) > i2) {
                        this.f2306f = x2;
                        this.f2307g = y2;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2306f = view.getWidth() / 2;
        this.f2307g = view.getHeight() / 2;
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
