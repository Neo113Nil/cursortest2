package io.ktor.util;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: Deflater.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u001a3\u0010\u0013\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0019\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a.\u0010\u0019\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u0007*\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!\u001a\u0014\u0010\"\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u001a\u0014\u0010#\u001a\u00020\u0007*\u00020 2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"GZIP_HEADER_PADDING", "", "getGZIP_HEADER_PADDING", "()[B", "GZIP_MAGIC", "", "deflateTo", "", "Lio/ktor/utils/io/ByteReadChannel;", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/ByteWriteChannel;", "gzip", "", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/zip/Deflater;", "outBuffer", "deflateWhile", "deflater", "buffer", "predicate", "Lkotlin/Function0;", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deflated", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "putGzipHeader", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putGzipTrailer", "crc", "Ljava/util/zip/Checksum;", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Checksum;Ljava/util/zip/Deflater;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInputBuffer", "updateKeepPosition", "ktor-utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeflaterKt {
    private static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    private static final void deflateTo(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    private static final void setInputBuffer(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(Checksum checksum, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(checksum, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipHeader(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$1;
        Object coroutine_suspended;
        int i;
        byte[] bArr;
        if (continuation instanceof DeflaterKt$putGzipHeader$1) {
            deflaterKt$putGzipHeader$1 = (DeflaterKt$putGzipHeader$1) continuation;
            if ((deflaterKt$putGzipHeader$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipHeader$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$putGzipHeader$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipHeader$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    short reverseBytes = Short.reverseBytes((short) (-29921));
                    deflaterKt$putGzipHeader$1.L$0 = byteWriteChannel;
                    deflaterKt$putGzipHeader$1.label = 1;
                    if (byteWriteChannel.writeShort(reverseBytes, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipHeader$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bArr = GZIP_HEADER_PADDING;
                        deflaterKt$putGzipHeader$1.L$0 = null;
                        deflaterKt$putGzipHeader$1.label = 3;
                        if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipHeader$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                deflaterKt$putGzipHeader$1.L$0 = byteWriteChannel;
                deflaterKt$putGzipHeader$1.label = 2;
                if (byteWriteChannel.writeByte((byte) 8, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bArr = GZIP_HEADER_PADDING;
                deflaterKt$putGzipHeader$1.L$0 = null;
                deflaterKt$putGzipHeader$1.label = 3;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        deflaterKt$putGzipHeader$1 = new DeflaterKt$putGzipHeader$1(continuation);
        Object obj2 = deflaterKt$putGzipHeader$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipHeader$1.label;
        if (i != 0) {
        }
        deflaterKt$putGzipHeader$1.L$0 = byteWriteChannel;
        deflaterKt$putGzipHeader$1.label = 2;
        if (byteWriteChannel.writeByte((byte) 8, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
        }
        bArr = GZIP_HEADER_PADDING;
        deflaterKt$putGzipHeader$1.L$0 = null;
        deflaterKt$putGzipHeader$1.label = 3;
        if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, deflaterKt$putGzipHeader$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipTrailer(ByteWriteChannel byteWriteChannel, Checksum checksum, Deflater deflater, Continuation<? super Unit> continuation) {
        DeflaterKt$putGzipTrailer$1 deflaterKt$putGzipTrailer$1;
        Object coroutine_suspended;
        int i;
        int reverseBytes;
        if (continuation instanceof DeflaterKt$putGzipTrailer$1) {
            deflaterKt$putGzipTrailer$1 = (DeflaterKt$putGzipTrailer$1) continuation;
            if ((deflaterKt$putGzipTrailer$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipTrailer$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$putGzipTrailer$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$putGzipTrailer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int reverseBytes2 = Integer.reverseBytes((int) checksum.getValue());
                    deflaterKt$putGzipTrailer$1.L$0 = byteWriteChannel;
                    deflaterKt$putGzipTrailer$1.L$1 = deflater;
                    deflaterKt$putGzipTrailer$1.label = 1;
                    if (byteWriteChannel.writeInt(reverseBytes2, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    deflater = (Deflater) deflaterKt$putGzipTrailer$1.L$1;
                    byteWriteChannel = (ByteWriteChannel) deflaterKt$putGzipTrailer$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                reverseBytes = Integer.reverseBytes(deflater.getTotalIn());
                deflaterKt$putGzipTrailer$1.L$0 = null;
                deflaterKt$putGzipTrailer$1.L$1 = null;
                deflaterKt$putGzipTrailer$1.label = 2;
                if (byteWriteChannel.writeInt(reverseBytes, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        deflaterKt$putGzipTrailer$1 = new DeflaterKt$putGzipTrailer$1(continuation);
        Object obj2 = deflaterKt$putGzipTrailer$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$putGzipTrailer$1.label;
        if (i != 0) {
        }
        reverseBytes = Integer.reverseBytes(deflater.getTotalIn());
        deflaterKt$putGzipTrailer$1.L$0 = null;
        deflaterKt$putGzipTrailer$1.L$1 = null;
        deflaterKt$putGzipTrailer$1.label = 2;
        if (byteWriteChannel.writeInt(reverseBytes, deflaterKt$putGzipTrailer$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deflateWhile(ByteWriteChannel byteWriteChannel, Deflater deflater, ByteBuffer byteBuffer, Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        DeflaterKt$deflateWhile$1 deflaterKt$deflateWhile$1;
        int i;
        if (continuation instanceof DeflaterKt$deflateWhile$1) {
            deflaterKt$deflateWhile$1 = (DeflaterKt$deflateWhile$1) continuation;
            if ((deflaterKt$deflateWhile$1.label & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateWhile$1.label -= Integer.MIN_VALUE;
                Object obj = deflaterKt$deflateWhile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deflaterKt$deflateWhile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function0<Boolean> function02 = (Function0) deflaterKt$deflateWhile$1.L$3;
                    ByteBuffer byteBuffer2 = (ByteBuffer) deflaterKt$deflateWhile$1.L$2;
                    Deflater deflater2 = (Deflater) deflaterKt$deflateWhile$1.L$1;
                    ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) deflaterKt$deflateWhile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function0 = function02;
                    byteWriteChannel = byteWriteChannel2;
                    byteBuffer = byteBuffer2;
                    deflater = deflater2;
                }
                while (function0.invoke().booleanValue()) {
                    byteBuffer.clear();
                    deflateTo(deflater, byteBuffer);
                    byteBuffer.flip();
                    deflaterKt$deflateWhile$1.L$0 = byteWriteChannel;
                    deflaterKt$deflateWhile$1.L$1 = deflater;
                    deflaterKt$deflateWhile$1.L$2 = byteBuffer;
                    deflaterKt$deflateWhile$1.L$3 = function0;
                    deflaterKt$deflateWhile$1.label = 1;
                    if (byteWriteChannel.writeFully(byteBuffer, deflaterKt$deflateWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        deflaterKt$deflateWhile$1 = new DeflaterKt$deflateWhile$1(continuation);
        Object obj2 = deflaterKt$deflateWhile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deflaterKt$deflateWhile$1.label;
        if (i != 0) {
        }
        while (function0.invoke().booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object deflateTo(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, boolean r19, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.deflateTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, boolean, io.ktor.utils.io.pool.ObjectPool, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object deflateTo$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z, objectPool, continuation);
    }

    public static /* synthetic */ ByteReadChannel deflated$default(ByteReadChannel byteReadChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteReadChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    public static final ByteReadChannel deflated(ByteReadChannel byteReadChannel, boolean z, ObjectPool<ByteBuffer> pool, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new DeflaterKt$deflated$1(byteReadChannel, z, pool, null)).getChannel();
    }

    public static /* synthetic */ ByteWriteChannel deflated$default(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteWriteChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    public static final ByteWriteChannel deflated(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> pool, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.reader((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new DeflaterKt$deflated$2(byteWriteChannel, z, pool, null)).getChannel();
    }
}
