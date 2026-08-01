package L0;

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
import com.google.android.material.textfield.TextInputLayout;
import com.visualfortune.eyerest.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0210d0;
import p0.AbstractC0278a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f556A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f557B;

    /* renamed from: a, reason: collision with root package name */
    public final int f558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f560c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f561e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f562f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f563g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f564j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f565k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f566l;

    /* renamed from: m, reason: collision with root package name */
    public final float f567m;

    /* renamed from: n, reason: collision with root package name */
    public int f568n;

    /* renamed from: o, reason: collision with root package name */
    public int f569o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f570p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f571q;

    /* renamed from: r, reason: collision with root package name */
    public C0210d0 f572r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f573s;

    /* renamed from: t, reason: collision with root package name */
    public int f574t;

    /* renamed from: u, reason: collision with root package name */
    public int f575u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f576v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f577w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f578x;

    /* renamed from: y, reason: collision with root package name */
    public C0210d0 f579y;

    /* renamed from: z, reason: collision with root package name */
    public int f580z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f563g = context;
        this.h = textInputLayout;
        this.f567m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f558a = s1.l.U(context, R.attr.motionDurationShort4, 217);
        this.f559b = s1.l.U(context, R.attr.motionDurationMedium4, 167);
        this.f560c = s1.l.U(context, R.attr.motionDurationShort4, 167);
        this.d = s1.l.V(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0278a.d);
        LinearInterpolator linearInterpolator = AbstractC0278a.f3455a;
        this.f561e = s1.l.V(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f562f = s1.l.V(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0210d0 c0210d0, int i) {
        if (this.i == null && this.f565k == null) {
            Context context = this.f563g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f565k = new FrameLayout(context);
            this.i.addView(this.f565k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f565k.setVisibility(0);
            this.f565k.addView(c0210d0);
        } else {
            this.i.addView(c0210d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f564j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f563g;
                boolean O2 = s1.d.O(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f362a;
                int paddingStart = editText.getPaddingStart();
                if (O2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (O2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (O2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f566l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0210d0 c0210d0, int i, int i2, int i3) {
        if (c0210d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0210d0, (Property<C0210d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f560c;
            ofFloat.setDuration(z3 ? this.f559b : i4);
            ofFloat.setInterpolator(z3 ? this.f561e : this.f562f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0210d0, (Property<C0210d0, Float>) View.TRANSLATION_Y, -this.f567m, 0.0f);
            ofFloat2.setDuration(this.f558a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f572r;
        }
        if (i != 2) {
            return null;
        }
        return this.f579y;
    }

    public final void f() {
        this.f570p = null;
        c();
        if (this.f568n == 1) {
            if (!this.f578x || TextUtils.isEmpty(this.f577w)) {
                this.f569o = 0;
            } else {
                this.f569o = 2;
            }
        }
        i(this.f568n, this.f569o, h(this.f572r, ""));
    }

    public final void g(C0210d0 c0210d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f565k) != null) {
            frameLayout.removeView(c0210d0);
        } else {
            linearLayout.removeView(c0210d0);
        }
        int i2 = this.f564j - 1;
        this.f564j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0210d0 c0210d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f362a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f569o == this.f568n && c0210d0 != null && TextUtils.equals(c0210d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f566l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f578x, this.f579y, 2, i, i2);
            d(arrayList, this.f571q, this.f572r, 1, i, i2);
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
            this.f568n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
