package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cm {

    /* renamed from: a, reason: collision with root package name */
    public final int f10172a;

    public Cm(int i4) {
        this.f10172a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cm) && this.f10172a == ((Cm) obj).f10172a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10172a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f10172a + ')';
    }
}
