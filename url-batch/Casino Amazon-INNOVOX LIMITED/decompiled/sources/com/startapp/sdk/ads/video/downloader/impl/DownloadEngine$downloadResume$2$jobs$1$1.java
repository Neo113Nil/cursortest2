package com.startapp.sdk.ads.video.downloader.impl;

import com.startapp.sdk.internal.k6;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.xd;
import java.io.File;
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
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine$downloadResume$2$jobs$1$1", f = "DownloadEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$downloadResume$2$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ vd $chunk;
    final /* synthetic */ File $destFile;
    final /* synthetic */ int $index;
    final /* synthetic */ xd $progressFile;
    final /* synthetic */ int $progressFlushBytes;
    final /* synthetic */ URL $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$downloadResume$2$jobs$1$1(vd vdVar, a aVar, URL url, xd xdVar, File file, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$chunk = vdVar;
        this.this$0 = aVar;
        this.$url = url;
        this.$progressFile = xdVar;
        this.$destFile = file;
        this.$index = i;
        this.$progressFlushBytes = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadEngine$downloadResume$2$jobs$1$1(this.$chunk, this.this$0, this.$url, this.$progressFile, this.$destFile, this.$index, this.$progressFlushBytes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DownloadEngine$downloadResume$2$jobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        vd vdVar = this.$chunk;
        a.a(this.this$0, this.$destFile, new k6(r2.f468a, r2.b, this.$chunk.c), a.a(this.this$0, this.$url, vdVar.f468a + vdVar.c, Boxing.boxLong(vdVar.b - 1), this.$progressFile.f497a, (String) null, (String) null, 48), this.$progressFile, this.$index, this.$progressFlushBytes);
        return Unit.INSTANCE;
    }
}
