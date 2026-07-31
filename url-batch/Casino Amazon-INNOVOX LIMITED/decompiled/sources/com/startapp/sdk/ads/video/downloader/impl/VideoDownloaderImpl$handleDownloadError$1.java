package com.startapp.sdk.ads.video.downloader.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoDownloaderImpl", f = "VideoDownloaderImpl.kt", i = {0, 0, 0, 0, 0}, l = {262}, m = "handleDownloadError", n = {"task", "cached", "tempFile", "prgFile", "recoverableError"}, nl = {263}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
/* loaded from: classes3.dex */
final class VideoDownloaderImpl$handleDownloadError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloaderImpl$handleDownloadError$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, false, this);
    }
}
