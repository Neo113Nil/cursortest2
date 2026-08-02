package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3470a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f3471b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3472c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3473d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i2 = this.f3470a;
        Drawable.ConstantState constantState = this.f3471b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f();
        fVar.f3467h = this;
        Drawable.ConstantState constantState = this.f3471b;
        if (constantState != null) {
            fVar.h(constantState.newDrawable(resources));
        }
        f.a();
        return fVar;
    }
}
