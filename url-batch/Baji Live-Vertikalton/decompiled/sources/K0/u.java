package K0;

import K.T;
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
import com.playwall.bouncefield.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0229d0;
import o0.AbstractC0280a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f548A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f549B;

    /* renamed from: a, reason: collision with root package name */
    public final int f550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f552c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f553e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f554f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f555g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f556j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f557k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f558l;

    /* renamed from: m, reason: collision with root package name */
    public final float f559m;

    /* renamed from: n, reason: collision with root package name */
    public int f560n;

    /* renamed from: o, reason: collision with root package name */
    public int f561o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f562p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f563q;

    /* renamed from: r, reason: collision with root package name */
    public C0229d0 f564r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f565s;

    /* renamed from: t, reason: collision with root package name */
    public int f566t;

    /* renamed from: u, reason: collision with root package name */
    public int f567u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f568v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f569w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f570x;

    /* renamed from: y, reason: collision with root package name */
    public C0229d0 f571y;

    /* renamed from: z, reason: collision with root package name */
    public int f572z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f555g = context;
        this.h = textInputLayout;
        this.f559m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f550a = q1.l.Q(context, R.attr.motionDurationShort4, 217);
        this.f551b = q1.l.Q(context, R.attr.motionDurationMedium4, 167);
        this.f552c = q1.l.Q(context, R.attr.motionDurationShort4, 167);
        this.d = q1.l.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0280a.d);
        LinearInterpolator linearInterpolator = AbstractC0280a.f3332a;
        this.f553e = q1.l.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f554f = q1.l.R(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0229d0 c0229d0, int i) {
        if (this.i == null && this.f557k == null) {
            Context context = this.f555g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f557k = new FrameLayout(context);
            this.i.addView(this.f557k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f557k.setVisibility(0);
            this.f557k.addView(c0229d0);
        } else {
            this.i.addView(c0229d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f556j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f555g;
                boolean S2 = q1.d.S(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f381a;
                int paddingStart = editText.getPaddingStart();
                if (S2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (S2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (S2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f558l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0229d0 c0229d0, int i, int i2, int i3) {
        if (c0229d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0229d0, (Property<C0229d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f552c;
            ofFloat.setDuration(z3 ? this.f551b : i4);
            ofFloat.setInterpolator(z3 ? this.f553e : this.f554f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0229d0, (Property<C0229d0, Float>) View.TRANSLATION_Y, -this.f559m, 0.0f);
            ofFloat2.setDuration(this.f550a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f564r;
        }
        if (i != 2) {
            return null;
        }
        return this.f571y;
    }

    public final void f() {
        this.f562p = null;
        c();
        if (this.f560n == 1) {
            if (!this.f570x || TextUtils.isEmpty(this.f569w)) {
                this.f561o = 0;
            } else {
                this.f561o = 2;
            }
        }
        i(this.f560n, this.f561o, h(this.f564r, ""));
    }

    public final void g(C0229d0 c0229d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f557k) != null) {
            frameLayout.removeView(c0229d0);
        } else {
            linearLayout.removeView(c0229d0);
        }
        int i2 = this.f556j - 1;
        this.f556j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0229d0 c0229d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f381a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f561o == this.f560n && c0229d0 != null && TextUtils.equals(c0229d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f558l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f570x, this.f571y, 2, i, i2);
            d(arrayList, this.f563q, this.f564r, 1, i, i2);
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
            animatorSet.addListener(new s(this, i2, e(i), i, e(i2)));
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
            this.f560n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
