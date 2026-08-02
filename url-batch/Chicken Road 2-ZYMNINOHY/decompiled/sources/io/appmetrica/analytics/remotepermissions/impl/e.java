package io.appmetrica.analytics.remotepermissions.impl;

import d3.s;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public Set f13395a = s.f8335a;

    public final synchronized void a(Set<String> set) {
        this.f13395a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f13395a.contains(str);
    }
}
