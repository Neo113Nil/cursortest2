package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginUserFromSubscriptionOperationExecutor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/LoginUserFromSubscriptionOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_subscriptionBackend", "Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "execute", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "Lcom/onesignal/core/internal/operations/Operation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUser", "loginUserOp", "Lcom/onesignal/user/internal/operations/LoginUserFromSubscriptionOperation;", "(Lcom/onesignal/user/internal/operations/LoginUserFromSubscriptionOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginUserFromSubscriptionOperationExecutor implements IOperationExecutor {
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISubscriptionBackendService _subscriptionBackend;

    /* compiled from: LoginUserFromSubscriptionOperationExecutor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoginUserFromSubscriptionOperationExecutor(ISubscriptionBackendService _subscriptionBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._identityVerificationService = _identityVerificationService;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        Logging.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && ExecutorsIvExtensionsKt.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            Logging.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        Operation operation = (Operation) CollectionsKt.first((List) list);
        if (operation instanceof LoginUserFromSubscriptionOperation) {
            return loginUser((LoginUserFromSubscriptionOperation) operation, continuation);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: BackendException -> 0x010e, TryCatch #0 {BackendException -> 0x010e, blocks: (B:11:0x0035, B:12:0x005f, B:16:0x0071, B:19:0x0099, B:21:0x00c5, B:22:0x00d3, B:24:0x00e1, B:25:0x00ef, B:31:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[Catch: BackendException -> 0x010e, TryCatch #0 {BackendException -> 0x010e, blocks: (B:11:0x0035, B:12:0x005f, B:16:0x0071, B:19:0x0099, B:21:0x00c5, B:22:0x00d3, B:24:0x00e1, B:25:0x00ef, B:31:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation, Continuation<? super ExecutionResponse> continuation) {
        LoginUserFromSubscriptionOperationExecutor$loginUser$1 loginUserFromSubscriptionOperationExecutor$loginUser$1;
        int i;
        LoginUserFromSubscriptionOperationExecutor loginUserFromSubscriptionOperationExecutor;
        LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation2;
        String str;
        try {
            if (continuation instanceof LoginUserFromSubscriptionOperationExecutor$loginUser$1) {
                loginUserFromSubscriptionOperationExecutor$loginUser$1 = (LoginUserFromSubscriptionOperationExecutor$loginUser$1) continuation;
                if ((loginUserFromSubscriptionOperationExecutor$loginUser$1.label & Integer.MIN_VALUE) != 0) {
                    loginUserFromSubscriptionOperationExecutor$loginUser$1.label -= Integer.MIN_VALUE;
                    Object obj = loginUserFromSubscriptionOperationExecutor$loginUser$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = loginUserFromSubscriptionOperationExecutor$loginUser$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = loginUserFromSubscriptionOperation.getAppId();
                        String subscriptionId = loginUserFromSubscriptionOperation.getSubscriptionId();
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.L$0 = this;
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.L$1 = loginUserFromSubscriptionOperation;
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.label = 1;
                        obj = iSubscriptionBackendService.getIdentityFromSubscription(appId, subscriptionId, loginUserFromSubscriptionOperationExecutor$loginUser$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        loginUserFromSubscriptionOperationExecutor = this;
                        loginUserFromSubscriptionOperation2 = loginUserFromSubscriptionOperation;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        loginUserFromSubscriptionOperation2 = (LoginUserFromSubscriptionOperation) loginUserFromSubscriptionOperationExecutor$loginUser$1.L$1;
                        loginUserFromSubscriptionOperationExecutor = (LoginUserFromSubscriptionOperationExecutor) loginUserFromSubscriptionOperationExecutor$loginUser$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    String str2 = (String) ((Map) obj).get(IdentityConstants.ONESIGNAL_ID);
                    str = str2 != null ? null : str2;
                    if (str != null) {
                        Logging.warn$default("Subscription " + loginUserFromSubscriptionOperation2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(loginUserFromSubscriptionOperation2.getOnesignalId(), str);
                    IdentityModel model = loginUserFromSubscriptionOperationExecutor._identityModelStore.getModel();
                    PropertiesModel model2 = loginUserFromSubscriptionOperationExecutor._propertiesModelStore.getModel();
                    if (Intrinsics.areEqual(model.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                        Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    if (Intrinsics.areEqual(model2.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                        Model.setStringProperty$default(model2, "onesignalId", str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap, CollectionsKt.listOf(new RefreshUserOperation(loginUserFromSubscriptionOperation2.getAppId(), str, loginUserFromSubscriptionOperation2.getExternalId())), null, 8, null);
                }
            }
            if (i != 0) {
            }
            String str22 = (String) ((Map) obj).get(IdentityConstants.ONESIGNAL_ID);
            if (str22 != null) {
            }
            if (str != null) {
            }
        } catch (BackendException e) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i2 == 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, null, 14, null);
            }
            if (i2 == 2) {
                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, null, 14, null);
            }
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        loginUserFromSubscriptionOperationExecutor$loginUser$1 = new LoginUserFromSubscriptionOperationExecutor$loginUser$1(this, continuation);
        Object obj2 = loginUserFromSubscriptionOperationExecutor$loginUser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginUserFromSubscriptionOperationExecutor$loginUser$1.label;
    }
}
