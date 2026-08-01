package F0;

import C.g;
import android.graphics.Typeface;
import s1.l;

/* loaded from: classes.dex */
public final class a extends l {
    public final Typeface h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f166j;

    public a(g gVar, Typeface typeface) {
        this.h = typeface;
        this.i = gVar;
    }

    @Override // s1.l
    public final void P(int i) {
        if (this.f166j) {
            return;
        }
        C0.d dVar = (C0.d) this.i.f64b;
        if (dVar.j(this.h)) {
            dVar.h(false);
        }
    }

    @Override // s1.l
    public final void Q(Typeface typeface, boolean z2) {
        if (this.f166j) {
            return;
        }
        C0.d dVar = (C0.d) this.i.f64b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
