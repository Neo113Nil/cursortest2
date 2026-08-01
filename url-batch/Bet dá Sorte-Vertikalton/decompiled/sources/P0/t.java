package P0;

import K.S;
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
import com.glasspulse.glasspulse.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0202b0;
import t0.AbstractC0299a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f655A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f656B;

    /* renamed from: a, reason: collision with root package name */
    public final int f657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f659c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f660e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f661f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f662g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f663j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f664k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f665l;

    /* renamed from: m, reason: collision with root package name */
    public final float f666m;

    /* renamed from: n, reason: collision with root package name */
    public int f667n;

    /* renamed from: o, reason: collision with root package name */
    public int f668o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f669p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f670q;

    /* renamed from: r, reason: collision with root package name */
    public C0202b0 f671r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f672s;

    /* renamed from: t, reason: collision with root package name */
    public int f673t;

    /* renamed from: u, reason: collision with root package name */
    public int f674u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f675v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f676w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f677x;

    /* renamed from: y, reason: collision with root package name */
    public C0202b0 f678y;

    /* renamed from: z, reason: collision with root package name */
    public int f679z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f662g = context;
        this.h = textInputLayout;
        this.f666m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f657a = u1.l.f0(context, R.attr.motionDurationShort4, 217);
        this.f658b = u1.l.f0(context, R.attr.motionDurationMedium4, 167);
        this.f659c = u1.l.f0(context, R.attr.motionDurationShort4, 167);
        this.d = u1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0299a.d);
        LinearInterpolator linearInterpolator = AbstractC0299a.f3822a;
        this.f660e = u1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f661f = u1.l.g0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0202b0 c0202b0, int i) {
        if (this.i == null && this.f664k == null) {
            Context context = this.f662g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f664k = new FrameLayout(context);
            this.i.addView(this.f664k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f664k.setVisibility(0);
            this.f664k.addView(c0202b0);
        } else {
            this.i.addView(c0202b0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f663j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f662g;
                boolean N2 = u1.d.N(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f351a;
                int paddingStart = editText.getPaddingStart();
                if (N2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (N2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (N2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f665l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0202b0 c0202b0, int i, int i2, int i3) {
        if (c0202b0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0202b0, (Property<C0202b0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f659c;
            ofFloat.setDuration(z3 ? this.f658b : i4);
            ofFloat.setInterpolator(z3 ? this.f660e : this.f661f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0202b0, (Property<C0202b0, Float>) View.TRANSLATION_Y, -this.f666m, 0.0f);
            ofFloat2.setDuration(this.f657a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f671r;
        }
        if (i != 2) {
            return null;
        }
        return this.f678y;
    }

    public final void f() {
        this.f669p = null;
        c();
        if (this.f667n == 1) {
            if (!this.f677x || TextUtils.isEmpty(this.f676w)) {
                this.f668o = 0;
            } else {
                this.f668o = 2;
            }
        }
        i(this.f667n, this.f668o, h(this.f671r, ""));
    }

    public final void g(C0202b0 c0202b0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f664k) != null) {
            frameLayout.removeView(c0202b0);
        } else {
            linearLayout.removeView(c0202b0);
        }
        int i2 = this.f663j - 1;
        this.f663j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0202b0 c0202b0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f351a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f668o == this.f667n && c0202b0 != null && TextUtils.equals(c0202b0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f665l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f677x, this.f678y, 2, i, i2);
            d(arrayList, this.f670q, this.f671r, 1, i, i2);
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new r(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e3 = e(i2)) != null) {
                e3.setVisibility(0);
                e3.setAlpha(1.0f);
            }
            if (i != 0 && (e2 = e(i)) != null) {
                e2.setVisibility(4);
                if (i == 1) {
                    e2.setText((CharSequence) null);
                }
            }
            this.f667n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
