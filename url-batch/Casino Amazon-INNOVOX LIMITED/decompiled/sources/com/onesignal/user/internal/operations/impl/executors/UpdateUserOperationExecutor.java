package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.PurchaseObject;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.PurchaseInfo;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.operations.TrackPurchaseOperation;
import com.onesignal.user.internal.operations.TrackSessionEndOperation;
import com.onesignal.user.internal.operations.TrackSessionStartOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateUserOperationExecutor.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@¢\u0006\u0002\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/UpdateUserOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_userBackend", "Lcom/onesignal/user/internal/backend/IUserBackendService;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "_buildUserService", "Lcom/onesignal/user/internal/builduser/IRebuildUserService;", "_newRecordState", "Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;", "_consistencyManager", "Lcom/onesignal/common/consistency/models/IConsistencyManager;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/backend/IUserBackendService;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/user/internal/builduser/IRebuildUserService;Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;Lcom/onesignal/common/consistency/models/IConsistencyManager;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "execute", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "Lcom/onesignal/core/internal/operations/Operation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateUserOperationExecutor implements IOperationExecutor {
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final IRebuildUserService _buildUserService;
    private final IConsistencyManager _consistencyManager;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final PropertiesModelStore _propertiesModelStore;
    private final IUserBackendService _userBackend;

    /* compiled from: UpdateUserOperationExecutor.kt */
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
            try {
                iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateUserOperationExecutor(IUserBackendService _userBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf((Object[]) new String[]{SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE});
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c0, code lost:
    
        if (r2.resolveConditionsWithID(com.onesignal.common.consistency.IamFetchReadyCondition.ID, r12) == r3) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d5 A[Catch: BackendException -> 0x0053, TryCatch #1 {BackendException -> 0x0053, blocks: (B:16:0x004e, B:17:0x02c3, B:19:0x02d5, B:20:0x02d9, B:22:0x02df, B:39:0x02e9, B:25:0x030f, B:36:0x0313, B:28:0x0333, B:31:0x0337), top: B:15:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0291 A[Catch: BackendException -> 0x006d, TryCatch #0 {BackendException -> 0x006d, blocks: (B:72:0x0068, B:73:0x028d, B:75:0x0291, B:80:0x02ad), top: B:71:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad A[Catch: BackendException -> 0x006d, TRY_LEAVE, TryCatch #0 {BackendException -> 0x006d, blocks: (B:72:0x0068, B:73:0x028d, B:75:0x0291, B:80:0x02ad), top: B:71:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        UpdateUserOperationExecutor$execute$1 updateUserOperationExecutor$execute$1;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        UpdateUserOperationExecutor updateUserOperationExecutor;
        String str5;
        UpdateUserOperationExecutor updateUserOperationExecutor2;
        int i2;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        RywData rywData;
        int i3;
        List<? extends Operation> list2 = list;
        if (continuation instanceof UpdateUserOperationExecutor$execute$1) {
            updateUserOperationExecutor$execute$1 = (UpdateUserOperationExecutor$execute$1) continuation;
            if ((updateUserOperationExecutor$execute$1.label & Integer.MIN_VALUE) != 0) {
                updateUserOperationExecutor$execute$1.label -= Integer.MIN_VALUE;
                UpdateUserOperationExecutor$execute$1 updateUserOperationExecutor$execute$12 = updateUserOperationExecutor$execute$1;
                Object obj = updateUserOperationExecutor$execute$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateUserOperationExecutor$execute$12.label;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.log(LogLevel.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    PropertiesObject propertiesObject = new PropertiesObject(null, null, null, null, null, null, 63, null);
                    str = null;
                    PropertiesDeltasObject propertiesDeltasObject = new PropertiesDeltasObject(null, null, null, null, 15, null);
                    Iterator<? extends Operation> it = list2.iterator();
                    PropertiesDeltasObject propertiesDeltasObject2 = propertiesDeltasObject;
                    String str6 = null;
                    boolean z = 0;
                    PropertiesObject propertiesObject2 = propertiesObject;
                    while (it.hasNext()) {
                        Operation next = it.next();
                        if (next instanceof SetTagOperation) {
                            if (str == null) {
                                SetTagOperation setTagOperation = (SetTagOperation) next;
                                str = setTagOperation.getAppId();
                                str6 = setTagOperation.getOnesignalId();
                            }
                            propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetTagOperation) next, propertiesObject2);
                        } else if (next instanceof DeleteTagOperation) {
                            if (str == null) {
                                DeleteTagOperation deleteTagOperation = (DeleteTagOperation) next;
                                str = deleteTagOperation.getAppId();
                                str6 = deleteTagOperation.getOnesignalId();
                            }
                            propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((DeleteTagOperation) next, propertiesObject2);
                        } else if (next instanceof SetPropertyOperation) {
                            if (str == null) {
                                SetPropertyOperation setPropertyOperation = (SetPropertyOperation) next;
                                str = setPropertyOperation.getAppId();
                                str6 = setPropertyOperation.getOnesignalId();
                            }
                            propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetPropertyOperation) next, propertiesObject2);
                        } else if (next instanceof TrackSessionStartOperation) {
                            if (str == null) {
                                TrackSessionStartOperation trackSessionStartOperation = (TrackSessionStartOperation) next;
                                str = trackSessionStartOperation.getAppId();
                                str6 = trackSessionStartOperation.getOnesignalId();
                            }
                            if (propertiesDeltasObject2.getSessionCount() != null) {
                                Integer sessionCount = propertiesDeltasObject2.getSessionCount();
                                Intrinsics.checkNotNull(sessionCount);
                                i2 = sessionCount.intValue() + i4;
                            } else {
                                i2 = i4;
                            }
                            propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), Boxing.boxInt(i2), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                            z = i4;
                        } else if (next instanceof TrackSessionEndOperation) {
                            if (str == null) {
                                TrackSessionEndOperation trackSessionEndOperation = (TrackSessionEndOperation) next;
                                str = trackSessionEndOperation.getAppId();
                                str6 = trackSessionEndOperation.getOnesignalId();
                            }
                            if (propertiesDeltasObject2.getSessionTime() != null) {
                                Long sessionTime2 = propertiesDeltasObject2.getSessionTime();
                                Intrinsics.checkNotNull(sessionTime2);
                                sessionTime = sessionTime2.longValue() + ((TrackSessionEndOperation) next).getSessionTime();
                            } else {
                                sessionTime = ((TrackSessionEndOperation) next).getSessionTime();
                            }
                            propertiesDeltasObject2 = new PropertiesDeltasObject(Boxing.boxLong(sessionTime), propertiesDeltasObject2.getSessionCount(), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                        } else if (next instanceof TrackPurchaseOperation) {
                            if (str == null) {
                                TrackPurchaseOperation trackPurchaseOperation = (TrackPurchaseOperation) next;
                                str = trackPurchaseOperation.getAppId();
                                str6 = trackPurchaseOperation.getOnesignalId();
                            }
                            if (propertiesDeltasObject2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = propertiesDeltasObject2.getAmountSpent();
                                Intrinsics.checkNotNull(amountSpent2);
                                amountSpent = amountSpent2.add(((TrackPurchaseOperation) next).getAmountSpent());
                                Intrinsics.checkNotNullExpressionValue(amountSpent, "add(...)");
                            } else {
                                amountSpent = ((TrackPurchaseOperation) next).getAmountSpent();
                            }
                            if (propertiesDeltasObject2.getPurchases() != null) {
                                List<PurchaseObject> purchases = propertiesDeltasObject2.getPurchases();
                                Intrinsics.checkNotNull(purchases);
                                arrayList = CollectionsKt.toMutableList((Collection) purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (PurchaseInfo purchaseInfo : ((TrackPurchaseOperation) next).getPurchases()) {
                                arrayList.add(new PurchaseObject(purchaseInfo.getSku(), purchaseInfo.getIso(), purchaseInfo.getAmount()));
                                it = it;
                            }
                            propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), propertiesDeltasObject2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i4 = 1;
                        } else {
                            throw new Exception("Unrecognized operation: " + next);
                        }
                    }
                    if (str != null && str6 != null) {
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams((Operation) CollectionsKt.first((List) list2), str6, this._jwtTokenStore, this._identityVerificationService);
                        try {
                            IUserBackendService iUserBackendService = this._userBackend;
                            String aliasLabel = resolveBackendParams.getAliasLabel();
                            String aliasValue = resolveBackendParams.getAliasValue();
                            String jwt = resolveBackendParams.getJwt();
                            updateUserOperationExecutor$execute$12.L$0 = this;
                            updateUserOperationExecutor$execute$12.L$1 = list2;
                            updateUserOperationExecutor$execute$12.L$2 = str;
                            updateUserOperationExecutor$execute$12.L$3 = str6;
                            updateUserOperationExecutor$execute$12.label = 1;
                            str2 = str6;
                            try {
                                Object updateUser = iUserBackendService.updateUser(str, aliasLabel, aliasValue, propertiesObject2, z, propertiesDeltasObject2, jwt, updateUserOperationExecutor$execute$12);
                                if (updateUser != coroutine_suspended) {
                                    str5 = str2;
                                    obj = updateUser;
                                    updateUserOperationExecutor2 = this;
                                }
                                return coroutine_suspended;
                            } catch (BackendException e) {
                                e = e;
                                str3 = str2;
                                str4 = str;
                                updateUserOperationExecutor = this;
                                i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i3 == 1) {
                                }
                            }
                        } catch (BackendException e2) {
                            e = e2;
                            str2 = str6;
                        }
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) updateUserOperationExecutor$execute$12.L$3;
                    str4 = (String) updateUserOperationExecutor$execute$12.L$2;
                    list2 = (List) updateUserOperationExecutor$execute$12.L$1;
                    updateUserOperationExecutor = (UpdateUserOperationExecutor) updateUserOperationExecutor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (Intrinsics.areEqual(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str3)) {
                            for (Operation operation : list2) {
                                if (operation instanceof SetTagOperation) {
                                    Model.setStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((SetTagOperation) operation).getKey(), ((SetTagOperation) operation).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                                } else if (operation instanceof DeleteTagOperation) {
                                    Model.setOptStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((DeleteTagOperation) operation).getKey(), null, ModelChangeTags.HYDRATE, false, 8, null);
                                } else if (operation instanceof SetPropertyOperation) {
                                    Model.setOptAnyProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel(), ((SetPropertyOperation) operation).getProperty(), ((SetPropertyOperation) operation).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                                }
                            }
                        }
                        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                    } catch (BackendException e3) {
                        e = e3;
                        i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 == 1) {
                        }
                    }
                } else {
                    str5 = (String) updateUserOperationExecutor$execute$12.L$3;
                    str = (String) updateUserOperationExecutor$execute$12.L$2;
                    list2 = (List) updateUserOperationExecutor$execute$12.L$1;
                    updateUserOperationExecutor2 = (UpdateUserOperationExecutor) updateUserOperationExecutor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException e4) {
                        e = e4;
                        str3 = str5;
                        str4 = str;
                        updateUserOperationExecutor = updateUserOperationExecutor2;
                        i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 == 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i3 == 2) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i3 == 3) {
                            if (e.getStatusCode() == 404 && updateUserOperationExecutor._newRecordState.isInMissingRetryWindow(str3)) {
                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            List<Operation> rebuildOperationsIfCurrentUser = updateUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(str4, str3);
                            if (rebuildOperationsIfCurrentUser == null) {
                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                        }
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                }
                rywData = (RywData) obj;
                if (rywData == null) {
                    IConsistencyManager iConsistencyManager = updateUserOperationExecutor2._consistencyManager;
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.USER;
                    updateUserOperationExecutor$execute$12.L$0 = updateUserOperationExecutor2;
                    updateUserOperationExecutor$execute$12.L$1 = list2;
                    updateUserOperationExecutor$execute$12.L$2 = str;
                    updateUserOperationExecutor$execute$12.L$3 = str5;
                    updateUserOperationExecutor$execute$12.label = 2;
                    if (iConsistencyManager.setRywData(str5, iamFetchRywTokenKey, rywData, updateUserOperationExecutor$execute$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str5;
                    str4 = str;
                    updateUserOperationExecutor = updateUserOperationExecutor2;
                } else {
                    IConsistencyManager iConsistencyManager2 = updateUserOperationExecutor2._consistencyManager;
                    updateUserOperationExecutor$execute$12.L$0 = updateUserOperationExecutor2;
                    updateUserOperationExecutor$execute$12.L$1 = list2;
                    updateUserOperationExecutor$execute$12.L$2 = str;
                    updateUserOperationExecutor$execute$12.L$3 = str5;
                    updateUserOperationExecutor$execute$12.label = 3;
                }
                if (Intrinsics.areEqual(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str3)) {
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        updateUserOperationExecutor$execute$1 = new UpdateUserOperationExecutor$execute$1(this, continuation);
        UpdateUserOperationExecutor$execute$1 updateUserOperationExecutor$execute$122 = updateUserOperationExecutor$execute$1;
        Object obj2 = updateUserOperationExecutor$execute$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateUserOperationExecutor$execute$122.label;
        int i42 = 1;
        if (i != 0) {
        }
        rywData = (RywData) obj2;
        if (rywData == null) {
        }
        if (Intrinsics.areEqual(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str3)) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }
}
