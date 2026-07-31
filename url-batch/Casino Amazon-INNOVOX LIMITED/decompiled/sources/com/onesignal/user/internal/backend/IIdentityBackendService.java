package com.onesignal.user.internal.backend;

import com.onesignal.core.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IIdentityBackendService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\nJR\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/onesignal/user/internal/backend/IIdentityBackendService;", "", "deleteAlias", "", "appId", "", "aliasLabel", "aliasValue", "aliasLabelToDelete", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAlias", "", "identities", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IIdentityBackendService {
    Object deleteAlias(String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation);

    Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, Continuation<? super Map<String, String>> continuation);

    /* compiled from: IIdentityBackendService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object setAlias$default(IIdentityBackendService iIdentityBackendService, String str, String str2, String str3, Map map, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAlias");
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return iIdentityBackendService.setAlias(str, str2, str3, map, str4, continuation);
        }

        public static /* synthetic */ Object deleteAlias$default(IIdentityBackendService iIdentityBackendService, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAlias");
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            return iIdentityBackendService.deleteAlias(str, str2, str3, str4, str5, continuation);
        }
    }
}
