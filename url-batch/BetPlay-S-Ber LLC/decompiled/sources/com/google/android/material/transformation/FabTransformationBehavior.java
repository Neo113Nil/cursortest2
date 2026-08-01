package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.awerser.monnit.betplay.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ba;
import defpackage.bv;
import defpackage.cv;
import defpackage.h5;
import defpackage.ix;
import defpackage.ni;
import defpackage.o3;
import defpackage.o8;
import defpackage.op;
import defpackage.ud;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair c(float f, float f2, boolean z, h5 h5Var) {
        cv d;
        cv d2;
        if (f == 0.0f || f2 == 0.0f) {
            d = ((bv) h5Var.g).d("translationXLinear");
            d2 = ((bv) h5Var.g).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            d = ((bv) h5Var.g).d("translationXCurveDownwards");
            d2 = ((bv) h5Var.g).d("translationYCurveDownwards");
        } else {
            d = ((bv) h5Var.g).d("translationXCurveUpwards");
            d2 = ((bv) h5Var.g).d("translationYCurveUpwards");
        }
        return new Pair(d, d2);
    }

    public static float f(h5 h5Var, cv cvVar, float f) {
        long j = cvVar.a;
        long j2 = cvVar.b;
        cv d = ((bv) h5Var.g).d("expansion");
        return o3.a(f, 0.0f, cvVar.b().getInterpolation((((d.a + d.b) + 17) - j) / j2));
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        int i;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        h5 h = h(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((bv) h.g).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float d = d(view, view2, (ix) h.h);
        float e = e(view, view2, (ix) h.h);
        Pair c = c(d, e, z, h);
        cv cvVar = (cv) c.first;
        cv cvVar2 = (cv) c.second;
        RectF rectF = this.d;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-d);
                view2.setTranslationY(-e);
            }
            i = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float f2 = f(h, cvVar, -d);
            float f3 = f(h, cvVar2, -e);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            g(view2, rectF2);
            rectF2.offset(f2, f3);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -d);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -e);
        }
        cvVar.a(ofFloat2);
        cvVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float d2 = d(view, view2, (ix) h.h);
        float e2 = e(view, view2, (ix) h.h);
        Pair c2 = c(d2, e2, z, h);
        cv cvVar3 = (cv) c2.first;
        cv cvVar4 = (cv) c2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            d2 = this.g;
        }
        float[] fArr = new float[1];
        fArr[i] = d2;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            e2 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = e2;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        cvVar3.a(ofFloat5);
        cvVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        ba.a.set(viewGroup, Float.valueOf(f));
                    }
                    ba baVar = ba.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, baVar, fArr3);
                } else {
                    ba baVar2 = ba.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, baVar2, fArr4);
                }
                ((bv) h.g).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        op.G(animatorSet, arrayList);
        animatorSet.addListener(new ni(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float d(View view, View view2, ix ixVar) {
        RectF rectF = this.d;
        g(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        g(view2, rectF2);
        ixVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float e(View view, View view2, ix ixVar) {
        RectF rectF = this.d;
        g(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        g(view2, rectF2);
        ixVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void g(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract h5 h(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.rd
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            o8.t("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
            return false;
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // defpackage.rd
    public final void onAttachedToLayoutParams(ud udVar) {
        if (udVar.h == 0) {
            udVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
