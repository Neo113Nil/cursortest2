package U0;

import K.Q;
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
import com.fortunequest.neontrack.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0223a0;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1197A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1198B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1201c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1204g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f1205j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1206k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1207l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1208m;

    /* renamed from: n, reason: collision with root package name */
    public int f1209n;

    /* renamed from: o, reason: collision with root package name */
    public int f1210o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1211p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1212q;

    /* renamed from: r, reason: collision with root package name */
    public C0223a0 f1213r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1214s;

    /* renamed from: t, reason: collision with root package name */
    public int f1215t;

    /* renamed from: u, reason: collision with root package name */
    public int f1216u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1217v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1218w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1219x;

    /* renamed from: y, reason: collision with root package name */
    public C0223a0 f1220y;

    /* renamed from: z, reason: collision with root package name */
    public int f1221z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1204g = context;
        this.h = textInputLayout;
        this.f1208m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1199a = H1.l.b0(context, R.attr.motionDurationShort4, 217);
        this.f1200b = H1.l.b0(context, R.attr.motionDurationMedium4, 167);
        this.f1201c = H1.l.b0(context, R.attr.motionDurationShort4, 167);
        this.d = H1.l.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0395a.d);
        LinearInterpolator linearInterpolator = AbstractC0395a.f4570a;
        this.f1202e = H1.l.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1203f = H1.l.c0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0223a0 c0223a0, int i) {
        if (this.i == null && this.f1206k == null) {
            Context context = this.f1204g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1206k = new FrameLayout(context);
            this.i.addView(this.f1206k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1206k.setVisibility(0);
            this.f1206k.addView(c0223a0);
        } else {
            this.i.addView(c0223a0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f1205j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1204g;
                boolean O2 = H1.l.O(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = Q.f578a;
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
        AnimatorSet animatorSet = this.f1207l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0223a0 c0223a0, int i, int i2, int i3) {
        if (c0223a0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0223a0, (Property<C0223a0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f1201c;
            ofFloat.setDuration(z3 ? this.f1200b : i4);
            ofFloat.setInterpolator(z3 ? this.f1202e : this.f1203f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0223a0, (Property<C0223a0, Float>) View.TRANSLATION_Y, -this.f1208m, RecyclerView.f1937A0);
            ofFloat2.setDuration(this.f1199a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1213r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1220y;
    }

    public final void f() {
        this.f1211p = null;
        c();
        if (this.f1209n == 1) {
            if (!this.f1219x || TextUtils.isEmpty(this.f1218w)) {
                this.f1210o = 0;
            } else {
                this.f1210o = 2;
            }
        }
        i(this.f1209n, this.f1210o, h(this.f1213r, ""));
    }

    public final void g(C0223a0 c0223a0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1206k) != null) {
            frameLayout.removeView(c0223a0);
        } else {
            linearLayout.removeView(c0223a0);
        }
        int i2 = this.f1205j - 1;
        this.f1205j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0223a0 c0223a0, CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f578a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f1210o == this.f1209n && c0223a0 != null && TextUtils.equals(c0223a0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1207l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1219x, this.f1220y, 2, i, i2);
            d(arrayList, this.f1212q, this.f1213r, 1, i, i2);
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
            animatorSet.addListener(new r(this, i2, e(i), i, e(i2)));
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
            this.f1209n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
