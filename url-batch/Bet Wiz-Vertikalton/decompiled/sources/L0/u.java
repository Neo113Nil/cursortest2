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
import com.neonpulse.gridlogic.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0210c0;
import p0.AbstractC0280a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f620A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f621B;

    /* renamed from: a, reason: collision with root package name */
    public final int f622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f624c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f625e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f626f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f627g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f628j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f629k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f630l;

    /* renamed from: m, reason: collision with root package name */
    public final float f631m;

    /* renamed from: n, reason: collision with root package name */
    public int f632n;

    /* renamed from: o, reason: collision with root package name */
    public int f633o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f634p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f635q;

    /* renamed from: r, reason: collision with root package name */
    public C0210c0 f636r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f637s;

    /* renamed from: t, reason: collision with root package name */
    public int f638t;

    /* renamed from: u, reason: collision with root package name */
    public int f639u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f640v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f641w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f642x;

    /* renamed from: y, reason: collision with root package name */
    public C0210c0 f643y;

    /* renamed from: z, reason: collision with root package name */
    public int f644z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f627g = context;
        this.h = textInputLayout;
        this.f631m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f622a = x1.d.Z(context, R.attr.motionDurationShort4, 217);
        this.f623b = x1.d.Z(context, R.attr.motionDurationMedium4, 167);
        this.f624c = x1.d.Z(context, R.attr.motionDurationShort4, 167);
        this.d = x1.d.a0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0280a.d);
        LinearInterpolator linearInterpolator = AbstractC0280a.f3286a;
        this.f625e = x1.d.a0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f626f = x1.d.a0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0210c0 c0210c0, int i) {
        if (this.i == null && this.f629k == null) {
            Context context = this.f627g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f629k = new FrameLayout(context);
            this.i.addView(this.f629k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f629k.setVisibility(0);
            this.f629k.addView(c0210c0);
        } else {
            this.i.addView(c0210c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f628j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f627g;
                boolean P2 = x1.l.P(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f422a;
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
        AnimatorSet animatorSet = this.f630l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0210c0 c0210c0, int i, int i2, int i3) {
        if (c0210c0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0210c0, (Property<C0210c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f624c;
            ofFloat.setDuration(z3 ? this.f623b : i4);
            ofFloat.setInterpolator(z3 ? this.f625e : this.f626f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0210c0, (Property<C0210c0, Float>) View.TRANSLATION_Y, -this.f631m, 0.0f);
            ofFloat2.setDuration(this.f622a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f636r;
        }
        if (i != 2) {
            return null;
        }
        return this.f643y;
    }

    public final void f() {
        this.f634p = null;
        c();
        if (this.f632n == 1) {
            if (!this.f642x || TextUtils.isEmpty(this.f641w)) {
                this.f633o = 0;
            } else {
                this.f633o = 2;
            }
        }
        i(this.f632n, this.f633o, h(this.f636r, ""));
    }

    public final void g(C0210c0 c0210c0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f629k) != null) {
            frameLayout.removeView(c0210c0);
        } else {
            linearLayout.removeView(c0210c0);
        }
        int i2 = this.f628j - 1;
        this.f628j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0210c0 c0210c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f422a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f633o == this.f632n && c0210c0 != null && TextUtils.equals(c0210c0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f630l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f642x, this.f643y, 2, i, i2);
            d(arrayList, this.f635q, this.f636r, 1, i, i2);
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
            this.f632n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
