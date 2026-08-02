package io.appmetrica.analytics.idsync.internal.model;

/* loaded from: classes.dex */
public final class Preconditions {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkType f5700a;

    public Preconditions(NetworkType networkType) {
        this.f5700a = networkType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Preconditions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f5700a == ((Preconditions) obj).f5700a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.Preconditions");
    }

    public final NetworkType getNetworkType() {
        return this.f5700a;
    }

    public int hashCode() {
        return this.f5700a.hashCode();
    }

    public String toString() {
        return "Preconditions(networkType=" + this.f5700a + ')';
    }
}
