package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsEvent;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f43735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43736b;

    /* renamed from: c, reason: collision with root package name */
    public final String f43737c;

    /* renamed from: d, reason: collision with root package name */
    public final String f43738d;

    /* renamed from: e, reason: collision with root package name */
    public final MetricsEvent f43739e;

    public p0(String packageName, String uuid, String userId, String str, MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f43735a = packageName;
        this.f43736b = uuid;
        this.f43737c = userId;
        this.f43738d = str;
        this.f43739e = metricsEvent;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(p0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto");
        p0 p0Var = (p0) obj;
        if (!Intrinsics.areEqual(this.f43735a, p0Var.f43735a) || !Intrinsics.areEqual(this.f43736b, p0Var.f43736b) || !Intrinsics.areEqual(this.f43737c, p0Var.f43737c)) {
            return false;
        }
        String str = this.f43738d;
        String str2 = p0Var.f43738d;
        if (str == null) {
            if (str2 == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str2 != null) {
                areEqual = Intrinsics.areEqual(str, str2);
            }
            areEqual = false;
        }
        return areEqual && Intrinsics.areEqual(this.f43739e, p0Var.f43739e);
    }

    public final int hashCode() {
        int hashCode = (this.f43737c.hashCode() + ((this.f43736b.hashCode() + (this.f43735a.hashCode() * 31)) * 31)) * 31;
        String str = this.f43738d;
        c1 c1Var = str != null ? new c1(str) : null;
        return this.f43739e.hashCode() + ((hashCode + (c1Var != null ? c1Var.f43696a.hashCode() : 0)) * 31);
    }
}
