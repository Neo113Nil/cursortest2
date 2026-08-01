package G0;

import A1.d;
import R.b;
import android.R;
import android.content.res.ColorStateList;
import m.C0186D;

/* loaded from: classes.dex */
public final class a extends C0186D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f283g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f284e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f285f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f284e == null) {
            int B2 = d.B(this, com.winfour.winrandom.R.attr.colorControlActivated);
            int B3 = d.B(this, com.winfour.winrandom.R.attr.colorOnSurface);
            int B4 = d.B(this, com.winfour.winrandom.R.attr.colorSurface);
            this.f284e = new ColorStateList(f283g, new int[]{d.S(B4, B2, 1.0f), d.S(B4, B3, 0.54f), d.S(B4, B3, 0.38f), d.S(B4, B3, 0.38f)});
        }
        return this.f284e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f285f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f285f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
