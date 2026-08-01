package O0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ H1.d h;
    public final /* synthetic */ d i;

    public b(d dVar, H1.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f855m = true;
        this.h.T(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f856n = Typeface.create(typeface, dVar.f848c);
        dVar.f855m = true;
        this.h.U(dVar.f856n, false);
    }
}
