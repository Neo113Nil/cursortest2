package com.startapp.sdk.ads.video.downloader.impl;

import com.startapp.sdk.internal.k6;
import com.startapp.sdk.internal.xd;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Sta */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine$downloadParallel$3$jobs$1$1", f = "DownloadEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$downloadParallel$3$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ k6 $chunk;
    final /* synthetic */ HttpURLConnection $chunk0Connection;
    final /* synthetic */ File $destFile;
    final /* synthetic */ int $index;
    final /* synthetic */ xd $progressFileForDownload;
    final /* synthetic */ int $progressFlushBytes;
    final /* synthetic */ URL $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$downloadParallel$3$jobs$1$1(int i, HttpURLConnection httpURLConnection, a aVar, URL url, k6 k6Var, File file, xd xdVar, int i2, Continuation continuation) {
        super(2, continuation);
        this.$index = i;
        this.$chunk0Connection = httpURLConnection;
        this.this$0 = aVar;
        this.$url = url;
        this.$chunk = k6Var;
        this.$destFile = file;
        this.$progressFileForDownload = xdVar;
        this.$progressFlushBytes = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadEngine$downloadParallel$3$jobs$1$1(this.$index, this.$chunk0Connection, this.this$0, this.$url, this.$chunk, this.$destFile, this.$progressFileForDownload, this.$progressFlushBytes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DownloadEngine$downloadParallel$3$jobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HttpURLConnection a2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$index == 0) {
            a2 = this.$chunk0Connection;
        } else {
            a aVar = this.this$0;
            URL url = this.$url;
            k6 k6Var = this.$chunk;
            a2 = a.a(aVar, url, k6Var.f299a, Boxing.boxLong(k6Var.b - 1), (String) null, (String) null, (String) null, 56);
        }
        a.a(this.this$0, this.$destFile, this.$chunk, a2, this.$progressFileForDownload, this.$index, this.$progressFlushBytes);
        return Unit.INSTANCE;
    }
}
