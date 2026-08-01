package g2;

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
import b4.l;
import com.gdmhkmf.belbet.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o2.o;
import o2.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public o f1902a;

    /* renamed from: b, reason: collision with root package name */
    public h f1903b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f1904c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f1905e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1906f;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1908j;

    /* renamed from: k, reason: collision with root package name */
    public int f1909k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f1910l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f1911m;

    /* renamed from: n, reason: collision with root package name */
    public r1.e f1912n;

    /* renamed from: o, reason: collision with root package name */
    public r1.e f1913o;

    /* renamed from: q, reason: collision with root package name */
    public int f1915q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f1917s;

    /* renamed from: t, reason: collision with root package name */
    public final a0.a f1918t;

    /* renamed from: y, reason: collision with root package name */
    public static final a1.a f1900y = r1.a.f3207c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f1901z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f1907g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f1914p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f1916r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1919u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f1920v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f1921w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f1922x = new Matrix();

    public i(FloatingActionButton floatingActionButton, a0.a aVar) {
        this.f1917s = floatingActionButton;
        this.f1918t = aVar;
    }

    public final void a(float f5, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1917s.getDrawable();
        if (drawable == null || this.f1915q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f1920v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f6 = this.f1915q;
        RectF rectF2 = this.f1921w;
        rectF2.set(0.0f, 0.0f, f6, f6);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f7 = this.f1915q / 2.0f;
        matrix.postScale(f5, f5, f7, f7);
    }

    public final AnimatorSet b(r1.e eVar, float f5, float f6, float f7) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.f1917s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f6);
        eVar.d("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new g());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f6);
        eVar.d("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new g());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f1922x;
        a(f7, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new r1.d(), new f(this), new Matrix(matrix));
        eVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        r1.b.w(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f5, final float f6, final float f7, int i, int i4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f1917s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f8 = this.f1914p;
        final Matrix matrix = new Matrix(this.f1922x);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g2.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i iVar = i.this;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = iVar.f1917s;
                floatingActionButton2.setAlpha(r1.a.b(alpha, f5, 0.0f, 0.2f, floatValue));
                float f9 = scaleX;
                float f10 = f6;
                floatingActionButton2.setScaleX(r1.a.a(f9, f10, floatValue));
                floatingActionButton2.setScaleY(r1.a.a(scaleY, f10, floatValue));
                float f11 = f8;
                float f12 = f7;
                iVar.f1914p = r1.a.a(f11, f12, floatValue);
                float a5 = r1.a.a(f11, f12, floatValue);
                Matrix matrix2 = matrix;
                iVar.a(a5, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        r1.b.w(animatorSet, arrayList);
        animatorSet.setDuration(l.V(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(l.W(floatingActionButton.getContext(), i4, r1.a.f3206b));
        return animatorSet;
    }

    public final AnimatorSet d(float f5, float f6) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.f1917s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f6).setDuration(100L));
        animatorSet.setInterpolator(f1900y);
        return animatorSet;
    }

    public final void e(float f5, float f6, float f7) {
        FloatingActionButton floatingActionButton = this.f1917s;
        if (floatingActionButton.getStateListAnimator() == this.f1910l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f5, f7));
            stateListAnimator.addState(E, d(f5, f6));
            stateListAnimator.addState(F, d(f5, f6));
            stateListAnimator.addState(G, d(f5, f6));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f5).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f1900y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.f1910l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f1918t.f79g).f1145p || (this.f1906f && floatingActionButton.getSizeDimension() < this.f1909k)) {
            h();
        }
    }

    public final void g(o oVar) {
        this.f1902a = oVar;
        h hVar = this.f1903b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(oVar);
        }
        Drawable.Callback callback = this.f1904c;
        if (callback instanceof z) {
            ((z) callback).setShapeAppearanceModel(oVar);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.f1886o = oVar;
            bVar.invalidateSelf();
        }
    }

    public final void h() {
        a0.a aVar = this.f1918t;
        FloatingActionButton floatingActionButton = (FloatingActionButton) aVar.f79g;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) aVar.f79g;
        boolean z4 = floatingActionButton.f1145p;
        Rect rect = this.f1919u;
        FloatingActionButton floatingActionButton3 = this.f1917s;
        if (z4) {
            int max = this.f1906f ? Math.max((this.f1909k - floatingActionButton3.getSizeDimension()) / 2, 0) : 0;
            int max2 = Math.max(max, (int) Math.ceil(this.f1907g ? floatingActionButton3.getElevation() + this.f1908j : 0.0f));
            int max3 = Math.max(max, (int) Math.ceil(r1 * 1.5f));
            rect.set(max2, max3, max2, max3);
        } else {
            if (this.f1906f) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i = this.f1909k;
                if (sizeDimension < i) {
                    int sizeDimension2 = (i - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        l.h(this.f1905e, "Didn't initialize content background");
        if (((FloatingActionButton) aVar.f79g).f1145p || (this.f1906f && floatingActionButton3.getSizeDimension() < this.f1909k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1905e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.f1905e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        floatingActionButton2.f1146q.set(i4, i5, i6, i7);
        int i8 = floatingActionButton2.f1143n;
        floatingActionButton2.setPadding(i4 + i8, i5 + i8, i6 + i8, i7 + i8);
    }

    public final void f() {
    }
}
