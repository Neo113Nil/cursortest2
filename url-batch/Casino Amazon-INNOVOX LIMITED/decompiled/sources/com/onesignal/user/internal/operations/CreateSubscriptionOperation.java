package com.onesignal.user.internal.operations;

import androidx.core.app.NotificationCompat;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateSubscriptionOperation.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001BI\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u0005¢\u0006\u0002\u0010\u000fJ\u001c\u00103\u001a\u0002042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000306H\u0016R$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R$\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R$\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/onesignal/user/internal/operations/CreateSubscriptionOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "appId", "", "onesignalId", "externalId", "subscriptionId", WebViewManager.EVENT_TYPE_KEY, "Lcom/onesignal/user/internal/subscriptions/SubscriptionType;", ViewProps.ENABLED, "", "address", NotificationCompat.CATEGORY_STATUS, "Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/subscriptions/SubscriptionType;ZLjava/lang/String;Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;)V", "()V", "value", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAppId", "setAppId", "applyToRecordId", "getApplyToRecordId", "canStartExecute", "getCanStartExecute", "()Z", "createComparisonKey", "getCreateComparisonKey", "getEnabled", "setEnabled", "(Z)V", "groupComparisonType", "Lcom/onesignal/core/internal/operations/GroupComparisonType;", "getGroupComparisonType", "()Lcom/onesignal/core/internal/operations/GroupComparisonType;", "modifyComparisonKey", "getModifyComparisonKey", "getOnesignalId", "setOnesignalId", "getStatus", "()Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "setStatus", "(Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;)V", "getSubscriptionId", "setSubscriptionId", "getType", "()Lcom/onesignal/user/internal/subscriptions/SubscriptionType;", "setType", "(Lcom/onesignal/user/internal/subscriptions/SubscriptionType;)V", "translateIds", "", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateSubscriptionOperation extends Operation {
    private final GroupComparisonType groupComparisonType;

    public CreateSubscriptionOperation() {
        super(SubscriptionOperationExecutor.CREATE_SUBSCRIPTION);
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

    public final String getSubscriptionId() {
        return Model.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    private final void setSubscriptionId(String str) {
        Model.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final SubscriptionType getType() {
        Enum r3 = null;
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, WebViewManager.EVENT_TYPE_KEY, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof SubscriptionType) {
                r3 = (Enum) optAnyProperty$default;
            } else if (optAnyProperty$default instanceof String) {
                r3 = SubscriptionType.valueOf((String) optAnyProperty$default);
            } else {
                if (optAnyProperty$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
                }
                r3 = (SubscriptionType) optAnyProperty$default;
            }
        }
        if (r3 != null) {
            return (SubscriptionType) r3;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final boolean getEnabled() {
        return Model.getBooleanProperty$default(this, ViewProps.ENABLED, null, 2, null);
    }

    private final void setEnabled(boolean z) {
        Model.setBooleanProperty$default(this, ViewProps.ENABLED, z, null, false, 12, null);
    }

    public final String getAddress() {
        return Model.getStringProperty$default(this, "address", null, 2, null);
    }

    private final void setAddress(String str) {
        Model.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    public final SubscriptionStatus getStatus() {
        Enum r3 = null;
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, NotificationCompat.CATEGORY_STATUS, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof SubscriptionStatus) {
                r3 = (Enum) optAnyProperty$default;
            } else if (optAnyProperty$default instanceof String) {
                r3 = SubscriptionStatus.valueOf((String) optAnyProperty$default);
            } else {
                if (optAnyProperty$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
                }
                r3 = (SubscriptionStatus) optAnyProperty$default;
            }
        }
        if (r3 != null) {
            return (SubscriptionStatus) r3;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
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
    public CreateSubscriptionOperation(String appId, String onesignalId, String str, String subscriptionId, SubscriptionType type, boolean z, String address, SubscriptionStatus status) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z);
        setAddress(address);
        setStatus(status);
    }

    @Override // com.onesignal.core.internal.operations.Operation
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = map.get(getOnesignalId());
        if (str != null) {
            setOnesignalId(str);
        }
        String str2 = map.get(getSubscriptionId());
        if (str2 != null) {
            setSubscriptionId(str2);
        }
    }

    private final void setType(SubscriptionType subscriptionType) {
        SubscriptionType subscriptionType2 = subscriptionType;
        setOptAnyProperty(WebViewManager.EVENT_TYPE_KEY, subscriptionType2 != null ? subscriptionType2.toString() : null, ModelChangeTags.NORMAL, false);
    }

    private final void setStatus(SubscriptionStatus subscriptionStatus) {
        SubscriptionStatus subscriptionStatus2 = subscriptionStatus;
        setOptAnyProperty(NotificationCompat.CATEGORY_STATUS, subscriptionStatus2 != null ? subscriptionStatus2.toString() : null, ModelChangeTags.NORMAL, false);
    }
}
