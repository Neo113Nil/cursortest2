package G0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ z1.d h;
    public final /* synthetic */ d i;

    public b(d dVar, z1.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f267m = true;
        this.h.c0(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f268n = Typeface.create(typeface, dVar.f260c);
        dVar.f267m = true;
        this.h.d0(dVar.f268n, false);
    }
}
