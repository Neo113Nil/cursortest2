package com.squareup.cash.threedsdataonly.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.threedsdataonly.backend.api.InitializationResult;
import com.squareup.cash.threedsdataonly.backend.api.Transaction$AuthenticationRequestParameters;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsAuthenticationManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealThreeDsAuthenticationManager$prepareTransactions$2 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public int I$2;
    public Mutex L$0;
    public RealThreeDsAuthenticationManager L$1;
    public RealThreeDsAuthenticationManager.TransactionParameters L$3;
    public Iterator L$5;
    public RealThreeDsAuthenticationManager.TransactionParameters.InstrumentInfo L$7;
    public int label;
    public final /* synthetic */ RealThreeDsAuthenticationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealThreeDsAuthenticationManager$prepareTransactions$2(RealThreeDsAuthenticationManager realThreeDsAuthenticationManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realThreeDsAuthenticationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealThreeDsAuthenticationManager$prepareTransactions$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealThreeDsAuthenticationManager$prepareTransactions$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01a3 A[Catch: all -> 0x01ab, TryCatch #2 {all -> 0x01ab, blocks: (B:12:0x019f, B:14:0x01a3, B:21:0x0196, B:26:0x01b8), top: B:11:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016c A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #0 {all -> 0x01b4, blocks: (B:17:0x0166, B:19:0x016c), top: B:16:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b8 A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #2 {all -> 0x01ab, blocks: (B:12:0x019f, B:14:0x01a3, B:21:0x0196, B:26:0x01b8), top: B:11:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:9:0x002a, B:41:0x004a, B:43:0x0117, B:45:0x011b, B:48:0x012d, B:49:0x0142, B:51:0x0148, B:54:0x0157, B:59:0x015b, B:62:0x005b, B:64:0x00de, B:66:0x00e4, B:70:0x01d3, B:72:0x01d7, B:73:0x01ed, B:74:0x01f2, B:76:0x0086, B:78:0x008a, B:80:0x0092, B:84:0x00a6, B:88:0x00b8), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:9:0x002a, B:41:0x004a, B:43:0x0117, B:45:0x011b, B:48:0x012d, B:49:0x0142, B:51:0x0148, B:54:0x0157, B:59:0x015b, B:62:0x005b, B:64:0x00de, B:66:0x00e4, B:70:0x01d3, B:72:0x01d7, B:73:0x01ed, B:74:0x01f2, B:76:0x0086, B:78:0x008a, B:80:0x0092, B:84:0x00a6, B:88:0x00b8), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:9:0x002a, B:41:0x004a, B:43:0x0117, B:45:0x011b, B:48:0x012d, B:49:0x0142, B:51:0x0148, B:54:0x0157, B:59:0x015b, B:62:0x005b, B:64:0x00de, B:66:0x00e4, B:70:0x01d3, B:72:0x01d7, B:73:0x01ed, B:74:0x01f2, B:76:0x0086, B:78:0x008a, B:80:0x0092, B:84:0x00a6, B:88:0x00b8), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:9:0x002a, B:41:0x004a, B:43:0x0117, B:45:0x011b, B:48:0x012d, B:49:0x0142, B:51:0x0148, B:54:0x0157, B:59:0x015b, B:62:0x005b, B:64:0x00de, B:66:0x00e4, B:70:0x01d3, B:72:0x01d7, B:73:0x01ed, B:74:0x01f2, B:76:0x0086, B:78:0x008a, B:80:0x0092, B:84:0x00a6, B:88:0x00b8), top: B:2:0x0010 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x019d -> B:11:0x019f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager;
        Mutex mutex;
        int i;
        Object awaitInternal;
        int i2;
        int i3;
        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager2;
        InitializationResult initializationResult;
        Object access$getTransactionParameters;
        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager3;
        RealThreeDsAuthenticationManager.TransactionParameters transactionParameters;
        RealThreeDsAuthenticationManager.TransactionParameters transactionParameters2;
        int i4;
        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager4;
        Iterator it;
        int i5;
        Mutex mutex2;
        int i6;
        RealThreeDsAuthenticationManager$prepareTransactions$2 realThreeDsAuthenticationManager$prepareTransactions$2 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = realThreeDsAuthenticationManager$prepareTransactions$2.label;
        boolean z = true;
        try {
            if (i7 == 0) {
                SafeTrace.throwOnFailure(obj);
                realThreeDsAuthenticationManager = realThreeDsAuthenticationManager$prepareTransactions$2.this$0;
                MutexImpl mutexImpl = realThreeDsAuthenticationManager.mutex;
                realThreeDsAuthenticationManager$prepareTransactions$2.L$0 = mutexImpl;
                realThreeDsAuthenticationManager$prepareTransactions$2.L$1 = realThreeDsAuthenticationManager;
                realThreeDsAuthenticationManager$prepareTransactions$2.I$0 = 0;
                realThreeDsAuthenticationManager$prepareTransactions$2.label = 1;
                if (mutexImpl.lock(realThreeDsAuthenticationManager$prepareTransactions$2) != coroutineSingletons) {
                    mutex = mutexImpl;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i7 == 1) {
                i = realThreeDsAuthenticationManager$prepareTransactions$2.I$0;
                realThreeDsAuthenticationManager = realThreeDsAuthenticationManager$prepareTransactions$2.L$1;
                Mutex mutex3 = realThreeDsAuthenticationManager$prepareTransactions$2.L$0;
                SafeTrace.throwOnFailure(obj);
                mutex = mutex3;
            } else if (i7 == 2) {
                i3 = realThreeDsAuthenticationManager$prepareTransactions$2.I$1;
                i2 = realThreeDsAuthenticationManager$prepareTransactions$2.I$0;
                realThreeDsAuthenticationManager2 = realThreeDsAuthenticationManager$prepareTransactions$2.L$1;
                mutex = realThreeDsAuthenticationManager$prepareTransactions$2.L$0;
                SafeTrace.throwOnFailure(obj);
                awaitInternal = obj;
                initializationResult = (InitializationResult) awaitInternal;
                if (initializationResult instanceof InitializationResult.Success) {
                    if (!(initializationResult instanceof InitializationResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("3DS-auth-manager");
                    forest.e("Failed to initialize 3DS SDK", new Object[0], ((InitializationResult.Failure) initializationResult).throwable);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("3DS-auth-manager");
                forest2.d("3DS SDK initialized successfully (alreadyInitialized=" + ((InitializationResult.Success) initializationResult).alreadyInitialized + ")", new Object[0]);
                realThreeDsAuthenticationManager$prepareTransactions$2.L$0 = mutex;
                realThreeDsAuthenticationManager$prepareTransactions$2.L$1 = realThreeDsAuthenticationManager2;
                realThreeDsAuthenticationManager$prepareTransactions$2.I$0 = i2;
                realThreeDsAuthenticationManager$prepareTransactions$2.I$1 = i3;
                realThreeDsAuthenticationManager$prepareTransactions$2.label = 3;
                access$getTransactionParameters = RealThreeDsAuthenticationManager.access$getTransactionParameters(realThreeDsAuthenticationManager2, realThreeDsAuthenticationManager$prepareTransactions$2);
                if (access$getTransactionParameters == coroutineSingletons) {
                    return coroutineSingletons;
                }
                realThreeDsAuthenticationManager3 = realThreeDsAuthenticationManager2;
                transactionParameters = (RealThreeDsAuthenticationManager.TransactionParameters) access$getTransactionParameters;
                if (transactionParameters != null) {
                }
            } else if (i7 == 3) {
                int i8 = realThreeDsAuthenticationManager$prepareTransactions$2.I$1;
                int i9 = realThreeDsAuthenticationManager$prepareTransactions$2.I$0;
                realThreeDsAuthenticationManager3 = realThreeDsAuthenticationManager$prepareTransactions$2.L$1;
                mutex = realThreeDsAuthenticationManager$prepareTransactions$2.L$0;
                SafeTrace.throwOnFailure(obj);
                i2 = i9;
                i3 = i8;
                access$getTransactionParameters = obj;
                transactionParameters = (RealThreeDsAuthenticationManager.TransactionParameters) access$getTransactionParameters;
                if (transactionParameters != null) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag("3DS-auth-manager");
                    forest3.e("Failed to get transaction parameters", new Object[0]);
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
                realThreeDsAuthenticationManager3.transactionAuthParams.clear();
                ArrayList arrayList = transactionParameters.instrumentInfo;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((RealThreeDsAuthenticationManager.TransactionParameters.InstrumentInfo) obj2).directoryServerId)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                transactionParameters2 = transactionParameters;
                i4 = i3;
                realThreeDsAuthenticationManager4 = realThreeDsAuthenticationManager3;
                it = it2;
                i5 = 0;
                mutex2 = mutex;
                i6 = i2;
                if (it.hasNext()) {
                }
            } else {
                if (i7 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = realThreeDsAuthenticationManager$prepareTransactions$2.I$2;
                int i11 = realThreeDsAuthenticationManager$prepareTransactions$2.I$1;
                int i12 = realThreeDsAuthenticationManager$prepareTransactions$2.I$0;
                RealThreeDsAuthenticationManager.TransactionParameters.InstrumentInfo instrumentInfo = realThreeDsAuthenticationManager$prepareTransactions$2.L$7;
                Iterator it3 = realThreeDsAuthenticationManager$prepareTransactions$2.L$5;
                RealThreeDsAuthenticationManager.TransactionParameters transactionParameters3 = realThreeDsAuthenticationManager$prepareTransactions$2.L$3;
                RealThreeDsAuthenticationManager realThreeDsAuthenticationManager5 = realThreeDsAuthenticationManager$prepareTransactions$2.L$1;
                Mutex mutex4 = realThreeDsAuthenticationManager$prepareTransactions$2.L$0;
                SafeTrace.throwOnFailure(obj);
                it = it3;
                transactionParameters2 = transactionParameters3;
                Mutex mutex5 = mutex4;
                i5 = i10;
                i6 = i12;
                realThreeDsAuthenticationManager4 = realThreeDsAuthenticationManager5;
                i4 = i11;
                Object createTransactionAuthenticationParams = obj;
                try {
                    try {
                        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) createTransactionAuthenticationParams;
                        if (transaction$AuthenticationRequestParameters != null) {
                            realThreeDsAuthenticationManager4.transactionAuthParams.put(instrumentInfo.directoryServerId, transaction$AuthenticationRequestParameters);
                        }
                        if (it.hasNext()) {
                            RealThreeDsAuthenticationManager.TransactionParameters.InstrumentInfo instrumentInfo2 = (RealThreeDsAuthenticationManager.TransactionParameters.InstrumentInfo) it.next();
                            String str = instrumentInfo2.directoryServerId;
                            String str2 = transactionParameters2.messageVersion;
                            String str3 = transactionParameters2.ipAddress;
                            realThreeDsAuthenticationManager$prepareTransactions$2.L$0 = mutex2;
                            realThreeDsAuthenticationManager$prepareTransactions$2.L$1 = realThreeDsAuthenticationManager4;
                            realThreeDsAuthenticationManager$prepareTransactions$2.L$3 = transactionParameters2;
                            realThreeDsAuthenticationManager$prepareTransactions$2.L$5 = it;
                            realThreeDsAuthenticationManager$prepareTransactions$2.L$7 = instrumentInfo2;
                            realThreeDsAuthenticationManager$prepareTransactions$2.I$0 = i6;
                            realThreeDsAuthenticationManager$prepareTransactions$2.I$1 = i4;
                            realThreeDsAuthenticationManager$prepareTransactions$2.I$2 = i5;
                            realThreeDsAuthenticationManager$prepareTransactions$2.label = 4;
                            mutex5 = mutex2;
                            createTransactionAuthenticationParams = realThreeDsAuthenticationManager4.createTransactionAuthenticationParams(str, str2, str3, null, realThreeDsAuthenticationManager$prepareTransactions$2);
                            if (createTransactionAuthenticationParams != coroutineSingletons) {
                                instrumentInfo = instrumentInfo2;
                                Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters2 = (Transaction$AuthenticationRequestParameters) createTransactionAuthenticationParams;
                                if (transaction$AuthenticationRequestParameters2 != null) {
                                }
                                realThreeDsAuthenticationManager$prepareTransactions$2 = this;
                                mutex2 = mutex5;
                                if (it.hasNext()) {
                                    mutex5 = mutex2;
                                    realThreeDsAuthenticationManager4.lastCreatedTimestamp = realThreeDsAuthenticationManager4.clock.elapsedRealtime();
                                    realThreeDsAuthenticationManager4.cacheInvalidated = false;
                                    Timber.Forest forest4 = Timber.Forest;
                                    forest4.tag("3DS-auth-manager");
                                    forest4.d("Transaction params created and timestamp updated", new Object[0]);
                                    mutex = mutex5;
                                    mutex.unlock(null);
                                    return Unit.INSTANCE;
                                }
                            }
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        th = th;
                        mutex5 = mutex2;
                        Mutex mutex6 = mutex5;
                        mutex6.unlock(null);
                        throw th;
                    }
                    realThreeDsAuthenticationManager$prepareTransactions$2 = this;
                    mutex2 = mutex5;
                } catch (Throwable th2) {
                    th = th2;
                    Mutex mutex62 = mutex5;
                    mutex62.unlock(null);
                    throw th;
                }
            }
            if (!realThreeDsAuthenticationManager.cacheInvalidated && !realThreeDsAuthenticationManager.transactionAuthParams.isEmpty()) {
                if (realThreeDsAuthenticationManager.clock.elapsedRealtime() - realThreeDsAuthenticationManager.lastCreatedTimestamp >= 1800000) {
                    z = false;
                }
                if (z) {
                    Timber.Forest forest5 = Timber.Forest;
                    forest5.tag("3DS-auth-manager");
                    forest5.d("Authentication params are still fresh, skipping prepareTransactions", new Object[0]);
                    Unit unit2 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit2;
                }
            }
            Timber.Forest forest6 = Timber.Forest;
            forest6.tag("3DS-auth-manager");
            forest6.d("Preparing 3DS transactions", new Object[0]);
            RealThreeDsService realThreeDsService = realThreeDsAuthenticationManager.threeDsService;
            realThreeDsAuthenticationManager$prepareTransactions$2.L$0 = mutex;
            realThreeDsAuthenticationManager$prepareTransactions$2.L$1 = realThreeDsAuthenticationManager;
            realThreeDsAuthenticationManager$prepareTransactions$2.I$0 = i;
            realThreeDsAuthenticationManager$prepareTransactions$2.I$1 = 0;
            realThreeDsAuthenticationManager$prepareTransactions$2.label = 2;
            awaitInternal = realThreeDsService.init.awaitInternal(realThreeDsAuthenticationManager$prepareTransactions$2);
            if (awaitInternal == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i;
            i3 = 0;
            realThreeDsAuthenticationManager2 = realThreeDsAuthenticationManager;
            initializationResult = (InitializationResult) awaitInternal;
            if (initializationResult instanceof InitializationResult.Success) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
