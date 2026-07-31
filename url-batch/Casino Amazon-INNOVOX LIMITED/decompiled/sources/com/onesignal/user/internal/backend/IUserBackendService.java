package com.onesignal.user.internal.backend;

import com.android.billingclient.api.BillingClient;
import com.onesignal.common.consistency.RywData;
import com.onesignal.core.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IUserBackendService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\rJ2\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0011JL\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/onesignal/user/internal/backend/IUserBackendService;", "", "createUser", "Lcom/onesignal/user/internal/backend/CreateUserResponse;", "appId", "", "identities", "", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "properties", "jwt", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "aliasLabel", "aliasValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lcom/onesignal/common/consistency/RywData;", "Lcom/onesignal/user/internal/backend/PropertiesObject;", "refreshDeviceMetadata", "", "propertyiesDelta", "Lcom/onesignal/user/internal/backend/PropertiesDeltasObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/PropertiesObject;ZLcom/onesignal/user/internal/backend/PropertiesDeltasObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IUserBackendService {
    Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, String str2, Continuation<? super CreateUserResponse> continuation);

    Object getUser(String str, String str2, String str3, String str4, Continuation<? super CreateUserResponse> continuation);

    Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, Continuation<? super RywData> continuation);

    /* compiled from: IUserBackendService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object createUser$default(IUserBackendService iUserBackendService, String str, Map map, List list, Map map2, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createUser");
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            return iUserBackendService.createUser(str, map, list, map2, str2, continuation);
        }

        public static /* synthetic */ Object updateUser$default(IUserBackendService iUserBackendService, String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return iUserBackendService.updateUser(str, str2, str3, propertiesObject, z, propertiesDeltasObject, (i & 64) != 0 ? null : str4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUser");
        }

        public static /* synthetic */ Object getUser$default(IUserBackendService iUserBackendService, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUser");
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return iUserBackendService.getUser(str, str2, str3, str4, continuation);
        }
    }
}
