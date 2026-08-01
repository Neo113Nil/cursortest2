package c2;

import a2.p;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import k.b0;
import k3.d;
import k3.m;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends b0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f1005l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1006j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1007k;

    public a(Context context, AttributeSet attributeSet) {
        super(l2.a.b(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.radioButtonStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray e4 = p.e(context2, attributeSet, l1.a.f2873s, com.gglhk.bofio.fortunetiger.R.attr.radioButtonStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (e4.hasValue(0)) {
            setButtonTintList(m.u(context2, e4, 0));
        }
        if (e4.hasValue(1)) {
            setRippleColor(m.u(context2, e4, 1));
        }
        this.f1007k = e4.getBoolean(2, false);
        e4.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1006j == null) {
            int t3 = g.t(getContext(), d.a0(this, com.gglhk.bofio.fortunetiger.R.attr.colorControlActivated));
            int t4 = g.t(getContext(), d.a0(this, com.gglhk.bofio.fortunetiger.R.attr.colorOnSurface));
            int t5 = g.t(getContext(), d.a0(this, com.gglhk.bofio.fortunetiger.R.attr.colorSurface));
            this.f1006j = new ColorStateList(f1005l, new int[]{g.o(t5, t3, 1.0f), g.o(t5, t4, 0.54f), g.o(t5, t4, 0.38f), g.o(t5, t4, 0.38f)});
        }
        return this.f1006j;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1007k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f1007k = z3;
        if (z3) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
