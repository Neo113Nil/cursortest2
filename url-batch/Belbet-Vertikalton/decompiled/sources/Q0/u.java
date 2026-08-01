package Q0;

import M.P;
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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0267c0;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1071A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1072B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1075c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1076d;
    public final TimeInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1077f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1078g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1079h;
    public LinearLayout i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1080k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1081l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1082m;

    /* renamed from: n, reason: collision with root package name */
    public int f1083n;

    /* renamed from: o, reason: collision with root package name */
    public int f1084o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1085p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1086q;

    /* renamed from: r, reason: collision with root package name */
    public C0267c0 f1087r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1088s;

    /* renamed from: t, reason: collision with root package name */
    public int f1089t;

    /* renamed from: u, reason: collision with root package name */
    public int f1090u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1091v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1092w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1093x;

    /* renamed from: y, reason: collision with root package name */
    public C0267c0 f1094y;

    /* renamed from: z, reason: collision with root package name */
    public int f1095z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1078g = context;
        this.f1079h = textInputLayout;
        this.f1082m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1073a = H1.l.T(context, R.attr.motionDurationShort4, 217);
        this.f1074b = H1.l.T(context, R.attr.motionDurationMedium4, 167);
        this.f1075c = H1.l.T(context, R.attr.motionDurationShort4, 167);
        this.f1076d = H1.l.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0389a.f4372d);
        LinearInterpolator linearInterpolator = AbstractC0389a.f4369a;
        this.e = H1.l.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1077f = H1.l.U(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0267c0 c0267c0, int i) {
        if (this.i == null && this.f1080k == null) {
            Context context = this.f1078g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f1079h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1080k = new FrameLayout(context);
            this.i.addView(this.f1080k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1080k.setVisibility(0);
            this.f1080k.addView(c0267c0);
        } else {
            this.i.addView(c0267c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f1079h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1078g;
                boolean P2 = H1.d.P(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = P.f711a;
                int paddingStart = editText.getPaddingStart();
                if (P2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (P2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (P2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1081l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0267c0 c0267c0, int i, int i2, int i3) {
        if (c0267c0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0267c0, (Property<C0267c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f1075c;
            ofFloat.setDuration(z3 ? this.f1074b : i4);
            ofFloat.setInterpolator(z3 ? this.e : this.f1077f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0267c0, (Property<C0267c0, Float>) View.TRANSLATION_Y, -this.f1082m, 0.0f);
            ofFloat2.setDuration(this.f1073a);
            ofFloat2.setInterpolator(this.f1076d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1087r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1094y;
    }

    public final void f() {
        this.f1085p = null;
        c();
        if (this.f1083n == 1) {
            if (!this.f1093x || TextUtils.isEmpty(this.f1092w)) {
                this.f1084o = 0;
            } else {
                this.f1084o = 2;
            }
        }
        i(this.f1083n, this.f1084o, h(this.f1087r, ""));
    }

    public final void g(C0267c0 c0267c0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1080k) != null) {
            frameLayout.removeView(c0267c0);
        } else {
            linearLayout.removeView(c0267c0);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0267c0 c0267c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = P.f711a;
        TextInputLayout textInputLayout = this.f1079h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f1084o == this.f1083n && c0267c0 != null && TextUtils.equals(c0267c0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1081l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1093x, this.f1094y, 2, i, i2);
            d(arrayList, this.f1086q, this.f1087r, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new s(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.f1083n = i2;
        }
        TextInputLayout textInputLayout = this.f1079h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
