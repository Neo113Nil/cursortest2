package com.onesignal.debug.internal.logging;

import android.util.Log;
import com.onesignal.debug.LogLevel;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import com.onesignal.otel.OtelLoggingHelper;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.debug.internal.logging.Logging$logToOtel$1", f = "Logging.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Logging$logToOtel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LogLevel $level;
    final /* synthetic */ String $message;
    final /* synthetic */ IOtelOpenTelemetryRemote $telemetry;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Logging$logToOtel$1(IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, LogLevel logLevel, String str, Throwable th, Continuation<? super Logging$logToOtel$1> continuation) {
        super(2, continuation);
        this.$telemetry = iOtelOpenTelemetryRemote;
        this.$level = logLevel;
        this.$message = str;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Logging$logToOtel$1(this.$telemetry, this.$level, this.$message, this.$throwable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Logging$logToOtel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Class<?> cls;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtelLoggingHelper otelLoggingHelper = OtelLoggingHelper.INSTANCE;
                IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.$telemetry;
                String name = this.$level.name();
                String str = this.$message;
                Throwable th = this.$throwable;
                String name2 = (th == null || (cls = th.getClass()) == null) ? null : cls.getName();
                Throwable th2 = this.$throwable;
                String message = th2 != null ? th2.getMessage() : null;
                Throwable th3 = this.$throwable;
                String stackTraceToString = th3 != null ? ExceptionsKt.stackTraceToString(th3) : null;
                this.label = 1;
                if (otelLoggingHelper.logToOtel(iOtelOpenTelemetryRemote, name, str, name2, message, stackTraceToString, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th4) {
            Log.e("OneSignal", "Failed to log to Otel: " + th4.getMessage(), th4);
        }
        return Unit.INSTANCE;
    }
}
