package io.ktor.client.request.forms;

import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterSessionKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputArraysKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: FormDataContent.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"RN_BYTES", "", "generateBoundary", "", "copyTo", "", "Lio/ktor/utils/io/core/Input;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/core/Input;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FormDataContentKt {
    private static final byte[] RN_BYTES;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateBoundary() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            String num = Integer.toString(Random.INSTANCE.nextInt(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(num);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return StringsKt.take(sb2, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d8 -> B:18:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(Input input, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        FormDataContentKt$copyTo$1 formDataContentKt$copyTo$1;
        Object coroutine_suspended;
        int i;
        ByteWriteChannel byteWriteChannel2;
        Input input2;
        Object obj;
        ByteWriteChannel byteWriteChannel3;
        Buffer buffer;
        int i2;
        Input input3 = input;
        try {
            try {
                if (continuation instanceof FormDataContentKt$copyTo$1) {
                    formDataContentKt$copyTo$1 = (FormDataContentKt$copyTo$1) continuation;
                    if ((formDataContentKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                        formDataContentKt$copyTo$1.label -= Integer.MIN_VALUE;
                        Object obj2 = formDataContentKt$copyTo$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = formDataContentKt$copyTo$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            if (input3 instanceof ByteReadPacket) {
                                formDataContentKt$copyTo$1.label = 1;
                                if (byteWriteChannel.writePacket((ByteReadPacket) input3, formDataContentKt$copyTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            byteWriteChannel2 = byteWriteChannel;
                            if (input3.getEndOfInput()) {
                            }
                        } else {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            if (i == 2) {
                                ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) formDataContentKt$copyTo$1.L$2;
                                ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) formDataContentKt$copyTo$1.L$1;
                                Input input4 = (Input) formDataContentKt$copyTo$1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                input2 = input4;
                                byteWriteChannel2 = byteWriteChannel4;
                                byteWriteChannel3 = byteWriteChannel5;
                                obj = obj2;
                            } else {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Throwable th = (Throwable) formDataContentKt$copyTo$1.L$0;
                                    ResultKt.throwOnFailure(obj2);
                                    throw th;
                                }
                                ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) formDataContentKt$copyTo$1.L$1;
                                Input input5 = (Input) formDataContentKt$copyTo$1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                byteWriteChannel2 = byteWriteChannel6;
                                input3 = input5;
                                if (input3.getEndOfInput()) {
                                    return Unit.INSTANCE;
                                }
                                formDataContentKt$copyTo$1.L$0 = input3;
                                formDataContentKt$copyTo$1.L$1 = byteWriteChannel2;
                                formDataContentKt$copyTo$1.L$2 = byteWriteChannel2;
                                formDataContentKt$copyTo$1.label = 2;
                                obj = WriterSessionKt.requestWriteBuffer(byteWriteChannel2, 1, formDataContentKt$copyTo$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                input2 = input3;
                                byteWriteChannel3 = byteWriteChannel2;
                            }
                        }
                        buffer = (Buffer) obj;
                        if (buffer == null) {
                            buffer = Buffer.INSTANCE.getEmpty();
                        }
                        ByteBuffer memory = buffer.getMemory();
                        long writePosition = buffer.getWritePosition();
                        i2 = (int) InputArraysKt.m503readAvailableUAd2zVI(input2, memory, writePosition, buffer.getLimit() - writePosition);
                        buffer.commitWritten(i2);
                        Integer boxInt = Boxing.boxInt(i2);
                        formDataContentKt$copyTo$1.L$0 = input2;
                        formDataContentKt$copyTo$1.L$1 = byteWriteChannel3;
                        formDataContentKt$copyTo$1.L$2 = boxInt;
                        formDataContentKt$copyTo$1.label = 3;
                        if (WriterSessionKt.completeWriting(byteWriteChannel2, buffer, i2, formDataContentKt$copyTo$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel2 = byteWriteChannel3;
                        input3 = input2;
                        if (input3.getEndOfInput()) {
                        }
                    }
                }
                buffer = (Buffer) obj;
                if (buffer == null) {
                }
                ByteBuffer memory2 = buffer.getMemory();
                long writePosition2 = buffer.getWritePosition();
                buffer.commitWritten(i2);
                Integer boxInt2 = Boxing.boxInt(i2);
                formDataContentKt$copyTo$1.L$0 = input2;
                formDataContentKt$copyTo$1.L$1 = byteWriteChannel3;
                formDataContentKt$copyTo$1.L$2 = boxInt2;
                formDataContentKt$copyTo$1.label = 3;
                if (WriterSessionKt.completeWriting(byteWriteChannel2, buffer, i2, formDataContentKt$copyTo$1) != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                th = th2;
                formDataContentKt$copyTo$1.L$0 = th;
                formDataContentKt$copyTo$1.L$1 = null;
                formDataContentKt$copyTo$1.L$2 = null;
                formDataContentKt$copyTo$1.label = 4;
                if (WriterSessionKt.completeWriting(byteWriteChannel2, buffer, i2, formDataContentKt$copyTo$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
            i2 = (int) InputArraysKt.m503readAvailableUAd2zVI(input2, memory2, writePosition2, buffer.getLimit() - writePosition2);
        } catch (Throwable th3) {
            th = th3;
            i2 = 0;
        }
        formDataContentKt$copyTo$1 = new FormDataContentKt$copyTo$1(continuation);
        Object obj22 = formDataContentKt$copyTo$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formDataContentKt$copyTo$1.label;
        if (i != 0) {
        }
    }

    static {
        byte[] encodeToByteArray;
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            encodeToByteArray = StringsKt.encodeToByteArray("\r\n");
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
            encodeToByteArray = CharsetJVMKt.encodeToByteArray(newEncoder, "\r\n", 0, 2);
        }
        RN_BYTES = encodeToByteArray;
    }
}
