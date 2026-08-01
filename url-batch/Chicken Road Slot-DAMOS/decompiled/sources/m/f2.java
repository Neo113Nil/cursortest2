package m;

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
import com.appsflyer.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: y, reason: collision with root package name */
    public static f2 f6063y;

    /* renamed from: z, reason: collision with root package name */
    public static f2 f6064z;

    /* renamed from: d, reason: collision with root package name */
    public final View f6065d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f6066e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6067i;

    /* renamed from: r, reason: collision with root package name */
    public final e2 f6068r;

    /* renamed from: s, reason: collision with root package name */
    public final e2 f6069s;

    /* renamed from: t, reason: collision with root package name */
    public int f6070t;

    /* renamed from: u, reason: collision with root package name */
    public int f6071u;

    /* renamed from: v, reason: collision with root package name */
    public g2 f6072v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6073w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6074x;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.e2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.e2] */
    public f2(View view, CharSequence charSequence) {
        final int i3 = 0;
        this.f6068r = new Runnable(this) { // from class: m.e2

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f2 f6062e;

            {
                this.f6062e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f6062e.c(false);
                        break;
                    default:
                        this.f6062e.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6069s = new Runnable(this) { // from class: m.e2

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f2 f6062e;

            {
                this.f6062e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f6062e.c(false);
                        break;
                    default:
                        this.f6062e.a();
                        break;
                }
            }
        };
        this.f6065d = view;
        this.f6066e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = o3.d0.f7385a;
        this.f6067i = Build.VERSION.SDK_INT >= 28 ? e3.k.k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f6074x = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(f2 f2Var) {
        f2 f2Var2 = f6063y;
        if (f2Var2 != null) {
            f2Var2.f6065d.removeCallbacks(f2Var2.f6068r);
        }
        f6063y = f2Var;
        if (f2Var != null) {
            f2Var.f6065d.postDelayed(f2Var.f6068r, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        f2 f2Var = f6064z;
        View view = this.f6065d;
        if (f2Var == this) {
            f6064z = null;
            g2 g2Var = this.f6072v;
            if (g2Var != null) {
                View view2 = (View) g2Var.f6078e;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) g2Var.f6077d).getSystemService("window")).removeView(view2);
                }
                this.f6072v = null;
                this.f6074x = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f6063y == this) {
            b(null);
        }
        view.removeCallbacks(this.f6069s);
    }

    public final void c(boolean z10) {
        int height;
        int i3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j3;
        View view = this.f6065d;
        if (view.isAttachedToWindow()) {
            b(null);
            f2 f2Var = f6064z;
            if (f2Var != null) {
                f2Var.a();
            }
            f6064z = this;
            this.f6073w = z10;
            Context context = view.getContext();
            g2 g2Var = new g2();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            g2Var.f6080r = layoutParams;
            g2Var.f6081s = new Rect();
            g2Var.f6082t = new int[2];
            g2Var.f6083u = new int[2];
            g2Var.f6077d = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            g2Var.f6078e = inflate;
            g2Var.f6079i = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(g2.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131755012;
            layoutParams.flags = 24;
            View view2 = (View) g2Var.f6078e;
            Context context2 = (Context) g2Var.f6077d;
            this.f6072v = g2Var;
            int i13 = this.f6070t;
            int i14 = this.f6071u;
            boolean z12 = this.f6073w;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) g2Var.f6080r;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) g2Var.f6079i).setText(this.f6066e);
            int[] iArr = (int[]) g2Var.f6083u;
            int[] iArr2 = (int[]) g2Var.f6082t;
            Rect rect = (Rect) g2Var.f6081s;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i13 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i3 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z12 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i15 = i13;
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
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i3;
                    z11 = z12;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i12 = 1;
                    i10 = i3;
                    z11 = z12;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i16;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams2.x = (i16 + i15) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i12];
                int i18 = ((i17 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i18 >= 0) {
                        layoutParams2.y = i18;
                    } else {
                        layoutParams2.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i18;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f6073w) {
                j3 = 2500;
            } else {
                Field field = o3.c0.f7378a;
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j3 = j - longPressTimeout;
            }
            e2 e2Var = this.f6069s;
            view.removeCallbacks(e2Var);
            view.postDelayed(e2Var, j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f6071u) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6072v == null || !this.f6073w) {
            View view2 = this.f6065d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f6074x = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f6072v == null) {
                    int x10 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (!this.f6074x) {
                        int abs = Math.abs(x10 - this.f6070t);
                        int i3 = this.f6067i;
                        if (abs <= i3) {
                        }
                    }
                    this.f6070t = x10;
                    this.f6071u = y3;
                    this.f6074x = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f6070t = view.getWidth() / 2;
        this.f6071u = view.getHeight() / 2;
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
