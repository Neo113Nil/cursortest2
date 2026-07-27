package com.onesignal.user.internal;

import com.onesignal.common.IDManager;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.ISubscription;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class Subscription implements ISubscription {
    private final SubscriptionModel model;

    public Subscription(SubscriptionModel model) {
        i.e(model, "model");
        this.model = model;
    }

    @Override // com.onesignal.user.subscriptions.ISubscription
    public String getId() {
        return IDManager.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final SubscriptionModel getModel() {
        return this.model;
    }
}
