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
import com.fortuneink.neonpad.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0257e0;
import o0.AbstractC0305a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f602A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f603B;

    /* renamed from: a, reason: collision with root package name */
    public final int f604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f606c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f607d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f608e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f609f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f610g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f611j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f612k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f613l;

    /* renamed from: m, reason: collision with root package name */
    public final float f614m;

    /* renamed from: n, reason: collision with root package name */
    public int f615n;

    /* renamed from: o, reason: collision with root package name */
    public int f616o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f617p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f618q;

    /* renamed from: r, reason: collision with root package name */
    public C0257e0 f619r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f620s;

    /* renamed from: t, reason: collision with root package name */
    public int f621t;

    /* renamed from: u, reason: collision with root package name */
    public int f622u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f623v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f624w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f625x;

    /* renamed from: y, reason: collision with root package name */
    public C0257e0 f626y;

    /* renamed from: z, reason: collision with root package name */
    public int f627z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f610g = context;
        this.h = textInputLayout;
        this.f614m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f604a = q1.l.f0(context, R.attr.motionDurationShort4, 217);
        this.f605b = q1.l.f0(context, R.attr.motionDurationMedium4, 167);
        this.f606c = q1.l.f0(context, R.attr.motionDurationShort4, 167);
        this.f607d = q1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0305a.f3715d);
        LinearInterpolator linearInterpolator = AbstractC0305a.f3712a;
        this.f608e = q1.l.g0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f609f = q1.l.g0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0257e0 c0257e0, int i) {
        if (this.i == null && this.f612k == null) {
            Context context = this.f610g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f612k = new FrameLayout(context);
            this.i.addView(this.f612k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f612k.setVisibility(0);
            this.f612k.addView(c0257e0);
        } else {
            this.i.addView(c0257e0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f611j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f610g;
                boolean K2 = q1.d.K(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f418a;
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
        AnimatorSet animatorSet = this.f613l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0257e0 c0257e0, int i, int i2, int i3) {
        if (c0257e0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0257e0, (Property<C0257e0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f606c;
            ofFloat.setDuration(z3 ? this.f605b : i4);
            ofFloat.setInterpolator(z3 ? this.f608e : this.f609f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0257e0, (Property<C0257e0, Float>) View.TRANSLATION_Y, -this.f614m, 0.0f);
            ofFloat2.setDuration(this.f604a);
            ofFloat2.setInterpolator(this.f607d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f619r;
        }
        if (i != 2) {
            return null;
        }
        return this.f626y;
    }

    public final void f() {
        this.f617p = null;
        c();
        if (this.f615n == 1) {
            if (!this.f625x || TextUtils.isEmpty(this.f624w)) {
                this.f616o = 0;
            } else {
                this.f616o = 2;
            }
        }
        i(this.f615n, this.f616o, h(this.f619r, ""));
    }

    public final void g(C0257e0 c0257e0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f612k) != null) {
            frameLayout.removeView(c0257e0);
        } else {
            linearLayout.removeView(c0257e0);
        }
        int i2 = this.f611j - 1;
        this.f611j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0257e0 c0257e0, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f418a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f616o == this.f615n && c0257e0 != null && TextUtils.equals(c0257e0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f613l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f625x, this.f626y, 2, i, i2);
            d(arrayList, this.f618q, this.f619r, 1, i, i2);
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
            this.f615n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
