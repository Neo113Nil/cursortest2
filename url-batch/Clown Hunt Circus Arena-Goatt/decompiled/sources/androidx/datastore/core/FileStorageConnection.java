package androidx.datastore.core;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016JX\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0001\u0010\u00162B\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0018¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010!J=\u0010\"\u001a\u00020\u000b2-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0#¢\u0006\u0002\b H\u0096@¢\u0006\u0002\u0010%J\f\u0010&\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "coordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "onClose", "Lkotlin/Function0;", "", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "transactionMutex", "Lkotlinx/coroutines/sync/Mutex;", "checkNotClosed", "close", "readScope", "R", "block", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeScope", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(5:43|44|45|46|(1:48)(1:49))|14|15|16|(2:(1:19)|20)(2:22|23)))|54|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object readScope(Function3<? super ReadScope<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        Object obj;
        int i;
        Throwable th;
        Closeable closeable;
        FileStorageConnection<T> fileStorageConnection;
        ?? r8;
        Object obj2;
        try {
            if (continuation instanceof FileStorageConnection$readScope$1) {
                fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) continuation;
                if ((fileStorageConnection$readScope$1.label & Integer.MIN_VALUE) != 0) {
                    fileStorageConnection$readScope$1.label -= Integer.MIN_VALUE;
                    obj = fileStorageConnection$readScope$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileStorageConnection$readScope$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkNotClosed();
                        ?? tryLock$default = Mutex.DefaultImpls.tryLock$default(this.transactionMutex, null, 1, null);
                        FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                        try {
                            Boolean boxBoolean = Boxing.boxBoolean(tryLock$default);
                            fileStorageConnection$readScope$1.L$0 = this;
                            fileStorageConnection$readScope$1.L$1 = fileReadScope;
                            fileStorageConnection$readScope$1.Z$0 = tryLock$default;
                            fileStorageConnection$readScope$1.label = 1;
                            Object invoke = function3.invoke(fileReadScope, boxBoolean, fileStorageConnection$readScope$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            fileStorageConnection = this;
                            r8 = tryLock$default == true ? 1 : 0;
                            obj2 = invoke;
                            closeable = fileReadScope;
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = fileReadScope;
                            obj = tryLock$default;
                            closeable.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r8 = fileStorageConnection$readScope$1.Z$0;
                        closeable = (Closeable) fileStorageConnection$readScope$1.L$1;
                        fileStorageConnection = (FileStorageConnection) fileStorageConnection$readScope$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            obj2 = obj;
                        } catch (Throwable th3) {
                            obj = r8;
                            this = fileStorageConnection;
                            th = th3;
                            try {
                                closeable.close();
                                throw th;
                            } catch (Throwable th4) {
                                ExceptionsKt.addSuppressed(th, th4);
                                throw th;
                            }
                        }
                    }
                    closeable.close();
                    th = null;
                    if (th != null) {
                        if (r8 != false) {
                            Mutex.DefaultImpls.unlock$default(fileStorageConnection.transactionMutex, null, 1, null);
                        }
                        return obj2;
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        obj = r8;
                        this = fileStorageConnection;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            closeable.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (obj != null) {
                Mutex.DefaultImpls.unlock$default(this.transactionMutex, null, 1, null);
            }
            throw th;
        }
        fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuation);
        obj = fileStorageConnection$readScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileStorageConnection$readScope$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0077, code lost:
    
        if (r10.lock(null, r1) == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x010e, IOException -> 0x0111, TRY_ENTER, TryCatch #5 {IOException -> 0x0111, blocks: (B:19:0x00c3, B:21:0x00c9, B:24:0x00d2, B:25:0x00f6, B:30:0x00ff, B:37:0x010d, B:40:0x010a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[Catch: all -> 0x010e, IOException -> 0x0111, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0111, blocks: (B:19:0x00c3, B:21:0x00c9, B:24:0x00d2, B:25:0x00f6, B:30:0x00ff, B:37:0x010d, B:40:0x010a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeScope(Function2<? super WriteScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        ?? r10;
        Object coroutine_suspended;
        int i;
        ?? r3;
        Mutex mutex;
        FileWriteScope fileWriteScope;
        Throwable th;
        Closeable closeable;
        FileStorageConnection<T> fileStorageConnection;
        Mutex mutex2;
        File file;
        try {
            try {
                try {
                    try {
                        try {
                            if (continuation instanceof FileStorageConnection$writeScope$1) {
                                fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuation;
                                if ((fileStorageConnection$writeScope$1.label & Integer.MIN_VALUE) != 0) {
                                    fileStorageConnection$writeScope$1.label -= Integer.MIN_VALUE;
                                    r10 = fileStorageConnection$writeScope$1.result;
                                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = fileStorageConnection$writeScope$1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(r10);
                                        checkNotClosed();
                                        createParentDirectories(this.file);
                                        mutex = this.transactionMutex;
                                        fileStorageConnection$writeScope$1.L$0 = this;
                                        fileStorageConnection$writeScope$1.L$1 = function2;
                                        fileStorageConnection$writeScope$1.L$2 = mutex;
                                        fileStorageConnection$writeScope$1.label = 1;
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            closeable = (Closeable) fileStorageConnection$writeScope$1.L$3;
                                            file = (File) fileStorageConnection$writeScope$1.L$2;
                                            mutex2 = (Mutex) fileStorageConnection$writeScope$1.L$1;
                                            fileStorageConnection = (FileStorageConnection) fileStorageConnection$writeScope$1.L$0;
                                            try {
                                                ResultKt.throwOnFailure(r10);
                                                Unit unit = Unit.INSTANCE;
                                                try {
                                                    closeable.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th != null) {
                                                    if (file.exists() && !FileMoves_androidKt.atomicMoveTo(file, fileStorageConnection.file)) {
                                                        throw new IOException("Unable to rename " + file + " to " + fileStorageConnection.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                    }
                                                    Unit unit2 = Unit.INSTANCE;
                                                    mutex2.unlock(null);
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
                                        Mutex mutex3 = (Mutex) fileStorageConnection$writeScope$1.L$2;
                                        function2 = (Function2) fileStorageConnection$writeScope$1.L$1;
                                        FileStorageConnection<T> fileStorageConnection2 = (FileStorageConnection) fileStorageConnection$writeScope$1.L$0;
                                        ResultKt.throwOnFailure(r10);
                                        mutex = mutex3;
                                        this = fileStorageConnection2;
                                    }
                                    r3 = new File(this.file.getAbsolutePath() + ".tmp");
                                    fileWriteScope = new FileWriteScope(r3, this.serializer);
                                    fileStorageConnection$writeScope$1.L$0 = this;
                                    fileStorageConnection$writeScope$1.L$1 = mutex;
                                    fileStorageConnection$writeScope$1.L$2 = r3;
                                    fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                                    fileStorageConnection$writeScope$1.label = 2;
                                    if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                                        fileStorageConnection = this;
                                        mutex2 = mutex;
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
                            fileStorageConnection$writeScope$1.L$0 = this;
                            fileStorageConnection$writeScope$1.L$1 = mutex;
                            fileStorageConnection$writeScope$1.L$2 = r3;
                            fileStorageConnection$writeScope$1.L$3 = fileWriteScope;
                            fileStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            th = th5;
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
                    if (i != 0) {
                    }
                    r3 = new File(this.file.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r10.unlock(null);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                r3 = function2;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = coroutine_suspended;
            r10.unlock(null);
            throw th;
        }
        fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuation);
        r10 = fileStorageConnection$writeScope$1.result;
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
