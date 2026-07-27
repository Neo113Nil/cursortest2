package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.CustomEventOperationExecutor;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TrackCustomEventOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public TrackCustomEventOperation() {
        super(CustomEventOperationExecutor.CUSTOM_EVENT);
        this.groupComparisonType = GroupComparisonType.NONE;
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setTimeStamp(long j2) {
        Model.setLongProperty$default(this, "timeStamp", j2, null, false, 12, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        return !IDManager.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getEventName() {
        return Model.getStringProperty$default(this, "eventName", null, 2, null);
    }

    public final String getEventProperties() {
        return Model.getOptStringProperty$default(this, "eventProperties", null, 2, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getTimeStamp() {
        return Model.getLongProperty$default(this, "timeStamp", null, 2, null);
    }

    public final void setEventName(String value) {
        i.e(value, "value");
        Model.setAnyProperty$default(this, "eventName", value, null, false, 12, null);
    }

    public final void setEventProperties(String str) {
        Model.setOptStringProperty$default(this, "eventProperties", str, null, false, 12, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        i.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            i.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackCustomEventOperation(String appId, String onesignalId, String str, long j2, String eventName, String str2) {
        this();
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        i.e(eventName, "eventName");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTimeStamp(j2);
        setEventName(eventName);
        setEventProperties(str2);
    }
}
