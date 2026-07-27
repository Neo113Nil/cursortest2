package com.onesignal.session.internal.outcomes.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1", f = "OutcomeEventsController.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1 extends h implements InterfaceC1441l {
    final /* synthetic */ OutcomeEventParams $eventParams;
    int label;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1(OutcomeEventsController outcomeEventsController, OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = outcomeEventsController;
        this.$eventParams = outcomeEventParams;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1(this.this$0, this.$eventParams, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOutcomeEventsRepository iOutcomeEventsRepository;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOutcomeEventsRepository = this.this$0._outcomeEventsCache;
            OutcomeEventParams outcomeEventParams = this.$eventParams;
            this.label = 1;
            if (iOutcomeEventsRepository.saveUniqueOutcomeEventParams(outcomeEventParams, this) == enumC1260a) {
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

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
