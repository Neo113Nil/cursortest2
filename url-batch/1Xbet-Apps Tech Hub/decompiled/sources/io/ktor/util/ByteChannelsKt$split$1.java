package io.ktor.util;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.core.ByteReadPacket;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 1, 1, 1}, l = {25, 29}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class ByteChannelsKt$split$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteChannel $first;
    final /* synthetic */ ByteChannel $second;
    final /* synthetic */ ByteReadChannel $this_split;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$split$1(ByteReadChannel byteReadChannel, ByteChannel byteChannel, ByteChannel byteChannel2, Continuation<? super ByteChannelsKt$split$1> continuation) {
        super(2, continuation);
        this.$this_split = byteReadChannel;
        this.$first = byteChannel;
        this.$second = byteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteChannelsKt$split$1 byteChannelsKt$split$1 = new ByteChannelsKt$split$1(this.$this_split, this.$first, this.$second, continuation);
        byteChannelsKt$split$1.L$0 = obj;
        return byteChannelsKt$split$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelsKt$split$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00ea, TryCatch #5 {all -> 0x00ea, blocks: (B:15:0x0045, B:17:0x004d, B:21:0x0061, B:35:0x00d1, B:41:0x00d2, B:46:0x00e9, B:39:0x00cf, B:38:0x00cc, B:31:0x00c6), top: B:14:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #5 {all -> 0x00ea, blocks: (B:15:0x0045, B:17:0x004d, B:21:0x0061, B:35:0x00d1, B:41:0x00d2, B:46:0x00e9, B:39:0x00cf, B:38:0x00cc, B:31:0x00c6), top: B:14:0x0045, inners: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ae -> B:9:0x00b4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ByteChannelsKt$split$1 byteChannelsKt$split$1;
        Throwable th;
        Throwable th2;
        Object obj2;
        Closeable closeable;
        Deferred async$default;
        Deferred async$default2;
        Object awaitAll;
        ByteChannelsKt$split$1 byteChannelsKt$split$12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            byteChannelsKt$split$1 = this;
            if (!byteChannelsKt$split$1.$this_split.isClosedForRead()) {
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                byteChannelsKt$split$1 = this;
                closeable = (Closeable) obj2;
                ByteChannel byteChannel = byteChannelsKt$split$1.$first;
                ByteChannel byteChannel2 = byteChannelsKt$split$1.$second;
                ByteReadPacket byteReadPacket = (ByteReadPacket) closeable;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$1(byteChannel, byteReadPacket, null), 3, null);
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$2(byteChannel2, byteReadPacket, null), 3, null);
                List listOf = kotlin.collections.CollectionsKt.listOf((Object[]) new Deferred[]{async$default, async$default2});
                byteChannelsKt$split$1.L$0 = coroutineScope;
                byteChannelsKt$split$1.L$1 = closeable;
                byteChannelsKt$split$1.I$0 = 0;
                byteChannelsKt$split$1.label = 2;
                awaitAll = AwaitKt.awaitAll(listOf, byteChannelsKt$split$1);
                if (awaitAll != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                th = th3;
                byteChannelsKt$split$1 = this;
                byteChannelsKt$split$1.$this_split.cancel(th);
                byteChannelsKt$split$1.$first.cancel(th);
                byteChannelsKt$split$1.$second.cancel(th);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Closeable closeable2 = (Closeable) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                awaitAll = obj;
                byteChannelsKt$split$12 = this;
            } catch (Throwable th4) {
                th2 = th4;
                byteChannelsKt$split$1 = this;
                try {
                    closeable2.close();
                    throw th2;
                } finally {
                    throw th2;
                }
            }
            try {
                try {
                    try {
                        closeable2.close();
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            byteChannelsKt$split$1.$this_split.cancel(th);
                            byteChannelsKt$split$1.$first.cancel(th);
                            byteChannelsKt$split$1.$second.cancel(th);
                            return Unit.INSTANCE;
                        } finally {
                            ByteWriteChannelKt.close(byteChannelsKt$split$1.$first);
                            ByteWriteChannelKt.close(byteChannelsKt$split$1.$second);
                        }
                    }
                    coroutineScope = coroutineScope2;
                    byteChannelsKt$split$1 = byteChannelsKt$split$12;
                } catch (Throwable th6) {
                    th = th6;
                    byteChannelsKt$split$1 = byteChannelsKt$split$12;
                    byteChannelsKt$split$1.$this_split.cancel(th);
                    byteChannelsKt$split$1.$first.cancel(th);
                    byteChannelsKt$split$1.$second.cancel(th);
                    return Unit.INSTANCE;
                }
                if (!byteChannelsKt$split$1.$this_split.isClosedForRead()) {
                    try {
                        byteChannelsKt$split$1.L$0 = coroutineScope;
                        byteChannelsKt$split$1.L$1 = null;
                        byteChannelsKt$split$1.label = 1;
                        obj2 = byteChannelsKt$split$1.$this_split.readRemaining(4096L, byteChannelsKt$split$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ByteReadPacket byteReadPacket2 = (ByteReadPacket) closeable;
                        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$1(byteChannel, byteReadPacket2, null), 3, null);
                        async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$2(byteChannel2, byteReadPacket2, null), 3, null);
                        List listOf2 = kotlin.collections.CollectionsKt.listOf((Object[]) new Deferred[]{async$default, async$default2});
                        byteChannelsKt$split$1.L$0 = coroutineScope;
                        byteChannelsKt$split$1.L$1 = closeable;
                        byteChannelsKt$split$1.I$0 = 0;
                        byteChannelsKt$split$1.label = 2;
                        awaitAll = AwaitKt.awaitAll(listOf2, byteChannelsKt$split$1);
                        if (awaitAll != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ByteChannelsKt$split$1 byteChannelsKt$split$13 = byteChannelsKt$split$1;
                        coroutineScope2 = coroutineScope;
                        closeable2 = closeable;
                        byteChannelsKt$split$12 = byteChannelsKt$split$13;
                        closeable2.close();
                        coroutineScope = coroutineScope2;
                        byteChannelsKt$split$1 = byteChannelsKt$split$12;
                        if (!byteChannelsKt$split$1.$this_split.isClosedForRead()) {
                            Throwable closedCause = byteChannelsKt$split$1.$this_split.getClosedCause();
                            if (closedCause != null) {
                                throw closedCause;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        closeable2 = closeable;
                        closeable2.close();
                        throw th2;
                    }
                    closeable = (Closeable) obj2;
                    ByteChannel byteChannel3 = byteChannelsKt$split$1.$first;
                    ByteChannel byteChannel22 = byteChannelsKt$split$1.$second;
                }
            } catch (Throwable th8) {
                th2 = th8;
                byteChannelsKt$split$1 = byteChannelsKt$split$12;
                closeable2.close();
                throw th2;
            }
        }
    }
}
