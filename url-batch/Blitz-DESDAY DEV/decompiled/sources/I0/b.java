package I0;

import android.graphics.Typeface;
import z1.l;

/* loaded from: classes.dex */
public final class b extends D.b {
    public final /* synthetic */ l h;
    public final /* synthetic */ d i;

    public b(d dVar, l lVar) {
        this.i = dVar;
        this.h = lVar;
    }

    @Override // D.b
    public final void g(int i) {
        this.i.f351m = true;
        this.h.d0(i);
    }

    @Override // D.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f352n = Typeface.create(typeface, dVar.f344c);
        dVar.f351m = true;
        this.h.e0(dVar.f352n, false);
    }
}
