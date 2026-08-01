package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class il0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public il0(Drawable.ConstantState constantState) {
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
        jl0 jl0Var = new jl0();
        jl0Var.f = (VectorDrawable) this.a.newDrawable();
        return jl0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        jl0 jl0Var = new jl0();
        jl0Var.f = (VectorDrawable) this.a.newDrawable(resources);
        return jl0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        jl0 jl0Var = new jl0();
        jl0Var.f = (VectorDrawable) this.a.newDrawable(resources, theme);
        return jl0Var;
    }
}
