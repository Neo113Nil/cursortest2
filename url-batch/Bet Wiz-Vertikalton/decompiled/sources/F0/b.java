package F0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ x1.d h;
    public final /* synthetic */ d i;

    public b(d dVar, x1.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f238m = true;
        this.h.O(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f239n = Typeface.create(typeface, dVar.f231c);
        dVar.f238m = true;
        this.h.P(dVar.f239n, false);
    }
}
