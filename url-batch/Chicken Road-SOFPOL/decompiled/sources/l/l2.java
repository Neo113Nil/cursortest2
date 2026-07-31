package l;

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
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public static l2 f4326n;

    /* renamed from: o, reason: collision with root package name */
    public static l2 f4327o;

    /* renamed from: d, reason: collision with root package name */
    public final View f4328d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f4329e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4330f;

    /* renamed from: g, reason: collision with root package name */
    public final k2 f4331g;

    /* renamed from: h, reason: collision with root package name */
    public final k2 f4332h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4333j;

    /* renamed from: k, reason: collision with root package name */
    public m2 f4334k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4335l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4336m;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.k2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.k2] */
    public l2(View view, CharSequence charSequence) {
        final int i = 0;
        this.f4331g = new Runnable(this) { // from class: l.k2

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l2 f4325e;

            {
                this.f4325e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f4325e.c(false);
                        break;
                    default:
                        this.f4325e.a();
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f4332h = new Runnable(this) { // from class: l.k2

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l2 f4325e;

            {
                this.f4325e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f4325e.c(false);
                        break;
                    default:
                        this.f4325e.a();
                        break;
                }
            }
        };
        this.f4328d = view;
        this.f4329e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = q3.l0.f6125a;
        this.f4330f = Build.VERSION.SDK_INT >= 28 ? j3.a.i(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f4336m = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l2 l2Var) {
        l2 l2Var2 = f4326n;
        if (l2Var2 != null) {
            l2Var2.f4328d.removeCallbacks(l2Var2.f4331g);
        }
        f4326n = l2Var;
        if (l2Var != null) {
            l2Var.f4328d.postDelayed(l2Var.f4331g, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l2 l2Var = f4327o;
        View view = this.f4328d;
        if (l2Var == this) {
            f4327o = null;
            m2 m2Var = this.f4334k;
            if (m2Var != null) {
                View view2 = m2Var.f4342b;
                if (view2.getParent() != null) {
                    ((WindowManager) m2Var.f4341a.getSystemService("window")).removeView(view2);
                }
                this.f4334k = null;
                this.f4336m = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f4326n == this) {
            b(null);
        }
        view.removeCallbacks(this.f4332h);
    }

    public final void c(boolean z3) {
        int height;
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        long longPressTimeout;
        long j7;
        long j8;
        View view = this.f4328d;
        if (view.isAttachedToWindow()) {
            b(null);
            l2 l2Var = f4327o;
            if (l2Var != null) {
                l2Var.a();
            }
            f4327o = this;
            this.f4335l = z3;
            m2 m2Var = new m2(view.getContext());
            this.f4334k = m2Var;
            int i12 = this.i;
            int i13 = this.f4333j;
            boolean z7 = this.f4335l;
            View view2 = m2Var.f4342b;
            ViewParent parent = view2.getParent();
            Context context = m2Var.f4341a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            m2Var.f4343c.setText(this.f4329e);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = m2Var.f4344d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i12 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
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
                i11 = 1;
            } else {
                Rect rect = m2Var.f4345e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i8 = i12;
                    i9 = i;
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context.getResources();
                    i11 = 1;
                    i8 = i12;
                    i9 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = m2Var.f4347g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = m2Var.f4346f;
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams.x = (i14 + i8) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i11];
                int i16 = ((i15 + i9) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z7) {
                    if (i16 >= 0) {
                        layoutParams.y = i16;
                    } else {
                        layoutParams.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i16;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f4335l) {
                j8 = 2500;
            } else {
                Field field = q3.k0.f6120a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            k2 k2Var = this.f4332h;
            view.removeCallbacks(k2Var);
            view.postDelayed(k2Var, j8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f4333j) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f4334k == null || !this.f4335l) {
            View view2 = this.f4328d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f4336m = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f4334k == null) {
                    int x7 = (int) motionEvent.getX();
                    int y7 = (int) motionEvent.getY();
                    if (!this.f4336m) {
                        int abs = Math.abs(x7 - this.i);
                        int i = this.f4330f;
                        if (abs <= i) {
                        }
                    }
                    this.i = x7;
                    this.f4333j = y7;
                    this.f4336m = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.i = view.getWidth() / 2;
        this.f4333j = view.getHeight() / 2;
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
