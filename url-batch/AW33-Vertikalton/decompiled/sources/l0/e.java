package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3113a;

    public e(Drawable.ConstantState constantState) {
        this.f3113a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3113a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3113a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f3113a.newDrawable();
        fVar.f3118a = newDrawable;
        newDrawable.setCallback(fVar.f3117f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3113a.newDrawable(resources);
        fVar.f3118a = newDrawable;
        newDrawable.setCallback(fVar.f3117f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3113a.newDrawable(resources, theme);
        fVar.f3118a = newDrawable;
        newDrawable.setCallback(fVar.f3117f);
        return fVar;
    }
}
