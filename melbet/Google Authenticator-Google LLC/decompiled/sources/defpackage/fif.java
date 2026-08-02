package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fif {
    static final TimeInterpolator a = fes.c;
    public static final int b = R.attr.motionDurationLong2;
    public static final int c = R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = R.attr.motionDurationMedium1;
    public static final int e = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public final FloatingActionButton B;
    final kee C;
    private StateListAnimator D;
    public fog l;
    public fob m;
    public Drawable n;
    public fhu o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public few w;
    public few x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();

    public fif(FloatingActionButton floatingActionButton, kee keeVar) {
        this.B = floatingActionButton;
        this.C = keeVar;
    }

    private final Animator m(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.B;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final int a() {
        if (this.q) {
            return Math.max((this.u - this.B.e()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet b(few fewVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.B;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        fewVar.b("opacity").b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        fewVar.b("scale").b(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        fewVar.b("scale").b(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.H;
        d(f4, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new feu(), new fid(this), new Matrix(matrix));
        fewVar.b("iconScale").b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        fhq.h(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f2, final float f3, final float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.B;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f5 = this.y;
        final Matrix matrix = new Matrix(this.H);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fia
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float a2 = fes.a(alpha, f2, 0.0f, 0.2f, floatValue);
                fif fifVar = fif.this;
                FloatingActionButton floatingActionButton2 = fifVar.B;
                floatingActionButton2.setAlpha(a2);
                float f6 = f3;
                float f7 = scaleX;
                floatingActionButton2.setScaleX(f7 + ((f6 - f7) * floatValue));
                float f8 = scaleY;
                floatingActionButton2.setScaleY(f8 + ((f6 - f8) * floatValue));
                float f9 = f4;
                float f10 = f5;
                float f11 = f10 + (floatValue * (f9 - f10));
                fifVar.y = f11;
                Matrix matrix2 = matrix;
                fifVar.d(f11, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        fhq.h(animatorSet, arrayList);
        animatorSet.setDuration(fny.i(floatingActionButton.getContext(), i2, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(fny.p(floatingActionButton.getContext(), i3, fes.b));
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        if (this.B.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.F;
        RectF rectF2 = this.G;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public final void e(float f2, float f3, float f4) {
        FloatingActionButton floatingActionButton = this.B;
        if (floatingActionButton.getStateListAnimator() == this.D) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, m(f2, f4));
            stateListAnimator.addState(g, m(f2, f3));
            stateListAnimator.addState(h, m(f2, f3));
            stateListAnimator.addState(i, m(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, m(0.0f, 0.0f));
            this.D = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (k()) {
            i();
        }
    }

    public final void f(float f2) {
        this.y = f2;
        Matrix matrix = this.H;
        d(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void g(fog fogVar) {
        this.l = fogVar;
        fob fobVar = this.m;
        if (fobVar != null) {
            fobVar.bz(fogVar);
        }
        fhu fhuVar = this.o;
        if (fhuVar != null) {
            fhuVar.h = fogVar;
            fhuVar.invalidateSelf();
        }
    }

    public final void h() {
        f(this.y);
    }

    public final void i() {
        Rect rect = this.E;
        kee keeVar = this.C;
        if (keeVar.l()) {
            int a2 = a();
            int max = Math.max(a2, (int) Math.ceil(this.B.getElevation() + this.t));
            int max2 = Math.max(a2, (int) Math.ceil(r3 * 1.5f));
            rect.set(max, max2, max, max2);
        } else if (j()) {
            int e2 = (this.u - this.B.e()) / 2;
            rect.set(e2, e2, e2, e2);
        } else {
            rect.set(0, 0, 0, 0);
        }
        tw.G(this.p, "Didn't initialize content background");
        if (k()) {
            keeVar.k(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            keeVar.k(this.p);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) keeVar.a;
        floatingActionButton.f.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.d;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    final boolean j() {
        return this.q && this.B.e() < this.u;
    }

    final boolean k() {
        return this.C.l() || j();
    }

    public final boolean l() {
        FloatingActionButton floatingActionButton = this.B;
        return floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
    }
}
