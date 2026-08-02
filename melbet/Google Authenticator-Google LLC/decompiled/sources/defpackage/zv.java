package defpackage;

import android.view.WindowInsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zv extends zu {
    public zv(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
    }

    @Override // defpackage.zo, defpackage.zw
    public List f(int i) {
        List boundingRects;
        boundingRects = this.a.getBoundingRects(zy.a(i));
        return boundingRects;
    }

    @Override // defpackage.zo, defpackage.zw
    public List g(int i) {
        List boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.a.getBoundingRectsIgnoringVisibility(zy.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.zo, defpackage.zw
    public void j() {
    }
}
