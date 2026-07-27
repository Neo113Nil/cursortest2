package com.onesignal.session.internal;

import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.session.internal.SessionManager$addOutcome$1", f = "SessionManager.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionManager$addOutcome$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$addOutcome$1(SessionManager sessionManager, String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = sessionManager;
        this.$name = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new SessionManager$addOutcome$1(this.this$0, this.$name, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOutcomeEventsController iOutcomeEventsController;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOutcomeEventsController = this.this$0._outcomeController;
            String str = this.$name;
            this.label = 1;
            if (iOutcomeEventsController.sendOutcomeEvent(str, this) == enumC1260a) {
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
        return ((SessionManager$addOutcome$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
