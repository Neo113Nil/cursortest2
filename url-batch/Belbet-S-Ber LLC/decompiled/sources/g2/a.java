package g2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1873a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1874b;

    public a(b bVar) {
        this.f1874b = bVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f1873a) {
            case 1:
                return ((Drawable.ConstantState) this.f1874b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f1873a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f1874b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f1873a) {
            case 0:
                return (b) this.f1874b;
            default:
                l1.e eVar = new l1.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1874b).newDrawable();
                eVar.f2649f = newDrawable;
                newDrawable.setCallback(eVar.f2648k);
                return eVar;
        }
    }

    public a(Drawable.ConstantState constantState) {
        this.f1874b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f1873a) {
            case 1:
                l1.e eVar = new l1.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1874b).newDrawable(resources);
                eVar.f2649f = newDrawable;
                newDrawable.setCallback(eVar.f2648k);
                return eVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1873a) {
            case 1:
                l1.e eVar = new l1.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1874b).newDrawable(resources, theme);
                eVar.f2649f = newDrawable;
                newDrawable.setCallback(eVar.f2648k);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
