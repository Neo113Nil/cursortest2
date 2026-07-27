package io.appmetrica.analytics.remotepermissions.impl;

import g4.C0473r;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public Set f9946a = C0473r.f5752a;

    public final synchronized void a(Set<String> set) {
        this.f9946a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f9946a.contains(str);
    }
}
