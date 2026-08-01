package expo.modules.updates.db;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lexpo/modules/updates/db/DatabaseHolder;", "", "mDatabase", "Lexpo/modules/updates/db/UpdatesDatabase;", "<init>", "(Lexpo/modules/updates/db/UpdatesDatabase;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "database", "getDatabase", "()Lexpo/modules/updates/db/UpdatesDatabase;", "withDatabase", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DatabaseHolder {
    private static final String TAG = "DatabaseHolder";
    private final UpdatesDatabase database;
    private final UpdatesDatabase mDatabase;
    private final Mutex mutex;

    public DatabaseHolder(UpdatesDatabase mDatabase) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(mDatabase, "mDatabase");
        this.mDatabase = mDatabase;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new DatabaseHolder$database$1(this, null), 1, null);
        this.database = (UpdatesDatabase) runBlocking$default;
    }

    public final UpdatesDatabase getDatabase() {
        return this.database;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r9.lock(null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object withDatabase(Function2<? super UpdatesDatabase, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        DatabaseHolder$withDatabase$1 databaseHolder$withDatabase$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object invoke;
        try {
            if (continuation instanceof DatabaseHolder$withDatabase$1) {
                databaseHolder$withDatabase$1 = (DatabaseHolder$withDatabase$1) continuation;
                if ((databaseHolder$withDatabase$1.label & Integer.MIN_VALUE) != 0) {
                    databaseHolder$withDatabase$1.label -= Integer.MIN_VALUE;
                    Object obj = databaseHolder$withDatabase$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = databaseHolder$withDatabase$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        databaseHolder$withDatabase$1.L$0 = function2;
                        databaseHolder$withDatabase$1.L$1 = mutex;
                        databaseHolder$withDatabase$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) databaseHolder$withDatabase$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) databaseHolder$withDatabase$1.L$1;
                        Function2<? super UpdatesDatabase, ? super Continuation<? super T>, ? extends Object> function22 = (Function2) databaseHolder$withDatabase$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        function2 = function22;
                    }
                    UpdatesDatabase updatesDatabase = this.mDatabase;
                    databaseHolder$withDatabase$1.L$0 = mutex;
                    databaseHolder$withDatabase$1.L$1 = null;
                    databaseHolder$withDatabase$1.label = 2;
                    invoke = function2.invoke(updatesDatabase, databaseHolder$withDatabase$1);
                    if (invoke != coroutine_suspended) {
                        Mutex mutex4 = mutex;
                        obj = invoke;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            UpdatesDatabase updatesDatabase2 = this.mDatabase;
            databaseHolder$withDatabase$1.L$0 = mutex;
            databaseHolder$withDatabase$1.L$1 = null;
            databaseHolder$withDatabase$1.label = 2;
            invoke = function2.invoke(updatesDatabase2, databaseHolder$withDatabase$1);
            if (invoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        databaseHolder$withDatabase$1 = new DatabaseHolder$withDatabase$1(this, continuation);
        Object obj2 = databaseHolder$withDatabase$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = databaseHolder$withDatabase$1.label;
        if (i != 0) {
        }
    }
}
