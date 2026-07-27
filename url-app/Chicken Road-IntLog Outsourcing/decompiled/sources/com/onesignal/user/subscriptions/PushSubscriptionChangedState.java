package com.onesignal.user.subscriptions;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PushSubscriptionChangedState {
    private final PushSubscriptionState current;
    private final PushSubscriptionState previous;

    public PushSubscriptionChangedState(PushSubscriptionState previous, PushSubscriptionState current) {
        i.e(previous, "previous");
        i.e(current, "current");
        this.previous = previous;
        this.current = current;
    }

    public final PushSubscriptionState getCurrent() {
        return this.current;
    }

    public final PushSubscriptionState getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
