package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.android.billingclient.api.BillingClient;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
import com.onesignal.common.TimeUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/* compiled from: LoginUserOperationExecutor.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 32\u00020\u0001:\u00013Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ0\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!H\u0002J0\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020&2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!H\u0002J0\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020'2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!H\u0002J0\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020(2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\"0!H\u0002J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020-0\u001cH\u0082@¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020*2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020-0\u001cH\u0096@¢\u0006\u0002\u00100J$\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020,2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020-0\u001cH\u0082@¢\u0006\u0002\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/LoginUserOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_identityOperationExecutor", "Lcom/onesignal/user/internal/operations/impl/executors/IdentityOperationExecutor;", "_application", "Lcom/onesignal/core/internal/application/IApplicationService;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_userBackend", "Lcom/onesignal/user/internal/backend/IUserBackendService;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "_subscriptionsModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_languageContext", "Lcom/onesignal/core/internal/language/ILanguageContext;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "_consistencyManager", "Lcom/onesignal/common/consistency/models/IConsistencyManager;", "(Lcom/onesignal/user/internal/operations/impl/executors/IdentityOperationExecutor;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/user/internal/backend/IUserBackendService;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/language/ILanguageContext;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;Lcom/onesignal/common/consistency/models/IConsistencyManager;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "createSubscriptionsFromOperation", "", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "operation", "Lcom/onesignal/user/internal/operations/CreateSubscriptionOperation;", BillingClient.FeatureType.SUBSCRIPTIONS, "Lcom/onesignal/user/internal/operations/DeleteSubscriptionOperation;", "Lcom/onesignal/user/internal/operations/TransferSubscriptionOperation;", "Lcom/onesignal/user/internal/operations/UpdateSubscriptionOperation;", "createUser", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "createUserOperation", "Lcom/onesignal/user/internal/operations/LoginUserOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "(Lcom/onesignal/user/internal/operations/LoginUserOperation;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUser", "loginUserOp", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginUserOperationExecutor implements IOperationExecutor {
    public static final String LOGIN_USER = "login-user";
    private final IApplicationService _application;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IdentityOperationExecutor _identityOperationExecutor;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final ILanguageContext _languageContext;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;
    private final IUserBackendService _userBackend;

    /* compiled from: LoginUserOperationExecutor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ExecutionResult.values().length];
            try {
                iArr[ExecutionResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExecutionResult.FAIL_CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExecutionResult.FAIL_NORETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr2[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SubscriptionType.values().length];
            try {
                iArr3[SubscriptionType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SubscriptionType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public LoginUserOperationExecutor(IdentityOperationExecutor _identityOperationExecutor, IApplicationService _application, IDeviceService _deviceService, IUserBackendService _userBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, SubscriptionModelStore _subscriptionsModelStore, ConfigModelStore _configModelStore, ILanguageContext _languageContext, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService, IConsistencyManager _consistencyManager) {
        Intrinsics.checkNotNullParameter(_identityOperationExecutor, "_identityOperationExecutor");
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this._consistencyManager = _consistencyManager;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf(LOGIN_USER);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        Logging.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        Operation operation = (Operation) CollectionsKt.first((List) list);
        if (operation instanceof LoginUserOperation) {
            return loginUser((LoginUserOperation) operation, CollectionsKt.drop(list, 1), continuation);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        LoginUserOperationExecutor$loginUser$1 loginUserOperationExecutor$loginUser$1;
        int i;
        LoginUserOperationExecutor loginUserOperationExecutor;
        int i2;
        String str;
        LoginUserOperation loginUserOperation2 = loginUserOperation;
        List<? extends Operation> list2 = list;
        if (continuation instanceof LoginUserOperationExecutor$loginUser$1) {
            loginUserOperationExecutor$loginUser$1 = (LoginUserOperationExecutor$loginUser$1) continuation;
            if ((loginUserOperationExecutor$loginUser$1.label & Integer.MIN_VALUE) != 0) {
                loginUserOperationExecutor$loginUser$1.label -= Integer.MIN_VALUE;
                Object obj = loginUserOperationExecutor$loginUser$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loginUserOperationExecutor$loginUser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<? extends Operation> list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (Operation operation : list3) {
                            if ((operation instanceof CreateSubscriptionOperation) || (operation instanceof TransferSubscriptionOperation)) {
                                break;
                            }
                        }
                    }
                    if (loginUserOperation2.getExternalId() == null) {
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (loginUserOperation2.getExistingOnesignalId() == null || loginUserOperation2.getExternalId() == null || this._identityVerificationService.getIvBehaviorActive()) {
                        loginUserOperationExecutor$loginUser$1.label = 1;
                        Object createUser = createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                        if (createUser != coroutine_suspended) {
                            return createUser;
                        }
                    } else {
                        IdentityOperationExecutor identityOperationExecutor = this._identityOperationExecutor;
                        String appId = loginUserOperation2.getAppId();
                        String existingOnesignalId = loginUserOperation2.getExistingOnesignalId();
                        Intrinsics.checkNotNull(existingOnesignalId);
                        String externalId = loginUserOperation2.getExternalId();
                        String externalId2 = loginUserOperation2.getExternalId();
                        Intrinsics.checkNotNull(externalId2);
                        List<? extends Operation> listOf = CollectionsKt.listOf(new SetAliasOperation(appId, existingOnesignalId, externalId, IdentityConstants.EXTERNAL_ID, externalId2));
                        loginUserOperationExecutor$loginUser$1.L$0 = this;
                        loginUserOperationExecutor$loginUser$1.L$1 = loginUserOperation2;
                        loginUserOperationExecutor$loginUser$1.L$2 = list2;
                        loginUserOperationExecutor$loginUser$1.label = 2;
                        obj = identityOperationExecutor.execute(listOf, loginUserOperationExecutor$loginUser$1);
                        if (obj != coroutine_suspended) {
                            loginUserOperationExecutor = this;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                List<? extends Operation> list4 = (List) loginUserOperationExecutor$loginUser$1.L$2;
                LoginUserOperation loginUserOperation3 = (LoginUserOperation) loginUserOperationExecutor$loginUser$1.L$1;
                loginUserOperationExecutor = (LoginUserOperationExecutor) loginUserOperationExecutor$loginUser$1.L$0;
                ResultKt.throwOnFailure(obj);
                list2 = list4;
                loginUserOperation2 = loginUserOperation3;
                ExecutionResponse executionResponse = (ExecutionResponse) obj;
                i2 = WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()];
                if (i2 != 1) {
                    String existingOnesignalId2 = loginUserOperation2.getExistingOnesignalId();
                    Intrinsics.checkNotNull(existingOnesignalId2);
                    if (Intrinsics.areEqual(loginUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                        str = existingOnesignalId2;
                        Model.setStringProperty$default(loginUserOperationExecutor._identityModelStore.getModel(), IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                    } else {
                        str = existingOnesignalId2;
                    }
                    if (Intrinsics.areEqual(loginUserOperationExecutor._propertiesModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                        String str2 = str;
                        Model.setStringProperty$default(loginUserOperationExecutor._propertiesModelStore.getModel(), "onesignalId", str2, ModelChangeTags.HYDRATE, false, 8, null);
                        str = str2;
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS_STARTING_ONLY, MapsKt.mapOf(TuplesKt.to(loginUserOperation2.getOnesignalId(), str)), null, null, 12, null);
                }
                if (i2 == 2) {
                    Logging.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + '\"', null, 2, null);
                    loginUserOperationExecutor$loginUser$1.L$0 = null;
                    loginUserOperationExecutor$loginUser$1.L$1 = null;
                    loginUserOperationExecutor$loginUser$1.L$2 = null;
                    loginUserOperationExecutor$loginUser$1.label = 3;
                    Object createUser2 = loginUserOperationExecutor.createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                    if (createUser2 != coroutine_suspended) {
                        return createUser2;
                    }
                } else if (i2 == 3) {
                    Logging.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + '\"', null, 2, null);
                    loginUserOperationExecutor$loginUser$1.L$0 = null;
                    loginUserOperationExecutor$loginUser$1.L$1 = null;
                    loginUserOperationExecutor$loginUser$1.L$2 = null;
                    loginUserOperationExecutor$loginUser$1.label = 4;
                    Object createUser3 = loginUserOperationExecutor.createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                    if (createUser3 != coroutine_suspended) {
                        return createUser3;
                    }
                } else {
                    return new ExecutionResponse(executionResponse.getResult(), null, null, null, 14, null);
                }
                return coroutine_suspended;
            }
        }
        loginUserOperationExecutor$loginUser$1 = new LoginUserOperationExecutor$loginUser$1(this, continuation);
        Object obj2 = loginUserOperationExecutor$loginUser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginUserOperationExecutor$loginUser$1.label;
        if (i != 0) {
        }
        ExecutionResponse executionResponse2 = (ExecutionResponse) obj2;
        i2 = WhenMappings.$EnumSwitchMapping$0[executionResponse2.getResult().ordinal()];
        if (i2 != 1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0345 A[Catch: BackendException -> 0x006b, TryCatch #0 {BackendException -> 0x006b, blocks: (B:12:0x0040, B:15:0x033f, B:17:0x0345, B:18:0x0356, B:25:0x005e, B:27:0x0154, B:29:0x0193, B:30:0x01a8, B:32:0x01b6, B:33:0x01cc, B:34:0x01da, B:36:0x01e0, B:37:0x01ed, B:39:0x01f3, B:44:0x020f, B:46:0x0213, B:47:0x021a, B:49:0x0220, B:51:0x023b, B:53:0x0243, B:56:0x024d, B:64:0x0253, B:65:0x025a, B:67:0x0260, B:71:0x0279, B:77:0x0281, B:79:0x02a5, B:80:0x02b4, B:82:0x02c4, B:85:0x02fc, B:86:0x02de, B:91:0x030c, B:93:0x0315, B:95:0x031b, B:135:0x00ff, B:136:0x0128, B:138:0x012e, B:140:0x013e), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193 A[Catch: BackendException -> 0x006b, TryCatch #0 {BackendException -> 0x006b, blocks: (B:12:0x0040, B:15:0x033f, B:17:0x0345, B:18:0x0356, B:25:0x005e, B:27:0x0154, B:29:0x0193, B:30:0x01a8, B:32:0x01b6, B:33:0x01cc, B:34:0x01da, B:36:0x01e0, B:37:0x01ed, B:39:0x01f3, B:44:0x020f, B:46:0x0213, B:47:0x021a, B:49:0x0220, B:51:0x023b, B:53:0x0243, B:56:0x024d, B:64:0x0253, B:65:0x025a, B:67:0x0260, B:71:0x0279, B:77:0x0281, B:79:0x02a5, B:80:0x02b4, B:82:0x02c4, B:85:0x02fc, B:86:0x02de, B:91:0x030c, B:93:0x0315, B:95:0x031b, B:135:0x00ff, B:136:0x0128, B:138:0x012e, B:140:0x013e), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6 A[Catch: BackendException -> 0x006b, TryCatch #0 {BackendException -> 0x006b, blocks: (B:12:0x0040, B:15:0x033f, B:17:0x0345, B:18:0x0356, B:25:0x005e, B:27:0x0154, B:29:0x0193, B:30:0x01a8, B:32:0x01b6, B:33:0x01cc, B:34:0x01da, B:36:0x01e0, B:37:0x01ed, B:39:0x01f3, B:44:0x020f, B:46:0x0213, B:47:0x021a, B:49:0x0220, B:51:0x023b, B:53:0x0243, B:56:0x024d, B:64:0x0253, B:65:0x025a, B:67:0x0260, B:71:0x0279, B:77:0x0281, B:79:0x02a5, B:80:0x02b4, B:82:0x02c4, B:85:0x02fc, B:86:0x02de, B:91:0x030c, B:93:0x0315, B:95:0x031b, B:135:0x00ff, B:136:0x0128, B:138:0x012e, B:140:0x013e), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e0 A[Catch: BackendException -> 0x006b, TryCatch #0 {BackendException -> 0x006b, blocks: (B:12:0x0040, B:15:0x033f, B:17:0x0345, B:18:0x0356, B:25:0x005e, B:27:0x0154, B:29:0x0193, B:30:0x01a8, B:32:0x01b6, B:33:0x01cc, B:34:0x01da, B:36:0x01e0, B:37:0x01ed, B:39:0x01f3, B:44:0x020f, B:46:0x0213, B:47:0x021a, B:49:0x0220, B:51:0x023b, B:53:0x0243, B:56:0x024d, B:64:0x0253, B:65:0x025a, B:67:0x0260, B:71:0x0279, B:77:0x0281, B:79:0x02a5, B:80:0x02b4, B:82:0x02c4, B:85:0x02fc, B:86:0x02de, B:91:0x030c, B:93:0x0315, B:95:0x031b, B:135:0x00ff, B:136:0x0128, B:138:0x012e, B:140:0x013e), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        LoginUserOperationExecutor$createUser$1 loginUserOperationExecutor$createUser$1;
        int i;
        Map<String, String> map;
        List<Pair> list2;
        Object createUser;
        LoginUserOperationExecutor loginUserOperationExecutor;
        LinkedHashMap linkedHashMap;
        IdentityModel model;
        PropertiesModel model2;
        String str;
        String str2;
        List list3;
        LinkedHashMap linkedHashMap2;
        RywData rywData;
        LoginUserOperation loginUserOperation2;
        Map<String, String> map2;
        LinkedHashMap linkedHashMap3;
        String str3;
        Object obj;
        SubscriptionObject subscriptionObject;
        SubscriptionObject subscriptionObject2;
        String token;
        LoginUserOperation loginUserOperation3 = loginUserOperation;
        try {
            if (continuation instanceof LoginUserOperationExecutor$createUser$1) {
                loginUserOperationExecutor$createUser$1 = (LoginUserOperationExecutor$createUser$1) continuation;
                if ((loginUserOperationExecutor$createUser$1.label & Integer.MIN_VALUE) != 0) {
                    loginUserOperationExecutor$createUser$1.label -= Integer.MIN_VALUE;
                    LoginUserOperationExecutor$createUser$1 loginUserOperationExecutor$createUser$12 = loginUserOperationExecutor$createUser$1;
                    Object obj2 = loginUserOperationExecutor$createUser$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = loginUserOperationExecutor$createUser$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Map<String, String> emptyMap = MapsKt.emptyMap();
                        Map<String, SubscriptionObject> emptyMap2 = MapsKt.emptyMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("timezone_id", TimeUtils.INSTANCE.getTimeZoneId());
                        linkedHashMap4.put("language", this._languageContext.getLanguage());
                        if (loginUserOperation3.getExternalId() != null) {
                            emptyMap = MapsKt.toMutableMap(emptyMap);
                            String externalId = loginUserOperation3.getExternalId();
                            Intrinsics.checkNotNull(externalId);
                            emptyMap.put(IdentityConstants.EXTERNAL_ID, externalId);
                        }
                        map = emptyMap;
                        for (Operation operation : list) {
                            if (operation instanceof CreateSubscriptionOperation) {
                                emptyMap2 = createSubscriptionsFromOperation((CreateSubscriptionOperation) operation, emptyMap2);
                            } else if (operation instanceof TransferSubscriptionOperation) {
                                emptyMap2 = createSubscriptionsFromOperation((TransferSubscriptionOperation) operation, emptyMap2);
                            } else if (operation instanceof UpdateSubscriptionOperation) {
                                emptyMap2 = createSubscriptionsFromOperation((UpdateSubscriptionOperation) operation, emptyMap2);
                            } else {
                                if (!(operation instanceof DeleteSubscriptionOperation)) {
                                    throw new Exception("Unrecognized operation: " + operation);
                                }
                                emptyMap2 = createSubscriptionsFromOperation((DeleteSubscriptionOperation) operation, emptyMap2);
                            }
                        }
                        list2 = MapsKt.toList(emptyMap2);
                        String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(loginUserOperation3, this._jwtTokenStore, this._identityVerificationService);
                        IUserBackendService iUserBackendService = this._userBackend;
                        String appId = loginUserOperation3.getAppId();
                        List list4 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add((SubscriptionObject) ((Pair) it.next()).getSecond());
                        }
                        loginUserOperationExecutor$createUser$12.L$0 = this;
                        loginUserOperationExecutor$createUser$12.L$1 = loginUserOperation3;
                        loginUserOperationExecutor$createUser$12.L$2 = map;
                        loginUserOperationExecutor$createUser$12.L$3 = list2;
                        loginUserOperationExecutor$createUser$12.label = 1;
                        createUser = iUserBackendService.createUser(appId, map, arrayList, linkedHashMap4, resolveJwt, loginUserOperationExecutor$createUser$12);
                        if (createUser == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        loginUserOperationExecutor = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (String) loginUserOperationExecutor$createUser$12.L$3;
                            ?? r3 = (Map) loginUserOperationExecutor$createUser$12.L$2;
                            map2 = (Map) loginUserOperationExecutor$createUser$12.L$1;
                            loginUserOperation2 = (LoginUserOperation) loginUserOperationExecutor$createUser$12.L$0;
                            ResultKt.throwOnFailure(obj2);
                            list3 = null;
                            linkedHashMap3 = r3;
                            str2 = str3;
                            linkedHashMap2 = linkedHashMap3;
                            map = map2;
                            loginUserOperation3 = loginUserOperation2;
                            if (!map.isEmpty()) {
                                list3 = CollectionsKt.listOf(new RefreshUserOperation(loginUserOperation3.getAppId(), str2, loginUserOperation3.getExternalId()));
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, list3, null, 8, null);
                        }
                        List list5 = (List) loginUserOperationExecutor$createUser$12.L$3;
                        Map<String, String> map3 = (Map) loginUserOperationExecutor$createUser$12.L$2;
                        LoginUserOperation loginUserOperation4 = (LoginUserOperation) loginUserOperationExecutor$createUser$12.L$1;
                        LoginUserOperationExecutor loginUserOperationExecutor2 = (LoginUserOperationExecutor) loginUserOperationExecutor$createUser$12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        list2 = list5;
                        loginUserOperation3 = loginUserOperation4;
                        loginUserOperationExecutor = loginUserOperationExecutor2;
                        map = map3;
                        createUser = obj2;
                    }
                    CreateUserResponse createUserResponse = (CreateUserResponse) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str4 = createUserResponse.getIdentities().get(IdentityConstants.ONESIGNAL_ID);
                    Intrinsics.checkNotNull(str4);
                    String str5 = str4;
                    linkedHashMap.put(loginUserOperation3.getOnesignalId(), str5);
                    model = loginUserOperationExecutor._identityModelStore.getModel();
                    model2 = loginUserOperationExecutor._propertiesModelStore.getModel();
                    if (Intrinsics.areEqual(model.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
                        str = str5;
                    } else {
                        str = str5;
                        Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    if (Intrinsics.areEqual(model2.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
                        str2 = str;
                    } else {
                        Model.setStringProperty$default(model2, "onesignalId", str, ModelChangeTags.HYDRATE, false, 8, null);
                        str2 = str;
                    }
                    Set mutableSet = CollectionsKt.toMutableSet(createUserResponse.getSubscriptions());
                    for (Pair pair : list2) {
                        Iterator it2 = mutableSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.areEqual(((SubscriptionObject) obj).getId(), pair.getFirst())) {
                                break;
                            }
                        }
                        SubscriptionObject subscriptionObject3 = (SubscriptionObject) obj;
                        if (subscriptionObject3 == null) {
                            Iterator it3 = mutableSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    subscriptionObject2 = 0;
                                    break;
                                }
                                subscriptionObject2 = it3.next();
                                SubscriptionObject subscriptionObject4 = (SubscriptionObject) subscriptionObject2;
                                if (Intrinsics.areEqual(subscriptionObject4.getToken(), ((SubscriptionObject) pair.getSecond()).getToken()) && (token = subscriptionObject4.getToken()) != null && !StringsKt.isBlank(token)) {
                                    break;
                                }
                            }
                            subscriptionObject3 = subscriptionObject2;
                        }
                        if (subscriptionObject3 == null) {
                            Iterator it4 = mutableSet.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    subscriptionObject = null;
                                    break;
                                }
                                ?? next = it4.next();
                                if (((SubscriptionObject) next).getType() == ((SubscriptionObject) pair.getSecond()).getType()) {
                                    subscriptionObject = next;
                                    break;
                                }
                            }
                            subscriptionObject3 = subscriptionObject;
                        }
                        SubscriptionObject subscriptionObject5 = subscriptionObject3;
                        if (subscriptionObject5 != null) {
                            Object first = pair.getFirst();
                            String id = subscriptionObject5.getId();
                            Intrinsics.checkNotNull(id);
                            linkedHashMap.put(first, id);
                            if (Intrinsics.areEqual(loginUserOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), pair.getFirst())) {
                                loginUserOperationExecutor._configModelStore.getModel().setPushSubscriptionId(subscriptionObject5.getId());
                            }
                            SubscriptionModel subscriptionModel = (SubscriptionModel) loginUserOperationExecutor._subscriptionsModelStore.get((String) pair.getFirst());
                            if (subscriptionModel != null) {
                                String id2 = subscriptionObject5.getId();
                                Intrinsics.checkNotNull(id2);
                                Model.setStringProperty$default(subscriptionModel, "id", id2, ModelChangeTags.HYDRATE, false, 8, null);
                            }
                        } else {
                            Logging.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) pair.getFirst()), null, 2, null);
                        }
                        TypeIntrinsics.asMutableCollection(mutableSet).remove(subscriptionObject5);
                    }
                    list3 = null;
                    if (!loginUserOperationExecutor._identityVerificationService.getNewCodePathsRun() && (rywData = createUserResponse.getRywData()) != null) {
                        IConsistencyManager iConsistencyManager = loginUserOperationExecutor._consistencyManager;
                        IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.USER;
                        loginUserOperationExecutor$createUser$12.L$0 = loginUserOperation3;
                        loginUserOperationExecutor$createUser$12.L$1 = map;
                        loginUserOperationExecutor$createUser$12.L$2 = linkedHashMap;
                        loginUserOperationExecutor$createUser$12.L$3 = str2;
                        loginUserOperationExecutor$createUser$12.label = 2;
                        if (iConsistencyManager.setRywData(str2, iamFetchRywTokenKey, rywData, loginUserOperationExecutor$createUser$12) != coroutine_suspended) {
                            loginUserOperation2 = loginUserOperation3;
                            map2 = map;
                            linkedHashMap3 = linkedHashMap;
                            str3 = str2;
                            str2 = str3;
                            linkedHashMap2 = linkedHashMap3;
                            map = map2;
                            loginUserOperation3 = loginUserOperation2;
                            if (!map.isEmpty()) {
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, list3, null, 8, null);
                        }
                        return coroutine_suspended;
                    }
                    linkedHashMap2 = linkedHashMap;
                    if (!map.isEmpty()) {
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, list3, null, 8, null);
                }
            }
            if (i != 0) {
            }
            CreateUserResponse createUserResponse2 = (CreateUserResponse) createUser;
            linkedHashMap = new LinkedHashMap();
            String str42 = createUserResponse2.getIdentities().get(IdentityConstants.ONESIGNAL_ID);
            Intrinsics.checkNotNull(str42);
            String str52 = str42;
            linkedHashMap.put(loginUserOperation3.getOnesignalId(), str52);
            model = loginUserOperationExecutor._identityModelStore.getModel();
            model2 = loginUserOperationExecutor._propertiesModelStore.getModel();
            if (Intrinsics.areEqual(model.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
            }
            if (Intrinsics.areEqual(model2.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(createUserResponse2.getSubscriptions());
            while (r2.hasNext()) {
            }
            list3 = null;
            if (!loginUserOperationExecutor._identityVerificationService.getNewCodePathsRun()) {
            }
            linkedHashMap2 = linkedHashMap;
            if (!map.isEmpty()) {
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, list3, null, 8, null);
        } catch (BackendException e) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i2 == 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i2 == 2) {
                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return new ExecutionResponse(ExecutionResult.FAIL_PAUSE_OPREPO, null, null, null, 14, null);
        }
        loginUserOperationExecutor$createUser$1 = new LoginUserOperationExecutor$createUser$1(this, continuation);
        LoginUserOperationExecutor$createUser$1 loginUserOperationExecutor$createUser$122 = loginUserOperationExecutor$createUser$1;
        Object obj22 = loginUserOperationExecutor$createUser$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginUserOperationExecutor$createUser$122.label;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(TransferSubscriptionOperation operation, Map<String, SubscriptionObject> subscriptions) {
        Map<String, SubscriptionObject> mutableMap = MapsKt.toMutableMap(subscriptions);
        if (mutableMap.containsKey(operation.getSubscriptionId())) {
            String subscriptionId = operation.getSubscriptionId();
            String subscriptionId2 = operation.getSubscriptionId();
            SubscriptionObject subscriptionObject = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject);
            SubscriptionObjectType type = subscriptionObject.getType();
            SubscriptionObject subscriptionObject2 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject2);
            String token = subscriptionObject2.getToken();
            SubscriptionObject subscriptionObject3 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject3);
            Boolean enabled = subscriptionObject3.getEnabled();
            SubscriptionObject subscriptionObject4 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject4);
            Integer notificationTypes = subscriptionObject4.getNotificationTypes();
            SubscriptionObject subscriptionObject5 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject5);
            String sdk = subscriptionObject5.getSdk();
            SubscriptionObject subscriptionObject6 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject6);
            String deviceModel = subscriptionObject6.getDeviceModel();
            SubscriptionObject subscriptionObject7 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject7);
            String deviceOS = subscriptionObject7.getDeviceOS();
            SubscriptionObject subscriptionObject8 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject8);
            Boolean rooted = subscriptionObject8.getRooted();
            SubscriptionObject subscriptionObject9 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject9);
            Integer netType = subscriptionObject9.getNetType();
            SubscriptionObject subscriptionObject10 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject10);
            String carrier = subscriptionObject10.getCarrier();
            SubscriptionObject subscriptionObject11 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject11);
            mutableMap.put(subscriptionId, new SubscriptionObject(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject11.getAppVersion()));
            return mutableMap;
        }
        mutableMap.put(operation.getSubscriptionId(), new SubscriptionObject(operation.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        return mutableMap;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(CreateSubscriptionOperation operation, Map<String, SubscriptionObject> subscriptions) {
        SubscriptionObjectType subscriptionObjectType;
        Map<String, SubscriptionObject> mutableMap = MapsKt.toMutableMap(subscriptions);
        int i = WhenMappings.$EnumSwitchMapping$2[operation.getType().ordinal()];
        if (i == 1) {
            subscriptionObjectType = SubscriptionObjectType.SMS;
        } else if (i == 2) {
            subscriptionObjectType = SubscriptionObjectType.EMAIL;
        } else {
            subscriptionObjectType = SubscriptionObjectType.INSTANCE.fromDeviceType(this._deviceService.getDeviceType());
        }
        mutableMap.put(operation.getSubscriptionId(), new SubscriptionObject(!IDManager.INSTANCE.isLocalId(operation.getSubscriptionId()) ? operation.getSubscriptionId() : null, subscriptionObjectType, operation.getAddress(), Boolean.valueOf(operation.getEnabled()), Integer.valueOf(operation.getStatus().getValue()), OneSignalUtils.INSTANCE.getSdkVersion(), Build.MODEL, Build.VERSION.RELEASE, Boolean.valueOf(RootToolsInternalMethods.INSTANCE.isRooted()), DeviceUtils.INSTANCE.getNetType(this._application.getAppContext()), DeviceUtils.INSTANCE.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return mutableMap;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(UpdateSubscriptionOperation operation, Map<String, SubscriptionObject> subscriptions) {
        Map<String, SubscriptionObject> mutableMap = MapsKt.toMutableMap(subscriptions);
        if (mutableMap.containsKey(operation.getSubscriptionId())) {
            String subscriptionId = operation.getSubscriptionId();
            SubscriptionObject subscriptionObject = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject);
            String id = subscriptionObject.getId();
            SubscriptionObject subscriptionObject2 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject2);
            SubscriptionObjectType type = subscriptionObject2.getType();
            String address = operation.getAddress();
            Boolean valueOf = Boolean.valueOf(operation.getEnabled());
            Integer valueOf2 = Integer.valueOf(operation.getStatus().getValue());
            SubscriptionObject subscriptionObject3 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject3);
            String sdk = subscriptionObject3.getSdk();
            SubscriptionObject subscriptionObject4 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject4);
            String deviceModel = subscriptionObject4.getDeviceModel();
            SubscriptionObject subscriptionObject5 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject5);
            String deviceOS = subscriptionObject5.getDeviceOS();
            SubscriptionObject subscriptionObject6 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject6);
            Boolean rooted = subscriptionObject6.getRooted();
            SubscriptionObject subscriptionObject7 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject7);
            Integer netType = subscriptionObject7.getNetType();
            SubscriptionObject subscriptionObject8 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject8);
            String carrier = subscriptionObject8.getCarrier();
            SubscriptionObject subscriptionObject9 = subscriptions.get(operation.getSubscriptionId());
            Intrinsics.checkNotNull(subscriptionObject9);
            mutableMap.put(subscriptionId, new SubscriptionObject(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject9.getAppVersion()));
        }
        return mutableMap;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(DeleteSubscriptionOperation operation, Map<String, SubscriptionObject> subscriptions) {
        Map<String, SubscriptionObject> mutableMap = MapsKt.toMutableMap(subscriptions);
        mutableMap.remove(operation.getSubscriptionId());
        return mutableMap;
    }
}
