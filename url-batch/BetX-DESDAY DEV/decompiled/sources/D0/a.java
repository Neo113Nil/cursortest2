package D0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import i1.r;
import l.C0236E;

/* loaded from: classes.dex */
public final class a extends C0236E {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f176g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f177e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f178f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f177e == null) {
            int h = r.h(this, com.luckyarcade.spinthrow.R.attr.colorControlActivated);
            int h2 = r.h(this, com.luckyarcade.spinthrow.R.attr.colorOnSurface);
            int h3 = r.h(this, com.luckyarcade.spinthrow.R.attr.colorSurface);
            this.f177e = new ColorStateList(f176g, new int[]{r.l(h3, h, 1.0f), r.l(h3, h2, 0.54f), r.l(h3, h2, 0.38f), r.l(h3, h2, 0.38f)});
        }
        return this.f177e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f178f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f178f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
