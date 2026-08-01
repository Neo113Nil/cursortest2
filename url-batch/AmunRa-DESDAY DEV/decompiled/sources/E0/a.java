package E0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import k1.c;
import l.C0189E;

/* loaded from: classes.dex */
public final class a extends C0189E {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f163g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f164e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f165f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f164e == null) {
            int n2 = c.n(this, com.visualfortune.eyerest.R.attr.colorControlActivated);
            int n3 = c.n(this, com.visualfortune.eyerest.R.attr.colorOnSurface);
            int n4 = c.n(this, com.visualfortune.eyerest.R.attr.colorSurface);
            this.f164e = new ColorStateList(f163g, new int[]{c.q(n4, n2, 1.0f), c.q(n4, n3, 0.54f), c.q(n4, n3, 0.38f), c.q(n4, n3, 0.38f)});
        }
        return this.f164e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f165f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f165f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
