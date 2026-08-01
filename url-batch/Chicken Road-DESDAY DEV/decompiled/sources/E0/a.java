package E0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import k0.k;
import l.C0191D;

/* loaded from: classes.dex */
public final class a extends C0191D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f167g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f169f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f168e == null) {
            int j2 = k.j(this, com.playgen.securelock.R.attr.colorControlActivated);
            int j3 = k.j(this, com.playgen.securelock.R.attr.colorOnSurface);
            int j4 = k.j(this, com.playgen.securelock.R.attr.colorSurface);
            this.f168e = new ColorStateList(f167g, new int[]{k.n(j4, j2, 1.0f), k.n(j4, j3, 0.54f), k.n(j4, j3, 0.38f), k.n(j4, j3, 0.38f)});
        }
        return this.f168e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f169f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f169f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
