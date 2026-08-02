package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import defpackage.cmb;
import defpackage.cmc;
import defpackage.ctg;
import defpackage.cyf;
import defpackage.cyh;
import defpackage.cyi;
import defpackage.oy;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private static Class subclassNativeCronetEngine(ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class);
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            cyf.b(this.mContext);
        } catch (cmb | cmc unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        CronetEngine.Builder builder;
        new cyi("GMS PlayServicesCronetProvider#createBuilder", 0);
        try {
            try {
                cyf.b(this.mContext);
                try {
                    cyh cyhVar = new cyh(this.mContext, 37402, 0.01f);
                    try {
                        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
                        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                            builder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                            cyhVar.a();
                            cyhVar.close();
                        } else {
                            ctg a = cyf.a();
                            oy.at(a);
                            ClassLoader classLoader = a.c.getClassLoader();
                            oy.at(classLoader);
                            ExperimentalCronetEngine.Builder builder2 = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) subclassNativeCronetEngine(classLoader).getConstructor(Context.class).newInstance(this.mContext));
                            cyhVar.a();
                            cyhVar.close();
                            builder = builder2;
                        }
                        Trace.endSection();
                        return builder;
                    } catch (Throwable th) {
                        try {
                            cyhVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
                }
            } catch (Throwable th3) {
                try {
                    Trace.endSection();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (cmb e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (cmc e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (cyf.a) {
            str = cyf.b;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if (HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return cyf.c();
    }
}
