package k;

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
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.rockchicken.pump.up.road.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static p0 f14071j;

    /* renamed from: k, reason: collision with root package name */
    public static p0 f14072k;

    /* renamed from: a, reason: collision with root package name */
    public final View f14073a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f14074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14075c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f14076d = new o0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final o0 f14077e = new o0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f14078f;

    /* renamed from: g, reason: collision with root package name */
    public int f14079g;

    /* renamed from: h, reason: collision with root package name */
    public q0 f14080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14081i;

    public p0(CharSequence charSequence, View view) {
        this.f14073a = view;
        this.f14074b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = E.I.f377a;
        this.f14075c = Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f14078f = Integer.MAX_VALUE;
        this.f14079g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p0 p0Var) {
        p0 p0Var2 = f14071j;
        if (p0Var2 != null) {
            p0Var2.f14073a.removeCallbacks(p0Var2.f14076d);
        }
        f14071j = p0Var;
        if (p0Var != null) {
            p0Var.f14073a.postDelayed(p0Var.f14076d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p0 p0Var = f14072k;
        View view = this.f14073a;
        if (p0Var == this) {
            f14072k = null;
            q0 q0Var = this.f14080h;
            if (q0Var != null) {
                View view2 = (View) q0Var.f14083b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q0Var.f14082a).getSystemService("window")).removeView(view2);
                }
                this.f14080h = null;
                this.f14078f = Integer.MAX_VALUE;
                this.f14079g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14071j == this) {
            b(null);
        }
        view.removeCallbacks(this.f14077e);
    }

    public final void c(boolean z) {
        int height;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        long longPressTimeout;
        long j4;
        long j5;
        Field field = E.H.f375a;
        View view = this.f14073a;
        if (view.isAttachedToWindow()) {
            b(null);
            p0 p0Var = f14072k;
            if (p0Var != null) {
                p0Var.a();
            }
            f14072k = this;
            this.f14081i = z;
            Context context = view.getContext();
            q0 q0Var = new q0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            q0Var.f14085d = layoutParams;
            q0Var.f14086e = new Rect();
            q0Var.f14087f = new int[2];
            q0Var.f14088g = new int[2];
            q0Var.f14082a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            q0Var.f14083b = inflate;
            q0Var.f14084c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(q0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) q0Var.f14083b;
            Context context2 = (Context) q0Var.f14082a;
            this.f14080h = q0Var;
            int i8 = this.f14078f;
            int i9 = this.f14079g;
            boolean z5 = this.f14081i;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) q0Var.f14085d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) q0Var.f14084c).setText(this.f14074b);
            int[] iArr = (int[]) q0Var.f14088g;
            int[] iArr2 = (int[]) q0Var.f14087f;
            Rect rect = (Rect) q0Var.f14086e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i9 + dimensionPixelOffset2;
                i4 = i9 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i4 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z5 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i10 = i8;
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
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i5 = i4;
                    z4 = z5;
                    i6 = 0;
                    i7 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i7 = 1;
                    i5 = i4;
                    z4 = z5;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i11;
                iArr2[i7] = iArr2[i7] - iArr[i7];
                layoutParams2.x = (i11 + i10) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[i7];
                int i13 = ((i12 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i13 >= 0) {
                        layoutParams2.y = i13;
                    } else {
                        layoutParams2.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams2.y = i14;
                } else {
                    layoutParams2.y = i13;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f14081i) {
                j5 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i7) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            o0 o0Var = this.f14077e;
            view.removeCallbacks(o0Var);
            view.postDelayed(o0Var, j5);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f14080h == null || !this.f14081i) {
            View view2 = this.f14073a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f14078f = Integer.MAX_VALUE;
                        this.f14079g = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f14080h == null) {
                    int x4 = (int) motionEvent.getX();
                    int y4 = (int) motionEvent.getY();
                    int abs = Math.abs(x4 - this.f14078f);
                    int i4 = this.f14075c;
                    if (abs > i4 || Math.abs(y4 - this.f14079g) > i4) {
                        this.f14078f = x4;
                        this.f14079g = y4;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f14078f = view.getWidth() / 2;
        this.f14079g = view.getHeight() / 2;
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
