package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.inAppMessages.internal.triggers.TriggerModel;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class TriggerController$onModelUpdated$1 extends j implements InterfaceC1441l {
    final /* synthetic */ TriggerModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerController$onModelUpdated$1(TriggerModel triggerModel) {
        super(1);
        this.$model = triggerModel;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ITriggerHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ITriggerHandler it) {
        i.e(it, "it");
        it.onTriggerChanged(this.$model.getKey());
    }
}
