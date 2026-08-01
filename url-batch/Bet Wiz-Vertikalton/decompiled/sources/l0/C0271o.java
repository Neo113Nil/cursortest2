package l0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: l0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3152a;

    public C0271o(Drawable.ConstantState constantState) {
        this.f3152a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3152a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3152a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0272p c0272p = new C0272p();
        c0272p.f3110a = (VectorDrawable) this.f3152a.newDrawable();
        return c0272p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0272p c0272p = new C0272p();
        c0272p.f3110a = (VectorDrawable) this.f3152a.newDrawable(resources);
        return c0272p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0272p c0272p = new C0272p();
        c0272p.f3110a = (VectorDrawable) this.f3152a.newDrawable(resources, theme);
        return c0272p;
    }
}
