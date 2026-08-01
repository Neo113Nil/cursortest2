package G0;

import C.g;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f252a;

    /* renamed from: b, reason: collision with root package name */
    public final g f253b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f254c;

    public a(g gVar, Typeface typeface) {
        this.f252a = typeface;
        this.f253b = gVar;
    }

    @Override // z1.d
    public final void c0(int i) {
        if (this.f254c) {
            return;
        }
        D0.d dVar = (D0.d) this.f253b.f80b;
        if (dVar.j(this.f252a)) {
            dVar.h(false);
        }
    }

    @Override // z1.d
    public final void d0(Typeface typeface, boolean z2) {
        if (this.f254c) {
            return;
        }
        D0.d dVar = (D0.d) this.f253b.f80b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
