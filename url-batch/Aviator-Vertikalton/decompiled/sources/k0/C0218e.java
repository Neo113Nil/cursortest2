package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3142a;

    public C0218e(Drawable.ConstantState constantState) {
        this.f3142a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3142a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3142a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0219f c0219f = new C0219f(null);
        Drawable newDrawable = this.f3142a.newDrawable();
        c0219f.f3148a = newDrawable;
        newDrawable.setCallback(c0219f.f3147f);
        return c0219f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0219f c0219f = new C0219f(null);
        Drawable newDrawable = this.f3142a.newDrawable(resources);
        c0219f.f3148a = newDrawable;
        newDrawable.setCallback(c0219f.f3147f);
        return c0219f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0219f c0219f = new C0219f(null);
        Drawable newDrawable = this.f3142a.newDrawable(resources, theme);
        c0219f.f3148a = newDrawable;
        newDrawable.setCallback(c0219f.f3147f);
        return c0219f;
    }
}
