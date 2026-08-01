package O0;

import M.Q;
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
import com.winfour.neondrop.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0182d0;
import r0.AbstractC0260a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f718A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f719B;

    /* renamed from: a, reason: collision with root package name */
    public final int f720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f722c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f723e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f724f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f725g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f726j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f727k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f728l;

    /* renamed from: m, reason: collision with root package name */
    public final float f729m;

    /* renamed from: n, reason: collision with root package name */
    public int f730n;

    /* renamed from: o, reason: collision with root package name */
    public int f731o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f732p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f733q;

    /* renamed from: r, reason: collision with root package name */
    public C0182d0 f734r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f735s;

    /* renamed from: t, reason: collision with root package name */
    public int f736t;

    /* renamed from: u, reason: collision with root package name */
    public int f737u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f738v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f739w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f740x;

    /* renamed from: y, reason: collision with root package name */
    public C0182d0 f741y;

    /* renamed from: z, reason: collision with root package name */
    public int f742z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f725g = context;
        this.h = textInputLayout;
        this.f729m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f720a = z1.l.m0(context, R.attr.motionDurationShort4, 217);
        this.f721b = z1.l.m0(context, R.attr.motionDurationMedium4, 167);
        this.f722c = z1.l.m0(context, R.attr.motionDurationShort4, 167);
        this.d = z1.l.n0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0260a.d);
        LinearInterpolator linearInterpolator = AbstractC0260a.f3420a;
        this.f723e = z1.l.n0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f724f = z1.l.n0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0182d0 c0182d0, int i) {
        if (this.i == null && this.f727k == null) {
            Context context = this.f725g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f727k = new FrameLayout(context);
            this.i.addView(this.f727k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f727k.setVisibility(0);
            this.f727k.addView(c0182d0);
        } else {
            this.i.addView(c0182d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f726j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f725g;
                boolean G2 = z1.d.G(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = Q.f513a;
                int paddingStart = editText.getPaddingStart();
                if (G2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (G2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (G2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f728l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0182d0 c0182d0, int i, int i2, int i3) {
        if (c0182d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0182d0, (Property<C0182d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f722c;
            ofFloat.setDuration(z3 ? this.f721b : i4);
            ofFloat.setInterpolator(z3 ? this.f723e : this.f724f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0182d0, (Property<C0182d0, Float>) View.TRANSLATION_Y, -this.f729m, 0.0f);
            ofFloat2.setDuration(this.f720a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f734r;
        }
        if (i != 2) {
            return null;
        }
        return this.f741y;
    }

    public final void f() {
        this.f732p = null;
        c();
        if (this.f730n == 1) {
            if (!this.f740x || TextUtils.isEmpty(this.f739w)) {
                this.f731o = 0;
            } else {
                this.f731o = 2;
            }
        }
        i(this.f730n, this.f731o, h(this.f734r, ""));
    }

    public final void g(C0182d0 c0182d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f727k) != null) {
            frameLayout.removeView(c0182d0);
        } else {
            linearLayout.removeView(c0182d0);
        }
        int i2 = this.f726j - 1;
        this.f726j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0182d0 c0182d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f513a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f731o == this.f730n && c0182d0 != null && TextUtils.equals(c0182d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f728l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f740x, this.f741y, 2, i, i2);
            d(arrayList, this.f733q, this.f734r, 1, i, i2);
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
            this.f730n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
