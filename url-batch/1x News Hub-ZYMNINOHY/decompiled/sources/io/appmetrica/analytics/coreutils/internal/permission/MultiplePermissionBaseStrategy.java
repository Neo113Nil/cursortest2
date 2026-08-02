package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f5492a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5493b;

    public MultiplePermissionBaseStrategy(PermissionExtractor permissionExtractor, List<String> list) {
        this.f5492a = permissionExtractor;
        this.f5493b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f5493b.isEmpty() || hasNecessaryPermissions(context, this.f5492a, this.f5493b);
    }

    public abstract boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list);
}
