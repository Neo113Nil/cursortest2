package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9980a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9981b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9982c;

    public IdSyncConfig(boolean z, long j4, List<RequestConfig> list) {
        this.f9980a = z;
        this.f9981b = j4;
        this.f9982c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.f9980a == idSyncConfig.f9980a && this.f9981b == idSyncConfig.f9981b && i.a(this.f9982c, idSyncConfig.f9982c);
    }

    public final boolean getEnabled() {
        return this.f9980a;
    }

    public final long getLaunchDelay() {
        return this.f9981b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f9982c;
    }

    public int hashCode() {
        return this.f9982c.hashCode() + ((Long.hashCode(this.f9981b) + (Boolean.hashCode(this.f9980a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f9980a + ", launchDelay=" + this.f9981b + ", requests=" + this.f9982c + ')';
    }
}
