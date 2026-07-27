package com.onesignal.inAppMessages.internal.lifecycle.impl;

import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class IAMLifecycleService$messagePageChanged$1 extends j implements InterfaceC1441l {
    final /* synthetic */ InAppMessage $message;
    final /* synthetic */ InAppMessagePage $page;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAMLifecycleService$messagePageChanged$1(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage) {
        super(1);
        this.$message = inAppMessage;
        this.$page = inAppMessagePage;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IInAppLifecycleEventHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IInAppLifecycleEventHandler it) {
        i.e(it, "it");
        it.onMessagePageChanged(this.$message, this.$page);
    }
}
