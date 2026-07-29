package E0;

import android.graphics.Typeface;
import q1.l;

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
        this.i.f183m = true;
        this.h.G(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f184n = Typeface.create(typeface, dVar.f176c);
        dVar.f183m = true;
        this.h.H(dVar.f184n, false);
    }
}
