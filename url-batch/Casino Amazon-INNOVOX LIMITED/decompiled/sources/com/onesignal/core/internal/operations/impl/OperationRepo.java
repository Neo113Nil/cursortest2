package com.onesignal.core.internal.operations.impl;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.user.internal.jwt.JwtRequirement;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: OperationRepo.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b%\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002_`BC\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010/\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u00100J \u00101\u001a\u00020\u001f\"\b\b\u0000\u00102*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H205H\u0016J \u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020<H\u0086@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H\u0002J\u0018\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020\u001fH\u0016J\u001e\u0010C\u001a\u00020\u001f2\u0006\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010DJ\u001e\u0010E\u001a\u00020\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H\u0080@¢\u0006\u0004\bF\u0010GJ\b\u0010H\u001a\u00020\u001dH\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010J\u001a\u00020\"H\u0002J\u001d\u0010K\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00042\u0006\u0010L\u001a\u00020\u0014H\u0000¢\u0006\u0002\bMJ1\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020\u001f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010RJ\r\u0010S\u001a\u00020\u001dH\u0000¢\u0006\u0002\bTJ\u0015\u0010U\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u001fH\u0000¢\u0006\u0002\bWJ\u000e\u0010X\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u00100J\r\u0010Y\u001a\u00020\u001dH\u0000¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u000203H\u0002J\b\u0010]\u001a\u00020\u001dH\u0016J\u000e\u0010^\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u00100R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/onesignal/core/internal/operations/impl/OperationRepo;", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "Lcom/onesignal/core/internal/startup/IStartableService;", "executors", "", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "_operationModelStore", "Lcom/onesignal/core/internal/operations/impl/OperationModelStore;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_newRecordState", "Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Ljava/util/List;Lcom/onesignal/core/internal/operations/impl/OperationModelStore;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/user/internal/operations/impl/states/NewRecordsState;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "enqueueIntoBucket", "", "executeBucket", "getExecuteBucket", "()I", "executorsMap", "", "", "initialized", "Lkotlinx/coroutines/CompletableDeferred;", "", "paused", "", "queue", "", "Lcom/onesignal/core/internal/operations/impl/OperationRepo$OperationQueueItem;", "getQueue$com_onesignal_core", "()Ljava/util/List;", "retryWaiter", "Lcom/onesignal/common/threading/WaiterWithValue;", "Lcom/onesignal/core/internal/operations/impl/OperationRepo$LoopWaiterMessage;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "waiter", "awaitInitialized", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "containsInstanceOf", "T", "Lcom/onesignal/core/internal/operations/Operation;", WebViewManager.EVENT_TYPE_KEY, "Lkotlin/reflect/KClass;", "delayBeforeNextExecution", "retries", "retryAfterSeconds", "(ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delayForPostCreate", "postCreateDelay", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dropAndWake", "ops", "enqueue", "operation", "flush", "enqueueAndWait", "(Lcom/onesignal/core/internal/operations/Operation;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeOperations", "executeOperations$com_onesignal_core", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceExecuteOperations", "getGroupableOperations", "startingOp", "getNextOps", "bucketFilter", "getNextOps$com_onesignal_core", "internalEnqueue", "queueItem", "addToStore", "index", "(Lcom/onesignal/core/internal/operations/impl/OperationRepo$OperationQueueItem;ZZLjava/lang/Integer;)V", "loadSavedOperations", "loadSavedOperations$com_onesignal_core", "onJwtConfigHydrated", "ivRequired", "onJwtConfigHydrated$com_onesignal_core", "processQueueForever", "removeOperationsWithoutExternalId", "removeOperationsWithoutExternalId$com_onesignal_core", "shouldSuppressAnonymousOp", "op", ViewProps.START, "waitForNewOperationAndExecutionInterval", "LoopWaiterMessage", "OperationQueueItem", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationRepo implements IOperationRepo, IStartableService {
    private final ConfigModelStore _configModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final OperationModelStore _operationModelStore;
    private final ITime _time;
    private int enqueueIntoBucket;
    private final Map<String, IOperationExecutor> executorsMap;
    private final CompletableDeferred<Unit> initialized;
    private boolean paused;
    private final List<OperationQueueItem> queue;
    private final WaiterWithValue<LoopWaiterMessage> retryWaiter;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    private final Lazy scope;
    private final WaiterWithValue<LoopWaiterMessage> waiter;

    /* compiled from: OperationRepo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExecutionResult.values().length];
            try {
                iArr[ExecutionResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExecutionResult.FAIL_UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExecutionResult.FAIL_NORETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExecutionResult.FAIL_CONFLICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExecutionResult.SUCCESS_STARTING_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ExecutionResult.FAIL_RETRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ExecutionResult.FAIL_PAUSE_OPREPO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OperationRepo(List<? extends IOperationExecutor> executors, OperationModelStore _operationModelStore, ConfigModelStore _configModelStore, ITime _time, NewRecordsState _newRecordState, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(_operationModelStore, "_operationModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.scope = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.onesignal.core.internal.operations.impl.OperationRepo$scope$2
            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.CoroutineScope(ThreadPoolDispatcherKt.newSingleThreadContext("OSOperationRepoScope"));
            }
        });
        this.queue = new ArrayList();
        this.waiter = new WaiterWithValue<>();
        this.retryWaiter = new WaiterWithValue<>();
        this.initialized = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IOperationExecutor iOperationExecutor : executors) {
            Iterator<String> it = iOperationExecutor.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), iOperationExecutor);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    /* compiled from: OperationRepo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/onesignal/core/internal/operations/impl/OperationRepo$OperationQueueItem;", "", "operation", "Lcom/onesignal/core/internal/operations/Operation;", "waiter", "Lcom/onesignal/common/threading/WaiterWithValue;", "", "bucket", "", "retries", "(Lcom/onesignal/core/internal/operations/Operation;Lcom/onesignal/common/threading/WaiterWithValue;II)V", "getBucket", "()I", "getOperation", "()Lcom/onesignal/core/internal/operations/Operation;", "getRetries", "setRetries", "(I)V", "getWaiter", "()Lcom/onesignal/common/threading/WaiterWithValue;", "setWaiter", "(Lcom/onesignal/common/threading/WaiterWithValue;)V", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationQueueItem {
        private final int bucket;
        private final Operation operation;
        private int retries;
        private WaiterWithValue<Boolean> waiter;

        public OperationQueueItem(Operation operation, WaiterWithValue<Boolean> waiterWithValue, int i, int i2) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.waiter = waiterWithValue;
            this.bucket = i;
            this.retries = i2;
        }

        public /* synthetic */ OperationQueueItem(Operation operation, WaiterWithValue waiterWithValue, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(operation, (i3 & 2) != 0 ? null : waiterWithValue, i, (i3 & 8) != 0 ? 0 : i2);
        }

        public final Operation getOperation() {
            return this.operation;
        }

        public final WaiterWithValue<Boolean> getWaiter() {
            return this.waiter;
        }

        public final void setWaiter(WaiterWithValue<Boolean> waiterWithValue) {
            this.waiter = waiterWithValue;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final void setRetries(int i) {
            this.retries = i;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }
    }

    /* compiled from: OperationRepo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/core/internal/operations/impl/OperationRepo$LoopWaiterMessage;", "", "force", "", "previousWaitedTime", "", "(ZJ)V", "getForce", "()Z", "getPreviousWaitedTime", "()J", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoopWaiterMessage {
        private final boolean force;
        private final long previousWaitedTime;

        public LoopWaiterMessage(boolean z, long j) {
            this.force = z;
            this.previousWaitedTime = j;
        }

        public /* synthetic */ LoopWaiterMessage(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? 0L : j);
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    public final List<OperationQueueItem> getQueue$com_onesignal_core() {
        return this.queue;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object awaitInitialized(Continuation<? super Unit> continuation) {
        Object await = this.initialized.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    private final int getExecuteBucket() {
        int i = this.enqueueIntoBucket;
        if (i == 0) {
            return 0;
        }
        return i - 1;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public <T extends Operation> boolean containsInstanceOf(KClass<T> type) {
        boolean z;
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.queue) {
            List<OperationQueueItem> list = this.queue;
            z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (type.isInstance(((OperationQueueItem) it.next()).getOperation())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.paused = false;
        this._identityVerificationService.setOnJwtConfigHydratedHandler(new Function1<Boolean, Unit>() { // from class: com.onesignal.core.internal.operations.impl.OperationRepo$start$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                OperationRepo.this.onJwtConfigHydrated$com_onesignal_core(z);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new OperationRepo$start$2(this, null), 3, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void enqueue(Operation operation, boolean flush) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (shouldSuppressAnonymousOp(operation)) {
            return;
        }
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + flush + ')');
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        operation.setId(uuid);
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new OperationRepo$enqueue$1(this, operation, flush, null), 3, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object enqueueAndWait(Operation operation, boolean z, Continuation<? super Boolean> continuation) {
        if (shouldSuppressAnonymousOp(operation)) {
            return Boxing.boxBoolean(false);
        }
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueueAndWait(operation: " + operation + ", force: " + z + ')');
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        operation.setId(uuid);
        WaiterWithValue waiterWithValue = new WaiterWithValue();
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new OperationRepo$enqueueAndWait$2(this, operation, waiterWithValue, z, null), 3, null);
        return waiterWithValue.waitForWake(continuation);
    }

    private final boolean shouldSuppressAnonymousOp(Operation op) {
        boolean z = false;
        if (!this._identityVerificationService.getNewCodePathsRun() || (op instanceof LoginUserOperation)) {
            return false;
        }
        if (this._configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED && op.getExternalId() == null) {
            z = true;
        }
        if (z) {
            Logging.debug$default("OperationRepo: suppressing anonymous op under IV-required: " + op, null, 2, null);
        }
        return z;
    }

    static /* synthetic */ void internalEnqueue$default(OperationRepo operationRepo, OperationQueueItem operationQueueItem, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        operationRepo.internalEnqueue(operationQueueItem, z, z2, num);
    }

    private final void internalEnqueue(OperationQueueItem queueItem, boolean flush, boolean addToStore, Integer index) {
        Object obj;
        synchronized (this.queue) {
            List<OperationQueueItem> list = this.queue;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((OperationQueueItem) it.next()).getOperation().getId(), queueItem.getOperation().getId())) {
                        Logging.debug$default("OperationRepo: internalEnqueue - operation.id: " + queueItem.getOperation().getId() + " already exists in the queue.", null, 2, null);
                        return;
                    }
                }
            }
            Operation operation = queueItem.getOperation();
            if (operation instanceof LoginUserOperation) {
                Iterator<T> it2 = this.queue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    OperationQueueItem operationQueueItem = (OperationQueueItem) obj;
                    if ((operationQueueItem.getOperation() instanceof LoginUserOperation) && Intrinsics.areEqual(((LoginUserOperation) operationQueueItem.getOperation()).getOnesignalId(), ((LoginUserOperation) operation).getOnesignalId())) {
                        break;
                    }
                }
                OperationQueueItem operationQueueItem2 = (OperationQueueItem) obj;
                if (operationQueueItem2 != null) {
                    Operation operation2 = operationQueueItem2.getOperation();
                    Intrinsics.checkNotNull(operation2, "null cannot be cast to non-null type com.onesignal.user.internal.operations.LoginUserOperation");
                    LoginUserOperation loginUserOperation = (LoginUserOperation) operation2;
                    String existingOnesignalId = ((LoginUserOperation) operation).getExistingOnesignalId();
                    if (existingOnesignalId != null && !IDManager.INSTANCE.isLocalId(existingOnesignalId) && loginUserOperation.getExistingOnesignalId() == null) {
                        Logging.debug$default("OperationRepo: internalEnqueue - merging existingOnesignalId=" + existingOnesignalId + " into queued LoginUserOperation for onesignalId: " + ((LoginUserOperation) operation).getOnesignalId() + '.', null, 2, null);
                        loginUserOperation.setExistingOnesignalId$com_onesignal_core(existingOnesignalId);
                    } else {
                        Logging.debug$default("OperationRepo: internalEnqueue - LoginUserOperation for onesignalId: " + ((LoginUserOperation) operation).getOnesignalId() + " already exists in the queue.", null, 2, null);
                    }
                    if (queueItem.getWaiter() != null && operationQueueItem2.getWaiter() == null) {
                        operationQueueItem2.setWaiter(queueItem.getWaiter());
                    } else {
                        WaiterWithValue<Boolean> waiter = queueItem.getWaiter();
                        if (waiter != null) {
                            waiter.wake(true);
                        }
                    }
                    if (!addToStore) {
                        IModelStore.DefaultImpls.remove$default(this._operationModelStore, queueItem.getOperation().getId(), null, 2, null);
                    }
                    return;
                }
            }
            if (index != null) {
                this.queue.add(index.intValue(), queueItem);
            } else {
                this.queue.add(queueItem);
            }
            if (addToStore) {
                IModelStore.DefaultImpls.add$default(this._operationModelStore, queueItem.getOperation(), null, 2, null);
            }
            Unit unit = Unit.INSTANCE;
            this.waiter.wake(new LoopWaiterMessage(flush, 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r2.executeOperations$com_onesignal_core(r12, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r2.waitForNewOperationAndExecutionInterval(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e6 -> B:14:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f1 -> B:13:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(Continuation<? super Unit> continuation) {
        OperationRepo$processQueueForever$1 operationRepo$processQueueForever$1;
        int i;
        OperationRepo operationRepo;
        List list;
        if (continuation instanceof OperationRepo$processQueueForever$1) {
            operationRepo$processQueueForever$1 = (OperationRepo$processQueueForever$1) continuation;
            if ((operationRepo$processQueueForever$1.label & Integer.MIN_VALUE) != 0) {
                operationRepo$processQueueForever$1.label -= Integer.MIN_VALUE;
                Object obj = operationRepo$processQueueForever$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationRepo$processQueueForever$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    operationRepo$processQueueForever$1.L$0 = this;
                    operationRepo$processQueueForever$1.label = 1;
                    if (waitForNewOperationAndExecutionInterval(operationRepo$processQueueForever$1) != coroutine_suspended) {
                        operationRepo = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    long opRepoPostWakeDelay = operationRepo._configModelStore.getModel().getOpRepoPostWakeDelay();
                    operationRepo$processQueueForever$1.L$0 = operationRepo;
                    operationRepo$processQueueForever$1.label = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        operationRepo.enqueueIntoBucket++;
                        if (!operationRepo.paused) {
                            Logging.debug$default("OperationRepo is paused", null, 2, null);
                            return Unit.INSTANCE;
                        }
                        List<OperationQueueItem> nextOps$com_onesignal_core = operationRepo.getNextOps$com_onesignal_core(operationRepo.getExecuteBucket());
                        if (Logging.atLogLevel(LogLevel.DEBUG)) {
                            synchronized (operationRepo.queue) {
                                list = CollectionsKt.toList(operationRepo.queue);
                            }
                            Logging.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core + "\nqueue(" + list.size() + "):\n" + list, null, 2, null);
                        }
                        if (nextOps$com_onesignal_core != null) {
                            operationRepo$processQueueForever$1.L$0 = operationRepo;
                            operationRepo$processQueueForever$1.label = 2;
                        } else {
                            operationRepo$processQueueForever$1.L$0 = operationRepo;
                            operationRepo$processQueueForever$1.label = 4;
                        }
                        return coroutine_suspended;
                    }
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!operationRepo.paused) {
                    }
                }
                operationRepo.enqueueIntoBucket++;
                if (!operationRepo.paused) {
                }
            }
        }
        operationRepo$processQueueForever$1 = new OperationRepo$processQueueForever$1(this, continuation);
        Object obj2 = operationRepo$processQueueForever$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationRepo$processQueueForever$1.label;
        if (i != 0) {
        }
        operationRepo.enqueueIntoBucket++;
        if (!operationRepo.paused) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void forceExecuteOperations() {
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j = 0;
        this.retryWaiter.wake(new LoopWaiterMessage(true, j, i, defaultConstructorMarker));
        this.waiter.wake(new LoopWaiterMessage(false, j, i, defaultConstructorMarker));
    }

    public final void removeOperationsWithoutExternalId$com_onesignal_core() {
        ArrayList arrayList;
        synchronized (this.queue) {
            List<OperationQueueItem> list = this.queue;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((OperationQueueItem) obj).getOperation().getExternalId() == null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it.next()).getWaiter();
                if (waiter != null) {
                    waiter.wake(false);
                }
            }
            this.queue.removeAll(arrayList3);
            Iterator<T> it2 = this.queue.iterator();
            while (it2.hasNext()) {
                Operation operation = ((OperationQueueItem) it2.next()).getOperation();
                if ((operation instanceof LoginUserOperation) && ((LoginUserOperation) operation).getExistingOnesignalId() != null) {
                    Logging.debug$default("OperationRepo: cleared existingOnesignalId on LoginUserOperation (was " + ((LoginUserOperation) operation).getExistingOnesignalId() + ')', null, 2, null);
                    ((LoginUserOperation) operation).setExistingOnesignalId$com_onesignal_core(null);
                }
            }
            Logging.debug$default("OperationRepo: removeOperationsWithoutExternalId removed " + arrayList3.size() + " of " + (arrayList3.size() + this.queue.size()) + " operations", null, 2, null);
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((OperationQueueItem) it3.next()).getOperation().getId());
            }
            arrayList = arrayList5;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            IModelStore.DefaultImpls.remove$default(this._operationModelStore, (String) it4.next(), null, 2, null);
        }
    }

    public final void onJwtConfigHydrated$com_onesignal_core(boolean ivRequired) {
        ThreadUtilsKt.suspendifyOnIO(new OperationRepo$onJwtConfigHydrated$1(this, ivRequired, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009f -> B:11:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(Continuation<? super Unit> continuation) {
        OperationRepo$waitForNewOperationAndExecutionInterval$1 operationRepo$waitForNewOperationAndExecutionInterval$1;
        int i;
        Ref.ObjectRef objectRef;
        OperationRepo operationRepo;
        Ref.ObjectRef objectRef2;
        T t;
        long opRepoExecutionInterval;
        Ref.ObjectRef objectRef3;
        OperationRepo operationRepo2;
        if (continuation instanceof OperationRepo$waitForNewOperationAndExecutionInterval$1) {
            operationRepo$waitForNewOperationAndExecutionInterval$1 = (OperationRepo$waitForNewOperationAndExecutionInterval$1) continuation;
            if ((operationRepo$waitForNewOperationAndExecutionInterval$1.label & Integer.MIN_VALUE) != 0) {
                operationRepo$waitForNewOperationAndExecutionInterval$1.label -= Integer.MIN_VALUE;
                Object obj = operationRepo$waitForNewOperationAndExecutionInterval$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationRepo$waitForNewOperationAndExecutionInterval$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    WaiterWithValue<LoopWaiterMessage> waiterWithValue = this.waiter;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$0 = this;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$1 = objectRef;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$2 = objectRef;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.label = 1;
                    Object waitForWake = waiterWithValue.waitForWake(operationRepo$waitForNewOperationAndExecutionInterval$1);
                    if (waitForWake != coroutine_suspended) {
                        operationRepo = this;
                        objectRef2 = objectRef;
                        t = waitForWake;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) operationRepo$waitForNewOperationAndExecutionInterval$1.L$1;
                    operationRepo2 = (OperationRepo) operationRepo$waitForNewOperationAndExecutionInterval$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = obj;
                    if (obj2 != null) {
                        opRepoExecutionInterval = operationRepo2._configModelStore.getModel().getOpRepoExecutionInterval();
                        if (!((LoopWaiterMessage) objectRef3.element).getForce()) {
                            OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 operationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 = new OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1(objectRef3, operationRepo2, null);
                            operationRepo$waitForNewOperationAndExecutionInterval$1.L$0 = operationRepo2;
                            operationRepo$waitForNewOperationAndExecutionInterval$1.L$1 = objectRef3;
                            operationRepo$waitForNewOperationAndExecutionInterval$1.L$2 = null;
                            operationRepo$waitForNewOperationAndExecutionInterval$1.label = 2;
                            Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(opRepoExecutionInterval, operationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1, operationRepo$waitForNewOperationAndExecutionInterval$1);
                            obj2 = withTimeoutOrNull;
                        }
                    }
                    return Unit.INSTANCE;
                }
                objectRef = (Ref.ObjectRef) operationRepo$waitForNewOperationAndExecutionInterval$1.L$2;
                objectRef2 = (Ref.ObjectRef) operationRepo$waitForNewOperationAndExecutionInterval$1.L$1;
                operationRepo = (OperationRepo) operationRepo$waitForNewOperationAndExecutionInterval$1.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef.element = t;
                opRepoExecutionInterval = operationRepo._configModelStore.getModel().getOpRepoExecutionInterval() - ((LoopWaiterMessage) objectRef2.element).getPreviousWaitedTime();
                objectRef3 = objectRef2;
                operationRepo2 = operationRepo;
                if (!((LoopWaiterMessage) objectRef3.element).getForce()) {
                }
                return Unit.INSTANCE;
            }
        }
        operationRepo$waitForNewOperationAndExecutionInterval$1 = new OperationRepo$waitForNewOperationAndExecutionInterval$1(this, continuation);
        Object obj3 = operationRepo$waitForNewOperationAndExecutionInterval$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationRepo$waitForNewOperationAndExecutionInterval$1.label;
        if (i != 0) {
        }
        objectRef.element = t;
        opRepoExecutionInterval = operationRepo._configModelStore.getModel().getOpRepoExecutionInterval() - ((LoopWaiterMessage) objectRef2.element).getPreviousWaitedTime();
        objectRef3 = objectRef2;
        operationRepo2 = operationRepo;
        if (!((LoopWaiterMessage) objectRef3.element).getForce()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)|14|15|16))(4:34|35|36|37))(4:191|192|193|(6:195|(2:198|196)|199|200|(1:202)|29)(2:203|204))|38|39|(8:41|(2:44|42)|45|46|124|56|(2:59|57)|60)|65|66))|208|6|7|(0)(0)|38|39|(0)|65|66|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0042, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03f3, code lost:
    
        if (r0 == r5) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f8 A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024f A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d8 A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030a A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03da A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #2 {all -> 0x0042, blocks: (B:13:0x003d, B:25:0x03d4, B:27:0x03da), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103 A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0355 A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0182 A[Catch: all -> 0x03f6, TryCatch #5 {all -> 0x03f6, blocks: (B:39:0x00e1, B:41:0x0103, B:42:0x010a, B:44:0x0110, B:46:0x0122, B:47:0x0124, B:55:0x0147, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:63:0x0169, B:64:0x016a, B:65:0x016b, B:66:0x017d, B:68:0x034f, B:70:0x0355, B:71:0x0357, B:79:0x03b6, B:83:0x03b9, B:84:0x03ba, B:85:0x03bb, B:88:0x0182, B:89:0x01a1, B:91:0x01a7, B:94:0x01b3, B:99:0x01bb, B:100:0x01bd, B:108:0x01f2, B:112:0x01f6, B:113:0x01f7, B:114:0x01f8, B:115:0x0211, B:128:0x0249, B:132:0x024d, B:133:0x024e, B:134:0x024f, B:136:0x0265, B:137:0x026c, B:138:0x026e, B:157:0x02b6, B:161:0x02ba, B:162:0x02bb, B:163:0x02bc, B:164:0x02d8, B:166:0x02e0, B:169:0x02ef, B:170:0x030a, B:171:0x0311, B:173:0x0317, B:175:0x032e, B:176:0x0335, B:178:0x033b, B:181:0x0347, B:102:0x01be, B:103:0x01cb, B:105:0x01d1, B:107:0x01f0, B:73:0x0358, B:74:0x0366, B:76:0x036c, B:78:0x03b4, B:49:0x0125, B:50:0x012d, B:52:0x0133, B:54:0x0145, B:140:0x026f, B:141:0x027d, B:143:0x0283, B:146:0x0290, B:151:0x0294, B:152:0x02a2, B:154:0x02a8, B:156:0x02b4, B:117:0x0212, B:118:0x021f, B:120:0x0225, B:122:0x023b, B:124:0x0241, B:127:0x0247), top: B:38:0x00e1, inners: #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.onesignal.core.internal.operations.impl.OperationRepo] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<OperationQueueItem> list, Continuation<? super Unit> continuation) {
        OperationRepo$executeOperations$1 operationRepo$executeOperations$1;
        int i;
        ArrayList arrayList;
        OperationQueueItem operationQueueItem;
        OperationRepo operationRepo;
        ExecutionResponse executionResponse;
        int i2;
        Integer retryAfterSeconds;
        OperationRepo operationRepo2;
        List<OperationQueueItem> list2 = list;
        ?? r3 = "Could not find executor for operation ";
        if (continuation instanceof OperationRepo$executeOperations$1) {
            operationRepo$executeOperations$1 = (OperationRepo$executeOperations$1) continuation;
            if ((operationRepo$executeOperations$1.label & Integer.MIN_VALUE) != 0) {
                operationRepo$executeOperations$1.label -= Integer.MIN_VALUE;
                Object obj = operationRepo$executeOperations$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationRepo$executeOperations$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        OperationQueueItem operationQueueItem2 = (OperationQueueItem) CollectionsKt.first((List) list2);
                        IOperationExecutor iOperationExecutor = this.executorsMap.get(operationQueueItem2.getOperation().getName());
                        if (iOperationExecutor == null) {
                            throw new Exception("Could not find executor for operation " + operationQueueItem2.getOperation().getName());
                        }
                        List<OperationQueueItem> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((OperationQueueItem) it.next()).getOperation());
                        }
                        arrayList = arrayList2;
                        operationRepo$executeOperations$1.L$0 = this;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = operationQueueItem2;
                        operationRepo$executeOperations$1.L$3 = arrayList;
                        operationRepo$executeOperations$1.label = 1;
                        Object execute = iOperationExecutor.execute(arrayList, operationRepo$executeOperations$1);
                        if (execute != coroutine_suspended) {
                            operationQueueItem = operationQueueItem2;
                            obj = execute;
                            operationRepo = this;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        r3 = this;
                        Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                        r3.dropAndWake(list2);
                        return Unit.INSTANCE;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) operationRepo$executeOperations$1.L$1;
                        OperationRepo operationRepo3 = (OperationRepo) operationRepo$executeOperations$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = operationRepo3;
                        return Unit.INSTANCE;
                    }
                    ExecutionResponse executionResponse2 = (ExecutionResponse) operationRepo$executeOperations$1.L$2;
                    List<OperationQueueItem> list4 = (List) operationRepo$executeOperations$1.L$1;
                    OperationRepo operationRepo4 = (OperationRepo) operationRepo$executeOperations$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        executionResponse = executionResponse2;
                        list2 = list4;
                        operationRepo2 = operationRepo4;
                        r3 = operationRepo2;
                        if (executionResponse.getIdTranslations() != null) {
                            long opRepoPostCreateDelay = operationRepo2._configModelStore.getModel().getOpRepoPostCreateDelay();
                            operationRepo$executeOperations$1.L$0 = operationRepo2;
                            operationRepo$executeOperations$1.L$1 = list2;
                            operationRepo$executeOperations$1.L$2 = null;
                            operationRepo$executeOperations$1.label = 3;
                            Object delayForPostCreate = operationRepo2.delayForPostCreate(opRepoPostCreateDelay, operationRepo$executeOperations$1);
                            r3 = operationRepo2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list4;
                        r3 = operationRepo4;
                        Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                        r3.dropAndWake(list2);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                List<? extends Operation> list5 = (List) operationRepo$executeOperations$1.L$3;
                OperationQueueItem operationQueueItem3 = (OperationQueueItem) operationRepo$executeOperations$1.L$2;
                List<OperationQueueItem> list6 = (List) operationRepo$executeOperations$1.L$1;
                operationRepo = (OperationRepo) operationRepo$executeOperations$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    arrayList = list5;
                    list2 = list6;
                    operationQueueItem = operationQueueItem3;
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list6;
                    r3 = operationRepo;
                    Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                    r3.dropAndWake(list2);
                    return Unit.INSTANCE;
                }
                executionResponse = (ExecutionResponse) obj;
                Logging.debug$default("OperationRepo: execute response = " + executionResponse.getResult(), null, 2, null);
                if (executionResponse.getIdTranslations() != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((OperationQueueItem) it2.next()).getOperation().translateIds(executionResponse.getIdTranslations());
                    }
                    synchronized (operationRepo.queue) {
                        Iterator it3 = operationRepo.queue.iterator();
                        while (it3.hasNext()) {
                            ((OperationQueueItem) it3.next()).getOperation().translateIds(executionResponse.getIdTranslations());
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    Iterator it4 = executionResponse.getIdTranslations().values().iterator();
                    while (it4.hasNext()) {
                        operationRepo._newRecordState.add((String) it4.next());
                    }
                }
                Ref.IntRef intRef = new Ref.IntRef();
                switch (WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()]) {
                    case 1:
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            IModelStore.DefaultImpls.remove$default(operationRepo._operationModelStore, ((OperationQueueItem) it5.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it6.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boxing.boxBoolean(true));
                            }
                        }
                        if (executionResponse.getOperations() != null) {
                            synchronized (operationRepo.queue) {
                                for (Operation operation : CollectionsKt.reversed(executionResponse.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                                    operation.setId(uuid);
                                    OperationQueueItem operationQueueItem4 = new OperationQueueItem(operation, null, 0, 0, 10, null);
                                    operationRepo.queue.add(0, operationQueueItem4);
                                    IModelStore.DefaultImpls.add$default(operationRepo._operationModelStore, 0, operationQueueItem4.getOperation(), null, 4, null);
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                            operationRepo2 = operationRepo;
                            r3 = operationRepo2;
                            if (executionResponse.getIdTranslations() != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 2:
                        if (!operationRepo._identityVerificationService.getNewCodePathsRun() || !OperationRepoIvExtensionsKt.handleFailUnauthorized(operationRepo, operationQueueItem, list2, operationRepo._jwtTokenStore, operationRepo._identityVerificationService.getIvBehaviorActive())) {
                            Logging.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                            operationRepo.dropAndWake(list2);
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                    case 4:
                        Logging.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        operationRepo.dropAndWake(list2);
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        IModelStore.DefaultImpls.remove$default(operationRepo._operationModelStore, operationQueueItem.getOperation().getId(), null, 2, null);
                        WaiterWithValue<Boolean> waiter2 = operationQueueItem.getWaiter();
                        if (waiter2 != null) {
                            waiter2.wake(Boxing.boxBoolean(true));
                        }
                        synchronized (operationRepo.queue) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!Intrinsics.areEqual((OperationQueueItem) obj2, operationQueueItem)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            Iterator it7 = CollectionsKt.reversed(arrayList3).iterator();
                            while (it7.hasNext()) {
                                operationRepo.queue.add(0, (OperationQueueItem) it7.next());
                            }
                            Unit unit3 = Unit.INSTANCE;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        Logging.info$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (operationRepo.queue) {
                            for (OperationQueueItem operationQueueItem5 : CollectionsKt.reversed(list2)) {
                                operationQueueItem5.setRetries(operationQueueItem5.getRetries() + 1);
                                if (operationQueueItem5.getRetries() > intRef.element) {
                                    intRef.element = operationQueueItem5.getRetries();
                                }
                                operationRepo.queue.add(0, operationQueueItem5);
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 7:
                        Logging.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        operationRepo.paused = true;
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            WaiterWithValue<Boolean> waiter3 = ((OperationQueueItem) it8.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boxing.boxBoolean(false));
                            }
                        }
                        synchronized (operationRepo.queue) {
                            for (OperationQueueItem operationQueueItem6 : CollectionsKt.reversed(list2)) {
                                operationRepo.queue.add(0, new OperationQueueItem(operationQueueItem6.getOperation(), null, operationQueueItem6.getBucket(), operationQueueItem6.getRetries()));
                            }
                            Unit unit5 = Unit.INSTANCE;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    default:
                        if (executionResponse.getOperations() != null) {
                        }
                        i2 = intRef.element;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i2, retryAfterSeconds, operationRepo$executeOperations$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                }
            }
        }
        operationRepo$executeOperations$1 = new OperationRepo$executeOperations$1(this, continuation);
        Object obj3 = operationRepo$executeOperations$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationRepo$executeOperations$1.label;
        if (i != 0) {
        }
        executionResponse = (ExecutionResponse) obj3;
        Logging.debug$default("OperationRepo: execute response = " + executionResponse.getResult(), null, 2, null);
        if (executionResponse.getIdTranslations() != null) {
        }
        Ref.IntRef intRef2 = new Ref.IntRef();
        switch (WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()]) {
        }
    }

    private final void dropAndWake(List<OperationQueueItem> ops) {
        List<OperationQueueItem> list = ops;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IModelStore.DefaultImpls.remove$default(this._operationModelStore, ((OperationQueueItem) it.next()).getOperation().getId(), null, 2, null);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it2.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(false);
            }
        }
    }

    public final Object delayBeforeNextExecution(int i, Integer num, Continuation<? super Unit> continuation) {
        Logging.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(i * this._configModelStore.getModel().getOpRepoDefaultFailRetryBackoff(), (num != null ? num.intValue() : 0L) * 1000);
        if (max < 1) {
            return Unit.INSTANCE;
        }
        Logging.debug$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(max, new OperationRepo$delayBeforeNextExecution$2(this, null), continuation);
        return withTimeoutOrNull == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withTimeoutOrNull : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j, Continuation<? super Unit> continuation) {
        OperationRepo$delayForPostCreate$1 operationRepo$delayForPostCreate$1;
        int i;
        OperationRepo operationRepo;
        if (continuation instanceof OperationRepo$delayForPostCreate$1) {
            operationRepo$delayForPostCreate$1 = (OperationRepo$delayForPostCreate$1) continuation;
            if ((operationRepo$delayForPostCreate$1.label & Integer.MIN_VALUE) != 0) {
                operationRepo$delayForPostCreate$1.label -= Integer.MIN_VALUE;
                Object obj = operationRepo$delayForPostCreate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationRepo$delayForPostCreate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    operationRepo$delayForPostCreate$1.L$0 = this;
                    operationRepo$delayForPostCreate$1.J$0 = j;
                    operationRepo$delayForPostCreate$1.label = 1;
                    if (DelayKt.delay(j, operationRepo$delayForPostCreate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    operationRepo = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = operationRepo$delayForPostCreate$1.J$0;
                    operationRepo = (OperationRepo) operationRepo$delayForPostCreate$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                synchronized (operationRepo.queue) {
                    if (!operationRepo.queue.isEmpty()) {
                        operationRepo.waiter.wake(new LoopWaiterMessage(false, j));
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        operationRepo$delayForPostCreate$1 = new OperationRepo$delayForPostCreate$1(this, continuation);
        Object obj2 = operationRepo$delayForPostCreate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationRepo$delayForPostCreate$1.label;
        if (i != 0) {
        }
        synchronized (operationRepo.queue) {
        }
    }

    public final List<OperationQueueItem> getNextOps$com_onesignal_core(int bucketFilter) {
        Object obj;
        List<OperationQueueItem> list = null;
        if (this._configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.UNKNOWN) {
            return null;
        }
        boolean newCodePathsRun = this._identityVerificationService.getNewCodePathsRun();
        boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
        synchronized (this.queue) {
            Iterator<T> it = this.queue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                OperationQueueItem operationQueueItem = (OperationQueueItem) obj;
                if (operationQueueItem.getOperation().getCanStartExecute() && this._newRecordState.canAccess(operationQueueItem.getOperation().getApplyToRecordId()) && operationQueueItem.getBucket() <= bucketFilter && (!newCodePathsRun || OperationRepoIvExtensionsKt.hasValidJwtIfRequired(this, this._jwtTokenStore, operationQueueItem.getOperation(), ivBehaviorActive))) {
                    break;
                }
            }
            OperationQueueItem operationQueueItem2 = (OperationQueueItem) obj;
            if (operationQueueItem2 != null) {
                this.queue.remove(operationQueueItem2);
                list = getGroupableOperations(operationQueueItem2);
            }
        }
        return list;
    }

    private final List<OperationQueueItem> getGroupableOperations(OperationQueueItem startingOp) {
        String modifyComparisonKey;
        String modifyComparisonKey2;
        List<OperationQueueItem> mutableListOf = CollectionsKt.mutableListOf(startingOp);
        if (startingOp.getOperation().getGroupComparisonType() != GroupComparisonType.NONE) {
            if (startingOp.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE) {
                modifyComparisonKey = startingOp.getOperation().getCreateComparisonKey();
            } else {
                modifyComparisonKey = startingOp.getOperation().getModifyComparisonKey();
            }
            for (OperationQueueItem operationQueueItem : CollectionsKt.toList(this.queue)) {
                if (startingOp.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE) {
                    modifyComparisonKey2 = operationQueueItem.getOperation().getCreateComparisonKey();
                } else {
                    modifyComparisonKey2 = operationQueueItem.getOperation().getModifyComparisonKey();
                }
                if (Intrinsics.areEqual(modifyComparisonKey2, "") && Intrinsics.areEqual(modifyComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(operationQueueItem.getOperation().getApplyToRecordId()) && Intrinsics.areEqual(modifyComparisonKey2, modifyComparisonKey)) {
                    this.queue.remove(operationQueueItem);
                    mutableListOf.add(operationQueueItem);
                }
            }
        }
        return mutableListOf;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = CollectionsKt.reversed(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new OperationQueueItem((Operation) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        this.initialized.complete(Unit.INSTANCE);
    }
}
