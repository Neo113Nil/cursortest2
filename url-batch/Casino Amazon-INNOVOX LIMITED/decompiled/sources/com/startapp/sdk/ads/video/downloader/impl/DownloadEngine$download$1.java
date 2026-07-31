package com.startapp.sdk.ads.video.downloader.impl;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine", f = "DownloadEngine.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {WebSocketProtocol.PAYLOAD_SHORT, 165}, m = "download", n = {ImagesContract.URL, "destFile", "networkType", "progressFile", "ifNoneMatch", "ifModifiedSince", "onCreateProgressFile", "progressFlushBytes", ImagesContract.URL, "destFile", "networkType", "progressFile", "ifNoneMatch", "ifModifiedSince", "onCreateProgressFile", "serverInfo", "conn", "progressFlushBytes", "responseCode", "parallelChunks"}, nl = {129, 167}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$download$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$download$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, 0, null, null, null, this);
    }
}
