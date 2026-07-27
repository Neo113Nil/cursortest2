package A0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x f390a;

    /* renamed from: b, reason: collision with root package name */
    public final w f391b;

    public y(x xVar, w wVar) {
        this.f390a = xVar;
        this.f391b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.a(this.f391b, yVar.f391b) && Intrinsics.a(this.f390a, yVar.f390a);
    }

    public final int hashCode() {
        x xVar = this.f390a;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        w wVar = this.f391b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f390a + ", paragraphSyle=" + this.f391b + ')';
    }
}
