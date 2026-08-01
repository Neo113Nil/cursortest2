package O0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f840e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.c f841f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f842g;

    public a(A0.c cVar, Typeface typeface) {
        this.f840e = typeface;
        this.f841f = cVar;
    }

    @Override // H1.d
    public final void T(int i) {
        if (this.f842g) {
            return;
        }
        L0.b bVar = (L0.b) this.f841f.f6b;
        if (bVar.j(this.f840e)) {
            bVar.h(false);
        }
    }

    @Override // H1.d
    public final void U(Typeface typeface, boolean z2) {
        if (this.f842g) {
            return;
        }
        L0.b bVar = (L0.b) this.f841f.f6b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
