package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DataStoreImpl.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Y*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002XYBp\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012?\b\u0002\u0010\u0005\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00070\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0019\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001aJ\u000e\u0010!\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\"\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u001aJA\u0010#\u001a\u00028\u000021\u0010$\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007H\u0096@¢\u0006\u0002\u0010&J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u0010>\u001a\u00020?H\u0082@¢\u0006\u0002\u0010@J\u001c\u0010A\u001a\u00020\r2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0082@¢\u0006\u0002\u0010CJ\u000e\u0010D\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u001aJ\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u0010>\u001a\u00020?H\u0082@¢\u0006\u0002\u0010@J\u000e\u0010F\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001aJI\u0010G\u001a\u00028\u000021\u0010$\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0006\u0010H\u001a\u00020IH\u0082@¢\u0006\u0002\u0010JJ \u0010K\u001a\u00020\u001e2\u0006\u0010L\u001a\u00028\u00002\u0006\u0010M\u001a\u00020?H\u0080@¢\u0006\u0004\bN\u0010OJ\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000Q2\u0006\u0010R\u001a\u00020?H\u0082@¢\u0006\u0002\u0010@JG\u0010S\u001a\u0002HT\"\u0004\b\u0001\u0010T2\u0006\u0010R\u001a\u00020?2\u001c\u0010U\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002HT0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0VH\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010WR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\f0*R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-0,X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b1\u00102*\u0004\b/\u00100R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00106R\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000;0:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/CurrentDataProviderStore;", "storage", "Landroidx/datastore/core/Storage;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "currentData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectorMutex", "Lkotlinx/coroutines/sync/Mutex;", "collectorCounter", "", "collectorJob", "Lkotlinx/coroutines/Job;", "incrementCollector", "decrementCollector", "updateData", "transform", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "storageConnectionDelegate", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "storageConnection", "getStorageConnection$datastore_core$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "getStorageConnection$datastore_core", "()Landroidx/datastore/core/StorageConnection;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "Lkotlin/Lazy;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/Message$Update;", "readState", "Landroidx/datastore/core/State;", "requireLock", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "readDataFromFileOrDefault", "transformAndWrite", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "updateCache", "writeData$datastore_core", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataOrHandleCorruption", "Landroidx/datastore/core/Data;", "hasWriteFileLock", "doWithWriteFileLock", "R", "block", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InitDataStore", "Companion", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DataStoreImpl<T> implements CurrentDataProviderStore<T> {
    public static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;
    private Job collectorJob;
    private final Mutex collectorMutex;

    /* renamed from: coordinator$delegate, reason: from kotlin metadata */
    private final Lazy coordinator;
    private final CorruptionHandler<T> corruptionHandler;
    private final Flow<T> data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final CoroutineScope scope;
    private final Storage<T> storage;
    private final Lazy<StorageConnection<T>> storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public DataStoreImpl(Storage<T> storage, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, CorruptionHandler<T> corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = MutexKt.Mutex$default(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = LazyKt.lazy(new Function0() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StorageConnection storageConnectionDelegate$lambda$0;
                storageConnectionDelegate$lambda$0 = DataStoreImpl.storageConnectionDelegate$lambda$0(DataStoreImpl.this);
                return storageConnectionDelegate$lambda$0;
            }
        });
        this.coordinator = LazyKt.lazy(new Function0() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterProcessCoordinator coordinator_delegate$lambda$0;
                coordinator_delegate$lambda$0 = DataStoreImpl.coordinator_delegate$lambda$0(DataStoreImpl.this);
                return coordinator_delegate$lambda$0;
            }
        });
        this.writeActor = new SimpleActor<>(scope, new Function1() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit writeActor$lambda$0;
                writeActor$lambda$0 = DataStoreImpl.writeActor$lambda$0(DataStoreImpl.this, (Throwable) obj);
                return writeActor$lambda$0;
            }
        }, new Function2() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit writeActor$lambda$1;
                writeActor$lambda$1 = DataStoreImpl.writeActor$lambda$1((Message.Update) obj, (Throwable) obj2);
                return writeActor$lambda$1;
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, NoOpCorruptionHandler noOpCorruptionHandler, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? new NoOpCorruptionHandler() : noOpCorruptionHandler, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }

    @Override // androidx.datastore.core.DataStore
    public Flow<T> getData() {
        return this.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.CurrentDataProviderStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object currentData(Continuation<? super T> continuation) {
        DataStoreImpl$currentData$1 dataStoreImpl$currentData$1;
        int i;
        State state;
        if (continuation instanceof DataStoreImpl$currentData$1) {
            dataStoreImpl$currentData$1 = (DataStoreImpl$currentData$1) continuation;
            if ((dataStoreImpl$currentData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$currentData$1.label -= Integer.MIN_VALUE;
                Object obj = dataStoreImpl$currentData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$currentData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dataStoreImpl$currentData$1.label = 1;
                    obj = readState(false, dataStoreImpl$currentData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                state = (State) obj;
                if (!(state instanceof Data)) {
                    return ((Data) state).getValue();
                }
                if (state instanceof UnInitialized) {
                    throw new IllegalStateException(BUG_MESSAGE.toString());
                }
                if (state instanceof ReadException) {
                    throw ((ReadException) state).getReadException();
                }
                if (state instanceof Final) {
                    throw ((Final) state).getFinalException();
                }
                if (state instanceof NoValueDataState) {
                    throw new IllegalStateException(BUG_MESSAGE.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        dataStoreImpl$currentData$1 = new DataStoreImpl$currentData$1(this, continuation);
        Object obj2 = dataStoreImpl$currentData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$currentData$1.label;
        if (i != 0) {
        }
        state = (State) obj2;
        if (!(state instanceof Data)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0048, B:13:0x004f, B:14:0x0063), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object incrementCollector(Continuation<? super Unit> continuation) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        int i;
        Mutex mutex;
        int i2;
        Job launch$default;
        try {
            if (continuation instanceof DataStoreImpl$incrementCollector$1) {
                dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) continuation;
                if ((dataStoreImpl$incrementCollector$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$incrementCollector$1.label -= Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$incrementCollector$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$incrementCollector$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.collectorMutex;
                        dataStoreImpl$incrementCollector$1.L$0 = mutex;
                        dataStoreImpl$incrementCollector$1.label = 1;
                        if (mutex.lock(null, dataStoreImpl$incrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) dataStoreImpl$incrementCollector$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                    }
                    i2 = this.collectorCounter + 1;
                    this.collectorCounter = i2;
                    if (i2 == 1) {
                        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new DataStoreImpl$incrementCollector$2$1(this, null), 3, null);
                        this.collectorJob = launch$default;
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            i2 = this.collectorCounter + 1;
            this.collectorCounter = i2;
            if (i2 == 1) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(this, continuation);
        Object obj2 = dataStoreImpl$incrementCollector$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$incrementCollector$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0048, B:13:0x0050, B:15:0x0054, B:16:0x0057, B:17:0x0059), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decrementCollector(Continuation<? super Unit> continuation) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        int i;
        Mutex mutex;
        int i2;
        try {
            if (continuation instanceof DataStoreImpl$decrementCollector$1) {
                dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) continuation;
                if ((dataStoreImpl$decrementCollector$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$decrementCollector$1.label -= Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$decrementCollector$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$decrementCollector$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.collectorMutex;
                        dataStoreImpl$decrementCollector$1.L$0 = mutex2;
                        dataStoreImpl$decrementCollector$1.label = 1;
                        if (mutex2.lock(null, dataStoreImpl$decrementCollector$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) dataStoreImpl$decrementCollector$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    i2 = this.collectorCounter - 1;
                    this.collectorCounter = i2;
                    if (i2 == 0) {
                        Job job = this.collectorJob;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        this.collectorJob = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            i2 = this.collectorCounter - 1;
            this.collectorCounter = i2;
            if (i2 == 0) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(this, continuation);
        Object obj2 = dataStoreImpl$decrementCollector$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$decrementCollector$1.label;
        if (i != 0) {
        }
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return BuildersKt.withContext(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, function2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorageConnection storageConnectionDelegate$lambda$0(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.storage.createConnection();
    }

    public final StorageConnection<T> getStorageConnection$datastore_core() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterProcessCoordinator coordinator_delegate$lambda$0(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.getStorageConnection$datastore_core().getCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeActor$lambda$0(DataStoreImpl dataStoreImpl, Throwable th) {
        if (th != null) {
            dataStoreImpl.inMemoryCache.tryUpdate(new Final(th));
        }
        if (dataStoreImpl.storageConnectionDelegate.isInitialized()) {
            dataStoreImpl.getStorageConnection$datastore_core().close();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeActor$lambda$1(Message.Update msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        CompletableDeferred<T> ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.completeExceptionally(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z, Continuation<? super State<T>> continuation) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new DataStoreImpl$readState$2(this, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) {
        DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        int i;
        CompletableDeferred<T> completableDeferred;
        Object m9577constructorimpl;
        if (continuation instanceof DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (DataStoreImpl$handleUpdate$1) continuation;
            if ((dataStoreImpl$handleUpdate$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$handleUpdate$1.label -= Integer.MIN_VALUE;
                Object obj = dataStoreImpl$handleUpdate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$handleUpdate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<T> ack = update.getAck();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        DataStoreImpl<T> dataStoreImpl = this;
                        CoroutineContext plus = update.getCallerContext().plus(dataStoreImpl$handleUpdate$1.getContext());
                        DataStoreImpl$handleUpdate$2$1 dataStoreImpl$handleUpdate$2$1 = new DataStoreImpl$handleUpdate$2$1(this, update, null);
                        dataStoreImpl$handleUpdate$1.L$0 = ack;
                        dataStoreImpl$handleUpdate$1.label = 1;
                        Object withContext = BuildersKt.withContext(plus, dataStoreImpl$handleUpdate$2$1, dataStoreImpl$handleUpdate$1);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = withContext;
                        completableDeferred = ack;
                    } catch (Throwable th) {
                        th = th;
                        completableDeferred = ack;
                        Result.Companion companion2 = Result.INSTANCE;
                        m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
                        CompletableDeferredKt.completeWith(completableDeferred, m9577constructorimpl);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) dataStoreImpl$handleUpdate$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
                        CompletableDeferredKt.completeWith(completableDeferred, m9577constructorimpl);
                        return Unit.INSTANCE;
                    }
                }
                m9577constructorimpl = Result.m9577constructorimpl(obj);
                CompletableDeferredKt.completeWith(completableDeferred, m9577constructorimpl);
                return Unit.INSTANCE;
            }
        }
        dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(this, continuation);
        Object obj2 = dataStoreImpl$handleUpdate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$handleUpdate$1.label;
        if (i != 0) {
        }
        m9577constructorimpl = Result.m9577constructorimpl(obj2);
        CompletableDeferredKt.completeWith(completableDeferred, m9577constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r2.runIfNeeded(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) {
        DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        int intValue;
        int i2;
        Throwable th;
        try {
            if (continuation instanceof DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuation;
                if ((dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label -= Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        InterProcessCoordinator coordinator = getCoordinator();
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        obj = coordinator.getVersion(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                this.inMemoryCache.tryUpdate(new ReadException(th, i2));
                                throw th;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    DataStoreImpl<T>.InitDataStore initDataStore = this.readAndInit;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
                }
            }
            DataStoreImpl<T>.InitDataStore initDataStore2 = this.readAndInit;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
        } catch (Throwable th3) {
            i2 = intValue;
            th = th3;
            this.inMemoryCache.tryUpdate(new ReadException(th, i2));
            throw th;
        }
        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        Object obj2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataAndUpdateCache(boolean z, Continuation<? super State<T>> continuation) {
        DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        int i;
        State<T> currentState;
        boolean z2;
        Pair pair;
        if (continuation instanceof DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (DataStoreImpl$readDataAndUpdateCache$1) continuation;
            if ((dataStoreImpl$readDataAndUpdateCache$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.label -= Integer.MIN_VALUE;
                Object obj = dataStoreImpl$readDataAndUpdateCache$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$readDataAndUpdateCache$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    currentState = this.inMemoryCache.getCurrentState();
                    if (currentState instanceof UnInitialized) {
                        throw new IllegalStateException(BUG_MESSAGE.toString());
                    }
                    InterProcessCoordinator coordinator = getCoordinator();
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = currentState;
                    dataStoreImpl$readDataAndUpdateCache$1.Z$0 = z;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 1;
                    obj = coordinator.getVersion(dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            pair = (Pair) obj;
                            State<T> state = (State) pair.component1();
                            if (((Boolean) pair.component2()).booleanValue()) {
                            }
                            return state;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        pair = (Pair) obj;
                        State<T> state2 = (State) pair.component1();
                        if (((Boolean) pair.component2()).booleanValue()) {
                            this.inMemoryCache.tryUpdate(state2);
                        }
                        return state2;
                    }
                    z = dataStoreImpl$readDataAndUpdateCache$1.Z$0;
                    currentState = (State) dataStoreImpl$readDataAndUpdateCache$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                int intValue = ((Number) obj).intValue();
                z2 = currentState instanceof Data;
                int version = !z2 ? ((Data) currentState).getVersion() : -1;
                if (!z2 && intValue == version) {
                    return currentState;
                }
                if (!z) {
                    InterProcessCoordinator coordinator2 = getCoordinator();
                    DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new DataStoreImpl$readDataAndUpdateCache$3(this, null);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 2;
                    obj = coordinator2.lock(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    InterProcessCoordinator coordinator3 = getCoordinator();
                    DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this, version, null);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 3;
                    obj = coordinator3.tryLock(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
                }
                return coroutine_suspended;
            }
        }
        dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(this, continuation);
        Object obj2 = dataStoreImpl$readDataAndUpdateCache$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$readDataAndUpdateCache$1.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = currentState instanceof Data;
        if (!z2) {
        }
        if (!z2) {
        }
        if (!z) {
        }
        return coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(Continuation<? super T> continuation) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        return getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(this, coroutineContext, function2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(T t, boolean z, Continuation<? super Integer> continuation) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        int i;
        Ref.IntRef intRef;
        if (continuation instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuation;
            if ((dataStoreImpl$writeData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label -= Integer.MIN_VALUE;
                Object obj = dataStoreImpl$writeData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreImpl$writeData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    StorageConnection<T> storageConnection$datastore_core = getStorageConnection$datastore_core();
                    DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(intRef2, this, t, z, null);
                    dataStoreImpl$writeData$1.L$0 = intRef2;
                    dataStoreImpl$writeData$1.label = 1;
                    if (storageConnection$datastore_core.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) dataStoreImpl$writeData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(intRef.element);
            }
        }
        dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
        Object obj2 = dataStoreImpl$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$writeData$1.label;
        if (i != 0) {
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|71|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007a, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[Catch: CorruptionException -> 0x007a, TryCatch #0 {CorruptionException -> 0x007a, blocks: (B:35:0x005a, B:36:0x00eb, B:39:0x0061, B:40:0x00ce, B:55:0x0076, B:57:0x0091, B:58:0x0097, B:64:0x0082, B:67:0x00be), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(boolean z, Continuation<? super Data<T>> continuation) {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        Ref.ObjectRef objectRef;
        CorruptionException corruptionException;
        Ref.ObjectRef objectRef2;
        CorruptionException corruptionException2;
        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef3;
        Object version;
        boolean z2;
        int i;
        Object obj;
        if (continuation instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) continuation;
            if ((dataStoreImpl$readDataOrHandleCorruption$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.label -= Integer.MIN_VALUE;
                Object obj2 = (T) dataStoreImpl$readDataOrHandleCorruption$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dataStoreImpl$readDataOrHandleCorruption$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        if (z) {
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 1;
                            obj2 = (T) readDataFromFileOrDefault(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                            }
                            int hashCode = obj2 == null ? obj2.hashCode() : 0;
                            InterProcessCoordinator coordinator = getCoordinator();
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = obj2;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                            version = coordinator.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (version != coroutine_suspended) {
                                int i2 = hashCode;
                                z2 = z;
                                i = i2;
                                obj = obj2;
                                obj2 = (T) version;
                                return new Data(obj, i, ((Number) obj2).intValue());
                            }
                        } else {
                            InterProcessCoordinator coordinator2 = getCoordinator();
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 3;
                            obj2 = (T) coordinator2.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            InterProcessCoordinator coordinator3 = getCoordinator();
                            DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this, intValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                            obj2 = (T) coordinator3.tryLock(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                            }
                            return (Data) obj2;
                        }
                        return coroutine_suspended;
                    case 1:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        ResultKt.throwOnFailure(obj2);
                        if (obj2 == null) {
                        }
                        InterProcessCoordinator coordinator4 = getCoordinator();
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = obj2;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                        version = coordinator4.getVersion(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (version != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        i = dataStoreImpl$readDataOrHandleCorruption$1.I$0;
                        z2 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        obj = dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            return new Data(obj, i, ((Number) obj2).intValue());
                        } catch (CorruptionException e) {
                            e = e;
                            z = z2;
                            objectRef = new Ref.ObjectRef();
                            CorruptionHandler<T> corruptionHandler = this.corruptionHandler;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = e;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$2 = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                            Object handleCorruption = corruptionHandler.handleCorruption(e, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (handleCorruption != coroutine_suspended) {
                                corruptionException = e;
                                obj2 = (T) handleCorruption;
                                objectRef2 = objectRef;
                                objectRef2.element = (T) obj2;
                                Ref.IntRef intRef2 = new Ref.IntRef();
                                try {
                                    dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, this, intRef2, null);
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                                    if (doWithWriteFileLock(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    ExceptionsKt.addSuppressed(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return coroutine_suspended;
                        }
                    case 3:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        ResultKt.throwOnFailure(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        InterProcessCoordinator coordinator32 = getCoordinator();
                        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$22 = new DataStoreImpl$readDataOrHandleCorruption$2(this, intValue2, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                        obj2 = (T) coordinator32.tryLock(dataStoreImpl$readDataOrHandleCorruption$22, dataStoreImpl$readDataOrHandleCorruption$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        return (Data) obj2;
                    case 4:
                        boolean z3 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        ResultKt.throwOnFailure(obj2);
                        return (Data) obj2;
                    case 5:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        objectRef2 = objectRef4;
                        objectRef = objectRef5;
                        objectRef2.element = (T) obj2;
                        Ref.IntRef intRef22 = new Ref.IntRef();
                        dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, this, intRef22, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$2 = intRef22;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                        if (doWithWriteFileLock(z, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                            intRef = intRef22;
                            objectRef3 = objectRef;
                            T t = objectRef3.element;
                            T t2 = objectRef3.element;
                            return new Data(t, t2 != null ? t2.hashCode() : 0, intRef.element);
                        }
                        return coroutine_suspended;
                    case 6:
                        intRef = (Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        objectRef3 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            T t3 = objectRef3.element;
                            T t22 = objectRef3.element;
                            return new Data(t3, t22 != null ? t22.hashCode() : 0, intRef.element);
                        } catch (Throwable th2) {
                            th = th2;
                            ExceptionsKt.addSuppressed(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(this, continuation);
        Object obj22 = (T) dataStoreImpl$readDataOrHandleCorruption$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dataStoreImpl$readDataOrHandleCorruption$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        if (z) {
            return function1.invoke(continuation);
        }
        return getCoordinator().lock(new DataStoreImpl$doWithWriteFileLock$2(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataStoreImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001BF\u0012=\u0010\u0002\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00040\u0003¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u0010RG\u0010\u000e\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "initTasks", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class InitDataStore extends RunOnce {
        private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Object doRun(Continuation<? super Unit> continuation) {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            int i;
            Data data;
            if (continuation instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuation;
                if ((dataStoreImpl$InitDataStore$doRun$1.label & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label -= Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$InitDataStore$doRun$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$InitDataStore$doRun$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = this.initTasks;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                                DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                                dataStoreImpl$InitDataStore$doRun$1.label = 2;
                                obj = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                            }
                        }
                        DataStoreImpl<T> dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        obj = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        data = (Data) obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        data = (Data) obj;
                    }
                    ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(data);
                    return Unit.INSTANCE;
                }
            }
            dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            Object obj2 = dataStoreImpl$InitDataStore$doRun$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i != 0) {
            }
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(data);
            return Unit.INSTANCE;
        }
    }
}
