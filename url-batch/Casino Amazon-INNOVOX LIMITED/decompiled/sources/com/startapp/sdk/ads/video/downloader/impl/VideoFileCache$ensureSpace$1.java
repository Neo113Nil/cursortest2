package com.startapp.sdk.ads.video.downloader.impl;

import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoFileCache", f = "VideoFileCache.kt", i = {0, 0, 0}, l = {ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "ensureSpace", n = {"excludeFileId", "$this$withLock_u24default$iv", "requiredBytes"}, nl = {251}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class VideoFileCache$ensureSpace$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFileCache$ensureSpace$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, null, this);
    }
}
