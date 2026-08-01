package F0;

import C.g;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f223e;

    /* renamed from: f, reason: collision with root package name */
    public final g f224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225g;

    public a(g gVar, Typeface typeface) {
        this.f223e = typeface;
        this.f224f = gVar;
    }

    @Override // x1.d
    public final void O(int i) {
        if (this.f225g) {
            return;
        }
        C0.d dVar = (C0.d) this.f224f.f67b;
        if (dVar.j(this.f223e)) {
            dVar.h(false);
        }
    }

    @Override // x1.d
    public final void P(Typeface typeface, boolean z2) {
        if (this.f225g) {
            return;
        }
        C0.d dVar = (C0.d) this.f224f.f67b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
