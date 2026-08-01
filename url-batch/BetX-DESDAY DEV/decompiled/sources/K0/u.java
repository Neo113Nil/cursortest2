package K0;

import K.X;
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
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0257d0;
import o0.AbstractC0307a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f603A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f604B;

    /* renamed from: a, reason: collision with root package name */
    public final int f605a;

    /* renamed from: b, reason: collision with root package name */
    public final int f606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f607c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f608d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f609e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f610f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f611g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f612j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f613k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f614l;

    /* renamed from: m, reason: collision with root package name */
    public final float f615m;

    /* renamed from: n, reason: collision with root package name */
    public int f616n;

    /* renamed from: o, reason: collision with root package name */
    public int f617o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f618p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f619q;

    /* renamed from: r, reason: collision with root package name */
    public C0257d0 f620r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f621s;

    /* renamed from: t, reason: collision with root package name */
    public int f622t;

    /* renamed from: u, reason: collision with root package name */
    public int f623u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f624v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f625w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f626x;

    /* renamed from: y, reason: collision with root package name */
    public C0257d0 f627y;

    /* renamed from: z, reason: collision with root package name */
    public int f628z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f611g = context;
        this.h = textInputLayout;
        this.f615m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f605a = q1.l.f0(context, R.attr.motionDurationShort4, 217);
        this.f606b = q1.l.f0(context, R.attr.motionDurationMedium4, 167);
        this.f607c = q1.l.f0(context, R.attr.motionDurationShort4, 167);
        this.f608d = q1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0307a.f3719d);
        LinearInterpolator linearInterpolator = AbstractC0307a.f3716a;
        this.f609e = q1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f610f = q1.l.g0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0257d0 c0257d0, int i) {
        if (this.i == null && this.f613k == null) {
            Context context = this.f611g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f613k = new FrameLayout(context);
            this.i.addView(this.f613k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f613k.setVisibility(0);
            this.f613k.addView(c0257d0);
        } else {
            this.i.addView(c0257d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f612j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f611g;
                boolean K2 = q1.d.K(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f419a;
                int paddingStart = editText.getPaddingStart();
                if (K2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (K2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (K2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f614l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0257d0 c0257d0, int i, int i2, int i3) {
        if (c0257d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0257d0, (Property<C0257d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f607c;
            ofFloat.setDuration(z3 ? this.f606b : i4);
            ofFloat.setInterpolator(z3 ? this.f609e : this.f610f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0257d0, (Property<C0257d0, Float>) View.TRANSLATION_Y, -this.f615m, 0.0f);
            ofFloat2.setDuration(this.f605a);
            ofFloat2.setInterpolator(this.f608d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f620r;
        }
        if (i != 2) {
            return null;
        }
        return this.f627y;
    }

    public final void f() {
        this.f618p = null;
        c();
        if (this.f616n == 1) {
            if (!this.f626x || TextUtils.isEmpty(this.f625w)) {
                this.f617o = 0;
            } else {
                this.f617o = 2;
            }
        }
        i(this.f616n, this.f617o, h(this.f620r, ""));
    }

    public final void g(C0257d0 c0257d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f613k) != null) {
            frameLayout.removeView(c0257d0);
        } else {
            linearLayout.removeView(c0257d0);
        }
        int i2 = this.f612j - 1;
        this.f612j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0257d0 c0257d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f419a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f617o == this.f616n && c0257d0 != null && TextUtils.equals(c0257d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f614l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f626x, this.f627y, 2, i, i2);
            d(arrayList, this.f619q, this.f620r, 1, i, i2);
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
            this.f616n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
