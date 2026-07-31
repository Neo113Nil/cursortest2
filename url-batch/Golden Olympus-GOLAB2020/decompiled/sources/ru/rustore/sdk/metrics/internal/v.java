package ru.rustore.sdk.metrics.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f43770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43771b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f43772c;

    public v() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f43770a, vVar.f43770a) && Intrinsics.areEqual(this.f43771b, vVar.f43771b) && Intrinsics.areEqual(this.f43772c, vVar.f43772c);
    }

    public final int hashCode() {
        return this.f43772c.hashCode() + ((this.f43771b.hashCode() + (this.f43770a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationDtoVer1(uuid=");
        sb.append((Object) ("MetricsEventUuid(value=" + this.f43770a + ')'));
        sb.append(", eventName=");
        sb.append(this.f43771b);
        sb.append(", eventData=");
        sb.append(this.f43772c);
        sb.append(')');
        return sb.toString();
    }

    public v(String uuid, String eventName, Map eventData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f43770a = uuid;
        this.f43771b = eventName;
        this.f43772c = eventData;
    }
}
