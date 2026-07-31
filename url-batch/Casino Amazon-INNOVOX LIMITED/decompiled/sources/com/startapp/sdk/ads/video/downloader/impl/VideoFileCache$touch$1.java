package com.startapp.sdk.ads.video.downloader.impl;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoFileCache", f = "VideoFileCache.kt", i = {0, 0}, l = {ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = PointerEventHelper.POINTER_TYPE_TOUCH, n = {"fileId", "$this$withLock_u24default$iv"}, nl = {251}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes3.dex */
final class VideoFileCache$touch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFileCache$touch$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
