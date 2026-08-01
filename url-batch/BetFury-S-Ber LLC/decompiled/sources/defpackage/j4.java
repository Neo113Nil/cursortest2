package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.trembin.nirefon.betfury.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j4 implements q40, vf, g20 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v4 g;

    public /* synthetic */ j4(v4 v4Var, int i) {
        this.f = i;
        this.g = v4Var;
    }

    @Override // defpackage.g20
    public void a(r10 r10Var, boolean z) {
        u4 u4Var;
        int i = this.f;
        v4 v4Var = this.g;
        switch (i) {
            case 2:
                v4Var.r(r10Var);
                break;
            default:
                r10 k = r10Var.k();
                int i2 = 0;
                boolean z2 = k != r10Var;
                if (z2) {
                    r10Var = k;
                }
                u4[] u4VarArr = v4Var.Q;
                int length = u4VarArr != null ? u4VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        u4Var = null;
                    } else {
                        u4Var = u4VarArr[i2];
                        if (u4Var == null || u4Var.h != r10Var) {
                            i2++;
                        }
                    }
                }
                if (u4Var != null) {
                    if (!z2) {
                        v4Var.s(u4Var, z);
                        break;
                    } else {
                        v4Var.q(u4Var.a, u4Var, k);
                        v4Var.s(u4Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.q40
    public dp0 i(View view, dp0 dp0Var) {
        int i;
        int i2;
        boolean z;
        dp0 dp0Var2;
        boolean z2;
        int d = dp0Var.d();
        v4 v4Var = this.g;
        Context context = v4Var.p;
        int d2 = dp0Var.d();
        ActionBarContextView actionBarContextView = v4Var.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v4Var.z.getLayoutParams();
            if (v4Var.z.isShown()) {
                if (v4Var.h0 == null) {
                    v4Var.h0 = new Rect();
                    v4Var.i0 = new Rect();
                }
                Rect rect = v4Var.h0;
                Rect rect2 = v4Var.i0;
                rect.set(dp0Var.b(), dp0Var.d(), dp0Var.c(), dp0Var.a());
                ViewGroup viewGroup = v4Var.F;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = dn0.a;
                    an0.a(viewGroup, rect, rect2);
                } else {
                    if (!dn0.a) {
                        dn0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            dn0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                dn0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = dn0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = v4Var.F;
                WeakHashMap weakHashMap = hm0.a;
                dp0 a = am0.a(viewGroup2);
                int b = a == null ? 0 : a.b();
                int c = a == null ? 0 : a.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || v4Var.H != null) {
                    i2 = 8;
                    View view2 = v4Var.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            v4Var.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    v4Var.H = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    v4Var.F.addView(v4Var.H, -1, layoutParams);
                }
                View view4 = v4Var.H;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = v4Var.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!v4Var.M && r11) {
                    d2 = 0;
                }
                i = 0;
                z = r11;
                r11 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    r11 = false;
                }
            }
            if (r11) {
                v4Var.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = v4Var.H;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = dp0Var.b();
            int c2 = dp0Var.c();
            int a2 = dp0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            ro0 qo0Var = i8 >= 36 ? new qo0(dp0Var) : i8 >= 35 ? new po0(dp0Var) : i8 >= 34 ? new oo0(dp0Var) : i8 >= 31 ? new no0(dp0Var) : i8 >= 30 ? new mo0(dp0Var) : i8 >= 29 ? new lo0(dp0Var) : new ko0(dp0Var);
            qo0Var.h(fv.c(b2, d2, c2, a2));
            dp0Var2 = qo0Var.b();
        } else {
            dp0Var2 = dp0Var;
        }
        WeakHashMap weakHashMap2 = hm0.a;
        WindowInsets f = dp0Var2.f();
        if (f == null) {
            return dp0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? dp0.g(view, onApplyWindowInsets) : dp0Var2;
    }

    @Override // defpackage.g20
    public boolean t(r10 r10Var) {
        Window.Callback callback;
        int i = this.f;
        v4 v4Var = this.g;
        switch (i) {
            case 2:
                Window.Callback callback2 = v4Var.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, r10Var);
                    break;
                }
                break;
            default:
                if (r10Var == r10Var.k() && v4Var.K && (callback = v4Var.q.getCallback()) != null && !v4Var.V) {
                    callback.onMenuOpened(108, r10Var);
                    break;
                }
                break;
        }
        return true;
    }
}
