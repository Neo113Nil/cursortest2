package U3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends F2.g {
    private final F2.c groupComparisonType;

    public l() {
        super(com.onesignal.user.internal.operations.impl.executors.a.CUSTOM_EVENT);
        this.groupComparisonType = F2.c.NONE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
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

    @Override // F2.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // F2.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // F2.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getEventName() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "eventName", null, 2, null);
    }

    public final String getEventProperties() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "eventProperties", null, 2, null);
    }

    @Override // F2.g
    public F2.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // F2.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getTimeStamp() {
        return com.onesignal.common.modeling.i.getLongProperty$default(this, "timeStamp", null, 2, null);
    }

    public final void setEventName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        com.onesignal.common.modeling.i.setAnyProperty$default(this, "eventName", value, null, false, 12, null);
    }

    public final void setEventProperties(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "eventProperties", str, null, false, 12, null);
    }

    @Override // F2.g
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String appId, String onesignalId, String str, long j, String eventName, String str2) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTimeStamp(j);
        setEventName(eventName);
        setEventProperties(str2);
    }
}
