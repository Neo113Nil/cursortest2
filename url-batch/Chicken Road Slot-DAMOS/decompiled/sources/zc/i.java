package zc;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends na.g {
    private final na.c groupComparisonType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, String str3, String str4) {
        this();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setLabel(str3);
        setValue(str4);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setLabel(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "label", str, null, false, 12, null);
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
        return "";
    }

    @Override // na.g
    public na.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getLabel() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "label", null, 2, null);
    }

    @Override // na.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Identity." + getLabel();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getValue() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "value", null, 2, null);
    }

    @Override // na.g
    public void translateIds(Map<String, String> map) {
        map.getClass();
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            str.getClass();
            setOnesignalId(str);
        }
    }

    public i() {
        super(com.onesignal.user.internal.operations.impl.executors.c.SET_ALIAS);
        this.groupComparisonType = na.c.ALTER;
    }
}
