package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.IInAppMessageClickListener;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$firePublicClickHandler$2", f = "InAppMessagesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$firePublicClickHandler$2 extends h implements InterfaceC1445p {
    final /* synthetic */ InAppMessageClickEvent $result;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$firePublicClickHandler$2(InAppMessageClickEvent inAppMessageClickEvent, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$result = inAppMessageClickEvent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$firePublicClickHandler$2 inAppMessagesManager$firePublicClickHandler$2 = new InAppMessagesManager$firePublicClickHandler$2(this.$result, interfaceC1218d);
        inAppMessagesManager$firePublicClickHandler$2.L$0 = obj;
        return inAppMessagesManager$firePublicClickHandler$2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(IInAppMessageClickListener iInAppMessageClickListener, InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$firePublicClickHandler$2) create(iInAppMessageClickListener, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        ((IInAppMessageClickListener) this.L$0).onClick(this.$result);
        return v.f5689a;
    }
}
