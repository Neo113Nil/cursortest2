package s3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends d2.g {
    private final d2.c groupComparisonType;

    public m() {
        super(com.onesignal.user.internal.operations.impl.executors.p.TRACK_PURCHASE);
        this.groupComparisonType = d2.c.ALTER;
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

    private final void setTreatNewAsExisting(boolean z5) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "treatNewAsExisting", z5, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.i
    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        kotlin.jvm.internal.i.e(property, "property");
        kotlin.jvm.internal.i.e(jsonArray, "jsonArray");
        if (!property.equals("purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            g gVar = new g();
            JSONObject jSONObject = jsonArray.getJSONObject(i7);
            kotlin.jvm.internal.i.d(jSONObject, "getJSONObject(...)");
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

    @Override // d2.g
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
    public m(String appId, String onesignalId, String str, boolean z5, BigDecimal amountSpent, List<g> purchases) {
        this();
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.i.e(amountSpent, "amountSpent");
        kotlin.jvm.internal.i.e(purchases, "purchases");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTreatNewAsExisting(z5);
        setAmountSpent(amountSpent);
        setPurchases(purchases);
    }
}
