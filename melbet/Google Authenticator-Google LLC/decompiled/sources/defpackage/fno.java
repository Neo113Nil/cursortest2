package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fno implements fnl {
    public final /* synthetic */ fnr a;

    public fno(fnr fnrVar) {
        this.a = fnrVar;
    }

    public static final void g(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    private final int h(Toolbar toolbar) {
        fnr fnrVar = this.a;
        int b = fnrVar.b(fnrVar.p);
        FrameLayout frameLayout = fnrVar.e;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return fik.i(fnrVar.p) ? (b + fnrVar.p.getWidth()) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (b - paddingStart) - marginStart;
    }

    private final act i(View view, acs acsVar, float f, float f2) {
        act actVar = new act(view, acsVar);
        actVar.t = fny.q(this.a.q, R.style.Motion_Material3_Spring_Standard_Default_Spatial);
        actVar.i(f);
        actVar.t.d(f2);
        return actVar;
    }

    private final act j(boolean z, View view) {
        fnr fnrVar = this.a;
        TextView textView = fnrVar.p.A;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = fnrVar.p.z;
        }
        float a = fnrVar.a(textView, view) - h(fnrVar.f);
        if (fik.i(fnrVar.p)) {
            a += textView.getWidth() - view.getWidth();
        }
        float f = true != z ? 0.0f : a;
        if (true == z) {
            a = 0.0f;
        }
        return i(view, act.a, f, a);
    }

    private final act k(boolean z, Toolbar toolbar) {
        int h = h(toolbar);
        int i = true != z ? 0 : h;
        if (true == z) {
            h = 0;
        }
        return i(toolbar, act.a, i, h);
    }

    private final act l(final boolean z, final Toolbar toolbar) {
        fnr fnrVar = this.a;
        int width = fnrVar.p.getWidth();
        FrameLayout frameLayout = fnrVar.e;
        int width2 = frameLayout.getWidth();
        int paddingStart = frameLayout.getPaddingStart() + frameLayout.getPaddingEnd();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fnrVar.f.getLayoutParams();
        int marginStart = (width2 - paddingStart) - (marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd());
        int i = true != z ? marginStart : width;
        if (true == z) {
            width = marginStart;
        }
        act i2 = i(toolbar, new fnn(), i, width);
        i2.g(new acp() { // from class: fnm
            @Override // defpackage.acp
            public final void a(acr acrVar) {
                if (z) {
                    fno.g(toolbar, -1);
                }
            }
        });
        return i2;
    }

    private static final ValueAnimator m(boolean z) {
        return ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
    }

    private static final Animator n(View view, boolean z, float f) {
        float f2 = true != z ? f : 0.0f;
        if (true != z) {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.addUpdateListener(fiy.b(view));
        return ofFloat;
    }

    private static final Animator o(View view, boolean z) {
        ValueAnimator m = m(!z);
        m.addUpdateListener(fiy.a(view));
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fnl
    public final AnimatorSet a(boolean z) {
        long j;
        Object[] objArr;
        Object[] objArr2;
        View view;
        Object[] objArr3;
        View b;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[6];
        ValueAnimator m = m(z);
        fnr fnrVar = this.a;
        long j2 = fnrVar.v;
        m.setDuration(j2);
        long j3 = 0;
        if (z) {
            j = 0;
            objArr = true;
        } else {
            j = fnrVar.u;
            objArr = false;
        }
        m.setStartDelay(j);
        m.setInterpolator(objArr != false ? fnrVar.t : fnrVar.s);
        View view2 = null;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        m.addUpdateListener(new mu(this, 16, 0 == true ? 1 : 0));
        animatorArr[0] = m;
        ValueAnimator m2 = m(z);
        m2.setDuration(j2);
        if (z) {
            j3 = fnrVar.u;
            objArr2 = true;
        } else {
            objArr2 = false;
        }
        m2.setStartDelay(j3);
        m2.setInterpolator(objArr2 != false ? fnrVar.s : fnrVar.t);
        m2.addUpdateListener(fiy.a(fnrVar.l));
        animatorArr[1] = m2;
        ValueAnimator m3 = m(z);
        m3.setDuration(j2);
        m3.setInterpolator(z ? fnrVar.t : fnrVar.s);
        m3.addUpdateListener(new mu(this, 15, objArr5 == true ? 1 : 0));
        animatorArr[2] = m3;
        if (z) {
            view = fnrVar.p.z;
            objArr3 = true;
        } else {
            view = fnrVar.j;
            objArr3 = false;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getWidth(), (objArr3 != false ? fnrVar.j : fnrVar.p.z).getWidth());
        ofInt.setDuration(j2);
        ofInt.setInterpolator(objArr3 != false ? fnrVar.t : fnrVar.s);
        ofInt.addUpdateListener(new mu(this, 17, objArr4 == true ? 1 : 0));
        animatorArr[3] = ofInt;
        animatorArr[4] = fnrVar.d(z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AppBarLayout E = fnrVar.p.E();
        fmt fmtVar = fnrVar.p;
        if (fmtVar != null && E != null) {
            int i = fmtVar.H;
            if (i != -1) {
                b = E.findViewById(i);
            } else {
                ViewParent parent = fmtVar.getParent();
                b = !(parent instanceof Toolbar) ? null : fjx.b((Toolbar) parent);
            }
            fmt fmtVar2 = fnrVar.p;
            int i2 = fmtVar2.I;
            if (i2 != -1) {
                view2 = E.findViewById(i2);
            } else {
                ViewParent parent2 = fmtVar2.getParent();
                if (parent2 instanceof Toolbar) {
                    view2 = fjx.a((Toolbar) parent2);
                }
            }
            boolean i3 = fik.i(fnrVar.p);
            int width = E.getWidth();
            if (b != null) {
                Rect d = fik.d(E, b);
                animatorSet2.playTogether(n(b, z, i3 ? width - d.left : -d.right));
                animatorSet2.playTogether(o(b, z));
            }
            if (view2 != null) {
                Rect d2 = fik.d(E, view2);
                animatorSet2.playTogether(n(view2, z, i3 ? -d2.right : width - d2.left));
                animatorSet2.playTogether(o(view2, z));
            }
            animatorSet2.setDuration(j2);
            animatorSet2.setInterpolator(fes.a);
        }
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.fnl
    public final List b(boolean z) {
        act[] actVarArr = new act[7];
        fnr fnrVar = this.a;
        Toolbar toolbar = fnrVar.f;
        actVarArr[0] = l(z, toolbar);
        actVarArr[1] = k(z, toolbar);
        Toolbar toolbar2 = fnrVar.g;
        actVarArr[2] = l(z, toolbar2);
        actVarArr[3] = k(z, toolbar2);
        int c = fnrVar.c(fnrVar.p) - fnrVar.c(toolbar);
        actVarArr[4] = i(fnrVar.e, act.b, true != z ? 0 : c, true != z ? c : 0);
        actVarArr[5] = j(z, fnrVar.j);
        actVarArr[6] = j(z, fnrVar.i);
        return Arrays.asList(actVarArr);
    }

    @Override // defpackage.fnl
    public final void c(boolean z) {
        fnr fnrVar = this.a;
        if (z) {
            fnrVar.k(1.0f);
            fnrVar.l.setAlpha(1.0f);
        } else {
            fnrVar.k(0.0f);
            fnrVar.l.setAlpha(0.0f);
            fnrVar.p.setVisibility(0);
        }
        fnr fnrVar2 = this.a;
        fnrVar2.g.setVisibility(4);
        g(fnrVar2.i, -2);
    }

    @Override // defpackage.fnl
    public final void d(boolean z) {
        fnr fnrVar = this.a;
        if (z) {
            fnrVar.k(0.0f);
            fnrVar.f.setAlpha(0.0f);
            fnrVar.l.setAlpha(0.0f);
            fnrVar.p.setVisibility(4);
        } else {
            fnrVar.k(1.0f);
            fnrVar.l.setAlpha(1.0f);
        }
        this.a.g.setVisibility(0);
    }

    @Override // defpackage.fnl
    public final void e() {
        fnr fnrVar = this.a;
        TextView textView = fnrVar.p.z;
        CharSequence text = textView.getText();
        TextView textView2 = fnrVar.i;
        textView2.setText(text);
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (fnrVar.p.getBackground() != null && fnrVar.p.getBackground().getConstantState() != null) {
            fnrVar.g.setBackground(fnrVar.p.getBackground().getConstantState().newDrawable());
        }
        Toolbar toolbar = fnrVar.g;
        Menu f = toolbar.f();
        if (f != null) {
            f.clear();
        }
        if (fnrVar.m()) {
            toolbar.m(fnrVar.p.F);
            fnr.n(toolbar);
        }
    }

    @Override // defpackage.fnl
    public final void f() {
    }
}
