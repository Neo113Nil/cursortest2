package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.awerser.monnit.betplay.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dj {
    public n20 a;
    public cj b;
    public RippleDrawable c;
    public f8 d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public StateListAnimator l;
    public Animator m;
    public bv n;
    public bv o;
    public int q;
    public final FloatingActionButton s;
    public final j1 t;
    public static final si y = o3.c;
    public static final int z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect u = new Rect();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Matrix x = new Matrix();

    public dj(FloatingActionButton floatingActionButton, j1 j1Var) {
        this.s = floatingActionButton;
        this.t = j1Var;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.s.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.q;
        RectF rectF2 = this.w;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.q / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(bv bvVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        bvVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        bvVar.d("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new bj());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        bvVar.d("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new bj());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.x;
        a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new ap(), new aj(this), new Matrix(matrix));
        bvVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        op.G(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.p;
        final Matrix matrix = new Matrix(this.x);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj djVar = dj.this;
                FloatingActionButton floatingActionButton2 = djVar.s;
                floatingActionButton2.setAlpha(o3.b(alpha, f, 0.0f, 0.2f, floatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(o3.a(f5, f6, floatValue));
                floatingActionButton2.setScaleY(o3.a(scaleY, f6, floatValue));
                float f7 = f4;
                float f8 = f3;
                djVar.p = o3.a(f7, f8, floatValue);
                float a = o3.a(f7, f8, floatValue);
                Matrix matrix2 = matrix;
                djVar.a(a, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        op.G(animatorSet, arrayList);
        animatorSet.setDuration(vw.d0(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(vw.e0(floatingActionButton.getContext(), i2, o3.b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(y);
        return animatorSet;
    }

    public final void e(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.s;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f, f3));
            stateListAnimator.addState(E, d(f, f2));
            stateListAnimator.addState(F, d(f, f2));
            stateListAnimator.addState(G, d(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.t.g).p || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            h();
        }
    }

    public final void g(n20 n20Var) {
        this.a = n20Var;
        cj cjVar = this.b;
        if (cjVar != null) {
            cjVar.setShapeAppearanceModel(n20Var);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof y20) {
            ((y20) callback).setShapeAppearanceModel(n20Var);
        }
        f8 f8Var = this.d;
        if (f8Var != null) {
            f8Var.o = n20Var;
            f8Var.invalidateSelf();
        }
    }

    public final void h() {
        j1 j1Var = this.t;
        FloatingActionButton floatingActionButton = (FloatingActionButton) j1Var.g;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) j1Var.g;
        boolean z2 = floatingActionButton.p;
        boolean z3 = this.f;
        Rect rect = this.u;
        FloatingActionButton floatingActionButton3 = this.s;
        if (z2) {
            int max = z3 ? Math.max((this.k - floatingActionButton3.getSizeDimension()) / 2, 0) : 0;
            int max2 = Math.max(max, (int) Math.ceil(this.g ? floatingActionButton3.getElevation() + this.j : 0.0f));
            int max3 = Math.max(max, (int) Math.ceil(r1 * 1.5f));
            rect.set(max2, max3, max2, max3);
        } else {
            if (z3) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i = this.k;
                if (sizeDimension < i) {
                    int sizeDimension2 = (i - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        vw.o(this.e, "Didn't initialize content background");
        if (((FloatingActionButton) j1Var.g).p || (this.f && floatingActionButton3.getSizeDimension() < this.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        floatingActionButton2.q.set(i2, i3, i4, i5);
        int i6 = floatingActionButton2.n;
        floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final void f() {
    }
}
