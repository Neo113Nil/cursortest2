package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import e5.g;
import f4.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONObject;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canReceiveNotification$2", f = "NotificationLifecycleService.kt", l = {AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$canReceiveNotification$2 extends h implements InterfaceC1445p {
    final /* synthetic */ q $canReceive;
    final /* synthetic */ JSONObject $jsonPayload;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$canReceiveNotification$2(q qVar, JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$canReceive = qVar;
        this.$jsonPayload = jSONObject;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$canReceiveNotification$2 notificationLifecycleService$canReceiveNotification$2 = new NotificationLifecycleService$canReceiveNotification$2(this.$canReceive, this.$jsonPayload, interfaceC1218d);
        notificationLifecycleService$canReceiveNotification$2.L$0 = obj;
        return notificationLifecycleService$canReceiveNotification$2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(INotificationLifecycleCallback iNotificationLifecycleCallback, InterfaceC1218d interfaceC1218d) {
        return ((NotificationLifecycleService$canReceiveNotification$2) create(iNotificationLifecycleCallback, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            INotificationLifecycleCallback iNotificationLifecycleCallback = (INotificationLifecycleCallback) this.L$0;
            q qVar2 = this.$canReceive;
            JSONObject jSONObject = this.$jsonPayload;
            this.L$0 = qVar2;
            this.label = 1;
            obj = iNotificationLifecycleCallback.canReceiveNotification(jSONObject, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
            qVar = qVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.L$0;
            g.y(obj);
        }
        qVar.f10739a = ((Boolean) obj).booleanValue();
        return v.f5689a;
    }
}
