package E0;

import android.graphics.Typeface;
import q1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: g, reason: collision with root package name */
    public final Typeface f179g;
    public final B0.d h;
    public boolean i;

    public a(B0.d dVar, Typeface typeface) {
        this.f179g = typeface;
        this.h = dVar;
    }

    @Override // q1.l
    public final void R(int i) {
        if (this.i) {
            return;
        }
        B0.e eVar = (B0.e) this.h.f66b;
        if (eVar.j(this.f179g)) {
            eVar.h(false);
        }
    }

    @Override // q1.l
    public final void S(Typeface typeface, boolean z2) {
        if (this.i) {
            return;
        }
        B0.e eVar = (B0.e) this.h.f66b;
        if (eVar.j(typeface)) {
            eVar.h(false);
        }
    }
}
