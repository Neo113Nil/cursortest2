package k2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import b4.d;
import b4.l;
import i2.o;
import l.a0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends a0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f2381l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2382j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2383k;

    public a(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, com.gdmhkmf.belbet.R.attr.radioButtonStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray e4 = o.e(context2, attributeSet, q1.a.f3160x, com.gdmhkmf.belbet.R.attr.radioButtonStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (e4.hasValue(0)) {
            setButtonTintList(l.r(context2, e4, 0));
        }
        if (e4.hasValue(1)) {
            setRippleColor(l.r(context2, e4, 1));
        }
        this.f2383k = e4.getBoolean(2, false);
        e4.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2382j == null) {
            int U = l.U(getContext(), d.R(this, com.gdmhkmf.belbet.R.attr.colorControlActivated));
            int U2 = l.U(getContext(), d.R(this, com.gdmhkmf.belbet.R.attr.colorOnSurface));
            int U3 = l.U(getContext(), d.R(this, com.gdmhkmf.belbet.R.attr.colorSurface));
            this.f2382j = new ColorStateList(f2381l, new int[]{l.P(U3, U, 1.0f), l.P(U3, U2, 0.54f), l.P(U3, U2, 0.38f), l.P(U3, U2, 0.38f)});
        }
        return this.f2382j;
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
        if (this.f2383k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f2383k = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
