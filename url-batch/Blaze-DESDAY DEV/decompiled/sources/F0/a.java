package F0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import k0.AbstractC0180a;
import l.C0184D;

/* loaded from: classes.dex */
public final class a extends C0184D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f239g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f240e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f240e == null) {
            int i = AbstractC0180a.i(this, com.winworm.neongrid.R.attr.colorControlActivated);
            int i2 = AbstractC0180a.i(this, com.winworm.neongrid.R.attr.colorOnSurface);
            int i3 = AbstractC0180a.i(this, com.winworm.neongrid.R.attr.colorSurface);
            this.f240e = new ColorStateList(f239g, new int[]{AbstractC0180a.l(i3, i, 1.0f), AbstractC0180a.l(i3, i2, 0.54f), AbstractC0180a.l(i3, i2, 0.38f), AbstractC0180a.l(i3, i2, 0.38f)});
        }
        return this.f240e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f241f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f241f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
