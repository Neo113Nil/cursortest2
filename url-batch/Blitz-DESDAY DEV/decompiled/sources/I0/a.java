package I0;

import E.g;
import android.graphics.Typeface;
import z1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f336a;

    /* renamed from: b, reason: collision with root package name */
    public final g f337b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338c;

    public a(g gVar, Typeface typeface) {
        this.f336a = typeface;
        this.f337b = gVar;
    }

    @Override // z1.l
    public final void d0(int i) {
        if (this.f338c) {
            return;
        }
        F0.d dVar = (F0.d) this.f337b.f170b;
        if (dVar.j(this.f336a)) {
            dVar.h(false);
        }
    }

    @Override // z1.l
    public final void e0(Typeface typeface, boolean z2) {
        if (this.f338c) {
            return;
        }
        F0.d dVar = (F0.d) this.f337b.f170b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
