package l;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Z implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public final x0 f7663d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7664e;

    public Z(x0 x0Var, long j4) {
        this.f7663d = x0Var;
        this.f7664e = j4;
    }

    @Override // l.x0
    public final boolean a() {
        return this.f7663d.a();
    }

    @Override // l.x0
    public final long b(AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return this.f7663d.b(abstractC0792s, abstractC0792s2, abstractC0792s3) + this.f7664e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z4 = (Z) obj;
        return z4.f7664e == this.f7664e && Intrinsics.a(z4.f7663d, this.f7663d);
    }

    @Override // l.x0
    public final AbstractC0792s f(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        long j5 = this.f7664e;
        return j4 < j5 ? abstractC0792s : this.f7663d.f(j4 - j5, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.x0
    public final AbstractC0792s g(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        long j5 = this.f7664e;
        return j4 < j5 ? abstractC0792s3 : this.f7663d.g(j4 - j5, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7664e) + (this.f7663d.hashCode() * 31);
    }
}
