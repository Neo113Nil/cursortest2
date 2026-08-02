package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fgp extends aqc {
    final /* synthetic */ fgs b;

    public fgp(fgs fgsVar) {
        this.b = fgsVar;
    }

    @Override // defpackage.aqc
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.aqc
    public final void c(Drawable drawable) {
        fgs fgsVar = this.b;
        ColorStateList colorStateList = fgsVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(fgsVar.d, colorStateList.getDefaultColor()));
        }
    }
}
