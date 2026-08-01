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
import com.derinko.gbini.n1casino.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r3 implements wv, ed, bu {
    public final /* synthetic */ int f;
    public final /* synthetic */ d4 g;

    public /* synthetic */ r3(d4 d4Var, int i) {
        this.f = i;
        this.g = d4Var;
    }

    @Override // defpackage.bu
    public void a(mt mtVar, boolean z) {
        c4 c4Var;
        int i = this.f;
        d4 d4Var = this.g;
        switch (i) {
            case 2:
                d4Var.q(mtVar);
                break;
            default:
                mt k = mtVar.k();
                int i2 = 0;
                boolean z2 = k != mtVar;
                if (z2) {
                    mtVar = k;
                }
                c4[] c4VarArr = d4Var.P;
                int length = c4VarArr != null ? c4VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c4Var = null;
                    } else {
                        c4Var = c4VarArr[i2];
                        if (c4Var == null || c4Var.h != mtVar) {
                            i2++;
                        }
                    }
                }
                if (c4Var != null) {
                    if (!z2) {
                        d4Var.s(c4Var, z);
                        break;
                    } else {
                        d4Var.p(c4Var.a, c4Var, k);
                        d4Var.s(c4Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.wv
    public rb0 m(View view, rb0 rb0Var) {
        int i;
        int i2;
        boolean z;
        rb0 rb0Var2;
        boolean z2;
        int d = rb0Var.d();
        d4 d4Var = this.g;
        Context context = d4Var.p;
        int d2 = rb0Var.d();
        ActionBarContextView actionBarContextView = d4Var.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d4Var.z.getLayoutParams();
            if (d4Var.z.isShown()) {
                if (d4Var.g0 == null) {
                    d4Var.g0 = new Rect();
                    d4Var.h0 = new Rect();
                }
                Rect rect = d4Var.g0;
                Rect rect2 = d4Var.h0;
                rect.set(rb0Var.b(), rb0Var.d(), rb0Var.c(), rb0Var.a());
                ViewGroup viewGroup = d4Var.E;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = v90.a;
                    r90.a(viewGroup, rect, rect2);
                } else {
                    if (!v90.a) {
                        v90.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            v90.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                v90.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = v90.b;
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
                ViewGroup viewGroup2 = d4Var.E;
                WeakHashMap weakHashMap = x80.a;
                rb0 a = q80.a(viewGroup2);
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
                if (i3 <= 0 || d4Var.G != null) {
                    i2 = 8;
                    View view2 = d4Var.G;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            d4Var.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    d4Var.G = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    d4Var.E.addView(d4Var.G, -1, layoutParams);
                }
                View view4 = d4Var.G;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = d4Var.G;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!d4Var.L && r11) {
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
                d4Var.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = d4Var.G;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = rb0Var.b();
            int c2 = rb0Var.c();
            int a2 = rb0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            fb0 eb0Var = i8 >= 36 ? new eb0(rb0Var) : i8 >= 35 ? new db0(rb0Var) : i8 >= 34 ? new cb0(rb0Var) : i8 >= 31 ? new bb0(rb0Var) : i8 >= 30 ? new ab0(rb0Var) : i8 >= 29 ? new za0(rb0Var) : new ya0(rb0Var);
            eb0Var.h(to.c(b2, d2, c2, a2));
            rb0Var2 = eb0Var.b();
        } else {
            rb0Var2 = rb0Var;
        }
        WeakHashMap weakHashMap2 = x80.a;
        WindowInsets f = rb0Var2.f();
        if (f == null) {
            return rb0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? rb0.g(view, onApplyWindowInsets) : rb0Var2;
    }

    @Override // defpackage.bu
    public boolean x(mt mtVar) {
        Window.Callback callback;
        int i = this.f;
        d4 d4Var = this.g;
        switch (i) {
            case 2:
                Window.Callback callback2 = d4Var.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mtVar);
                    break;
                }
                break;
            default:
                if (mtVar == mtVar.k() && d4Var.J && (callback = d4Var.q.getCallback()) != null && !d4Var.U) {
                    callback.onMenuOpened(108, mtVar);
                    break;
                }
                break;
        }
        return true;
    }
}
