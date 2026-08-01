package zc;

import a2.r;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends na.g {
    private final na.c groupComparisonType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, dd.g gVar, boolean z10, String str4, dd.f fVar) {
        this();
        str.getClass();
        str2.getClass();
        str3.getClass();
        gVar.getClass();
        str4.getClass();
        fVar.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
        setType(gVar);
        setEnabled(z10);
        setAddress(str4);
        setStatus(fVar);
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enabled", z10, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(dd.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(dd.g gVar) {
        setOptAnyProperty(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // na.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // na.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // na.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // na.g
    public na.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // na.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final dd.f getStatus() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof dd.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? dd.f.valueOf((String) optAnyProperty$default) : (dd.f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (dd.f) valueOf;
        }
        r.j("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
        return null;
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final dd.g getType() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof dd.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? dd.g.valueOf((String) optAnyProperty$default) : (dd.g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (dd.g) valueOf;
        }
        r.j("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
        return null;
    }

    @Override // na.g
    public void translateIds(Map<String, String> map) {
        map.getClass();
        String str = map.get(getOnesignalId());
        if (str != null) {
            setOnesignalId(str);
        }
        String str2 = map.get(getSubscriptionId());
        if (str2 != null) {
            setSubscriptionId(str2);
        }
    }

    public a() {
        super(com.onesignal.user.internal.operations.impl.executors.l.CREATE_SUBSCRIPTION);
        this.groupComparisonType = na.c.ALTER;
    }
}
