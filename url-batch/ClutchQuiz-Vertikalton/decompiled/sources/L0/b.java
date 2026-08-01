package L0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ A.c h;
    public final /* synthetic */ d i;

    public b(d dVar, A.c cVar) {
        this.i = dVar;
        this.h = cVar;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f495m = true;
        this.h.m0(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f496n = Typeface.create(typeface, dVar.f488c);
        dVar.f495m = true;
        this.h.n0(dVar.f496n, false);
    }
}
