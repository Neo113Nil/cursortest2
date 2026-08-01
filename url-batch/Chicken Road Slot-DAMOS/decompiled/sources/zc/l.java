package zc;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends na.g {
    private final na.c groupComparisonType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, long j, String str4, String str5) {
        this();
        str.getClass();
        str2.getClass();
        str4.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setTimeStamp(j);
        setEventName(str4);
        setEventProperties(str5);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setTimeStamp(long j) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "timeStamp", j, null, false, 12, null);
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
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getEventName() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "eventName", null, 2, null);
    }

    public final String getEventProperties() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "eventProperties", null, 2, null);
    }

    public final String getExternalId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    @Override // na.g
    public na.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // na.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getTimeStamp() {
        return com.onesignal.common.modeling.i.getLongProperty$default(this, "timeStamp", null, 2, null);
    }

    public final void setEventName(String str) {
        str.getClass();
        com.onesignal.common.modeling.i.setAnyProperty$default(this, "eventName", str, null, false, 12, null);
    }

    public final void setEventProperties(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "eventProperties", str, null, false, 12, null);
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

    public l() {
        super(com.onesignal.user.internal.operations.impl.executors.a.CUSTOM_EVENT);
        this.groupComparisonType = na.c.NONE;
    }
}
