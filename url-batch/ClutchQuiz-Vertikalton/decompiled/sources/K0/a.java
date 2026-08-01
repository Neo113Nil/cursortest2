package K0;

import A.c;
import android.R;
import android.content.res.ColorStateList;
import l.C0184C;

/* loaded from: classes.dex */
public final class a extends C0184C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f460g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f461e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f462f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f461e == null) {
            int E2 = c.E(this, com.clutchquizarena.app.R.attr.colorControlActivated);
            int E3 = c.E(this, com.clutchquizarena.app.R.attr.colorOnSurface);
            int E4 = c.E(this, com.clutchquizarena.app.R.attr.colorSurface);
            this.f461e = new ColorStateList(f460g, new int[]{c.h0(E4, E2, 1.0f), c.h0(E4, E3, 0.54f), c.h0(E4, E3, 0.38f), c.h0(E4, E3, 0.38f)});
        }
        return this.f461e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f462f && Q.c.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f462f = z2;
        if (z2) {
            Q.c.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.c.c(this, null);
        }
    }
}
