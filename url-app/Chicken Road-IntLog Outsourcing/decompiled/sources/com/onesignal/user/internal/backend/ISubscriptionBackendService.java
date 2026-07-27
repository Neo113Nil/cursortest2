package com.onesignal.user.internal.backend;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface ISubscriptionBackendService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object createSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSubscription");
            }
            if ((i2 & 16) != 0) {
                str4 = null;
            }
            return iSubscriptionBackendService.createSubscription(str, str2, str3, subscriptionObject, str4, interfaceC1218d);
        }

        public static /* synthetic */ Object deleteSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteSubscription");
            }
            if ((i2 & 4) != 0) {
                str3 = null;
            }
            return iSubscriptionBackendService.deleteSubscription(str, str2, str3, interfaceC1218d);
        }

        public static /* synthetic */ Object transferSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transferSubscription");
            }
            if ((i2 & 16) != 0) {
                str5 = null;
            }
            return iSubscriptionBackendService.transferSubscription(str, str2, str3, str4, str5, interfaceC1218d);
        }

        public static /* synthetic */ Object updateSubscription$default(ISubscriptionBackendService iSubscriptionBackendService, String str, String str2, SubscriptionObject subscriptionObject, String str3, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubscription");
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            return iSubscriptionBackendService.updateSubscription(str, str2, subscriptionObject, str3, interfaceC1218d);
        }
    }

    Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, String str4, InterfaceC1218d interfaceC1218d);

    Object deleteSubscription(String str, String str2, String str3, InterfaceC1218d interfaceC1218d);

    Object getIdentityFromSubscription(String str, String str2, InterfaceC1218d interfaceC1218d);

    Object transferSubscription(String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d);

    Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, String str3, InterfaceC1218d interfaceC1218d);
}
