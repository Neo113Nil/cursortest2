package com.squareup.cash.treehouse.sqldelight;

import android.content.res.Resources;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AndroidSqlDelightBridge implements SqlDelightBridge {
    public final SemaphoreImpl connectionsSemaphore;
    public final SupportSQLiteDatabase database;
    public final CoroutineContext ioDispatcher;
    public final AtomicInteger transactionIdCounter;
    public final LinkedHashMap transactionThreadDispatcherPool;

    public AndroidSqlDelightBridge(SupportSQLiteDatabase supportSQLiteDatabase, CoroutineContext coroutineContext) {
        supportSQLiteDatabase.getClass();
        this.database = supportSQLiteDatabase;
        this.ioDispatcher = coroutineContext;
        this.transactionIdCounter = new AtomicInteger(1);
        this.transactionThreadDispatcherPool = new LinkedHashMap();
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("db_connection_pool_size", InquiryField.IntegerField.TYPE, "android");
        Integer valueOf = identifier == 0 ? null : Integer.valueOf(identifier);
        int integer = valueOf == null ? 4 : system.getInteger(valueOf.intValue());
        int i = SemaphoreKt.MAX_SPIN_CYCLES;
        this.connectionsSemaphore = new SemaphoreImpl(integer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r11.acquire(r1) == r2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlinx.coroutines.sync.Semaphore] */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object beginTransaction(ContinuationImpl continuationImpl) {
        AndroidSqlDelightBridge$beginTransaction$1 androidSqlDelightBridge$beginTransaction$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SemaphoreImpl semaphoreImpl;
        int i2;
        Object obj;
        ExecutorCoroutineDispatcherImpl newSingleThreadContext;
        AndroidSqlDelightBridge$endTransaction$2 androidSqlDelightBridge$endTransaction$2;
        int i3;
        try {
            if (continuationImpl instanceof AndroidSqlDelightBridge$beginTransaction$1) {
                androidSqlDelightBridge$beginTransaction$1 = (AndroidSqlDelightBridge$beginTransaction$1) continuationImpl;
                int i4 = androidSqlDelightBridge$beginTransaction$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    androidSqlDelightBridge$beginTransaction$1.label = i4 - PKIFailureInfo.systemUnavail;
                    Object obj2 = androidSqlDelightBridge$beginTransaction$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidSqlDelightBridge$beginTransaction$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        semaphoreImpl = this.connectionsSemaphore;
                        androidSqlDelightBridge$beginTransaction$1.L$0 = semaphoreImpl;
                        i2 = 0;
                        androidSqlDelightBridge$beginTransaction$1.I$0 = 0;
                        androidSqlDelightBridge$beginTransaction$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = androidSqlDelightBridge$beginTransaction$1.I$2;
                            obj = androidSqlDelightBridge$beginTransaction$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                Integer num = new Integer(i3);
                                ((SemaphoreAndMutexImpl) obj).release();
                                return num;
                            } catch (Throwable th) {
                                th = th;
                                ((SemaphoreAndMutexImpl) obj).release();
                                throw th;
                            }
                        }
                        i2 = androidSqlDelightBridge$beginTransaction$1.I$0;
                        ?? r7 = androidSqlDelightBridge$beginTransaction$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        semaphoreImpl = r7;
                    }
                    int andIncrement = this.transactionIdCounter.getAndIncrement();
                    newSingleThreadContext = ThreadPoolDispatcherKt.newSingleThreadContext("AndroidSqlDelightBridge Transaction #" + andIncrement);
                    this.transactionThreadDispatcherPool.put(new Integer(andIncrement), newSingleThreadContext);
                    androidSqlDelightBridge$endTransaction$2 = new AndroidSqlDelightBridge$endTransaction$2(this, null, 1);
                    androidSqlDelightBridge$beginTransaction$1.L$0 = semaphoreImpl;
                    androidSqlDelightBridge$beginTransaction$1.I$0 = i2;
                    androidSqlDelightBridge$beginTransaction$1.I$2 = andIncrement;
                    androidSqlDelightBridge$beginTransaction$1.label = 2;
                    if (JobKt.withContext(newSingleThreadContext, androidSqlDelightBridge$endTransaction$2, androidSqlDelightBridge$beginTransaction$1) != coroutineSingletons) {
                        obj = semaphoreImpl;
                        i3 = andIncrement;
                        Integer num2 = new Integer(i3);
                        ((SemaphoreAndMutexImpl) obj).release();
                        return num2;
                    }
                    return coroutineSingletons;
                }
            }
            int andIncrement2 = this.transactionIdCounter.getAndIncrement();
            newSingleThreadContext = ThreadPoolDispatcherKt.newSingleThreadContext("AndroidSqlDelightBridge Transaction #" + andIncrement2);
            this.transactionThreadDispatcherPool.put(new Integer(andIncrement2), newSingleThreadContext);
            androidSqlDelightBridge$endTransaction$2 = new AndroidSqlDelightBridge$endTransaction$2(this, null, 1);
            androidSqlDelightBridge$beginTransaction$1.L$0 = semaphoreImpl;
            androidSqlDelightBridge$beginTransaction$1.I$0 = i2;
            androidSqlDelightBridge$beginTransaction$1.I$2 = andIncrement2;
            androidSqlDelightBridge$beginTransaction$1.label = 2;
            if (JobKt.withContext(newSingleThreadContext, androidSqlDelightBridge$endTransaction$2, androidSqlDelightBridge$beginTransaction$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            obj = semaphoreImpl;
            ((SemaphoreAndMutexImpl) obj).release();
            throw th;
        }
        androidSqlDelightBridge$beginTransaction$1 = new AndroidSqlDelightBridge$beginTransaction$1(this, continuationImpl);
        Object obj22 = androidSqlDelightBridge$beginTransaction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSqlDelightBridge$beginTransaction$1.label;
        if (i != 0) {
        }
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.transactionThreadDispatcherPool.entrySet().iterator();
        while (it.hasNext()) {
            ((ExecutorCoroutineDispatcher) ((Map.Entry) it.next()).getValue()).close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object endTransaction(int i, ContinuationImpl continuationImpl) {
        AndroidSqlDelightBridge$endTransaction$1 androidSqlDelightBridge$endTransaction$1;
        int i2;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher;
        if (continuationImpl instanceof AndroidSqlDelightBridge$endTransaction$1) {
            androidSqlDelightBridge$endTransaction$1 = (AndroidSqlDelightBridge$endTransaction$1) continuationImpl;
            int i3 = androidSqlDelightBridge$endTransaction$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                androidSqlDelightBridge$endTransaction$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = androidSqlDelightBridge$endTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = androidSqlDelightBridge$endTransaction$1.label;
                LinkedHashMap linkedHashMap = this.transactionThreadDispatcherPool;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj2 = linkedHashMap.get(new Integer(i));
                    if (obj2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Trying to close invalid transaction ID!");
                        return null;
                    }
                    ExecutorCoroutineDispatcher executorCoroutineDispatcher2 = (ExecutorCoroutineDispatcher) obj2;
                    AndroidSqlDelightBridge$endTransaction$2 androidSqlDelightBridge$endTransaction$2 = new AndroidSqlDelightBridge$endTransaction$2(this, null, 0);
                    androidSqlDelightBridge$endTransaction$1.L$0 = executorCoroutineDispatcher2;
                    androidSqlDelightBridge$endTransaction$1.I$0 = i;
                    androidSqlDelightBridge$endTransaction$1.label = 1;
                    if (JobKt.withContext(executorCoroutineDispatcher2, androidSqlDelightBridge$endTransaction$2, androidSqlDelightBridge$endTransaction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    executorCoroutineDispatcher = executorCoroutineDispatcher2;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = androidSqlDelightBridge$endTransaction$1.I$0;
                    executorCoroutineDispatcher = androidSqlDelightBridge$endTransaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                linkedHashMap.remove(new Integer(i));
                executorCoroutineDispatcher.close();
                return Unit.INSTANCE;
            }
        }
        androidSqlDelightBridge$endTransaction$1 = new AndroidSqlDelightBridge$endTransaction$1(this, continuationImpl);
        Object obj3 = androidSqlDelightBridge$endTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidSqlDelightBridge$endTransaction$1.label;
        LinkedHashMap linkedHashMap2 = this.transactionThreadDispatcherPool;
        if (i2 != 0) {
        }
        linkedHashMap2.remove(new Integer(i));
        executorCoroutineDispatcher.close();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #1 {all -> 0x0074, blocks: (B:28:0x0071, B:29:0x0087, B:33:0x0078, B:36:0x007f, B:38:0x0085, B:39:0x00b4, B:40:0x00bb), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:28:0x0071, B:29:0x0087, B:33:0x0078, B:36:0x007f, B:38:0x0085, B:39:0x00b4, B:40:0x00bb), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, List list, int i, ContinuationImpl continuationImpl) {
        AndroidSqlDelightBridge$execute$1 androidSqlDelightBridge$execute$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String str2;
        List list2;
        Semaphore semaphore;
        int i3;
        Throwable th;
        Object obj2;
        CoroutineContext coroutineContext;
        try {
            if (continuationImpl instanceof AndroidSqlDelightBridge$execute$1) {
                androidSqlDelightBridge$execute$1 = (AndroidSqlDelightBridge$execute$1) continuationImpl;
                int i4 = androidSqlDelightBridge$execute$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    androidSqlDelightBridge$execute$1.label = i4 - PKIFailureInfo.systemUnavail;
                    obj = androidSqlDelightBridge$execute$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = androidSqlDelightBridge$execute$1.label;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        androidSqlDelightBridge$execute$1.L$0 = str;
                        androidSqlDelightBridge$execute$1.L$1 = list;
                        SemaphoreImpl semaphoreImpl = this.connectionsSemaphore;
                        androidSqlDelightBridge$execute$1.L$2 = semaphoreImpl;
                        androidSqlDelightBridge$execute$1.I$0 = i;
                        androidSqlDelightBridge$execute$1.I$1 = 0;
                        androidSqlDelightBridge$execute$1.label = 1;
                        if (semaphoreImpl.acquire(androidSqlDelightBridge$execute$1) != coroutineSingletons) {
                            str2 = str;
                            list2 = list;
                            semaphore = semaphoreImpl;
                            i3 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = androidSqlDelightBridge$execute$1.L$2;
                        List list3 = androidSqlDelightBridge$execute$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            Long l = new Long(((Number) obj).longValue());
                            ((SemaphoreAndMutexImpl) obj2).release();
                            return l;
                        } catch (Throwable th2) {
                            th = th2;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            throw th;
                        }
                    }
                    i3 = androidSqlDelightBridge$execute$1.I$1;
                    i = androidSqlDelightBridge$execute$1.I$0;
                    semaphore = androidSqlDelightBridge$execute$1.L$2;
                    List list4 = androidSqlDelightBridge$execute$1.L$1;
                    String str3 = androidSqlDelightBridge$execute$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list2 = list4;
                    str2 = str3;
                    if (i != -1) {
                        coroutineContext = this.ioDispatcher;
                    } else {
                        try {
                            Object obj3 = this.transactionThreadDispatcherPool.get(new Integer(i));
                            if (obj3 == null) {
                                throw new IllegalArgumentException("Trying to execute a statement with an invalid transaction ID!");
                            }
                            coroutineContext = (CoroutineContext) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = semaphore;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            throw th;
                        }
                    }
                    AndroidSqlDelightBridge$execute$2$1 androidSqlDelightBridge$execute$2$1 = new AndroidSqlDelightBridge$execute$2$1(this, str2, list2, null, 0);
                    androidSqlDelightBridge$execute$1.L$0 = null;
                    androidSqlDelightBridge$execute$1.L$1 = null;
                    androidSqlDelightBridge$execute$1.L$2 = semaphore;
                    androidSqlDelightBridge$execute$1.I$0 = i;
                    androidSqlDelightBridge$execute$1.I$1 = i3;
                    androidSqlDelightBridge$execute$1.label = 2;
                    obj = JobKt.withContext(coroutineContext, androidSqlDelightBridge$execute$2$1, androidSqlDelightBridge$execute$1);
                    if (obj != coroutineSingletons) {
                        obj2 = semaphore;
                        Long l2 = new Long(((Number) obj).longValue());
                        ((SemaphoreAndMutexImpl) obj2).release();
                        return l2;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != -1) {
            }
            AndroidSqlDelightBridge$execute$2$1 androidSqlDelightBridge$execute$2$12 = new AndroidSqlDelightBridge$execute$2$1(this, str2, list2, null, 0);
            androidSqlDelightBridge$execute$1.L$0 = null;
            androidSqlDelightBridge$execute$1.L$1 = null;
            androidSqlDelightBridge$execute$1.L$2 = semaphore;
            androidSqlDelightBridge$execute$1.I$0 = i;
            androidSqlDelightBridge$execute$1.I$1 = i3;
            androidSqlDelightBridge$execute$1.label = 2;
            obj = JobKt.withContext(coroutineContext, androidSqlDelightBridge$execute$2$12, androidSqlDelightBridge$execute$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
        }
        androidSqlDelightBridge$execute$1 = new AndroidSqlDelightBridge$execute$1(this, continuationImpl);
        obj = androidSqlDelightBridge$execute$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidSqlDelightBridge$execute$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #2 {all -> 0x0074, blocks: (B:28:0x0071, B:29:0x0087, B:33:0x0078, B:36:0x007f, B:38:0x0085, B:39:0x00ab, B:40:0x00b2), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #2 {all -> 0x0074, blocks: (B:28:0x0071, B:29:0x0087, B:33:0x0078, B:36:0x007f, B:38:0x0085, B:39:0x00ab, B:40:0x00b2), top: B:26:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeQuery(String str, List list, int i, ContinuationImpl continuationImpl) {
        AndroidSqlDelightBridge$executeQuery$1 androidSqlDelightBridge$executeQuery$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String str2;
        List list2;
        Semaphore semaphore;
        int i3;
        Throwable th;
        Object obj2;
        CoroutineContext coroutineContext;
        try {
            if (continuationImpl instanceof AndroidSqlDelightBridge$executeQuery$1) {
                androidSqlDelightBridge$executeQuery$1 = (AndroidSqlDelightBridge$executeQuery$1) continuationImpl;
                int i4 = androidSqlDelightBridge$executeQuery$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    androidSqlDelightBridge$executeQuery$1.label = i4 - PKIFailureInfo.systemUnavail;
                    obj = androidSqlDelightBridge$executeQuery$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = androidSqlDelightBridge$executeQuery$1.label;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        androidSqlDelightBridge$executeQuery$1.L$0 = str;
                        androidSqlDelightBridge$executeQuery$1.L$1 = list;
                        SemaphoreImpl semaphoreImpl = this.connectionsSemaphore;
                        androidSqlDelightBridge$executeQuery$1.L$2 = semaphoreImpl;
                        androidSqlDelightBridge$executeQuery$1.I$0 = i;
                        androidSqlDelightBridge$executeQuery$1.I$1 = 0;
                        androidSqlDelightBridge$executeQuery$1.label = 1;
                        if (semaphoreImpl.acquire(androidSqlDelightBridge$executeQuery$1) != coroutineSingletons) {
                            str2 = str;
                            list2 = list;
                            semaphore = semaphoreImpl;
                            i3 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = androidSqlDelightBridge$executeQuery$1.L$2;
                        List list3 = androidSqlDelightBridge$executeQuery$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            List list4 = (List) obj;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            return list4;
                        } catch (Throwable th2) {
                            th = th2;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            throw th;
                        }
                    }
                    i3 = androidSqlDelightBridge$executeQuery$1.I$1;
                    i = androidSqlDelightBridge$executeQuery$1.I$0;
                    semaphore = androidSqlDelightBridge$executeQuery$1.L$2;
                    List list5 = androidSqlDelightBridge$executeQuery$1.L$1;
                    String str3 = androidSqlDelightBridge$executeQuery$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list2 = list5;
                    str2 = str3;
                    if (i != -1) {
                        coroutineContext = this.ioDispatcher;
                    } else {
                        try {
                            Object obj3 = this.transactionThreadDispatcherPool.get(new Integer(i));
                            if (obj3 == null) {
                                throw new IllegalArgumentException("Trying to execute a query with an invalid transaction ID!");
                            }
                            coroutineContext = (CoroutineContext) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = semaphore;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            throw th;
                        }
                    }
                    AndroidSqlDelightBridge$execute$2$1 androidSqlDelightBridge$execute$2$1 = new AndroidSqlDelightBridge$execute$2$1(this, str2, list2, null, 1);
                    androidSqlDelightBridge$executeQuery$1.L$0 = null;
                    androidSqlDelightBridge$executeQuery$1.L$1 = null;
                    androidSqlDelightBridge$executeQuery$1.L$2 = semaphore;
                    androidSqlDelightBridge$executeQuery$1.I$0 = i;
                    androidSqlDelightBridge$executeQuery$1.I$1 = i3;
                    androidSqlDelightBridge$executeQuery$1.label = 2;
                    obj = JobKt.withContext(coroutineContext, androidSqlDelightBridge$execute$2$1, androidSqlDelightBridge$executeQuery$1);
                    if (obj != coroutineSingletons) {
                        obj2 = semaphore;
                        List list42 = (List) obj;
                        ((SemaphoreAndMutexImpl) obj2).release();
                        return list42;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != -1) {
            }
            AndroidSqlDelightBridge$execute$2$1 androidSqlDelightBridge$execute$2$12 = new AndroidSqlDelightBridge$execute$2$1(this, str2, list2, null, 1);
            androidSqlDelightBridge$executeQuery$1.L$0 = null;
            androidSqlDelightBridge$executeQuery$1.L$1 = null;
            androidSqlDelightBridge$executeQuery$1.L$2 = semaphore;
            androidSqlDelightBridge$executeQuery$1.I$0 = i;
            androidSqlDelightBridge$executeQuery$1.I$1 = i3;
            androidSqlDelightBridge$executeQuery$1.label = 2;
            obj = JobKt.withContext(coroutineContext, androidSqlDelightBridge$execute$2$12, androidSqlDelightBridge$executeQuery$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
        }
        androidSqlDelightBridge$executeQuery$1 = new AndroidSqlDelightBridge$executeQuery$1(this, continuationImpl);
        obj = androidSqlDelightBridge$executeQuery$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidSqlDelightBridge$executeQuery$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rollbackTransaction(int i, ContinuationImpl continuationImpl) {
        AndroidSqlDelightBridge$rollbackTransaction$1 androidSqlDelightBridge$rollbackTransaction$1;
        int i2;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher;
        if (continuationImpl instanceof AndroidSqlDelightBridge$rollbackTransaction$1) {
            androidSqlDelightBridge$rollbackTransaction$1 = (AndroidSqlDelightBridge$rollbackTransaction$1) continuationImpl;
            int i3 = androidSqlDelightBridge$rollbackTransaction$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                androidSqlDelightBridge$rollbackTransaction$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = androidSqlDelightBridge$rollbackTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = androidSqlDelightBridge$rollbackTransaction$1.label;
                LinkedHashMap linkedHashMap = this.transactionThreadDispatcherPool;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj2 = linkedHashMap.get(new Integer(i));
                    if (obj2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Trying to rollback invalid transaction ID!");
                        return null;
                    }
                    ExecutorCoroutineDispatcher executorCoroutineDispatcher2 = (ExecutorCoroutineDispatcher) obj2;
                    AndroidSqlDelightBridge$endTransaction$2 androidSqlDelightBridge$endTransaction$2 = new AndroidSqlDelightBridge$endTransaction$2(this, null, 2);
                    androidSqlDelightBridge$rollbackTransaction$1.L$0 = executorCoroutineDispatcher2;
                    androidSqlDelightBridge$rollbackTransaction$1.I$0 = i;
                    androidSqlDelightBridge$rollbackTransaction$1.label = 1;
                    if (JobKt.withContext(executorCoroutineDispatcher2, androidSqlDelightBridge$endTransaction$2, androidSqlDelightBridge$rollbackTransaction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    executorCoroutineDispatcher = executorCoroutineDispatcher2;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = androidSqlDelightBridge$rollbackTransaction$1.I$0;
                    executorCoroutineDispatcher = androidSqlDelightBridge$rollbackTransaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                linkedHashMap.remove(new Integer(i));
                executorCoroutineDispatcher.close();
                return Unit.INSTANCE;
            }
        }
        androidSqlDelightBridge$rollbackTransaction$1 = new AndroidSqlDelightBridge$rollbackTransaction$1(this, continuationImpl);
        Object obj3 = androidSqlDelightBridge$rollbackTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidSqlDelightBridge$rollbackTransaction$1.label;
        LinkedHashMap linkedHashMap2 = this.transactionThreadDispatcherPool;
        if (i2 != 0) {
        }
        linkedHashMap2.remove(new Integer(i));
        executorCoroutineDispatcher.close();
        return Unit.INSTANCE;
    }
}
