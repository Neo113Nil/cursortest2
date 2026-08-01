package q0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3941a;

    public C0336e(Drawable.ConstantState constantState) {
        this.f3941a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3941a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3941a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0337f c0337f = new C0337f(null);
        Drawable newDrawable = this.f3941a.newDrawable();
        c0337f.f3946a = newDrawable;
        newDrawable.setCallback(c0337f.f3945f);
        return c0337f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0337f c0337f = new C0337f(null);
        Drawable newDrawable = this.f3941a.newDrawable(resources);
        c0337f.f3946a = newDrawable;
        newDrawable.setCallback(c0337f.f3945f);
        return c0337f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0337f c0337f = new C0337f(null);
        Drawable newDrawable = this.f3941a.newDrawable(resources, theme);
        c0337f.f3946a = newDrawable;
        newDrawable.setCallback(c0337f.f3945f);
        return c0337f;
    }
}
