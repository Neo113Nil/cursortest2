package com.onesignal.user.internal.backend;

import com.android.billingclient.api.BillingClient;
import com.onesignal.common.consistency.RywData;
import com.onesignal.core.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IUserBackendService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/onesignal/user/internal/backend/CreateUserResponse;", "", "identities", "", "", "properties", "Lcom/onesignal/user/internal/backend/PropertiesObject;", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "rywData", "Lcom/onesignal/common/consistency/RywData;", "(Ljava/util/Map;Lcom/onesignal/user/internal/backend/PropertiesObject;Ljava/util/List;Lcom/onesignal/common/consistency/RywData;)V", "getIdentities", "()Ljava/util/Map;", "getProperties", "()Lcom/onesignal/user/internal/backend/PropertiesObject;", "getRywData", "()Lcom/onesignal/common/consistency/RywData;", "getSubscriptions", "()Ljava/util/List;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateUserResponse {
    private final Map<String, String> identities;
    private final PropertiesObject properties;
    private final RywData rywData;
    private final List<SubscriptionObject> subscriptions;

    public CreateUserResponse(Map<String, String> identities, PropertiesObject properties, List<SubscriptionObject> subscriptions, RywData rywData) {
        Intrinsics.checkNotNullParameter(identities, "identities");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
        this.rywData = rywData;
    }

    public /* synthetic */ CreateUserResponse(Map map, PropertiesObject propertiesObject, List list, RywData rywData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, propertiesObject, list, (i & 8) != 0 ? null : rywData);
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final PropertiesObject getProperties() {
        return this.properties;
    }

    public final List<SubscriptionObject> getSubscriptions() {
        return this.subscriptions;
    }

    public final RywData getRywData() {
        return this.rywData;
    }
}
