package androidx.compose.foundation;

import A.AbstractC0017m;
import S.n;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.D;
import Z.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.C0843p;
import r0.T;
import y2.y;

@Metadata
/* loaded from: classes.dex */
final class BackgroundElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final long f5004a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0319p f5005b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5006c;

    /* renamed from: d, reason: collision with root package name */
    public final P f5007d;

    public BackgroundElement(long j4, D d4, float f4, P p4, int i2) {
        j4 = (i2 & 1) != 0 ? C0323u.f4547g : j4;
        d4 = (i2 & 2) != 0 ? null : d4;
        this.f5004a = j4;
        this.f5005b = d4;
        this.f5006c = f4;
        this.f5007d = p4;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C0323u.c(this.f5004a, backgroundElement.f5004a) && Intrinsics.a(this.f5005b, backgroundElement.f5005b) && this.f5006c == backgroundElement.f5006c && Intrinsics.a(this.f5007d, backgroundElement.f5007d);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y.f11688e;
        int hashCode = Long.hashCode(this.f5004a) * 31;
        AbstractC0319p abstractC0319p = this.f5005b;
        return this.f5007d.hashCode() + AbstractC0017m.a(this.f5006c, (hashCode + (abstractC0319p != null ? abstractC0319p.hashCode() : 0)) * 31, 31);
    }

    @Override // r0.T
    public final n l() {
        C0843p c0843p = new C0843p();
        c0843p.f8153t = this.f5004a;
        c0843p.f8154u = this.f5005b;
        c0843p.f8155v = this.f5006c;
        c0843p.f8156w = this.f5007d;
        c0843p.f8157x = 9205357640488583168L;
        return c0843p;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0843p c0843p = (C0843p) nVar;
        c0843p.f8153t = this.f5004a;
        c0843p.f8154u = this.f5005b;
        c0843p.f8155v = this.f5006c;
        c0843p.f8156w = this.f5007d;
    }
}
