package com.squareup.cash.storage;

import com.squareup.cash.SandboxedSetupTeardowns$$ExternalSyntheticLambda0;
import dev.zacsweers.metro.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileDownloaderClientProvider {
    public final Lazy client$delegate;
    public final Lazy increasedTimeoutAuthenticatedOkHttpClient$delegate;

    public FileDownloaderClientProvider(Provider provider, Provider provider2) {
        provider.getClass();
        provider2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.increasedTimeoutAuthenticatedOkHttpClient$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new SandboxedSetupTeardowns$$ExternalSyntheticLambda0(provider, 2));
        this.client$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new SandboxedSetupTeardowns$$ExternalSyntheticLambda0(provider2, 3));
    }
}
