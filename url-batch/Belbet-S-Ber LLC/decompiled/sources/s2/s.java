package s2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
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
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3301c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3302e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3303f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3304g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f3305j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f3306k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f3307l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3308m;

    /* renamed from: n, reason: collision with root package name */
    public int f3309n;

    /* renamed from: o, reason: collision with root package name */
    public int f3310o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3311p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3312q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f3313r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3314s;

    /* renamed from: t, reason: collision with root package name */
    public int f3315t;

    /* renamed from: u, reason: collision with root package name */
    public int f3316u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f3317v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3318w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3319x;

    /* renamed from: y, reason: collision with root package name */
    public z0 f3320y;

    /* renamed from: z, reason: collision with root package name */
    public int f3321z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3304g = context;
        this.h = textInputLayout;
        this.f3308m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3299a = b4.l.V(context, R.attr.motionDurationShort4, 217);
        this.f3300b = b4.l.V(context, R.attr.motionDurationMedium4, 167);
        this.f3301c = b4.l.V(context, R.attr.motionDurationShort4, 167);
        this.d = b4.l.W(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, r1.a.d);
        LinearInterpolator linearInterpolator = r1.a.f3205a;
        this.f3302e = b4.l.W(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3303f = b4.l.W(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i) {
        if (this.i == null && this.f3306k == null) {
            Context context = this.f3304g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3306k = new FrameLayout(context);
            this.i.addView(this.f3306k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f3306k.setVisibility(0);
            this.f3306k.addView(z0Var);
        } else {
            this.i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f3305j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3304g;
                boolean K = b4.l.K(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (K) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (K) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (K) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f3307l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, z0 z0Var, int i, int i4, int i5) {
        if (z0Var == null || !z4) {
            return;
        }
        if (i == i5 || i == i4) {
            boolean z5 = i5 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
            int i6 = this.f3301c;
            ofFloat.setDuration(z5 ? this.f3300b : i6);
            ofFloat.setInterpolator(z5 ? this.f3302e : this.f3303f);
            if (i == i5 && i4 != 0) {
                ofFloat.setStartDelay(i6);
            }
            arrayList.add(ofFloat);
            if (i5 != i || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.TRANSLATION_Y, -this.f3308m, 0.0f);
            ofFloat2.setDuration(this.f3299a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i6);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f3313r;
        }
        if (i != 2) {
            return null;
        }
        return this.f3320y;
    }

    public final void f() {
        this.f3311p = null;
        c();
        if (this.f3309n == 1) {
            if (!this.f3319x || TextUtils.isEmpty(this.f3318w)) {
                this.f3310o = 0;
            } else {
                this.f3310o = 2;
            }
        }
        i(this.f3309n, this.f3310o, h(this.f3313r, ""));
    }

    public final void g(z0 z0Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f3306k) != null) {
            frameLayout.removeView(z0Var);
        } else {
            linearLayout.removeView(z0Var);
        }
        int i4 = this.f3305j - 1;
        this.f3305j = i4;
        LinearLayout linearLayout2 = this.i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f3310o == this.f3309n && z0Var != null && TextUtils.equals(z0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i4, boolean z4) {
        TextView e4;
        TextView e5;
        if (i == i4) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3307l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3319x, this.f3320y, 2, i, i4);
            d(arrayList, this.f3312q, this.f3313r, 1, i, i4);
            r1.b.w(animatorSet, arrayList);
            animatorSet.addListener(new r(this, i4, e(i), i, e(i4)));
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (e5 = e(i4)) != null) {
                e5.setVisibility(0);
                e5.setAlpha(1.0f);
            }
            if (i != 0 && (e4 = e(i)) != null) {
                e4.setVisibility(4);
                if (i == 1) {
                    e4.setText((CharSequence) null);
                }
            }
            this.f3309n = i4;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.t();
        textInputLayout.w(z4, false);
        textInputLayout.z();
    }
}
