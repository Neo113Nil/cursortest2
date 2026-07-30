package i;

import I.InterfaceC0124u;
import I.T;
import I.a0;
import I.b0;
import I.c0;
import I.d0;
import I.e0;
import I.f0;
import I.g0;
import I.h0;
import I.r0;
import I.v0;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n.z1;

/* renamed from: i.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531r implements InterfaceC0124u, m.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5481d;

    public /* synthetic */ C0531r(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B) {
        this.f5481d = layoutInflaterFactory2C0500B;
    }

    @Override // m.y
    public void a(m.m mVar, boolean z7) {
        this.f5481d.s(mVar);
    }

    public v0 b(View view, v0 v0Var) {
        int i2;
        boolean z7;
        v0 v0Var2;
        boolean z8;
        boolean z9;
        r0 r0Var = v0Var.f1239a;
        int i5 = r0Var.k().f148b;
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5481d;
        Context context = layoutInflaterFactory2C0500B.f5346s;
        int i7 = r0Var.k().f148b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0500B.f5308D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0500B.f5308D.getLayoutParams();
            if (layoutInflaterFactory2C0500B.f5308D.isShown()) {
                if (layoutInflaterFactory2C0500B.f5340k0 == null) {
                    layoutInflaterFactory2C0500B.f5340k0 = new Rect();
                    layoutInflaterFactory2C0500B.f5341l0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0500B.f5340k0;
                Rect rect2 = layoutInflaterFactory2C0500B.f5341l0;
                rect.set(r0Var.k().f147a, r0Var.k().f148b, r0Var.k().f149c, r0Var.k().f150d);
                ViewGroup viewGroup = layoutInflaterFactory2C0500B.f5313I;
                Method method = z1.f6967a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i8 = rect.top;
                int i9 = rect.left;
                int i10 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0500B.f5313I;
                WeakHashMap weakHashMap = T.f1153a;
                v0 a7 = I.L.a(viewGroup2);
                int i11 = a7 == null ? 0 : a7.f1239a.k().f147a;
                int i12 = a7 == null ? 0 : a7.f1239a.k().f149c;
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z9 = true;
                }
                if (i8 <= 0 || layoutInflaterFactory2C0500B.f5315K != null) {
                    View view2 = layoutInflaterFactory2C0500B.f5315K;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = i11;
                            marginLayoutParams2.rightMargin = i12;
                            layoutInflaterFactory2C0500B.f5315K.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0500B.f5315K = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    layoutInflaterFactory2C0500B.f5313I.addView(layoutInflaterFactory2C0500B.f5315K, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0500B.f5315K;
                boolean z10 = view4 != null;
                if (z10 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0500B.f5315K;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0500B.f5320P && z10) {
                    i7 = 0;
                }
                z8 = z9;
                z7 = z10;
                i2 = 0;
            } else {
                i2 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z7 = false;
                    z8 = true;
                } else {
                    z7 = false;
                    z8 = false;
                }
            }
            if (z8) {
                layoutInflaterFactory2C0500B.f5308D.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0500B.f5315K;
        if (view6 != null) {
            view6.setVisibility(z7 ? i2 : 8);
        }
        if (i5 != i7) {
            int i15 = r0Var.k().f147a;
            int i16 = r0Var.k().f149c;
            int i17 = r0Var.k().f150d;
            int i18 = Build.VERSION.SDK_INT;
            h0 g0Var = i18 >= 36 ? new g0(v0Var) : i18 >= 35 ? new f0(v0Var) : i18 >= 34 ? new e0(v0Var) : i18 >= 31 ? new d0(v0Var) : i18 >= 30 ? new c0(v0Var) : i18 >= 29 ? new b0(v0Var) : new a0(v0Var);
            g0Var.e(B.c.a(i15, i7, i16, i17));
            v0Var2 = g0Var.b();
        } else {
            v0Var2 = v0Var;
        }
        WeakHashMap weakHashMap2 = T.f1153a;
        WindowInsets b7 = v0Var2.b();
        if (b7 == null) {
            return v0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(b7);
        return !onApplyWindowInsets.equals(b7) ? v0.c(onApplyWindowInsets, view) : v0Var2;
    }

    @Override // m.y
    public boolean i(m.m mVar) {
        Window.Callback callback = this.f5481d.f5347t.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }
}
