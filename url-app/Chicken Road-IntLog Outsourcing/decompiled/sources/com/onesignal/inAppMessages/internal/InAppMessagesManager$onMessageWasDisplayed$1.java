package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class InAppMessagesManager$onMessageWasDisplayed$1 extends j implements InterfaceC1441l {
    final /* synthetic */ InAppMessage $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$onMessageWasDisplayed$1(InAppMessage inAppMessage) {
        super(1);
        this.$message = inAppMessage;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IInAppMessageLifecycleListener) obj);
        return v.f5689a;
    }

    public final void invoke(IInAppMessageLifecycleListener it) {
        i.e(it, "it");
        it.onDidDisplay(new InAppMessageLifecycleEvent(this.$message));
    }
}
