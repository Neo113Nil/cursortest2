package com.onesignal.notifications.internal.generation.impl;

import D4.InterfaceC0022w;
import D4.X;
import D4.g0;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.notifications.internal.NotificationReceivedEvent;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2", f = "NotificationGenerationProcessor.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationGenerationProcessor$processNotificationData$2 extends h implements InterfaceC1445p {
    final /* synthetic */ Notification $notification;
    final /* synthetic */ NotificationReceivedEvent $notificationReceivedEvent;
    final /* synthetic */ q $wantsToDisplay;
    int label;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    @e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2$1", f = "NotificationGenerationProcessor.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1441l {
        final /* synthetic */ Notification $notification;
        final /* synthetic */ NotificationReceivedEvent $notificationReceivedEvent;
        final /* synthetic */ q $wantsToDisplay;
        Object L$0;
        int label;
        final /* synthetic */ NotificationGenerationProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NotificationGenerationProcessor notificationGenerationProcessor, NotificationReceivedEvent notificationReceivedEvent, q qVar, Notification notification, InterfaceC1218d interfaceC1218d) {
            super(1, interfaceC1218d);
            this.this$0 = notificationGenerationProcessor;
            this.$notificationReceivedEvent = notificationReceivedEvent;
            this.$wantsToDisplay = qVar;
            this.$notification = notification;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
            return new AnonymousClass1(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC1218d);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            INotificationLifecycleService iNotificationLifecycleService;
            q qVar;
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                iNotificationLifecycleService = this.this$0._lifecycleService;
                iNotificationLifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                if (this.$notificationReceivedEvent.getDiscard()) {
                    this.$wantsToDisplay.f10739a = false;
                } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                    q qVar2 = this.$wantsToDisplay;
                    qVar2.f10739a = false;
                    WaiterWithValue<Boolean> displayWaiter = this.$notification.getDisplayWaiter();
                    this.L$0 = qVar2;
                    this.label = 1;
                    Object waitForWake = displayWaiter.waitForWake(this);
                    if (waitForWake == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                    obj = waitForWake;
                }
                return v.f5689a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.L$0;
            g.y(obj);
            qVar.f10739a = ((Boolean) obj).booleanValue();
            return v.f5689a;
        }

        @Override // t4.InterfaceC1441l
        public final Object invoke(InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationProcessor$processNotificationData$2(NotificationGenerationProcessor notificationGenerationProcessor, NotificationReceivedEvent notificationReceivedEvent, q qVar, Notification notification, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = notificationGenerationProcessor;
        this.$notificationReceivedEvent = notificationReceivedEvent;
        this.$wantsToDisplay = qVar;
        this.$notification = notification;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationGenerationProcessor$processNotificationData$2(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationGenerationProcessor$processNotificationData$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            X launchOnIO = ThreadUtilsKt.launchOnIO(new AnonymousClass1(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null));
            this.label = 1;
            if (((g0) launchOnIO).K(this) == enumC1260a) {
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
