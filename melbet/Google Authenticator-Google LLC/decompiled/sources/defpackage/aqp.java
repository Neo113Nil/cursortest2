package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqp extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public aqp(Drawable.ConstantState constantState) {
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
        aqq aqqVar = new aqq();
        aqqVar.e = (VectorDrawable) this.a.newDrawable();
        return aqqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        aqq aqqVar = new aqq();
        aqqVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return aqqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aqq aqqVar = new aqq();
        aqqVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return aqqVar;
    }
}
