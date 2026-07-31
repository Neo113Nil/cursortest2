package com.startapp.sdk.ads.video.downloader.impl;

import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoFileCache", f = "VideoFileCache.kt", i = {0, 0, 0, 0, 0, 0}, l = {ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "commit", n = {"fileId", "tempFile", "etag", "lastModified", "$this$withLock_u24default$iv", "sizeBytes"}, nl = {251}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0"}, v = 2)
/* loaded from: classes3.dex */
final class VideoFileCache$commit$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFileCache$commit$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0L, null, null, this);
    }
}
