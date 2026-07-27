package com.onesignal.session.internal;

import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import e5.g;
import f4.v;
import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.session.internal.SessionManager$addOutcomeWithValue$1", f = "SessionManager.kt", l = {C0793l9.f8688J}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionManager$addOutcomeWithValue$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $name;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$addOutcomeWithValue$1(SessionManager sessionManager, String str, float f3, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = sessionManager;
        this.$name = str;
        this.$value = f3;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new SessionManager$addOutcomeWithValue$1(this.this$0, this.$name, this.$value, interfaceC1218d);
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
            float f3 = this.$value;
            this.label = 1;
            if (iOutcomeEventsController.sendOutcomeEventWithValue(str, f3, this) == enumC1260a) {
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
        return ((SessionManager$addOutcomeWithValue$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
