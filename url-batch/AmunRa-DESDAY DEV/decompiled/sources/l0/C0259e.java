package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3196a;

    public C0259e(Drawable.ConstantState constantState) {
        this.f3196a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3196a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3196a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0260f c0260f = new C0260f(null);
        Drawable newDrawable = this.f3196a.newDrawable();
        c0260f.f3201a = newDrawable;
        newDrawable.setCallback(c0260f.f3200f);
        return c0260f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0260f c0260f = new C0260f(null);
        Drawable newDrawable = this.f3196a.newDrawable(resources);
        c0260f.f3201a = newDrawable;
        newDrawable.setCallback(c0260f.f3200f);
        return c0260f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0260f c0260f = new C0260f(null);
        Drawable newDrawable = this.f3196a.newDrawable(resources, theme);
        c0260f.f3201a = newDrawable;
        newDrawable.setCallback(c0260f.f3200f);
        return c0260f;
    }
}
