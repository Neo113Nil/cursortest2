package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjr implements bjs {
    private final bed a;
    private final bjs b;
    private final bjs c;

    public bjr(bed bedVar, bjs bjsVar, bjs bjsVar2) {
        this.a = bedVar;
        this.b = bjsVar;
        this.c = bjsVar2;
    }

    @Override // defpackage.bjs
    public final bdv a(bdv bdvVar, bbl bblVar) {
        Drawable drawable = (Drawable) bdvVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(bil.g(((BitmapDrawable) drawable).getBitmap(), this.a), bblVar);
        }
        if (drawable instanceof bjj) {
            return this.c.a(bdvVar, bblVar);
        }
        return null;
    }
}
