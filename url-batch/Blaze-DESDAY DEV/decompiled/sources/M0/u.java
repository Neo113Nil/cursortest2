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
import com.winworm.neongrid.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0204c0;
import q0.AbstractC0292a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f648A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f649B;

    /* renamed from: a, reason: collision with root package name */
    public final int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final int f651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f652c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f653e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f654f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f655g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f656j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f657k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f658l;

    /* renamed from: m, reason: collision with root package name */
    public final float f659m;

    /* renamed from: n, reason: collision with root package name */
    public int f660n;

    /* renamed from: o, reason: collision with root package name */
    public int f661o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f662p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f663q;

    /* renamed from: r, reason: collision with root package name */
    public C0204c0 f664r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f665s;

    /* renamed from: t, reason: collision with root package name */
    public int f666t;

    /* renamed from: u, reason: collision with root package name */
    public int f667u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f668v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f669w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f670x;

    /* renamed from: y, reason: collision with root package name */
    public C0204c0 f671y;

    /* renamed from: z, reason: collision with root package name */
    public int f672z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f655g = context;
        this.h = textInputLayout;
        this.f659m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f650a = z1.d.h0(context, R.attr.motionDurationShort4, 217);
        this.f651b = z1.d.h0(context, R.attr.motionDurationMedium4, 167);
        this.f652c = z1.d.h0(context, R.attr.motionDurationShort4, 167);
        this.d = z1.d.i0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0292a.d);
        LinearInterpolator linearInterpolator = AbstractC0292a.f3384a;
        this.f653e = z1.d.i0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f654f = z1.d.i0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0204c0 c0204c0, int i) {
        if (this.i == null && this.f657k == null) {
            Context context = this.f655g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f657k = new FrameLayout(context);
            this.i.addView(this.f657k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f657k.setVisibility(0);
            this.f657k.addView(c0204c0);
        } else {
            this.i.addView(c0204c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f656j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f655g;
                boolean F = z1.l.F(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f440a;
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
        AnimatorSet animatorSet = this.f658l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0204c0 c0204c0, int i, int i2, int i3) {
        if (c0204c0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0204c0, (Property<C0204c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f652c;
            ofFloat.setDuration(z3 ? this.f651b : i4);
            ofFloat.setInterpolator(z3 ? this.f653e : this.f654f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0204c0, (Property<C0204c0, Float>) View.TRANSLATION_Y, -this.f659m, RecyclerView.f1559A0);
            ofFloat2.setDuration(this.f650a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f664r;
        }
        if (i != 2) {
            return null;
        }
        return this.f671y;
    }

    public final void f() {
        this.f662p = null;
        c();
        if (this.f660n == 1) {
            if (!this.f670x || TextUtils.isEmpty(this.f669w)) {
                this.f661o = 0;
            } else {
                this.f661o = 2;
            }
        }
        i(this.f660n, this.f661o, h(this.f664r, ""));
    }

    public final void g(C0204c0 c0204c0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f657k) != null) {
            frameLayout.removeView(c0204c0);
        } else {
            linearLayout.removeView(c0204c0);
        }
        int i2 = this.f656j - 1;
        this.f656j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0204c0 c0204c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f440a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f661o == this.f660n && c0204c0 != null && TextUtils.equals(c0204c0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f658l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f670x, this.f671y, 2, i, i2);
            d(arrayList, this.f663q, this.f664r, 1, i, i2);
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
            this.f660n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
