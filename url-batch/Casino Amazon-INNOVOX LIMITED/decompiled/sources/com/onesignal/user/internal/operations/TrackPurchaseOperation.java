package com.onesignal.user.internal.operations;

import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TrackPurchaseOperation.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rB\u0005¢\u0006\u0002\u0010\u000eJ\u001e\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H\u0014J\u001c\u00102\u001a\u0002032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000305H\u0016R$\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010-¨\u00066"}, d2 = {"Lcom/onesignal/user/internal/operations/TrackPurchaseOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "appId", "", "onesignalId", "externalId", "treatNewAsExisting", "", "amountSpent", "Ljava/math/BigDecimal;", "purchases", "", "Lcom/onesignal/user/internal/operations/PurchaseInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/util/List;)V", "()V", "value", "getAmountSpent", "()Ljava/math/BigDecimal;", "setAmountSpent", "(Ljava/math/BigDecimal;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "applyToRecordId", "getApplyToRecordId", "canStartExecute", "getCanStartExecute", "()Z", "createComparisonKey", "getCreateComparisonKey", "groupComparisonType", "Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getGroupComparisonType", "()Lcom/onesignal/core/internal/operations/GroupComparisonType;", "modifyComparisonKey", "getModifyComparisonKey", "getOnesignalId", "setOnesignalId", "getPurchases", "()Ljava/util/List;", "setPurchases", "(Ljava/util/List;)V", "getTreatNewAsExisting", "setTreatNewAsExisting", "(Z)V", "createListForProperty", "property", "jsonArray", "Lorg/json/JSONArray;", "translateIds", "", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackPurchaseOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public TrackPurchaseOperation() {
        super(UpdateUserOperationExecutor.TRACK_PURCHASE);
        this.groupComparisonType = GroupComparisonType.ALTER;
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

    public final boolean getTreatNewAsExisting() {
        return Model.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
    }

    private final void setTreatNewAsExisting(boolean z) {
        Model.setBooleanProperty$default(this, "treatNewAsExisting", z, null, false, 12, null);
    }

    public final BigDecimal getAmountSpent() {
        return Model.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        Model.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    public final List<PurchaseInfo> getPurchases() {
        return Model.getListProperty$default(this, "purchases", null, 2, null);
    }

    private final void setPurchases(List<PurchaseInfo> list) {
        Model.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
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
    public TrackPurchaseOperation(String appId, String onesignalId, String str, boolean z, BigDecimal amountSpent, List<PurchaseInfo> purchases) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(amountSpent, "amountSpent");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTreatNewAsExisting(z);
        setAmountSpent(amountSpent);
        setPurchases(purchases);
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

    @Override // com.onesignal.common.modeling.Model
    protected List<?> createListForProperty(String property, JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        if (!Intrinsics.areEqual(property, "purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            PurchaseInfo purchaseInfo = new PurchaseInfo();
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            purchaseInfo.initializeFromJson(jSONObject);
            arrayList.add(purchaseInfo);
        }
        return arrayList;
    }
}
