package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpy extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private fpx e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpy(TabLayout tabLayout, Context context) {
        super(context);
        PointerIcon systemIcon;
        Drawable focusRingDrawable;
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable f = e.f(context, i);
            this.c = f;
            if (f != null && f.isStateful()) {
                f.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawable = gradientDrawable;
        if (tabLayout.k != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.k;
            int[] iArr = fmq.a;
            int a = fmq.a(colorStateList, fmq.c);
            int[] iArr2 = fmq.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{fmq.d, iArr2, StateSet.NOTHING}, new int[]{a, fmq.a(colorStateList, iArr2), fmq.a(colorStateList, fmq.a)});
            if (tabLayout.y) {
                RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                drawable = rippleDrawable;
                focusRingDrawable = FocusRingDrawable.c(context) ? new FocusRingDrawable(context, rippleDrawable) : focusRingDrawable;
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.a(context, rippleDrawable2, null);
                focusRingDrawable = rippleDrawable2;
            }
            drawable = focusRingDrawable;
        }
        setBackground(drawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        int i2 = yq.a;
        yk.a(this, systemIcon);
    }

    private static final void d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new dxx(view, 4));
    }

    public final void a(fpx fpxVar) {
        if (fpxVar != this.e) {
            this.e = fpxVar;
            b();
        }
    }

    public final void b() {
        c();
        fpx fpxVar = this.e;
        boolean z = false;
        if (fpxVar != null) {
            TabLayout tabLayout = fpxVar.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int a = tabLayout.a();
            if (a != -1 && a == fpxVar.c) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        boolean z;
        int i;
        fpx fpxVar = this.e;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        TextView textView2 = this.a;
        TabLayout tabLayout = this.d;
        textView2.setTextAppearance(tabLayout.g);
        if (!isSelected() || (i = tabLayout.i) == -1) {
            this.a.setTextAppearance(tabLayout.h);
        } else {
            this.a.setTextAppearance(i);
        }
        ColorStateList colorStateList = tabLayout.j;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView3 = this.a;
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        boolean z2 = !isEmpty;
        if (textView3 != null) {
            if (isEmpty) {
                z = false;
            } else {
                int i2 = this.e.e;
                z = true;
            }
            textView3.setText((CharSequence) null);
            textView3.setVisibility(true != z ? 8 : 0);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int c = (z && imageView2.getVisibility() == 0) ? (int) fik.c(getContext(), 8) : 0;
            if (tabLayout.v) {
                if (c != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(c);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (c != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = c;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        fpx fpxVar2 = this.e;
        setTooltipText(true != z2 ? fpxVar2 != null ? fpxVar2.b : null : null);
        d(this.b);
        d(this.a);
        if (fpxVar == null || TextUtils.isEmpty(fpxVar.b)) {
            return;
        }
        setContentDescription(fpxVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aah aahVar = new aah(accessibilityNodeInfo);
        aahVar.r(brn.aa(0, 1, this.e.c, 1, false, isSelected()));
        if (isSelected()) {
            aahVar.p(false);
            aahVar.H(aag.c);
        }
        aahVar.z(getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.d;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
