package L0;

import A0.h;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f480e;

    /* renamed from: f, reason: collision with root package name */
    public final h f481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f482g;

    public a(h hVar, Typeface typeface) {
        this.f480e = typeface;
        this.f481f = hVar;
    }

    @Override // A.c
    public final void m0(int i) {
        if (this.f482g) {
            return;
        }
        I0.b bVar = (I0.b) this.f481f.f30b;
        if (bVar.j(this.f480e)) {
            bVar.h(false);
        }
    }

    @Override // A.c
    public final void n0(Typeface typeface, boolean z2) {
        if (this.f482g) {
            return;
        }
        I0.b bVar = (I0.b) this.f481f.f30b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
