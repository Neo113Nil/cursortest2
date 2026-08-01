package l2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final Typeface f2699o;

    /* renamed from: p, reason: collision with root package name */
    public final a0.a f2700p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2701q;

    public a(a0.a aVar, Typeface typeface) {
        this.f2699o = typeface;
        this.f2700p = aVar;
    }

    @Override // b4.d
    public final void H(int i) {
        if (this.f2701q) {
            return;
        }
        i2.d dVar = (i2.d) this.f2700p.f79g;
        if (dVar.l(this.f2699o)) {
            dVar.j(false);
        }
    }

    @Override // b4.d
    public final void I(Typeface typeface, boolean z4) {
        if (this.f2701q) {
            return;
        }
        i2.d dVar = (i2.d) this.f2700p.f79g;
        if (dVar.l(typeface)) {
            dVar.j(false);
        }
    }
}
