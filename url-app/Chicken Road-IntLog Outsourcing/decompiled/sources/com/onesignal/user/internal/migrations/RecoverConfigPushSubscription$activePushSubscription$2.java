package com.onesignal.user.internal.migrations;

import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class RecoverConfigPushSubscription$activePushSubscription$2 extends j implements InterfaceC1430a {
    final /* synthetic */ RecoverConfigPushSubscription this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverConfigPushSubscription$activePushSubscription$2(RecoverConfigPushSubscription recoverConfigPushSubscription) {
        super(0);
        this.this$0 = recoverConfigPushSubscription;
    }

    @Override // t4.InterfaceC1430a
    public final SubscriptionModel invoke() {
        SubscriptionModelStore subscriptionModelStore;
        Object obj;
        subscriptionModelStore = this.this$0._subscriptionModelStore;
        Iterator it = subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionModel) obj).getType() == SubscriptionType.PUSH) {
                break;
            }
        }
        return (SubscriptionModel) obj;
    }
}
