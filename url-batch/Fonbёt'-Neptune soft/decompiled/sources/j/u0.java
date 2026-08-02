package j;

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
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.neptunesoft.languesbacdz.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static u0 f3066j;

    /* renamed from: k, reason: collision with root package name */
    public static u0 f3067k;

    /* renamed from: a, reason: collision with root package name */
    public final View f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f3069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3070c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f3071d = new t0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final t0 f3072e = new t0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f3073f;

    /* renamed from: g, reason: collision with root package name */
    public int f3074g;

    /* renamed from: h, reason: collision with root package name */
    public v0 f3075h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3076i;

    public u0(View view, CharSequence charSequence) {
        this.f3068a = view;
        this.f3069b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = A.D.f0a;
        this.f3070c = Build.VERSION.SDK_INT >= 28 ? A.B.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3073f = Integer.MAX_VALUE;
        this.f3074g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(u0 u0Var) {
        u0 u0Var2 = f3066j;
        if (u0Var2 != null) {
            u0Var2.f3068a.removeCallbacks(u0Var2.f3071d);
        }
        f3066j = u0Var;
        if (u0Var != null) {
            u0Var.f3068a.postDelayed(u0Var.f3071d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        u0 u0Var = f3067k;
        View view = this.f3068a;
        if (u0Var == this) {
            f3067k = null;
            v0 v0Var = this.f3075h;
            if (v0Var != null) {
                View view2 = v0Var.f3082b;
                if (view2.getParent() != null) {
                    ((WindowManager) v0Var.f3081a.getSystemService("window")).removeView(view2);
                }
                this.f3075h = null;
                this.f3073f = Integer.MAX_VALUE;
                this.f3074g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3066j == this) {
            b(null);
        }
        view.removeCallbacks(this.f3072e);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        String str;
        int i3;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        Field field = A.z.f58a;
        View view = this.f3068a;
        if (view.isAttachedToWindow()) {
            b(null);
            u0 u0Var = f3067k;
            if (u0Var != null) {
                u0Var.a();
            }
            f3067k = this;
            this.f3076i = z2;
            v0 v0Var = new v0(view.getContext());
            this.f3075h = v0Var;
            int i4 = this.f3073f;
            int i5 = this.f3074g;
            boolean z3 = this.f3076i;
            View view2 = v0Var.f3082b;
            ViewParent parent = view2.getParent();
            Context context = v0Var.f3081a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            v0Var.f3083c.setText(this.f3069b);
            WindowManager.LayoutParams layoutParams = v0Var.f3084d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
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
                str2 = "window";
            } else {
                Rect rect = v0Var.f3085e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = v0Var.f3087g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = v0Var.f3086f;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i6;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i6 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[1];
                int i8 = ((i2 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f3076i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            t0 t0Var = this.f3072e;
            view.removeCallbacks(t0Var);
            view.postDelayed(t0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3075h != null && this.f3076i) {
            return false;
        }
        View view2 = this.f3068a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f3073f = Integer.MAX_VALUE;
                this.f3074g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f3075h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int abs = Math.abs(x2 - this.f3073f);
            int i2 = this.f3070c;
            if (abs > i2 || Math.abs(y2 - this.f3074g) > i2) {
                this.f3073f = x2;
                this.f3074g = y2;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f3073f = view.getWidth() / 2;
        this.f3074g = view.getHeight() / 2;
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
