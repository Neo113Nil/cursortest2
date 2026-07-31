package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 M*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003MNOBr\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00120\b\u0002\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t0\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0016\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010%J\u0013\u0010'\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u0013\u0010(\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010%J\u0013\u0010)\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010%J?\u0010,\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010+\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R \u00105\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0A8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010FRC\u0010G\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bG\u0010HR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", "T", "Landroidx/datastore/core/DataStore;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/Serializer;", "serializer", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "read", "handleRead", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateFailure", "readAndInit", "readDataOrHandleCorruption", "readData", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "(Ljava/io/File;)V", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "", "SCRATCH_SUFFIX", "Ljava/lang/String;", "file$delegate", "Lkotlin/Lazy;", "getFile", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDownstreamFlow$annotations", "()V", "initTasks", "Ljava/util/List;", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "actor", "Landroidx/datastore/core/SimpleActor;", "Companion", "Message", "UncloseableOutputStream", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor actor;
    private final CorruptionHandler corruptionHandler;
    private final Flow data;
    private final MutableStateFlow downstreamFlow;

    /* renamed from: file$delegate, reason: from kotlin metadata */
    private final Lazy file;
    private List initTasks;
    private final Function0 produceFile;
    private final CoroutineScope scope;
    private final Serializer serializer;

    public SingleProcessDataStore(Function0 produceFile, Serializer serializer, List initTasksList, CorruptionHandler corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt.lazy(new Function0(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final File mo4828invoke() {
                Function0 function0;
                function0 = ((SingleProcessDataStore) this.this$0).produceFile;
                File file = (File) function0.mo4828invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (companion.getActiveFiles$datastore_core().contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor(scope, new Function1(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Throwable th) {
                File file;
                MutableStateFlow mutableStateFlow;
                if (th != null) {
                    mutableStateFlow = ((SingleProcessDataStore) this.this$0).downstreamFlow;
                    mutableStateFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    Set activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    file = singleProcessDataStore.getFile();
                    activeFiles$datastore_core.remove(file.getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((SingleProcessDataStore.Message) obj, (Throwable) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SingleProcessDataStore.Message<T> msg, @Nullable Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    @Override // androidx.datastore.core.DataStore
    public Flow getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2 function2, Continuation continuation) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, CompletableDeferred$default, (State) this.downstreamFlow.getValue(), continuation.getContext()));
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", "T", "", "<init>", "()V", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static abstract class Message<T> {
        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Message() {
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Read<T> extends Message<T> {
            private final State lastState;

            public State getLastState() {
                return this.lastState;
            }

            public Read(State state) {
                super(null);
                this.lastState = state;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002BT\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR6\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "ack", "Landroidx/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/CompletableDeferred;", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Update<T> extends Message<T> {
            private final CompletableDeferred ack;
            private final CoroutineContext callerContext;
            private final State lastState;
            private final Function2 transform;

            public final Function2 getTransform() {
                return this.transform;
            }

            public final CompletableDeferred getAck() {
                return this.ack;
            }

            public State getLastState() {
                return this.lastState;
            }

            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(Function2 transform, CompletableDeferred ack, State state, CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read read, Continuation continuation) {
        State state = (State) this.downstreamFlow.getValue();
        if (!(state instanceof Data)) {
            if (state instanceof ReadException) {
                if (state == read.getLastState()) {
                    Object readAndInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return readAndInitOrPropagateFailure == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(state, UnInitialized.INSTANCE)) {
                    Object readAndInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return readAndInitOrPropagateFailure2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (state instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v27, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update update, Continuation continuation) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        Object coroutine_suspended;
        int i;
        Object m8023constructorimpl;
        ?? r9;
        CompletableDeferred ack;
        State state;
        SingleProcessDataStore<T> singleProcessDataStore;
        Object transformAndWrite;
        Message.Update update2;
        Message.Update update3;
        if (continuation instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuation;
            int i2 = singleProcessDataStore$handleUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$handleUpdate$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$handleUpdate$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ack = update.getAck();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        state = (State) this.downstreamFlow.getValue();
                    } catch (Throwable th) {
                        th = th;
                        update = ack;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        r9 = update;
                        CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                        return Unit.INSTANCE;
                    }
                    if (state instanceof Data) {
                        Function2 transform = update.getTransform();
                        CoroutineContext callerContext = update.getCallerContext();
                        singleProcessDataStore$handleUpdate$1.L$0 = ack;
                        singleProcessDataStore$handleUpdate$1.label = 1;
                        transformAndWrite = transformAndWrite(transform, callerContext, singleProcessDataStore$handleUpdate$1);
                        if (transformAndWrite == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Message.Update update4 = ack;
                        obj = transformAndWrite;
                        update = update4;
                        m8023constructorimpl = Result.m8023constructorimpl(obj);
                        r9 = update;
                        CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                        return Unit.INSTANCE;
                    }
                    if (!(state instanceof ReadException)) {
                        z = state instanceof UnInitialized;
                    }
                    if (z) {
                        if (state == update.getLastState()) {
                            singleProcessDataStore$handleUpdate$1.L$0 = update;
                            singleProcessDataStore$handleUpdate$1.L$1 = this;
                            singleProcessDataStore$handleUpdate$1.L$2 = ack;
                            singleProcessDataStore$handleUpdate$1.label = 2;
                            if (readAndInitOrPropagateAndThrowFailure(singleProcessDataStore$handleUpdate$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            singleProcessDataStore = this;
                            update2 = update;
                        } else {
                            throw ((ReadException) state).getReadException();
                        }
                    } else {
                        if (state instanceof Final) {
                            throw ((Final) state).getFinalException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i == 1) {
                        update3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0;
                    } else if (i == 2) {
                        CompletableDeferred completableDeferred = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$2;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.L$1;
                        Message.Update update5 = (Message.Update) singleProcessDataStore$handleUpdate$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ack = completableDeferred;
                        update2 = update5;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        update3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0;
                    }
                    ResultKt.throwOnFailure(obj);
                    update = update3;
                    m8023constructorimpl = Result.m8023constructorimpl(obj);
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                    return Unit.INSTANCE;
                }
                Function2 transform2 = update2.getTransform();
                CoroutineContext callerContext2 = update2.getCallerContext();
                singleProcessDataStore$handleUpdate$1.L$0 = ack;
                singleProcessDataStore$handleUpdate$1.L$1 = null;
                singleProcessDataStore$handleUpdate$1.L$2 = null;
                singleProcessDataStore$handleUpdate$1.label = 3;
                transformAndWrite = singleProcessDataStore.transformAndWrite(transform2, callerContext2, singleProcessDataStore$handleUpdate$1);
                if (transformAndWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Message.Update update42 = ack;
                obj = transformAndWrite;
                update = update42;
                m8023constructorimpl = Result.m8023constructorimpl(obj);
                r9 = update;
                CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
        Object obj2 = singleProcessDataStore$handleUpdate$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$handleUpdate$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        Function2 transform22 = update2.getTransform();
        CoroutineContext callerContext22 = update2.getCallerContext();
        singleProcessDataStore$handleUpdate$1.L$0 = ack;
        singleProcessDataStore$handleUpdate$1.L$1 = null;
        singleProcessDataStore$handleUpdate$1.L$2 = null;
        singleProcessDataStore$handleUpdate$1.label = 3;
        transformAndWrite = singleProcessDataStore.transformAndWrite(transform22, callerContext22, singleProcessDataStore$handleUpdate$1);
        if (transformAndWrite == coroutine_suspended) {
        }
        Message.Update update422 = ack;
        obj2 = transformAndWrite;
        update = update422;
        m8023constructorimpl = Result.m8023constructorimpl(obj2);
        r9 = update;
        CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else if (i == 1) {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else if (i == 1) {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation continuation) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        int i;
        Mutex Mutex$default;
        Ref$ObjectRef ref$ObjectRef;
        SingleProcessDataStore<T> singleProcessDataStore;
        Ref$ObjectRef ref$ObjectRef2;
        List list;
        SingleProcessDataStore<T> singleProcessDataStore2;
        Ref$ObjectRef ref$ObjectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$12;
        SingleProcessDataStore<T> singleProcessDataStore3;
        Ref$ObjectRef ref$ObjectRef4;
        Mutex mutex2;
        if (continuation instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuation;
            int i2 = singleProcessDataStore$readAndInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label = i2 - Integer.MIN_VALUE;
                T t = (T) singleProcessDataStore$readAndInit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t);
                    if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Mutex$default = MutexKt.Mutex$default(false, 1, null);
                    ref$ObjectRef = new Ref$ObjectRef();
                    singleProcessDataStore$readAndInit$1.L$0 = this;
                    singleProcessDataStore$readAndInit$1.L$1 = Mutex$default;
                    singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.L$3 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.label = 1;
                    t = (T) readDataOrHandleCorruption(singleProcessDataStore$readAndInit$1);
                    if (t == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleProcessDataStore = this;
                    ref$ObjectRef2 = ref$ObjectRef;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                mutex2 = (Mutex) singleProcessDataStore$readAndInit$1.L$3;
                                ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
                                ref$ObjectRef4 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
                                singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                                ResultKt.throwOnFailure(t);
                                try {
                                    ref$BooleanRef2.element = true;
                                    Unit unit = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    MutableStateFlow mutableStateFlow = singleProcessDataStore3.downstreamFlow;
                                    T t2 = ref$ObjectRef4.element;
                                    mutableStateFlow.setValue(new Data(t2, t2 != null ? t2.hashCode() : 0));
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                        singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                        ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                        ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                        mutex = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                        ResultKt.throwOnFailure(t);
                        while (it.hasNext()) {
                            Function2 function2 = (Function2) it.next();
                            singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore2;
                            singleProcessDataStore$readAndInit$1.L$1 = mutex;
                            singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef3;
                            singleProcessDataStore$readAndInit$1.L$3 = ref$BooleanRef;
                            singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                            singleProcessDataStore$readAndInit$1.L$5 = it;
                            singleProcessDataStore$readAndInit$1.label = 2;
                            if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                        ref$BooleanRef2 = ref$BooleanRef;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        Mutex$default = mutex;
                        singleProcessDataStore3 = singleProcessDataStore2;
                        singleProcessDataStore3.initTasks = null;
                        singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                        singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                        singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                        singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                        singleProcessDataStore$readAndInit$12.L$4 = null;
                        singleProcessDataStore$readAndInit$12.L$5 = null;
                        singleProcessDataStore$readAndInit$12.label = 3;
                        if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef4 = ref$ObjectRef2;
                        mutex2 = Mutex$default;
                        ref$BooleanRef2.element = true;
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        MutableStateFlow mutableStateFlow2 = singleProcessDataStore3.downstreamFlow;
                        T t22 = ref$ObjectRef4.element;
                        mutableStateFlow2.setValue(new Data(t22, t22 != null ? t22.hashCode() : 0));
                        return Unit.INSTANCE;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
                    ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                    Mutex$default = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                    ResultKt.throwOnFailure(t);
                }
                ref$ObjectRef.element = t;
                Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$12 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, ref$BooleanRef3, ref$ObjectRef2, singleProcessDataStore);
                list = singleProcessDataStore.initTasks;
                if (list != null) {
                    ref$BooleanRef2 = ref$BooleanRef3;
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    singleProcessDataStore3 = singleProcessDataStore;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                    singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                    }
                } else {
                    singleProcessDataStore2 = singleProcessDataStore;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$12;
                    it = list.iterator();
                    mutex = Mutex$default;
                    ref$BooleanRef = ref$BooleanRef3;
                    while (it.hasNext()) {
                    }
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    ref$BooleanRef2 = ref$BooleanRef;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    Mutex$default = mutex;
                    singleProcessDataStore3 = singleProcessDataStore2;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                    singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                    }
                }
            }
        }
        singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
        T t3 = (T) singleProcessDataStore$readAndInit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$1.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = t3;
        Ref$BooleanRef ref$BooleanRef32 = new Ref$BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$122 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, ref$BooleanRef32, ref$ObjectRef2, singleProcessDataStore);
        list = singleProcessDataStore.initTasks;
        if (list != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation continuation) {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        Object handleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore<T> singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuation instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuation;
            int i2 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
                        obj = readData(singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CorruptionException e) {
                        e = e;
                        singleProcessDataStore = this;
                        CorruptionHandler corruptionHandler = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                                corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    return obj2;
                                } catch (IOException e2) {
                                    e = e2;
                                    ExceptionsKt.addSuppressed(corruptionException2, e);
                                    throw corruptionException2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        try {
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                            singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                            return singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended ? coroutine_suspended : obj;
                        } catch (IOException e3) {
                            e = e3;
                            corruptionException2 = corruptionException;
                            ExceptionsKt.addSuppressed(corruptionException2, e);
                            throw corruptionException2;
                        }
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CorruptionException e4) {
                        e = e4;
                        CorruptionHandler corruptionHandler2 = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler2.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SingleProcessDataStore<T> singleProcessDataStore3 = singleProcessDataStore;
                        corruptionException = e;
                        obj = handleCorruption;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        if (singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended) {
                        }
                    }
                }
                return obj;
            }
        }
        singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
        Object obj3 = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        if (i != 0) {
        }
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation continuation) {
        ?? r0;
        int i;
        ?? fileInputStream;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof SingleProcessDataStore$readData$1) {
                SingleProcessDataStore$readData$1 singleProcessDataStore$readData$1 = (SingleProcessDataStore$readData$1) continuation;
                int i2 = singleProcessDataStore$readData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readData$1.label = i2 - Integer.MIN_VALUE;
                    r0 = singleProcessDataStore$readData$1;
                    Object obj = r0.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            fileInputStream = new FileInputStream(getFile());
                            try {
                                ?? r6 = this.serializer;
                                r0.L$0 = this;
                                r0.L$1 = fileInputStream;
                                r0.L$2 = null;
                                r0.label = 1;
                                obj = r6.readFrom(fileInputStream, r0);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                th = null;
                                closeable = fileInputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            r0 = this;
                            if (r0.getFile().exists()) {
                                throw e;
                            }
                            return r0.serializer.getDefaultValue();
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) r0.L$2;
                        fileInputStream = (Closeable) r0.L$1;
                        r0 = (SingleProcessDataStore) r0.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            closeable = fileInputStream;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } finally {
                                CloseableKt.closeFinally(fileInputStream, th);
                            }
                        }
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        r0 = new SingleProcessDataStore$readData$1(this, continuation);
        Object obj2 = r0.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        Object obj;
        int i;
        Data data;
        Object obj2;
        SingleProcessDataStore<T> singleProcessDataStore;
        SingleProcessDataStore<T> singleProcessDataStore2;
        if (continuation instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuation;
            int i2 = singleProcessDataStore$transformAndWrite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label = i2 - Integer.MIN_VALUE;
                obj = singleProcessDataStore$transformAndWrite$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$transformAndWrite$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Data data2 = (Data) this.downstreamFlow.getValue();
                    data2.checkHashCode();
                    Object value = data2.getValue();
                    SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null);
                    singleProcessDataStore$transformAndWrite$1.L$0 = this;
                    singleProcessDataStore$transformAndWrite$1.L$1 = data2;
                    singleProcessDataStore$transformAndWrite$1.L$2 = value;
                    singleProcessDataStore$transformAndWrite$1.label = 1;
                    Object withContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    data = data2;
                    obj = withContext;
                    obj2 = value;
                    singleProcessDataStore = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = singleProcessDataStore$transformAndWrite$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
                        return obj2;
                    }
                    obj2 = singleProcessDataStore$transformAndWrite$1.L$2;
                    data = (Data) singleProcessDataStore$transformAndWrite$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                data.checkHashCode();
                if (!Intrinsics.areEqual(obj2, obj)) {
                    singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
                    singleProcessDataStore$transformAndWrite$1.L$1 = obj;
                    singleProcessDataStore$transformAndWrite$1.L$2 = null;
                    singleProcessDataStore$transformAndWrite$1.label = 2;
                    if (singleProcessDataStore.writeData$datastore_core(obj, singleProcessDataStore$transformAndWrite$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj;
                    singleProcessDataStore2 = singleProcessDataStore;
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
                }
                return obj2;
            }
        }
        singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
        obj = singleProcessDataStore$transformAndWrite$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$transformAndWrite$1.label;
        if (i != 0) {
        }
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj2, obj)) {
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(Object obj, Continuation continuation) {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        int i;
        ?? r3;
        File file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        Throwable th;
        try {
            if (continuation instanceof SingleProcessDataStore$writeData$1) {
                singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
                int i2 = singleProcessDataStore$writeData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$writeData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = singleProcessDataStore$writeData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore$writeData$1.label;
                    r3 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        createParentDirectories(getFile());
                        file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                Serializer serializer = this.serializer;
                                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                                singleProcessDataStore$writeData$1.L$0 = this;
                                singleProcessDataStore$writeData$1.L$1 = file;
                                singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                                singleProcessDataStore$writeData$1.L$3 = null;
                                singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                                singleProcessDataStore$writeData$1.label = 1;
                                if (serializer.writeTo(obj, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                singleProcessDataStore = this;
                                r3 = file;
                                fileOutputStream2 = fileOutputStream;
                                th = null;
                                fileOutputStream = fileOutputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = file;
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                    } else if (i == 1) {
                        fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                        th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                        fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                        r3 = (File) singleProcessDataStore$writeData$1.L$1;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            fileOutputStream = fileOutputStream;
                            r3 = r3;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2.getFD().sync();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, th);
                    if (r3.renameTo(singleProcessDataStore.getFile())) {
                        throw new IOException("Unable to rename " + r3 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            fileOutputStream2.getFD().sync();
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, th);
            if (r3.renameTo(singleProcessDataStore.getFile())) {
            }
        } catch (IOException e2) {
            e = e2;
            file = r3;
            if (file.exists()) {
            }
            throw e;
        }
        singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        Object obj22 = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$writeData$1.label;
        r3 = 1;
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "", "write", "(I)V", "", "([B)V", "bytes", "off", "len", "([BII)V", "close", "()V", "flush", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
