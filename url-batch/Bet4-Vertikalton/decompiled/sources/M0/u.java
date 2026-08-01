package M0;

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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.playbag.tripgear.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0201c0;
import q0.AbstractC0289a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f631A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f632B;

    /* renamed from: a, reason: collision with root package name */
    public final int f633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f635c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f636e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f637f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f638g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f639j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f640k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f641l;

    /* renamed from: m, reason: collision with root package name */
    public final float f642m;

    /* renamed from: n, reason: collision with root package name */
    public int f643n;

    /* renamed from: o, reason: collision with root package name */
    public int f644o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f645p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f646q;

    /* renamed from: r, reason: collision with root package name */
    public C0201c0 f647r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f648s;

    /* renamed from: t, reason: collision with root package name */
    public int f649t;

    /* renamed from: u, reason: collision with root package name */
    public int f650u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f651v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f652w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f653x;

    /* renamed from: y, reason: collision with root package name */
    public C0201c0 f654y;

    /* renamed from: z, reason: collision with root package name */
    public int f655z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f638g = context;
        this.h = textInputLayout;
        this.f642m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f633a = w1.d.g0(context, R.attr.motionDurationShort4, 217);
        this.f634b = w1.d.g0(context, R.attr.motionDurationMedium4, 167);
        this.f635c = w1.d.g0(context, R.attr.motionDurationShort4, 167);
        this.d = w1.d.h0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0289a.d);
        LinearInterpolator linearInterpolator = AbstractC0289a.f3498a;
        this.f636e = w1.d.h0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f637f = w1.d.h0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0201c0 c0201c0, int i) {
        if (this.i == null && this.f640k == null) {
            Context context = this.f638g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f640k = new FrameLayout(context);
            this.i.addView(this.f640k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f640k.setVisibility(0);
            this.f640k.addView(c0201c0);
        } else {
            this.i.addView(c0201c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f639j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f638g;
                boolean F = w1.l.F(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f423a;
                int paddingStart = editText.getPaddingStart();
                if (F) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (F) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (F) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f641l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0201c0 c0201c0, int i, int i2, int i3) {
        if (c0201c0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0201c0, (Property<C0201c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f635c;
            ofFloat.setDuration(z3 ? this.f634b : i4);
            ofFloat.setInterpolator(z3 ? this.f636e : this.f637f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0201c0, (Property<C0201c0, Float>) View.TRANSLATION_Y, -this.f642m, RecyclerView.f1530C0);
            ofFloat2.setDuration(this.f633a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f647r;
        }
        if (i != 2) {
            return null;
        }
        return this.f654y;
    }

    public final void f() {
        this.f645p = null;
        c();
        if (this.f643n == 1) {
            if (!this.f653x || TextUtils.isEmpty(this.f652w)) {
                this.f644o = 0;
            } else {
                this.f644o = 2;
            }
        }
        i(this.f643n, this.f644o, h(this.f647r, ""));
    }

    public final void g(C0201c0 c0201c0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f640k) != null) {
            frameLayout.removeView(c0201c0);
        } else {
            linearLayout.removeView(c0201c0);
        }
        int i2 = this.f639j - 1;
        this.f639j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0201c0 c0201c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f423a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f644o == this.f643n && c0201c0 != null && TextUtils.equals(c0201c0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f641l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f653x, this.f654y, 2, i, i2);
            d(arrayList, this.f646q, this.f647r, 1, i, i2);
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
            this.f643n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
