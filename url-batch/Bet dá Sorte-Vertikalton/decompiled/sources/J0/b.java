package J0;

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
        this.i.f337m = true;
        this.h.W(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f338n = Typeface.create(typeface, dVar.f330c);
        dVar.f337m = true;
        this.h.X(dVar.f338n, false);
    }
}
