package zc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends na.g {
    private final na.c groupComparisonType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, boolean z10, BigDecimal bigDecimal, List<g> list) {
        this();
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        list.getClass();
        setAppId(str);
        setOnesignalId(str2);
        setTreatNewAsExisting(z10);
        setAmountSpent(bigDecimal);
        setPurchases(list);
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        com.onesignal.common.modeling.i.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<g> list) {
        com.onesignal.common.modeling.i.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "treatNewAsExisting", z10, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.i
    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        str.getClass();
        jSONArray.getClass();
        if (!Intrinsics.a(str, "purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            g gVar = new g();
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            jSONObject.getClass();
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return com.onesignal.common.modeling.i.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
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

    @Override // na.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<g> getPurchases() {
        return com.onesignal.common.modeling.i.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
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

    public m() {
        super(com.onesignal.user.internal.operations.impl.executors.n.TRACK_PURCHASE);
        this.groupComparisonType = na.c.ALTER;
    }
}
