package F0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import l.C0180C;
import m.C0260a;

/* loaded from: classes.dex */
public final class a extends C0180C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f224g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f226f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f225e == null) {
            int j2 = C0260a.j(this, com.playbag.tripgear.R.attr.colorControlActivated);
            int j3 = C0260a.j(this, com.playbag.tripgear.R.attr.colorOnSurface);
            int j4 = C0260a.j(this, com.playbag.tripgear.R.attr.colorSurface);
            this.f225e = new ColorStateList(f224g, new int[]{C0260a.m(j4, j2, 1.0f), C0260a.m(j4, j3, 0.54f), C0260a.m(j4, j3, 0.38f), C0260a.m(j4, j3, 0.38f)});
        }
        return this.f225e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f226f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f226f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
