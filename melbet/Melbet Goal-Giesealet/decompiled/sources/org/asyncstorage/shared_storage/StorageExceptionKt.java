package org.asyncstorage.shared_storage;

import android.database.SQLException;
import co.touchlab.kermit.Logger;
import co.touchlab.kermit.Severity;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.asyncstorage.shared_storage.StorageException;

/* compiled from: StorageException.kt */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0080@¢\u0006\u0002\u0010\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\r"}, d2 = {"catchStorageException", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "log", "Lco/touchlab/kermit/Logger;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lco/touchlab/kermit/Logger;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "asStorageException", "Lorg/asyncstorage/shared_storage/StorageException;", "", "shared-storage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageExceptionKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object catchStorageException(Logger logger, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        StorageExceptionKt$catchStorageException$1 storageExceptionKt$catchStorageException$1;
        int i;
        try {
            if (continuation instanceof StorageExceptionKt$catchStorageException$1) {
                storageExceptionKt$catchStorageException$1 = (StorageExceptionKt$catchStorageException$1) continuation;
                if ((storageExceptionKt$catchStorageException$1.label & Integer.MIN_VALUE) != 0) {
                    storageExceptionKt$catchStorageException$1.label -= Integer.MIN_VALUE;
                    Object obj = storageExceptionKt$catchStorageException$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = storageExceptionKt$catchStorageException$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    storageExceptionKt$catchStorageException$1.L$0 = logger;
                    storageExceptionKt$catchStorageException$1.L$1 = SpillingKt.nullOutSpilledVariable(function1);
                    storageExceptionKt$catchStorageException$1.label = 1;
                    Object invoke = function1.invoke(storageExceptionKt$catchStorageException$1);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            String tag = logger.getTag();
            Logger logger2 = logger;
            Severity severity = Severity.Info;
            if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                logger2.processLog(severity, tag, null, "operation cancelled");
            }
            throw e;
        } catch (Throwable th) {
            throw asStorageException(th, logger);
        }
        storageExceptionKt$catchStorageException$1 = new StorageExceptionKt$catchStorageException$1(continuation);
        Object obj2 = storageExceptionKt$catchStorageException$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = storageExceptionKt$catchStorageException$1.label;
    }

    public static final <T> Flow<T> catchStorageException(Flow<? extends T> flow, Logger log) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(log, "log");
        return FlowKt.m2292catch(flow, new StorageExceptionKt$catchStorageException$3(log, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorageException asStorageException(Throwable th, Logger logger) {
        if (th instanceof SQLException) {
            String message = th.getMessage();
            if (message == null) {
                message = "Unexcepted Sqlite exception: " + Reflection.getOrCreateKotlinClass(th.getClass()).getQualifiedName();
            }
            StorageException.SqliteException sqliteException = new StorageException.SqliteException(message, th.getCause());
            String tag = logger.getTag();
            Logger logger2 = logger;
            Severity severity = Severity.Warn;
            if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                logger2.processLog(severity, tag, th, "Sqlite exception caught: " + th.getMessage());
            }
            return sqliteException;
        }
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = "Unknown storage exception: " + Reflection.getOrCreateKotlinClass(th.getClass()).getQualifiedName();
        }
        StorageException.OtherException otherException = new StorageException.OtherException(message2, th.getCause());
        String tag2 = logger.getTag();
        Logger logger3 = logger;
        Severity severity2 = Severity.Warn;
        if (logger3.getConfig().get_minSeverity().compareTo(severity2) <= 0) {
            logger3.processLog(severity2, tag2, th, "Unknown storage exception caught: " + th.getMessage());
        }
        return otherException;
    }
}
