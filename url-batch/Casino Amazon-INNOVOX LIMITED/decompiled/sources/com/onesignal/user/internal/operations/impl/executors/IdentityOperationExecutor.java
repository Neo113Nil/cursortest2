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
import com.onesignal.user.internal.backend.IIdentityBackendService;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.DeleteAliasOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityOperationExecutor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0014\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0096@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/IdentityOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_identityBackend", "Lcom/onesignal/user/internal/backend/IIdentityBackendService;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_buildUserService", "Lcom/onesignal/user/internal/builduser/IRebuildUserService;", "_newRecordState", "Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/backend/IIdentityBackendService;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/builduser/IRebuildUserService;Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "operations", "", "", "getOperations", "()Ljava/util/List;", "execute", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "Lcom/onesignal/core/internal/operations/Operation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentityOperationExecutor implements IOperationExecutor {
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final IRebuildUserService _buildUserService;
    private final IIdentityBackendService _identityBackend;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;

    /* compiled from: IdentityOperationExecutor.kt */
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
                iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 3;
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
        }
    }

    public IdentityOperationExecutor(IIdentityBackendService _identityBackend, IdentityModelStore _identityModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_identityBackend, "_identityBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf((Object[]) new String[]{SET_ALIAS, DELETE_ALIAS});
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02bd A[Catch: BackendException -> 0x02d9, TRY_LEAVE, TryCatch #7 {BackendException -> 0x02d9, blocks: (B:15:0x02a4, B:17:0x02bd), top: B:14:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a A[Catch: BackendException -> 0x019b, TRY_LEAVE, TryCatch #9 {BackendException -> 0x019b, blocks: (B:57:0x0161, B:59:0x017a), top: B:56:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0063  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$1;
        int i;
        int i2;
        IdentityOperationExecutor identityOperationExecutor;
        Operation operation;
        int i3;
        IdentityOperationExecutor identityOperationExecutor2;
        Operation operation2;
        int i4;
        int i5;
        if (continuation instanceof IdentityOperationExecutor$execute$1) {
            identityOperationExecutor$execute$1 = (IdentityOperationExecutor$execute$1) continuation;
            if ((identityOperationExecutor$execute$1.label & Integer.MIN_VALUE) != 0) {
                identityOperationExecutor$execute$1.label -= Integer.MIN_VALUE;
                IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$12 = identityOperationExecutor$execute$1;
                Object obj = identityOperationExecutor$execute$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityOperationExecutor$execute$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    List<? extends Operation> list2 = list;
                    boolean z = list2 instanceof Collection;
                    if (!z || !list2.isEmpty()) {
                        for (Operation operation3 : list2) {
                            if (!(operation3 instanceof SetAliasOperation) && !(operation3 instanceof DeleteAliasOperation)) {
                                throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                            }
                        }
                    }
                    if (!z || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((Operation) it.next()) instanceof SetAliasOperation) {
                                if (!z || !list2.isEmpty()) {
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((Operation) it2.next()) instanceof DeleteAliasOperation) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Operation operation4 = (Operation) CollectionsKt.last((List) list);
                    if (operation4 instanceof SetAliasOperation) {
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(operation4, ((SetAliasOperation) operation4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            IIdentityBackendService iIdentityBackendService = this._identityBackend;
                            String appId = ((SetAliasOperation) operation4).getAppId();
                            try {
                                String aliasLabel = resolveBackendParams.getAliasLabel();
                                try {
                                    String aliasValue = resolveBackendParams.getAliasValue();
                                    try {
                                        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((SetAliasOperation) operation4).getLabel(), ((SetAliasOperation) operation4).getValue()));
                                        String jwt = resolveBackendParams.getJwt();
                                        identityOperationExecutor$execute$12.L$0 = this;
                                        identityOperationExecutor$execute$12.L$1 = operation4;
                                        identityOperationExecutor$execute$12.label = 1;
                                        i3 = 2;
                                        try {
                                            if (iIdentityBackendService.setAlias(appId, aliasLabel, aliasValue, mapOf, jwt, identityOperationExecutor$execute$12) != coroutine_suspended) {
                                                identityOperationExecutor2 = this;
                                                operation2 = operation4;
                                                if (Intrinsics.areEqual(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                                                }
                                            }
                                        } catch (BackendException e) {
                                            e = e;
                                            identityOperationExecutor2 = this;
                                            operation2 = operation4;
                                            i4 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                            if (i4 == 1) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i4 == i3) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                                            }
                                            if (i4 == 3) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i4 == 4) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i4 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (e.getStatusCode() == 404 && identityOperationExecutor2._newRecordState.isInMissingRetryWindow(((SetAliasOperation) operation2).getOnesignalId())) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            SetAliasOperation setAliasOperation = (SetAliasOperation) operation2;
                                            List<Operation> rebuildOperationsIfCurrentUser = identityOperationExecutor2._buildUserService.getRebuildOperationsIfCurrentUser(setAliasOperation.getAppId(), setAliasOperation.getOnesignalId());
                                            if (rebuildOperationsIfCurrentUser == null) {
                                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                                            }
                                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                                        }
                                    } catch (BackendException e2) {
                                        e = e2;
                                        i3 = 2;
                                    }
                                } catch (BackendException e3) {
                                    e = e3;
                                    i3 = 2;
                                }
                            } catch (BackendException e4) {
                                e = e4;
                                i3 = 2;
                            }
                        } catch (BackendException e5) {
                            e = e5;
                            i3 = 2;
                        }
                    } else {
                        i2 = 2;
                        if (operation4 instanceof DeleteAliasOperation) {
                            IvBackendParams resolveBackendParams2 = ExecutorsIvExtensionsKt.resolveBackendParams(operation4, ((DeleteAliasOperation) operation4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                IIdentityBackendService iIdentityBackendService2 = this._identityBackend;
                                String appId2 = ((DeleteAliasOperation) operation4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((DeleteAliasOperation) operation4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                identityOperationExecutor$execute$12.L$0 = this;
                                identityOperationExecutor$execute$12.L$1 = operation4;
                                identityOperationExecutor$execute$12.label = 2;
                                if (iIdentityBackendService2.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, identityOperationExecutor$execute$12) != coroutine_suspended) {
                                    identityOperationExecutor = this;
                                    operation = operation4;
                                    if (Intrinsics.areEqual(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation).getOnesignalId())) {
                                    }
                                }
                            } catch (BackendException e6) {
                                e = e6;
                                identityOperationExecutor = this;
                                operation = operation4;
                                i5 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i5 == 1) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    operation2 = (Operation) identityOperationExecutor$execute$12.L$1;
                    identityOperationExecutor2 = (IdentityOperationExecutor) identityOperationExecutor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i3 = 2;
                    } catch (BackendException e7) {
                        e = e7;
                        i3 = 2;
                        i4 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i4 == 1) {
                        }
                    }
                    try {
                        if (Intrinsics.areEqual(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                            Model.setStringProperty$default(identityOperationExecutor2._identityModelStore.getModel(), ((SetAliasOperation) operation2).getLabel(), ((SetAliasOperation) operation2).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                        }
                    } catch (BackendException e8) {
                        e = e8;
                        i4 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i4 == 1) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    operation = (Operation) identityOperationExecutor$execute$12.L$1;
                    identityOperationExecutor = (IdentityOperationExecutor) identityOperationExecutor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i2 = 2;
                    } catch (BackendException e9) {
                        e = e9;
                        i2 = 2;
                        i5 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i5 == 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 == i2) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i5 == 3) {
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        if (i5 == 4) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i5 == 5) {
                            if (e.getStatusCode() == 404 && identityOperationExecutor._newRecordState.isInMissingRetryWindow(((DeleteAliasOperation) operation).getOnesignalId())) {
                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        if (Intrinsics.areEqual(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation).getOnesignalId())) {
                            Model.setOptStringProperty$default(identityOperationExecutor._identityModelStore.getModel(), ((DeleteAliasOperation) operation).getLabel(), null, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                    } catch (BackendException e10) {
                        e = e10;
                        i5 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i5 == 1) {
                        }
                    }
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        identityOperationExecutor$execute$1 = new IdentityOperationExecutor$execute$1(this, continuation);
        IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$122 = identityOperationExecutor$execute$1;
        Object obj2 = identityOperationExecutor$execute$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityOperationExecutor$execute$122.label;
        if (i != 0) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }
}
