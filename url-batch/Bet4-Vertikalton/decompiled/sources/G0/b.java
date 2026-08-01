package G0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ w1.d h;
    public final /* synthetic */ d i;

    public b(d dVar, w1.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f250m = true;
        this.h.c0(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f251n = Typeface.create(typeface, dVar.f243c);
        dVar.f250m = true;
        this.h.d0(dVar.f251n, false);
    }
}
