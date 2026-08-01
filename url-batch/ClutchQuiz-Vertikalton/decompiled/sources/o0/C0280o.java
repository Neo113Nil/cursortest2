package o0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3298a;

    public C0280o(Drawable.ConstantState constantState) {
        this.f3298a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3298a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3298a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0281p c0281p = new C0281p();
        c0281p.f3256a = (VectorDrawable) this.f3298a.newDrawable();
        return c0281p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0281p c0281p = new C0281p();
        c0281p.f3256a = (VectorDrawable) this.f3298a.newDrawable(resources);
        return c0281p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0281p c0281p = new C0281p();
        c0281p.f3256a = (VectorDrawable) this.f3298a.newDrawable(resources, theme);
        return c0281p;
    }
}
