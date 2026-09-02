package k1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f2170a;

    public e(Drawable.ConstantState constantState) {
        this.f2170a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2170a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2170a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f2170a.newDrawable();
        fVar.f2175f = newDrawable;
        newDrawable.setCallback(fVar.f2174k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f2170a.newDrawable(resources);
        fVar.f2175f = newDrawable;
        newDrawable.setCallback(fVar.f2174k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f2170a.newDrawable(resources, theme);
        fVar.f2175f = newDrawable;
        newDrawable.setCallback(fVar.f2174k);
        return fVar;
    }
}
