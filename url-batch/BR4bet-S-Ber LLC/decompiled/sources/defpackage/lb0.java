package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lb0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public lb0(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        mb0 mb0Var = new mb0();
        mb0Var.f = (VectorDrawable) this.a.newDrawable();
        return mb0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        mb0 mb0Var = new mb0();
        mb0Var.f = (VectorDrawable) this.a.newDrawable(resources);
        return mb0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        mb0 mb0Var = new mb0();
        mb0Var.f = (VectorDrawable) this.a.newDrawable(resources, theme);
        return mb0Var;
    }
}
