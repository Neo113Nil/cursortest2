package E0;

import android.graphics.Typeface;
import q1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f168a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f169b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f170c;

    public a(B0.d dVar, Typeface typeface) {
        this.f168a = typeface;
        this.f169b = dVar;
    }

    @Override // q1.l
    public final void G(int i) {
        if (this.f170c) {
            return;
        }
        B0.e eVar = (B0.e) this.f169b.f59b;
        if (eVar.j(this.f168a)) {
            eVar.h(false);
        }
    }

    @Override // q1.l
    public final void H(Typeface typeface, boolean z2) {
        if (this.f170c) {
            return;
        }
        B0.e eVar = (B0.e) this.f169b.f59b;
        if (eVar.j(typeface)) {
            eVar.h(false);
        }
    }
}
