package o2;

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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2941c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2942e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2943f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2944g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2945h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f2946j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f2947k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2948l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2949m;

    /* renamed from: n, reason: collision with root package name */
    public int f2950n;

    /* renamed from: o, reason: collision with root package name */
    public int f2951o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2952p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2953q;

    /* renamed from: r, reason: collision with root package name */
    public c1 f2954r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2955s;

    /* renamed from: t, reason: collision with root package name */
    public int f2956t;

    /* renamed from: u, reason: collision with root package name */
    public int f2957u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2958v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2959w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2960x;

    /* renamed from: y, reason: collision with root package name */
    public c1 f2961y;

    /* renamed from: z, reason: collision with root package name */
    public int f2962z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2944g = context;
        this.f2945h = textInputLayout;
        this.f2949m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2939a = a.y.R(context, R.attr.motionDurationShort4, 217);
        this.f2940b = a.y.R(context, R.attr.motionDurationMedium4, 167);
        this.f2941c = a.y.R(context, R.attr.motionDurationShort4, 167);
        this.d = a.y.S(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, o1.a.d);
        LinearInterpolator linearInterpolator = o1.a.f2864a;
        this.f2942e = a.y.S(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2943f = a.y.S(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(c1 c1Var, int i) {
        if (this.i == null && this.f2947k == null) {
            Context context = this.f2944g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f2945h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2947k = new FrameLayout(context);
            this.i.addView(this.f2947k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f2947k.setVisibility(0);
            this.f2947k.addView(c1Var);
        } else {
            this.i.addView(c1Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f2946j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f2945h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2944g;
                boolean P = h.a.P(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (P) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (P) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (P) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2948l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, c1 c1Var, int i, int i4, int i5) {
        if (c1Var == null || !z3) {
            return;
        }
        if (i == i5 || i == i4) {
            boolean z4 = i5 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var, (Property<c1, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
            int i6 = this.f2941c;
            ofFloat.setDuration(z4 ? this.f2940b : i6);
            ofFloat.setInterpolator(z4 ? this.f2942e : this.f2943f);
            if (i == i5 && i4 != 0) {
                ofFloat.setStartDelay(i6);
            }
            arrayList.add(ofFloat);
            if (i5 != i || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c1Var, (Property<c1, Float>) View.TRANSLATION_Y, -this.f2949m, 0.0f);
            ofFloat2.setDuration(this.f2939a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i6);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f2954r;
        }
        if (i != 2) {
            return null;
        }
        return this.f2961y;
    }

    public final void f() {
        this.f2952p = null;
        c();
        if (this.f2950n == 1) {
            if (!this.f2960x || TextUtils.isEmpty(this.f2959w)) {
                this.f2951o = 0;
            } else {
                this.f2951o = 2;
            }
        }
        i(this.f2950n, this.f2951o, h(this.f2954r, ""));
    }

    public final void g(c1 c1Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f2947k) != null) {
            frameLayout.removeView(c1Var);
        } else {
            linearLayout.removeView(c1Var);
        }
        int i4 = this.f2946j - 1;
        this.f2946j = i4;
        LinearLayout linearLayout2 = this.i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(c1 c1Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f2945h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2951o == this.f2950n && c1Var != null && TextUtils.equals(c1Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i4, boolean z3) {
        TextView e4;
        TextView e5;
        s sVar = this;
        if (i == i4) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            sVar.f2948l = animatorSet;
            ArrayList arrayList = new ArrayList();
            sVar.d(arrayList, sVar.f2960x, sVar.f2961y, 2, i, i4);
            sVar.d(arrayList, sVar.f2953q, sVar.f2954r, 1, i, i4);
            int size = arrayList.size();
            long j4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Animator animator = (Animator) arrayList.get(i5);
                j4 = Math.max(j4, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j4);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            q qVar = new q(this, i4, e(i), i, sVar.e(i4));
            sVar = this;
            animatorSet.addListener(qVar);
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (e5 = sVar.e(i4)) != null) {
                e5.setVisibility(0);
                e5.setAlpha(1.0f);
            }
            if (i != 0 && (e4 = e(i)) != null) {
                e4.setVisibility(4);
                if (i == 1) {
                    e4.setText((CharSequence) null);
                }
            }
            sVar.f2950n = i4;
        }
        TextInputLayout textInputLayout = sVar.f2945h;
        textInputLayout.t();
        textInputLayout.w(z3, false);
        textInputLayout.z();
    }
}
