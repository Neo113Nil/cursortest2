package H0;

import S.b;
import android.R;
import android.content.res.ColorStateList;
import l.D;
import z1.d;

/* loaded from: classes.dex */
public final class a extends D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f325g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f326e == null) {
            int t2 = d.t(this, com.winfour.neondrop.R.attr.colorControlActivated);
            int t3 = d.t(this, com.winfour.neondrop.R.attr.colorOnSurface);
            int t4 = d.t(this, com.winfour.neondrop.R.attr.colorSurface);
            this.f326e = new ColorStateList(f325g, new int[]{d.I(t4, t2, 1.0f), d.I(t4, t3, 0.54f), d.I(t4, t3, 0.38f), d.I(t4, t3, 0.38f)});
        }
        return this.f326e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f327f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f327f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
