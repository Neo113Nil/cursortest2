package l;

import E.AbstractC0003d;
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
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.fc.barca.football.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static s0 f9887j;

    /* renamed from: k, reason: collision with root package name */
    public static s0 f9888k;

    /* renamed from: a, reason: collision with root package name */
    public final View f9889a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f9890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9891c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f9892d = new r0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final r0 f9893e = new r0(this, 1);
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f9894g;

    /* renamed from: h, reason: collision with root package name */
    public t0 f9895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9896i;

    public s0(CharSequence charSequence, View view) {
        this.f9889a = view;
        this.f9890b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = E.B.f245a;
        this.f9891c = Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f = Integer.MAX_VALUE;
        this.f9894g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s0 s0Var) {
        s0 s0Var2 = f9887j;
        if (s0Var2 != null) {
            s0Var2.f9889a.removeCallbacks(s0Var2.f9892d);
        }
        f9887j = s0Var;
        if (s0Var != null) {
            s0Var.f9889a.postDelayed(s0Var.f9892d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s0 s0Var = f9888k;
        View view = this.f9889a;
        if (s0Var == this) {
            f9888k = null;
            t0 t0Var = this.f9895h;
            if (t0Var != null) {
                View view2 = (View) t0Var.f9910b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) t0Var.f9909a).getSystemService("window")).removeView(view2);
                }
                this.f9895h = null;
                this.f = Integer.MAX_VALUE;
                this.f9894g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f9887j == this) {
            b(null);
        }
        view.removeCallbacks(this.f9893e);
    }

    public final void c(boolean z) {
        int height;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = E.A.f243a;
        View view = this.f9889a;
        if (view.isAttachedToWindow()) {
            b(null);
            s0 s0Var = f9888k;
            if (s0Var != null) {
                s0Var.a();
            }
            f9888k = this;
            this.f9896i = z;
            Context context = view.getContext();
            t0 t0Var = new t0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            t0Var.f9912d = layoutParams;
            t0Var.f9913e = new Rect();
            t0Var.f = new int[2];
            t0Var.f9914g = new int[2];
            t0Var.f9909a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            t0Var.f9910b = inflate;
            t0Var.f9911c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(t0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f9895h = t0Var;
            int i8 = this.f;
            int i9 = this.f9894g;
            boolean z2 = this.f9896i;
            View view2 = (View) t0Var.f9910b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) t0Var.f9909a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) t0Var.f9911c).setText(this.f9890b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) t0Var.f9912d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i9 + dimensionPixelOffset2;
                i3 = i9 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
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
                i7 = 1;
            } else {
                Rect rect = (Rect) t0Var.f9913e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i8;
                    i5 = i3;
                    i6 = 0;
                    i7 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i7 = 1;
                    i4 = i8;
                    i5 = i3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) t0Var.f9914g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) t0Var.f;
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i10;
                iArr2[i7] = iArr2[i7] - iArr[i7];
                layoutParams2.x = (i10 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[i7];
                int i12 = ((i11 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i12 >= 0) {
                        layoutParams2.y = i12;
                    } else {
                        layoutParams2.y = i13;
                    }
                } else if (measuredHeight + i13 <= rect.height()) {
                    layoutParams2.y = i13;
                } else {
                    layoutParams2.y = i12;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f9896i) {
                j4 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i7) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            r0 r0Var = this.f9893e;
            view.removeCallbacks(r0Var);
            view.postDelayed(r0Var, j4);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f9895h == null || !this.f9896i) {
            View view2 = this.f9889a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f = Integer.MAX_VALUE;
                        this.f9894g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f9895h == null) {
                    int x3 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    int abs = Math.abs(x3 - this.f);
                    int i3 = this.f9891c;
                    if (abs > i3 || Math.abs(y3 - this.f9894g) > i3) {
                        this.f = x3;
                        this.f9894g = y3;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f9894g = view.getHeight() / 2;
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
