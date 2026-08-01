package K0;

import H1.l;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends D.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f675h;
    public final /* synthetic */ d i;

    public b(d dVar, l lVar) {
        this.i = dVar;
        this.f675h = lVar;
    }

    @Override // D.b
    public final void g(int i) {
        this.i.f688m = true;
        this.f675h.L(i);
    }

    @Override // D.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f689n = Typeface.create(typeface, dVar.f681c);
        dVar.f688m = true;
        this.f675h.M(dVar.f689n, false);
    }
}
