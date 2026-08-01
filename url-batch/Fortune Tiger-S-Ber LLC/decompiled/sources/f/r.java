package f;

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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.d3;
import k.e3;
import k.g1;
import k0.a1;
import k0.b1;
import k0.m1;
import k0.x0;
import k0.y0;
import k0.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r implements k0.m, g1, j.x {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1646f;
    public final /* synthetic */ b0 g;

    public /* synthetic */ r(b0 b0Var, int i4) {
        this.f1646f = i4;
        this.g = b0Var;
    }

    @Override // j.x
    public void a(j.m mVar, boolean z3) {
        a0 a0Var;
        switch (this.f1646f) {
            case 2:
                this.g.q(mVar);
                break;
            default:
                j.m k4 = mVar.k();
                int i4 = 0;
                boolean z4 = k4 != mVar;
                if (z4) {
                    mVar = k4;
                }
                b0 b0Var = this.g;
                a0[] a0VarArr = b0Var.R;
                int length = a0VarArr != null ? a0VarArr.length : 0;
                while (true) {
                    if (i4 >= length) {
                        a0Var = null;
                    } else {
                        a0Var = a0VarArr[i4];
                        if (a0Var == null || a0Var.h != mVar) {
                            i4++;
                        }
                    }
                }
                if (a0Var != null) {
                    if (!z4) {
                        b0Var.r(a0Var, z3);
                        break;
                    } else {
                        b0Var.p(a0Var.f1521a, a0Var, k4);
                        b0Var.r(a0Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k0.m
    public m1 d(View view, m1 m1Var) {
        int i4;
        boolean z3;
        m1 m1Var2;
        boolean z4;
        int d4 = m1Var.d();
        b0 b0Var = this.g;
        Context context = b0Var.f1556p;
        int d5 = m1Var.d();
        ActionBarContextView actionBarContextView = b0Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i4 = 0;
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.A.getLayoutParams();
            if (b0Var.A.isShown()) {
                if (b0Var.f1550i0 == null) {
                    b0Var.f1550i0 = new Rect();
                    b0Var.f1551j0 = new Rect();
                }
                Rect rect = b0Var.f1550i0;
                Rect rect2 = b0Var.f1551j0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = b0Var.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = e3.f2538a;
                    d3.a(viewGroup, rect, rect2);
                } else {
                    if (!e3.f2538a) {
                        e3.f2538a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            e3.f2539b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                e3.f2539b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = e3.f2539b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = b0Var.G;
                WeakHashMap weakHashMap = k0.j0.f2752a;
                m1 a4 = k0.c0.a(viewGroup2);
                int b2 = a4 == null ? 0 : a4.b();
                int c = a4 == null ? 0 : a4.c();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z4 = true;
                }
                if (i5 <= 0 || b0Var.I != null) {
                    View view2 = b0Var.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c;
                            b0Var.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    b0Var.I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c;
                    b0Var.G.addView(b0Var.I, -1, layoutParams);
                }
                View view4 = b0Var.I;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = b0Var.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!b0Var.N && r12) {
                    d5 = 0;
                }
                z3 = r12;
                i4 = 0;
                r12 = z4;
            } else {
                i4 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = false;
                } else {
                    z3 = false;
                    r12 = false;
                }
            }
            if (r12) {
                b0Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = b0Var.I;
        if (view6 != null) {
            view6.setVisibility(z3 ? i4 : 8);
        }
        if (d4 != d5) {
            int b4 = m1Var.b();
            int c4 = m1Var.c();
            int a5 = m1Var.a();
            int i10 = Build.VERSION.SDK_INT;
            b1 a1Var = i10 >= 34 ? new a1(m1Var) : i10 >= 30 ? new z0(m1Var) : i10 >= 29 ? new y0(m1Var) : new x0(m1Var);
            a1Var.g(c0.c.c(b4, d5, c4, a5));
            m1Var2 = a1Var.b();
        } else {
            m1Var2 = m1Var;
        }
        WeakHashMap weakHashMap2 = k0.j0.f2752a;
        WindowInsets f4 = m1Var2.f();
        if (f4 == null) {
            return m1Var2;
        }
        WindowInsets b5 = k0.z.b(view, f4);
        return !b5.equals(f4) ? m1.g(view, b5) : m1Var2;
    }

    @Override // j.x
    public boolean i(j.m mVar) {
        Window.Callback callback;
        switch (this.f1646f) {
            case 2:
                Window.Callback callback2 = this.g.f1557q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    break;
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    b0 b0Var = this.g;
                    if (b0Var.L && (callback = b0Var.f1557q.getCallback()) != null && !b0Var.W) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
