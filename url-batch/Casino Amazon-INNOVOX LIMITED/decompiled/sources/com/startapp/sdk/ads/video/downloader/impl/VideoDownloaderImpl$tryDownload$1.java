package com.startapp.sdk.ads.video.downloader.impl;

import androidx.compose.runtime.ComposerKt;
import com.startapp.sdk.internal.li;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoDownloaderImpl", f = "VideoDownloaderImpl.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8}, l = {127, 135, 150, 156, 182, ComposerKt.providerValuesKey, 209, 219, 227}, m = "tryDownload", n = {"task", "task", "cached", "cacheIsValid", "task", "cached", "cacheIsValid", "task", "cached", "task", "cached", "tempFile", "prgFile", "progressFile", "task", "cached", "tempFile", "prgFile", "progressFile", "result", "task", "cached", "tempFile", "prgFile", "progressFile", "result", "task", "cached", "tempFile", "prgFile", "progressFile", "result", "task", "cached", "tempFile", "prgFile", "progressFile", "result"}, nl = {128, 136, 151, 158, 195, ComposerKt.providerMapsKey, 210, 240, 240}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes3.dex */
final class VideoDownloaderImpl$tryDownload$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloaderImpl$tryDownload$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((li) null, this);
    }
}
