package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5696a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5697b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5698c;

    public IdSyncConfig(boolean z, long j3, List<RequestConfig> list) {
        this.f5696a = z;
        this.f5697b = j3;
        this.f5698c = list;
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
        return this.f5696a == idSyncConfig.f5696a && this.f5697b == idSyncConfig.f5697b && j.a(this.f5698c, idSyncConfig.f5698c);
    }

    public final boolean getEnabled() {
        return this.f5696a;
    }

    public final long getLaunchDelay() {
        return this.f5697b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f5698c;
    }

    public int hashCode() {
        return this.f5698c.hashCode() + ((Long.hashCode(this.f5697b) + (Boolean.hashCode(this.f5696a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f5696a + ", launchDelay=" + this.f5697b + ", requests=" + this.f5698c + ')';
    }
}
