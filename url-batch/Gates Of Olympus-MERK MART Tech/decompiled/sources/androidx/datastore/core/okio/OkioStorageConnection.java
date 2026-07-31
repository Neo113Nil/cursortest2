package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.ReadScope;
import androidx.datastore.core.StorageConnection;
import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.FileSystem;
import okio.Path;

/* compiled from: OkioStorage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0001\u0010\u00172B\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u0019¢\u0006\u0002\b!H\u0096@¢\u0006\u0002\u0010\"J=\u0010#\u001a\u00020\r2-\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0$¢\u0006\u0002\b!H\u0096@¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNotClosed", "close", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final FileSystem fileSystem;
    private final Function0<Unit> onClose;
    private final Path path;
    private final OkioSerializer<T> serializer;
    private final Mutex transactionMutex;

    public OkioStorageConnection(FileSystem fileSystem, Path path, OkioSerializer<T> serializer, InterProcessCoordinator coordinator, Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x008b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008b, blocks: (B:21:0x007c, B:28:0x008a, B:31:0x0087, B:27:0x0082), top: B:7:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        int i;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof OkioStorageConnection$readScope$1) {
                okioStorageConnection$readScope$1 = (OkioStorageConnection$readScope$1) continuation;
                if ((okioStorageConnection$readScope$1.label & Integer.MIN_VALUE) != 0) {
                    okioStorageConnection$readScope$1.label -= Integer.MIN_VALUE;
                    Object obj = okioStorageConnection$readScope$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okioStorageConnection$readScope$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean tryLock$default = Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
                        try {
                            OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                            try {
                                Boolean boxBoolean = Boxing.boxBoolean(tryLock$default);
                                okioStorageConnection$readScope$1.L$0 = okioReadScope;
                                okioStorageConnection$readScope$1.Z$0 = tryLock$default;
                                okioStorageConnection$readScope$1.label = 1;
                                Object invoke = function3.invoke(okioReadScope, boxBoolean, okioStorageConnection$readScope$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                                function3 = tryLock$default ? 1 : 0;
                                closeable = okioReadScope;
                            } catch (Throwable th2) {
                                th = th2;
                                function3 = tryLock$default ? 1 : 0;
                                closeable = okioReadScope;
                                closeable.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            function3 = tryLock$default ? 1 : 0;
                            if (function3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) okioStorageConnection$readScope$1.Z$0;
                        closeable = (Closeable) okioStorageConnection$readScope$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                closeable.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.addSuppressed(th, th5);
                            }
                            throw th;
                        }
                    }
                    closeable.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (function3 != null) {
                        Mutex.DefaultImpls.unlock$default(this.transactionMutex, null, 1, null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            closeable.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (function3 != null) {
                Mutex.DefaultImpls.unlock$default(this.transactionMutex, null, 1, null);
            }
            throw th;
        }
        okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, continuation);
        Object obj2 = okioStorageConnection$readScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$readScope$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x007a, code lost:
    
        if (r5 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[Catch: all -> 0x00ef, IOException -> 0x00f2, TRY_ENTER, TryCatch #5 {IOException -> 0x00f2, blocks: (B:19:0x00c9, B:21:0x00d1, B:26:0x00e0, B:33:0x00ee, B:36:0x00eb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[Catch: all -> 0x00ef, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x00f2, blocks: (B:19:0x00c9, B:21:0x00d1, B:26:0x00e0, B:33:0x00ee, B:36:0x00eb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r5v6, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r8v4, types: [okio.FileSystem] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1;
        Object coroutine_suspended;
        int i;
        ?? r10;
        ?? r2;
        Path parent;
        OkioWriteScope okioWriteScope;
        Throwable th;
        Closeable closeable;
        Mutex mutex;
        Path path;
        try {
            try {
                try {
                    try {
                        try {
                            if (continuation instanceof OkioStorageConnection$writeScope$1) {
                                okioStorageConnection$writeScope$1 = (OkioStorageConnection$writeScope$1) continuation;
                                if ((okioStorageConnection$writeScope$1.label & Integer.MIN_VALUE) != 0) {
                                    okioStorageConnection$writeScope$1.label -= Integer.MIN_VALUE;
                                    Object obj = okioStorageConnection$writeScope$1.result;
                                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = okioStorageConnection$writeScope$1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj);
                                        checkNotClosed();
                                        parent = this.path.parent();
                                        if (parent == null) {
                                            throw new IllegalStateException("must have a parent path".toString());
                                        }
                                        this.fileSystem.createDirectories(parent, false);
                                        Mutex mutex2 = this.transactionMutex;
                                        okioStorageConnection$writeScope$1.L$0 = function2;
                                        okioStorageConnection$writeScope$1.L$1 = parent;
                                        okioStorageConnection$writeScope$1.L$2 = mutex2;
                                        okioStorageConnection$writeScope$1.label = 1;
                                        Object lock = mutex2.lock(null, okioStorageConnection$writeScope$1);
                                        r10 = mutex2;
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            closeable = (Closeable) okioStorageConnection$writeScope$1.L$2;
                                            path = (Path) okioStorageConnection$writeScope$1.L$1;
                                            mutex = (Mutex) okioStorageConnection$writeScope$1.L$0;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                                Unit unit = Unit.INSTANCE;
                                                try {
                                                    closeable.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th != null) {
                                                    if (this.fileSystem.exists(path)) {
                                                        this.fileSystem.atomicMove(path, this.path);
                                                    }
                                                    Unit unit2 = Unit.INSTANCE;
                                                    mutex.unlock(null);
                                                    return Unit.INSTANCE;
                                                }
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    closeable.close();
                                                } catch (Throwable th4) {
                                                    ExceptionsKt.addSuppressed(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        Mutex mutex3 = (Mutex) okioStorageConnection$writeScope$1.L$2;
                                        parent = (Path) okioStorageConnection$writeScope$1.L$1;
                                        Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function22 = (Function2) okioStorageConnection$writeScope$1.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        r10 = mutex3;
                                        function2 = function22;
                                    }
                                    r2 = parent.resolve(this.path.name() + ".tmp");
                                    this.fileSystem.delete(r2, false);
                                    okioWriteScope = new OkioWriteScope(this.fileSystem, r2, this.serializer);
                                    okioStorageConnection$writeScope$1.L$0 = r10;
                                    okioStorageConnection$writeScope$1.L$1 = r2;
                                    okioStorageConnection$writeScope$1.L$2 = okioWriteScope;
                                    okioStorageConnection$writeScope$1.label = 2;
                                    if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                                        mutex = r10;
                                        path = r2;
                                        closeable = okioWriteScope;
                                        Unit unit3 = Unit.INSTANCE;
                                        closeable.close();
                                        th = null;
                                        if (th != null) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            okioStorageConnection$writeScope$1.L$0 = r10;
                            okioStorageConnection$writeScope$1.L$1 = r2;
                            okioStorageConnection$writeScope$1.L$2 = okioWriteScope;
                            okioStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            th = th5;
                            closeable = okioWriteScope;
                            closeable.close();
                            throw th;
                        }
                        this.fileSystem.delete(r2, false);
                        okioWriteScope = new OkioWriteScope(this.fileSystem, r2, this.serializer);
                    } catch (IOException e) {
                        e = e;
                        if (this.fileSystem.exists(r2)) {
                            try {
                                this.fileSystem.delete(r2);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    r2 = parent.resolve(this.path.name() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r10.unlock(null);
                    throw th;
                }
                if (i != 0) {
                }
            } catch (IOException e2) {
                e = e2;
                r10 = okioStorageConnection$writeScope$1;
                r2 = coroutine_suspended;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = okioStorageConnection$writeScope$1;
            r10.unlock(null);
            throw th;
        }
        okioStorageConnection$writeScope$1 = new OkioStorageConnection$writeScope$1(this, continuation);
        Object obj2 = okioStorageConnection$writeScope$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioStorageConnection$writeScope$1.label;
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }
}
