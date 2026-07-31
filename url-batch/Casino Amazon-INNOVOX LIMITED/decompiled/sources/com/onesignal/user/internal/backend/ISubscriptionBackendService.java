package com.onesignal.user.internal.backend;

import com.onesignal.common.consistency.RywData;
import com.onesignal.core.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ISubscriptionBackendService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0013J:\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0002\u0010\u0015J4\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;", "", "createSubscription", "Lkotlin/Pair;", "", "Lcom/onesignal/common/consistency/RywData;", "appId", "aliasLabel", "aliasValue", "subscription", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/SubscriptionObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscription", "", "subscriptionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdentityFromSubscription", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferSubscription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSubscription", "(Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/backend/SubscriptionObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ISubscriptionBackendService {
    Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, Continuation<? super Pair<String, RywData>> continuation);

    Object deleteSubscription(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Object getIdentityFromSubscription(String str, String str2, Continuation<? super Map<String, String>> continuation);

    Object transferSubscription(String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation);

    Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, String str3, Continuation<? super RywData> continuation);

    /* compiled from: ISubscriptionBackendService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object createSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSubscription");
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return iSubscriptionBackendService.createSubscription(str, str2, str3, subscriptionObject, str4, continuation);
        }

        public static /* synthetic */ Object updateSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, SubscriptionObject subscriptionObject, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubscription");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return iSubscriptionBackendService.updateSubscription(str, str2, subscriptionObject, str3, continuation);
        }

        public static /* synthetic */ Object deleteSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteSubscription");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return iSubscriptionBackendService.deleteSubscription(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object transferSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transferSubscription");
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            return iSubscriptionBackendService.transferSubscription(str, str2, str3, str4, str5, continuation);
        }
    }
}
