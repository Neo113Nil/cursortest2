package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* renamed from: io.appmetrica.analytics.impl.xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965xl implements PermissionExtractor {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8622b = "[SimplePermissionExtractor]";

    /* renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f8623a;

    public C0965xl(PermissionStrategy permissionStrategy) {
        this.f8623a = permissionStrategy;
    }

    public final PermissionStrategy a() {
        return this.f8623a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f8623a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
