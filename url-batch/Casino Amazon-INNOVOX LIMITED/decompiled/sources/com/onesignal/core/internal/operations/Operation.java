package com.onesignal.core.internal.operations;

import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u001c\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 H\u0016R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R(\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00038F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b¨\u0006!"}, d2 = {"Lcom/onesignal/core/internal/operations/Operation;", "Lcom/onesignal/common/modeling/Model;", "name", "", "(Ljava/lang/String;)V", "applyToRecordId", "getApplyToRecordId", "()Ljava/lang/String;", "canStartExecute", "", "getCanStartExecute", "()Z", "createComparisonKey", "getCreateComparisonKey", "value", "externalId", "getExternalId", "setExternalId$com_onesignal_core", "groupComparisonType", "Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getGroupComparisonType", "()Lcom/onesignal/core/internal/operations/GroupComparisonType;", "modifyComparisonKey", "getModifyComparisonKey", "getName", "setName", "requiresJwt", "getRequiresJwt", "toString", "translateIds", "", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Operation extends Model {
    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public abstract GroupComparisonType getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public boolean getRequiresJwt() {
        return true;
    }

    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Operation(String name) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(name, "name");
        setName(name);
    }

    public final String getName() {
        return Model.getStringProperty$default(this, "name", null, 2, null);
    }

    private final void setName(String str) {
        Model.setStringProperty$default(this, "name", str, null, false, 12, null);
    }

    public final String getExternalId() {
        return Model.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    public final void setExternalId$com_onesignal_core(String str) {
        Model.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
