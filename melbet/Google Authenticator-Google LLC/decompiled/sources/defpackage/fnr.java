package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnr {
    public static final /* synthetic */ int x = 0;
    private static final TimeInterpolator y = fes.a;
    private final ImageButton A;
    public final fng a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final Toolbar f;
    public final Toolbar g;
    public final TextView h;
    public final TextView i;
    public final EditText j;
    public final View k;
    public final TouchObserverFrameLayout l;
    AnimatorSet m;
    public final fkm n;
    public AnimatorSet o;
    public fmt p;
    public final Context q;
    final fnl r;
    public final TimeInterpolator s;
    public final TimeInterpolator t;
    public final int u;
    public final int v;
    gam w;
    private final View z;

    public fnr(Context context, fng fngVar, boolean z) {
        this.q = context;
        this.a = fngVar;
        this.b = fngVar.a;
        this.z = fngVar.c;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = fngVar.b;
        this.c = clippableRoundedCornerLayout;
        this.d = fngVar.e;
        this.e = fngVar.f;
        this.f = fngVar.g;
        this.g = fngVar.h;
        this.h = fngVar.i;
        this.i = fngVar.j;
        this.j = fngVar.k;
        this.A = fngVar.l;
        this.k = fngVar.m;
        this.l = fngVar.n;
        this.n = new fkm(clippableRoundedCornerLayout);
        TimeInterpolator timeInterpolator = y;
        this.s = fny.p(context, R.attr.motionEasingStandardAccelerateInterpolator, timeInterpolator);
        this.t = fny.p(context, R.attr.motionEasingStandardDecelerateInterpolator, timeInterpolator);
        this.u = fny.i(context, R.attr.motionDurationShort1, 100);
        this.v = fny.i(context, R.attr.motionDurationShort2, 100);
        this.r = z ? new fno(this) : new fnq(this);
    }

    public static final void n(Toolbar toolbar) {
        ActionMenuView a = fjx.a(toolbar);
        if (a != null) {
            for (int i = 0; i < a.getChildCount(); i++) {
                View childAt = a.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private final void o(AnimatorSet animatorSet) {
        ImageButton b = fjx.b(this.f);
        if (b == null) {
            return;
        }
        Drawable k = pj.k(b.getDrawable());
        if (!this.a.p) {
            if (k instanceof eo) {
                ((eo) k).b(1.0f);
            }
            if (k instanceof fis) {
                ((fis) k).a(1.0f);
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (k instanceof eo) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new mu((eo) k, 12, bArr));
            animatorSet.playTogether(ofFloat);
        }
        if (k instanceof fis) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new mu((fis) k, 13, bArr));
            animatorSet.playTogether(ofFloat2);
        }
        fmt fmtVar = this.p;
        if (fmtVar == null || fmtVar.e() != null) {
            return;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new mu(b, 14, bArr));
        animatorSet.playTogether(ofFloat3);
    }

    public final int a(View view, View view2) {
        if (view != null) {
            return b(view) - b(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.p.getPaddingStart();
        int b = b(this.p);
        return fik.i(this.p) ? (((b + this.p.getWidth()) + marginStart) - paddingStart) - this.a.getRight() : (b - marginStart) + paddingStart;
    }

    public final int b(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final int c(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public final Animator d(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(true != z ? 42L : 50L);
        ofFloat.setStartDelay(true != z ? 0L : 250L);
        ofFloat.setInterpolator(fjo.a(z, fes.a));
        ofFloat.addUpdateListener(fiy.a(this.A));
        return ofFloat;
    }

    public final AnimatorSet e(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        o(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(fjo.a(z, fes.b));
        return animatorSet;
    }

    public final AnimatorSet f(boolean z) {
        AnimatorSet a = this.r.a(z);
        if (this.o == null) {
            a.playTogether(e(z));
        }
        return a;
    }

    public final AnimatorSet g(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        ofFloat.addUpdateListener(fiy.c(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        o(animatorSet);
        animatorSet.setInterpolator(fjo.a(z, fes.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final AnimatorSet h() {
        j();
        fmt fmtVar = this.p;
        fng fngVar = this.a;
        if (fmtVar == null) {
            if (fngVar.i()) {
                this.j.clearFocus();
            }
            AnimatorSet g = g(false);
            g.addListener(new fnk(this, g));
            g.start();
            this.m = g;
            return g;
        }
        if (fngVar.i()) {
            this.j.clearFocus();
        }
        gam gamVar = new gam((byte[]) null);
        AnimatorSet f = f(false);
        gamVar.b(f);
        Iterator it = i(false).iterator();
        while (it.hasNext()) {
            gamVar.c((act) it.next());
        }
        gamVar.d(new fni(this, gamVar, 0));
        gamVar.f();
        this.w = gamVar;
        return f;
    }

    public final List i(boolean z) {
        return this.r.b(z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    final void j() {
        gam gamVar = this.w;
        if (gamVar != null) {
            ?? r3 = gamVar.e;
            ArrayList arrayList = new ArrayList((Collection) r3);
            r3.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animator) arrayList.get(i)).end();
            }
            ?? r2 = gamVar.a;
            ArrayList arrayList2 = new ArrayList((Collection) r2);
            r2.clear();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                acr acrVar = (acr) arrayList2.get(i2);
                if (acrVar instanceof act) {
                    act actVar = (act) acrVar;
                    if (actVar.l()) {
                        actVar.k();
                    } else {
                        actVar.b();
                    }
                } else {
                    acrVar.b();
                }
            }
            gamVar.d.clear();
            gamVar.b = 0;
            gamVar.c = false;
            this.w = null;
        }
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.m = null;
        }
    }

    public final void k(float f) {
        this.z.getBackground().mutate().setAlpha((int) (f * 255.0f));
    }

    public final void l(float f) {
        ActionMenuView a;
        this.A.setAlpha(f);
        this.k.setAlpha(f);
        this.l.setAlpha(f);
        if (!this.a.q || (a = fjx.a(this.f)) == null) {
            return;
        }
        a.setAlpha(f);
    }

    public final boolean m() {
        Menu f;
        fmt fmtVar = this.p;
        if (fmtVar.F != -1 && this.a.q && (f = fmtVar.f()) != null) {
            for (int i = 0; i < f.size(); i++) {
                if (f.getItem(i).isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }
}
