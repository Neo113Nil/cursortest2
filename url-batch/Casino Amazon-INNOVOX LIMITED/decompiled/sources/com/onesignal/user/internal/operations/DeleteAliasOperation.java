package com.onesignal.user.internal.operations;

import com.google.firebase.messaging.Constants;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteAliasOperation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bJ\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030#H\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r¨\u0006$"}, d2 = {"Lcom/onesignal/user/internal/operations/DeleteAliasOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "appId", "", "onesignalId", "externalId", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "value", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "applyToRecordId", "getApplyToRecordId", "canStartExecute", "", "getCanStartExecute", "()Z", "createComparisonKey", "getCreateComparisonKey", "groupComparisonType", "Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getGroupComparisonType", "()Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getLabel", "setLabel", "modifyComparisonKey", "getModifyComparisonKey", "getOnesignalId", "setOnesignalId", "translateIds", "", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAliasOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public DeleteAliasOperation() {
        super(IdentityOperationExecutor.DELETE_ALIAS);
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

    public final String getLabel() {
        return Model.getStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, null, 2, null);
    }

    private final void setLabel(String str) {
        Model.setStringProperty$default(this, Constants.ScionAnalytics.PARAM_LABEL, str, null, false, 12, null);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Alias." + getLabel();
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
    public DeleteAliasOperation(String appId, String onesignalId, String str, String label) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(label, "label");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setLabel(label);
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
