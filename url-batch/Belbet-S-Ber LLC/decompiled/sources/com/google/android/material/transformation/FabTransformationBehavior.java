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
import androidx.emoji2.text.q;
import com.gdmhkmf.belbet.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import r1.a;
import r1.b;
import r1.c;
import r1.e;
import r1.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1274c;
    public final RectF d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1275e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1276f;

    /* renamed from: g, reason: collision with root package name */
    public float f1277g;
    public float h;

    public FabTransformationBehavior() {
        this.f1274c = new Rect();
        this.d = new RectF();
        this.f1275e = new RectF();
        this.f1276f = new int[2];
    }

    public static Pair t(float f5, float f6, boolean z4, q qVar) {
        f d;
        f d5;
        if (f5 == 0.0f || f6 == 0.0f) {
            d = ((e) qVar.f466g).d("translationXLinear");
            d5 = ((e) qVar.f466g).d("translationYLinear");
        } else if ((!z4 || f6 >= 0.0f) && (z4 || f6 <= 0.0f)) {
            d = ((e) qVar.f466g).d("translationXCurveDownwards");
            d5 = ((e) qVar.f466g).d("translationYCurveDownwards");
        } else {
            d = ((e) qVar.f466g).d("translationXCurveUpwards");
            d5 = ((e) qVar.f466g).d("translationYCurveUpwards");
        }
        return new Pair(d, d5);
    }

    public static float w(q qVar, f fVar, float f5) {
        long j2 = fVar.f3212a;
        long j4 = fVar.f3213b;
        f d = ((e) qVar.f466g).d("expansion");
        return a.a(f5, 0.0f, fVar.b().getInterpolation((((d.f3212a + d.f3213b) + 17) - j2) / j4));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, a0.c
    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // a0.c
    public final void c(a0.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet s(View view, View view2, boolean z4, boolean z5) {
        ObjectAnimator ofFloat;
        int i;
        float f5;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        q y4 = y(view2.getContext(), z4);
        if (z4) {
            this.f1277g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z4) {
            if (!z5) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((e) y4.f466g).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float u4 = u(view, view2, (o2.f) y4.h);
        float v4 = v(view, view2, (o2.f) y4.h);
        Pair t4 = t(u4, v4, z4, y4);
        f fVar = (f) t4.first;
        f fVar2 = (f) t4.second;
        RectF rectF = this.d;
        if (z4) {
            if (!z5) {
                view2.setTranslationX(-u4);
                view2.setTranslationY(-v4);
            }
            i = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f5 = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float w4 = w(y4, fVar, -u4);
            float w5 = w(y4, fVar2, -v4);
            Rect rect = this.f1274c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f1275e;
            x(view2, rectF2);
            rectF2.offset(w4, w5);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f5 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -u4);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -v4);
        }
        fVar.a(ofFloat2);
        fVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float u5 = u(view, view2, (o2.f) y4.h);
        float v5 = v(view, view2, (o2.f) y4.h);
        Pair t5 = t(u5, v5, z4, y4);
        f fVar3 = (f) t5.first;
        f fVar4 = (f) t5.second;
        Property property = View.TRANSLATION_X;
        if (!z4) {
            u5 = this.f1277g;
        }
        float[] fArr = new float[1];
        fArr[i] = u5;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z4) {
            v5 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = v5;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.a(ofFloat5);
        fVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z4) {
                    if (!z5) {
                        c.f3208a.set(viewGroup, Float.valueOf(f5));
                    }
                    c cVar = c.f3208a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.f3208a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f5;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) y4.f466g).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.w(animatorSet, arrayList);
        animatorSet.addListener(new v2.b(z4, view2, view));
        int size = arrayList2.size();
        for (int i4 = i; i4 < size; i4++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i4));
        }
        return animatorSet;
    }

    public final float u(View view, View view2, o2.f fVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.f1277g, this.h);
        RectF rectF2 = this.f1275e;
        x(view2, rectF2);
        fVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float v(View view, View view2, o2.f fVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.f1277g, this.h);
        RectF rectF2 = this.f1275e;
        x(view2, rectF2);
        fVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void x(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f1276f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract q y(Context context, boolean z4);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1274c = new Rect();
        this.d = new RectF();
        this.f1275e = new RectF();
        this.f1276f = new int[2];
    }
}
