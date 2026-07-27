package com.onesignal.user.internal.backend;

import java.util.Map;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IIdentityBackendService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object deleteAlias$default(IIdentityBackendService iIdentityBackendService, String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAlias");
            }
            if ((i2 & 16) != 0) {
                str5 = null;
            }
            return iIdentityBackendService.deleteAlias(str, str2, str3, str4, str5, interfaceC1218d);
        }

        public static /* synthetic */ Object setAlias$default(IIdentityBackendService iIdentityBackendService, String str, String str2, String str3, Map map, String str4, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAlias");
            }
            if ((i2 & 16) != 0) {
                str4 = null;
            }
            return iIdentityBackendService.setAlias(str, str2, str3, map, str4, interfaceC1218d);
        }
    }

    Object deleteAlias(String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d);

    Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, InterfaceC1218d interfaceC1218d);
}
