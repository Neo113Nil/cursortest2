package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f13287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13288b;

    public d(NetworkTask networkTask) {
        this.f13287a = networkTask;
        this.f13288b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f13288b.equals(((d) obj).f13288b);
    }

    public final int hashCode() {
        return this.f13288b.hashCode();
    }
}
