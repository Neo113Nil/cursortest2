package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983tl implements PermissionExtractor {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12787b = "[SimplePermissionExtractor]";

    /* renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f12788a;

    public C0983tl(PermissionStrategy permissionStrategy) {
        this.f12788a = permissionStrategy;
    }

    public final PermissionStrategy a() {
        return this.f12788a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f12788a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
