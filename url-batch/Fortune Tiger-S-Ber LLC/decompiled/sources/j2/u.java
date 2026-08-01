package j2;

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
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2363b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2364d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2365e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2366f;
    public final Context g;
    public final TextInputLayout h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f2367i;

    /* renamed from: j, reason: collision with root package name */
    public int f2368j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f2369k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2370l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2371m;

    /* renamed from: n, reason: collision with root package name */
    public int f2372n;

    /* renamed from: o, reason: collision with root package name */
    public int f2373o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2374p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2375q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f2376r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2377s;

    /* renamed from: t, reason: collision with root package name */
    public int f2378t;

    /* renamed from: u, reason: collision with root package name */
    public int f2379u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2380v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2381w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2382x;

    /* renamed from: y, reason: collision with root package name */
    public z0 f2383y;

    /* renamed from: z, reason: collision with root package name */
    public int f2384z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.f2371m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2362a = k3.m.Q(context, R.attr.motionDurationShort4, 217);
        this.f2363b = k3.m.Q(context, R.attr.motionDurationMedium4, 167);
        this.c = k3.m.Q(context, R.attr.motionDurationShort4, 167);
        this.f2364d = k3.m.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, m1.a.f2907d);
        LinearInterpolator linearInterpolator = m1.a.f2905a;
        this.f2365e = k3.m.R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2366f = k3.m.R(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i4) {
        if (this.f2367i == null && this.f2369k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2367i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2367i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2369k = new FrameLayout(context);
            this.f2367i.addView(this.f2369k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 == 0 || i4 == 1) {
            this.f2369k.setVisibility(0);
            this.f2369k.addView(z0Var);
        } else {
            this.f2367i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2367i.setVisibility(0);
        this.f2368j++;
    }

    public final void b() {
        if (this.f2367i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean E = k3.m.E(context);
                LinearLayout linearLayout = this.f2367i;
                int paddingStart = editText.getPaddingStart();
                if (E) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (E) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (E) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2370l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, z0 z0Var, int i4, int i5, int i6) {
        if (z0Var == null || !z3) {
            return;
        }
        if (i4 == i6 || i4 == i5) {
            boolean z4 = i6 == i4;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
            int i7 = this.c;
            ofFloat.setDuration(z4 ? this.f2363b : i7);
            ofFloat.setInterpolator(z4 ? this.f2365e : this.f2366f);
            if (i4 == i6 && i5 != 0) {
                ofFloat.setStartDelay(i7);
            }
            arrayList.add(ofFloat);
            if (i6 != i4 || i5 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.TRANSLATION_Y, -this.f2371m, 0.0f);
            ofFloat2.setDuration(this.f2362a);
            ofFloat2.setInterpolator(this.f2364d);
            ofFloat2.setStartDelay(i7);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i4) {
        if (i4 == 1) {
            return this.f2376r;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f2383y;
    }

    public final void f() {
        this.f2374p = null;
        c();
        if (this.f2372n == 1) {
            if (!this.f2382x || TextUtils.isEmpty(this.f2381w)) {
                this.f2373o = 0;
            } else {
                this.f2373o = 2;
            }
        }
        i(this.f2372n, this.f2373o, h(this.f2376r, ""));
    }

    public final void g(z0 z0Var, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2367i;
        if (linearLayout == null) {
            return;
        }
        if ((i4 == 0 || i4 == 1) && (frameLayout = this.f2369k) != null) {
            frameLayout.removeView(z0Var);
        } else {
            linearLayout.removeView(z0Var);
        }
        int i5 = this.f2368j - 1;
        this.f2368j = i5;
        LinearLayout linearLayout2 = this.f2367i;
        if (i5 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2373o == this.f2372n && z0Var != null && TextUtils.equals(z0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i4, int i5, boolean z3) {
        TextView e4;
        TextView e5;
        u uVar = this;
        if (i4 == i5) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            uVar.f2370l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar.d(arrayList, uVar.f2382x, uVar.f2383y, 2, i4, i5);
            uVar.d(arrayList, uVar.f2375q, uVar.f2376r, 1, i4, i5);
            int size = arrayList.size();
            long j4 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Animator animator = (Animator) arrayList.get(i6);
                j4 = Math.max(j4, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j4);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            t tVar = new t(this, i5, e(i4), i4, uVar.e(i5));
            uVar = this;
            animatorSet.addListener(tVar);
            animatorSet.start();
        } else if (i4 != i5) {
            if (i5 != 0 && (e5 = uVar.e(i5)) != null) {
                e5.setVisibility(0);
                e5.setAlpha(1.0f);
            }
            if (i4 != 0 && (e4 = e(i4)) != null) {
                e4.setVisibility(4);
                if (i4 == 1) {
                    e4.setText((CharSequence) null);
                }
            }
            uVar.f2372n = i5;
        }
        TextInputLayout textInputLayout = uVar.h;
        textInputLayout.t();
        textInputLayout.w(z3, false);
        textInputLayout.z();
    }
}
