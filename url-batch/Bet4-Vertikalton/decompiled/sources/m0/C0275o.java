package m0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: m0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3181a;

    public C0275o(Drawable.ConstantState constantState) {
        this.f3181a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3181a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3181a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0276p c0276p = new C0276p();
        c0276p.f3139a = (VectorDrawable) this.f3181a.newDrawable();
        return c0276p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0276p c0276p = new C0276p();
        c0276p.f3139a = (VectorDrawable) this.f3181a.newDrawable(resources);
        return c0276p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0276p c0276p = new C0276p();
        c0276p.f3139a = (VectorDrawable) this.f3181a.newDrawable(resources, theme);
        return c0276p;
    }
}
