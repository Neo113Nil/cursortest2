package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3052a;

    public C0262e(Drawable.ConstantState constantState) {
        this.f3052a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3052a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3052a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0263f c0263f = new C0263f(null);
        Drawable newDrawable = this.f3052a.newDrawable();
        c0263f.f3057a = newDrawable;
        newDrawable.setCallback(c0263f.f3056f);
        return c0263f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0263f c0263f = new C0263f(null);
        Drawable newDrawable = this.f3052a.newDrawable(resources);
        c0263f.f3057a = newDrawable;
        newDrawable.setCallback(c0263f.f3056f);
        return c0263f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0263f c0263f = new C0263f(null);
        Drawable newDrawable = this.f3052a.newDrawable(resources, theme);
        c0263f.f3057a = newDrawable;
        newDrawable.setCallback(c0263f.f3056f);
        return c0263f;
    }
}
