package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Je implements PermissionExtractor {
    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NotNull Context context, @NotNull String str) {
        return false;
    }
}
