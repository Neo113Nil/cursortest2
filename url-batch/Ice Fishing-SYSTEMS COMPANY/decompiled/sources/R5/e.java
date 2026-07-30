package R5;

/* loaded from: classes2.dex */
public final class e extends D4.g {
    private final boolean canStartExecute;
    private final D4.c groupComparisonType;

    public e() {
        super(com.onesignal.user.internal.operations.impl.executors.g.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        this.groupComparisonType = D4.c.NONE;
        this.canStartExecute = true;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22565u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
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
        return this.canStartExecute;
    }

    @Override // D4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    @Override // D4.g
    public D4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // D4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String appId, String onesignalId, String str, String subscriptionId) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(subscriptionId, "subscriptionId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
    }
}
