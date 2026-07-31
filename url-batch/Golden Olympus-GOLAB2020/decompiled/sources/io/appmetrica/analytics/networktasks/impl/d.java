package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f40576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40577b;

    public d(NetworkTask networkTask) {
        this.f40576a = networkTask;
        this.f40577b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f40577b.equals(((d) obj).f40577b);
    }

    public final int hashCode() {
        return this.f40577b.hashCode();
    }
}
