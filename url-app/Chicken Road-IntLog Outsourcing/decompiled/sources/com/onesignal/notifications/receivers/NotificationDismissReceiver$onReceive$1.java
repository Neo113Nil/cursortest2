package com.onesignal.notifications.receivers;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import I4.o;
import K4.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1", f = "NotificationDismissReceiver.kt", l = {45, 54}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationDismissReceiver$onReceive$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;

    @e(c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1$1", f = "NotificationDismissReceiver.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1445p {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ INotificationOpenedProcessor $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(INotificationOpenedProcessor iNotificationOpenedProcessor, Context context, Intent intent, InterfaceC1218d interfaceC1218d) {
            super(2, interfaceC1218d);
            this.$notificationOpenedProcessor = iNotificationOpenedProcessor;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
            return new AnonymousClass1(this.$notificationOpenedProcessor, this.$context, this.$intent, interfaceC1218d);
        }

        @Override // t4.InterfaceC1445p
        public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                INotificationOpenedProcessor iNotificationOpenedProcessor = this.$notificationOpenedProcessor;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (iNotificationOpenedProcessor.processFromContext(context, intent, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            return v.f5689a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDismissReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$context = context;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new NotificationDismissReceiver$onReceive$1(this.$context, this.$pendingResult, this.$intent, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            Context applicationContext = this.$context.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                this.$pendingResult.finish();
                return vVar;
            }
            g.y(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            Logging.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
            this.$pendingResult.finish();
            return vVar;
        }
        INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
        d dVar = E.f459a;
        E4.e eVar = o.f1316a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(iNotificationOpenedProcessor, this.$context, this.$intent, null);
        this.label = 2;
        if (AbstractC0024y.w(eVar, anonymousClass1, this) == enumC1260a) {
            return enumC1260a;
        }
        this.$pendingResult.finish();
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((NotificationDismissReceiver$onReceive$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
