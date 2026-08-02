package com.withpersona.sdk2.inquiry.tracking;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0016\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0017\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "", "<init>", "()V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "events", "", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "stagingEvents", "isFlushing", "", "add", "", BreadcrumbHelper.Category.EVENT, "(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peekAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAll", "currentCount", "", "beginFlush", "onFlushFinished", "Companion", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile TrackingEventsCache INSTANCE;
    private boolean isFlushing;
    private final Mutex mutex = new MutexImpl();
    private final List<TrackingEvent> events = new ArrayList();
    private final List<TrackingEvent> stagingEvents = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x004a, B:13:0x004e, B:17:0x0056), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x004a, B:13:0x004e, B:17:0x0056), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object add(TrackingEvent trackingEvent, Continuation<? super Unit> continuation) {
        TrackingEventsCache$add$1 trackingEventsCache$add$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$add$1) {
                trackingEventsCache$add$1 = (TrackingEventsCache$add$1) continuation;
                int i2 = trackingEventsCache$add$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$add$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$add$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$add$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutex = this.mutex;
                        trackingEventsCache$add$1.L$0 = trackingEvent;
                        trackingEventsCache$add$1.L$1 = mutex;
                        trackingEventsCache$add$1.label = 1;
                        if (mutex.lock(trackingEventsCache$add$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Mutex mutex2 = (Mutex) trackingEventsCache$add$1.L$1;
                        TrackingEvent trackingEvent2 = (TrackingEvent) trackingEventsCache$add$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutex = mutex2;
                        trackingEvent = trackingEvent2;
                    }
                    if (this.isFlushing) {
                        this.events.add(trackingEvent);
                    } else {
                        this.stagingEvents.add(trackingEvent);
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (this.isFlushing) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        trackingEventsCache$add$1 = new TrackingEventsCache$add$1(this, continuation);
        Object obj2 = trackingEventsCache$add$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$add$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object beginFlush(Continuation<? super Unit> continuation) {
        TrackingEventsCache$beginFlush$1 trackingEventsCache$beginFlush$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$beginFlush$1) {
                trackingEventsCache$beginFlush$1 = (TrackingEventsCache$beginFlush$1) continuation;
                int i2 = trackingEventsCache$beginFlush$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$beginFlush$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$beginFlush$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$beginFlush$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$beginFlush$1.L$0 = mutex2;
                        trackingEventsCache$beginFlush$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$beginFlush$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$beginFlush$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.isFlushing = true;
                    return Unit.INSTANCE;
                }
            }
            this.isFlushing = true;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$beginFlush$1 = new TrackingEventsCache$beginFlush$1(this, continuation);
        Object obj2 = trackingEventsCache$beginFlush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$beginFlush$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object currentCount(Continuation<? super Integer> continuation) {
        TrackingEventsCache$currentCount$1 trackingEventsCache$currentCount$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$currentCount$1) {
                trackingEventsCache$currentCount$1 = (TrackingEventsCache$currentCount$1) continuation;
                int i2 = trackingEventsCache$currentCount$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$currentCount$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$currentCount$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$currentCount$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$currentCount$1.L$0 = mutex2;
                        trackingEventsCache$currentCount$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$currentCount$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$currentCount$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return new Integer(this.events.size());
                }
            }
            return new Integer(this.events.size());
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$currentCount$1 = new TrackingEventsCache$currentCount$1(this, continuation);
        Object obj2 = trackingEventsCache$currentCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$currentCount$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isFlushing(Continuation<? super Boolean> continuation) {
        TrackingEventsCache$isFlushing$1 trackingEventsCache$isFlushing$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$isFlushing$1) {
                trackingEventsCache$isFlushing$1 = (TrackingEventsCache$isFlushing$1) continuation;
                int i2 = trackingEventsCache$isFlushing$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$isFlushing$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$isFlushing$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$isFlushing$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$isFlushing$1.L$0 = mutex2;
                        trackingEventsCache$isFlushing$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$isFlushing$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$isFlushing$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Boolean.valueOf(this.isFlushing);
                }
            }
            return Boolean.valueOf(this.isFlushing);
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$isFlushing$1 = new TrackingEventsCache$isFlushing$1(this, continuation);
        Object obj2 = trackingEventsCache$isFlushing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$isFlushing$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onFlushFinished(Continuation<? super Unit> continuation) {
        TrackingEventsCache$onFlushFinished$1 trackingEventsCache$onFlushFinished$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$onFlushFinished$1) {
                trackingEventsCache$onFlushFinished$1 = (TrackingEventsCache$onFlushFinished$1) continuation;
                int i2 = trackingEventsCache$onFlushFinished$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$onFlushFinished$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$onFlushFinished$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$onFlushFinished$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$onFlushFinished$1.L$0 = mutex2;
                        trackingEventsCache$onFlushFinished$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$onFlushFinished$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$onFlushFinished$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.events.clear();
                    this.events.addAll(this.stagingEvents);
                    this.stagingEvents.clear();
                    this.isFlushing = false;
                    return Unit.INSTANCE;
                }
            }
            this.events.clear();
            this.events.addAll(this.stagingEvents);
            this.stagingEvents.clear();
            this.isFlushing = false;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$onFlushFinished$1 = new TrackingEventsCache$onFlushFinished$1(this, continuation);
        Object obj2 = trackingEventsCache$onFlushFinished$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$onFlushFinished$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object peekAll(Continuation<? super List<? extends TrackingEvent>> continuation) {
        TrackingEventsCache$peekAll$1 trackingEventsCache$peekAll$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$peekAll$1) {
                trackingEventsCache$peekAll$1 = (TrackingEventsCache$peekAll$1) continuation;
                int i2 = trackingEventsCache$peekAll$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$peekAll$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$peekAll$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$peekAll$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$peekAll$1.L$0 = mutex2;
                        trackingEventsCache$peekAll$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$peekAll$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$peekAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return CollectionsKt.toList(this.events);
                }
            }
            return CollectionsKt.toList(this.events);
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$peekAll$1 = new TrackingEventsCache$peekAll$1(this, continuation);
        Object obj2 = trackingEventsCache$peekAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$peekAll$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeAll(Continuation<? super List<? extends TrackingEvent>> continuation) {
        TrackingEventsCache$removeAll$1 trackingEventsCache$removeAll$1;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof TrackingEventsCache$removeAll$1) {
                trackingEventsCache$removeAll$1 = (TrackingEventsCache$removeAll$1) continuation;
                int i2 = trackingEventsCache$removeAll$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsCache$removeAll$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsCache$removeAll$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsCache$removeAll$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        trackingEventsCache$removeAll$1.L$0 = mutex2;
                        trackingEventsCache$removeAll$1.label = 1;
                        if (mutex2.lock(trackingEventsCache$removeAll$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) trackingEventsCache$removeAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    List list = CollectionsKt.toList(this.events);
                    this.events.clear();
                    return list;
                }
            }
            List list2 = CollectionsKt.toList(this.events);
            this.events.clear();
            return list2;
        } finally {
            mutex.unlock(null);
        }
        trackingEventsCache$removeAll$1 = new TrackingEventsCache$removeAll$1(this, continuation);
        Object obj2 = trackingEventsCache$removeAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsCache$removeAll$1.label;
        if (i != 0) {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "setInstance", "", "cache", "getInstance", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrackingEventsCache getInstance() {
            return TrackingEventsCache.INSTANCE;
        }

        public final void setInstance(TrackingEventsCache cache) {
            cache.getClass();
            TrackingEventsCache.INSTANCE = cache;
        }

        private Companion() {
        }
    }
}
