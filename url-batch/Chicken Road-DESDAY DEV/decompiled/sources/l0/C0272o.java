package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: l0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3099a;

    public C0272o(Drawable.ConstantState constantState) {
        this.f3099a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3099a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3099a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0273p c0273p = new C0273p();
        c0273p.f3057a = (VectorDrawable) this.f3099a.newDrawable();
        return c0273p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0273p c0273p = new C0273p();
        c0273p.f3057a = (VectorDrawable) this.f3099a.newDrawable(resources);
        return c0273p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0273p c0273p = new C0273p();
        c0273p.f3057a = (VectorDrawable) this.f3099a.newDrawable(resources, theme);
        return c0273p;
    }
}
