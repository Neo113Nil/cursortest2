package com.onesignal.notifications.receivers;

import X5.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import o3.C0801a;

@Metadata
/* loaded from: classes.dex */
public final class FCMBroadcastReceiver extends BroadcastReceiver {
    public static final a Companion = new a(null);
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFCMMessage(Intent intent) {
            if (!FCMBroadcastReceiver.FCM_RECEIVE_ACTION.equals(intent.getAction())) {
                return false;
            }
            String stringExtra = intent.getStringExtra(FCMBroadcastReceiver.MESSAGE_TYPE_EXTRA_KEY);
            return stringExtra == null || FCMBroadcastReceiver.FCM_TYPE.equals(stringExtra);
        }

        private a() {
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;
        final /* synthetic */ FCMBroadcastReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, FCMBroadcastReceiver fCMBroadcastReceiver, Bundle bundle, V5.b bVar) {
            super(1, bVar);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
            this.this$0 = fCMBroadcastReceiver;
            this.$bundle = bundle;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new b(this.$context, this.$pendingResult, this.$intent, this.this$0, this.$bundle, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Context applicationContext = this.$context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = AbstractC0755f.f(applicationContext, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.warn$default("FCMBroadcastReceiver skipped due to failed OneSignal init", null, 2, null);
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                return Unit.f6114a;
            }
            o3.b bVar = (o3.b) AbstractC0755f.d().getService(o3.b.class);
            if (!FCMBroadcastReceiver.Companion.isFCMMessage(this.$intent)) {
                this.this$0.setSuccessfulResultCode();
                BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                return Unit.f6114a;
            }
            C0801a processBundleFromReceiver = bVar.processBundleFromReceiver(this.$context, this.$bundle);
            if (processBundleFromReceiver == null || !processBundleFromReceiver.isWorkManagerProcessing()) {
                this.this$0.setSuccessfulResultCode();
                BroadcastReceiver.PendingResult pendingResult3 = this.$pendingResult;
                if (pendingResult3 != null) {
                    pendingResult3.finish();
                }
                return Unit.f6114a;
            }
            this.this$0.setAbort();
            BroadcastReceiver.PendingResult pendingResult4 = this.$pendingResult;
            if (pendingResult4 != null) {
                pendingResult4.finish();
            }
            return Unit.f6114a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(context, goAsync(), intent, this, extras, null));
    }
}
