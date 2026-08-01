package F0;

import android.graphics.Typeface;
import u1.l;

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
        this.i.f185m = true;
        this.h.M(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f186n = Typeface.create(typeface, dVar.f178c);
        dVar.f185m = true;
        this.h.N(dVar.f186n, false);
    }
}
