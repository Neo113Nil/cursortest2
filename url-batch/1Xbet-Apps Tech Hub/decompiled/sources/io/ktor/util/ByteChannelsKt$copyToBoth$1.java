package io.ktor.util;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.core.ByteReadPacket;
import java.io.Closeable;
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

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1, 1, 1, 2, 2}, l = {59, 61, 62}, m = "invokeSuspend", n = {"$this$use$iv", "it", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$4", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class ByteChannelsKt$copyToBoth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $first;
    final /* synthetic */ ByteWriteChannel $second;
    final /* synthetic */ ByteReadChannel $this_copyToBoth;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$copyToBoth$1(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Continuation<? super ByteChannelsKt$copyToBoth$1> continuation) {
        super(2, continuation);
        this.$this_copyToBoth = byteReadChannel;
        this.$first = byteWriteChannel;
        this.$second = byteWriteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ByteChannelsKt$copyToBoth$1(this.$this_copyToBoth, this.$first, this.$second, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelsKt$copyToBoth$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:(11:6|7|8|9|10|11|12|13|14|15|(2:57|(3:59|51|52)(1:60))(2:21|(1:23)(17:25|26|27|28|29|(1:31)|32|(1:34)|10|11|12|13|14|15|(2:17|19)|57|(0)(0))))(2:73|74))(15:75|76|77|78|32|(0)|10|11|12|13|14|15|(0)|57|(0)(0))|67|68|12|13|14|15|(0)|57|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        r0 = r14;
        r14 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:14:0x00fc, B:15:0x006f, B:17:0x0077, B:19:0x007f, B:21:0x0087, B:57:0x010f, B:60:0x011f), top: B:13:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:14:0x00fc, B:15:0x006f, B:17:0x0077, B:19:0x007f, B:21:0x0087, B:57:0x010f, B:60:0x011f), top: B:13:0x00fc }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e1 -> B:10:0x00e4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ByteChannelsKt$copyToBoth$1 byteChannelsKt$copyToBoth$1;
        Throwable th;
        ByteWriteChannel byteWriteChannel;
        Closeable closeable;
        ByteReadChannel byteReadChannel;
        ByteWriteChannel byteWriteChannel2;
        Object obj2;
        ByteChannelsKt$copyToBoth$1 byteChannelsKt$copyToBoth$12;
        Throwable th2;
        ByteWriteChannel byteWriteChannel3;
        ByteReadChannel byteReadChannel2;
        int i;
        ByteReadPacket byteReadPacket;
        ByteWriteChannel byteWriteChannel4;
        ByteReadPacket copy;
        ByteReadPacket copy2;
        Throwable closedCause;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelsKt$copyToBoth$1 = this;
            if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead()) {
            }
            closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
            if (closedCause == null) {
            }
        } else if (i2 == 1) {
            try {
                ResultKt.throwOnFailure(obj);
                obj2 = coroutine_suspended;
                byteChannelsKt$copyToBoth$12 = this;
                closeable = (Closeable) obj;
                byteWriteChannel4 = byteChannelsKt$copyToBoth$12.$first;
                byteWriteChannel2 = byteChannelsKt$copyToBoth$12.$second;
                byteReadChannel2 = byteChannelsKt$copyToBoth$12.$this_copyToBoth;
                byteReadPacket = (ByteReadPacket) closeable;
                copy2 = byteReadPacket.copy();
                byteChannelsKt$copyToBoth$12.L$0 = closeable;
                byteChannelsKt$copyToBoth$12.L$1 = byteWriteChannel4;
                byteChannelsKt$copyToBoth$12.L$2 = byteWriteChannel2;
                byteChannelsKt$copyToBoth$12.L$3 = byteReadChannel2;
                byteChannelsKt$copyToBoth$12.L$4 = byteReadPacket;
                i = 0;
                byteChannelsKt$copyToBoth$12.I$0 = 0;
                byteChannelsKt$copyToBoth$12.label = 2;
                if (byteWriteChannel4.writePacket(copy2, byteChannelsKt$copyToBoth$12) == obj2) {
                }
                copy = byteReadPacket.copy();
                byteChannelsKt$copyToBoth$12.L$0 = closeable;
                byteChannelsKt$copyToBoth$12.L$1 = byteWriteChannel4;
                byteChannelsKt$copyToBoth$12.L$2 = byteWriteChannel2;
                byteChannelsKt$copyToBoth$12.L$3 = byteReadChannel2;
                byteChannelsKt$copyToBoth$12.L$4 = null;
                byteChannelsKt$copyToBoth$12.I$0 = i;
                byteChannelsKt$copyToBoth$12.label = 3;
                if (byteWriteChannel2.writePacket(copy, byteChannelsKt$copyToBoth$12) == obj2) {
                }
                Unit unit = Unit.INSTANCE;
                byteChannelsKt$copyToBoth$1 = byteChannelsKt$copyToBoth$12;
                coroutine_suspended = obj2;
                closeable.close();
                if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
                if (closedCause == null) {
                }
            } catch (Throwable th3) {
                th2 = th3;
                byteChannelsKt$copyToBoth$12 = this;
                byteChannelsKt$copyToBoth$12.$first.close(th2);
                byteChannelsKt$copyToBoth$12.$second.close(th2);
                ByteWriteChannelKt.close(byteChannelsKt$copyToBoth$12.$first);
                byteWriteChannel3 = byteChannelsKt$copyToBoth$12.$second;
                ByteWriteChannelKt.close(byteWriteChannel3);
                return Unit.INSTANCE;
            }
        } else {
            try {
                if (i2 == 2) {
                    int i3 = this.I$0;
                    ByteReadPacket byteReadPacket2 = (ByteReadPacket) this.L$4;
                    byteReadChannel = (ByteReadChannel) this.L$3;
                    ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) this.L$2;
                    byteWriteChannel = (ByteWriteChannel) this.L$1;
                    Closeable closeable2 = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i = i3;
                        byteReadChannel2 = byteReadChannel;
                        byteWriteChannel4 = byteWriteChannel;
                        obj2 = coroutine_suspended;
                        byteReadPacket = byteReadPacket2;
                        byteWriteChannel2 = byteWriteChannel5;
                        closeable = closeable2;
                        byteChannelsKt$copyToBoth$12 = this;
                    } catch (Throwable th4) {
                        th = th4;
                        obj2 = coroutine_suspended;
                        byteWriteChannel2 = byteWriteChannel5;
                        closeable = closeable2;
                    }
                    copy = byteReadPacket.copy();
                    byteChannelsKt$copyToBoth$12.L$0 = closeable;
                    byteChannelsKt$copyToBoth$12.L$1 = byteWriteChannel4;
                    byteChannelsKt$copyToBoth$12.L$2 = byteWriteChannel2;
                    byteChannelsKt$copyToBoth$12.L$3 = byteReadChannel2;
                    byteChannelsKt$copyToBoth$12.L$4 = null;
                    byteChannelsKt$copyToBoth$12.I$0 = i;
                    byteChannelsKt$copyToBoth$12.label = 3;
                    if (byteWriteChannel2.writePacket(copy, byteChannelsKt$copyToBoth$12) == obj2) {
                    }
                    Unit unit2 = Unit.INSTANCE;
                    byteChannelsKt$copyToBoth$1 = byteChannelsKt$copyToBoth$12;
                    coroutine_suspended = obj2;
                    closeable.close();
                    if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead()) {
                    }
                    closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
                    if (closedCause == null) {
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ByteReadChannel byteReadChannel3 = (ByteReadChannel) this.L$3;
                    byteWriteChannel2 = (ByteWriteChannel) this.L$2;
                    byteWriteChannel4 = (ByteWriteChannel) this.L$1;
                    closeable = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        byteReadChannel2 = byteReadChannel3;
                        obj2 = coroutine_suspended;
                        byteChannelsKt$copyToBoth$12 = this;
                    } catch (Throwable th5) {
                        th = th5;
                        byteWriteChannel = byteWriteChannel4;
                        byteReadChannel = byteReadChannel3;
                        obj2 = coroutine_suspended;
                    }
                    try {
                    } catch (Throwable th6) {
                        ByteWriteChannel byteWriteChannel6 = byteWriteChannel4;
                        byteReadChannel = byteReadChannel2;
                        th = th6;
                        byteWriteChannel = byteWriteChannel6;
                    }
                    Unit unit22 = Unit.INSTANCE;
                    byteChannelsKt$copyToBoth$1 = byteChannelsKt$copyToBoth$12;
                    coroutine_suspended = obj2;
                    closeable.close();
                    if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead() && (!byteChannelsKt$copyToBoth$1.$first.isClosedForWrite() || !byteChannelsKt$copyToBoth$1.$second.isClosedForWrite())) {
                        byteChannelsKt$copyToBoth$1.L$0 = null;
                        byteChannelsKt$copyToBoth$1.L$1 = null;
                        byteChannelsKt$copyToBoth$1.L$2 = null;
                        byteChannelsKt$copyToBoth$1.L$3 = null;
                        byteChannelsKt$copyToBoth$1.L$4 = null;
                        byteChannelsKt$copyToBoth$1.label = 1;
                        Object readRemaining = byteChannelsKt$copyToBoth$1.$this_copyToBoth.readRemaining(4096L, byteChannelsKt$copyToBoth$1);
                        if (readRemaining == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj3 = coroutine_suspended;
                        byteChannelsKt$copyToBoth$12 = byteChannelsKt$copyToBoth$1;
                        obj = readRemaining;
                        obj2 = obj3;
                        try {
                            closeable = (Closeable) obj;
                            byteWriteChannel4 = byteChannelsKt$copyToBoth$12.$first;
                            byteWriteChannel2 = byteChannelsKt$copyToBoth$12.$second;
                            byteReadChannel2 = byteChannelsKt$copyToBoth$12.$this_copyToBoth;
                            byteReadPacket = (ByteReadPacket) closeable;
                            copy2 = byteReadPacket.copy();
                            byteChannelsKt$copyToBoth$12.L$0 = closeable;
                            byteChannelsKt$copyToBoth$12.L$1 = byteWriteChannel4;
                            byteChannelsKt$copyToBoth$12.L$2 = byteWriteChannel2;
                            byteChannelsKt$copyToBoth$12.L$3 = byteReadChannel2;
                            byteChannelsKt$copyToBoth$12.L$4 = byteReadPacket;
                            i = 0;
                            byteChannelsKt$copyToBoth$12.I$0 = 0;
                            byteChannelsKt$copyToBoth$12.label = 2;
                            if (byteWriteChannel4.writePacket(copy2, byteChannelsKt$copyToBoth$12) == obj2) {
                                return obj2;
                            }
                            copy = byteReadPacket.copy();
                            byteChannelsKt$copyToBoth$12.L$0 = closeable;
                            byteChannelsKt$copyToBoth$12.L$1 = byteWriteChannel4;
                            byteChannelsKt$copyToBoth$12.L$2 = byteWriteChannel2;
                            byteChannelsKt$copyToBoth$12.L$3 = byteReadChannel2;
                            byteChannelsKt$copyToBoth$12.L$4 = null;
                            byteChannelsKt$copyToBoth$12.I$0 = i;
                            byteChannelsKt$copyToBoth$12.label = 3;
                            if (byteWriteChannel2.writePacket(copy, byteChannelsKt$copyToBoth$12) == obj2) {
                                return obj2;
                            }
                            Unit unit222 = Unit.INSTANCE;
                            byteChannelsKt$copyToBoth$1 = byteChannelsKt$copyToBoth$12;
                            coroutine_suspended = obj2;
                            closeable.close();
                            if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead()) {
                            }
                            closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
                            if (closedCause == null) {
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            try {
                                byteChannelsKt$copyToBoth$12.$first.close(th2);
                                byteChannelsKt$copyToBoth$12.$second.close(th2);
                                ByteWriteChannelKt.close(byteChannelsKt$copyToBoth$12.$first);
                                byteWriteChannel3 = byteChannelsKt$copyToBoth$12.$second;
                                ByteWriteChannelKt.close(byteWriteChannel3);
                                return Unit.INSTANCE;
                            } catch (Throwable th8) {
                                ByteWriteChannelKt.close(byteChannelsKt$copyToBoth$12.$first);
                                ByteWriteChannelKt.close(byteChannelsKt$copyToBoth$12.$second);
                                throw th8;
                            }
                        }
                    } else {
                        closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
                        if (closedCause == null) {
                            throw closedCause;
                        }
                        ByteWriteChannelKt.close(byteChannelsKt$copyToBoth$1.$first);
                        byteWriteChannel3 = byteChannelsKt$copyToBoth$1.$second;
                        ByteWriteChannelKt.close(byteWriteChannel3);
                        return Unit.INSTANCE;
                    }
                }
                byteReadChannel.cancel(th);
                byteWriteChannel.close(th);
                Boxing.boxBoolean(byteWriteChannel2.close(th));
                byteChannelsKt$copyToBoth$1 = byteChannelsKt$copyToBoth$12;
                coroutine_suspended = obj2;
                closeable.close();
                if (byteChannelsKt$copyToBoth$1.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = byteChannelsKt$copyToBoth$1.$this_copyToBoth.getClosedCause();
                if (closedCause == null) {
                }
            } finally {
            }
            byteChannelsKt$copyToBoth$12 = this;
        }
    }
}
