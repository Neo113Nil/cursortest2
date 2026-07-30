package y3;

import U.b;
import android.R;
import android.content.res.ColorStateList;
import com.icefishing.icefishingliveapp.C5284R;
import m.C4715B;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5251a extends C4715B {

    /* renamed from: z, reason: collision with root package name */
    public static final int[][] f41881z = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f41882x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f41883y;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41882x == null) {
            int f6 = U2.a.f(C5284R.attr.colorControlActivated, this);
            int f9 = U2.a.f(C5284R.attr.colorOnSurface, this);
            int f10 = U2.a.f(C5284R.attr.colorSurface, this);
            this.f41882x = new ColorStateList(f41881z, new int[]{U2.a.n(f10, f6, 1.0f), U2.a.n(f10, f9, 0.54f), U2.a.n(f10, f9, 0.38f), U2.a.n(f10, f9, 0.38f)});
        }
        return this.f41882x;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41883y && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f41883y = z8;
        if (z8) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
