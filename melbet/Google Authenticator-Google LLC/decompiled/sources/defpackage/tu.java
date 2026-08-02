package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tu implements xq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public tu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xq
    public final zz a(View view, zz zzVar) {
        Insets of;
        WindowInsets.Builder systemWindowInsets;
        WindowInsets build;
        Insets systemWindowInsets2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.b;
        boolean z = false;
        if (i5 == 0) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, zzVar)) {
                coordinatorLayout.e = zzVar;
                boolean z2 = zzVar.d() > 0;
                coordinatorLayout.f = z2;
                coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                if (!zzVar.w()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = coordinatorLayout.getChildAt(i6);
                        int i7 = yq.a;
                        if (childAt.getFitsSystemWindows() && ((tz) childAt.getLayoutParams()).a != null && zzVar.w()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
        } else {
            if (i5 == 1) {
                int d = zzVar.d();
                int d2 = zzVar.d();
                dy dyVar = (dy) this.a;
                ActionBarContextView actionBarContextView = dyVar.s;
                if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dyVar.s.getLayoutParams();
                    if (dyVar.s.isShown()) {
                        if (dyVar.K == null) {
                            dyVar.K = new Rect();
                            dyVar.L = new Rect();
                        }
                        Rect rect = dyVar.K;
                        Rect rect2 = dyVar.L;
                        rect.set(zzVar.b(), zzVar.d(), zzVar.c(), zzVar.a());
                        vb f = zzVar.f(2);
                        ViewGroup viewGroup = dyVar.x;
                        if (Build.VERSION.SDK_INT >= 29) {
                            WindowInsets.Builder builder = new WindowInsets.Builder();
                            of = Insets.of(rect);
                            systemWindowInsets = builder.setSystemWindowInsets(of);
                            build = systemWindowInsets.build();
                            systemWindowInsets2 = viewGroup.computeSystemWindowInsets(build, rect2).getSystemWindowInsets();
                            i = systemWindowInsets2.left;
                            i2 = systemWindowInsets2.top;
                            i3 = systemWindowInsets2.right;
                            i4 = systemWindowInsets2.bottom;
                            rect.set(i, i2, i3, i4);
                        } else {
                            if (!kt.r) {
                                kt.r = true;
                                try {
                                    kt.s = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    if (!kt.s.isAccessible()) {
                                        kt.s.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = kt.s;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        vb d3 = vb.d(Math.max(0, f.b - rect2.left), Math.max(0, f.c - rect2.top), Math.max(0, f.d - rect2.right), Math.max(0, f.e - rect2.bottom));
                        int i8 = marginLayoutParams.leftMargin;
                        int i9 = d3.b;
                        if (i8 == i9 && marginLayoutParams.rightMargin == d3.d) {
                            r3 = false;
                        } else {
                            marginLayoutParams.leftMargin = i9;
                            marginLayoutParams.rightMargin = d3.d;
                        }
                        ActionBarContextView actionBarContextView2 = dyVar.s;
                        int i10 = rect.left - i9;
                        int i11 = rect.top;
                        int i12 = rect.right - d3.d;
                        actionBarContextView2.k = i10;
                        actionBarContextView2.l = i11;
                        actionBarContextView2.m = i12;
                        actionBarContextView2.n();
                        if (!dyVar.A && rect.top > 0) {
                            d2 = 0;
                        }
                        z = r3;
                    }
                    if (z) {
                        dyVar.s.setLayoutParams(marginLayoutParams);
                    }
                }
                return yq.e(view, d != d2 ? zzVar.p(zzVar.b(), d2, zzVar.c(), zzVar.a()) : zzVar);
            }
            if (i5 == 2) {
                vb a = abc.a(zzVar);
                vb c = vb.c(zzVar.g(519), zzVar.g(64));
                abc abcVar = (abc) this.a;
                if (!a.equals(abcVar.c) || !c.equals(abcVar.d)) {
                    abcVar.c = a;
                    abcVar.d = c;
                    ArrayList arrayList = abcVar.b;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((aay) arrayList.get(size)).b();
                    }
                }
            } else {
                if (i5 != 3) {
                    int i13 = zzVar.f(647).c;
                    fng fngVar = (fng) this.a;
                    fngVar.f(i13);
                    fngVar.d.setVisibility(i13 <= 0 ? 8 : 0);
                    return zzVar;
                }
                AppBarLayout appBarLayout = (AppBarLayout) this.a;
                zz zzVar2 = true != appBarLayout.getFitsSystemWindows() ? null : zzVar;
                if (!Objects.equals(appBarLayout.c, zzVar2)) {
                    appBarLayout.c = zzVar2;
                    appBarLayout.k();
                    appBarLayout.requestLayout();
                    return zzVar;
                }
            }
        }
        return zzVar;
    }

    public /* synthetic */ tu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
