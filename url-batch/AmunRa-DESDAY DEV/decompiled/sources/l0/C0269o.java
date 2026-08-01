package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: l0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3243a;

    public C0269o(Drawable.ConstantState constantState) {
        this.f3243a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3243a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3243a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0270p c0270p = new C0270p();
        c0270p.f3201a = (VectorDrawable) this.f3243a.newDrawable();
        return c0270p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0270p c0270p = new C0270p();
        c0270p.f3201a = (VectorDrawable) this.f3243a.newDrawable(resources);
        return c0270p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0270p c0270p = new C0270p();
        c0270p.f3201a = (VectorDrawable) this.f3243a.newDrawable(resources, theme);
        return c0270p;
    }
}
