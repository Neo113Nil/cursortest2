package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmm {
    protected final fhg a;
    public final View b;
    public final View c;
    protected final Rect d;
    protected final float e;
    protected final int f;
    protected final float g;
    protected final Rect h;
    public final List i;
    public final List j;

    /* JADX WARN: Multi-variable type inference failed */
    protected dmm(dmq dmqVar, fhg fhgVar, View view) {
        this.a = fhgVar;
        View view2 = (View) fhgVar;
        this.b = view2;
        this.c = view;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.d = dmqVar.b;
        this.e = dmqVar.c;
        this.f = dmqVar.a;
        this.g = dmqVar.d;
        Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        this.h = rect;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        rect.offsetTo(iArr[0], iArr[1]);
        rect.offset((int) (-view2.getTranslationX()), (int) (-view2.getTranslationY()));
    }

    public final void a(Animator animator, long j, long j2) {
        animator.setStartDelay(j);
        animator.setDuration(j2);
        animator.setInterpolator(dmk.c);
        this.i.add(animator);
    }

    public final void b(Animator.AnimatorListener animatorListener) {
        this.j.add(animatorListener);
    }

    protected final float c() {
        return (this.d.exactCenterX() - this.h.exactCenterX()) + 0.0f;
    }

    protected final float d() {
        return (this.d.exactCenterY() - this.h.exactCenterY()) + 0.0f;
    }

    public final void e(dmx dmxVar) {
        PointF[] pointFArr = {new PointF(c(), d())};
        TimeInterpolator timeInterpolator = dmy.a;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.b, (Property<View, V>) dmz.a, new dmw(dmxVar), pointFArr);
        ofObject.setDuration(300L);
        ofObject.setInterpolator(dmy.a);
        ofObject.setStartDelay(ofObject.getStartDelay());
        ofObject.setDuration(ofObject.getDuration());
        this.i.add(ofObject);
    }

    public final void f() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a, (Property<fhg, Integer>) fhe.a, this.f);
        ofInt.setEvaluator(dmj.a);
        a(ofInt, 60L, 150L);
    }

    public final void g() {
        a(ObjectAnimator.ofFloat((ViewGroup) this.b, (Property<ViewGroup, Float>) dmo.a, 0.0f), 0L, 75L);
    }

    public final void h() {
        View view = this.b;
        a(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Z, -(view.getElevation() - this.g)), 150L, 150L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        float c = c();
        float d = d();
        Rect rect = this.d;
        float centerX = rect.centerX();
        Rect rect2 = this.h;
        float f = rect2.left + c;
        float centerY = rect.centerY();
        float f2 = rect2.top + d;
        fhg fhgVar = this.a;
        fhgVar.b().getClass();
        Property property = fhd.a;
        TypeEvaluator typeEvaluator = fhc.a;
        float f3 = centerX - f;
        float f4 = centerY - f2;
        float f5 = this.e;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(fhgVar, (Property<fhg, V>) property, typeEvaluator, new fhf(f3, f4, f5));
        fhf b = fhgVar.b();
        if (b == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        int i = (int) f3;
        int i2 = (int) f4;
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) fhgVar, i, i2, b.c, f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        Interpolator interpolator = dmk.a;
        animatorSet.setStartDelay(0L);
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(interpolator);
        this.i.add(animatorSet);
        b(new fhb(fhgVar));
        a(ViewAnimationUtils.createCircularReveal(this.b, i, i2, f5, f5), 180L, 120L);
    }

    public dmm(dmq dmqVar, fhg fhgVar, View view, byte[] bArr) {
        this(dmqVar, fhgVar, view);
    }
}
