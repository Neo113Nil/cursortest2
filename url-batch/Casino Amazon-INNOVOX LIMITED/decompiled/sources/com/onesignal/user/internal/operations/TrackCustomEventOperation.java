package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.CustomEventOperationExecutor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackCustomEventOperation.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nB\u0005¢\u0006\u0002\u0010\u000bJ\u001c\u0010)\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030,H\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR$\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R(\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/onesignal/user/internal/operations/TrackCustomEventOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "appId", "", "onesignalId", "externalId", "timeStamp", "", "eventName", "eventProperties", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "()V", "value", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "applyToRecordId", "getApplyToRecordId", "canStartExecute", "", "getCanStartExecute", "()Z", "createComparisonKey", "getCreateComparisonKey", "getEventName", "setEventName", "getEventProperties", "setEventProperties", "groupComparisonType", "Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getGroupComparisonType", "()Lcom/onesignal/core/internal/operations/GroupComparisonType;", "modifyComparisonKey", "getModifyComparisonKey", "getOnesignalId", "setOnesignalId", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "translateIds", "", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackCustomEventOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public TrackCustomEventOperation() {
        super(CustomEventOperationExecutor.CUSTOM_EVENT);
        this.groupComparisonType = GroupComparisonType.NONE;
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    private final void setAppId(String str) {
        Model.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final String getOnesignalId() {
        return Model.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    private final void setOnesignalId(String str) {
        Model.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final long getTimeStamp() {
        return Model.getLongProperty$default(this, "timeStamp", null, 2, null);
    }

    private final void setTimeStamp(long j) {
        Model.setLongProperty$default(this, "timeStamp", j, null, false, 12, null);
    }

    public final String getEventName() {
        return Model.getStringProperty$default(this, "eventName", null, 2, null);
    }

    public final void setEventName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Model.setAnyProperty$default(this, "eventName", value, null, false, 12, null);
    }

    public final String getEventProperties() {
        return Model.getOptStringProperty$default(this, "eventProperties", null, 2, null);
    }

    public final void setEventProperties(String str) {
        Model.setOptStringProperty$default(this, "eventProperties", str, null, false, 12, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public GroupComparisonType getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public boolean getCanStartExecute() {
        return !IDManager.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackCustomEventOperation(String appId, String onesignalId, String str, long j, String eventName, String str2) {
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

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.checkNotNull(str);
            setOnesignalId(str);
        }
    }
}
