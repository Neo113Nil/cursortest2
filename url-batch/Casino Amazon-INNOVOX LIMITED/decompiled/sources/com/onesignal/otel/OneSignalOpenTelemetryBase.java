package com.onesignal.otel;

import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalOpenTelemetry.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\rJ\u000e\u0010\u0010\u001a\u00020\nH\u0084@¢\u0006\u0002\u0010\rJ\u001c\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H$J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onesignal/otel/OneSignalOpenTelemetryBase;", "Lcom/onesignal/otel/IOtelOpenTelemetry;", "osTopLevelFields", "Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;", "osPerEventFields", "Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;", "(Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;)V", "lock", "", "sdkCachedValue", "Lio/opentelemetry/sdk/OpenTelemetrySdk;", "forceFlush", "Lio/opentelemetry/sdk/common/CompletableResultCode;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogger", "Lio/opentelemetry/api/logs/LogRecordBuilder;", "getSdk", "getSdkInstance", "attributes", "", "", "shutdown", "", "Companion", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OneSignalOpenTelemetryBase implements IOtelOpenTelemetry {
    private static final long FORCE_FLUSH_TIMEOUT_SECONDS = 10;
    private final Object lock;
    private final OtelFieldsPerEvent osPerEventFields;
    private final OtelFieldsTopLevel osTopLevelFields;
    private OpenTelemetrySdk sdkCachedValue;

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public Object forceFlush(Continuation<? super CompletableResultCode> continuation) {
        return forceFlush$suspendImpl(this, continuation);
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public Object getLogger(Continuation<? super LogRecordBuilder> continuation) {
        return getLogger$suspendImpl(this, continuation);
    }

    protected abstract OpenTelemetrySdk getSdkInstance(Map<String, String> attributes);

    public OneSignalOpenTelemetryBase(OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.osTopLevelFields = osTopLevelFields;
        this.osPerEventFields = osPerEventFields;
        this.lock = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object getSdk(Continuation<? super OpenTelemetrySdk> continuation) {
        OneSignalOpenTelemetryBase$getSdk$1 oneSignalOpenTelemetryBase$getSdk$1;
        int i;
        OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase;
        if (continuation instanceof OneSignalOpenTelemetryBase$getSdk$1) {
            oneSignalOpenTelemetryBase$getSdk$1 = (OneSignalOpenTelemetryBase$getSdk$1) continuation;
            if ((oneSignalOpenTelemetryBase$getSdk$1.label & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$getSdk$1.label -= Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$getSdk$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneSignalOpenTelemetryBase$getSdk$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OtelFieldsTopLevel otelFieldsTopLevel = this.osTopLevelFields;
                    oneSignalOpenTelemetryBase$getSdk$1.L$0 = this;
                    oneSignalOpenTelemetryBase$getSdk$1.label = 1;
                    obj = otelFieldsTopLevel.getAttributes(oneSignalOpenTelemetryBase$getSdk$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oneSignalOpenTelemetryBase = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oneSignalOpenTelemetryBase = (OneSignalOpenTelemetryBase) oneSignalOpenTelemetryBase$getSdk$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Map<String, String> map = (Map) obj;
                synchronized (oneSignalOpenTelemetryBase.lock) {
                    OpenTelemetrySdk openTelemetrySdk = oneSignalOpenTelemetryBase.sdkCachedValue;
                    if (openTelemetrySdk != null) {
                        return openTelemetrySdk;
                    }
                    OpenTelemetrySdk sdkInstance = oneSignalOpenTelemetryBase.getSdkInstance(map);
                    oneSignalOpenTelemetryBase.sdkCachedValue = sdkInstance;
                    return sdkInstance;
                }
            }
        }
        oneSignalOpenTelemetryBase$getSdk$1 = new OneSignalOpenTelemetryBase$getSdk$1(this, continuation);
        Object obj2 = oneSignalOpenTelemetryBase$getSdk$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneSignalOpenTelemetryBase$getSdk$1.label;
        if (i != 0) {
        }
        Map<String, String> map2 = (Map) obj2;
        synchronized (oneSignalOpenTelemetryBase.lock) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object forceFlush$suspendImpl(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, Continuation<? super CompletableResultCode> continuation) {
        OneSignalOpenTelemetryBase$forceFlush$1 oneSignalOpenTelemetryBase$forceFlush$1;
        int i;
        Object orThrow;
        if (continuation instanceof OneSignalOpenTelemetryBase$forceFlush$1) {
            oneSignalOpenTelemetryBase$forceFlush$1 = (OneSignalOpenTelemetryBase$forceFlush$1) continuation;
            if ((oneSignalOpenTelemetryBase$forceFlush$1.label & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$forceFlush$1.label -= Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$forceFlush$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneSignalOpenTelemetryBase$forceFlush$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    oneSignalOpenTelemetryBase$forceFlush$1.label = 1;
                    obj = oneSignalOpenTelemetryBase.getSdk(oneSignalOpenTelemetryBase$forceFlush$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SdkLoggerProvider sdkLoggerProvider = ((OpenTelemetrySdk) obj).getSdkLoggerProvider();
                oneSignalOpenTelemetryBase$forceFlush$1.L$0 = sdkLoggerProvider;
                oneSignalOpenTelemetryBase$forceFlush$1.label = 2;
                OneSignalOpenTelemetryBase$forceFlush$1 oneSignalOpenTelemetryBase$forceFlush$12 = oneSignalOpenTelemetryBase$forceFlush$1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oneSignalOpenTelemetryBase$forceFlush$12));
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m3984constructorimpl(sdkLoggerProvider.forceFlush().join(10L, TimeUnit.SECONDS)));
                orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oneSignalOpenTelemetryBase$forceFlush$12);
                }
                return orThrow != coroutine_suspended ? coroutine_suspended : orThrow;
            }
        }
        oneSignalOpenTelemetryBase$forceFlush$1 = new OneSignalOpenTelemetryBase$forceFlush$1(oneSignalOpenTelemetryBase, continuation);
        Object obj2 = oneSignalOpenTelemetryBase$forceFlush$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneSignalOpenTelemetryBase$forceFlush$1.label;
        if (i != 0) {
        }
        SdkLoggerProvider sdkLoggerProvider2 = ((OpenTelemetrySdk) obj2).getSdkLoggerProvider();
        oneSignalOpenTelemetryBase$forceFlush$1.L$0 = sdkLoggerProvider2;
        oneSignalOpenTelemetryBase$forceFlush$1.label = 2;
        OneSignalOpenTelemetryBase$forceFlush$1 oneSignalOpenTelemetryBase$forceFlush$122 = oneSignalOpenTelemetryBase$forceFlush$1;
        SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(oneSignalOpenTelemetryBase$forceFlush$122));
        Result.Companion companion2 = Result.INSTANCE;
        safeContinuation2.resumeWith(Result.m3984constructorimpl(sdkLoggerProvider2.forceFlush().join(10L, TimeUnit.SECONDS)));
        orThrow = safeContinuation2.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (orThrow != coroutine_suspended2) {
        }
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public void shutdown() {
        synchronized (this.lock) {
            try {
                OpenTelemetrySdk openTelemetrySdk = this.sdkCachedValue;
                if (openTelemetrySdk != null) {
                    openTelemetrySdk.shutdown();
                }
            } catch (Throwable unused) {
            }
            this.sdkCachedValue = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object getLogger$suspendImpl(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, Continuation<? super LogRecordBuilder> continuation) {
        OneSignalOpenTelemetryBase$getLogger$1 oneSignalOpenTelemetryBase$getLogger$1;
        int i;
        if (continuation instanceof OneSignalOpenTelemetryBase$getLogger$1) {
            oneSignalOpenTelemetryBase$getLogger$1 = (OneSignalOpenTelemetryBase$getLogger$1) continuation;
            if ((oneSignalOpenTelemetryBase$getLogger$1.label & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$getLogger$1.label -= Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$getLogger$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneSignalOpenTelemetryBase$getLogger$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    oneSignalOpenTelemetryBase$getLogger$1.L$0 = oneSignalOpenTelemetryBase;
                    oneSignalOpenTelemetryBase$getLogger$1.label = 1;
                    obj = oneSignalOpenTelemetryBase.getSdk(oneSignalOpenTelemetryBase$getLogger$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oneSignalOpenTelemetryBase = (OneSignalOpenTelemetryBase) oneSignalOpenTelemetryBase$getLogger$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                LogRecordBuilder logRecordBuilder = ((OpenTelemetrySdk) obj).getSdkLoggerProvider().loggerBuilder("loggerBuilder").build().logRecordBuilder();
                Intrinsics.checkNotNullExpressionValue(logRecordBuilder, "logRecordBuilder(...)");
                return OneSignalOpenTelemetryKt.setAllAttributes(logRecordBuilder, oneSignalOpenTelemetryBase.osPerEventFields.getAttributes());
            }
        }
        oneSignalOpenTelemetryBase$getLogger$1 = new OneSignalOpenTelemetryBase$getLogger$1(oneSignalOpenTelemetryBase, continuation);
        Object obj2 = oneSignalOpenTelemetryBase$getLogger$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneSignalOpenTelemetryBase$getLogger$1.label;
        if (i != 0) {
        }
        LogRecordBuilder logRecordBuilder2 = ((OpenTelemetrySdk) obj2).getSdkLoggerProvider().loggerBuilder("loggerBuilder").build().logRecordBuilder();
        Intrinsics.checkNotNullExpressionValue(logRecordBuilder2, "logRecordBuilder(...)");
        return OneSignalOpenTelemetryKt.setAllAttributes(logRecordBuilder2, oneSignalOpenTelemetryBase.osPerEventFields.getAttributes());
    }
}
