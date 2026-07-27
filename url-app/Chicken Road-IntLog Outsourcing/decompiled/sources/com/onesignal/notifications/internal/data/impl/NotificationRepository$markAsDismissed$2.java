package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissed$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$markAsDismissed$2 extends h implements InterfaceC1445p {
    final /* synthetic */ int $androidId;
    final /* synthetic */ q $didDismiss;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$markAsDismissed$2(q qVar, NotificationRepository notificationRepository, int i2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$didDismiss = qVar;
        this.this$0 = notificationRepository;
        this.$androidId = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$markAsDismissed$2(this.$didDismiss, this.this$0, this.$androidId, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$markAsDismissed$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        boolean internalMarkAsDismissed;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        q qVar = this.$didDismiss;
        internalMarkAsDismissed = this.this$0.internalMarkAsDismissed(this.$androidId);
        qVar.f10739a = internalMarkAsDismissed;
        return v.f5689a;
    }
}
