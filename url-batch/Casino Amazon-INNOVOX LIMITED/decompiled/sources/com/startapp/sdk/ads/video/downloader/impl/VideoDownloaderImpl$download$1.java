package com.startapp.sdk.ads.video.downloader.impl;

import com.startapp.sdk.internal.li;
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
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.VideoDownloaderImpl$download$1", f = "VideoDownloaderImpl.kt", i = {0, 1}, l = {332, 91}, m = "invokeSuspend", n = {"$this$withPermit$iv", "$this$withPermit$iv"}, nl = {333, 334}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes3.dex */
final class VideoDownloaderImpl$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ li $task;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloaderImpl$download$1(b bVar, li liVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$task = liVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoDownloaderImpl$download$1(this.this$0, this.$task, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new VideoDownloaderImpl$download$1(this.this$0, this.$task, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Semaphore semaphore;
        li liVar;
        b bVar;
        Semaphore semaphore2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar2 = this.this$0;
                semaphore = bVar2.n;
                liVar = this.$task;
                this.L$0 = semaphore;
                this.L$1 = bVar2;
                this.L$2 = liVar;
                this.label = 1;
                if (semaphore.acquire(this) != coroutine_suspended) {
                    bVar = bVar2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                semaphore2 = (Semaphore) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    semaphore2.release();
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    semaphore = semaphore2;
                    semaphore.release();
                    throw th;
                }
            }
            liVar = (li) this.L$2;
            bVar = (b) this.L$1;
            semaphore = (Semaphore) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = semaphore;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (b.a(bVar, liVar, this) != coroutine_suspended) {
                semaphore2 = semaphore;
                Unit unit2 = Unit.INSTANCE;
                semaphore2.release();
                return unit2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            semaphore.release();
            throw th;
        }
    }
}
