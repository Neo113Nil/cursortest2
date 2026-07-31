package androidx.compose.foundation;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import n.C0667w;
import n.W;
import q.j;
import t0.T;
import z0.f;

/* loaded from: classes.dex */
final class ClickableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final j f3591a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3592b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3593c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3594d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3595e;

    /* renamed from: f, reason: collision with root package name */
    public final Y1.a f3596f;

    public ClickableElement(j jVar, W w3, boolean z3, String str, f fVar, Y1.a aVar) {
        this.f3591a = jVar;
        this.f3592b = w3;
        this.f3593c = z3;
        this.f3594d = str;
        this.f3595e = fVar;
        this.f3596f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return i.a(this.f3591a, clickableElement.f3591a) && i.a(this.f3592b, clickableElement.f3592b) && this.f3593c == clickableElement.f3593c && i.a(this.f3594d, clickableElement.f3594d) && i.a(this.f3595e, clickableElement.f3595e) && this.f3596f == clickableElement.f3596f;
    }

    @Override // t0.T
    public final k h() {
        return new C0667w(this.f3591a, this.f3592b, this.f3593c, this.f3594d, this.f3595e, this.f3596f);
    }

    public final int hashCode() {
        j jVar = this.f3591a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        W w3 = this.f3592b;
        int f3 = AbstractC0080b.f((hashCode + (w3 != null ? w3.hashCode() : 0)) * 31, 31, this.f3593c);
        String str = this.f3594d;
        int hashCode2 = (f3 + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f3595e;
        return this.f3596f.hashCode() + ((hashCode2 + (fVar != null ? Integer.hashCode(fVar.f8953a) : 0)) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0667w) kVar).B0(this.f3591a, this.f3592b, this.f3593c, this.f3594d, this.f3595e, this.f3596f);
    }
}
