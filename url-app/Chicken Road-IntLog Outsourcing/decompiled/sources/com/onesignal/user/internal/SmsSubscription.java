package com.onesignal.user.internal;

import com.onesignal.common.PIIHasher;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.ISmsSubscription;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SmsSubscription extends Subscription implements ISmsSubscription {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsSubscription(SubscriptionModel model) {
        super(model);
        i.e(model, "model");
    }

    @Override // com.onesignal.user.subscriptions.ISmsSubscription
    public String getNumber() {
        String address = getModel().getAddress();
        return PIIHasher.INSTANCE.isHashed(address) ? "" : address;
    }
}
