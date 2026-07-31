package androidx.datastore.core.okio;

import androidx.datastore.core.DirectBootExceptionUtilKt;
import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: OkioStorage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:18:0x00a2, B:30:0x00ac, B:60:0x0055), top: B:59:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: Exception -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bf, blocks: (B:24:0x00be, B:54:0x00b5, B:58:0x0047, B:51:0x00b0), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:18:0x00a2, B:30:0x00ac, B:60:0x0055), top: B:59:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeData(T t, Continuation<? super Unit> continuation) {
        OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        int i;
        FileHandle openReadWrite;
        ?? r0;
        Throwable th;
        Closeable closeable;
        FileHandle fileHandle;
        Throwable th2;
        try {
            if (continuation instanceof OkioWriteScope$writeData$1) {
                okioWriteScope$writeData$1 = (OkioWriteScope$writeData$1) continuation;
                if ((okioWriteScope$writeData$1.label & Integer.MIN_VALUE) != 0) {
                    okioWriteScope$writeData$1.label -= Integer.MIN_VALUE;
                    Object obj = okioWriteScope$writeData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = okioWriteScope$writeData$1.label;
                    Throwable th3 = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        checkClose();
                        openReadWrite = getFileSystem().openReadWrite(getPath());
                        try {
                            FileHandle fileHandle2 = openReadWrite;
                            BufferedSink buffer = Okio.buffer(FileHandle.sink$default(fileHandle2, 0L, 1, null));
                            try {
                                OkioSerializer<T> serializer = getSerializer();
                                okioWriteScope$writeData$1.L$0 = openReadWrite;
                                okioWriteScope$writeData$1.L$1 = fileHandle2;
                                okioWriteScope$writeData$1.L$2 = buffer;
                                okioWriteScope$writeData$1.label = 1;
                                if (serializer.writeTo(t, buffer, okioWriteScope$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r0 = openReadWrite;
                                fileHandle = fileHandle2;
                                closeable = buffer;
                            } catch (Throwable th4) {
                                r0 = openReadWrite;
                                th = th4;
                                closeable = buffer;
                                if (closeable != null) {
                                }
                                th2 = th;
                                Closeable closeable2 = r0;
                                if (th2 != null) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (openReadWrite != null) {
                            }
                            th3 = th;
                            if (th3 == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) okioWriteScope$writeData$1.L$2;
                        fileHandle = (FileHandle) okioWriteScope$writeData$1.L$1;
                        r0 = (Closeable) okioWriteScope$writeData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r0 = r0;
                        } catch (Throwable th6) {
                            th = th6;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th7) {
                                    try {
                                        ExceptionsKt.addSuppressed(th, th7);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        openReadWrite = r0;
                                        if (openReadWrite != null) {
                                            try {
                                                openReadWrite.close();
                                            } catch (Throwable th9) {
                                                ExceptionsKt.addSuppressed(th, th9);
                                            }
                                        }
                                        th3 = th;
                                        if (th3 == null) {
                                        }
                                    }
                                }
                            }
                            th2 = th;
                            Closeable closeable22 = r0;
                            if (th2 != null) {
                            }
                        }
                    }
                    fileHandle.flush();
                    Unit unit = Unit.INSTANCE;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th10) {
                            th2 = th10;
                        }
                    }
                    th2 = null;
                    Closeable closeable222 = r0;
                    if (th2 != null) {
                        Unit unit2 = Unit.INSTANCE;
                        if (closeable222 != null) {
                            try {
                                closeable222.close();
                            } catch (Throwable th11) {
                                th3 = th11;
                            }
                        }
                        if (th3 == null) {
                            return Unit.INSTANCE;
                        }
                        throw th3;
                    }
                    throw th2;
                }
            }
            if (i != 0) {
            }
            fileHandle.flush();
            Unit unit3 = Unit.INSTANCE;
            if (closeable != null) {
            }
            th2 = null;
            Closeable closeable2222 = r0;
            if (th2 != null) {
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(String.valueOf(getPath().parent()), e);
            }
            throw e;
        }
        okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, continuation);
        Object obj2 = okioWriteScope$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okioWriteScope$writeData$1.label;
        Throwable th32 = null;
    }
}
