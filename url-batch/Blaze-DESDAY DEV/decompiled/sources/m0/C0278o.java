package m0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: m0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3205a;

    public C0278o(Drawable.ConstantState constantState) {
        this.f3205a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3205a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3205a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0279p c0279p = new C0279p();
        c0279p.f3163a = (VectorDrawable) this.f3205a.newDrawable();
        return c0279p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0279p c0279p = new C0279p();
        c0279p.f3163a = (VectorDrawable) this.f3205a.newDrawable(resources);
        return c0279p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0279p c0279p = new C0279p();
        c0279p.f3163a = (VectorDrawable) this.f3205a.newDrawable(resources, theme);
        return c0279p;
    }
}
