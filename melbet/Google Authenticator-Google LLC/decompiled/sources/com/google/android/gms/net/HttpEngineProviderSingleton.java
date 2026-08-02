package com.google.android.gms.net;

import android.content.Context;
import defpackage.dih;
import defpackage.fwm;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HttpEngineProviderSingleton {
    private static final String TAG = "com.google.android.gms.net.HttpEngineProviderSingleton";
    private static HttpEngineProviderSingleton httpEngineProviderSingleton;
    private CronetProvider httpEngineProvider;

    private HttpEngineProviderSingleton(Context context) {
        try {
            if (shouldOverrideWithHttpEngine(context)) {
                CronetProvider cronetProvider = (CronetProvider) Class.forName("org.chromium.net.impl.HttpEngineNativeProvider").asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context);
                if (cronetProvider.isEnabled()) {
                    this.httpEngineProvider = cronetProvider;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized HttpEngineProviderSingleton getInstance(Context context) {
        synchronized (HttpEngineProviderSingleton.class) {
            HttpEngineProviderSingleton httpEngineProviderSingleton2 = httpEngineProviderSingleton;
            if (httpEngineProviderSingleton2 != null) {
                return httpEngineProviderSingleton2;
            }
            HttpEngineProviderSingleton httpEngineProviderSingleton3 = new HttpEngineProviderSingleton(context);
            httpEngineProviderSingleton = httpEngineProviderSingleton3;
            return httpEngineProviderSingleton3;
        }
    }

    private boolean getReflectionValueAsBool(Object obj) {
        return obj != null && ((Boolean) obj).booleanValue();
    }

    private boolean shouldOverrideWithHttpEngine(Context context) {
        try {
            return getReflectionValueAsBool(dih.ar(ExperimentalCronetEngine.class, "shouldOverrideWithHttpEngine", new fwm(Context.class, context, (short[]) null)));
        } catch (Throwable unused) {
            return false;
        }
    }

    public CronetProvider getHttpEngineProvider() {
        return this.httpEngineProvider;
    }

    public boolean shouldUseHttpEngine() {
        return this.httpEngineProvider != null;
    }
}
