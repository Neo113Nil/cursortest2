package R5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends D4.g {
    private final D4.c groupComparisonType;

    public q() {
        super(com.onesignal.user.internal.operations.impl.executors.n.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = D4.c.ALTER;
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22565u, str, null, false, 12, null);
    }

    private final void setEnabled(boolean z8) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enabled", z8, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(V5.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(V5.g gVar) {
        setOptAnyProperty("type", gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22565u, null, 2, null);
    }

    @Override // D4.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // D4.g
    public boolean getCanStartExecute() {
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        return (dVar.isLocalId(getOnesignalId()) || dVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // D4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // D4.g
    public D4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // D4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final V5.f getStatus() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof V5.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? V5.f.valueOf((String) optAnyProperty$default) : (V5.f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (V5.f) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final V5.g getType() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "type", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof V5.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? V5.g.valueOf((String) optAnyProperty$default) : (V5.g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (V5.g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // D4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.h.b(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            kotlin.jvm.internal.h.b(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String appId, String onesignalId, String str, String subscriptionId, V5.g type, boolean z8, String address, V5.f status) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(subscriptionId, "subscriptionId");
        kotlin.jvm.internal.h.e(type, "type");
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z8);
        setAddress(address);
        setStatus(status);
    }
}
