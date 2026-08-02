package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f5494a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5495b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f5494a = permissionExtractor;
        this.f5495b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f5494a.hasPermission(context, this.f5495b);
    }
}
