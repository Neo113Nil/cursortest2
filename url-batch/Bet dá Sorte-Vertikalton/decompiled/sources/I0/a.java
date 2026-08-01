package I0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import l.C0183C;
import u1.l;

/* loaded from: classes.dex */
public final class a extends C0183C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f316g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f317e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f317e == null) {
            int u2 = l.u(this, com.glasspulse.glasspulse.R.attr.colorControlActivated);
            int u3 = l.u(this, com.glasspulse.glasspulse.R.attr.colorOnSurface);
            int u4 = l.u(this, com.glasspulse.glasspulse.R.attr.colorSurface);
            this.f317e = new ColorStateList(f316g, new int[]{l.R(u4, u2, 1.0f), l.R(u4, u3, 0.54f), l.R(u4, u3, 0.38f), l.R(u4, u3, 0.38f)});
        }
        return this.f317e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f318f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f318f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
