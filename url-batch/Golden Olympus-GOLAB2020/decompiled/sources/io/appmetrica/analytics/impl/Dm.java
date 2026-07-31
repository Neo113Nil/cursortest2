package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Dm {

    /* renamed from: a, reason: collision with root package name */
    public final int f37383a;

    public Dm(int i4) {
        this.f37383a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f37383a == ((Dm) obj).f37383a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37383a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f37383a + ')';
    }
}
