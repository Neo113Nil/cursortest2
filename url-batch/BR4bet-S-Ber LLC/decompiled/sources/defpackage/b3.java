package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b3 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public b3(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        c3 c3Var = new c3(null);
        Drawable newDrawable = this.a.newDrawable();
        c3Var.f = newDrawable;
        newDrawable.setCallback(c3Var.k);
        return c3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        c3 c3Var = new c3(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        c3Var.f = newDrawable;
        newDrawable.setCallback(c3Var.k);
        return c3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        c3 c3Var = new c3(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        c3Var.f = newDrawable;
        newDrawable.setCallback(c3Var.k);
        return c3Var;
    }
}
