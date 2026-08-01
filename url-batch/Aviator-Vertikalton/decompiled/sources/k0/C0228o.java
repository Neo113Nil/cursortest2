package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3194a;

    public C0228o(Drawable.ConstantState constantState) {
        this.f3194a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3194a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3194a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0229p c0229p = new C0229p();
        c0229p.f3148a = (VectorDrawable) this.f3194a.newDrawable();
        return c0229p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0229p c0229p = new C0229p();
        c0229p.f3148a = (VectorDrawable) this.f3194a.newDrawable(resources);
        return c0229p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0229p c0229p = new C0229p();
        c0229p.f3148a = (VectorDrawable) this.f3194a.newDrawable(resources, theme);
        return c0229p;
    }
}
