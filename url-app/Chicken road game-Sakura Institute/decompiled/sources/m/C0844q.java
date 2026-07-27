package m;

import Z.C0310g;
import b0.C0494b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844q {

    /* renamed from: a, reason: collision with root package name */
    public C0310g f8161a = null;

    /* renamed from: b, reason: collision with root package name */
    public Z.r f8162b = null;

    /* renamed from: c, reason: collision with root package name */
    public C0494b f8163c = null;

    /* renamed from: d, reason: collision with root package name */
    public Z.J f8164d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844q)) {
            return false;
        }
        C0844q c0844q = (C0844q) obj;
        return Intrinsics.a(this.f8161a, c0844q.f8161a) && Intrinsics.a(this.f8162b, c0844q.f8162b) && Intrinsics.a(this.f8163c, c0844q.f8163c) && Intrinsics.a(this.f8164d, c0844q.f8164d);
    }

    public final int hashCode() {
        C0310g c0310g = this.f8161a;
        int hashCode = (c0310g == null ? 0 : c0310g.hashCode()) * 31;
        Z.r rVar = this.f8162b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        C0494b c0494b = this.f8163c;
        int hashCode3 = (hashCode2 + (c0494b == null ? 0 : c0494b.hashCode())) * 31;
        Z.J j4 = this.f8164d;
        return hashCode3 + (j4 != null ? j4.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f8161a + ", canvas=" + this.f8162b + ", canvasDrawScope=" + this.f8163c + ", borderPath=" + this.f8164d + ')';
    }
}
