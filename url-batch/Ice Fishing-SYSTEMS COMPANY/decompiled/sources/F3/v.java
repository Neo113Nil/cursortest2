package F3;

import O.X;
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
import com.icefishing.icefishingliveapp.C5284R;
import j3.AbstractC4596a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.Z;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1094A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1095B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1096a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1097b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1098c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1099d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1100e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1101f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1102g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1103h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f1104j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1105k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1106l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1107m;

    /* renamed from: n, reason: collision with root package name */
    public int f1108n;

    /* renamed from: o, reason: collision with root package name */
    public int f1109o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1110p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1111q;

    /* renamed from: r, reason: collision with root package name */
    public Z f1112r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1113s;

    /* renamed from: t, reason: collision with root package name */
    public int f1114t;

    /* renamed from: u, reason: collision with root package name */
    public int f1115u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1116v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1117w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1118x;

    /* renamed from: y, reason: collision with root package name */
    public Z f1119y;

    /* renamed from: z, reason: collision with root package name */
    public int f1120z;

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1102g = context;
        this.f1103h = textInputLayout;
        this.f1107m = context.getResources().getDimensionPixelSize(C5284R.dimen.design_textinput_caption_translate_y);
        this.f1096a = K3.b.y(context, C5284R.attr.motionDurationShort4, 217);
        this.f1097b = K3.b.y(context, C5284R.attr.motionDurationMedium4, 167);
        this.f1098c = K3.b.y(context, C5284R.attr.motionDurationShort4, 167);
        this.f1099d = K3.b.z(context, C5284R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC4596a.f38544d);
        LinearInterpolator linearInterpolator = AbstractC4596a.f38541a;
        this.f1100e = K3.b.z(context, C5284R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1101f = K3.b.z(context, C5284R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(Z z8, int i) {
        if (this.i == null && this.f1105k == null) {
            Context context = this.f1102g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f1103h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1105k = new FrameLayout(context);
            this.i.addView(this.f1105k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1105k.setVisibility(0);
            this.f1105k.addView(z8);
        } else {
            this.i.addView(z8, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f1104j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f1103h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1102g;
                boolean u7 = com.bumptech.glide.d.u(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f2240a;
                int paddingStart = editText.getPaddingStart();
                if (u7) {
                    paddingStart = context.getResources().getDimensionPixelSize(C5284R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C5284R.dimen.material_helper_text_default_padding_top);
                if (u7) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C5284R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (u7) {
                    paddingEnd = context.getResources().getDimensionPixelSize(C5284R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1106l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z8, Z z9, int i, int i4, int i9) {
        if (z9 == null || !z8) {
            return;
        }
        if (i == i9 || i == i4) {
            boolean z10 = i9 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z9, (Property<Z, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i10 = this.f1098c;
            ofFloat.setDuration(z10 ? this.f1097b : i10);
            ofFloat.setInterpolator(z10 ? this.f1100e : this.f1101f);
            if (i == i9 && i4 != 0) {
                ofFloat.setStartDelay(i10);
            }
            arrayList.add(ofFloat);
            if (i9 != i || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z9, (Property<Z, Float>) View.TRANSLATION_Y, -this.f1107m, 0.0f);
            ofFloat2.setDuration(this.f1096a);
            ofFloat2.setInterpolator(this.f1099d);
            ofFloat2.setStartDelay(i10);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1112r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1119y;
    }

    public final void f() {
        this.f1110p = null;
        c();
        if (this.f1108n == 1) {
            if (!this.f1118x || TextUtils.isEmpty(this.f1117w)) {
                this.f1109o = 0;
            } else {
                this.f1109o = 2;
            }
        }
        i(this.f1108n, this.f1109o, h(this.f1112r, ""));
    }

    public final void g(Z z8, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1105k) != null) {
            frameLayout.removeView(z8);
        } else {
            linearLayout.removeView(z8);
        }
        int i4 = this.f1104j - 1;
        this.f1104j = i4;
        LinearLayout linearLayout2 = this.i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(Z z8, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2240a;
        TextInputLayout textInputLayout = this.f1103h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1109o == this.f1108n && z8 != null && TextUtils.equals(z8.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i4, boolean z8) {
        TextView e6;
        TextView e9;
        v vVar = this;
        if (i == i4) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            vVar.f1106l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar.d(arrayList, vVar.f1118x, vVar.f1119y, 2, i, i4);
            vVar.d(arrayList, vVar.f1111q, vVar.f1112r, 1, i, i4);
            int size = arrayList.size();
            long j9 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Animator animator = (Animator) arrayList.get(i9);
                j9 = Math.max(j9, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j9);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            t tVar = new t(this, i4, e(i), i, vVar.e(i4));
            vVar = this;
            animatorSet.addListener(tVar);
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (e9 = vVar.e(i4)) != null) {
                e9.setVisibility(0);
                e9.setAlpha(1.0f);
            }
            if (i != 0 && (e6 = e(i)) != null) {
                e6.setVisibility(4);
                if (i == 1) {
                    e6.setText((CharSequence) null);
                }
            }
            vVar.f1108n = i4;
        }
        TextInputLayout textInputLayout = vVar.f1103h;
        textInputLayout.r();
        textInputLayout.u(z8, false);
        textInputLayout.x();
    }
}
