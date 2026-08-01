package g;

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
import com.oriondriftchasers.arordrft.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.j1;
import l.k3;
import l.l3;
import n0.b1;
import n0.c1;
import n0.d1;
import n0.e1;
import n0.f1;
import n0.q1;
import n0.z0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r implements n0.n, j1, k.x {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1687g;

    public /* synthetic */ r(c0 c0Var, int i) {
        this.f1686f = i;
        this.f1687g = c0Var;
    }

    @Override // k.x
    public void a(k.m mVar, boolean z3) {
        b0 b0Var;
        switch (this.f1686f) {
            case 2:
                this.f1687g.p(mVar);
                break;
            default:
                k.m k4 = mVar.k();
                int i = 0;
                boolean z4 = k4 != mVar;
                if (z4) {
                    mVar = k4;
                }
                c0 c0Var = this.f1687g;
                b0[] b0VarArr = c0Var.Q;
                int length = b0VarArr != null ? b0VarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        b0Var = null;
                    } else {
                        b0Var = b0VarArr[i];
                        if (b0Var == null || b0Var.f1572h != mVar) {
                            i++;
                        }
                    }
                }
                if (b0Var != null) {
                    if (!z4) {
                        c0Var.q(b0Var, z3);
                        break;
                    } else {
                        c0Var.o(b0Var.f1566a, b0Var, k4);
                        c0Var.q(b0Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k.x
    public boolean d(k.m mVar) {
        Window.Callback callback;
        switch (this.f1686f) {
            case 2:
                Window.Callback callback2 = this.f1687g.f1596q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    break;
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    c0 c0Var = this.f1687g;
                    if (c0Var.K && (callback = c0Var.f1596q.getCallback()) != null && !c0Var.V) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // n0.n
    public q1 t(View view, q1 q1Var) {
        int i;
        boolean z3;
        q1 q1Var2;
        boolean z4;
        int d = q1Var.d();
        c0 c0Var = this.f1687g;
        Context context = c0Var.f1595p;
        int d3 = q1Var.d();
        ActionBarContextView actionBarContextView = c0Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.A.getLayoutParams();
            if (c0Var.A.isShown()) {
                if (c0Var.f1590h0 == null) {
                    c0Var.f1590h0 = new Rect();
                    c0Var.i0 = new Rect();
                }
                Rect rect = c0Var.f1590h0;
                Rect rect2 = c0Var.i0;
                rect.set(q1Var.b(), q1Var.d(), q1Var.c(), q1Var.a());
                ViewGroup viewGroup = c0Var.F;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = l3.f2381a;
                    k3.a(viewGroup, rect, rect2);
                } else {
                    if (!l3.f2381a) {
                        l3.f2381a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            l3.f2382b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                l3.f2382b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = l3.f2382b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = c0Var.F;
                WeakHashMap weakHashMap = n0.l0.f2757a;
                q1 a2 = n0.e0.a(viewGroup2);
                int b4 = a2 == null ? 0 : a2.b();
                int c4 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z4 = true;
                }
                if (i4 <= 0 || c0Var.H != null) {
                    View view2 = c0Var.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != b4 || marginLayoutParams2.rightMargin != c4) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = b4;
                            marginLayoutParams2.rightMargin = c4;
                            c0Var.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    c0Var.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b4;
                    layoutParams.rightMargin = c4;
                    c0Var.F.addView(c0Var.H, -1, layoutParams);
                }
                View view4 = c0Var.H;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = c0Var.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!c0Var.M && r12) {
                    d3 = 0;
                }
                z3 = r12;
                i = 0;
                r12 = z4;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = false;
                } else {
                    z3 = false;
                    r12 = false;
                }
            }
            if (r12) {
                c0Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = c0Var.H;
        if (view6 != null) {
            view6.setVisibility(z3 ? i : 8);
        }
        if (d != d3) {
            int b5 = q1Var.b();
            int c5 = q1Var.c();
            int a4 = q1Var.a();
            int i9 = Build.VERSION.SDK_INT;
            f1 e1Var = i9 >= 34 ? new e1(q1Var) : i9 >= 31 ? new d1(q1Var) : i9 >= 30 ? new c1(q1Var) : i9 >= 29 ? new b1(q1Var) : new z0(q1Var);
            e1Var.g(f0.c.c(b5, d3, c5, a4));
            q1Var2 = e1Var.b();
        } else {
            q1Var2 = q1Var;
        }
        WeakHashMap weakHashMap2 = n0.l0.f2757a;
        WindowInsets f2 = q1Var2.f();
        if (f2 == null) {
            return q1Var2;
        }
        WindowInsets b6 = n0.b0.b(view, f2);
        return !b6.equals(f2) ? q1.g(view, b6) : q1Var2;
    }
}
