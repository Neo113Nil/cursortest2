package zc;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends na.g {
    private final boolean canStartExecute;
    private final na.c groupComparisonType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3) {
        this();
        str.getClass();
        str2.getClass();
        str3.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // na.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // na.g
    public boolean getCanStartExecute() {
        return this.canStartExecute;
    }

    @Override // na.g
    public String getCreateComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    @Override // na.g
    public na.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // na.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public e() {
        super(com.onesignal.user.internal.operations.impl.executors.e.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        this.groupComparisonType = na.c.NONE;
        this.canStartExecute = true;
    }
}
