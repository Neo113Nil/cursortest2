package N0;

import L.T;
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
import com.winfour.winrandom.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C0208d0;
import r0.AbstractC0292a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f706A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f707B;

    /* renamed from: a, reason: collision with root package name */
    public final int f708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f710c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f711e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f712f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f713g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f714h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f715j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f716k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f717l;

    /* renamed from: m, reason: collision with root package name */
    public final float f718m;

    /* renamed from: n, reason: collision with root package name */
    public int f719n;

    /* renamed from: o, reason: collision with root package name */
    public int f720o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f721p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f722q;

    /* renamed from: r, reason: collision with root package name */
    public C0208d0 f723r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f724s;

    /* renamed from: t, reason: collision with root package name */
    public int f725t;

    /* renamed from: u, reason: collision with root package name */
    public int f726u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f727v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f728w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f729x;

    /* renamed from: y, reason: collision with root package name */
    public C0208d0 f730y;

    /* renamed from: z, reason: collision with root package name */
    public int f731z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f713g = context;
        this.f714h = textInputLayout;
        this.f718m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f708a = A1.m.Z(context, R.attr.motionDurationShort4, 217);
        this.f709b = A1.m.Z(context, R.attr.motionDurationMedium4, 167);
        this.f710c = A1.m.Z(context, R.attr.motionDurationShort4, 167);
        this.d = A1.m.a0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0292a.d);
        LinearInterpolator linearInterpolator = AbstractC0292a.f3566a;
        this.f711e = A1.m.a0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f712f = A1.m.a0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0208d0 c0208d0, int i) {
        if (this.i == null && this.f716k == null) {
            Context context = this.f713g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f714h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f716k = new FrameLayout(context);
            this.i.addView(this.f716k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f716k.setVisibility(0);
            this.f716k.addView(c0208d0);
        } else {
            this.i.addView(c0208d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f715j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f714h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f713g;
                boolean Q2 = A1.d.Q(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f490a;
                int paddingStart = editText.getPaddingStart();
                if (Q2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (Q2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (Q2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f717l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0208d0 c0208d0, int i, int i2, int i3) {
        if (c0208d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0208d0, (Property<C0208d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f710c;
            ofFloat.setDuration(z3 ? this.f709b : i4);
            ofFloat.setInterpolator(z3 ? this.f711e : this.f712f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0208d0, (Property<C0208d0, Float>) View.TRANSLATION_Y, -this.f718m, RecyclerView.A0);
            ofFloat2.setDuration(this.f708a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f723r;
        }
        if (i != 2) {
            return null;
        }
        return this.f730y;
    }

    public final void f() {
        this.f721p = null;
        c();
        if (this.f719n == 1) {
            if (!this.f729x || TextUtils.isEmpty(this.f728w)) {
                this.f720o = 0;
            } else {
                this.f720o = 2;
            }
        }
        i(this.f719n, this.f720o, h(this.f723r, ""));
    }

    public final void g(C0208d0 c0208d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f716k) != null) {
            frameLayout.removeView(c0208d0);
        } else {
            linearLayout.removeView(c0208d0);
        }
        int i2 = this.f715j - 1;
        this.f715j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0208d0 c0208d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f490a;
        TextInputLayout textInputLayout = this.f714h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f720o == this.f719n && c0208d0 != null && TextUtils.equals(c0208d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f717l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f729x, this.f730y, 2, i, i2);
            d(arrayList, this.f722q, this.f723r, 1, i, i2);
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
            this.f719n = i2;
        }
        TextInputLayout textInputLayout = this.f714h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
