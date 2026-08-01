package J0;

import H1.l;
import S.b;
import android.R;
import android.content.res.ColorStateList;
import n.C0248D;

/* loaded from: classes.dex */
public final class a extends C0248D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f650g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f651f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int u2 = l.u(this, com.winpower.neonfit.R.attr.colorControlActivated);
            int u3 = l.u(this, com.winpower.neonfit.R.attr.colorOnSurface);
            int u4 = l.u(this, com.winpower.neonfit.R.attr.colorSurface);
            this.e = new ColorStateList(f650g, new int[]{l.H(u4, u2, 1.0f), l.H(u4, u3, 0.54f), l.H(u4, u3, 0.38f), l.H(u4, u3, 0.38f)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f651f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f651f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
