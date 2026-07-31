package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.TimeUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.operations.impl.listeners.SubscriptionModelStoreListener;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RefreshUserOperationExecutor.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\"\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0017H\u0002J\u001c\u0010!\u001a\u00020\"2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020#0\u0016H\u0096@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010&R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/RefreshUserOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_userBackend", "Lcom/onesignal/user/internal/backend/IUserBackendService;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "_subscriptionsModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_buildUserService", "Lcom/onesignal/user/internal/builduser/IRebuildUserService;", "_newRecordState", "Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/backend/IUserBackendService;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/builduser/IRebuildUserService;Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "buildPushSelfHealOperationForStuckSubscription", "Lcom/onesignal/user/internal/operations/UpdateSubscriptionOperation;", "op", "Lcom/onesignal/user/internal/operations/RefreshUserOperation;", "serverSubscription", "Lcom/onesignal/user/internal/backend/SubscriptionObject;", "pushSubscriptionId", "execute", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "Lcom/onesignal/core/internal/operations/Operation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "(Lcom/onesignal/user/internal/operations/RefreshUserOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshUserOperationExecutor implements IOperationExecutor {
    public static final String REFRESH_USER = "refresh-user";
    private final IRebuildUserService _buildUserService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;
    private final IUserBackendService _userBackend;

    /* compiled from: RefreshUserOperationExecutor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SubscriptionObjectType.values().length];
            try {
                iArr[SubscriptionObjectType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionObjectType.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr2[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RefreshUserOperationExecutor(IUserBackendService _userBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, SubscriptionModelStore _subscriptionsModelStore, ConfigModelStore _configModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf(REFRESH_USER);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        Logging.log(LogLevel.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        List<? extends Operation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!(((Operation) it.next()) instanceof RefreshUserOperation)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        Operation operation = (Operation) CollectionsKt.first((List) list);
        if (operation instanceof RefreshUserOperation) {
            return getUser((RefreshUserOperation) operation, continuation);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: BackendException -> 0x003c, TryCatch #1 {BackendException -> 0x003c, blocks: (B:11:0x0038, B:12:0x0079, B:14:0x0091, B:17:0x00a2, B:18:0x00b3, B:20:0x00b9, B:22:0x00ce, B:24:0x00e4, B:25:0x00ef, B:27:0x00f9, B:28:0x0104, B:30:0x010e, B:31:0x011e, B:33:0x0124, B:36:0x0130, B:41:0x0145, B:42:0x016a, B:44:0x0170, B:48:0x018f, B:50:0x019a, B:51:0x01a5, B:53:0x01ad, B:54:0x01af, B:57:0x01c5, B:58:0x01cd, B:60:0x01d8, B:63:0x01e3, B:66:0x01ee, B:69:0x01f9, B:72:0x0204, B:75:0x020f, B:89:0x021a, B:78:0x021f, B:83:0x022b, B:92:0x01c8, B:93:0x01cb, B:94:0x019f, B:97:0x0233, B:99:0x023d, B:100:0x0240, B:102:0x0257, B:103:0x0260), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2 A[Catch: BackendException -> 0x003c, TryCatch #1 {BackendException -> 0x003c, blocks: (B:11:0x0038, B:12:0x0079, B:14:0x0091, B:17:0x00a2, B:18:0x00b3, B:20:0x00b9, B:22:0x00ce, B:24:0x00e4, B:25:0x00ef, B:27:0x00f9, B:28:0x0104, B:30:0x010e, B:31:0x011e, B:33:0x0124, B:36:0x0130, B:41:0x0145, B:42:0x016a, B:44:0x0170, B:48:0x018f, B:50:0x019a, B:51:0x01a5, B:53:0x01ad, B:54:0x01af, B:57:0x01c5, B:58:0x01cd, B:60:0x01d8, B:63:0x01e3, B:66:0x01ee, B:69:0x01f9, B:72:0x0204, B:75:0x020f, B:89:0x021a, B:78:0x021f, B:83:0x022b, B:92:0x01c8, B:93:0x01cb, B:94:0x019f, B:97:0x0233, B:99:0x023d, B:100:0x0240, B:102:0x0257, B:103:0x0260), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(RefreshUserOperation refreshUserOperation, Continuation<? super ExecutionResponse> continuation) {
        RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$1;
        int i;
        RefreshUserOperationExecutor refreshUserOperationExecutor;
        int i2;
        SubscriptionModel subscriptionModel;
        SubscriptionType subscriptionType;
        RefreshUserOperation refreshUserOperation2 = refreshUserOperation;
        if (continuation instanceof RefreshUserOperationExecutor$getUser$1) {
            refreshUserOperationExecutor$getUser$1 = (RefreshUserOperationExecutor$getUser$1) continuation;
            if ((refreshUserOperationExecutor$getUser$1.label & Integer.MIN_VALUE) != 0) {
                refreshUserOperationExecutor$getUser$1.label -= Integer.MIN_VALUE;
                RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$12 = refreshUserOperationExecutor$getUser$1;
                Object obj = refreshUserOperationExecutor$getUser$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refreshUserOperationExecutor$getUser$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(refreshUserOperation2, refreshUserOperation2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    try {
                        IUserBackendService iUserBackendService = this._userBackend;
                        String appId = refreshUserOperation2.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        refreshUserOperationExecutor$getUser$12.L$0 = this;
                        refreshUserOperationExecutor$getUser$12.L$1 = refreshUserOperation2;
                        refreshUserOperationExecutor$getUser$12.label = 1;
                        obj = iUserBackendService.getUser(appId, aliasLabel, aliasValue, jwt, refreshUserOperationExecutor$getUser$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        refreshUserOperationExecutor = this;
                    } catch (BackendException e) {
                        e = e;
                        refreshUserOperationExecutor = this;
                        i2 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i2 != 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i2 == 2) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i2 == 3) {
                            if (e.getStatusCode() == 404 && refreshUserOperationExecutor._newRecordState.isInMissingRetryWindow(refreshUserOperation2.getOnesignalId())) {
                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            List<Operation> rebuildOperationsIfCurrentUser = refreshUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(refreshUserOperation2.getAppId(), refreshUserOperation2.getOnesignalId());
                            if (rebuildOperationsIfCurrentUser == null) {
                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                        }
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    refreshUserOperation2 = (RefreshUserOperation) refreshUserOperationExecutor$getUser$12.L$1;
                    refreshUserOperationExecutor = (RefreshUserOperationExecutor) refreshUserOperationExecutor$getUser$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException e2) {
                        e = e2;
                        i2 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i2 != 1) {
                        }
                    }
                }
                CreateUserResponse createUserResponse = (CreateUserResponse) obj;
                if (Intrinsics.areEqual(refreshUserOperation2.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                IdentityModel identityModel = new IdentityModel();
                for (Map.Entry<String, String> entry : createUserResponse.getIdentities().entrySet()) {
                    identityModel.put((IdentityModel) entry.getKey(), entry.getValue());
                }
                PropertiesModel propertiesModel = new PropertiesModel();
                propertiesModel.setOnesignalId(refreshUserOperation2.getOnesignalId());
                if (createUserResponse.getProperties().getCountry() != null) {
                    propertiesModel.setCountry(createUserResponse.getProperties().getCountry());
                }
                if (createUserResponse.getProperties().getLanguage() != null) {
                    propertiesModel.setLanguage(createUserResponse.getProperties().getLanguage());
                }
                if (createUserResponse.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : createUserResponse.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            MapModel<String> tags = propertiesModel.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            Intrinsics.checkNotNull(value);
                            tags.put((MapModel<String>) key, value);
                        }
                    }
                }
                propertiesModel.setTimezone(TimeUtils.INSTANCE.getTimeZoneId());
                String pushSubscriptionId = refreshUserOperationExecutor._configModelStore.getModel().getPushSubscriptionId();
                ArrayList arrayList = new ArrayList();
                UpdateSubscriptionOperation updateSubscriptionOperation = null;
                for (SubscriptionObject subscriptionObject : createUserResponse.getSubscriptions()) {
                    SubscriptionModel subscriptionModel2 = new SubscriptionModel();
                    String id = subscriptionObject.getId();
                    Intrinsics.checkNotNull(id);
                    subscriptionModel2.setId(id);
                    String token = subscriptionObject.getToken();
                    if (token == null) {
                        token = "";
                    }
                    subscriptionModel2.setAddress(token);
                    SubscriptionStatus.Companion companion = SubscriptionStatus.INSTANCE;
                    Integer notificationTypes = subscriptionObject.getNotificationTypes();
                    SubscriptionStatus fromInt = companion.fromInt(notificationTypes != null ? notificationTypes.intValue() : SubscriptionStatus.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = SubscriptionStatus.SUBSCRIBED;
                    }
                    subscriptionModel2.setStatus(fromInt);
                    SubscriptionObjectType type = subscriptionObject.getType();
                    Intrinsics.checkNotNull(type);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i3 == 1) {
                        subscriptionType = SubscriptionType.EMAIL;
                    } else if (i3 == 2) {
                        subscriptionType = SubscriptionType.SMS;
                    } else {
                        subscriptionType = SubscriptionType.PUSH;
                    }
                    subscriptionModel2.setType(subscriptionType);
                    subscriptionModel2.setOptedIn((subscriptionModel2.getStatus() == SubscriptionStatus.UNSUBSCRIBE || subscriptionModel2.getStatus() == SubscriptionStatus.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = subscriptionObject.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    subscriptionModel2.setSdk(sdk);
                    String deviceOS = subscriptionObject.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    subscriptionModel2.setDeviceOS(deviceOS);
                    String carrier = subscriptionObject.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    subscriptionModel2.setCarrier(carrier);
                    String appVersion = subscriptionObject.getAppVersion();
                    if (appVersion == null) {
                        appVersion = "";
                    }
                    subscriptionModel2.setAppVersion(appVersion);
                    if (subscriptionModel2.getType() != SubscriptionType.PUSH) {
                        arrayList.add(subscriptionModel2);
                    } else if (Intrinsics.areEqual(subscriptionObject.getId(), pushSubscriptionId) && updateSubscriptionOperation == null) {
                        updateSubscriptionOperation = refreshUserOperationExecutor.buildPushSelfHealOperationForStuckSubscription(refreshUserOperation2, subscriptionObject, pushSubscriptionId);
                    }
                }
                if (pushSubscriptionId != null && (subscriptionModel = (SubscriptionModel) refreshUserOperationExecutor._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(subscriptionModel);
                }
                refreshUserOperationExecutor._identityModelStore.replace(identityModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._propertiesModelStore.replace(propertiesModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._subscriptionsModelStore.replaceAll(arrayList, ModelChangeTags.HYDRATE);
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, updateSubscriptionOperation != null ? CollectionsKt.listOf(updateSubscriptionOperation) : null, null, 10, null);
            }
        }
        refreshUserOperationExecutor$getUser$1 = new RefreshUserOperationExecutor$getUser$1(this, continuation);
        RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$122 = refreshUserOperationExecutor$getUser$1;
        Object obj2 = refreshUserOperationExecutor$getUser$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refreshUserOperationExecutor$getUser$122.label;
        if (i != 0) {
        }
        CreateUserResponse createUserResponse2 = (CreateUserResponse) obj2;
        if (Intrinsics.areEqual(refreshUserOperation2.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final UpdateSubscriptionOperation buildPushSelfHealOperationForStuckSubscription(RefreshUserOperation op, SubscriptionObject serverSubscription, String pushSubscriptionId) {
        boolean z;
        SubscriptionModel subscriptionModel = (SubscriptionModel) this._subscriptionsModelStore.get(pushSubscriptionId);
        if (subscriptionModel != null && subscriptionModel.getType() == SubscriptionType.PUSH) {
            Pair<Boolean, SubscriptionStatus> subscriptionEnabledAndStatus = SubscriptionModelStoreListener.INSTANCE.getSubscriptionEnabledAndStatus(subscriptionModel);
            boolean booleanValue = subscriptionEnabledAndStatus.component1().booleanValue();
            SubscriptionStatus component2 = subscriptionEnabledAndStatus.component2();
            if (Intrinsics.areEqual((Object) serverSubscription.getEnabled(), (Object) true)) {
                Integer notificationTypes = serverSubscription.getNotificationTypes();
                if ((notificationTypes != null ? notificationTypes.intValue() : 0) > 0) {
                    z = true;
                    if ((booleanValue || z) ? false : true) {
                        Logging.info$default("RefreshUserOperationExecutor: push subscription " + pushSubscriptionId + " diverged from server (server enabled=" + serverSubscription.getEnabled() + " notificationTypes=" + serverSubscription.getNotificationTypes() + "; local opted-in and SUBSCRIBED). Enqueuing follow-up update-subscription op to re-assert local truth via PATCH /subscriptions/{id}.", null, 2, null);
                        return new UpdateSubscriptionOperation(op.getAppId(), op.getOnesignalId(), this._identityModelStore.getModel().getExternalId(), pushSubscriptionId, subscriptionModel.getType(), booleanValue, subscriptionModel.getAddress(), component2);
                    }
                }
            }
            z = false;
            if ((booleanValue || z) ? false : true) {
            }
        }
        return null;
    }
}
