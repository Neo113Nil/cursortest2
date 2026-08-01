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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.trembin.nirefon.betfury.R;
import defpackage.bi;
import defpackage.bo;
import defpackage.i5;
import defpackage.kg;
import defpackage.nb;
import defpackage.o3;
import defpackage.r20;
import defpackage.s20;
import defpackage.s9;
import defpackage.xy;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
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

    public static float B(i5 i5Var, s20 s20Var, float f) {
        long j = s20Var.a;
        long j2 = s20Var.b;
        s20 d = ((r20) i5Var.g).d("expansion");
        return o3.a(f, 0.0f, s20Var.b().getInterpolation((((d.a + d.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, i5 i5Var) {
        s20 d;
        s20 d2;
        if (f == 0.0f || f2 == 0.0f) {
            d = ((r20) i5Var.g).d("translationXLinear");
            d2 = ((r20) i5Var.g).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            d = ((r20) i5Var.g).d("translationXCurveDownwards");
            d2 = ((r20) i5Var.g).d("translationYCurveDownwards");
        } else {
            d = ((r20) i5Var.g).d("translationXCurveUpwards");
            d2 = ((r20) i5Var.g).d("translationYCurveUpwards");
        }
        return new Pair(d, d2);
    }

    public final float A(View view, View view2, xy xyVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        xyVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract i5 D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.hg
    public final boolean f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        s9.u("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.hg
    public final void g(kg kgVar) {
        if (kgVar.h == 0) {
            kgVar.h = 80;
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
        i5 D = D(view2.getContext(), z);
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
        ((r20) D.g).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float z3 = z(view, view2, (xy) D.h);
        float A = A(view, view2, (xy) D.h);
        Pair y = y(z3, A, z, D);
        s20 s20Var = (s20) y.first;
        s20 s20Var2 = (s20) y.second;
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
            float B = B(D, s20Var, -z3);
            float B2 = B(D, s20Var2, -A);
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
        s20Var.a(ofFloat2);
        s20Var2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float z4 = z(view, view2, (xy) D.h);
        float A2 = A(view, view2, (xy) D.h);
        Pair y2 = y(z4, A2, z, D);
        s20 s20Var3 = (s20) y2.first;
        s20 s20Var4 = (s20) y2.second;
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
        s20Var3.a(ofFloat5);
        s20Var4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        nb.a.set(viewGroup, Float.valueOf(f));
                    }
                    nb nbVar = nb.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, nbVar, fArr3);
                } else {
                    nb nbVar2 = nb.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, nbVar2, fArr4);
                }
                ((r20) D.g).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        bi.T(animatorSet, arrayList);
        animatorSet.addListener(new bo(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, xy xyVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        xyVar.getClass();
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
