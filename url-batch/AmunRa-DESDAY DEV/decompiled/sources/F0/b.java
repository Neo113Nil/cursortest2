package F0;

import android.graphics.Typeface;
import s1.l;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ l h;
    public final /* synthetic */ d i;

    public b(d dVar, l lVar) {
        this.i = dVar;
        this.h = lVar;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f178m = true;
        this.h.P(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f179n = Typeface.create(typeface, dVar.f171c);
        dVar.f178m = true;
        this.h.Q(dVar.f179n, false);
    }
}
