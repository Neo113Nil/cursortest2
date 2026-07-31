package s3;

import java.util.Map;

/* loaded from: classes.dex */
public final class q extends d2.g {
    private final d2.c groupComparisonType;

    public q() {
        super(com.onesignal.user.internal.operations.impl.executors.n.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = d2.c.ALTER;
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z5) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enabled", z5, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(w3.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(w3.g gVar) {
        setOptAnyProperty(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // d2.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // d2.g
    public boolean getCanStartExecute() {
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        return (dVar.isLocalId(getOnesignalId()) || dVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // d2.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // d2.g
    public d2.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // d2.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final w3.f getStatus() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof w3.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? w3.f.valueOf((String) optAnyProperty$default) : (w3.f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (w3.f) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final w3.g getType() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof w3.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? w3.g.valueOf((String) optAnyProperty$default) : (w3.g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (w3.g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // d2.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.i.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.i.b(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            kotlin.jvm.internal.i.b(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String appId, String onesignalId, String str, String subscriptionId, w3.g type, boolean z5, String address, w3.f status) {
        this();
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.i.e(subscriptionId, "subscriptionId");
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z5);
        setAddress(address);
        setStatus(status);
    }
}
