package s3;

import java.util.Map;

/* loaded from: classes.dex */
public final class k extends d2.g {
    private final d2.c groupComparisonType;

    public k() {
        super(com.onesignal.user.internal.operations.impl.executors.p.SET_TAG);
        this.groupComparisonType = d2.c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setKey(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setValue(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "value", str, null, false, 12, null);
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
        return "";
    }

    @Override // d2.g
    public d2.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getKey() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "key", null, 2, null);
    }

    @Override // d2.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getValue() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "value", null, 2, null);
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
    public k(String appId, String onesignalId, String str, String key, String value) {
        this();
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setKey(key);
        setValue(value);
    }
}
