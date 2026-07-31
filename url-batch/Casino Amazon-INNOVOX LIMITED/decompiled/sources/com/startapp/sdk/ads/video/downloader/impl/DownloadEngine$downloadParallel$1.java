package com.startapp.sdk.ads.video.downloader.impl;

import com.google.android.gms.common.internal.ImagesContract;
import com.startapp.sdk.internal.r6;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: Sta */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine", f = "DownloadEngine.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {344}, m = "downloadParallel", n = {ImagesContract.URL, "destFile", "chunk0Connection", "serverInfo", "onCreateProgressFile", "chunks", "chunkProgressList", "progressFileForDownload", "parallelChunks", "progressFlushBytes", "contentLength", "chunkSize"}, nl = {363}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "J$0", "J$1"}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$downloadParallel$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$downloadParallel$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((URL) null, (File) null, (HttpURLConnection) null, (r6) null, 0, 0, (Function3) null, this);
    }
}
