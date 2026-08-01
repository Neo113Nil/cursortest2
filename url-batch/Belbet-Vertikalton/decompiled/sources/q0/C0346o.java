package q0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: q0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3988a;

    public C0346o(Drawable.ConstantState constantState) {
        this.f3988a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3988a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3988a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0347p c0347p = new C0347p();
        c0347p.f3946a = (VectorDrawable) this.f3988a.newDrawable();
        return c0347p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0347p c0347p = new C0347p();
        c0347p.f3946a = (VectorDrawable) this.f3988a.newDrawable(resources);
        return c0347p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0347p c0347p = new C0347p();
        c0347p.f3946a = (VectorDrawable) this.f3988a.newDrawable(resources, theme);
        return c0347p;
    }
}
