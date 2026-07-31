package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0561ul implements PermissionExtractor {
    public static final String b = "[SimplePermissionExtractor]";

    /* renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f1519a;

    public C0561ul(PermissionStrategy permissionStrategy) {
        this.f1519a = permissionStrategy;
    }

    public final PermissionStrategy a() {
        return this.f1519a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f1519a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
