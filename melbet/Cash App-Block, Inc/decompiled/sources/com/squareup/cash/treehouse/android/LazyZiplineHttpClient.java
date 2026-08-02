package com.squareup.cash.treehouse.android;

import app.cash.zipline.loader.FastCodeUpdatesKt$withDevelopmentServerPush$1;
import app.cash.zipline.loader.ZiplineHttpClient;
import app.cash.zipline.loader.internal.fetcher.HttpFetcher$fetchByteString$1;
import dev.zacsweers.metro.Provider;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class LazyZiplineHttpClient extends ZiplineHttpClient {
    public final Lazy delegate$delegate;
    public final Provider okHttpClientProvider;

    public LazyZiplineHttpClient(Provider provider) {
        provider.getClass();
        this.okHttpClientProvider = provider;
        this.delegate$delegate = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 5));
    }

    @Override // app.cash.zipline.loader.ZiplineHttpClient
    public final Object download(String str, List list, HttpFetcher$fetchByteString$1 httpFetcher$fetchByteString$1) {
        return ((ZiplineHttpClient) this.delegate$delegate.getValue()).download(str, list, httpFetcher$fetchByteString$1);
    }

    @Override // app.cash.zipline.loader.ZiplineHttpClient
    public final Object openDevelopmentServerWebSocket(String str, List list, FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$1) {
        return ((ZiplineHttpClient) this.delegate$delegate.getValue()).openDevelopmentServerWebSocket(str, list, fastCodeUpdatesKt$withDevelopmentServerPush$1);
    }
}
