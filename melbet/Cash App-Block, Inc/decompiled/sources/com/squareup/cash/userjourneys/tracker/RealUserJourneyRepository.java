package com.squareup.cash.userjourneys.tracker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource;
import com.squareup.cash.userjourneys.data.UserJourney;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealUserJourneyRepository {
    public final DiskUserJourneyDataSource activeDataSource;
    public final DiskUserJourneyDataSource completedDataSource;
    public final MutexImpl activeDataSourceLock = new MutexImpl();
    public final MutexImpl completedDataSourceLock = new MutexImpl();
    public Set activeDataSourceCache = EmptySet.INSTANCE;

    public RealUserJourneyRepository(DiskUserJourneyDataSource diskUserJourneyDataSource, DiskUserJourneyDataSource diskUserJourneyDataSource2) {
        this.activeDataSource = diskUserJourneyDataSource;
        this.completedDataSource = diskUserJourneyDataSource2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r8.lock(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCompletedUserJourneys(ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$getCompletedUserJourneys$1 realUserJourneyRepository$getCompletedUserJourneys$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        Mutex mutex;
        Object fetch;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$getCompletedUserJourneys$1) {
                realUserJourneyRepository$getCompletedUserJourneys$1 = (RealUserJourneyRepository$getCompletedUserJourneys$1) continuationImpl;
                int i3 = realUserJourneyRepository$getCompletedUserJourneys$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$getCompletedUserJourneys$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$getCompletedUserJourneys$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$getCompletedUserJourneys$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.completedDataSourceLock;
                        realUserJourneyRepository$getCompletedUserJourneys$1.L$0 = mutexImpl;
                        i2 = 0;
                        realUserJourneyRepository$getCompletedUserJourneys$1.I$0 = 0;
                        realUserJourneyRepository$getCompletedUserJourneys$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realUserJourneyRepository$getCompletedUserJourneys$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i2 = realUserJourneyRepository$getCompletedUserJourneys$1.I$0;
                        ?? r4 = realUserJourneyRepository$getCompletedUserJourneys$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r4;
                    }
                    DiskUserJourneyDataSource diskUserJourneyDataSource = this.completedDataSource;
                    realUserJourneyRepository$getCompletedUserJourneys$1.L$0 = mutexImpl;
                    realUserJourneyRepository$getCompletedUserJourneys$1.I$0 = i2;
                    realUserJourneyRepository$getCompletedUserJourneys$1.label = 2;
                    fetch = diskUserJourneyDataSource.fetch(realUserJourneyRepository$getCompletedUserJourneys$1);
                    if (fetch != coroutineSingletons) {
                        MutexImpl mutexImpl2 = mutexImpl;
                        obj = fetch;
                        mutex = mutexImpl2;
                        mutex.unlock(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            DiskUserJourneyDataSource diskUserJourneyDataSource2 = this.completedDataSource;
            realUserJourneyRepository$getCompletedUserJourneys$1.L$0 = mutexImpl;
            realUserJourneyRepository$getCompletedUserJourneys$1.I$0 = i2;
            realUserJourneyRepository$getCompletedUserJourneys$1.label = 2;
            fetch = diskUserJourneyDataSource2.fetch(realUserJourneyRepository$getCompletedUserJourneys$1);
            if (fetch != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            MutexImpl mutexImpl3 = mutexImpl;
            th = th3;
            mutex = mutexImpl3;
            mutex.unlock(null);
            throw th;
        }
        realUserJourneyRepository$getCompletedUserJourneys$1 = new RealUserJourneyRepository$getCompletedUserJourneys$1(this, continuationImpl);
        Object obj2 = realUserJourneyRepository$getCompletedUserJourneys$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$getCompletedUserJourneys$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x0046, B:13:0x004f, B:16:0x0078, B:21:0x005c, B:22:0x0060, B:24:0x0066), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object journeyExists(JourneySelector$$ExternalSyntheticLambda0 journeySelector$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$journeyExists$1 realUserJourneyRepository$journeyExists$1;
        int i;
        JourneySelector$$ExternalSyntheticLambda0 journeySelector$$ExternalSyntheticLambda02;
        MutexImpl mutexImpl;
        Set set;
        Iterator it;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$journeyExists$1) {
                realUserJourneyRepository$journeyExists$1 = (RealUserJourneyRepository$journeyExists$1) continuationImpl;
                int i2 = realUserJourneyRepository$journeyExists$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$journeyExists$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$journeyExists$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$journeyExists$1.label;
                    boolean z = true;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$journeyExists$1.L$0 = journeySelector$$ExternalSyntheticLambda0;
                        MutexImpl mutexImpl2 = this.activeDataSourceLock;
                        realUserJourneyRepository$journeyExists$1.L$1 = mutexImpl2;
                        realUserJourneyRepository$journeyExists$1.label = 1;
                        if (mutexImpl2.lock(realUserJourneyRepository$journeyExists$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        journeySelector$$ExternalSyntheticLambda02 = journeySelector$$ExternalSyntheticLambda0;
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = realUserJourneyRepository$journeyExists$1.L$1;
                        journeySelector$$ExternalSyntheticLambda02 = realUserJourneyRepository$journeyExists$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    set = this.activeDataSourceCache;
                    if ((set instanceof Collection) || !set.isEmpty()) {
                        it = set.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) journeySelector$$ExternalSyntheticLambda02.invoke((UserJourney) it.next())).booleanValue()) {
                                break;
                            }
                        }
                    }
                    z = false;
                    Boolean valueOf = Boolean.valueOf(z);
                    mutexImpl.unlock(null);
                    return valueOf;
                }
            }
            set = this.activeDataSourceCache;
            if (set instanceof Collection) {
            }
            it = set.iterator();
            while (it.hasNext()) {
            }
            z = false;
            Boolean valueOf2 = Boolean.valueOf(z);
            mutexImpl.unlock(null);
            return valueOf2;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        realUserJourneyRepository$journeyExists$1 = new RealUserJourneyRepository$journeyExists$1(this, continuationImpl);
        Object obj2 = realUserJourneyRepository$journeyExists$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$journeyExists$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource.persist$suspendImpl(r3, r14, r0) == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[Catch: all -> 0x0034, LOOP:0: B:27:0x00a2->B:29:0x00a8, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:23:0x0088, B:26:0x0099, B:27:0x00a2, B:29:0x00a8, B:31:0x00bb, B:32:0x00c8, B:34:0x00ce, B:37:0x00ea, B:42:0x00f6, B:44:0x0103, B:53:0x0076), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:23:0x0088, B:26:0x0099, B:27:0x00a2, B:29:0x00a8, B:31:0x00bb, B:32:0x00c8, B:34:0x00ce, B:37:0x00ea, B:42:0x00f6, B:44:0x0103, B:53:0x0076), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:23:0x0088, B:26:0x0099, B:27:0x00a2, B:29:0x00a8, B:31:0x00bb, B:32:0x00c8, B:34:0x00ce, B:37:0x00ea, B:42:0x00f6, B:44:0x0103, B:53:0x0076), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeCompletedUserJourney(Function1 function1, ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$removeCompletedUserJourney$1 realUserJourneyRepository$removeCompletedUserJourney$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Mutex mutex;
        Function1 function12;
        int i2;
        int mapCapacity;
        Set keySet;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$removeCompletedUserJourney$1) {
                realUserJourneyRepository$removeCompletedUserJourney$1 = (RealUserJourneyRepository$removeCompletedUserJourney$1) continuationImpl;
                int i3 = realUserJourneyRepository$removeCompletedUserJourney$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$removeCompletedUserJourney$1.label = i3 - PKIFailureInfo.systemUnavail;
                    obj = realUserJourneyRepository$removeCompletedUserJourney$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$removeCompletedUserJourney$1.label;
                    DiskUserJourneyDataSource diskUserJourneyDataSource = this.completedDataSource;
                    int i4 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$removeCompletedUserJourney$1.L$0 = function1;
                        mutex = this.completedDataSourceLock;
                        realUserJourneyRepository$removeCompletedUserJourney$1.L$1 = mutex;
                        realUserJourneyRepository$removeCompletedUserJourney$1.I$0 = 0;
                        realUserJourneyRepository$removeCompletedUserJourney$1.label = 1;
                        if (mutex.lock(realUserJourneyRepository$removeCompletedUserJourney$1) != coroutineSingletons) {
                            function12 = function1;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realUserJourneyRepository$removeCompletedUserJourney$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        i4 = realUserJourneyRepository$removeCompletedUserJourney$1.I$1;
                        int i5 = realUserJourneyRepository$removeCompletedUserJourney$1.I$0;
                        Mutex mutex2 = realUserJourneyRepository$removeCompletedUserJourney$1.L$1;
                        function12 = realUserJourneyRepository$removeCompletedUserJourney$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            i2 = i5;
                            mutex = mutex2;
                            Iterable iterable = (Iterable) obj;
                            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj2 : iterable) {
                                linkedHashMap.put(((CompletedJourney) obj2).getJourney().getId(), obj2);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((Boolean) function12.invoke(((CompletedJourney) entry.getValue()).getJourney())).booleanValue()) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            keySet = linkedHashMap2.keySet();
                            if (!keySet.isEmpty()) {
                                Set set = CollectionsKt.toSet(MapsKt__MapsKt.minus((Map) linkedHashMap, (Iterable) keySet).values());
                                realUserJourneyRepository$removeCompletedUserJourney$1.L$0 = null;
                                realUserJourneyRepository$removeCompletedUserJourney$1.L$1 = mutex;
                                realUserJourneyRepository$removeCompletedUserJourney$1.I$0 = i2;
                                realUserJourneyRepository$removeCompletedUserJourney$1.I$1 = i4;
                                realUserJourneyRepository$removeCompletedUserJourney$1.label = 3;
                            }
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            this = mutex2;
                            this.unlock(null);
                            throw th;
                        }
                    }
                    int i6 = realUserJourneyRepository$removeCompletedUserJourney$1.I$0;
                    Mutex mutex3 = realUserJourneyRepository$removeCompletedUserJourney$1.L$1;
                    function12 = realUserJourneyRepository$removeCompletedUserJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i6;
                    mutex = mutex3;
                    realUserJourneyRepository$removeCompletedUserJourney$1.L$0 = function12;
                    realUserJourneyRepository$removeCompletedUserJourney$1.L$1 = mutex;
                    realUserJourneyRepository$removeCompletedUserJourney$1.I$0 = i2;
                    realUserJourneyRepository$removeCompletedUserJourney$1.I$1 = 0;
                    realUserJourneyRepository$removeCompletedUserJourney$1.label = 2;
                    obj = diskUserJourneyDataSource.fetch(realUserJourneyRepository$removeCompletedUserJourney$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Iterable iterable2 = (Iterable) obj;
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    if (mapCapacity < 16) {
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                    while (r14.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    while (r6.hasNext()) {
                    }
                    keySet = linkedHashMap22.keySet();
                    if (!keySet.isEmpty()) {
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            realUserJourneyRepository$removeCompletedUserJourney$1.L$0 = function12;
            realUserJourneyRepository$removeCompletedUserJourney$1.L$1 = mutex;
            realUserJourneyRepository$removeCompletedUserJourney$1.I$0 = i2;
            realUserJourneyRepository$removeCompletedUserJourney$1.I$1 = 0;
            realUserJourneyRepository$removeCompletedUserJourney$1.label = 2;
            obj = diskUserJourneyDataSource.fetch(realUserJourneyRepository$removeCompletedUserJourney$1);
            if (obj == coroutineSingletons) {
            }
            Iterable iterable22 = (Iterable) obj;
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable22, 10));
            if (mapCapacity < 16) {
            }
            LinkedHashMap linkedHashMap32 = new LinkedHashMap(mapCapacity);
            while (r14.hasNext()) {
            }
            LinkedHashMap linkedHashMap222 = new LinkedHashMap();
            while (r6.hasNext()) {
            }
            keySet = linkedHashMap222.keySet();
            if (!keySet.isEmpty()) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
        }
        realUserJourneyRepository$removeCompletedUserJourney$1 = new RealUserJourneyRepository$removeCompletedUserJourney$1(this, continuationImpl);
        obj = realUserJourneyRepository$removeCompletedUserJourney$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$removeCompletedUserJourney$1.label;
        DiskUserJourneyDataSource diskUserJourneyDataSource2 = this.completedDataSource;
        int i42 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        if (r12.lock(r0) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: all -> 0x008d, LOOP:0: B:30:0x0078->B:32:0x007e, LOOP_END, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x005c, B:29:0x006f, B:30:0x0078, B:32:0x007e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:40:0x00ba, B:45:0x00c6, B:47:0x00cc), top: B:25:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: all -> 0x008d, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x005c, B:29:0x006f, B:30:0x0078, B:32:0x007e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:40:0x00ba, B:45:0x00c6, B:47:0x00cc), top: B:25:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x005c, B:29:0x006f, B:30:0x0078, B:32:0x007e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:40:0x00ba, B:45:0x00c6, B:47:0x00cc), top: B:25:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeJourneys(Function1 function1, ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$removeJourneys$1 realUserJourneyRepository$removeJourneys$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        int mapCapacity;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$removeJourneys$1) {
                realUserJourneyRepository$removeJourneys$1 = (RealUserJourneyRepository$removeJourneys$1) continuationImpl;
                int i3 = realUserJourneyRepository$removeJourneys$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$removeJourneys$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$removeJourneys$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$removeJourneys$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$removeJourneys$1.L$0 = function1;
                        mutexImpl = this.activeDataSourceLock;
                        realUserJourneyRepository$removeJourneys$1.L$1 = mutexImpl;
                        i2 = 0;
                        realUserJourneyRepository$removeJourneys$1.I$0 = 0;
                        realUserJourneyRepository$removeJourneys$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            linkedHashMap2 = realUserJourneyRepository$removeJourneys$1.L$2;
                            mutex = realUserJourneyRepository$removeJourneys$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                linkedHashMap = linkedHashMap2;
                                Set set = CollectionsKt.toSet(linkedHashMap.values());
                                mutex.unlock(null);
                                return set;
                            } catch (Throwable th) {
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realUserJourneyRepository$removeJourneys$1.I$0;
                        ?? r2 = realUserJourneyRepository$removeJourneys$1.L$1;
                        Function1 function12 = realUserJourneyRepository$removeJourneys$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r2;
                        i2 = i4;
                        function1 = function12;
                    }
                    Set set2 = this.activeDataSourceCache;
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : set2) {
                        linkedHashMap3.put(((UserJourney) obj2).getId(), obj2);
                    }
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        if (((Boolean) function1.invoke(entry.getValue())).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        mutex = mutexImpl;
                        Set set3 = CollectionsKt.toSet(linkedHashMap.values());
                        mutex.unlock(null);
                        return set3;
                    }
                    Set set4 = CollectionsKt.toSet(MapsKt__MapsKt.minus((Map) linkedHashMap3, (Iterable) linkedHashMap.keySet()).values());
                    realUserJourneyRepository$removeJourneys$1.L$0 = null;
                    realUserJourneyRepository$removeJourneys$1.L$1 = mutexImpl;
                    realUserJourneyRepository$removeJourneys$1.L$2 = linkedHashMap;
                    realUserJourneyRepository$removeJourneys$1.I$0 = i2;
                    realUserJourneyRepository$removeJourneys$1.label = 2;
                    if (updateActive(set4, realUserJourneyRepository$removeJourneys$1) != coroutineSingletons) {
                        mutex = mutexImpl;
                        linkedHashMap2 = linkedHashMap;
                        linkedHashMap = linkedHashMap2;
                        Set set32 = CollectionsKt.toSet(linkedHashMap.values());
                        mutex.unlock(null);
                        return set32;
                    }
                    return coroutineSingletons;
                }
            }
            Set set22 = this.activeDataSourceCache;
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set22, 10));
            if (mapCapacity < 16) {
            }
            LinkedHashMap linkedHashMap32 = new LinkedHashMap(mapCapacity);
            while (r4.hasNext()) {
            }
            linkedHashMap = new LinkedHashMap();
            while (r6.hasNext()) {
            }
            if (!linkedHashMap.isEmpty()) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realUserJourneyRepository$removeJourneys$1 = new RealUserJourneyRepository$removeJourneys$1(this, continuationImpl);
        Object obj3 = realUserJourneyRepository$removeJourneys$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$removeJourneys$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeStaleJourneys(ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$removeStaleJourneys$1 realUserJourneyRepository$removeStaleJourneys$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        Object fetch;
        Mutex mutex2;
        EmptySet emptySet;
        Set set;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$removeStaleJourneys$1) {
                realUserJourneyRepository$removeStaleJourneys$1 = (RealUserJourneyRepository$removeStaleJourneys$1) continuationImpl;
                int i3 = realUserJourneyRepository$removeStaleJourneys$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$removeStaleJourneys$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$removeStaleJourneys$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$removeStaleJourneys$1.label;
                    int i4 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.activeDataSourceLock;
                        realUserJourneyRepository$removeStaleJourneys$1.L$0 = mutexImpl;
                        realUserJourneyRepository$removeStaleJourneys$1.I$0 = 0;
                        realUserJourneyRepository$removeStaleJourneys$1.label = 1;
                        if (mutexImpl.lock(realUserJourneyRepository$removeStaleJourneys$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            set = realUserJourneyRepository$removeStaleJourneys$1.L$1;
                            mutex = realUserJourneyRepository$removeStaleJourneys$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return set;
                            } catch (Throwable th) {
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i4 = realUserJourneyRepository$removeStaleJourneys$1.I$1;
                        i2 = realUserJourneyRepository$removeStaleJourneys$1.I$0;
                        mutex2 = realUserJourneyRepository$removeStaleJourneys$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            Set set2 = (Set) obj;
                            emptySet = EmptySet.INSTANCE;
                            realUserJourneyRepository$removeStaleJourneys$1.L$0 = mutex2;
                            realUserJourneyRepository$removeStaleJourneys$1.L$1 = set2;
                            realUserJourneyRepository$removeStaleJourneys$1.I$0 = i2;
                            realUserJourneyRepository$removeStaleJourneys$1.I$1 = i4;
                            realUserJourneyRepository$removeStaleJourneys$1.label = 3;
                            if (updateActive(emptySet, realUserJourneyRepository$removeStaleJourneys$1) != coroutineSingletons) {
                                set = set2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return set;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = realUserJourneyRepository$removeStaleJourneys$1.I$0;
                    ?? r6 = realUserJourneyRepository$removeStaleJourneys$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = r6;
                    DiskUserJourneyDataSource diskUserJourneyDataSource = this.activeDataSource;
                    realUserJourneyRepository$removeStaleJourneys$1.L$0 = mutexImpl;
                    realUserJourneyRepository$removeStaleJourneys$1.I$0 = i2;
                    realUserJourneyRepository$removeStaleJourneys$1.I$1 = 0;
                    realUserJourneyRepository$removeStaleJourneys$1.label = 2;
                    fetch = diskUserJourneyDataSource.fetch(realUserJourneyRepository$removeStaleJourneys$1);
                    if (fetch != coroutineSingletons) {
                        mutex2 = mutexImpl;
                        obj = fetch;
                        Set set22 = (Set) obj;
                        emptySet = EmptySet.INSTANCE;
                        realUserJourneyRepository$removeStaleJourneys$1.L$0 = mutex2;
                        realUserJourneyRepository$removeStaleJourneys$1.L$1 = set22;
                        realUserJourneyRepository$removeStaleJourneys$1.I$0 = i2;
                        realUserJourneyRepository$removeStaleJourneys$1.I$1 = i4;
                        realUserJourneyRepository$removeStaleJourneys$1.label = 3;
                        if (updateActive(emptySet, realUserJourneyRepository$removeStaleJourneys$1) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            DiskUserJourneyDataSource diskUserJourneyDataSource2 = this.activeDataSource;
            realUserJourneyRepository$removeStaleJourneys$1.L$0 = mutexImpl;
            realUserJourneyRepository$removeStaleJourneys$1.I$0 = i2;
            realUserJourneyRepository$removeStaleJourneys$1.I$1 = 0;
            realUserJourneyRepository$removeStaleJourneys$1.label = 2;
            fetch = diskUserJourneyDataSource2.fetch(realUserJourneyRepository$removeStaleJourneys$1);
            if (fetch != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realUserJourneyRepository$removeStaleJourneys$1 = new RealUserJourneyRepository$removeStaleJourneys$1(this, continuationImpl);
        Object obj2 = realUserJourneyRepository$removeStaleJourneys$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$removeStaleJourneys$1.label;
        int i42 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource.persist$suspendImpl(r3, r12, r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object storeCompletedUserJourney(CompletedJourney completedJourney, ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$storeCompletedUserJourney$1 realUserJourneyRepository$storeCompletedUserJourney$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Mutex mutex;
        CompletedJourney completedJourney2;
        int i2;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$storeCompletedUserJourney$1) {
                realUserJourneyRepository$storeCompletedUserJourney$1 = (RealUserJourneyRepository$storeCompletedUserJourney$1) continuationImpl;
                int i3 = realUserJourneyRepository$storeCompletedUserJourney$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$storeCompletedUserJourney$1.label = i3 - PKIFailureInfo.systemUnavail;
                    obj = realUserJourneyRepository$storeCompletedUserJourney$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$storeCompletedUserJourney$1.label;
                    DiskUserJourneyDataSource diskUserJourneyDataSource = this.completedDataSource;
                    int i4 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = completedJourney;
                        mutex = this.completedDataSourceLock;
                        realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
                        realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = 0;
                        realUserJourneyRepository$storeCompletedUserJourney$1.label = 1;
                        if (mutex.lock(realUserJourneyRepository$storeCompletedUserJourney$1) != coroutineSingletons) {
                            completedJourney2 = completedJourney;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        int i5 = realUserJourneyRepository$storeCompletedUserJourney$1.I$0;
                        Mutex mutex2 = realUserJourneyRepository$storeCompletedUserJourney$1.L$1;
                        completedJourney2 = realUserJourneyRepository$storeCompletedUserJourney$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i2 = i5;
                        mutex = mutex2;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realUserJourneyRepository$storeCompletedUserJourney$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        i4 = realUserJourneyRepository$storeCompletedUserJourney$1.I$1;
                        int i6 = realUserJourneyRepository$storeCompletedUserJourney$1.I$0;
                        Mutex mutex3 = realUserJourneyRepository$storeCompletedUserJourney$1.L$1;
                        completedJourney2 = realUserJourneyRepository$storeCompletedUserJourney$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            i2 = i6;
                            mutex = mutex3;
                            LinkedHashSet plus = SetsKt___SetsKt.plus((Set) obj, completedJourney2);
                            realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = null;
                            realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
                            realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = i2;
                            realUserJourneyRepository$storeCompletedUserJourney$1.I$1 = i4;
                            realUserJourneyRepository$storeCompletedUserJourney$1.label = 3;
                        } catch (Throwable th) {
                            th = th;
                            this = mutex3;
                            this.unlock(null);
                            throw th;
                        }
                    }
                    realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = completedJourney2;
                    realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
                    realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = i2;
                    realUserJourneyRepository$storeCompletedUserJourney$1.I$1 = 0;
                    realUserJourneyRepository$storeCompletedUserJourney$1.label = 2;
                    obj = diskUserJourneyDataSource.fetch(realUserJourneyRepository$storeCompletedUserJourney$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashSet plus2 = SetsKt___SetsKt.plus((Set) obj, completedJourney2);
                    realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = null;
                    realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
                    realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = i2;
                    realUserJourneyRepository$storeCompletedUserJourney$1.I$1 = i4;
                    realUserJourneyRepository$storeCompletedUserJourney$1.label = 3;
                }
            }
            if (i != 0) {
            }
            realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = completedJourney2;
            realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
            realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = i2;
            realUserJourneyRepository$storeCompletedUserJourney$1.I$1 = 0;
            realUserJourneyRepository$storeCompletedUserJourney$1.label = 2;
            obj = diskUserJourneyDataSource.fetch(realUserJourneyRepository$storeCompletedUserJourney$1);
            if (obj == coroutineSingletons) {
            }
            LinkedHashSet plus22 = SetsKt___SetsKt.plus((Set) obj, completedJourney2);
            realUserJourneyRepository$storeCompletedUserJourney$1.L$0 = null;
            realUserJourneyRepository$storeCompletedUserJourney$1.L$1 = mutex;
            realUserJourneyRepository$storeCompletedUserJourney$1.I$0 = i2;
            realUserJourneyRepository$storeCompletedUserJourney$1.I$1 = i4;
            realUserJourneyRepository$storeCompletedUserJourney$1.label = 3;
        } catch (Throwable th2) {
            th = th2;
        }
        realUserJourneyRepository$storeCompletedUserJourney$1 = new RealUserJourneyRepository$storeCompletedUserJourney$1(this, continuationImpl);
        obj = realUserJourneyRepository$storeCompletedUserJourney$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$storeCompletedUserJourney$1.label;
        DiskUserJourneyDataSource diskUserJourneyDataSource2 = this.completedDataSource;
        int i42 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r8.lock(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object storeUserJourney(UserJourney userJourney, ContinuationImpl continuationImpl) {
        RealUserJourneyRepository$storeUserJourney$1 realUserJourneyRepository$storeUserJourney$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        LinkedHashSet plus;
        try {
            if (continuationImpl instanceof RealUserJourneyRepository$storeUserJourney$1) {
                realUserJourneyRepository$storeUserJourney$1 = (RealUserJourneyRepository$storeUserJourney$1) continuationImpl;
                int i3 = realUserJourneyRepository$storeUserJourney$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$storeUserJourney$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$storeUserJourney$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$storeUserJourney$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$storeUserJourney$1.L$0 = userJourney;
                        mutexImpl = this.activeDataSourceLock;
                        realUserJourneyRepository$storeUserJourney$1.L$1 = mutexImpl;
                        i2 = 0;
                        realUserJourneyRepository$storeUserJourney$1.I$0 = 0;
                        realUserJourneyRepository$storeUserJourney$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realUserJourneyRepository$storeUserJourney$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realUserJourneyRepository$storeUserJourney$1.I$0;
                        ?? r2 = realUserJourneyRepository$storeUserJourney$1.L$1;
                        UserJourney userJourney2 = realUserJourneyRepository$storeUserJourney$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r2;
                        i2 = i4;
                        userJourney = userJourney2;
                    }
                    plus = SetsKt___SetsKt.plus(this.activeDataSourceCache, userJourney);
                    realUserJourneyRepository$storeUserJourney$1.L$0 = null;
                    realUserJourneyRepository$storeUserJourney$1.L$1 = mutexImpl;
                    realUserJourneyRepository$storeUserJourney$1.I$0 = i2;
                    realUserJourneyRepository$storeUserJourney$1.label = 2;
                    if (updateActive(plus, realUserJourneyRepository$storeUserJourney$1) != coroutineSingletons) {
                        mutex = mutexImpl;
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
            }
            plus = SetsKt___SetsKt.plus(this.activeDataSourceCache, userJourney);
            realUserJourneyRepository$storeUserJourney$1.L$0 = null;
            realUserJourneyRepository$storeUserJourney$1.L$1 = mutexImpl;
            realUserJourneyRepository$storeUserJourney$1.I$0 = i2;
            realUserJourneyRepository$storeUserJourney$1.label = 2;
            if (updateActive(plus, realUserJourneyRepository$storeUserJourney$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realUserJourneyRepository$storeUserJourney$1 = new RealUserJourneyRepository$storeUserJourney$1(this, continuationImpl);
        Object obj2 = realUserJourneyRepository$storeUserJourney$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$storeUserJourney$1.label;
        if (i != 0) {
        }
    }

    public final Object updateActive(Set set, ContinuationImpl continuationImpl) {
        this.activeDataSourceCache = set;
        Object persist$suspendImpl = DiskUserJourneyDataSource.persist$suspendImpl(this.activeDataSource, set, continuationImpl);
        return persist$suspendImpl == CoroutineSingletons.COROUTINE_SUSPENDED ? persist$suspendImpl : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:25:0x0060, B:26:0x0078, B:28:0x007e, B:30:0x0090, B:32:0x009f, B:35:0x00a3, B:37:0x00ab), top: B:24:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:25:0x0060, B:26:0x0078, B:28:0x007e, B:30:0x0090, B:32:0x009f, B:35:0x00a3, B:37:0x00ab), top: B:24:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateUserJourney(Function1 function1, Function1 function12, Continuation continuation) {
        RealUserJourneyRepository$updateUserJourney$1 realUserJourneyRepository$updateUserJourney$1;
        int i;
        int i2;
        Function1 function13;
        Mutex mutex;
        Mutex mutex2;
        Ref$BooleanRef ref$BooleanRef;
        try {
            if (continuation instanceof RealUserJourneyRepository$updateUserJourney$1) {
                realUserJourneyRepository$updateUserJourney$1 = (RealUserJourneyRepository$updateUserJourney$1) continuation;
                int i3 = realUserJourneyRepository$updateUserJourney$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realUserJourneyRepository$updateUserJourney$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realUserJourneyRepository$updateUserJourney$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realUserJourneyRepository$updateUserJourney$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realUserJourneyRepository$updateUserJourney$1.L$0 = function1;
                        realUserJourneyRepository$updateUserJourney$1.L$1 = function12;
                        MutexImpl mutexImpl = this.activeDataSourceLock;
                        realUserJourneyRepository$updateUserJourney$1.L$2 = mutexImpl;
                        i2 = 0;
                        realUserJourneyRepository$updateUserJourney$1.I$0 = 0;
                        realUserJourneyRepository$updateUserJourney$1.label = 1;
                        if (mutexImpl.lock(realUserJourneyRepository$updateUserJourney$1) != obj2) {
                            function13 = function12;
                            mutex = mutexImpl;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = realUserJourneyRepository$updateUserJourney$1.L$2;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex = mutex2;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    int i4 = realUserJourneyRepository$updateUserJourney$1.I$0;
                    mutex = realUserJourneyRepository$updateUserJourney$1.L$2;
                    Function1 function14 = realUserJourneyRepository$updateUserJourney$1.L$1;
                    Function1 function15 = realUserJourneyRepository$updateUserJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function13 = function14;
                    i2 = i4;
                    function1 = function15;
                    ref$BooleanRef = new Ref$BooleanRef();
                    Set<UserJourney> set = this.activeDataSourceCache;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                    for (UserJourney userJourney : set) {
                        if (((Boolean) function1.invoke(userJourney)).booleanValue()) {
                            Object invoke = function13.invoke(userJourney);
                            ref$BooleanRef.element = true;
                            userJourney = (UserJourney) invoke;
                        }
                        arrayList.add(userJourney);
                    }
                    Set set2 = CollectionsKt.toSet(arrayList);
                    if (ref$BooleanRef.element) {
                        realUserJourneyRepository$updateUserJourney$1.L$0 = null;
                        realUserJourneyRepository$updateUserJourney$1.L$1 = null;
                        realUserJourneyRepository$updateUserJourney$1.L$2 = mutex;
                        realUserJourneyRepository$updateUserJourney$1.I$0 = i2;
                        realUserJourneyRepository$updateUserJourney$1.label = 2;
                        if (updateActive(set2, realUserJourneyRepository$updateUserJourney$1) != obj2) {
                            mutex2 = mutex;
                            mutex = mutex2;
                        }
                        return obj2;
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            ref$BooleanRef = new Ref$BooleanRef();
            Set<UserJourney> set3 = this.activeDataSourceCache;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
            while (r7.hasNext()) {
            }
            Set set22 = CollectionsKt.toSet(arrayList2);
            if (ref$BooleanRef.element) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        realUserJourneyRepository$updateUserJourney$1 = new RealUserJourneyRepository$updateUserJourney$1(this, continuation);
        Object obj3 = realUserJourneyRepository$updateUserJourney$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyRepository$updateUserJourney$1.label;
        if (i != 0) {
        }
    }
}
