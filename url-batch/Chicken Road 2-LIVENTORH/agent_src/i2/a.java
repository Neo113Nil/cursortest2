package i2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final Typeface f1809k;

    /* renamed from: l, reason: collision with root package name */
    public final a0.a f1810l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1811m;

    public a(a0.a aVar, Typeface typeface) {
        this.f1809k = typeface;
        this.f1810l = aVar;
    }

    @Override // h.a
    public final void U(int i) {
        if (this.f1811m) {
            return;
        }
        e2.b bVar = (e2.b) this.f1810l.f81g;
        if (bVar.l(this.f1809k)) {
            bVar.j(false);
        }
    }

    @Override // h.a
    public final void V(Typeface typeface, boolean z3) {
        if (this.f1811m) {
            return;
        }
        e2.b bVar = (e2.b) this.f1810l.f81g;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
