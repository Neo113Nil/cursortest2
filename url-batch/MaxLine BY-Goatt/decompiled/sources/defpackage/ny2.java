package defpackage;

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
import com.majelw.libystne.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ny2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ny2 w;
    public static ny2 x;
    public final View m;
    public final CharSequence n;
    public final int o;
    public final my2 p;
    public final my2 q;
    public int r;
    public int s;
    public oy2 t;
    public boolean u;
    public boolean v;

    /* JADX WARN: Type inference failed for: r0v0, types: [my2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [my2] */
    public ny2(View view, CharSequence charSequence) {
        final int i = 0;
        this.p = new Runnable(this) { // from class: my2
            public final /* synthetic */ ny2 n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ny2 ny2Var = this.n;
                switch (i2) {
                    case 0:
                        ny2Var.c(false);
                        break;
                    default:
                        ny2Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.q = new Runnable(this) { // from class: my2
            public final /* synthetic */ ny2 n;

            {
                this.n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ny2 ny2Var = this.n;
                switch (i22) {
                    case 0:
                        ny2Var.c(false);
                        break;
                    default:
                        ny2Var.a();
                        break;
                }
            }
        };
        this.m = view;
        this.n = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = h53.a;
        this.o = Build.VERSION.SDK_INT >= 28 ? km.m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.v = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ny2 ny2Var) {
        ny2 ny2Var2 = w;
        if (ny2Var2 != null) {
            ny2Var2.m.removeCallbacks(ny2Var2.p);
        }
        w = ny2Var;
        if (ny2Var != null) {
            ny2Var.m.postDelayed(ny2Var.p, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ny2 ny2Var = x;
        View view = this.m;
        if (ny2Var == this) {
            x = null;
            oy2 oy2Var = this.t;
            if (oy2Var != null) {
                View view2 = (View) oy2Var.n;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) oy2Var.m).getSystemService("window")).removeView(view2);
                }
                this.t = null;
                this.v = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (w == this) {
            b(null);
        }
        view.removeCallbacks(this.q);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.m;
        if (view.isAttachedToWindow()) {
            b(null);
            ny2 ny2Var = x;
            if (ny2Var != null) {
                ny2Var.a();
            }
            x = this;
            this.u = z;
            Context context = view.getContext();
            oy2 oy2Var = new oy2();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            oy2Var.p = layoutParams;
            oy2Var.q = new Rect();
            oy2Var.r = new int[2];
            oy2Var.s = new int[2];
            oy2Var.m = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            oy2Var.n = inflate;
            oy2Var.o = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(oy2.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) oy2Var.n;
            Context context2 = (Context) oy2Var.m;
            this.t = oy2Var;
            int i5 = this.r;
            int i6 = this.s;
            boolean z3 = this.u;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) oy2Var.p;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) oy2Var.o).setText(this.n);
            int[] iArr = (int[]) oy2Var.s;
            int[] iArr2 = (int[]) oy2Var.r;
            Rect rect = (Rect) oy2Var.q;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i7 = i5;
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
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams2.x = (i8 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.u) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = e53.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            my2 my2Var = this.q;
            view.removeCallbacks(my2Var);
            view.postDelayed(my2Var, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.s) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.t == null || !this.u) {
            View view2 = this.m;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.v = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.t == null) {
                    int x2 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.v) {
                        int abs = Math.abs(x2 - this.r);
                        int i = this.o;
                        if (abs <= i) {
                        }
                    }
                    this.r = x2;
                    this.s = y;
                    this.v = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.r = view.getWidth() / 2;
        this.s = view.getHeight() / 2;
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
