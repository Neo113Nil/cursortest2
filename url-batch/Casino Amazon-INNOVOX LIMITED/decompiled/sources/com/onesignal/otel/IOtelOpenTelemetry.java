package com.onesignal.otel;

import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.sdk.common.CompletableResultCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IOtelOpenTelemetry.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/onesignal/otel/IOtelOpenTelemetry;", "", "forceFlush", "Lio/opentelemetry/sdk/common/CompletableResultCode;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogger", "Lio/opentelemetry/api/logs/LogRecordBuilder;", "shutdown", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOtelOpenTelemetry {
    Object forceFlush(Continuation<? super CompletableResultCode> continuation);

    Object getLogger(Continuation<? super LogRecordBuilder> continuation);

    void shutdown();
}
