package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3105a;

    public C0261e(Drawable.ConstantState constantState) {
        this.f3105a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3105a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3105a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0262f c0262f = new C0262f(null);
        Drawable newDrawable = this.f3105a.newDrawable();
        c0262f.f3110a = newDrawable;
        newDrawable.setCallback(c0262f.f3109f);
        return c0262f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0262f c0262f = new C0262f(null);
        Drawable newDrawable = this.f3105a.newDrawable(resources);
        c0262f.f3110a = newDrawable;
        newDrawable.setCallback(c0262f.f3109f);
        return c0262f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0262f c0262f = new C0262f(null);
        Drawable newDrawable = this.f3105a.newDrawable(resources, theme);
        c0262f.f3110a = newDrawable;
        newDrawable.setCallback(c0262f.f3109f);
        return c0262f;
    }
}
