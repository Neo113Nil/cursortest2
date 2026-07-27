package com.onesignal.core.internal.operations.impl;

import D4.AbstractC0024y;
import D4.C0013m;
import D4.InterfaceC0012l;
import D4.InterfaceC0022w;
import a.AbstractC0169a;
import com.onesignal.common.IDManager;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.WaiterWithValue;
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
import com.onesignal.user.internal.jwt.JwtRequirement;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import e5.g;
import f4.InterfaceC0428e;
import f4.v;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import z4.InterfaceC1586c;

/* loaded from: classes.dex */
public final class OperationRepo implements IOperationRepo, IStartableService {
    private final ConfigModelStore _configModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final OperationModelStore _operationModelStore;
    private final ITime _time;
    private int enqueueIntoBucket;
    private final Map<String, IOperationExecutor> executorsMap;
    private final InterfaceC0012l initialized;
    private boolean paused;
    private final List<OperationQueueItem> queue;
    private final WaiterWithValue<LoopWaiterMessage> retryWaiter;
    private final InterfaceC0428e scope$delegate;
    private final WaiterWithValue<LoopWaiterMessage> waiter;

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
        i.e(executors, "executors");
        i.e(_operationModelStore, "_operationModelStore");
        i.e(_configModelStore, "_configModelStore");
        i.e(_time, "_time");
        i.e(_newRecordState, "_newRecordState");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.scope$delegate = AbstractC0169a.A(OperationRepo$scope$2.INSTANCE);
        this.queue = new ArrayList();
        this.waiter = new WaiterWithValue<>();
        this.retryWaiter = new WaiterWithValue<>();
        this.initialized = AbstractC0024y.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IOperationExecutor iOperationExecutor : executors) {
            Iterator<String> it = iOperationExecutor.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), iOperationExecutor);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final void dropAndWake(List<OperationQueueItem> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IModelStore.DefaultImpls.remove$default(this._operationModelStore, ((OperationQueueItem) it.next()).getOperation().getId(), null, 2, null);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it2.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
    }

    private final int getExecuteBucket() {
        int i2 = this.enqueueIntoBucket;
        if (i2 == 0) {
            return 0;
        }
        return i2 - 1;
    }

    private final List<OperationQueueItem> getGroupableOperations(OperationQueueItem operationQueueItem) {
        ArrayList B02 = AbstractC0466k.B0(operationQueueItem);
        if (operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.NONE) {
            return B02;
        }
        String createComparisonKey = operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE ? operationQueueItem.getOperation().getCreateComparisonKey() : operationQueueItem.getOperation().getModifyComparisonKey();
        for (OperationQueueItem operationQueueItem2 : AbstractC0465j.S0(this.queue)) {
            String createComparisonKey2 = operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE ? operationQueueItem2.getOperation().getCreateComparisonKey() : operationQueueItem2.getOperation().getModifyComparisonKey();
            if (i.a(createComparisonKey2, "") && i.a(createComparisonKey, "")) {
                throw new Exception("Both comparison keys can not be blank!");
            }
            if (this._newRecordState.canAccess(operationQueueItem2.getOperation().getApplyToRecordId()) && i.a(createComparisonKey2, createComparisonKey)) {
                this.queue.remove(operationQueueItem2);
                B02.add(operationQueueItem2);
            }
        }
        return B02;
    }

    private final InterfaceC0022w getScope() {
        return (InterfaceC0022w) this.scope$delegate.getValue();
    }

    private final void internalEnqueue(OperationQueueItem operationQueueItem, boolean z, boolean z5, Integer num) {
        Object obj;
        synchronized (this.queue) {
            try {
                List<OperationQueueItem> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (i.a(((OperationQueueItem) it.next()).getOperation().getId(), operationQueueItem.getOperation().getId())) {
                            Logging.debug$default("OperationRepo: internalEnqueue - operation.id: " + operationQueueItem.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                Operation operation = operationQueueItem.getOperation();
                if (operation instanceof LoginUserOperation) {
                    Iterator<T> it2 = this.queue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        OperationQueueItem operationQueueItem2 = (OperationQueueItem) obj;
                        if ((operationQueueItem2.getOperation() instanceof LoginUserOperation) && i.a(((LoginUserOperation) operationQueueItem2.getOperation()).getOnesignalId(), ((LoginUserOperation) operation).getOnesignalId())) {
                            break;
                        }
                    }
                    OperationQueueItem operationQueueItem3 = (OperationQueueItem) obj;
                    if (operationQueueItem3 != null) {
                        Operation operation2 = operationQueueItem3.getOperation();
                        i.c(operation2, "null cannot be cast to non-null type com.onesignal.user.internal.operations.LoginUserOperation");
                        LoginUserOperation loginUserOperation = (LoginUserOperation) operation2;
                        String existingOnesignalId = ((LoginUserOperation) operation).getExistingOnesignalId();
                        if (existingOnesignalId == null || IDManager.INSTANCE.isLocalId(existingOnesignalId) || loginUserOperation.getExistingOnesignalId() != null) {
                            Logging.debug$default("OperationRepo: internalEnqueue - LoginUserOperation for onesignalId: " + ((LoginUserOperation) operation).getOnesignalId() + " already exists in the queue.", null, 2, null);
                        } else {
                            Logging.debug$default("OperationRepo: internalEnqueue - merging existingOnesignalId=" + existingOnesignalId + " into queued LoginUserOperation for onesignalId: " + ((LoginUserOperation) operation).getOnesignalId() + '.', null, 2, null);
                            loginUserOperation.setExistingOnesignalId$com_onesignal_core(existingOnesignalId);
                        }
                        if (operationQueueItem.getWaiter() == null || operationQueueItem3.getWaiter() != null) {
                            WaiterWithValue<Boolean> waiter = operationQueueItem.getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        } else {
                            operationQueueItem3.setWaiter(operationQueueItem.getWaiter());
                        }
                        if (!z5) {
                            IModelStore.DefaultImpls.remove$default(this._operationModelStore, operationQueueItem.getOperation().getId(), null, 2, null);
                        }
                        return;
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), operationQueueItem);
                } else {
                    this.queue.add(operationQueueItem);
                }
                if (z5) {
                    IModelStore.DefaultImpls.add$default(this._operationModelStore, operationQueueItem.getOperation(), null, 2, null);
                }
                this.waiter.wake(new LoopWaiterMessage(z, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(OperationRepo operationRepo, OperationQueueItem operationQueueItem, boolean z, boolean z5, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        operationRepo.internalEnqueue(operationQueueItem, z, z5, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:14:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:13:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(InterfaceC1218d interfaceC1218d) {
        OperationRepo$processQueueForever$1 operationRepo$processQueueForever$1;
        int i2;
        OperationRepo operationRepo;
        long opRepoPostWakeDelay;
        List S02;
        if (interfaceC1218d instanceof OperationRepo$processQueueForever$1) {
            operationRepo$processQueueForever$1 = (OperationRepo$processQueueForever$1) interfaceC1218d;
            int i3 = operationRepo$processQueueForever$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                operationRepo$processQueueForever$1.label = i3 - Integer.MIN_VALUE;
                Object obj = operationRepo$processQueueForever$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = operationRepo$processQueueForever$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    operationRepo$processQueueForever$1.L$0 = this;
                    operationRepo$processQueueForever$1.label = 1;
                    if (waitForNewOperationAndExecutionInterval(operationRepo$processQueueForever$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    operationRepo = this;
                } else if (i2 == 1) {
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    g.y(obj);
                } else if (i2 == 2) {
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    g.y(obj);
                    opRepoPostWakeDelay = operationRepo._configModelStore.getModel().getOpRepoPostWakeDelay();
                    operationRepo$processQueueForever$1.L$0 = operationRepo;
                    operationRepo$processQueueForever$1.label = 3;
                    if (AbstractC0024y.d(opRepoPostWakeDelay, operationRepo$processQueueForever$1) == enumC1260a) {
                    }
                    if (operationRepo.paused) {
                    }
                } else if (i2 == 3) {
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    g.y(obj);
                    if (operationRepo.paused) {
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    operationRepo = (OperationRepo) operationRepo$processQueueForever$1.L$0;
                    g.y(obj);
                    operationRepo.enqueueIntoBucket++;
                    if (operationRepo.paused) {
                        Logging.debug$default("OperationRepo is paused", null, 2, null);
                        return v.f5689a;
                    }
                    List<OperationQueueItem> nextOps$com_onesignal_core = operationRepo.getNextOps$com_onesignal_core(operationRepo.getExecuteBucket());
                    if (Logging.atLogLevel(LogLevel.DEBUG)) {
                        synchronized (operationRepo.queue) {
                            S02 = AbstractC0465j.S0(operationRepo.queue);
                        }
                        Logging.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core + "\nqueue(" + S02.size() + "):\n" + S02, null, 2, null);
                    }
                    if (nextOps$com_onesignal_core != null) {
                        operationRepo$processQueueForever$1.L$0 = operationRepo;
                        operationRepo$processQueueForever$1.label = 2;
                        if (operationRepo.executeOperations$com_onesignal_core(nextOps$com_onesignal_core, operationRepo$processQueueForever$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        opRepoPostWakeDelay = operationRepo._configModelStore.getModel().getOpRepoPostWakeDelay();
                        operationRepo$processQueueForever$1.L$0 = operationRepo;
                        operationRepo$processQueueForever$1.label = 3;
                        if (AbstractC0024y.d(opRepoPostWakeDelay, operationRepo$processQueueForever$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        if (operationRepo.paused) {
                        }
                    } else {
                        operationRepo$processQueueForever$1.L$0 = operationRepo;
                        operationRepo$processQueueForever$1.label = 4;
                        if (operationRepo.waitForNewOperationAndExecutionInterval(operationRepo$processQueueForever$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        operationRepo.enqueueIntoBucket++;
                        if (operationRepo.paused) {
                        }
                    }
                }
                operationRepo.enqueueIntoBucket++;
                if (operationRepo.paused) {
                }
            }
        }
        operationRepo$processQueueForever$1 = new OperationRepo$processQueueForever$1(this, interfaceC1218d);
        Object obj2 = operationRepo$processQueueForever$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = operationRepo$processQueueForever$1.label;
        if (i2 != 0) {
        }
        operationRepo.enqueueIntoBucket++;
        if (operationRepo.paused) {
        }
    }

    private final boolean shouldSuppressAnonymousOp(Operation operation) {
        boolean z = false;
        if (!this._identityVerificationService.getNewCodePathsRun() || (operation instanceof LoginUserOperation)) {
            return false;
        }
        if (this._configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED && operation.getExternalId() == null) {
            z = true;
        }
        if (z) {
            Logging.debug$default("OperationRepo: suppressing anonymous op under IV-required: " + operation, null, 2, null);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:11:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(InterfaceC1218d interfaceC1218d) {
        OperationRepo$waitForNewOperationAndExecutionInterval$1 operationRepo$waitForNewOperationAndExecutionInterval$1;
        int i2;
        s sVar;
        OperationRepo operationRepo;
        s sVar2;
        long opRepoExecutionInterval;
        s sVar3;
        OperationRepo operationRepo2;
        if (interfaceC1218d instanceof OperationRepo$waitForNewOperationAndExecutionInterval$1) {
            operationRepo$waitForNewOperationAndExecutionInterval$1 = (OperationRepo$waitForNewOperationAndExecutionInterval$1) interfaceC1218d;
            int i3 = operationRepo$waitForNewOperationAndExecutionInterval$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                operationRepo$waitForNewOperationAndExecutionInterval$1.label = i3 - Integer.MIN_VALUE;
                Object obj = operationRepo$waitForNewOperationAndExecutionInterval$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = operationRepo$waitForNewOperationAndExecutionInterval$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    sVar = new s();
                    WaiterWithValue<LoopWaiterMessage> waiterWithValue = this.waiter;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$0 = this;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$1 = sVar;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.L$2 = sVar;
                    operationRepo$waitForNewOperationAndExecutionInterval$1.label = 1;
                    obj = waiterWithValue.waitForWake(operationRepo$waitForNewOperationAndExecutionInterval$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    operationRepo = this;
                    sVar2 = sVar;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar3 = (s) operationRepo$waitForNewOperationAndExecutionInterval$1.L$1;
                        operationRepo2 = (OperationRepo) operationRepo$waitForNewOperationAndExecutionInterval$1.L$0;
                        g.y(obj);
                        if (obj != null) {
                            opRepoExecutionInterval = operationRepo2._configModelStore.getModel().getOpRepoExecutionInterval();
                            if (!((LoopWaiterMessage) sVar3.f10741a).getForce()) {
                                OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 operationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 = new OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1(sVar3, operationRepo2, null);
                                operationRepo$waitForNewOperationAndExecutionInterval$1.L$0 = operationRepo2;
                                operationRepo$waitForNewOperationAndExecutionInterval$1.L$1 = sVar3;
                                operationRepo$waitForNewOperationAndExecutionInterval$1.L$2 = null;
                                operationRepo$waitForNewOperationAndExecutionInterval$1.label = 2;
                                obj = AbstractC0024y.y(opRepoExecutionInterval, operationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1, operationRepo$waitForNewOperationAndExecutionInterval$1);
                                if (obj == enumC1260a) {
                                    return enumC1260a;
                                }
                                if (obj != null) {
                                }
                            }
                        }
                        return v.f5689a;
                    }
                    sVar = (s) operationRepo$waitForNewOperationAndExecutionInterval$1.L$2;
                    sVar2 = (s) operationRepo$waitForNewOperationAndExecutionInterval$1.L$1;
                    operationRepo = (OperationRepo) operationRepo$waitForNewOperationAndExecutionInterval$1.L$0;
                    g.y(obj);
                }
                sVar.f10741a = obj;
                opRepoExecutionInterval = operationRepo._configModelStore.getModel().getOpRepoExecutionInterval() - ((LoopWaiterMessage) sVar2.f10741a).getPreviousWaitedTime();
                sVar3 = sVar2;
                operationRepo2 = operationRepo;
                if (!((LoopWaiterMessage) sVar3.f10741a).getForce()) {
                }
                return v.f5689a;
            }
        }
        operationRepo$waitForNewOperationAndExecutionInterval$1 = new OperationRepo$waitForNewOperationAndExecutionInterval$1(this, interfaceC1218d);
        Object obj2 = operationRepo$waitForNewOperationAndExecutionInterval$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = operationRepo$waitForNewOperationAndExecutionInterval$1.label;
        if (i2 != 0) {
        }
        sVar.f10741a = obj2;
        opRepoExecutionInterval = operationRepo._configModelStore.getModel().getOpRepoExecutionInterval() - ((LoopWaiterMessage) sVar2.f10741a).getPreviousWaitedTime();
        sVar3 = sVar2;
        operationRepo2 = operationRepo;
        if (!((LoopWaiterMessage) sVar3.f10741a).getForce()) {
        }
        return v.f5689a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object awaitInitialized(InterfaceC1218d interfaceC1218d) {
        Object W5 = ((C0013m) this.initialized).W(interfaceC1218d);
        return W5 == EnumC1260a.f11058a ? W5 : v.f5689a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public <T extends Operation> boolean containsInstanceOf(InterfaceC1586c type) {
        boolean z;
        i.e(type, "type");
        synchronized (this.queue) {
            try {
                List<OperationQueueItem> list = this.queue;
                z = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((d) type).c(((OperationQueueItem) it.next()).getOperation())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final Object delayBeforeNextExecution(int i2, Integer num, InterfaceC1218d interfaceC1218d) {
        Logging.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(this._configModelStore.getModel().getOpRepoDefaultFailRetryBackoff() * i2, (num != null ? num.intValue() : 0L) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        v vVar = v.f5689a;
        if (max < 1) {
            return vVar;
        }
        Logging.debug$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object y5 = AbstractC0024y.y(max, new OperationRepo$delayBeforeNextExecution$2(this, null), interfaceC1218d);
        return y5 == EnumC1260a.f11058a ? y5 : vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j2, InterfaceC1218d interfaceC1218d) {
        OperationRepo$delayForPostCreate$1 operationRepo$delayForPostCreate$1;
        int i2;
        OperationRepo operationRepo;
        if (interfaceC1218d instanceof OperationRepo$delayForPostCreate$1) {
            operationRepo$delayForPostCreate$1 = (OperationRepo$delayForPostCreate$1) interfaceC1218d;
            int i3 = operationRepo$delayForPostCreate$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                operationRepo$delayForPostCreate$1.label = i3 - Integer.MIN_VALUE;
                Object obj = operationRepo$delayForPostCreate$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = operationRepo$delayForPostCreate$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    operationRepo$delayForPostCreate$1.L$0 = this;
                    operationRepo$delayForPostCreate$1.J$0 = j2;
                    operationRepo$delayForPostCreate$1.label = 1;
                    if (AbstractC0024y.d(j2, operationRepo$delayForPostCreate$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    operationRepo = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = operationRepo$delayForPostCreate$1.J$0;
                    operationRepo = (OperationRepo) operationRepo$delayForPostCreate$1.L$0;
                    g.y(obj);
                }
                synchronized (operationRepo.queue) {
                    if (!operationRepo.queue.isEmpty()) {
                        operationRepo.waiter.wake(new LoopWaiterMessage(false, j2));
                    }
                }
                return v.f5689a;
            }
        }
        operationRepo$delayForPostCreate$1 = new OperationRepo$delayForPostCreate$1(this, interfaceC1218d);
        Object obj2 = operationRepo$delayForPostCreate$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = operationRepo$delayForPostCreate$1.label;
        if (i2 != 0) {
        }
        synchronized (operationRepo.queue) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void enqueue(Operation operation, boolean z) {
        i.e(operation, "operation");
        if (shouldSuppressAnonymousOp(operation)) {
            return;
        }
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z + ')');
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "toString(...)");
        operation.setId(uuid);
        AbstractC0024y.n(getScope(), null, 0, new OperationRepo$enqueue$1(this, operation, z, null), 3);
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object enqueueAndWait(Operation operation, boolean z, InterfaceC1218d interfaceC1218d) {
        if (shouldSuppressAnonymousOp(operation)) {
            return Boolean.FALSE;
        }
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueueAndWait(operation: " + operation + ", force: " + z + ')');
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "toString(...)");
        operation.setId(uuid);
        WaiterWithValue waiterWithValue = new WaiterWithValue();
        AbstractC0024y.n(getScope(), null, 0, new OperationRepo$enqueueAndWait$2(this, operation, waiterWithValue, z, null), 3);
        return waiterWithValue.waitForWake(interfaceC1218d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(2:27|(1:29))|14|15|16))(4:34|35|36|37))(4:191|192|193|(5:195|(2:198|196)|199|200|(1:202)(1:203))(2:204|205))|38|39|(8:41|(2:44|42)|45|46|11c|55|(2:58|56)|59)|64|65))|209|6|7|(0)(0)|38|39|(0)|64|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0117, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x003f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d8 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0224 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0280 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0299 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ca A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x037e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:13:0x003a, B:25:0x0378, B:27:0x037e), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030a A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0376 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:39:0x00db, B:41:0x00fb, B:42:0x00ff, B:44:0x0105, B:46:0x011a, B:47:0x011c, B:54:0x013d, B:55:0x013e, B:56:0x014a, B:58:0x0150, B:62:0x015c, B:63:0x015d, B:64:0x015e, B:65:0x016b, B:67:0x0304, B:69:0x030a, B:70:0x030c, B:77:0x035e, B:81:0x0360, B:82:0x0361, B:83:0x0362, B:87:0x0171, B:88:0x018b, B:90:0x0191, B:93:0x019d, B:98:0x01a3, B:99:0x01a5, B:107:0x01d4, B:111:0x01d6, B:112:0x01d7, B:113:0x01d8, B:114:0x01ee, B:126:0x021f, B:131:0x0222, B:132:0x0223, B:133:0x0224, B:135:0x0237, B:136:0x023c, B:137:0x023e, B:155:0x027b, B:160:0x027e, B:161:0x027f, B:162:0x0280, B:163:0x0299, B:165:0x02a1, B:168:0x02b1, B:169:0x02ca, B:170:0x02ce, B:172:0x02d4, B:174:0x02e8, B:175:0x02ec, B:177:0x02f2, B:180:0x02fe, B:101:0x01a6, B:102:0x01ae, B:104:0x01b4, B:116:0x01ef, B:117:0x01f8, B:119:0x01fe, B:121:0x0212, B:123:0x0219, B:49:0x011d, B:50:0x0123, B:52:0x0129, B:72:0x030d, B:73:0x0319, B:75:0x031f, B:139:0x023f, B:140:0x0248, B:142:0x024e, B:145:0x025b, B:150:0x0261, B:151:0x0269, B:153:0x026f), top: B:38:0x00db, inners: #1, #2, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.onesignal.core.internal.operations.impl.OperationRepo] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<OperationQueueItem> list, InterfaceC1218d interfaceC1218d) {
        OperationRepo$executeOperations$1 operationRepo$executeOperations$1;
        int i2;
        ArrayList arrayList;
        OperationRepo operationRepo;
        OperationQueueItem operationQueueItem;
        ExecutionResponse executionResponse;
        int i3;
        Integer retryAfterSeconds;
        OperationRepo operationRepo2;
        List<OperationQueueItem> list2 = list;
        ?? r32 = "Could not find executor for operation ";
        if (interfaceC1218d instanceof OperationRepo$executeOperations$1) {
            operationRepo$executeOperations$1 = (OperationRepo$executeOperations$1) interfaceC1218d;
            int i6 = operationRepo$executeOperations$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                operationRepo$executeOperations$1.label = i6 - Integer.MIN_VALUE;
                Object obj = operationRepo$executeOperations$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = operationRepo$executeOperations$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    try {
                        OperationQueueItem operationQueueItem2 = (OperationQueueItem) AbstractC0465j.F0(list);
                        IOperationExecutor iOperationExecutor = this.executorsMap.get(operationQueueItem2.getOperation().getName());
                        if (iOperationExecutor == null) {
                            throw new Exception("Could not find executor for operation " + operationQueueItem2.getOperation().getName());
                        }
                        arrayList = new ArrayList(AbstractC0467l.D0(list2, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((OperationQueueItem) it.next()).getOperation());
                        }
                        operationRepo$executeOperations$1.L$0 = this;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = operationQueueItem2;
                        operationRepo$executeOperations$1.L$3 = arrayList;
                        operationRepo$executeOperations$1.label = 1;
                        Object execute = iOperationExecutor.execute(arrayList, operationRepo$executeOperations$1);
                        if (execute == enumC1260a) {
                            return enumC1260a;
                        }
                        operationRepo = this;
                        operationQueueItem = operationQueueItem2;
                        obj = execute;
                    } catch (Throwable th) {
                        th = th;
                        r32 = this;
                        Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f5689a;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list2 = (List) operationRepo$executeOperations$1.L$1;
                            OperationRepo operationRepo3 = (OperationRepo) operationRepo$executeOperations$1.L$0;
                            g.y(obj);
                            r32 = operationRepo3;
                            return v.f5689a;
                        }
                        ExecutionResponse executionResponse2 = (ExecutionResponse) operationRepo$executeOperations$1.L$2;
                        List<OperationQueueItem> list3 = (List) operationRepo$executeOperations$1.L$1;
                        OperationRepo operationRepo4 = (OperationRepo) operationRepo$executeOperations$1.L$0;
                        try {
                            g.y(obj);
                            executionResponse = executionResponse2;
                            list2 = list3;
                            operationRepo2 = operationRepo4;
                            r32 = operationRepo2;
                            if (executionResponse.getIdTranslations() != null) {
                                long opRepoPostCreateDelay = operationRepo2._configModelStore.getModel().getOpRepoPostCreateDelay();
                                operationRepo$executeOperations$1.L$0 = operationRepo2;
                                operationRepo$executeOperations$1.L$1 = list2;
                                operationRepo$executeOperations$1.L$2 = null;
                                operationRepo$executeOperations$1.label = 3;
                                Object delayForPostCreate = operationRepo2.delayForPostCreate(opRepoPostCreateDelay, operationRepo$executeOperations$1);
                                r32 = operationRepo2;
                                if (delayForPostCreate == enumC1260a) {
                                    return enumC1260a;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = list3;
                            r32 = operationRepo4;
                            Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                            r32.dropAndWake(list2);
                            return v.f5689a;
                        }
                        return v.f5689a;
                    }
                    ?? r22 = (List) operationRepo$executeOperations$1.L$3;
                    OperationQueueItem operationQueueItem3 = (OperationQueueItem) operationRepo$executeOperations$1.L$2;
                    List<OperationQueueItem> list4 = (List) operationRepo$executeOperations$1.L$1;
                    operationRepo = (OperationRepo) operationRepo$executeOperations$1.L$0;
                    try {
                        g.y(obj);
                        arrayList = r22;
                        list2 = list4;
                        operationQueueItem = operationQueueItem3;
                    } catch (Throwable th3) {
                        th = th3;
                        list2 = list4;
                        r32 = operationRepo;
                        Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f5689a;
                    }
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
                    }
                    Iterator it4 = executionResponse.getIdTranslations().values().iterator();
                    while (it4.hasNext()) {
                        operationRepo._newRecordState.add((String) it4.next());
                    }
                }
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
                                waiter.wake(Boolean.TRUE);
                            }
                        }
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                            synchronized (operationRepo.queue) {
                                for (Operation operation : AbstractC0465j.O0(executionResponse.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    i.d(uuid, "toString(...)");
                                    operation.setId(uuid);
                                    OperationQueueItem operationQueueItem4 = new OperationQueueItem(operation, null, 0, 0, 10, null);
                                    operationRepo.queue.add(0, operationQueueItem4);
                                    IModelStore.DefaultImpls.add$default(operationRepo._operationModelStore, 0, operationQueueItem4.getOperation(), null, 4, null);
                                }
                            }
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        operationRepo2 = operationRepo;
                        r32 = operationRepo2;
                        if (executionResponse.getIdTranslations() != null) {
                        }
                        return v.f5689a;
                    case 2:
                        if (!operationRepo._identityVerificationService.getNewCodePathsRun() || !OperationRepoIvExtensionsKt.handleFailUnauthorized(operationRepo, operationQueueItem, list2, operationRepo._jwtTokenStore, operationRepo._identityVerificationService.getIvBehaviorActive())) {
                            Logging.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                            operationRepo.dropAndWake(list2);
                        }
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                    case 3:
                    case 4:
                        Logging.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        operationRepo.dropAndWake(list2);
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                    case 5:
                        IModelStore.DefaultImpls.remove$default(operationRepo._operationModelStore, operationQueueItem.getOperation().getId(), null, 2, null);
                        WaiterWithValue<Boolean> waiter2 = operationQueueItem.getWaiter();
                        if (waiter2 != null) {
                            waiter2.wake(Boolean.TRUE);
                        }
                        synchronized (operationRepo.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!i.a((OperationQueueItem) obj2, operationQueueItem)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it7 = AbstractC0465j.O0(arrayList2).iterator();
                                while (it7.hasNext()) {
                                    operationRepo.queue.add(0, (OperationQueueItem) it7.next());
                                }
                            } finally {
                            }
                        }
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                    case 6:
                        Logging.info$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (operationRepo.queue) {
                            try {
                                i3 = 0;
                                for (OperationQueueItem operationQueueItem5 : AbstractC0465j.O0(list2)) {
                                    operationQueueItem5.setRetries(operationQueueItem5.getRetries() + 1);
                                    if (operationQueueItem5.getRetries() > i3) {
                                        i3 = operationQueueItem5.getRetries();
                                    }
                                    operationRepo.queue.add(0, operationQueueItem5);
                                }
                            } finally {
                            }
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                    case 7:
                        Logging.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        operationRepo.paused = true;
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            WaiterWithValue<Boolean> waiter3 = ((OperationQueueItem) it8.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boolean.FALSE);
                            }
                        }
                        synchronized (operationRepo.queue) {
                            for (OperationQueueItem operationQueueItem6 : AbstractC0465j.O0(list2)) {
                                operationRepo.queue.add(0, new OperationQueueItem(operationQueueItem6.getOperation(), null, operationQueueItem6.getBucket(), operationQueueItem6.getRetries()));
                            }
                        }
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                    default:
                        i3 = 0;
                        if (executionResponse.getOperations() != null) {
                        }
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo.delayBeforeNextExecution(i3, retryAfterSeconds, operationRepo$executeOperations$1) == enumC1260a) {
                        }
                        break;
                }
            }
        }
        operationRepo$executeOperations$1 = new OperationRepo$executeOperations$1(this, interfaceC1218d);
        Object obj3 = operationRepo$executeOperations$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = operationRepo$executeOperations$1.label;
        if (i2 != 0) {
        }
        executionResponse = (ExecutionResponse) obj3;
        Logging.debug$default("OperationRepo: execute response = " + executionResponse.getResult(), null, 2, null);
        if (executionResponse.getIdTranslations() != null) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()]) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void forceExecuteOperations() {
        int i2 = 2;
        e eVar = null;
        long j2 = 0;
        this.retryWaiter.wake(new LoopWaiterMessage(true, j2, i2, eVar));
        this.waiter.wake(new LoopWaiterMessage(false, j2, i2, eVar));
    }

    public final List<OperationQueueItem> getNextOps$com_onesignal_core(int i2) {
        Object obj;
        List<OperationQueueItem> list = null;
        if (this._configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.UNKNOWN) {
            return null;
        }
        boolean newCodePathsRun = this._identityVerificationService.getNewCodePathsRun();
        boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    OperationQueueItem operationQueueItem = (OperationQueueItem) obj;
                    if (operationQueueItem.getOperation().getCanStartExecute() && this._newRecordState.canAccess(operationQueueItem.getOperation().getApplyToRecordId()) && operationQueueItem.getBucket() <= i2 && (!newCodePathsRun || OperationRepoIvExtensionsKt.hasValidJwtIfRequired(this, this._jwtTokenStore, operationQueueItem.getOperation(), ivBehaviorActive))) {
                        break;
                    }
                }
                OperationQueueItem operationQueueItem2 = (OperationQueueItem) obj;
                if (operationQueueItem2 != null) {
                    this.queue.remove(operationQueueItem2);
                    list = getGroupableOperations(operationQueueItem2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<OperationQueueItem> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = AbstractC0465j.O0(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new OperationQueueItem((Operation) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((C0013m) this.initialized).L(v.f5689a);
    }

    public final void onJwtConfigHydrated$com_onesignal_core(boolean z) {
        ThreadUtilsKt.suspendifyOnIO(new OperationRepo$onJwtConfigHydrated$1(this, z, null));
    }

    public final void removeOperationsWithoutExternalId$com_onesignal_core() {
        ArrayList arrayList;
        synchronized (this.queue) {
            try {
                List<OperationQueueItem> list = this.queue;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((OperationQueueItem) obj).getOperation().getExternalId() == null) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it.next()).getWaiter();
                    if (waiter != null) {
                        waiter.wake(Boolean.FALSE);
                    }
                }
                this.queue.removeAll(arrayList2);
                Iterator<T> it2 = this.queue.iterator();
                while (it2.hasNext()) {
                    Operation operation = ((OperationQueueItem) it2.next()).getOperation();
                    if ((operation instanceof LoginUserOperation) && ((LoginUserOperation) operation).getExistingOnesignalId() != null) {
                        Logging.debug$default("OperationRepo: cleared existingOnesignalId on LoginUserOperation (was " + ((LoginUserOperation) operation).getExistingOnesignalId() + ')', null, 2, null);
                        ((LoginUserOperation) operation).setExistingOnesignalId$com_onesignal_core(null);
                    }
                }
                Logging.debug$default("OperationRepo: removeOperationsWithoutExternalId removed " + arrayList2.size() + " of " + (arrayList2.size() + this.queue.size()) + " operations", null, 2, null);
                arrayList = new ArrayList(AbstractC0467l.D0(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((OperationQueueItem) it3.next()).getOperation().getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            IModelStore.DefaultImpls.remove$default(this._operationModelStore, (String) it4.next(), null, 2, null);
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.paused = false;
        this._identityVerificationService.setOnJwtConfigHydratedHandler(new OperationRepo$start$1(this));
        AbstractC0024y.n(getScope(), null, 0, new OperationRepo$start$2(this, null), 3);
    }

    public static final class LoopWaiterMessage {
        private final boolean force;
        private final long previousWaitedTime;

        public LoopWaiterMessage(boolean z, long j2) {
            this.force = z;
            this.previousWaitedTime = j2;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ LoopWaiterMessage(boolean z, long j2, int i2, e eVar) {
            this(z, (i2 & 2) != 0 ? 0L : j2);
        }
    }

    public static final class OperationQueueItem {
        private final int bucket;
        private final Operation operation;
        private int retries;
        private WaiterWithValue<Boolean> waiter;

        public OperationQueueItem(Operation operation, WaiterWithValue<Boolean> waiterWithValue, int i2, int i3) {
            i.e(operation, "operation");
            this.operation = operation;
            this.waiter = waiterWithValue;
            this.bucket = i2;
            this.retries = i3;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final Operation getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final WaiterWithValue<Boolean> getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i2) {
            this.retries = i2;
        }

        public final void setWaiter(WaiterWithValue<Boolean> waiterWithValue) {
            this.waiter = waiterWithValue;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ OperationQueueItem(Operation operation, WaiterWithValue waiterWithValue, int i2, int i3, int i6, e eVar) {
            this(operation, (i6 & 2) != 0 ? null : waiterWithValue, i2, (i6 & 8) != 0 ? 0 : i3);
        }
    }
}
