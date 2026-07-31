package androidx.compose.foundation;

import a0.q;
import f1.b0;
import f1.i0;
import f1.p;
import f1.s;
import q6.i;
import t.n;
import w1.f;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class BackgroundElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f457a;

    /* renamed from: b, reason: collision with root package name */
    public final p f458b;

    /* renamed from: c, reason: collision with root package name */
    public final float f459c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f460d;

    public BackgroundElement(long j7, b0 b0Var, i0 i0Var, int i) {
        j7 = (i & 1) != 0 ? s.f2704h : j7;
        b0Var = (i & 2) != 0 ? null : b0Var;
        this.f457a = j7;
        this.f458b = b0Var;
        this.f459c = 1.0f;
        this.f460d = i0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && s.c(this.f457a, backgroundElement.f457a) && i.a(this.f458b, backgroundElement.f458b) && this.f459c == backgroundElement.f459c && i.a(this.f460d, backgroundElement.f460d);
    }

    @Override // w1.x0
    public final l f() {
        n nVar = new n();
        nVar.f6813r = this.f457a;
        nVar.f6814s = this.f458b;
        nVar.f6815t = this.f459c;
        nVar.f6816u = this.f460d;
        nVar.f6817v = 9205357640488583168L;
        return nVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        n nVar = (n) lVar;
        nVar.f6813r = this.f457a;
        nVar.f6814s = this.f458b;
        nVar.f6815t = this.f459c;
        nVar.f6816u = this.f460d;
        f.l(nVar);
    }

    public final int hashCode() {
        int i = s.i;
        int hashCode = Long.hashCode(this.f457a) * 31;
        p pVar = this.f458b;
        return this.f460d.hashCode() + q.a(this.f459c, (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31, 31);
    }
}
