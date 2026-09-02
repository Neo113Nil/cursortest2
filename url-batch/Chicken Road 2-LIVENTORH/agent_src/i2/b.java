package i2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends e0.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.a f1812h;
    public final /* synthetic */ d i;

    public b(d dVar, h.a aVar) {
        this.i = dVar;
        this.f1812h = aVar;
    }

    @Override // e0.b
    public final void g(int i) {
        this.i.f1828n = true;
        this.f1812h.U(i);
    }

    @Override // e0.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f1830p = Typeface.create(typeface, dVar.d);
        dVar.f1828n = true;
        this.f1812h.V(dVar.f1830p, false);
    }
}
