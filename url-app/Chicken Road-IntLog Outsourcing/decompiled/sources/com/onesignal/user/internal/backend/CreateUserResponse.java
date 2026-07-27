package com.onesignal.user.internal.backend;

import com.onesignal.common.consistency.RywData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class CreateUserResponse {
    private final Map<String, String> identities;
    private final PropertiesObject properties;
    private final RywData rywData;
    private final List<SubscriptionObject> subscriptions;

    public CreateUserResponse(Map<String, String> identities, PropertiesObject properties, List<SubscriptionObject> subscriptions, RywData rywData) {
        i.e(identities, "identities");
        i.e(properties, "properties");
        i.e(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
        this.rywData = rywData;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final PropertiesObject getProperties() {
        return this.properties;
    }

    public final RywData getRywData() {
        return this.rywData;
    }

    public final List<SubscriptionObject> getSubscriptions() {
        return this.subscriptions;
    }

    public /* synthetic */ CreateUserResponse(Map map, PropertiesObject propertiesObject, List list, RywData rywData, int i2, e eVar) {
        this(map, propertiesObject, list, (i2 & 8) != 0 ? null : rywData);
    }
}
