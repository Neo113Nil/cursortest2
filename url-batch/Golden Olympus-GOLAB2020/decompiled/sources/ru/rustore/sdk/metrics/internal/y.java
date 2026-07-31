package ru.rustore.sdk.metrics.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f43780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43781b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f43782c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43783d;

    public y(String uuid, String eventName, Map eventData, long j4) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f43780a = uuid;
        this.f43781b = eventName;
        this.f43782c = eventData;
        this.f43783d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f43780a, yVar.f43780a) && Intrinsics.areEqual(this.f43781b, yVar.f43781b) && Intrinsics.areEqual(this.f43782c, yVar.f43782c) && this.f43783d == yVar.f43783d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43783d) + ((this.f43782c.hashCode() + ((this.f43781b.hashCode() + (this.f43780a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationDtoVer2(uuid=");
        sb.append((Object) ("MetricsEventUuid(value=" + this.f43780a + ')'));
        sb.append(", eventName=");
        sb.append(this.f43781b);
        sb.append(", eventData=");
        sb.append(this.f43782c);
        sb.append(", eventTimeStamp=");
        sb.append(this.f43783d);
        sb.append(')');
        return sb.toString();
    }
}
