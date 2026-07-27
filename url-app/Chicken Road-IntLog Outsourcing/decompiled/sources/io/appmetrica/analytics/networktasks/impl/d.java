package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f9844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9845b;

    public d(NetworkTask networkTask) {
        this.f9844a = networkTask;
        this.f9845b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f9845b.equals(((d) obj).f9845b);
    }

    public final int hashCode() {
        return this.f9845b.hashCode();
    }
}
