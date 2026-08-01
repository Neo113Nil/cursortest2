package m0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3134a;

    public C0265e(Drawable.ConstantState constantState) {
        this.f3134a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3134a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3134a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0266f c0266f = new C0266f(null);
        Drawable newDrawable = this.f3134a.newDrawable();
        c0266f.f3139a = newDrawable;
        newDrawable.setCallback(c0266f.f3138f);
        return c0266f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0266f c0266f = new C0266f(null);
        Drawable newDrawable = this.f3134a.newDrawable(resources);
        c0266f.f3139a = newDrawable;
        newDrawable.setCallback(c0266f.f3138f);
        return c0266f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0266f c0266f = new C0266f(null);
        Drawable newDrawable = this.f3134a.newDrawable(resources, theme);
        c0266f.f3139a = newDrawable;
        newDrawable.setCallback(c0266f.f3138f);
        return c0266f;
    }
}
