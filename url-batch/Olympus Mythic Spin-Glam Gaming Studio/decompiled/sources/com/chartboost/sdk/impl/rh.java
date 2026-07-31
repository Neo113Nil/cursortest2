package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.o7;
import com.chartboost.sdk.impl.xd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public final class rh implements xd.a {
    public final sh a;
    public final xd b;
    public final CoroutineDispatcher c;
    public final long d;
    public final int e;
    public final hi f;
    public final int g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentHashMap.KeySetView i;
    public final Set j;
    public final Mutex k;
    public Job l;
    public final CoroutineScope m;
    public final Object n;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ki.values().length];
            try {
                iArr[ki.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ki.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ki.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return rh.this.a((m7) null, this);
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return rh.this.a(this);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return rh.this.a(null, null, null, null, this);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ rh c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rh rhVar, Continuation continuation) {
                super(2, continuation);
                this.c = rhVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    rh rhVar = this.c;
                    this.b = 1;
                    if (rhVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = rh.this.new f(continuation);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
            } catch (Exception e) {
                xb.b("Error during queue processing: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            } finally {
                xb.a("Releasing lock.", (Throwable) null, 2, (Object) null);
                Mutex.DefaultImpls.unlock$default(rh.this.k, null, 1, null);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                if (!Mutex.DefaultImpls.tryLock$default(rh.this.k, null, 1, null)) {
                    xb.a("Already running, skipping new trigger.", (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                if (!rh.this.b.b()) {
                    xb.a("Offline, skipping.", (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                xb.a("Acquired lock, starting job.", (Throwable) null, 2, (Object) null);
                Job job = rh.this.l;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                rh rhVar = rh.this;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(rhVar, null), 3, null);
                rhVar.l = launch$default;
                Job job2 = rh.this.l;
                if (job2 != null) {
                    this.b = 1;
                    if (job2.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            xb.a("Job finished.", (Throwable) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public rh(sh networkClient, xd networkStateChecker, CoroutineDispatcher dispatcher, long j, int i, hi trackerRepository, int i2) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(networkStateChecker, "networkStateChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(trackerRepository, "trackerRepository");
        this.a = networkClient;
        this.b = networkStateChecker;
        this.c = dispatcher;
        this.d = j;
        this.e = i;
        this.f = trackerRepository;
        this.g = i2;
        this.h = new ConcurrentLinkedQueue();
        this.i = ConcurrentHashMap.newKeySet();
        Set synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new d(i2)));
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.j = synchronizedSet;
        this.k = MutexKt.Mutex$default(false, 1, null);
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        this.m = CoroutineScopeKt.CoroutineScope(dispatcher.plus(Job$default));
        this.n = new Object();
        networkStateChecker.a(this);
    }

    @Override // com.chartboost.sdk.impl.xd.a
    public void b() {
        xb.a("Network is lost. Will wait for onNetworkAvailable().", (Throwable) null, 2, (Object) null);
    }

    public static final class d extends LinkedHashMap {
        public d(int i) {
            super(i, 0.75f, false);
        }

        public /* bridge */ boolean a(String str) {
            return super.containsKey(str);
        }

        public /* bridge */ Set b() {
            return super.keySet();
        }

        public /* bridge */ int c() {
            return super.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return a((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return a((Boolean) obj);
            }
            return false;
        }

        public /* bridge */ Collection d() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return a();
        }

        public /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (String) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return b();
        }

        public /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return d();
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > rh.this.g;
        }

        public /* bridge */ boolean a(Boolean bool) {
            return super.containsValue(bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ Set a() {
            return super.entrySet();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof Boolean)) {
                return a((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public /* bridge */ boolean a(String str, Boolean bool) {
            return super.remove(str, bool);
        }
    }

    public /* synthetic */ rh(sh shVar, xd xdVar, CoroutineDispatcher coroutineDispatcher, long j, int i, hi hiVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(shVar, xdVar, (i3 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i3 & 8) != 0 ? 500L : j, (i3 & 16) != 0 ? 3 : i, hiVar, (i3 & 64) != 0 ? 1000 : i2);
    }

    public final void c() {
        BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new f(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.xd.a
    public void a() {
        xb.a("Network is available. Attempting to process queue.", (Throwable) null, 2, (Object) null);
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0176 -> B:11:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01cd -> B:11:0x01d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m7 m7Var, Continuation continuation) {
        b bVar;
        int i;
        qh a2;
        List d2;
        rh rhVar;
        List list;
        int i2;
        int i3;
        b bVar2;
        qh qhVar;
        m7 m7Var2;
        boolean z;
        m7 m7Var3;
        qh qhVar2;
        int i4;
        int i5;
        boolean isEmpty;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i6 = bVar.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.j = i6 - Integer.MIN_VALUE;
                Object obj = bVar.h;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.j;
                int i7 = 2;
                Throwable th = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    a2 = m7Var.a();
                    d2 = m7Var.d();
                    xb.a("Processing eventId=" + a2.b() + " with " + d2.size() + " initial trackers.", (Throwable) null, 2, (Object) null);
                    int i8 = this.e;
                    rhVar = this;
                    if (1 <= i8) {
                        list = d2;
                        i2 = 1;
                        i3 = i8;
                        bVar2 = bVar;
                        qhVar = a2;
                        m7Var2 = m7Var;
                        if (!list.isEmpty()) {
                        }
                        a2 = qhVar;
                        d2 = list;
                    }
                    isEmpty = d2.isEmpty();
                    if (!isEmpty) {
                    }
                    return Boxing.boxBoolean(isEmpty);
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = bVar.g;
                    i4 = bVar.f;
                    list = (List) bVar.e;
                    qhVar2 = (qh) bVar.d;
                    m7Var3 = (m7) bVar.c;
                    rhVar = (rh) bVar.b;
                    ResultKt.throwOnFailure(obj);
                    z = true;
                    i3 = i5;
                    m7Var2 = m7Var3;
                    bVar2 = bVar;
                    qhVar = qhVar2;
                    if (i4 != i3) {
                        i2 = i4 + 1;
                        i7 = 2;
                        th = null;
                        if (!list.isEmpty()) {
                            if (!rhVar.b.b()) {
                                xb.a("Went offline during retry loop for eventId=" + qhVar.b() + ". Will retry later.", th, i7, th);
                                return Boxing.boxBoolean(false);
                            }
                            xb.a("Attempt " + i2 + " for eventId=" + qhVar.b() + " with " + list.size() + " pending trackers.", th, 2, th);
                            String b2 = m7Var2.b();
                            Mediation c2 = m7Var2.c();
                            bVar2.b = rhVar;
                            bVar2.c = m7Var2;
                            bVar2.d = qhVar;
                            bVar2.e = th;
                            bVar2.f = i2;
                            bVar2.g = i3;
                            bVar2.j = 1;
                            z = true;
                            int i9 = i2;
                            rh rhVar2 = rhVar;
                            int i10 = i3;
                            Object a3 = rhVar.a(list, qhVar, b2, c2, bVar2);
                            if (a3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            m7Var3 = m7Var2;
                            qhVar2 = qhVar;
                            bVar = bVar2;
                            rhVar = rhVar2;
                            i5 = i10;
                            obj = a3;
                            i4 = i9;
                            list = (List) obj;
                            if (list.isEmpty()) {
                                xb.a("All trackers for eventId=" + qhVar2.b() + " succeeded on attempt #" + i4 + ".", th, 2, th);
                                d2 = list;
                                a2 = qhVar2;
                                isEmpty = d2.isEmpty();
                                if (!isEmpty) {
                                    xb.b("Event eventId=" + a2.b() + " failed permanently after " + rhVar.e + " attempts and was discarded.", (Throwable) null, 2, (Object) null);
                                }
                                return Boxing.boxBoolean(isEmpty);
                            }
                            if (i4 < rhVar.e) {
                                long j = rhVar.d * (1 << (i4 - 1));
                                xb.e("Event eventId=" + qhVar2.b() + " failed attempt #" + i4 + ". " + list.size() + " trackers remaining. Retrying in " + j + " ms", null, 2, null);
                                bVar.b = rhVar;
                                bVar.c = m7Var3;
                                bVar.d = qhVar2;
                                bVar.e = list;
                                bVar.f = i4;
                                bVar.g = i5;
                                bVar.j = 2;
                                if (DelayKt.delay(j, bVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            i3 = i5;
                            m7Var2 = m7Var3;
                            bVar2 = bVar;
                            qhVar = qhVar2;
                            if (i4 != i3) {
                            }
                        }
                    }
                    a2 = qhVar;
                    d2 = list;
                    isEmpty = d2.isEmpty();
                    if (!isEmpty) {
                    }
                    return Boxing.boxBoolean(isEmpty);
                }
                i5 = bVar.g;
                i4 = bVar.f;
                qh qhVar3 = (qh) bVar.d;
                m7 m7Var4 = (m7) bVar.c;
                rh rhVar3 = (rh) bVar.b;
                ResultKt.throwOnFailure(obj);
                z = true;
                rhVar = rhVar3;
                m7Var3 = m7Var4;
                qhVar2 = qhVar3;
                list = (List) obj;
                if (list.isEmpty()) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.j;
        int i72 = 2;
        Throwable th2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:10:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        c cVar;
        int i;
        rh rhVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    xb.a("Starting with queue size=" + this.h.size(), (Throwable) null, 2, (Object) null);
                    rhVar = this;
                    if (!rhVar.b.b()) {
                    }
                    xb.a("Finished processing loop. Remaining queue size=" + rhVar.h.size(), (Throwable) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String b2 = (String) cVar.c;
                rhVar = (rh) cVar.b;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    rhVar.h.poll();
                    xb.a("Successfully processed eventId=" + b2 + ".", (Throwable) null, 2, (Object) null);
                } else {
                    if (!rhVar.b.b()) {
                        rhVar.j.remove(b2);
                        rhVar.i.add(b2);
                        xb.a("Event processing failed due to network loss. Moved back to in-flight to allow retry.", (Throwable) null, 2, (Object) null);
                        xb.a("Finished processing loop. Remaining queue size=" + rhVar.h.size(), (Throwable) null, 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    rhVar.h.poll();
                    xb.b("Event failed permanently and was discarded: eventId=" + b2, (Throwable) null, 2, (Object) null);
                }
                if (!rhVar.b.b()) {
                    m7 m7Var = (m7) rhVar.h.peek();
                    if (m7Var != null) {
                        b2 = m7Var.a().b();
                        rhVar.i.remove(b2);
                        rhVar.j.add(b2);
                        cVar.b = rhVar;
                        cVar.c = b2;
                        cVar.f = 1;
                        obj = rhVar.a(m7Var, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (!rhVar.b.b()) {
                            xb.a("Network is unavailable. Stopping processing.", (Throwable) null, 2, (Object) null);
                        }
                    }
                }
                xb.a("Finished processing loop. Remaining queue size=" + rhVar.h.size(), (Throwable) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:10:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, qh qhVar, String str, Mediation mediation, Continuation continuation) {
        e eVar;
        rh rhVar;
        int i;
        ArrayList arrayList;
        e eVar2;
        rh rhVar2;
        Iterator it;
        qh qhVar2;
        String str2;
        Mediation mediation2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.k = i2 - Integer.MIN_VALUE;
                rhVar = this;
                Object obj = eVar.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.k;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    eVar2 = eVar;
                    rhVar2 = rhVar;
                    it = list.iterator();
                    qhVar2 = qhVar;
                    str2 = str;
                    mediation2 = mediation;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ei eiVar = (ei) eVar.h;
                    Iterator it2 = (Iterator) eVar.g;
                    ?? r7 = (List) eVar.f;
                    Mediation mediation3 = (Mediation) eVar.e;
                    String str3 = (String) eVar.d;
                    qh qhVar3 = (qh) eVar.c;
                    rh rhVar3 = (rh) eVar.b;
                    ResultKt.throwOnFailure(obj);
                    eVar2 = eVar;
                    it = it2;
                    arrayList = r7;
                    str2 = str3;
                    rhVar2 = rhVar3;
                    int i3 = a.a[((ki) obj).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            arrayList.add(eiVar);
                        } else if (i3 == 3) {
                            xb.b("Tracker request could not be generated for eventId=" + qhVar3.b() + ". URL: " + eiVar.d(), (Throwable) null, 2, (Object) null);
                            if (!(qhVar3 instanceof oi)) {
                                rhVar2.a(qhVar3.c(), eiVar.d(), str2, mediation3);
                            }
                        }
                    }
                    mediation2 = mediation3;
                    qhVar2 = qhVar3;
                    if (it.hasNext()) {
                        ei eiVar2 = (ei) it.next();
                        sh shVar = rhVar2.a;
                        String d2 = eiVar2.d();
                        String c2 = eiVar2.c();
                        String a2 = eiVar2.a();
                        String b2 = eiVar2.b();
                        eVar2.b = rhVar2;
                        eVar2.c = qhVar2;
                        eVar2.d = str2;
                        eVar2.e = mediation2;
                        eVar2.f = arrayList;
                        eVar2.g = it;
                        eVar2.h = eiVar2;
                        eVar2.k = 1;
                        rh rhVar4 = rhVar2;
                        Object a3 = shVar.a(d2, c2, a2, qhVar2, b2, eVar2);
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        qhVar3 = qhVar2;
                        mediation3 = mediation2;
                        obj = a3;
                        rhVar2 = rhVar4;
                        eiVar = eiVar2;
                        int i32 = a.a[((ki) obj).ordinal()];
                        if (i32 != 1) {
                        }
                        mediation2 = mediation3;
                        qhVar2 = qhVar3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        rhVar = this;
        eVar = rhVar.new e(continuation);
        Object obj2 = eVar.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.k;
        if (i != 0) {
        }
    }

    public final void a(qh eventData, List trackers, o7.b bVar) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        xb.a("Received eventId=" + eventData.b() + " (type=" + eventData.getClass().getSimpleName() + ") with " + trackers.size() + " explicit trackers.", (Throwable) null, 2, (Object) null);
        if (!trackers.isEmpty()) {
            xb.a("Using " + trackers.size() + " explicitly provided trackers.", (Throwable) null, 2, (Object) null);
        } else if (bVar != null) {
            trackers = this.f.a(bVar);
            xb.a("Using " + trackers.size() + " trackers from repository for event type " + bVar.b() + ".", (Throwable) null, 2, (Object) null);
        } else {
            trackers = CollectionsKt.emptyList();
        }
        if (trackers.isEmpty()) {
            xb.e("No trackers configured for eventId=" + eventData.b() + "; skipping.", null, 2, null);
            return;
        }
        synchronized (this.n) {
            if (this.j.contains(eventData.b())) {
                xb.a("EventId=" + eventData.b() + " has already been processed; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (this.i.contains(eventData.b())) {
                xb.a("EventId=" + eventData.b() + " is already in-flight; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            this.i.add(eventData.b());
            ConcurrentLinkedQueue concurrentLinkedQueue = this.h;
            String b2 = bVar != null ? bVar.b() : null;
            mc mcVar = eventData instanceof mc ? (mc) eventData : null;
            concurrentLinkedQueue.offer(new m7(eventData, trackers, b2, mcVar != null ? mcVar.getMediation() : null));
            xb.a("Enqueued eventId=" + eventData.b() + ", queue size=" + this.h.size(), (Throwable) null, 2, (Object) null);
            c();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void a(rh rhVar, qh qhVar, List list, o7.b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        rhVar.a(qhVar, list, bVar);
    }

    public final void a(String str, String str2, String str3, Mediation mediation) {
        a(this, new oi(str, str2, "Network request failed. Invalid network request. Failed to create network request for URL: " + str2, "CB_206", "CB_CONNECTIVITY_INVALID_REQUEST", null, str3, mediation, 32, null), (List) null, o7.b.e, 2, (Object) null);
    }
}
