package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
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
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionOperationExecutor.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u00014BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0082@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\u00020!2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0096@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u0010/J$\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0082@¢\u0006\u0002\u0010%J$\u00101\u001a\u00020!2\u0006\u0010-\u001a\u0002022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0082@¢\u0006\u0002\u00103R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00065"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/SubscriptionOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_subscriptionBackend", "Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_buildUserService", "Lcom/onesignal/user/internal/builduser/IRebuildUserService;", "_newRecordState", "Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;", "_consistencyManager", "Lcom/onesignal/common/consistency/models/IConsistencyManager;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/backend/ISubscriptionBackendService;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/builduser/IRebuildUserService;Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;Lcom/onesignal/common/consistency/models/IConsistencyManager;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "convert", "Lcom/onesignal/user/internal/backend/SubscriptionObjectType;", "subscriptionType", "Lcom/onesignal/user/internal/subscriptions/SubscriptionType;", "createSubscription", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "createOperation", "Lcom/onesignal/user/internal/operations/CreateSubscriptionOperation;", "Lcom/onesignal/core/internal/operations/Operation;", "(Lcom/onesignal/user/internal/operations/CreateSubscriptionOperation;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscription", "op", "Lcom/onesignal/user/internal/operations/DeleteSubscriptionOperation;", "(Lcom/onesignal/user/internal/operations/DeleteSubscriptionOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferSubscription", "startingOperation", "Lcom/onesignal/user/internal/operations/TransferSubscriptionOperation;", "(Lcom/onesignal/user/internal/operations/TransferSubscriptionOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExistingSubscriptionFromCreate", "updateSubscription", "Lcom/onesignal/user/internal/operations/UpdateSubscriptionOperation;", "(Lcom/onesignal/user/internal/operations/UpdateSubscriptionOperation;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionOperationExecutor implements IOperationExecutor {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final IApplicationService _applicationService;
    private final IRebuildUserService _buildUserService;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IDeviceService _deviceService;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final ISubscriptionBackendService _subscriptionBackend;
    private final SubscriptionModelStore _subscriptionModelStore;

    /* compiled from: SubscriptionOperationExecutor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscriptionType.values().length];
            try {
                iArr2[SubscriptionType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SubscriptionType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SubscriptionOperationExecutor(ISubscriptionBackendService _subscriptionBackend, IDeviceService _deviceService, IApplicationService _applicationService, SubscriptionModelStore _subscriptionModelStore, ConfigModelStore _configModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf((Object[]) new String[]{CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION});
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        Logging.log(LogLevel.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        Operation operation = (Operation) CollectionsKt.first((List) list);
        if (operation instanceof CreateSubscriptionOperation) {
            CreateSubscriptionOperation createSubscriptionOperation = (CreateSubscriptionOperation) operation;
            if (!IDManager.INSTANCE.isLocalId(createSubscriptionOperation.getSubscriptionId())) {
                return updateExistingSubscriptionFromCreate(createSubscriptionOperation, list, continuation);
            }
            return createSubscription(createSubscriptionOperation, list, continuation);
        }
        List<? extends Operation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof DeleteSubscriptionOperation) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((DeleteSubscriptionOperation) CollectionsKt.first((List) arrayList), continuation);
                }
            }
        }
        if (operation instanceof UpdateSubscriptionOperation) {
            return updateSubscription((UpdateSubscriptionOperation) operation, list, continuation);
        }
        if (operation instanceof TransferSubscriptionOperation) {
            if (list.size() > 1) {
                throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
            }
            return transferSubscription((TransferSubscriptionOperation) operation, continuation);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateExistingSubscriptionFromCreate(CreateSubscriptionOperation createSubscriptionOperation, List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        Operation operation;
        String address;
        SubscriptionStatus status;
        List<? extends Operation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends Operation> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                operation = null;
                break;
            }
            operation = listIterator.previous();
            if (operation instanceof UpdateSubscriptionOperation) {
                break;
            }
        }
        UpdateSubscriptionOperation updateSubscriptionOperation = (UpdateSubscriptionOperation) operation;
        String appId = createSubscriptionOperation.getAppId();
        String onesignalId = createSubscriptionOperation.getOnesignalId();
        String externalId = createSubscriptionOperation.getExternalId();
        String subscriptionId = createSubscriptionOperation.getSubscriptionId();
        SubscriptionType type = createSubscriptionOperation.getType();
        boolean enabled = updateSubscriptionOperation != null ? updateSubscriptionOperation.getEnabled() : createSubscriptionOperation.getEnabled();
        if (updateSubscriptionOperation == null || (address = updateSubscriptionOperation.getAddress()) == null) {
            address = createSubscriptionOperation.getAddress();
        }
        String str = address;
        if (updateSubscriptionOperation == null || (status = updateSubscriptionOperation.getStatus()) == null) {
            status = createSubscriptionOperation.getStatus();
        }
        UpdateSubscriptionOperation updateSubscriptionOperation2 = new UpdateSubscriptionOperation(appId, onesignalId, externalId, subscriptionId, type, enabled, str, status);
        return updateSubscription(updateSubscriptionOperation2, CollectionsKt.listOf(updateSubscriptionOperation2), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c1, code lost:
    
        if (r3.resolveConditionsWithID(com.onesignal.common.consistency.IamFetchReadyCondition.ID, r11) == r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d2 A[Catch: BackendException -> 0x021a, TryCatch #2 {BackendException -> 0x021a, blocks: (B:16:0x01c4, B:18:0x01d2, B:19:0x01e0, B:21:0x01f6, B:22:0x0201), top: B:15:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f6 A[Catch: BackendException -> 0x021a, TryCatch #2 {BackendException -> 0x021a, blocks: (B:16:0x01c4, B:18:0x01d2, B:19:0x01e0, B:21:0x01f6, B:22:0x0201), top: B:15:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174 A[Catch: BackendException -> 0x006d, TryCatch #1 {BackendException -> 0x006d, blocks: (B:63:0x0068, B:64:0x0170, B:66:0x0174, B:68:0x0186, B:70:0x0194, B:75:0x01b1), top: B:62:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186 A[Catch: BackendException -> 0x006d, TryCatch #1 {BackendException -> 0x006d, blocks: (B:63:0x0068, B:64:0x0170, B:66:0x0174, B:68:0x0186, B:70:0x0194, B:75:0x01b1), top: B:62:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(CreateSubscriptionOperation createSubscriptionOperation, List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        SubscriptionOperationExecutor$createSubscription$1 subscriptionOperationExecutor$createSubscription$1;
        int i;
        Operation operation;
        String address;
        SubscriptionStatus status;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        Pair pair;
        String str;
        String str2;
        SubscriptionOperationExecutor subscriptionOperationExecutor3;
        SubscriptionModel subscriptionModel;
        CreateSubscriptionOperation createSubscriptionOperation2 = createSubscriptionOperation;
        if (continuation instanceof SubscriptionOperationExecutor$createSubscription$1) {
            subscriptionOperationExecutor$createSubscription$1 = (SubscriptionOperationExecutor$createSubscription$1) continuation;
            if ((subscriptionOperationExecutor$createSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$createSubscription$1.label -= Integer.MIN_VALUE;
                SubscriptionOperationExecutor$createSubscription$1 subscriptionOperationExecutor$createSubscription$12 = subscriptionOperationExecutor$createSubscription$1;
                Object obj = subscriptionOperationExecutor$createSubscription$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionOperationExecutor$createSubscription$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<? extends Operation> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                            }
                        }
                    }
                    ListIterator<? extends Operation> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            operation = null;
                            break;
                        }
                        operation = listIterator.previous();
                        if (operation instanceof UpdateSubscriptionOperation) {
                            break;
                        }
                    }
                    UpdateSubscriptionOperation updateSubscriptionOperation = (UpdateSubscriptionOperation) operation;
                    boolean enabled = updateSubscriptionOperation != null ? updateSubscriptionOperation.getEnabled() : createSubscriptionOperation2.getEnabled();
                    if (updateSubscriptionOperation == null || (address = updateSubscriptionOperation.getAddress()) == null) {
                        address = createSubscriptionOperation2.getAddress();
                    }
                    String str3 = address;
                    if (updateSubscriptionOperation == null || (status = updateSubscriptionOperation.getStatus()) == null) {
                        status = createSubscriptionOperation2.getStatus();
                    }
                    try {
                        SubscriptionObject subscriptionObject = new SubscriptionObject(null, convert(createSubscriptionOperation2.getType()), str3, Boxing.boxBoolean(enabled), Boxing.boxInt(status.getValue()), OneSignalUtils.INSTANCE.getSdkVersion(), Build.MODEL, Build.VERSION.RELEASE, Boxing.boxBoolean(RootToolsInternalMethods.INSTANCE.isRooted()), DeviceUtils.INSTANCE.getNetType(this._applicationService.getAppContext()), DeviceUtils.INSTANCE.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(createSubscriptionOperation2, createSubscriptionOperation2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = createSubscriptionOperation2.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        subscriptionOperationExecutor$createSubscription$12.L$0 = this;
                        subscriptionOperationExecutor$createSubscription$12.L$1 = createSubscriptionOperation2;
                        subscriptionOperationExecutor$createSubscription$12.label = 1;
                        obj = iSubscriptionBackendService.createSubscription(appId, aliasLabel, aliasValue, subscriptionObject, jwt, subscriptionOperationExecutor$createSubscription$12);
                        if (obj != coroutine_suspended) {
                            subscriptionOperationExecutor2 = this;
                        }
                        return coroutine_suspended;
                    } catch (BackendException e) {
                        e = e;
                        subscriptionOperationExecutor = this;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) subscriptionOperationExecutor$createSubscription$12.L$2;
                            createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$12.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$12.L$0;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) subscriptionOperationExecutor$createSubscription$12.L$2;
                            createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$12.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$12.L$0;
                        }
                        try {
                            ResultKt.throwOnFailure(obj);
                            str2 = str;
                            subscriptionOperationExecutor3 = subscriptionOperationExecutor;
                            try {
                                subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor3._subscriptionModelStore.get(createSubscriptionOperation2.getSubscriptionId());
                                if (subscriptionModel != null) {
                                    Model.setStringProperty$default(subscriptionModel, "id", str2, ModelChangeTags.HYDRATE, false, 8, null);
                                }
                                if (Intrinsics.areEqual(subscriptionOperationExecutor3._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation2.getSubscriptionId())) {
                                    subscriptionOperationExecutor3._configModelStore.getModel().setPushSubscriptionId(str2);
                                }
                                return new ExecutionResponse(ExecutionResult.SUCCESS, MapsKt.mapOf(TuplesKt.to(createSubscriptionOperation2.getSubscriptionId(), str2)), null, null, 12, null);
                            } catch (BackendException e2) {
                                e = e2;
                                subscriptionOperationExecutor = subscriptionOperationExecutor3;
                            }
                        } catch (BackendException e3) {
                            e = e3;
                        }
                    } else {
                        createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$12.L$1;
                        subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (BackendException e4) {
                            e = e4;
                            subscriptionOperationExecutor = subscriptionOperationExecutor2;
                        }
                    }
                    int i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i2 == 1) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 == 2 || i2 == 3) {
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i2 == 4) {
                        return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e.getStatusCode() == 404 && subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow(createSubscriptionOperation2.getOnesignalId())) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<Operation> rebuildOperationsIfCurrentUser = subscriptionOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(createSubscriptionOperation2.getAppId(), createSubscriptionOperation2.getOnesignalId());
                    if (rebuildOperationsIfCurrentUser == null) {
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
                pair = (Pair) obj;
                if (pair != null) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                str = (String) pair.getFirst();
                RywData rywData = (RywData) pair.getSecond();
                if (rywData != null) {
                    IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
                    String onesignalId = createSubscriptionOperation2.getOnesignalId();
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
                    subscriptionOperationExecutor$createSubscription$12.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$createSubscription$12.L$1 = createSubscriptionOperation2;
                    subscriptionOperationExecutor$createSubscription$12.L$2 = str;
                    subscriptionOperationExecutor$createSubscription$12.label = 2;
                    if (iConsistencyManager.setRywData(onesignalId, iamFetchRywTokenKey, rywData, subscriptionOperationExecutor$createSubscription$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    subscriptionOperationExecutor = subscriptionOperationExecutor2;
                } else {
                    IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
                    subscriptionOperationExecutor$createSubscription$12.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$createSubscription$12.L$1 = createSubscriptionOperation2;
                    subscriptionOperationExecutor$createSubscription$12.L$2 = str;
                    subscriptionOperationExecutor$createSubscription$12.label = 3;
                }
                str2 = str;
                subscriptionOperationExecutor3 = subscriptionOperationExecutor;
                subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor3._subscriptionModelStore.get(createSubscriptionOperation2.getSubscriptionId());
                if (subscriptionModel != null) {
                }
                if (Intrinsics.areEqual(subscriptionOperationExecutor3._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation2.getSubscriptionId())) {
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, MapsKt.mapOf(TuplesKt.to(createSubscriptionOperation2.getSubscriptionId(), str2)), null, null, 12, null);
            }
        }
        subscriptionOperationExecutor$createSubscription$1 = new SubscriptionOperationExecutor$createSubscription$1(this, continuation);
        SubscriptionOperationExecutor$createSubscription$1 subscriptionOperationExecutor$createSubscription$122 = subscriptionOperationExecutor$createSubscription$1;
        Object obj2 = subscriptionOperationExecutor$createSubscription$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionOperationExecutor$createSubscription$122.label;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        if (pair != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(3:(1:(5:14|15|16|17|18)(2:11|12))(4:57|58|59|60)|21|(2:23|(2:25|(2:27|28)(8:29|(2:31|(3:35|(3:38|(3:40|41|42)(1:43)|36)|44))|45|(1:47)|48|(1:50)|51|52))(2:53|54))(2:55|56))(5:76|77|78|(1:80)|67)|61|62|(4:64|(2:66|67)|17|18)(1:68)))|84|6|(0)(0)|61|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        if (r0.resolveConditionsWithID(com.onesignal.common.consistency.IamFetchReadyCondition.ID, r8) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd A[Catch: BackendException -> 0x0137, TryCatch #1 {BackendException -> 0x0137, blocks: (B:62:0x00f8, B:64:0x00fd, B:68:0x0116), top: B:61:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116 A[Catch: BackendException -> 0x0137, TRY_LEAVE, TryCatch #1 {BackendException -> 0x0137, blocks: (B:62:0x00f8, B:64:0x00fd, B:68:0x0116), top: B:61:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(UpdateSubscriptionOperation updateSubscriptionOperation, List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        SubscriptionOperationExecutor$updateSubscription$1 subscriptionOperationExecutor$updateSubscription$1;
        int i;
        UpdateSubscriptionOperation updateSubscriptionOperation2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        UpdateSubscriptionOperation updateSubscriptionOperation3;
        Object updateSubscription;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        UpdateSubscriptionOperation updateSubscriptionOperation4;
        RywData rywData;
        int i2;
        if (continuation instanceof SubscriptionOperationExecutor$updateSubscription$1) {
            subscriptionOperationExecutor$updateSubscription$1 = (SubscriptionOperationExecutor$updateSubscription$1) continuation;
            if ((subscriptionOperationExecutor$updateSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$updateSubscription$1.label -= Integer.MIN_VALUE;
                SubscriptionOperationExecutor$updateSubscription$1 subscriptionOperationExecutor$updateSubscription$12 = subscriptionOperationExecutor$updateSubscription$1;
                Object obj = subscriptionOperationExecutor$updateSubscription$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionOperationExecutor$updateSubscription$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object last = CollectionsKt.last((List<? extends Object>) list);
                    Intrinsics.checkNotNull(last, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                    updateSubscriptionOperation2 = (UpdateSubscriptionOperation) last;
                    try {
                        SubscriptionObject subscriptionObject = new SubscriptionObject(null, convert(updateSubscriptionOperation2.getType()), updateSubscriptionOperation2.getAddress(), Boxing.boxBoolean(updateSubscriptionOperation2.getEnabled()), Boxing.boxInt(updateSubscriptionOperation2.getStatus().getValue()), OneSignalUtils.INSTANCE.getSdkVersion(), Build.MODEL, Build.VERSION.RELEASE, Boxing.boxBoolean(RootToolsInternalMethods.INSTANCE.isRooted()), DeviceUtils.INSTANCE.getNetType(this._applicationService.getAppContext()), DeviceUtils.INSTANCE.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                        String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(updateSubscriptionOperation2, this._jwtTokenStore, this._identityVerificationService);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = updateSubscriptionOperation2.getAppId();
                        String subscriptionId = updateSubscriptionOperation2.getSubscriptionId();
                        subscriptionOperationExecutor$updateSubscription$12.L$0 = this;
                        updateSubscriptionOperation3 = updateSubscriptionOperation;
                        subscriptionOperationExecutor$updateSubscription$12.L$1 = updateSubscriptionOperation3;
                        subscriptionOperationExecutor$updateSubscription$12.L$2 = updateSubscriptionOperation2;
                        subscriptionOperationExecutor$updateSubscription$12.label = 1;
                        updateSubscription = iSubscriptionBackendService.updateSubscription(appId, subscriptionId, subscriptionObject, resolveJwt, subscriptionOperationExecutor$updateSubscription$12);
                        if (updateSubscription != coroutine_suspended) {
                            subscriptionOperationExecutor2 = this;
                        }
                        return coroutine_suspended;
                    } catch (BackendException e) {
                        e = e;
                        subscriptionOperationExecutor = this;
                        updateSubscriptionOperation4 = updateSubscriptionOperation2;
                        i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i2 == 1) {
                        }
                    }
                } else {
                    if (i == 1) {
                        UpdateSubscriptionOperation updateSubscriptionOperation5 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$12.L$2;
                        UpdateSubscriptionOperation updateSubscriptionOperation6 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$12.L$1;
                        subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) subscriptionOperationExecutor$updateSubscription$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            updateSubscriptionOperation2 = updateSubscriptionOperation5;
                            updateSubscription = obj;
                            updateSubscriptionOperation3 = updateSubscriptionOperation6;
                        } catch (BackendException e2) {
                            e = e2;
                            updateSubscriptionOperation4 = updateSubscriptionOperation5;
                            subscriptionOperationExecutor = subscriptionOperationExecutor2;
                        }
                    } else {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        updateSubscriptionOperation4 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$12.L$1;
                        subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$updateSubscription$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        } catch (BackendException e3) {
                            e = e3;
                        }
                    }
                    i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i2 == 1) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 == 4) {
                        return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 == 5) {
                        if (e.getStatusCode() == 404) {
                            List listOf = CollectionsKt.listOf((Object[]) new String[]{updateSubscriptionOperation4.getOnesignalId(), updateSubscriptionOperation4.getSubscriptionId()});
                            if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                Iterator it = listOf.iterator();
                                while (it.hasNext()) {
                                    if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                    }
                                }
                            }
                        }
                        String createLocalId = IDManager.INSTANCE.createLocalId();
                        String subscriptionId2 = updateSubscriptionOperation4.getSubscriptionId();
                        SubscriptionModel subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor._subscriptionModelStore.get(subscriptionId2);
                        if (subscriptionModel != null) {
                            Model.setStringProperty$default(subscriptionModel, "id", createLocalId, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                        if (Intrinsics.areEqual(subscriptionOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), subscriptionId2)) {
                            subscriptionOperationExecutor._configModelStore.getModel().setPushSubscriptionId(createLocalId);
                        }
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, CollectionsKt.listOf(new CreateSubscriptionOperation(updateSubscriptionOperation4.getAppId(), updateSubscriptionOperation4.getOnesignalId(), updateSubscriptionOperation4.getExternalId(), createLocalId, updateSubscriptionOperation4.getType(), updateSubscriptionOperation4.getEnabled(), updateSubscriptionOperation4.getAddress(), updateSubscriptionOperation4.getStatus())), null, 10, null);
                    }
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                rywData = (RywData) updateSubscription;
                if (rywData == null) {
                    IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
                    String onesignalId = updateSubscriptionOperation3.getOnesignalId();
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
                    subscriptionOperationExecutor$updateSubscription$12.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$updateSubscription$12.L$1 = updateSubscriptionOperation2;
                    subscriptionOperationExecutor$updateSubscription$12.L$2 = null;
                    subscriptionOperationExecutor$updateSubscription$12.label = 2;
                    if (iConsistencyManager.setRywData(onesignalId, iamFetchRywTokenKey, rywData, subscriptionOperationExecutor$updateSubscription$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
                subscriptionOperationExecutor$updateSubscription$12.L$0 = subscriptionOperationExecutor2;
                subscriptionOperationExecutor$updateSubscription$12.L$1 = updateSubscriptionOperation2;
                subscriptionOperationExecutor$updateSubscription$12.L$2 = null;
                subscriptionOperationExecutor$updateSubscription$12.label = 3;
            }
        }
        subscriptionOperationExecutor$updateSubscription$1 = new SubscriptionOperationExecutor$updateSubscription$1(this, continuation);
        SubscriptionOperationExecutor$updateSubscription$1 subscriptionOperationExecutor$updateSubscription$122 = subscriptionOperationExecutor$updateSubscription$1;
        Object obj2 = subscriptionOperationExecutor$updateSubscription$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionOperationExecutor$updateSubscription$122.label;
        if (i != 0) {
        }
        rywData = (RywData) updateSubscription;
        if (rywData == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(TransferSubscriptionOperation transferSubscriptionOperation, Continuation<? super ExecutionResponse> continuation) {
        SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$1;
        int i;
        try {
            if (continuation instanceof SubscriptionOperationExecutor$transferSubscription$1) {
                subscriptionOperationExecutor$transferSubscription$1 = (SubscriptionOperationExecutor$transferSubscription$1) continuation;
                if ((subscriptionOperationExecutor$transferSubscription$1.label & Integer.MIN_VALUE) != 0) {
                    subscriptionOperationExecutor$transferSubscription$1.label -= Integer.MIN_VALUE;
                    SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$12 = subscriptionOperationExecutor$transferSubscription$1;
                    Object obj = subscriptionOperationExecutor$transferSubscription$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = subscriptionOperationExecutor$transferSubscription$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(transferSubscriptionOperation, transferSubscriptionOperation.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = transferSubscriptionOperation.getAppId();
                        String subscriptionId = transferSubscriptionOperation.getSubscriptionId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        subscriptionOperationExecutor$transferSubscription$12.label = 1;
                        if (iSubscriptionBackendService.transferSubscription(appId, subscriptionId, aliasLabel, aliasValue, jwt, subscriptionOperationExecutor$transferSubscription$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i != 0) {
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i2 == 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i2 == 4) {
                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        subscriptionOperationExecutor$transferSubscription$1 = new SubscriptionOperationExecutor$transferSubscription$1(this, continuation);
        SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$122 = subscriptionOperationExecutor$transferSubscription$1;
        Object obj2 = subscriptionOperationExecutor$transferSubscription$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionOperationExecutor$transferSubscription$122.label;
    }

    private final SubscriptionObjectType convert(SubscriptionType subscriptionType) {
        int i = WhenMappings.$EnumSwitchMapping$1[subscriptionType.ordinal()];
        if (i == 1) {
            return SubscriptionObjectType.SMS;
        }
        if (i == 2) {
            return SubscriptionObjectType.EMAIL;
        }
        return SubscriptionObjectType.INSTANCE.fromDeviceType(this._deviceService.getDeviceType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(DeleteSubscriptionOperation deleteSubscriptionOperation, Continuation<? super ExecutionResponse> continuation) {
        SubscriptionOperationExecutor$deleteSubscription$1 subscriptionOperationExecutor$deleteSubscription$1;
        int i;
        BackendException backendException;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        int i2;
        if (continuation instanceof SubscriptionOperationExecutor$deleteSubscription$1) {
            subscriptionOperationExecutor$deleteSubscription$1 = (SubscriptionOperationExecutor$deleteSubscription$1) continuation;
            if ((subscriptionOperationExecutor$deleteSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$deleteSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = subscriptionOperationExecutor$deleteSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionOperationExecutor$deleteSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(deleteSubscriptionOperation, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = deleteSubscriptionOperation.getAppId();
                        String subscriptionId = deleteSubscriptionOperation.getSubscriptionId();
                        subscriptionOperationExecutor$deleteSubscription$1.L$0 = this;
                        subscriptionOperationExecutor$deleteSubscription$1.L$1 = deleteSubscriptionOperation;
                        subscriptionOperationExecutor$deleteSubscription$1.label = 1;
                        if (iSubscriptionBackendService.deleteSubscription(appId, subscriptionId, resolveJwt, subscriptionOperationExecutor$deleteSubscription$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        subscriptionOperationExecutor = this;
                    } catch (BackendException e) {
                        backendException = e;
                        subscriptionOperationExecutor = this;
                        i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(backendException.getStatusCode()).ordinal()];
                        if (i2 != 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                        }
                        if (i2 == 4) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, backendException.getRetryAfterSeconds(), 6, null);
                        }
                        if (i2 == 5) {
                            if (backendException.getStatusCode() == 404) {
                                List listOf = CollectionsKt.listOf((Object[]) new String[]{deleteSubscriptionOperation.getOnesignalId(), deleteSubscriptionOperation.getSubscriptionId()});
                                if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                    Iterator it = listOf.iterator();
                                    while (it.hasNext()) {
                                        if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                                        }
                                    }
                                }
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deleteSubscriptionOperation = (DeleteSubscriptionOperation) subscriptionOperationExecutor$deleteSubscription$1.L$1;
                    subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$deleteSubscription$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException e2) {
                        backendException = e2;
                        i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(backendException.getStatusCode()).ordinal()];
                        if (i2 != 1) {
                        }
                    }
                }
                subscriptionOperationExecutor._subscriptionModelStore.remove(deleteSubscriptionOperation.getSubscriptionId(), ModelChangeTags.HYDRATE);
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        subscriptionOperationExecutor$deleteSubscription$1 = new SubscriptionOperationExecutor$deleteSubscription$1(this, continuation);
        Object obj2 = subscriptionOperationExecutor$deleteSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionOperationExecutor$deleteSubscription$1.label;
        if (i != 0) {
        }
        subscriptionOperationExecutor._subscriptionModelStore.remove(deleteSubscriptionOperation.getSubscriptionId(), ModelChangeTags.HYDRATE);
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }
}
