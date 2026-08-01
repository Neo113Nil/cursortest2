package J0;

import C.h;
import android.graphics.Typeface;
import u1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f322e;

    /* renamed from: f, reason: collision with root package name */
    public final h f323f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f324g;

    public a(h hVar, Typeface typeface) {
        this.f322e = typeface;
        this.f323f = hVar;
    }

    @Override // u1.l
    public final void W(int i) {
        if (this.f324g) {
            return;
        }
        G0.d dVar = (G0.d) this.f323f.f150b;
        if (dVar.j(this.f322e)) {
            dVar.h(false);
        }
    }

    @Override // u1.l
    public final void X(Typeface typeface, boolean z2) {
        if (this.f324g) {
            return;
        }
        G0.d dVar = (G0.d) this.f323f.f150b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
