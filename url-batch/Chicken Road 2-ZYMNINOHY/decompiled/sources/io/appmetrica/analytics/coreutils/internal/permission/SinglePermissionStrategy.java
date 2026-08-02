package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f9748a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9749b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f9748a = permissionExtractor;
        this.f9749b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f9748a.hasPermission(context, this.f9749b);
    }
}
