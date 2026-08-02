package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bjd implements bdv, bds {
    protected final Drawable a;

    public bjd(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.bds
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof bjj) {
            ((bjj) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.bdv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
