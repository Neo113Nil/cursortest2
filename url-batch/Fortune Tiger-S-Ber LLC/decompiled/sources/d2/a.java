package d2;

import a2.f;
import android.graphics.Typeface;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f1470f;
    public final a2.e g;
    public boolean h;

    public a(a2.e eVar, Typeface typeface) {
        this.f1470f = typeface;
        this.g = eVar;
    }

    @Override // k3.d
    public final void R(int i4) {
        if (this.h) {
            return;
        }
        f fVar = (f) this.g.g;
        if (fVar.l(this.f1470f)) {
            fVar.j(false);
        }
    }

    @Override // k3.d
    public final void S(Typeface typeface, boolean z3) {
        if (this.h) {
            return;
        }
        f fVar = (f) this.g.g;
        if (fVar.l(typeface)) {
            fVar.j(false);
        }
    }
}
