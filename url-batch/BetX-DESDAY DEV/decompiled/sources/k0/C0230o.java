package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3198a;

    public C0230o(Drawable.ConstantState constantState) {
        this.f3198a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3198a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3198a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0231p c0231p = new C0231p();
        c0231p.f3152a = (VectorDrawable) this.f3198a.newDrawable();
        return c0231p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0231p c0231p = new C0231p();
        c0231p.f3152a = (VectorDrawable) this.f3198a.newDrawable(resources);
        return c0231p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0231p c0231p = new C0231p();
        c0231p.f3152a = (VectorDrawable) this.f3198a.newDrawable(resources, theme);
        return c0231p;
    }
}
