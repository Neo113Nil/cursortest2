package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalHmsEventBridge.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onMessageReceived$1", f = "OneSignalHmsEventBridge.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalHmsEventBridge$onMessageReceived$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RemoteMessage $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalHmsEventBridge$onMessageReceived$1(Context context, RemoteMessage remoteMessage, Continuation<? super OneSignalHmsEventBridge$onMessageReceived$1> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$message = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OneSignalHmsEventBridge$onMessageReceived$1(this.$context, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OneSignalHmsEventBridge$onMessageReceived$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = OneSignal.initWithContext(this.$context, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        ITime iTime = (ITime) OneSignal.INSTANCE.getServices().getService(ITime.class);
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
        String data = this.$message.getData();
        try {
            JSONObject jSONObject = new JSONObject(this.$message.getData());
            if (this.$message.getTtl() == 0) {
                jSONObject.put("hms.ttl", 259200);
            } else {
                jSONObject.put("hms.ttl", this.$message.getTtl());
            }
            if (this.$message.getSentTime() == 0) {
                jSONObject.put("hms.sent_time", iTime.getCurrentTimeMillis());
            } else {
                jSONObject.put("hms.sent_time", this.$message.getSentTime());
            }
            data = jSONObject.toString();
        } catch (JSONException unused) {
            Logging.warn$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
        }
        if (data == null) {
            return Unit.INSTANCE;
        }
        Bundle jsonStringToBundle = JSONUtils.INSTANCE.jsonStringToBundle(data);
        if (jsonStringToBundle == null) {
            return Unit.INSTANCE;
        }
        iNotificationBundleProcessor.processBundleFromReceiver(this.$context, jsonStringToBundle);
        return Unit.INSTANCE;
    }
}
