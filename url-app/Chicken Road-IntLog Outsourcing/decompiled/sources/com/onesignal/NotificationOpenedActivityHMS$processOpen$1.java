package com.onesignal;

import android.content.Context;
import android.content.Intent;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.NotificationOpenedActivityHMS$processOpen$1", f = "NotificationOpenedActivityHMS.kt", l = {76, 82}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS$processOpen$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ NotificationOpenedActivityHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenedActivityHMS$processOpen$1(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = notificationOpenedActivityHMS;
        this.$intent = intent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new NotificationOpenedActivityHMS$processOpen$1(this.this$0, this.$intent, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            Context applicationContext = this.this$0.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    g.y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return vVar;
        }
        INotificationOpenedProcessorHMS iNotificationOpenedProcessorHMS = (INotificationOpenedProcessorHMS) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessorHMS.class);
        NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.this$0;
        Intent intent = this.$intent;
        this.label = 2;
        return iNotificationOpenedProcessorHMS.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == enumC1260a ? enumC1260a : vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((NotificationOpenedActivityHMS$processOpen$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
