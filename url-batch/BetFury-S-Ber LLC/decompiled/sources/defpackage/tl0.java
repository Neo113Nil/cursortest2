package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tl0 implements q40 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public tl0(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f = 3;
        lowerBound = bounds.getLowerBound();
        this.g = fv.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = fv.d(upperBound);
    }

    public void a(x80 x80Var, t30 t30Var) {
        zd0 zd0Var = (zd0) this.g;
        nm0 nm0Var = (nm0) zd0Var.get(x80Var);
        if (nm0Var == null) {
            nm0Var = nm0.a();
            zd0Var.put(x80Var, nm0Var);
        }
        nm0Var.c = t30Var;
        nm0Var.a |= 8;
    }

    public View b(int i, int i2, int i3, int i4) {
        View u;
        sl0 sl0Var = (sl0) this.h;
        f80 f80Var = (f80) this.g;
        int d = f80Var.d();
        int c = f80Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (f80Var.a) {
                case 0:
                    u = f80Var.b.u(i);
                    break;
                default:
                    u = f80Var.b.u(i);
                    break;
            }
            int b = f80Var.b(u);
            int a = f80Var.a(u);
            sl0Var.b = d;
            sl0Var.c = c;
            sl0Var.d = b;
            sl0Var.e = a;
            if (i3 != 0) {
                sl0Var.a = i3;
                if (sl0Var.a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                sl0Var.a = i4;
                if (sl0Var.a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean c(View view) {
        sl0 sl0Var = (sl0) this.h;
        f80 f80Var = (f80) this.g;
        int d = f80Var.d();
        int c = f80Var.c();
        int b = f80Var.b(view);
        int a = f80Var.a(view);
        sl0Var.b = d;
        sl0Var.c = c;
        sl0Var.d = b;
        sl0Var.e = a;
        sl0Var.a = 24579;
        return sl0Var.a();
    }

    public t30 d(x80 x80Var, int i) {
        nm0 nm0Var;
        t30 t30Var;
        zd0 zd0Var = (zd0) this.g;
        int d = zd0Var.d(x80Var);
        if (d >= 0 && (nm0Var = (nm0) zd0Var.i(d)) != null) {
            int i2 = nm0Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                nm0Var.a = i3;
                if (i == 4) {
                    t30Var = nm0Var.b;
                } else if (i == 8) {
                    t30Var = nm0Var.c;
                } else {
                    s9.k("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    zd0Var.g(d);
                    nm0Var.a = 0;
                    nm0Var.b = null;
                    nm0Var.c = null;
                    nm0.d.c(nm0Var);
                }
                return t30Var;
            }
        }
        return null;
    }

    public void e(x80 x80Var) {
        nm0 nm0Var = (nm0) ((zd0) this.g).get(x80Var);
        if (nm0Var == null) {
            return;
        }
        nm0Var.a &= -2;
    }

    public void f(x80 x80Var) {
        ez ezVar = (ez) this.h;
        int e = ezVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (x80Var == ezVar.f(e)) {
                Object[] objArr = ezVar.h;
                Object obj = objArr[e];
                Object obj2 = bi.i;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    ezVar.f = true;
                }
            } else {
                e--;
            }
        }
        nm0 nm0Var = (nm0) ((zd0) this.g).remove(x80Var);
        if (nm0Var != null) {
            nm0Var.a = 0;
            nm0Var.b = null;
            nm0Var.c = null;
            nm0.d.c(nm0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dp0 i(View view, dp0 dp0Var) {
        boolean z;
        boolean z2;
        e9 e9Var = (e9) this.g;
        bn0 bn0Var = (bn0) this.h;
        int i = bn0Var.a;
        int i2 = bn0Var.b;
        int i3 = bn0Var.c;
        ap0 ap0Var = dp0Var.a;
        fv h = ap0Var.h(519);
        fv h2 = ap0Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e9Var.g;
        int i4 = h.b;
        int i5 = h.c;
        int i6 = h.a;
        bottomSheetBehavior.x = i4;
        boolean z3 = true;
        boolean z4 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z5 = bottomSheetBehavior.p;
        if (z5) {
            int a = dp0Var.a();
            bottomSheetBehavior.w = a;
            paddingBottom = a + i3;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (z4 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.r) {
            if (!z4) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = h.b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
                if (z3) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
                z2 = e9Var.f;
                if (z2) {
                    bottomSheetBehavior.n = h2.d;
                }
                if (z5 && !z2) {
                    return dp0Var;
                }
                bottomSheetBehavior.S();
                return dp0Var;
            }
        }
        z3 = z;
        if (z3) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        z2 = e9Var.f;
        if (z2) {
        }
        if (z5) {
        }
        bottomSheetBehavior.S();
        return dp0Var;
    }

    public String toString() {
        switch (this.f) {
            case 3:
                return "Bounds{lower=" + ((fv) this.g) + " upper=" + ((fv) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public tl0() {
        this.f = 1;
        this.g = new zd0(0);
        this.h = new ez();
    }

    public tl0(f80 f80Var) {
        this.f = 0;
        this.g = f80Var;
        sl0 sl0Var = new sl0();
        sl0Var.a = 0;
        this.h = sl0Var;
    }

    public /* synthetic */ tl0(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
