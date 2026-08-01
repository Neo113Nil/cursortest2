package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j3 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public j3(f8 f8Var) {
        this.b = f8Var;
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
                return (f8) obj;
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
