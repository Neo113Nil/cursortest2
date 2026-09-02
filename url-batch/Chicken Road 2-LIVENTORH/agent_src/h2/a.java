package h2;

import a.y;
import android.R;
import android.content.res.ColorStateList;
import l.d0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f1804l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1805j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1806k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1805j == null) {
            int A = y.A(this, com.oriondriftchasers.arordrft.R.attr.colorControlActivated);
            int A2 = y.A(this, com.oriondriftchasers.arordrft.R.attr.colorOnSurface);
            int A3 = y.A(this, com.oriondriftchasers.arordrft.R.attr.colorSurface);
            this.f1805j = new ColorStateList(f1804l, new int[]{y.J(A3, A, 1.0f), y.J(A3, A2, 0.54f), y.J(A3, A2, 0.38f), y.J(A3, A2, 0.38f)});
        }
        return this.f1805j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1806k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f1806k = z3;
        if (z3) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
