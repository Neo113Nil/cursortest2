package D0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import i1.r;
import l.C0208E;

/* loaded from: classes.dex */
public final class a extends C0208E {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f165g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f166e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f167f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f166e == null) {
            int i = r.i(this, com.luckyreads.bookshelf.R.attr.colorControlActivated);
            int i2 = r.i(this, com.luckyreads.bookshelf.R.attr.colorOnSurface);
            int i3 = r.i(this, com.luckyreads.bookshelf.R.attr.colorSurface);
            this.f166e = new ColorStateList(f165g, new int[]{r.n(i3, i, 1.0f), r.n(i3, i2, 0.54f), r.n(i3, i2, 0.38f), r.n(i3, i2, 0.38f)});
        }
        return this.f166e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f167f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f167f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
