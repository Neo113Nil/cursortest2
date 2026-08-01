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
import com.derinko.gbini.n1casino.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.da;
import defpackage.e70;
import defpackage.mu;
import defpackage.nu;
import defpackage.q4;
import defpackage.qd;
import defpackage.t8;
import defpackage.ui;
import defpackage.vw;
import defpackage.w2;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
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

    public static float B(q4 q4Var, nu nuVar, float f) {
        long j = nuVar.a;
        long j2 = nuVar.b;
        nu d = ((mu) q4Var.g).d("expansion");
        return w2.a(f, 0.0f, nuVar.b().getInterpolation((((d.a + d.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, q4 q4Var) {
        nu d;
        nu d2;
        if (f == 0.0f || f2 == 0.0f) {
            d = ((mu) q4Var.g).d("translationXLinear");
            d2 = ((mu) q4Var.g).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            d = ((mu) q4Var.g).d("translationXCurveDownwards");
            d2 = ((mu) q4Var.g).d("translationYCurveDownwards");
        } else {
            d = ((mu) q4Var.g).d("translationXCurveUpwards");
            d2 = ((mu) q4Var.g).d("translationYCurveUpwards");
        }
        return new Pair(d, d2);
    }

    public final float A(View view, View view2, vw vwVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        vwVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract q4 D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.nd
    public final boolean f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        t8.t("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.nd
    public final void g(qd qdVar) {
        if (qdVar.h == 0) {
            qdVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        int i;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        q4 D = D(view2.getContext(), z);
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
        ((mu) D.g).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float z3 = z(view, view2, (vw) D.h);
        float A = A(view, view2, (vw) D.h);
        Pair y = y(z3, A, z, D);
        nu nuVar = (nu) y.first;
        nu nuVar2 = (nu) y.second;
        RectF rectF = this.d;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-z3);
                view2.setTranslationY(-A);
            }
            i = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float B = B(D, nuVar, -z3);
            float B2 = B(D, nuVar2, -A);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            C(view2, rectF2);
            rectF2.offset(B, B2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -z3);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -A);
        }
        nuVar.a(ofFloat2);
        nuVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float z4 = z(view, view2, (vw) D.h);
        float A2 = A(view, view2, (vw) D.h);
        Pair y2 = y(z4, A2, z, D);
        nu nuVar3 = (nu) y2.first;
        nu nuVar4 = (nu) y2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            z4 = this.g;
        }
        float[] fArr = new float[1];
        fArr[i] = z4;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            A2 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = A2;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        nuVar3.a(ofFloat5);
        nuVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        da.a.set(viewGroup, Float.valueOf(f));
                    }
                    da daVar = da.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, daVar, fArr3);
                } else {
                    da daVar2 = da.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, daVar2, fArr4);
                }
                ((mu) D.g).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        e70.G(animatorSet, arrayList);
        animatorSet.addListener(new ui(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, vw vwVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        vwVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
