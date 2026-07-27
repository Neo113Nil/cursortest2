package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONObject;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$2", f = "NotificationLifecycleService.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$canOpenNotification$2 extends h implements InterfaceC1445p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ q $canOpen;
    final /* synthetic */ JSONObject $data;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$canOpenNotification$2(q qVar, Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$canOpen = qVar;
        this.$activity = activity;
        this.$data = jSONObject;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$canOpenNotification$2 notificationLifecycleService$canOpenNotification$2 = new NotificationLifecycleService$canOpenNotification$2(this.$canOpen, this.$activity, this.$data, interfaceC1218d);
        notificationLifecycleService$canOpenNotification$2.L$0 = obj;
        return notificationLifecycleService$canOpenNotification$2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(INotificationLifecycleCallback iNotificationLifecycleCallback, InterfaceC1218d interfaceC1218d) {
        return ((NotificationLifecycleService$canOpenNotification$2) create(iNotificationLifecycleCallback, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            INotificationLifecycleCallback iNotificationLifecycleCallback = (INotificationLifecycleCallback) this.L$0;
            q qVar2 = this.$canOpen;
            Activity activity = this.$activity;
            JSONObject jSONObject = this.$data;
            this.L$0 = qVar2;
            this.label = 1;
            obj = iNotificationLifecycleCallback.canOpenNotification(activity, jSONObject, this);
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
