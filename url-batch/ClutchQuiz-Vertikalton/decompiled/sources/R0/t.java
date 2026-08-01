package R0;

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
import com.clutchquizarena.app.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0204b0;
import v0.AbstractC0372a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f717A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f718B;

    /* renamed from: a, reason: collision with root package name */
    public final int f719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f721c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f722e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f723f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f724g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f725j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f726k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f727l;

    /* renamed from: m, reason: collision with root package name */
    public final float f728m;

    /* renamed from: n, reason: collision with root package name */
    public int f729n;

    /* renamed from: o, reason: collision with root package name */
    public int f730o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f731p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f732q;

    /* renamed from: r, reason: collision with root package name */
    public C0204b0 f733r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f734s;

    /* renamed from: t, reason: collision with root package name */
    public int f735t;

    /* renamed from: u, reason: collision with root package name */
    public int f736u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f737v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f738w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f739x;

    /* renamed from: y, reason: collision with root package name */
    public C0204b0 f740y;

    /* renamed from: z, reason: collision with root package name */
    public int f741z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f724g = context;
        this.h = textInputLayout;
        this.f728m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f719a = A.c.w0(context, R.attr.motionDurationShort4, 217);
        this.f720b = A.c.w0(context, R.attr.motionDurationMedium4, 167);
        this.f721c = A.c.w0(context, R.attr.motionDurationShort4, 167);
        this.d = A.c.x0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0372a.d);
        LinearInterpolator linearInterpolator = AbstractC0372a.f3981a;
        this.f722e = A.c.x0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f723f = A.c.x0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0204b0 c0204b0, int i) {
        if (this.i == null && this.f726k == null) {
            Context context = this.f724g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f726k = new FrameLayout(context);
            this.i.addView(this.f726k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f726k.setVisibility(0);
            this.f726k.addView(c0204b0);
        } else {
            this.i.addView(c0204b0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f725j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f724g;
                boolean d02 = A.c.d0(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f365a;
                int paddingStart = editText.getPaddingStart();
                if (d02) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (d02) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (d02) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f727l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0204b0 c0204b0, int i, int i2, int i3) {
        if (c0204b0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0204b0, (Property<C0204b0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f721c;
            ofFloat.setDuration(z3 ? this.f720b : i4);
            ofFloat.setInterpolator(z3 ? this.f722e : this.f723f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0204b0, (Property<C0204b0, Float>) View.TRANSLATION_Y, -this.f728m, 0.0f);
            ofFloat2.setDuration(this.f719a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f733r;
        }
        if (i != 2) {
            return null;
        }
        return this.f740y;
    }

    public final void f() {
        this.f731p = null;
        c();
        if (this.f729n == 1) {
            if (!this.f739x || TextUtils.isEmpty(this.f738w)) {
                this.f730o = 0;
            } else {
                this.f730o = 2;
            }
        }
        i(this.f729n, this.f730o, h(this.f733r, ""));
    }

    public final void g(C0204b0 c0204b0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f726k) != null) {
            frameLayout.removeView(c0204b0);
        } else {
            linearLayout.removeView(c0204b0);
        }
        int i2 = this.f725j - 1;
        this.f725j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0204b0 c0204b0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f365a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f730o == this.f729n && c0204b0 != null && TextUtils.equals(c0204b0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f727l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f739x, this.f740y, 2, i, i2);
            d(arrayList, this.f732q, this.f733r, 1, i, i2);
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
            this.f729n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
