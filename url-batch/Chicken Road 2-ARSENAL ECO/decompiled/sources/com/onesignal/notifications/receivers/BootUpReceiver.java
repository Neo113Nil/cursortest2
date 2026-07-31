package com.onesignal.notifications.receivers;

import L1.f;
import a3.InterfaceC0227c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.debug.internal.logging.b;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class BootUpReceiver extends BroadcastReceiver {

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ Context $context;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = context;
            this.$pendingResult = pendingResult;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new a(this.$context, this.$pendingResult, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Context applicationContext = this.$context.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = f.f(applicationContext, this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f5219a;
            if (booleanValue) {
                ((InterfaceC0227c) f.d().getService(InterfaceC0227c.class)).beginEnqueueingWork(this.$context, true);
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
            } else {
                b.warn$default("NotificationRestoreReceiver skipped due to failed OneSignal init", null, 2, null);
                BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                    return vVar;
                }
            }
            return vVar;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(context, goAsync(), null));
    }
}
