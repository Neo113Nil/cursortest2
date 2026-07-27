package io.appmetrica.analytics.coreutils.internal.services;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

/* loaded from: classes.dex */
public final class PackageManagerUtilsTiramisu {
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();

    /* renamed from: a, reason: collision with root package name */
    private static final String f6274a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    public final ProviderInfo resolveContentProvider(PackageManager packageManager, String str) {
        PackageManager.ComponentInfoFlags of;
        ProviderInfo resolveContentProvider;
        try {
            of = PackageManager.ComponentInfoFlags.of(8L);
            resolveContentProvider = packageManager.resolveContentProvider(str, of);
            return resolveContentProvider;
        } catch (Throwable unused) {
            return null;
        }
    }
}
