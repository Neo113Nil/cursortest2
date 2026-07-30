package U3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends F2.g {
    private final F2.c groupComparisonType;

    public j() {
        super(com.onesignal.user.internal.operations.impl.executors.p.SET_PROPERTY);
        this.groupComparisonType = F2.c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setProperty(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "property", str, null, false, 12, null);
    }

    private final void setValue(Object obj) {
        com.onesignal.common.modeling.i.setOptAnyProperty$default(this, "value", obj, null, false, 12, null);
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
        return "";
    }

    @Override // F2.g
    public F2.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // F2.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getProperty() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "property", null, 2, null);
    }

    public final Object getValue() {
        return com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "value", null, 2, null);
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
    public j(String appId, String onesignalId, String str, String property, Object obj) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(property, "property");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setProperty(property);
        setValue(obj);
    }
}
