package S;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1002a;

    public d(Drawable.ConstantState constantState) {
        this.f1002a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1002a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1002a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable newDrawable = this.f1002a.newDrawable();
        eVar.f1008e = newDrawable;
        newDrawable.setCallback(eVar.f1005h);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable newDrawable = this.f1002a.newDrawable(resources);
        eVar.f1008e = newDrawable;
        newDrawable.setCallback(eVar.f1005h);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable newDrawable = this.f1002a.newDrawable(resources, theme);
        eVar.f1008e = newDrawable;
        newDrawable.setCallback(eVar.f1005h);
        return eVar;
    }
}
