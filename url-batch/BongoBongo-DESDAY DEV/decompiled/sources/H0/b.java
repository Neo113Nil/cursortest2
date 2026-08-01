package H0;

import A1.m;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends C.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f299h;
    public final /* synthetic */ d i;

    public b(d dVar, m mVar) {
        this.i = dVar;
        this.f299h = mVar;
    }

    @Override // C.b
    public final void g(int i) {
        this.i.f313m = true;
        this.f299h.O(i);
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f314n = Typeface.create(typeface, dVar.f305c);
        dVar.f313m = true;
        this.f299h.P(dVar.f314n, false);
    }
}
