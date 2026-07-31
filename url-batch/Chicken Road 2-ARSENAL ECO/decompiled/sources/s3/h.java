package s3;

import java.util.Map;

/* loaded from: classes.dex */
public final class h extends d2.g {
    private final d2.c groupComparisonType;

    public h() {
        super(com.onesignal.user.internal.operations.impl.executors.l.REFRESH_USER);
        this.groupComparisonType = d2.c.CREATE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // d2.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // d2.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // d2.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Refresh";
    }

    @Override // d2.g
    public d2.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // d2.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Refresh";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // d2.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.i.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.i.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String appId, String onesignalId, String str) {
        this();
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
    }
}
