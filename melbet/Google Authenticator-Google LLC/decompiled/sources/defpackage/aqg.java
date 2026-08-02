package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqg extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public aqg(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        aqh aqhVar = new aqh(null);
        aqhVar.e = this.a.newDrawable();
        aqhVar.e.setCallback(aqhVar.d);
        return aqhVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        aqh aqhVar = new aqh(null);
        aqhVar.e = this.a.newDrawable(resources);
        aqhVar.e.setCallback(aqhVar.d);
        return aqhVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aqh aqhVar = new aqh(null);
        aqhVar.e = this.a.newDrawable(resources, theme);
        aqhVar.e.setCallback(aqhVar.d);
        return aqhVar;
    }
}
