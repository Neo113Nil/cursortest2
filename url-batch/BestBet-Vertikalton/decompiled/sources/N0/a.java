package N0;

import H1.l;
import Q.b;
import android.R;
import android.content.res.ColorStateList;
import l.C0206C;

/* loaded from: classes.dex */
public final class a extends C0206C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f835g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f837f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f836e == null) {
            int A2 = l.A(this, com.fortunequest.neontrack.R.attr.colorControlActivated);
            int A3 = l.A(this, com.fortunequest.neontrack.R.attr.colorOnSurface);
            int A4 = l.A(this, com.fortunequest.neontrack.R.attr.colorSurface);
            this.f836e = new ColorStateList(f835g, new int[]{l.Q(1.0f, A4, A2), l.Q(0.54f, A4, A3), l.Q(0.38f, A4, A3), l.Q(0.38f, A4, A3)});
        }
        return this.f836e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f837f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f837f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
