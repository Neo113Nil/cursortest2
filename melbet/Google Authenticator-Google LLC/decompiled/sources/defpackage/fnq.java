package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnq implements fnl {
    public final /* synthetic */ fnr a;

    public fnq(fnr fnrVar) {
        this.a = fnrVar;
    }

    private final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        fnr fnrVar = this.a;
        int b = fnrVar.b(fnrVar.p);
        return fik.i(fnrVar.p) ? b - marginEnd : ((b + fnrVar.p.getWidth()) + marginEnd) - fnrVar.a.getWidth();
    }

    private final int h() {
        fnr fnrVar = this.a;
        FrameLayout frameLayout = fnrVar.e;
        return (fnrVar.c(fnrVar.p) + (fnrVar.p.getHeight() / 2)) - (frameLayout.getTop() + (frameLayout.getHeight() / 2));
    }

    private final Animator i(boolean z, View view) {
        fnr fnrVar = this.a;
        TextView textView = fnrVar.p.A;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = fnrVar.p.z;
        }
        int b = fnrVar.b(textView) - fnrVar.b(view);
        if (fik.i(fnrVar.p)) {
            b += textView.getWidth() - view.getWidth();
        }
        return k(z, view, b, h());
    }

    private final AnimatorSet j(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.a.f;
        ImageButton b = fjx.b(toolbar);
        if (b != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r1.a(fjx.b(r1.p), b), 0.0f);
            ofFloat.addUpdateListener(fiy.b(b));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(h(), 0.0f);
            ofFloat2.addUpdateListener(fiy.c(b));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView a = fjx.a(toolbar);
        if (a != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(r1.a(fjx.a(r1.p), a), 0.0f);
            ofFloat3.addUpdateListener(fiy.b(a));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(h(), 0.0f);
            ofFloat4.addUpdateListener(fiy.c(a));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(fjo.a(z, fes.b));
        return animatorSet;
    }

    private static final Animator k(boolean z, View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(fiy.b(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        ofFloat2.addUpdateListener(fiy.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(fjo.a(z, fes.b));
        return animatorSet;
    }

    @Override // defpackage.fnl
    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        fnr fnrVar = this.a;
        if (fnrVar.o == null) {
            animatorSet.playTogether(j(z));
        }
        Animator[] animatorArr = new Animator[10];
        TimeInterpolator timeInterpolator = z ? fes.a : fes.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(true != z ? 250L : 300L);
        ofFloat.setStartDelay(true != z ? 0L : 100L);
        ofFloat.setInterpolator(fjo.a(z, timeInterpolator));
        ofFloat.addUpdateListener(fiy.a(fnrVar.b));
        animatorArr[0] = ofFloat;
        long j = true != z ? 250L : 300L;
        fkm fkmVar = fnrVar.n;
        Rect rect = fkmVar.g;
        Rect rect2 = fkmVar.h;
        if (rect == null) {
            rect = fik.j(fnrVar.a);
        }
        if (rect2 == null) {
            rect2 = fik.d(fnrVar.c, fnrVar.p);
        }
        final Rect rect3 = new Rect(rect2);
        final float D = fnrVar.p.D();
        float[] fArr = fnrVar.c.b;
        float[] i = fkmVar.i();
        int i2 = 4;
        final float[] fArr2 = {Math.max(fArr[0], i[0]), Math.max(fArr[1], i[1]), Math.max(fArr[2], i[2]), Math.max(fArr[3], i[3]), Math.max(fArr[4], i[4]), Math.max(fArr[5], i[5]), Math.max(fArr[6], i[6]), Math.max(fArr[7], i[7])};
        ValueAnimator ofObject = ValueAnimator.ofObject(new fjn(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fnp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                TimeInterpolator timeInterpolator2 = fes.a;
                float f2 = D;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                Rect rect4 = rect3;
                fnq.this.a.c.a(rect4.left, rect4.top, rect4.right, rect4.bottom, fArr4);
            }
        });
        ofObject.setDuration(j);
        TimeInterpolator timeInterpolator2 = fes.b;
        ofObject.setInterpolator(fjo.a(z, timeInterpolator2));
        animatorArr[1] = ofObject;
        animatorArr[2] = fnrVar.d(z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(true != z ? 83L : 150L);
        ofFloat2.setStartDelay(true != z ? 0L : 75L);
        TimeInterpolator timeInterpolator3 = fes.a;
        ofFloat2.setInterpolator(fjo.a(z, timeInterpolator3));
        View view = fnrVar.k;
        TouchObserverFrameLayout touchObserverFrameLayout = fnrVar.l;
        ofFloat2.addUpdateListener(fiy.a(view, touchObserverFrameLayout));
        animatorArr2[0] = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat3.setDuration(j);
        ofFloat3.setInterpolator(fjo.a(z, timeInterpolator2));
        ofFloat3.addUpdateListener(fiy.c(view));
        animatorArr2[1] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat4.setDuration(j);
        ofFloat4.setInterpolator(fjo.a(z, timeInterpolator2));
        ofFloat4.addUpdateListener(new fiy(new fiw(0), touchObserverFrameLayout));
        animatorArr2[2] = ofFloat4;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        View view2 = fnrVar.d;
        animatorArr[4] = k(z, view2, g(view2), h());
        Toolbar toolbar = fnrVar.g;
        animatorArr[5] = k(z, toolbar, g(toolbar) - (fnrVar.p.getPaddingEnd() - toolbar.getPaddingEnd()), h());
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat5.setDuration(j);
        ofFloat5.setInterpolator(fjo.a(z, timeInterpolator2));
        if (fnrVar.a.q) {
            ofFloat5.addUpdateListener(new fit(fjx.a(toolbar), fjx.a(fnrVar.f)));
        }
        animatorArr[6] = ofFloat5;
        EditText editText = fnrVar.j;
        animatorArr[7] = i(z, editText);
        animatorArr[8] = i(z, fnrVar.h);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (fnrVar.p != null && !TextUtils.equals(editText.getText(), fnrVar.p.G())) {
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat6.addUpdateListener(new mu(this, 18, null));
            animatorSet3.playTogether(ofFloat6);
        }
        if (fnrVar.p != null && TextUtils.equals(editText.getText(), fnrVar.p.G())) {
            Rect rect4 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(fnrVar.p.z.getWidth(), editText.getWidth());
            ofInt.addUpdateListener(new edm(this, rect4, i2));
            animatorSet3.playTogether(ofInt);
        }
        animatorSet3.setDuration(j);
        animatorSet3.setInterpolator(fjo.a(z, timeInterpolator3));
        animatorArr[9] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.fnl
    public final List b(boolean z) {
        return new ArrayList();
    }

    @Override // defpackage.fnl
    public final void c(boolean z) {
        float f = true != z ? 0.0f : 1.0f;
        fnr fnrVar = this.a;
        fnrVar.l(f);
        EditText editText = fnrVar.j;
        editText.setAlpha(1.0f);
        fmt fmtVar = fnrVar.p;
        if (fmtVar != null) {
            fmtVar.z.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = fnrVar.c;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        fnrVar.n.i = null;
    }

    @Override // defpackage.fnl
    public final void d(boolean z) {
        this.a.l(true != z ? 1.0f : 0.0f);
    }

    @Override // defpackage.fnl
    public final void e() {
        fnr fnrVar = this.a;
        Toolbar toolbar = fnrVar.g;
        Menu f = toolbar.f();
        if (f != null) {
            f.clear();
        }
        if (!fnrVar.m()) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.m(fnrVar.p.F);
        fnr.n(toolbar);
        toolbar.setVisibility(0);
    }

    @Override // defpackage.fnl
    public final void f() {
        j(false).start();
    }
}
