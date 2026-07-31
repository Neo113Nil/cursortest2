package com.startapp.sdk.ads.video.downloader.impl;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine", f = "DownloadEngine.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {222}, m = "downloadResume", n = {ImagesContract.URL, "destFile", "progressFile", "chunks", "incompleteIndexed", "progressFlushBytes", "contentLength"}, nl = {245}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0"}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$downloadResume$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$downloadResume$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, 0, this);
    }
}
