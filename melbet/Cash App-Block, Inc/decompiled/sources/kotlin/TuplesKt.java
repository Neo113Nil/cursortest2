package kotlin;

import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.net.ProtocolException;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt$awaitClose$1;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes.dex */
public abstract class TuplesKt {
    public static volatile Application application;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitClose(ProducerScope producerScope, Function0 function0, Continuation continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        int i;
        try {
            if (continuation instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
                int i2 = produceKt$awaitClose$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    produceKt$awaitClose$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = produceKt$awaitClose$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = produceKt$awaitClose$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (produceKt$awaitClose$1.getContext().get(Job.Key.$$INSTANCE) != producerScope) {
                            a$$ExternalSyntheticBUOutline0.m$1("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        produceKt$awaitClose$1.L$1 = function0;
                        produceKt$awaitClose$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(produceKt$awaitClose$1));
                        cancellableContinuationImpl.initCancellability();
                        ((ProducerCoroutine) producerScope).invokeOnClose(new KotlinExtensions$await$2$1(cancellableContinuationImpl, 3));
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function0 = produceKt$awaitClose$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        Object obj2 = produceKt$awaitClose$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = produceKt$awaitClose$1.label;
    }

    public static ReflectProperties$LazySoftVal lazySoft(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
        if (function0 != null) {
            return new ReflectProperties$LazySoftVal(callableMemberDescriptor, function0);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static Headers of(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Headers cannot be null");
                return null;
            }
            strArr3[i2] = StringsKt.trim(strArr2[i2]).toString();
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr3.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                AppUpdateData.headersCheckName(str);
                AppUpdateData.headersCheckValue(str2, str);
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        return new Headers(strArr3);
    }

    public static StatusLine parse(String str) {
        Protocol protocol;
        int i;
        String str2;
        if (StringsKt__StringsJVMKt.startsWith(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (StringsKt__StringsJVMKt.startsWith(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            if (!StringsKt__StringsJVMKt.startsWith(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer intOrNull = StringsKt.toIntOrNull(str.substring(i, i2));
        if (intOrNull == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int intValue = intOrNull.intValue();
        if (str.length() <= i2) {
            str2 = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            str2 = str.substring(i + 4);
        }
        return new StatusLine(protocol, intValue, str2);
    }

    public static ProducerCoroutine produce$default(CoroutineScope coroutineScope, Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(emptyCoroutineContext, coroutineScope), PapaEvent.Channel$default(0, bufferOverflow, null, 4));
        producerCoroutine.start(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }

    public static final Pair to(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
