package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final int f6054a;

    public Gm(int i3) {
        this.f6054a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gm) && this.f6054a == ((Gm) obj).f6054a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6054a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f6054a + ')';
    }
}
