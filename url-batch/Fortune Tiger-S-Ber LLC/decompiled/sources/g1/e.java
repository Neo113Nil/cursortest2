package g1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1770a;

    public e(Drawable.ConstantState constantState) {
        this.f1770a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1770a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1770a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1770a.newDrawable();
        fVar.f1774f = newDrawable;
        newDrawable.setCallback(fVar.f1773k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1770a.newDrawable(resources);
        fVar.f1774f = newDrawable;
        newDrawable.setCallback(fVar.f1773k);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1770a.newDrawable(resources, theme);
        fVar.f1774f = newDrawable;
        newDrawable.setCallback(fVar.f1773k);
        return fVar;
    }
}
