package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r2 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public r2(a8 a8Var) {
        this.b = a8Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                s2 s2Var = new s2(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                s2Var.f = newDrawable;
                newDrawable.setCallback(s2Var.k);
                return s2Var;
            default:
                return super.newDrawable(resources);
        }
    }

    public r2(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s2 s2Var = new s2(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                s2Var.f = newDrawable;
                newDrawable.setCallback(s2Var.k);
                return s2Var;
            default:
                return (a8) obj;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                s2 s2Var = new s2(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                s2Var.f = newDrawable;
                newDrawable.setCallback(s2Var.k);
                return s2Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
