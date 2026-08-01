package m0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3158a;

    public C0268e(Drawable.ConstantState constantState) {
        this.f3158a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3158a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3158a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0269f c0269f = new C0269f(null);
        Drawable newDrawable = this.f3158a.newDrawable();
        c0269f.f3163a = newDrawable;
        newDrawable.setCallback(c0269f.f3162f);
        return c0269f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0269f c0269f = new C0269f(null);
        Drawable newDrawable = this.f3158a.newDrawable(resources);
        c0269f.f3163a = newDrawable;
        newDrawable.setCallback(c0269f.f3162f);
        return c0269f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0269f c0269f = new C0269f(null);
        Drawable newDrawable = this.f3158a.newDrawable(resources, theme);
        c0269f.f3163a = newDrawable;
        newDrawable.setCallback(c0269f.f3162f);
        return c0269f;
    }
}
