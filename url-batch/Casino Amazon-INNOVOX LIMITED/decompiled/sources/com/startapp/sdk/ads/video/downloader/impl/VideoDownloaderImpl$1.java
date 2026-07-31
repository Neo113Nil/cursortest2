package com.startapp.sdk.ads.video.downloader.impl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* compiled from: Sta */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoDownloaderImpl$1", f = "VideoDownloaderImpl.kt", i = {0}, l = {332}, m = "invokeSuspend", n = {"$this$withPermit$iv"}, nl = {333}, s = {"L$0"}, v = 2)
/* loaded from: classes3.dex */
final class VideoDownloaderImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloaderImpl$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoDownloaderImpl$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new VideoDownloaderImpl$1(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Semaphore semaphore;
        b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar2 = this.this$0;
            semaphore = bVar2.n;
            this.L$0 = semaphore;
            this.L$1 = bVar2;
            this.label = 1;
            if (semaphore.acquire(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) this.L$1;
            semaphore = (Semaphore) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            bVar.f.a();
            return Unit.INSTANCE;
        } finally {
            semaphore.release();
        }
    }
}
