package P0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2198c;

    public g(String workSpecId, int i2, int i5) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f2196a = workSpecId;
        this.f2197b = i2;
        this.f2198c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f2196a, gVar.f2196a) && this.f2197b == gVar.f2197b && this.f2198c == gVar.f2198c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2198c) + ((Integer.hashCode(this.f2197b) + (this.f2196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f2196a + ", generation=" + this.f2197b + ", systemId=" + this.f2198c + ')';
    }
}
