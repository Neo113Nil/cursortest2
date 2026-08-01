package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cf.c;
import com.onesignal.common.threading.b;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ b0 $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, Context context, Intent intent, ld.a aVar) {
            super(1, aVar);
            this.$notificationOpenedProcessor = b0Var;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new a(this.$notificationOpenedProcessor, this.$context, this.$intent, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                hc.a aVar2 = (hc.a) this.$notificationOpenedProcessor.f10141d;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (aVar2.processFromContext(context, intent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (v9.c.b(applicationContext)) {
            b0 b0Var = new b0();
            b0Var.f10141d = v9.c.a().getService(hc.a.class);
            b.suspendifyBlocking(new a(b0Var, context, intent, null));
        }
    }
}
