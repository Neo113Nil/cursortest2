package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import coil3.util.UtilsKt;
import java.io.File;
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

/* compiled from: FileStorage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJX\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0001\u0010\u00152B\u0010\u0016\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0017¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010 J=\u0010!\u001a\u00020\u000b2-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\"¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u000bH\u0002J\f\u0010'\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", UtilsKt.SCHEME_FILE, "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "checkNotClosed", "createParentDirectories", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final Function0<Unit> onClose;
    private final Serializer<T> serializer;
    private final Mutex transactionMutex;

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator coordinator, Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|14|15|16|(2:(1:19)|20)(1:22)))|52|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0089, blocks: (B:22:0x007a, B:28:0x0088, B:31:0x0085, B:27:0x0080), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        int i;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof FileStorageConnection$readScope$1) {
                fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) continuation;
                if ((fileStorageConnection$readScope$1.label & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.label -= Integer.MIN_VALUE;
                    Object obj = fileStorageConnection$readScope$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileStorageConnection$readScope$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        boolean tryLock$default = Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
                        try {
                            FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                            try {
                                Boolean boxBoolean = Boxing.boxBoolean(tryLock$default);
                                fileStorageConnection$readScope$1.L$0 = fileReadScope;
                                fileStorageConnection$readScope$1.Z$0 = tryLock$default;
                                fileStorageConnection$readScope$1.label = 1;
                                Object invoke = function3.invoke(fileReadScope, boxBoolean, fileStorageConnection$readScope$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                                function3 = tryLock$default ? 1 : 0;
                                closeable = fileReadScope;
                            } catch (Throwable th2) {
                                th = th2;
                                function3 = tryLock$default ? 1 : 0;
                                closeable = fileReadScope;
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
                        function3 = (Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object>) fileStorageConnection$readScope$1.Z$0;
                        closeable = (Closeable) fileStorageConnection$readScope$1.L$0;
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
        fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuation);
        Object obj2 = fileStorageConnection$readScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$readScope$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(5:(5:(2:3|(12:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(1:66)|44|45|46|47|49|50|(6:53|14|15|16|17|(0)(0))|52))|49|50|(0)|52)|44|45|46|47)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006d, code lost:
    
        if (r3 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6 A[Catch: all -> 0x0100, IOException -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:19:0x00b6, B:21:0x00bc, B:24:0x00c5, B:25:0x00e9, B:27:0x00ea, B:30:0x00f2, B:37:0x00ff, B:40:0x00fc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2 A[Catch: all -> 0x0100, IOException -> 0x0103, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:19:0x00b6, B:21:0x00bc, B:24:0x00c5, B:25:0x00e9, B:27:0x00ea, B:30:0x00f2, B:37:0x00ff, B:40:0x00fc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        Object coroutine_suspended;
        int i;
        ?? r10;
        ?? r3;
        FileWriteScope fileWriteScope;
        Closeable closeable;
        Mutex mutex;
        File file;
        try {
            try {
                try {
                    try {
                        if (continuation instanceof FileStorageConnection$writeScope$1) {
                            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuation;
                            if ((fileStorageConnection$writeScope$1.label & Integer.MIN_VALUE) != 0) {
                                fileStorageConnection$writeScope$1.label -= Integer.MIN_VALUE;
                                Object obj = fileStorageConnection$writeScope$1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = fileStorageConnection$writeScope$1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj);
                                    checkNotClosed();
                                    createParentDirectories(this.file);
                                    Mutex mutex2 = this.transactionMutex;
                                    fileStorageConnection$writeScope$1.L$0 = function2;
                                    fileStorageConnection$writeScope$1.L$1 = mutex2;
                                    fileStorageConnection$writeScope$1.label = 1;
                                    Object lock = mutex2.lock(null, fileStorageConnection$writeScope$1);
                                    r10 = mutex2;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        closeable = (Closeable) fileStorageConnection$writeScope$1.L$2;
                                        file = (File) fileStorageConnection$writeScope$1.L$1;
                                        mutex = (Mutex) fileStorageConnection$writeScope$1.L$0;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            Unit unit = Unit.INSTANCE;
                                            try {
                                                closeable.close();
                                                th = null;
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                            if (th != null) {
                                                if (file.exists() && !FileMoves_androidKt.atomicMoveTo(file, this.file)) {
                                                    throw new IOException("Unable to rename " + file + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                                Unit unit2 = Unit.INSTANCE;
                                                mutex.unlock(null);
                                                return Unit.INSTANCE;
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            try {
                                                closeable.close();
                                            } catch (Throwable th3) {
                                                ExceptionsKt.addSuppressed(th, th3);
                                            }
                                            throw th;
                                        }
                                    }
                                    Mutex mutex3 = (Mutex) fileStorageConnection$writeScope$1.L$1;
                                    Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function22 = (Function2) fileStorageConnection$writeScope$1.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    r10 = mutex3;
                                    function2 = function22;
                                }
                                r3 = new File(this.file.getAbsolutePath() + ".tmp");
                                fileWriteScope = new FileWriteScope(r3, this.serializer);
                                fileStorageConnection$writeScope$1.L$0 = r10;
                                fileStorageConnection$writeScope$1.L$1 = r3;
                                fileStorageConnection$writeScope$1.L$2 = fileWriteScope;
                                fileStorageConnection$writeScope$1.label = 2;
                                if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                    mutex = r10;
                                    file = r3;
                                    closeable = fileWriteScope;
                                    Unit unit3 = Unit.INSTANCE;
                                    closeable.close();
                                    th = null;
                                    if (th != null) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        fileStorageConnection$writeScope$1.L$0 = r10;
                        fileStorageConnection$writeScope$1.L$1 = r3;
                        fileStorageConnection$writeScope$1.L$2 = fileWriteScope;
                        fileStorageConnection$writeScope$1.label = 2;
                        if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th;
                    }
                    fileWriteScope = new FileWriteScope(r3, this.serializer);
                } catch (IOException e) {
                    e = e;
                    if (r3.exists()) {
                        r3.delete();
                    }
                    throw e;
                }
                r3 = new File(this.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th5) {
                th = th5;
                r10.unlock(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            r10 = fileStorageConnection$writeScope$1;
            r3 = coroutine_suspended;
        }
        fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuation);
        Object obj2 = fileStorageConnection$writeScope$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$writeScope$1.label;
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
