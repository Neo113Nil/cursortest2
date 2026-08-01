package o0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3251a;

    public C0270e(Drawable.ConstantState constantState) {
        this.f3251a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3251a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3251a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0271f c0271f = new C0271f(null);
        Drawable newDrawable = this.f3251a.newDrawable();
        c0271f.f3256a = newDrawable;
        newDrawable.setCallback(c0271f.f3255f);
        return c0271f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0271f c0271f = new C0271f(null);
        Drawable newDrawable = this.f3251a.newDrawable(resources);
        c0271f.f3256a = newDrawable;
        newDrawable.setCallback(c0271f.f3255f);
        return c0271f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0271f c0271f = new C0271f(null);
        Drawable newDrawable = this.f3251a.newDrawable(resources, theme);
        c0271f.f3256a = newDrawable;
        newDrawable.setCallback(c0271f.f3255f);
        return c0271f;
    }
}
