package androidx.compose.foundation;

import a0.m;
import m.i;
import r1.s0;
import r6.k;
import s0.n;
import z0.p0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class BackgroundElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f579a;

    /* renamed from: b, reason: collision with root package name */
    public final float f580b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f581c;

    public BackgroundElement(long j8, p0 p0Var) {
        this.f579a = j8;
        this.f581c = p0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && u.c(this.f579a, backgroundElement.f579a) && this.f580b == backgroundElement.f580b && k.a(this.f581c, backgroundElement.f581c);
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return this.f581c.hashCode() + m.a(this.f580b, Long.hashCode(this.f579a) * 961, 31);
    }

    @Override // r1.s0
    public final n l() {
        i iVar = new i();
        iVar.f6173s = this.f579a;
        iVar.f6174t = this.f581c;
        iVar.f6175u = 9205357640488583168L;
        return iVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        i iVar = (i) nVar;
        iVar.f6173s = this.f579a;
        iVar.f6174t = this.f581c;
    }
}
