package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j3 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public j3(a9 a9Var) {
        this.b = a9Var;
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
                k3 k3Var = new k3(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                k3Var.f = newDrawable;
                newDrawable.setCallback(k3Var.k);
                return k3Var;
            default:
                return super.newDrawable(resources);
        }
    }

    public j3(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k3 k3Var = new k3(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                k3Var.f = newDrawable;
                newDrawable.setCallback(k3Var.k);
                return k3Var;
            default:
                return (a9) obj;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                k3 k3Var = new k3(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                k3Var.f = newDrawable;
                newDrawable.setCallback(k3Var.k);
                return k3Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
