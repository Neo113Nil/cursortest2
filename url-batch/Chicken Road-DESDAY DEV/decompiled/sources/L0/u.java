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
import com.playgen.securelock.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0213d0;
import p0.AbstractC0281a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f568A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f569B;

    /* renamed from: a, reason: collision with root package name */
    public final int f570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f572c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f573e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f574f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f575g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f576j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f577k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f578l;

    /* renamed from: m, reason: collision with root package name */
    public final float f579m;

    /* renamed from: n, reason: collision with root package name */
    public int f580n;

    /* renamed from: o, reason: collision with root package name */
    public int f581o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f582p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f583q;

    /* renamed from: r, reason: collision with root package name */
    public C0213d0 f584r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f585s;

    /* renamed from: t, reason: collision with root package name */
    public int f586t;

    /* renamed from: u, reason: collision with root package name */
    public int f587u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f588v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f589w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f590x;

    /* renamed from: y, reason: collision with root package name */
    public C0213d0 f591y;

    /* renamed from: z, reason: collision with root package name */
    public int f592z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f575g = context;
        this.h = textInputLayout;
        this.f579m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f570a = u1.l.U(context, R.attr.motionDurationShort4, 217);
        this.f571b = u1.l.U(context, R.attr.motionDurationMedium4, 167);
        this.f572c = u1.l.U(context, R.attr.motionDurationShort4, 167);
        this.d = u1.l.V(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0281a.d);
        LinearInterpolator linearInterpolator = AbstractC0281a.f3380a;
        this.f573e = u1.l.V(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f574f = u1.l.V(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0213d0 c0213d0, int i) {
        if (this.i == null && this.f577k == null) {
            Context context = this.f575g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f577k = new FrameLayout(context);
            this.i.addView(this.f577k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f577k.setVisibility(0);
            this.f577k.addView(c0213d0);
        } else {
            this.i.addView(c0213d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f576j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f575g;
                boolean V2 = u1.d.V(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f369a;
                int paddingStart = editText.getPaddingStart();
                if (V2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (V2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (V2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f578l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0213d0 c0213d0, int i, int i2, int i3) {
        if (c0213d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0213d0, (Property<C0213d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f572c;
            ofFloat.setDuration(z3 ? this.f571b : i4);
            ofFloat.setInterpolator(z3 ? this.f573e : this.f574f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0213d0, (Property<C0213d0, Float>) View.TRANSLATION_Y, -this.f579m, 0.0f);
            ofFloat2.setDuration(this.f570a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f584r;
        }
        if (i != 2) {
            return null;
        }
        return this.f591y;
    }

    public final void f() {
        this.f582p = null;
        c();
        if (this.f580n == 1) {
            if (!this.f590x || TextUtils.isEmpty(this.f589w)) {
                this.f581o = 0;
            } else {
                this.f581o = 2;
            }
        }
        i(this.f580n, this.f581o, h(this.f584r, ""));
    }

    public final void g(C0213d0 c0213d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f577k) != null) {
            frameLayout.removeView(c0213d0);
        } else {
            linearLayout.removeView(c0213d0);
        }
        int i2 = this.f576j - 1;
        this.f576j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0213d0 c0213d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f369a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f581o == this.f580n && c0213d0 != null && TextUtils.equals(c0213d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f578l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f590x, this.f591y, 2, i, i2);
            d(arrayList, this.f583q, this.f584r, 1, i, i2);
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
            this.f580n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
