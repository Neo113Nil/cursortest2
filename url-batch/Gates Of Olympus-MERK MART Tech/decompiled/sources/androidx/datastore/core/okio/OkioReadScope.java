package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.ReadScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: OkioStorage.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "getFileSystem", "()Lokio/FileSystem;", "getPath", "()Lokio/Path;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "checkClose", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final FileSystem fileSystem;
    private final Path path;
    private final OkioSerializer<T> serializer;

    @Override // androidx.datastore.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }

    public OkioReadScope(FileSystem fileSystem, Path path, OkioSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    protected final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    protected final Path getPath() {
        return this.path;
    }

    protected final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|(2:31|32)|15|16|(2:18|19)(1:21))(2:46|47))(3:48|49|50))(7:71|72|73|74|75|(1:77)|78)|(2:58|59)|52|(2:54|55)(1:56)))|98|6|7|(0)(0)|(0)|52|(0)(0)|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0094, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed A[Catch: Exception -> 0x00ee, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ee, blocks: (B:21:0x00ed, B:89:0x00a7), top: B:88:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c A[Catch: FileNotFoundException -> 0x0094, TRY_LEAVE, TryCatch #5 {FileNotFoundException -> 0x0094, blocks: (B:56:0x009c, B:70:0x0090, B:67:0x008b), top: B:7:0x0024, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, Continuation<? super T> continuation) {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        ?? r2;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        ?? th;
        Object readFrom;
        Closeable closeable2;
        Throwable th2;
        Throwable th3;
        if (continuation instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) continuation;
            if ((okioReadScope$readData$1.label & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.label -= Integer.MIN_VALUE;
                Object obj = okioReadScope$readData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = okioReadScope$readData$1.label;
                Object th4 = null;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    okioReadScope.checkClose();
                    try {
                        BufferedSource buffer = Okio.buffer(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                        try {
                            OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                            okioReadScope$readData$1.L$0 = okioReadScope;
                            okioReadScope$readData$1.L$1 = buffer;
                            okioReadScope$readData$1.label = 1;
                            Object readFrom2 = okioSerializer.readFrom(buffer, okioReadScope$readData$1);
                            if (readFrom2 != coroutine_suspended) {
                                r2 = okioReadScope;
                                closeable2 = buffer;
                                obj = readFrom2;
                            }
                        } catch (Throwable th5) {
                            r2 = okioReadScope;
                            closeable2 = buffer;
                            th2 = th5;
                            if (closeable2 != null) {
                                try {
                                    closeable2.close();
                                } catch (Throwable th6) {
                                    ExceptionsKt.addSuppressed(th2, th6);
                                }
                            }
                            th3 = th2;
                            obj = null;
                            if (th3 != null) {
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        if (!((OkioReadScope) okioReadScope).fileSystem.exists(((OkioReadScope) okioReadScope).path)) {
                            return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                        }
                        try {
                            BufferedSource buffer2 = Okio.buffer(((OkioReadScope) okioReadScope).fileSystem.source(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                                okioReadScope$readData$1.L$0 = okioReadScope;
                                okioReadScope$readData$1.L$1 = buffer2;
                                okioReadScope$readData$1.label = 2;
                                readFrom = okioSerializer2.readFrom(buffer2, okioReadScope$readData$1);
                            } catch (Throwable th7) {
                                okioReadScope2 = okioReadScope;
                                closeable = buffer2;
                                th = th7;
                                if (closeable != null) {
                                    try {
                                        closeable.close();
                                    } catch (Throwable th8) {
                                        try {
                                            ExceptionsKt.addSuppressed(th, th8);
                                        } catch (Exception e) {
                                            e = e;
                                            if (!(e instanceof FileNotFoundException)) {
                                            }
                                        }
                                    }
                                }
                                okioReadScope = okioReadScope2;
                                if (th != 0) {
                                }
                            }
                            if (readFrom != coroutine_suspended) {
                                okioReadScope2 = okioReadScope;
                                closeable = buffer2;
                                obj = readFrom;
                                if (closeable != null) {
                                }
                                Object obj2 = th4;
                                th4 = obj;
                                th = obj2;
                                okioReadScope = okioReadScope2;
                                if (th != 0) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (Exception e2) {
                            okioReadScope2 = okioReadScope;
                            e = e2;
                            if (!(e instanceof FileNotFoundException)) {
                                throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(((OkioReadScope) okioReadScope2).path.parent()), e);
                            }
                            throw e;
                        }
                    }
                    return coroutine_suspended;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) okioReadScope$readData$1.L$1;
                    okioReadScope2 = (OkioReadScope) okioReadScope$readData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th9) {
                                th4 = th9;
                            }
                        }
                        Object obj22 = th4;
                        th4 = obj;
                        th = obj22;
                    } catch (Throwable th10) {
                        th = th10;
                        if (closeable != null) {
                        }
                        okioReadScope = okioReadScope2;
                        if (th != 0) {
                        }
                    }
                    okioReadScope = okioReadScope2;
                    if (th != 0) {
                        return th4;
                    }
                    throw th;
                }
                closeable2 = (Closeable) okioReadScope$readData$1.L$1;
                r2 = (OkioReadScope) okioReadScope$readData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    r2 = r2;
                } catch (Throwable th11) {
                    th2 = th11;
                    if (closeable2 != null) {
                    }
                    th3 = th2;
                    obj = null;
                    if (th3 != null) {
                    }
                }
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th12) {
                        th3 = th12;
                    }
                }
                th3 = null;
                if (th3 != null) {
                    return obj;
                }
                throw th3;
            }
        }
        okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, continuation);
        Object obj3 = okioReadScope$readData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = okioReadScope$readData$1.label;
        Object th42 = null;
        if (r2 != 0) {
        }
        if (closeable2 != null) {
        }
        th3 = null;
        if (th3 != null) {
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }
}
