package l2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends e0.b {
    public final /* synthetic */ b4.d h;
    public final /* synthetic */ d i;

    public b(d dVar, b4.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // e0.b
    public final void g(int i) {
        this.i.f2716n = true;
        this.h.H(i);
    }

    @Override // e0.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f2718p = Typeface.create(typeface, dVar.d);
        dVar.f2716n = true;
        this.h.I(dVar.f2718p, false);
    }
}
