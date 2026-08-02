package io.appmetrica.analytics.network.internal;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public class NetworkClientServiceLocator {

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkClientServiceLocator f13241b;

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f13242a;

    public NetworkClientServiceLocator(Bundle bundle) {
        this.f13242a = bundle;
    }

    public static NetworkClientServiceLocator getInstance() {
        return f13241b;
    }

    public static void init(Context context) {
        init(context, new SafePackageManager());
    }

    public Bundle getApplicationMetaData() {
        return this.f13242a;
    }

    public static void init(Context context, SafePackageManager safePackageManager) {
        if (f13241b == null) {
            synchronized (NetworkClientServiceLocator.class) {
                try {
                    if (f13241b == null) {
                        f13241b = new NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
