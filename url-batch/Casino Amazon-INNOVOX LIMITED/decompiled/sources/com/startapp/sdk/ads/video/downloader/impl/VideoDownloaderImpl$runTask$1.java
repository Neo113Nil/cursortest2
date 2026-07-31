package com.startapp.sdk.ads.video.downloader.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoDownloaderImpl", f = "VideoDownloaderImpl.kt", i = {0, 0, 1, 1, 1}, l = {101, 103}, m = "runTask", n = {"task", "deadline", "task", "deadline", "remaining"}, nl = {102, 104}, s = {"L$0", "J$0", "L$0", "J$0", "J$1"}, v = 2)
/* loaded from: classes3.dex */
final class VideoDownloaderImpl$runTask$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloaderImpl$runTask$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, this);
    }
}
