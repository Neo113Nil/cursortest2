package F0;

import C.g;
import android.graphics.Typeface;
import u1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f170e;

    /* renamed from: f, reason: collision with root package name */
    public final g f171f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f172g;

    public a(g gVar, Typeface typeface) {
        this.f170e = typeface;
        this.f171f = gVar;
    }

    @Override // u1.l
    public final void M(int i) {
        if (this.f172g) {
            return;
        }
        C0.d dVar = (C0.d) this.f171f.f66b;
        if (dVar.j(this.f170e)) {
            dVar.h(false);
        }
    }

    @Override // u1.l
    public final void N(Typeface typeface, boolean z2) {
        if (this.f172g) {
            return;
        }
        C0.d dVar = (C0.d) this.f171f.f66b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
