package z5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import l.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f9243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9245c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f9246d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f9247e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f9248f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f9249g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f9250h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f9251j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f9252k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f9253l;

    /* renamed from: m, reason: collision with root package name */
    public final float f9254m;

    /* renamed from: n, reason: collision with root package name */
    public int f9255n;

    /* renamed from: o, reason: collision with root package name */
    public int f9256o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f9257p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9258q;

    /* renamed from: r, reason: collision with root package name */
    public j0 f9259r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f9260s;

    /* renamed from: t, reason: collision with root package name */
    public int f9261t;

    /* renamed from: u, reason: collision with root package name */
    public int f9262u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f9263v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f9264w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9265x;

    /* renamed from: y, reason: collision with root package name */
    public j0 f9266y;

    /* renamed from: z, reason: collision with root package name */
    public int f9267z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f9249g = context;
        this.f9250h = textInputLayout;
        this.f9254m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f9243a = r2.r.Q(context, R.attr.motionDurationShort4, 217);
        this.f9244b = r2.r.Q(context, R.attr.motionDurationMedium4, 167);
        this.f9245c = r2.r.Q(context, R.attr.motionDurationShort4, 167);
        this.f9246d = r2.r.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, g5.a.f3034d);
        LinearInterpolator linearInterpolator = g5.a.f3031a;
        this.f9247e = r2.r.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f9248f = r2.r.R(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(j0 j0Var, int i) {
        if (this.i == null && this.f9252k == null) {
            Context context = this.f9249g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f9250h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f9252k = new FrameLayout(context);
            this.i.addView(this.f9252k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f9252k.setVisibility(0);
            this.f9252k.addView(j0Var);
        } else {
            this.i.addView(j0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f9251j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f9250h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f9249g;
                boolean U = r2.o.U(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (U) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (U) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (U) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f9253l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, j0 j0Var, int i, int i8, int i9) {
        if (j0Var == null || !z3) {
            return;
        }
        if (i == i9 || i == i8) {
            boolean z7 = i9 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j0Var, (Property<j0, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
            int i10 = this.f9245c;
            ofFloat.setDuration(z7 ? this.f9244b : i10);
            ofFloat.setInterpolator(z7 ? this.f9247e : this.f9248f);
            if (i == i9 && i8 != 0) {
                ofFloat.setStartDelay(i10);
            }
            arrayList.add(ofFloat);
            if (i9 != i || i8 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j0Var, (Property<j0, Float>) View.TRANSLATION_Y, -this.f9254m, 0.0f);
            ofFloat2.setDuration(this.f9243a);
            ofFloat2.setInterpolator(this.f9246d);
            ofFloat2.setStartDelay(i10);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f9259r;
        }
        if (i != 2) {
            return null;
        }
        return this.f9266y;
    }

    public final void f() {
        this.f9257p = null;
        c();
        if (this.f9255n == 1) {
            if (!this.f9265x || TextUtils.isEmpty(this.f9264w)) {
                this.f9256o = 0;
            } else {
                this.f9256o = 2;
            }
        }
        i(this.f9255n, this.f9256o, h(this.f9259r, ""));
    }

    public final void g(j0 j0Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f9252k) != null) {
            frameLayout.removeView(j0Var);
        } else {
            linearLayout.removeView(j0Var);
        }
        int i8 = this.f9251j - 1;
        this.f9251j = i8;
        LinearLayout linearLayout2 = this.i;
        if (i8 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(j0 j0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f9250h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f9256o == this.f9255n && j0Var != null && TextUtils.equals(j0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i8, boolean z3) {
        TextView e8;
        TextView e9;
        r rVar = this;
        if (i == i8) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            rVar.f9253l = animatorSet;
            ArrayList arrayList = new ArrayList();
            rVar.d(arrayList, rVar.f9265x, rVar.f9266y, 2, i, i8);
            rVar.d(arrayList, rVar.f9258q, rVar.f9259r, 1, i, i8);
            int size = arrayList.size();
            long j7 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Animator animator = (Animator) arrayList.get(i9);
                j7 = Math.max(j7, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j7);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            w4.d dVar = new w4.d(this, i8, e(i), i, rVar.e(i8));
            rVar = this;
            animatorSet.addListener(dVar);
            animatorSet.start();
        } else if (i != i8) {
            if (i8 != 0 && (e9 = rVar.e(i8)) != null) {
                e9.setVisibility(0);
                e9.setAlpha(1.0f);
            }
            if (i != 0 && (e8 = e(i)) != null) {
                e8.setVisibility(4);
                if (i == 1) {
                    e8.setText((CharSequence) null);
                }
            }
            rVar.f9255n = i8;
        }
        TextInputLayout textInputLayout = rVar.f9250h;
        textInputLayout.t();
        textInputLayout.w(z3, false);
        textInputLayout.z();
    }
}
