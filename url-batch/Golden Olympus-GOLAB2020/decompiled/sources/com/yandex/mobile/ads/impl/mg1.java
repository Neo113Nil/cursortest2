package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mg1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f29054a = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});

    public static void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
            List mutableList = CollectionsKt.toMutableList((Collection) f29054a);
            String[] requestedPermissions = packageInfo.requestedPermissions;
            if (requestedPermissions != null) {
                Intrinsics.checkNotNullExpressionValue(requestedPermissions, "requestedPermissions");
                mutableList.removeAll(AbstractC3219i.G0(requestedPermissions));
                if (mutableList.size() <= 0) {
                    return;
                }
                kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
                String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{mutableList}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new jo0(format, format);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
