package com.onesignal.debug.internal.logging;

import android.app.Activity;
import android.app.AlertDialog;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.debug.internal.logging.Logging$showVisualLogging$1", f = "Logging.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Logging$showVisualLogging$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $finalFullMessage;
    final /* synthetic */ LogLevel $level;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Logging$showVisualLogging$1(LogLevel logLevel, String str, Continuation<? super Logging$showVisualLogging$1> continuation) {
        super(1, continuation);
        this.$level = logLevel;
        this.$finalFullMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Logging$showVisualLogging$1(this.$level, this.$finalFullMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((Logging$showVisualLogging$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IApplicationService applicationService = Logging.INSTANCE.getApplicationService();
        Activity activity = applicationService != null ? applicationService.get_current() : null;
        if (activity != null) {
            new AlertDialog.Builder(activity).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
        }
        return Unit.INSTANCE;
    }
}
