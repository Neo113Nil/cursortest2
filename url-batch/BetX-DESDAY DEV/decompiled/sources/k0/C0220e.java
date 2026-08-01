package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3146a;

    public C0220e(Drawable.ConstantState constantState) {
        this.f3146a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3146a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3146a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0221f c0221f = new C0221f(null);
        Drawable newDrawable = this.f3146a.newDrawable();
        c0221f.f3152a = newDrawable;
        newDrawable.setCallback(c0221f.f3151f);
        return c0221f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0221f c0221f = new C0221f(null);
        Drawable newDrawable = this.f3146a.newDrawable(resources);
        c0221f.f3152a = newDrawable;
        newDrawable.setCallback(c0221f.f3151f);
        return c0221f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0221f c0221f = new C0221f(null);
        Drawable newDrawable = this.f3146a.newDrawable(resources, theme);
        c0221f.f3152a = newDrawable;
        newDrawable.setCallback(c0221f.f3151f);
        return c0221f;
    }
}
