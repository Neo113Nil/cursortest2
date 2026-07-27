package com.onesignal.user.internal.operations.impl.executors;

import K1.b;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.TimeUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.ModelChangeTags;
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
import e5.g;
import f4.C0430g;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class RefreshUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
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

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

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
        i.e(_userBackend, "_userBackend");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        i.e(_configModelStore, "_configModelStore");
        i.e(_buildUserService, "_buildUserService");
        i.e(_newRecordState, "_newRecordState");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final UpdateSubscriptionOperation buildPushSelfHealOperationForStuckSubscription(RefreshUserOperation refreshUserOperation, SubscriptionObject subscriptionObject, String str) {
        boolean z;
        SubscriptionModel subscriptionModel = (SubscriptionModel) this._subscriptionsModelStore.get(str);
        if (subscriptionModel == null || subscriptionModel.getType() != SubscriptionType.PUSH) {
            return null;
        }
        C0430g subscriptionEnabledAndStatus = SubscriptionModelStoreListener.Companion.getSubscriptionEnabledAndStatus(subscriptionModel);
        boolean booleanValue = ((Boolean) subscriptionEnabledAndStatus.f5668a).booleanValue();
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) subscriptionEnabledAndStatus.f5669b;
        if (i.a(subscriptionObject.getEnabled(), Boolean.TRUE)) {
            Integer notificationTypes = subscriptionObject.getNotificationTypes();
            if ((notificationTypes != null ? notificationTypes.intValue() : 0) > 0) {
                z = true;
                if ((booleanValue || z) ? false : true) {
                    return null;
                }
                Logging.info$default("RefreshUserOperationExecutor: push subscription " + str + " diverged from server (server enabled=" + subscriptionObject.getEnabled() + " notificationTypes=" + subscriptionObject.getNotificationTypes() + "; local opted-in and SUBSCRIBED). Enqueuing follow-up update-subscription op to re-assert local truth via PATCH /subscriptions/{id}.", null, 2, null);
                return new UpdateSubscriptionOperation(refreshUserOperation.getAppId(), refreshUserOperation.getOnesignalId(), this._identityModelStore.getModel().getExternalId(), str, subscriptionModel.getType(), booleanValue, subscriptionModel.getAddress(), subscriptionStatus);
            }
        }
        z = false;
        if ((booleanValue || z) ? false : true) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: BackendException -> 0x003a, TryCatch #1 {BackendException -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009e, B:19:0x00af, B:21:0x00b5, B:23:0x00c7, B:25:0x00dd, B:26:0x00e8, B:28:0x00f2, B:29:0x00fd, B:31:0x0107, B:32:0x0117, B:34:0x011d, B:37:0x0129, B:42:0x013c, B:43:0x015f, B:45:0x0165, B:49:0x0184, B:51:0x018f, B:53:0x019d, B:55:0x01a3, B:56:0x01a5, B:59:0x01bb, B:60:0x01c3, B:62:0x01ce, B:65:0x01d9, B:68:0x01e4, B:71:0x01ef, B:74:0x01fa, B:77:0x0205, B:91:0x0210, B:80:0x0215, B:85:0x0221, B:94:0x01be, B:95:0x01c1, B:96:0x0196, B:99:0x0229, B:101:0x0233, B:102:0x0236, B:104:0x0249, B:105:0x0252), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[Catch: BackendException -> 0x003a, TryCatch #1 {BackendException -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009e, B:19:0x00af, B:21:0x00b5, B:23:0x00c7, B:25:0x00dd, B:26:0x00e8, B:28:0x00f2, B:29:0x00fd, B:31:0x0107, B:32:0x0117, B:34:0x011d, B:37:0x0129, B:42:0x013c, B:43:0x015f, B:45:0x0165, B:49:0x0184, B:51:0x018f, B:53:0x019d, B:55:0x01a3, B:56:0x01a5, B:59:0x01bb, B:60:0x01c3, B:62:0x01ce, B:65:0x01d9, B:68:0x01e4, B:71:0x01ef, B:74:0x01fa, B:77:0x0205, B:91:0x0210, B:80:0x0215, B:85:0x0221, B:94:0x01be, B:95:0x01c1, B:96:0x0196, B:99:0x0229, B:101:0x0233, B:102:0x0236, B:104:0x0249, B:105:0x0252), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(RefreshUserOperation refreshUserOperation, InterfaceC1218d interfaceC1218d) {
        RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$1;
        int i2;
        RefreshUserOperationExecutor refreshUserOperationExecutor;
        int i3;
        SubscriptionModel subscriptionModel;
        RefreshUserOperation refreshUserOperation2 = refreshUserOperation;
        if (interfaceC1218d instanceof RefreshUserOperationExecutor$getUser$1) {
            refreshUserOperationExecutor$getUser$1 = (RefreshUserOperationExecutor$getUser$1) interfaceC1218d;
            int i6 = refreshUserOperationExecutor$getUser$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                refreshUserOperationExecutor$getUser$1.label = i6 - Integer.MIN_VALUE;
                RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$12 = refreshUserOperationExecutor$getUser$1;
                Object obj = refreshUserOperationExecutor$getUser$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = refreshUserOperationExecutor$getUser$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(refreshUserOperation2, refreshUserOperation.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    try {
                        IUserBackendService iUserBackendService = this._userBackend;
                        String appId = refreshUserOperation.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        refreshUserOperationExecutor$getUser$12.L$0 = this;
                        refreshUserOperationExecutor$getUser$12.L$1 = refreshUserOperation2;
                        refreshUserOperationExecutor$getUser$12.label = 1;
                        obj = iUserBackendService.getUser(appId, aliasLabel, aliasValue, jwt, refreshUserOperationExecutor$getUser$12);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        refreshUserOperationExecutor = this;
                    } catch (BackendException e3) {
                        e = e3;
                        refreshUserOperationExecutor = this;
                        i3 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 != 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i3 == 2) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i3 != 3) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && refreshUserOperationExecutor._newRecordState.isInMissingRetryWindow(refreshUserOperation2.getOnesignalId())) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<Operation> rebuildOperationsIfCurrentUser = refreshUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(refreshUserOperation2.getAppId(), refreshUserOperation2.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    refreshUserOperation2 = (RefreshUserOperation) refreshUserOperationExecutor$getUser$12.L$1;
                    refreshUserOperationExecutor = (RefreshUserOperationExecutor) refreshUserOperationExecutor$getUser$12.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException e6) {
                        e = e6;
                        i3 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 != 1) {
                        }
                    }
                }
                CreateUserResponse createUserResponse = (CreateUserResponse) obj;
                if (i.a(refreshUserOperation2.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
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
                            i.b(value);
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
                    i.b(id);
                    subscriptionModel2.setId(id);
                    String token = subscriptionObject.getToken();
                    if (token == null) {
                        token = "";
                    }
                    subscriptionModel2.setAddress(token);
                    SubscriptionStatus.Companion companion = SubscriptionStatus.Companion;
                    Integer notificationTypes = subscriptionObject.getNotificationTypes();
                    SubscriptionStatus fromInt = companion.fromInt(notificationTypes != null ? notificationTypes.intValue() : SubscriptionStatus.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = SubscriptionStatus.SUBSCRIBED;
                    }
                    subscriptionModel2.setStatus(fromInt);
                    SubscriptionObjectType type = subscriptionObject.getType();
                    i.b(type);
                    int i7 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    subscriptionModel2.setType(i7 != 1 ? i7 != 2 ? SubscriptionType.PUSH : SubscriptionType.SMS : SubscriptionType.EMAIL);
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
                    } else if (i.a(subscriptionObject.getId(), pushSubscriptionId) && updateSubscriptionOperation == null) {
                        updateSubscriptionOperation = refreshUserOperationExecutor.buildPushSelfHealOperationForStuckSubscription(refreshUserOperation2, subscriptionObject, pushSubscriptionId);
                    }
                }
                if (pushSubscriptionId != null && (subscriptionModel = (SubscriptionModel) refreshUserOperationExecutor._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(subscriptionModel);
                }
                refreshUserOperationExecutor._identityModelStore.replace(identityModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._propertiesModelStore.replace(propertiesModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._subscriptionsModelStore.replaceAll(arrayList, ModelChangeTags.HYDRATE);
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, updateSubscriptionOperation != null ? b.W(updateSubscriptionOperation) : null, null, 10, null);
            }
        }
        refreshUserOperationExecutor$getUser$1 = new RefreshUserOperationExecutor$getUser$1(this, interfaceC1218d);
        RefreshUserOperationExecutor$getUser$1 refreshUserOperationExecutor$getUser$122 = refreshUserOperationExecutor$getUser$1;
        Object obj2 = refreshUserOperationExecutor$getUser$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = refreshUserOperationExecutor$getUser$122.label;
        if (i2 != 0) {
        }
        CreateUserResponse createUserResponse2 = (CreateUserResponse) obj2;
        if (i.a(refreshUserOperation2.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        Logging.log(LogLevel.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((Operation) it.next()) instanceof RefreshUserOperation)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        Operation operation = (Operation) AbstractC0465j.F0(list);
        if (operation instanceof RefreshUserOperation) {
            return getUser((RefreshUserOperation) operation, interfaceC1218d);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return b.W(REFRESH_USER);
    }
}
