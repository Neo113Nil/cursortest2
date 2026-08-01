package H0;

import A1.m;
import D.g;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f296a;

    /* renamed from: b, reason: collision with root package name */
    public final g f297b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f298c;

    public a(g gVar, Typeface typeface) {
        this.f296a = typeface;
        this.f297b = gVar;
    }

    @Override // A1.m
    public final void O(int i) {
        if (this.f298c) {
            return;
        }
        E0.d dVar = (E0.d) this.f297b.f122b;
        if (dVar.j(this.f296a)) {
            dVar.h(false);
        }
    }

    @Override // A1.m
    public final void P(Typeface typeface, boolean z2) {
        if (this.f298c) {
            return;
        }
        E0.d dVar = (E0.d) this.f297b.f122b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
