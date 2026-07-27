package com.onesignal.session.internal.outcomes.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$start$1", f = "OutcomeEventsController.kt", l = {45, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsController$start$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsController$start$1(OutcomeEventsController outcomeEventsController, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = outcomeEventsController;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsController$start$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object sendSavedOutcomes;
        IOutcomeEventsRepository iOutcomeEventsRepository;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            OutcomeEventsController outcomeEventsController = this.this$0;
            this.label = 1;
            sendSavedOutcomes = outcomeEventsController.sendSavedOutcomes(this);
            if (sendSavedOutcomes == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                return v.f5689a;
            }
            g.y(obj);
        }
        iOutcomeEventsRepository = this.this$0._outcomeEventsCache;
        this.label = 2;
        if (iOutcomeEventsRepository.cleanCachedUniqueOutcomeEventNotifications(this) == enumC1260a) {
            return enumC1260a;
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsController$start$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
