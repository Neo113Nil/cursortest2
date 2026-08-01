package n0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3236a;

    public C0250e(Drawable.ConstantState constantState) {
        this.f3236a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3236a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3236a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f3236a.newDrawable();
        fVar.f3241a = newDrawable;
        newDrawable.setCallback(fVar.f3240f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3236a.newDrawable(resources);
        fVar.f3241a = newDrawable;
        newDrawable.setCallback(fVar.f3240f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3236a.newDrawable(resources, theme);
        fVar.f3241a = newDrawable;
        newDrawable.setCallback(fVar.f3240f);
        return fVar;
    }
}
