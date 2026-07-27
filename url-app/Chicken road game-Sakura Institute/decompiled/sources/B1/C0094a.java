package B1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: B1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094a {

    /* renamed from: a, reason: collision with root package name */
    public final String f973a;

    /* renamed from: b, reason: collision with root package name */
    public final String f974b;

    public C0094a(String gaid, String deviceUuid) {
        Intrinsics.checkNotNullParameter(gaid, "gaid");
        Intrinsics.checkNotNullParameter(deviceUuid, "deviceUuid");
        this.f973a = gaid;
        this.f974b = deviceUuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0094a)) {
            return false;
        }
        C0094a c0094a = (C0094a) obj;
        return Intrinsics.a(this.f973a, c0094a.f973a) && Intrinsics.a(this.f974b, c0094a.f974b);
    }

    public final int hashCode() {
        return this.f974b.hashCode() + (this.f973a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceIds(gaid=" + this.f973a + ", deviceUuid=" + this.f974b + ")";
    }
}
