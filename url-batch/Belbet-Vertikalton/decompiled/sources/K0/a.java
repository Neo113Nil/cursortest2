package K0;

import H1.l;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f672f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.d f673g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f674h;

    public a(C1.d dVar, Typeface typeface) {
        this.f672f = typeface;
        this.f673g = dVar;
    }

    @Override // H1.l
    public final void L(int i) {
        if (this.f674h) {
            return;
        }
        H0.d dVar = (H0.d) this.f673g.f145b;
        if (dVar.j(this.f672f)) {
            dVar.h(false);
        }
    }

    @Override // H1.l
    public final void M(Typeface typeface, boolean z2) {
        if (this.f674h) {
            return;
        }
        H0.d dVar = (H0.d) this.f673g.f145b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
