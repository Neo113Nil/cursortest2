package G0;

import C.g;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f235a;

    /* renamed from: b, reason: collision with root package name */
    public final g f236b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f237c;

    public a(g gVar, Typeface typeface) {
        this.f235a = typeface;
        this.f236b = gVar;
    }

    @Override // w1.d
    public final void c0(int i) {
        if (this.f237c) {
            return;
        }
        D0.d dVar = (D0.d) this.f236b.f115b;
        if (dVar.j(this.f235a)) {
            dVar.h(false);
        }
    }

    @Override // w1.d
    public final void d0(Typeface typeface, boolean z2) {
        if (this.f237c) {
            return;
        }
        D0.d dVar = (D0.d) this.f236b.f115b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
