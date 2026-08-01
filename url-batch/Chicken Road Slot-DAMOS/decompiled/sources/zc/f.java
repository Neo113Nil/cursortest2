package zc;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends na.g {
    private final na.c groupComparisonType;
    private final String modifyComparisonKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3, String str4) {
        this();
        str.getClass();
        str2.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setExistingOnesignalId(str4);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setExistingOnesignalId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // na.g
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // na.g
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() == null) {
            return true;
        }
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        String existingOnesignalId = getExistingOnesignalId();
        existingOnesignalId.getClass();
        return !dVar.isLocalId(existingOnesignalId);
    }

    @Override // na.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
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
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // na.g
    public void translateIds(Map<String, String> map) {
        map.getClass();
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            str.getClass();
            setExistingOnesignalId(str);
        }
    }

    public f() {
        super(com.onesignal.user.internal.operations.impl.executors.g.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = na.c.CREATE;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4);
    }
}
