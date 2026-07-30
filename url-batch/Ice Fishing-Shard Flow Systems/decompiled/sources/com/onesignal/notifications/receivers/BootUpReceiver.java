package com.onesignal.notifications.receivers;

import C3.c;
import V5.b;
import X5.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;

@Metadata
/* loaded from: classes.dex */
public final class BootUpReceiver extends BroadcastReceiver {

    public static final class a extends j implements Function1 {
        final /* synthetic */ Context $context;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, b bVar) {
            super(1, bVar);
            this.$context = context;
            this.$pendingResult = pendingResult;
        }

        @Override // X5.a
        public final b create(b bVar) {
            return new a(this.$context, this.$pendingResult, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
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
            if (((Boolean) obj).booleanValue()) {
                ((c) AbstractC0755f.d().getService(c.class)).beginEnqueueingWork(this.$context, true);
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                return Unit.f6114a;
            }
            com.onesignal.debug.internal.logging.b.warn$default("NotificationRestoreReceiver skipped due to failed OneSignal init", null, 2, null);
            BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            return Unit.f6114a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(context, goAsync(), null));
    }
}
