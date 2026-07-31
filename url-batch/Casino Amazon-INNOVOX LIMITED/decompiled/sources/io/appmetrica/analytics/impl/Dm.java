package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Dm {

    /* renamed from: a, reason: collision with root package name */
    public final int f816a;

    public Dm(int i) {
        this.f816a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f816a == ((Dm) obj).f816a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f816a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f816a + ')';
    }
}
