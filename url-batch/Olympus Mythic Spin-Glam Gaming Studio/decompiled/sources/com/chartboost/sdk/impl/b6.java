package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.b7;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class b6 implements b7 {
    public final CoroutineScope a;
    public final x3 b;
    public final w8 c;
    public final w3 d;
    public final v3 e;
    public final CoroutineDispatcher f;
    public final Function0 g;
    public final long h;
    public final Function0 i;
    public final ConcurrentHashMap j;
    public final AtomicLong k;
    public final AtomicBoolean l;
    public final Mutex m;
    public final ConcurrentHashMap n;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b6.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b6 b6Var = b6.this;
                this.b = 1;
                if (b6Var.a(this) == coroutine_suspended) {
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

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a = b6.this.a((URL) null, (Deferred) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a = b6.this.a((URL) null, 0L, (Pair) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class g extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public int o;
        public /* synthetic */ Object p;
        public int r;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            this.r |= Integer.MIN_VALUE;
            Object a = b6.this.a((URL) null, 0L, (b) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class o extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b6.this.a(this);
        }
    }

    public static final class p extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public long g;
        public /* synthetic */ Object h;
        public int j;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object a = b6.this.a((URL) null, 0L, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class q extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ URL d;
        public final /* synthetic */ long e;
        public final /* synthetic */ b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(URL url, long j, b bVar, Continuation continuation) {
            super(2, continuation);
            this.d = url;
            this.e = j;
            this.f = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b6.this.new q(this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b6 b6Var = b6.this;
                this.b = 1;
                if (b6Var.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    a = ((Result) obj).getValue();
                    return Result.m8022boximpl(a);
                }
                ResultKt.throwOnFailure(obj);
            }
            b6 b6Var2 = b6.this;
            URL url = this.d;
            long j = this.e;
            b bVar = this.f;
            this.b = 2;
            a = b6Var2.a(url, j, bVar, this);
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Result.m8022boximpl(a);
        }
    }

    public static final class r extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a = b6.this.a(null, null, 0L, 0L, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class s extends ContinuationImpl {
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object b = b6.this.b(null, 0L, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
        }
    }

    public b6(CoroutineScope cacheScope, x3 storage, w8 downloader, w3 policyManager, v3 notifier, CoroutineDispatcher ioDispatcher, Function0 cacheSizeBytesProvider, long j2, Function0 ttlMillisProvider) {
        Intrinsics.checkNotNullParameter(cacheScope, "cacheScope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(policyManager, "policyManager");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSizeBytesProvider, "cacheSizeBytesProvider");
        Intrinsics.checkNotNullParameter(ttlMillisProvider, "ttlMillisProvider");
        this.a = cacheScope;
        this.b = storage;
        this.c = downloader;
        this.d = policyManager;
        this.e = notifier;
        this.f = ioDispatcher;
        this.g = cacheSizeBytesProvider;
        this.h = j2;
        this.i = ttlMillisProvider;
        this.j = new ConcurrentHashMap();
        this.k = new AtomicLong(0L);
        this.l = new AtomicBoolean(false);
        this.m = MutexKt.Mutex$default(false, 1, null);
        this.n = new ConcurrentHashMap();
        BuildersKt__Builders_commonKt.launch$default(cacheScope, ioDispatcher, null, new a(null), 2, null);
    }

    public static final class b {
        public final long a;
        public final long b;
        public final long c;
        public final File d;
        public final long e;
        public final boolean f;

        public b(long j, long j2, long j3, File file, long j4, boolean z) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = file;
            this.e = j4;
            this.f = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Intrinsics.areEqual(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "DownloadInfo(startByte=" + this.a + ", endByte=" + this.b + ", actualBytes=" + this.c + ", file=" + this.d + ", timestamp=" + this.e + ", isComplete=" + this.f + ")";
        }

        public final boolean c() {
            return this.f;
        }

        public final boolean b(long j) {
            if (j == -1) {
                return this.f;
            }
            return this.c >= j;
        }

        public final boolean a(long j) {
            return j != -1 ? this.c < j : !this.f;
        }

        public /* synthetic */ b(long j, long j2, long j3, File file, long j4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, file, (i & 16) != 0 ? System.currentTimeMillis() : j4, (i & 32) != 0 ? false : z);
        }

        public final File b() {
            return this.d;
        }

        public final long a() {
            return this.c;
        }
    }

    public static final class d {
        public final File a;
        public final File b;
        public final long c;
        public final long d;
        public final File e;
        public final File f;
        public final String g;
        public final String h;

        public d(File tempDataFile, File cacheDir, long j, long j2, File targetFile, File completeFile, String cacheKey, String key) {
            Intrinsics.checkNotNullParameter(tempDataFile, "tempDataFile");
            Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
            Intrinsics.checkNotNullParameter(targetFile, "targetFile");
            Intrinsics.checkNotNullParameter(completeFile, "completeFile");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(key, "key");
            this.a = tempDataFile;
            this.b = cacheDir;
            this.c = j;
            this.d = j2;
            this.e = targetFile;
            this.f = completeFile;
            this.g = cacheKey;
            this.h = key;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f) && Intrinsics.areEqual(this.g, dVar.g) && Intrinsics.areEqual(this.h, dVar.h);
        }

        public int hashCode() {
            return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        }

        public String toString() {
            return "PreDownloadState(tempDataFile=" + this.a + ", cacheDir=" + this.b + ", startByte=" + this.c + ", existingBytes=" + this.d + ", targetFile=" + this.e + ", completeFile=" + this.f + ", cacheKey=" + this.g + ", key=" + this.h + ")";
        }

        public final File g() {
            return this.a;
        }

        public final File a() {
            return this.b;
        }

        public final long e() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final File f() {
            return this.e;
        }

        public final File c() {
            return this.f;
        }

        public final String b() {
            return this.g;
        }
    }

    public static abstract class c {

        public static final class a extends c {
            public final File a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(File file) {
                super(null);
                Intrinsics.checkNotNullParameter(file, "file");
                this.a = file;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "CacheHit(file=" + this.a + ")";
            }

            public final File a() {
                return this.a;
            }
        }

        public c() {
        }

        public static final class b extends c {
            public final Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.a = error;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.a + ")";
            }

            public final Exception a() {
                return this.a;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: com.chartboost.sdk.impl.b6$c$c, reason: collision with other inner class name */
        public static final class C0215c extends c {
            public final d a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215c(d state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.a = state;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0215c) && Intrinsics.areEqual(this.a, ((C0215c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ProceedWithDownload(state=" + this.a + ")";
            }

            public final d a() {
                return this.a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: Exception -> 0x004f, CancellationException -> 0x0054, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0054, Exception -> 0x004f, blocks: (B:27:0x004b, B:28:0x0067, B:30:0x0073, B:37:0x0059), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, Deferred deferred, Continuation continuation) {
        e eVar;
        int i2;
        URL url2;
        Exception e2;
        b6 b6Var;
        Object value;
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i3 = eVar.g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.g = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = eVar.g;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        eVar.b = this;
                        eVar.c = url;
                        eVar.g = 1;
                        obj = deferred.await(eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        b6Var = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = eVar.c;
                            url2 = (URL) eVar.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj2;
                            } catch (CancellationException e3) {
                                e = e3;
                                url = url2;
                                xb.e("Awaited download cancelled: url=" + url, null, 2, null);
                                Result.Companion companion = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(e));
                            } catch (Exception e4) {
                                e2 = e4;
                                xb.e("Awaited download failed: url=" + url2 + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                                Result.Companion companion2 = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(e2));
                            }
                        }
                        url = (URL) eVar.c;
                        b6Var = (b6) eVar.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    value = ((Result) obj).getValue();
                    if (Result.m8029isSuccessimpl(value)) {
                        x3 x3Var = b6Var.b;
                        eVar.b = url;
                        eVar.c = value;
                        eVar.d = value;
                        eVar.g = 2;
                        if (x3Var.a((File) value, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return value;
                }
            }
            if (i2 != 0) {
            }
            value = ((Result) obj).getValue();
            if (Result.m8029isSuccessimpl(value)) {
            }
            return value;
        } catch (CancellationException e5) {
            e = e5;
        } catch (Exception e6) {
            url2 = url;
            e2 = e6;
        }
        eVar = new e(continuation);
        Object obj3 = eVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar.g;
    }

    public final Pair b(URL url, long j2) {
        Object next;
        Pair pair;
        Object next2;
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (!Intrinsics.areEqual(str, url2)) {
                if (StringsKt.startsWith$default(str, url2 + "_", false, 2, (Object) null)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        xb.a("Found " + linkedHashMap.size() + " related ongoing downloads for " + url2, (Throwable) null, 2, (Object) null);
        if (j2 == -1) {
            Deferred deferred = (Deferred) linkedHashMap.get(url2);
            if (deferred != null) {
                xb.a("Found ongoing complete download for complete file request", (Throwable) null, 2, (Object) null);
                Pair pair2 = TuplesKt.to(url2, deferred);
                if (pair2 != null) {
                    return pair2;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Intrinsics.areEqual((String) entry2.getKey(), url2)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    Long a2 = a((String) ((Map.Entry) next2).getKey());
                    long longValue = a2 != null ? a2.longValue() : 0L;
                    do {
                        Object next3 = it.next();
                        Long a3 = a((String) ((Map.Entry) next3).getKey());
                        long longValue2 = a3 != null ? a3.longValue() : 0L;
                        if (longValue < longValue2) {
                            next2 = next3;
                            longValue = longValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            Map.Entry entry3 = (Map.Entry) next2;
            if (entry3 == null) {
                return null;
            }
            Long a4 = a((String) entry3.getKey());
            xb.a("Found ongoing partial download of " + (a4 != null ? a4.longValue() : 0L) + " bytes for complete file request", (Throwable) null, 2, (Object) null);
            return new Pair(entry3.getKey(), entry3.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            String str2 = (String) entry4.getKey();
            if (!Intrinsics.areEqual(str2, url2)) {
                Long a5 = a(str2);
                if ((a5 != null ? a5.longValue() : 0L) >= j2) {
                }
            }
            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
        }
        Deferred deferred2 = (Deferred) linkedHashMap3.get(url2);
        if (deferred2 == null || (pair = TuplesKt.to(url2, deferred2)) == null) {
            Iterator it2 = linkedHashMap3.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    Long a6 = a((String) ((Map.Entry) next).getKey());
                    long longValue3 = a6 != null ? a6.longValue() : Long.MAX_VALUE;
                    do {
                        Object next4 = it2.next();
                        Long a7 = a((String) ((Map.Entry) next4).getKey());
                        long longValue4 = a7 != null ? a7.longValue() : Long.MAX_VALUE;
                        if (longValue3 > longValue4) {
                            next = next4;
                            longValue3 = longValue4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry5 = (Map.Entry) next;
            pair = entry5 != null ? new Pair(entry5.getKey(), entry5.getValue()) : null;
        }
        if (pair == null) {
            return null;
        }
        Long a8 = a((String) pair.component1());
        xb.a("Found ongoing " + (a8 == null ? "complete" : a8 + " bytes") + " download that can satisfy " + j2 + " byte request", (Throwable) null, 2, (Object) null);
        return pair;
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo4828invoke() {
            return Long.valueOf(b6.this.k.get());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, long j2, Pair pair, Continuation continuation) {
        f fVar;
        String str;
        String str2;
        URL url2;
        b6 b6Var;
        long j3;
        Exception e2;
        long j4;
        CancellationException e3;
        Object value;
        String str3;
        File file;
        long j5 = j2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.h = i2 - Integer.MIN_VALUE;
                Object obj = fVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (fVar.h) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        str = (String) pair.component1();
                        Deferred deferred = (Deferred) pair.component2();
                        if (j5 == -1) {
                            str2 = "complete file";
                        } else {
                            str2 = j5 + " bytes";
                        }
                        xb.a("Awaiting ongoing download: " + str + " for original request of " + str2, (Throwable) null, 2, (Object) null);
                        try {
                            fVar.b = this;
                            url2 = url;
                            fVar.c = url2;
                            fVar.d = str;
                            fVar.e = j5;
                            fVar.h = 1;
                            obj = deferred.await(fVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            b6Var = this;
                            value = ((Result) obj).getValue();
                            if (!Result.m8028isFailureimpl(value)) {
                                xb.e("Ongoing download " + str + " failed, starting new download", null, 2, null);
                                fVar.b = null;
                                fVar.c = null;
                                fVar.d = null;
                                fVar.h = 2;
                                Object b2 = b6Var.b(url2, j5, fVar);
                                return b2 == coroutine_suspended ? coroutine_suspended : b2;
                            }
                            if (Result.m8028isFailureimpl(value)) {
                                value = null;
                            }
                            File file2 = (File) value;
                            if (file2 == null) {
                                xb.e("Ongoing download " + str + " returned null file", null, 2, null);
                                fVar.b = null;
                                fVar.c = null;
                                fVar.d = null;
                                fVar.h = 3;
                                Object b3 = b6Var.b(url2, j5, fVar);
                                return b3 == coroutine_suspended ? coroutine_suspended : b3;
                            }
                            Long a2 = b6Var.a(str);
                            if (b6Var.a(j5, file2)) {
                                if (j5 == -1) {
                                    str3 = "complete file request";
                                } else {
                                    str3 = "partial request (" + j5 + " bytes)";
                                }
                                xb.a("Ongoing download (" + file2.length() + " bytes) satisfies " + str3, (Throwable) null, 2, (Object) null);
                                x3 x3Var = b6Var.b;
                                fVar.b = file2;
                                fVar.c = null;
                                fVar.d = null;
                                fVar.h = 4;
                                if (x3Var.a(file2, fVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                file = file2;
                                return Result.m8023constructorimpl(file);
                            }
                            if (j5 == -1) {
                                xb.a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                b6Var.a(url2, file2, file2.length(), false);
                                fVar.b = null;
                                fVar.c = null;
                                fVar.d = null;
                                fVar.h = 5;
                                Object b4 = b6Var.b(url2, j5, fVar);
                                return b4 == coroutine_suspended ? coroutine_suspended : b4;
                            }
                            URL url3 = url2;
                            xb.a("Ongoing download (" + file2.length() + " bytes) insufficient for request (" + j5 + " bytes) - starting larger download", (Throwable) null, 2, (Object) null);
                            b6Var.a(url3, file2, file2.length(), a2 == null);
                            fVar.b = null;
                            fVar.c = null;
                            fVar.d = null;
                            fVar.h = 6;
                            Object b5 = b6Var.b(url3, j5, fVar);
                            return b5 == coroutine_suspended ? coroutine_suspended : b5;
                        } catch (CancellationException e4) {
                            e3 = e4;
                            j4 = -1;
                            xb.e("Ongoing download cancelled: cacheKey=" + str + ", requestedBytes=" + (j5 != j4 ? String.valueOf(j5) : "complete"), null, 2, null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e3));
                        } catch (Exception e5) {
                            e2 = e5;
                            j3 = -1;
                            String valueOf = j5 != j3 ? String.valueOf(j5) : "complete";
                            xb.b("Ongoing download failed: cacheKey=" + str + ", requestedBytes=" + valueOf + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e2));
                        }
                    case 1:
                        j5 = fVar.e;
                        str = (String) fVar.d;
                        URL url4 = (URL) fVar.c;
                        b6Var = (b6) fVar.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            url2 = url4;
                            value = ((Result) obj).getValue();
                            if (!Result.m8028isFailureimpl(value)) {
                            }
                        } catch (CancellationException e6) {
                            e3 = e6;
                            j4 = -1;
                            if (j5 != j4) {
                            }
                            xb.e("Ongoing download cancelled: cacheKey=" + str + ", requestedBytes=" + (j5 != j4 ? String.valueOf(j5) : "complete"), null, 2, null);
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e3));
                        } catch (Exception e7) {
                            e2 = e7;
                            j3 = -1;
                            if (j5 != j3) {
                            }
                            xb.b("Ongoing download failed: cacheKey=" + str + ", requestedBytes=" + valueOf + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                            Result.Companion companion22 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e2));
                        }
                        break;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 3:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 4:
                        file = (File) fVar.b;
                        ResultKt.throwOnFailure(obj);
                        return Result.m8023constructorimpl(file);
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (fVar.h) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|583|6|7|8|(2:(0)|(1:288))) */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x08f8, code lost:
    
        r9 = r5.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x05f6, code lost:
    
        if (r4.d.a(r2) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x060d, code lost:
    
        if (r14.length() >= r7) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0069, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x006a, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x1257, code lost:
    
        r4 = ", message=";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x06e5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:579:0x06e4 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0cb3 A[Catch: all -> 0x11c0, TRY_LEAVE, TryCatch #14 {all -> 0x11c0, blocks: (B:119:0x0ca8, B:122:0x0caf, B:125:0x0cb3, B:207:0x0cde), top: B:118:0x0ca8 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0ced A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x11c4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b78 A[Catch: CancellationException -> 0x0b8d, TryCatch #47 {CancellationException -> 0x0b8d, blocks: (B:234:0x0b72, B:236:0x0b78, B:239:0x0b80, B:264:0x0b92), top: B:233:0x0b72 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0b92 A[Catch: CancellationException -> 0x0b8d, TRY_LEAVE, TryCatch #47 {CancellationException -> 0x0b8d, blocks: (B:234:0x0b72, B:236:0x0b78, B:239:0x0b80, B:264:0x0b92), top: B:233:0x0b72 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x129d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x129e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0ade A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a77 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0772 A[Catch: all -> 0x07d1, TRY_LEAVE, TryCatch #23 {all -> 0x07d1, blocks: (B:360:0x0768, B:363:0x0772), top: B:359:0x0768 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x1012 A[Catch: all -> 0x103f, TryCatch #13 {all -> 0x103f, blocks: (B:37:0x100a, B:39:0x1012, B:41:0x1034, B:43:0x1043, B:47:0x10bf, B:50:0x10cd, B:52:0x10f5, B:86:0x0fd5), top: B:85:0x0fd5 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07d6 A[Catch: all -> 0x07cc, TryCatch #20 {all -> 0x07cc, blocks: (B:365:0x0778, B:412:0x07d6, B:414:0x07e2, B:417:0x07ea, B:419:0x0817, B:421:0x081d, B:423:0x083f, B:424:0x0894, B:428:0x0867, B:429:0x0888, B:431:0x08f8, B:433:0x0900, B:434:0x090a), top: B:361:0x0770, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x10bf A[Catch: all -> 0x103f, TRY_ENTER, TryCatch #13 {all -> 0x103f, blocks: (B:37:0x100a, B:39:0x1012, B:41:0x1034, B:43:0x1043, B:47:0x10bf, B:50:0x10cd, B:52:0x10f5, B:86:0x0fd5), top: B:85:0x0fd5 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0607 A[Catch: all -> 0x0666, TRY_ENTER, TryCatch #27 {all -> 0x0666, blocks: (B:496:0x05de, B:498:0x05e4, B:503:0x060f, B:520:0x0607, B:536:0x05c0), top: B:535:0x05c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x05a6 A[Catch: all -> 0x0550, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x0550, blocks: (B:484:0x052f, B:486:0x0535, B:488:0x053b, B:491:0x0545, B:505:0x0632, B:525:0x066f, B:527:0x0677, B:533:0x05a6, B:537:0x0555), top: B:483:0x052f }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x052b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0494 A[Catch: all -> 0x0500, TryCatch #38 {all -> 0x0500, blocks: (B:557:0x0485, B:561:0x04aa, B:563:0x04b0, B:568:0x0504, B:572:0x0494), top: B:556:0x0485 }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0ef5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0f04 A[Catch: all -> 0x0f9f, TRY_LEAVE, TryCatch #51 {all -> 0x0f9f, blocks: (B:73:0x0ef9, B:75:0x0f04), top: B:72:0x0ef9 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x1001 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0ebc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r15v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r48v4 */
    /* JADX WARN: Type inference failed for: r48v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r48v6 */
    /* JADX WARN: Type inference failed for: r48v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v140, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v179 */
    /* JADX WARN: Type inference failed for: r4v183 */
    /* JADX WARN: Type inference failed for: r4v207 */
    /* JADX WARN: Type inference failed for: r4v228 */
    /* JADX WARN: Type inference failed for: r4v231 */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, long j2, b bVar, Continuation continuation) {
        g gVar;
        Throwable th;
        ?? r4;
        Throwable th2;
        Mutex mutex;
        Mutex mutex2;
        ?? r10;
        String str;
        String str2;
        String str3;
        b6 b6Var;
        URL url2;
        String str4;
        String str5;
        b bVar2;
        Mutex mutex3;
        long j3;
        long j4;
        String url3;
        String str6;
        String str7;
        String str8;
        File a2;
        String str9;
        URL url4;
        b bVar3;
        URL url5;
        b6 b6Var2;
        long j5;
        ?? r8;
        b bVar4;
        b6 b6Var3;
        URL url6;
        long j6;
        char c2;
        Object aVar;
        Object obj;
        long j7;
        b bVar5;
        Object obj2;
        String str10;
        ?? r48;
        Object obj3;
        long j8;
        Mutex mutex4;
        long j9;
        Mutex mutex5;
        Object obj4;
        File file;
        String str11;
        File file2;
        b bVar6;
        long j10;
        Object obj5;
        String str12;
        b bVar7;
        long j11;
        File file3;
        long j12;
        File file4;
        URL url7;
        long j13;
        Mutex mutex6;
        b bVar8;
        b6 b6Var4;
        c.a aVar2;
        long j14;
        String str13;
        b6 b6Var5;
        String str14;
        Throwable th3;
        URL url8;
        b bVar9;
        d dVar;
        long j15;
        long j16;
        String str15;
        String str16;
        String str17;
        int i2;
        Object obj6;
        CancellationException cancellationException;
        b6 b6Var6;
        String str18;
        String str19;
        Exception exc;
        URL url9;
        b6 b6Var7;
        long j17;
        b bVar10;
        long j18;
        d dVar2;
        d dVar3;
        File g2;
        long e2;
        File a3;
        b6 b6Var8;
        URL url10;
        Object a4;
        b6 b6Var9;
        b bVar11;
        d dVar4;
        b bVar12;
        long j19;
        c.b bVar13;
        Pair pair;
        b bVar14;
        b bVar15;
        d dVar5;
        CancellationException cancellationException2;
        Object obj7;
        String str20;
        long length;
        long j20;
        b bVar16;
        String str21;
        URL url11;
        b6 b6Var10;
        long j21;
        Object a5;
        Object obj8;
        Exception exc2;
        Object m8023constructorimpl;
        long j22;
        Exception exc3;
        URL url12;
        URL url13;
        long j23;
        long j24;
        b bVar17;
        NonCancellable nonCancellable;
        h hVar;
        String str22;
        b6 b6Var11;
        Object obj9;
        b bVar18;
        Mutex mutex7;
        Throwable m8026exceptionOrNullimpl;
        d dVar6;
        ?? m8028isFailureimpl;
        Long l2;
        d dVar7;
        Mutex mutex8;
        long j25;
        URL url14;
        long d2;
        Mutex mutex9;
        d dVar8;
        String str23;
        int i3;
        Object obj10;
        File f2;
        long j26;
        long j27;
        Mutex mutex10;
        long j28;
        int i4;
        b bVar19;
        URL url15;
        b6 b6Var12;
        File file5;
        long j29;
        File file6;
        int i5;
        long j30;
        b bVar20;
        URL url16;
        b6 b6Var13;
        long j31;
        long j32;
        Object m8023constructorimpl2;
        Object obj11;
        URL url17;
        d dVar9;
        long j33;
        b bVar21;
        File file7;
        b6 b6Var14;
        int i6;
        long longValue;
        Mutex mutex11;
        d dVar10;
        String str24;
        URL url18;
        b6 b6Var15;
        d dVar11;
        File file8;
        long j34;
        Mutex mutex12;
        Mutex mutex13;
        d dVar12;
        try {
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i7 = gVar.r;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    gVar.r = i7 - Integer.MIN_VALUE;
                    Object obj12 = gVar.p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (gVar.r) {
                        case 0:
                            str = ", tempFileSize=";
                            ResultKt.throwOnFailure(obj12);
                            long longValue2 = ((Number) this.g.mo4828invoke()).longValue();
                            Mutex mutex14 = this.m;
                            gVar.b = this;
                            gVar.c = url;
                            gVar.d = bVar;
                            gVar.e = mutex14;
                            str2 = ", message=";
                            str3 = ", errorType=";
                            gVar.j = j2;
                            gVar.k = longValue2;
                            gVar.r = 1;
                            if (mutex14.lock(null, gVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            b6Var = this;
                            url2 = url;
                            str4 = ", requestedBytes=";
                            str5 = ", tempFileExists=";
                            bVar2 = bVar;
                            mutex3 = mutex14;
                            j3 = longValue2;
                            j4 = j2;
                            try {
                                url3 = url2.toString();
                                Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                                if (j4 != -1) {
                                    str6 = "toString(...)";
                                    str7 = url3;
                                } else {
                                    str6 = "toString(...)";
                                    str7 = url3 + "_" + j4;
                                }
                                if (bVar2 == null && bVar2.b(j4)) {
                                    xb.a("File for " + str7 + " already available after acquiring lock from partial download.", (Throwable) null, 2, (Object) null);
                                    x3 x3Var = b6Var.b;
                                    File b2 = bVar2.b();
                                    gVar.b = b6Var;
                                    gVar.c = url2;
                                    gVar.d = bVar2;
                                    gVar.e = mutex3;
                                    gVar.j = j4;
                                    gVar.k = j3;
                                    gVar.r = 2;
                                    if (x3Var.a(b2, gVar) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    url5 = url2;
                                    b6Var2 = b6Var;
                                    j5 = j4;
                                    r8 = mutex3;
                                    bVar4 = bVar2;
                                    b6Var3 = b6Var2;
                                    url6 = url5;
                                    j6 = j3;
                                    str8 = ", downloadedBytes=";
                                    c2 = 2;
                                    aVar = new c.a(bVar4.b());
                                    obj = coroutine_suspended;
                                    j7 = j5;
                                    bVar5 = bVar4;
                                    obj2 = null;
                                    r8.unlock(obj2);
                                    if (!(aVar instanceof c.a)) {
                                    }
                                } else {
                                    str8 = ", downloadedBytes=";
                                    a2 = b6Var.b.a(url2);
                                    str9 = "_";
                                    x3 x3Var2 = b6Var.b;
                                    gVar.b = b6Var;
                                    gVar.c = url2;
                                    gVar.d = bVar2;
                                    gVar.e = mutex3;
                                    gVar.f = str7;
                                    gVar.g = url3;
                                    gVar.h = a2;
                                    gVar.j = j4;
                                    gVar.k = j3;
                                    b bVar22 = bVar2;
                                    gVar.r = 3;
                                    obj12 = x3Var2.b(url2, gVar);
                                    if (obj12 != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    url4 = url2;
                                    bVar3 = bVar22;
                                    try {
                                        u3 u3Var = (u3) obj12;
                                        if (j4 == -1 && a2.exists() && a2.length() >= j4) {
                                            if (u3Var != null) {
                                                str10 = url3;
                                                if (!b6Var.d.a(u3Var)) {
                                                }
                                            }
                                            xb.a("Complete file exists and satisfies partial request for " + str7, (Throwable) null, 2, (Object) null);
                                            x3 x3Var3 = b6Var.b;
                                            gVar.b = b6Var;
                                            gVar.c = url4;
                                            gVar.d = bVar3;
                                            gVar.e = mutex3;
                                            gVar.f = a2;
                                            gVar.g = null;
                                            gVar.h = null;
                                            gVar.j = j4;
                                            gVar.k = j3;
                                            gVar.r = 4;
                                            if (x3Var3.a(a2, gVar) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            url7 = url4;
                                            j13 = j3;
                                            mutex6 = mutex3;
                                            b6 b6Var16 = b6Var;
                                            bVar8 = bVar3;
                                            b6Var4 = b6Var16;
                                            aVar2 = new c.a(a2);
                                            b6Var3 = b6Var4;
                                            url6 = url7;
                                            j6 = j13;
                                            obj = coroutine_suspended;
                                            j7 = j4;
                                            r8 = mutex6;
                                            bVar5 = bVar8;
                                            aVar = aVar2;
                                            obj2 = null;
                                            c2 = 2;
                                            r8.unlock(obj2);
                                            if (!(aVar instanceof c.a)) {
                                                Result.Companion companion = Result.INSTANCE;
                                                return Result.m8023constructorimpl(((c.a) aVar).a());
                                            }
                                            if (aVar instanceof c.b) {
                                                Result.Companion companion2 = Result.INSTANCE;
                                                return Result.m8023constructorimpl(ResultKt.createFailure(((c.b) aVar).a()));
                                            }
                                            boolean z = aVar instanceof c.C0215c;
                                            d a6 = ((c.C0215c) aVar).a();
                                            try {
                                                try {
                                                    Result.Companion companion3 = Result.INSTANCE;
                                                    try {
                                                        g2 = a6.g();
                                                        e2 = a6.e();
                                                        a3 = a6.a();
                                                        gVar.b = b6Var3;
                                                        gVar.c = url6;
                                                        gVar.d = bVar5;
                                                        gVar.e = a6;
                                                    } catch (CancellationException e3) {
                                                        e = e3;
                                                        dVar = a6;
                                                    }
                                                } catch (CancellationException e4) {
                                                    obj6 = obj;
                                                    dVar = a6;
                                                    cancellationException = e4;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                url8 = url6;
                                                bVar9 = bVar5;
                                                dVar = a6;
                                                j15 = j6;
                                                j16 = j7;
                                                str15 = str2;
                                                str16 = str4;
                                                str17 = str5;
                                                i2 = 1;
                                            }
                                            try {
                                                gVar.f = null;
                                                gVar.g = null;
                                                gVar.h = null;
                                                gVar.i = null;
                                                gVar.j = j7;
                                                gVar.k = j6;
                                                gVar.r = 8;
                                                b6Var8 = b6Var3;
                                                url10 = url6;
                                                url8 = url6;
                                                bVar9 = bVar5;
                                                String str25 = str;
                                                b6Var6 = b6Var3;
                                                str18 = str3;
                                                dVar = a6;
                                                j16 = j7;
                                                str15 = str2;
                                                i2 = 1;
                                                str19 = str25;
                                                j15 = j6;
                                                str16 = str4;
                                                str17 = str5;
                                            } catch (CancellationException e6) {
                                                e = e6;
                                                dVar = a6;
                                            } catch (Exception e7) {
                                                e = e7;
                                                url8 = url6;
                                                bVar9 = bVar5;
                                                dVar = a6;
                                                j15 = j6;
                                                j16 = j7;
                                                str15 = str2;
                                                str16 = str4;
                                                str17 = str5;
                                                i2 = 1;
                                                String str26 = str;
                                                b6Var6 = b6Var3;
                                                str18 = str3;
                                                str19 = str26;
                                                exc = e;
                                                url9 = url8;
                                                b6Var7 = b6Var6;
                                                j17 = j15;
                                                bVar10 = bVar9;
                                                j18 = j16;
                                                dVar2 = dVar;
                                                try {
                                                    String simpleName = exc.getClass().getSimpleName();
                                                    if (dVar2.g().exists()) {
                                                    }
                                                    try {
                                                        String b3 = dVar2.b();
                                                        j20 = j17;
                                                        long e8 = dVar2.e();
                                                        long j35 = j18;
                                                        String message = exc.getMessage();
                                                        StringBuilder sb = new StringBuilder();
                                                        bVar16 = bVar10;
                                                        sb.append("Download failed: cacheKey=");
                                                        sb.append(b3);
                                                        sb.append(", startByte=");
                                                        sb.append(e8);
                                                        str21 = str8;
                                                        sb.append(str21);
                                                        sb.append(length);
                                                        sb.append(str18);
                                                        sb.append(simpleName);
                                                        String str27 = str20;
                                                        sb.append(str27);
                                                        sb.append(message);
                                                        xb.b(sb.toString(), exc);
                                                        if (dVar2.e() > 0) {
                                                        }
                                                        dVar5 = dVar2;
                                                        Exception exc4 = exc;
                                                        url11 = url9;
                                                        b6Var10 = b6Var7;
                                                        str15 = str27;
                                                        obj8 = obj7;
                                                        try {
                                                            Result.Companion companion4 = Result.INSTANCE;
                                                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc4));
                                                            j22 = j35;
                                                            dVar3 = dVar5;
                                                            url13 = url11;
                                                            j23 = j20;
                                                            bVar17 = bVar16;
                                                            j24 = j22;
                                                            if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                                            }
                                                        } catch (CancellationException e9) {
                                                            e = e9;
                                                            obj6 = obj8;
                                                            cancellationException2 = e;
                                                            dVar3 = dVar5;
                                                            nonCancellable = NonCancellable.INSTANCE;
                                                            hVar = new h(dVar3, null);
                                                            gVar.b = cancellationException2;
                                                            gVar.c = null;
                                                            gVar.d = null;
                                                            gVar.e = null;
                                                            gVar.f = null;
                                                            gVar.g = null;
                                                            gVar.h = null;
                                                            gVar.i = null;
                                                            gVar.r = 10;
                                                            if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                                return obj6;
                                                            }
                                                            throw cancellationException2;
                                                        }
                                                    } catch (CancellationException e10) {
                                                        e = e10;
                                                        dVar5 = dVar2;
                                                        obj6 = obj7;
                                                    }
                                                } catch (CancellationException e11) {
                                                    e = e11;
                                                    obj6 = obj;
                                                    dVar5 = dVar2;
                                                }
                                            }
                                            try {
                                                a4 = b6Var8.a(url10, g2, j7, e2, a3, gVar);
                                            } catch (CancellationException e12) {
                                                e = e12;
                                                cancellationException = e;
                                                obj6 = obj;
                                                dVar3 = dVar;
                                                try {
                                                    throw cancellationException;
                                                } catch (CancellationException e13) {
                                                    cancellationException2 = e13;
                                                    nonCancellable = NonCancellable.INSTANCE;
                                                    hVar = new h(dVar3, null);
                                                    gVar.b = cancellationException2;
                                                    gVar.c = null;
                                                    gVar.d = null;
                                                    gVar.e = null;
                                                    gVar.f = null;
                                                    gVar.g = null;
                                                    gVar.h = null;
                                                    gVar.i = null;
                                                    gVar.r = 10;
                                                    if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                exc = e;
                                                url9 = url8;
                                                b6Var7 = b6Var6;
                                                j17 = j15;
                                                bVar10 = bVar9;
                                                j18 = j16;
                                                dVar2 = dVar;
                                                String simpleName2 = exc.getClass().getSimpleName();
                                                if (dVar2.g().exists()) {
                                                }
                                                String b32 = dVar2.b();
                                                j20 = j17;
                                                long e82 = dVar2.e();
                                                long j352 = j18;
                                                String message2 = exc.getMessage();
                                                StringBuilder sb2 = new StringBuilder();
                                                bVar16 = bVar10;
                                                sb2.append("Download failed: cacheKey=");
                                                sb2.append(b32);
                                                sb2.append(", startByte=");
                                                sb2.append(e82);
                                                str21 = str8;
                                                sb2.append(str21);
                                                sb2.append(length);
                                                sb2.append(str18);
                                                sb2.append(simpleName2);
                                                String str272 = str20;
                                                sb2.append(str272);
                                                sb2.append(message2);
                                                xb.b(sb2.toString(), exc);
                                                if (dVar2.e() > 0) {
                                                }
                                                dVar5 = dVar2;
                                                Exception exc42 = exc;
                                                url11 = url9;
                                                b6Var10 = b6Var7;
                                                str15 = str272;
                                                obj8 = obj7;
                                                Result.Companion companion42 = Result.INSTANCE;
                                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc42));
                                                j22 = j352;
                                                dVar3 = dVar5;
                                                url13 = url11;
                                                j23 = j20;
                                                bVar17 = bVar16;
                                                j24 = j22;
                                                if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                                }
                                            }
                                            if (a4 == obj) {
                                                return obj;
                                            }
                                            b6Var9 = b6Var6;
                                            bVar11 = bVar9;
                                            dVar4 = dVar;
                                            try {
                                                ResultKt.throwOnFailure(a4);
                                                m8023constructorimpl = Result.m8023constructorimpl(a4);
                                                b6Var10 = b6Var9;
                                                url13 = url8;
                                                j23 = j15;
                                                j24 = j16;
                                                obj8 = obj;
                                                str21 = str8;
                                                b bVar23 = bVar11;
                                                dVar3 = dVar4;
                                                bVar17 = bVar23;
                                            } catch (CancellationException e15) {
                                                cancellationException = e15;
                                                obj6 = obj;
                                                dVar3 = dVar4;
                                                throw cancellationException;
                                            } catch (Exception e16) {
                                                exc3 = e16;
                                                url12 = url8;
                                                b6Var7 = b6Var9;
                                                exc = exc3;
                                                bVar10 = bVar11;
                                                j17 = j15;
                                                j18 = j16;
                                                d dVar13 = dVar4;
                                                url9 = url12;
                                                dVar2 = dVar13;
                                                String simpleName22 = exc.getClass().getSimpleName();
                                                if (dVar2.g().exists()) {
                                                    obj7 = obj;
                                                    str20 = str15;
                                                    length = 0;
                                                } else {
                                                    try {
                                                        obj7 = obj;
                                                        str20 = str15;
                                                        length = dVar2.g().length();
                                                    } catch (CancellationException e17) {
                                                        cancellationException2 = e17;
                                                        obj6 = obj;
                                                        dVar3 = dVar2;
                                                        nonCancellable = NonCancellable.INSTANCE;
                                                        hVar = new h(dVar3, null);
                                                        gVar.b = cancellationException2;
                                                        gVar.c = null;
                                                        gVar.d = null;
                                                        gVar.e = null;
                                                        gVar.f = null;
                                                        gVar.g = null;
                                                        gVar.h = null;
                                                        gVar.i = null;
                                                        gVar.r = 10;
                                                        if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                        }
                                                    }
                                                }
                                                String b322 = dVar2.b();
                                                j20 = j17;
                                                long e822 = dVar2.e();
                                                long j3522 = j18;
                                                String message22 = exc.getMessage();
                                                StringBuilder sb22 = new StringBuilder();
                                                bVar16 = bVar10;
                                                sb22.append("Download failed: cacheKey=");
                                                sb22.append(b322);
                                                sb22.append(", startByte=");
                                                sb22.append(e822);
                                                str21 = str8;
                                                sb22.append(str21);
                                                sb22.append(length);
                                                sb22.append(str18);
                                                sb22.append(simpleName22);
                                                String str2722 = str20;
                                                sb22.append(str2722);
                                                sb22.append(message22);
                                                xb.b(sb22.toString(), exc);
                                                if (dVar2.e() > 0) {
                                                    try {
                                                        if (exc instanceof IOException) {
                                                            xb.e("Download retry from beginning: cacheKey=" + dVar2.b() + ", previousStartByte=" + dVar2.e() + str18 + simpleName22, null, 2, null);
                                                            if (dVar2.g().exists()) {
                                                                try {
                                                                    dVar2.g().delete();
                                                                } catch (CancellationException e18) {
                                                                    cancellationException2 = e18;
                                                                    dVar3 = dVar2;
                                                                    obj6 = obj7;
                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                    hVar = new h(dVar3, null);
                                                                    gVar.b = cancellationException2;
                                                                    gVar.c = null;
                                                                    gVar.d = null;
                                                                    gVar.e = null;
                                                                    gVar.f = null;
                                                                    gVar.g = null;
                                                                    gVar.h = null;
                                                                    gVar.i = null;
                                                                    gVar.r = 10;
                                                                    if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                                    }
                                                                }
                                                            }
                                                            File g3 = dVar2.g();
                                                            File a7 = dVar2.a();
                                                            gVar.b = b6Var7;
                                                            gVar.c = url9;
                                                            gVar.d = bVar16;
                                                            gVar.e = dVar2;
                                                            gVar.f = exc;
                                                            gVar.g = null;
                                                            gVar.h = null;
                                                            gVar.i = null;
                                                            bVar16 = bVar16;
                                                            gVar.j = j3522;
                                                            str15 = str2722;
                                                            gVar.k = j20;
                                                            gVar.r = 9;
                                                            dVar5 = dVar2;
                                                            Exception exc5 = exc;
                                                            url11 = url9;
                                                            b6Var10 = b6Var7;
                                                            j21 = j3522;
                                                            j20 = j20;
                                                            try {
                                                                a5 = b6Var7.a(url9, g3, j3522, 0L, a7, gVar);
                                                                obj8 = obj7;
                                                                if (a5 == obj8) {
                                                                    return obj8;
                                                                }
                                                                exc2 = exc5;
                                                                dVar3 = dVar5;
                                                                try {
                                                                    if (!Result.m8028isFailureimpl(a5)) {
                                                                    }
                                                                    j22 = j21;
                                                                    url13 = url11;
                                                                    j23 = j20;
                                                                    bVar17 = bVar16;
                                                                    j24 = j22;
                                                                    if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                                                    }
                                                                } catch (CancellationException e19) {
                                                                    cancellationException2 = e19;
                                                                    obj6 = obj8;
                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                    hVar = new h(dVar3, null);
                                                                    gVar.b = cancellationException2;
                                                                    gVar.c = null;
                                                                    gVar.d = null;
                                                                    gVar.e = null;
                                                                    gVar.f = null;
                                                                    gVar.g = null;
                                                                    gVar.h = null;
                                                                    gVar.i = null;
                                                                    gVar.r = 10;
                                                                    if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                                    }
                                                                }
                                                            } catch (CancellationException e20) {
                                                                e = e20;
                                                                cancellationException2 = e;
                                                                obj6 = obj7;
                                                                dVar3 = dVar5;
                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                hVar = new h(dVar3, null);
                                                                gVar.b = cancellationException2;
                                                                gVar.c = null;
                                                                gVar.d = null;
                                                                gVar.e = null;
                                                                gVar.f = null;
                                                                gVar.g = null;
                                                                gVar.h = null;
                                                                gVar.i = null;
                                                                gVar.r = 10;
                                                                if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                                                }
                                                            }
                                                        }
                                                    } catch (CancellationException e21) {
                                                        e = e21;
                                                        dVar5 = dVar2;
                                                    }
                                                }
                                                dVar5 = dVar2;
                                                Exception exc422 = exc;
                                                url11 = url9;
                                                b6Var10 = b6Var7;
                                                str15 = str2722;
                                                obj8 = obj7;
                                                Result.Companion companion422 = Result.INSTANCE;
                                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc422));
                                                j22 = j3522;
                                                dVar3 = dVar5;
                                                url13 = url11;
                                                j23 = j20;
                                                bVar17 = bVar16;
                                                j24 = j22;
                                                if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                                }
                                            }
                                            if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                                                long length2 = dVar3.g().exists() ? dVar3.g().length() : 0L;
                                                xb.b("Download failed after retry: cacheKey=" + dVar3.b() + str16 + j24 + ", partialBytes=" + length2 + str18 + (m8026exceptionOrNullimpl != null ? m8026exceptionOrNullimpl.getClass().getSimpleName() : null) + str15 + (m8026exceptionOrNullimpl != null ? m8026exceptionOrNullimpl.getMessage() : null), m8026exceptionOrNullimpl);
                                                NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                                i iVar = new i(dVar3, null);
                                                gVar.b = dVar3;
                                                gVar.c = m8026exceptionOrNullimpl;
                                                gVar.d = null;
                                                gVar.e = null;
                                                gVar.f = null;
                                                gVar.g = null;
                                                gVar.h = null;
                                                gVar.i = null;
                                                gVar.r = 11;
                                                if (BuildersKt.withContext(nonCancellable2, iVar, gVar) == obj8) {
                                                    return obj8;
                                                }
                                                dVar6 = dVar3;
                                                Result.Companion companion5 = Result.INSTANCE;
                                                if (m8026exceptionOrNullimpl == null) {
                                                    m8026exceptionOrNullimpl = new IOException("Download failed for " + dVar6.b());
                                                }
                                                return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                                            }
                                            str22 = str16;
                                            Mutex mutex15 = b6Var10.m;
                                            gVar.b = b6Var10;
                                            gVar.c = url13;
                                            gVar.d = bVar17;
                                            gVar.e = dVar3;
                                            gVar.f = m8023constructorimpl;
                                            gVar.g = mutex15;
                                            gVar.h = null;
                                            gVar.i = null;
                                            gVar.j = j24;
                                            gVar.k = j23;
                                            b6 b6Var17 = b6Var10;
                                            gVar.r = 12;
                                            if (mutex15.lock(null, gVar) == obj8) {
                                                return obj8;
                                            }
                                            b6Var11 = b6Var17;
                                            obj9 = m8023constructorimpl;
                                            bVar18 = bVar17;
                                            mutex7 = mutex15;
                                            try {
                                                m8028isFailureimpl = Result.m8028isFailureimpl(obj9);
                                                if (m8028isFailureimpl != 0) {
                                                    obj9 = null;
                                                }
                                                l2 = (Long) obj9;
                                                try {
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            if (l2 == null) {
                                                long longValue3 = l2.longValue();
                                                if (dVar3.e() > 0 && longValue3 > 0) {
                                                    try {
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        th = th;
                                                        r4 = mutex7;
                                                        r4.unlock(null);
                                                        throw th;
                                                    }
                                                    if (dVar3.g().length() < dVar3.e() + longValue3) {
                                                        j25 = j23;
                                                        url14 = url13;
                                                        d2 = longValue3;
                                                        if (d2 > 0) {
                                                            try {
                                                                String b4 = dVar3.b();
                                                                long d3 = dVar3.d();
                                                                Object obj13 = obj8;
                                                                long length3 = dVar3.g().exists() ? dVar3.g().length() : 0L;
                                                                StringBuilder sb3 = new StringBuilder();
                                                                Mutex mutex16 = mutex7;
                                                                try {
                                                                    sb3.append("Download empty: cacheKey=");
                                                                    sb3.append(b4);
                                                                    sb3.append(str22);
                                                                    sb3.append(j24);
                                                                    sb3.append(", existingBytes=");
                                                                    sb3.append(d3);
                                                                    sb3.append(str21);
                                                                    sb3.append(longValue3);
                                                                    sb3.append(str19);
                                                                    sb3.append(length3);
                                                                    xb.e(sb3.toString(), null, 2, null);
                                                                    NonCancellable nonCancellable3 = NonCancellable.INSTANCE;
                                                                    j jVar = new j(dVar3, null);
                                                                    gVar.b = dVar3;
                                                                    mutex9 = mutex16;
                                                                    try {
                                                                        gVar.c = mutex9;
                                                                        gVar.d = null;
                                                                        gVar.e = null;
                                                                        gVar.f = null;
                                                                        gVar.g = null;
                                                                        gVar.r = 14;
                                                                        if (BuildersKt.withContext(nonCancellable3, jVar, gVar) == obj13) {
                                                                            return obj13;
                                                                        }
                                                                        mutex8 = mutex9;
                                                                        dVar8 = dVar3;
                                                                        Result.Companion companion6 = Result.INSTANCE;
                                                                        m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Downloaded file for " + dVar8.b() + " is empty.")));
                                                                        mutex13 = mutex8;
                                                                        mutex13.unlock(null);
                                                                        return m8023constructorimpl2;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        th = th;
                                                                        mutex7 = mutex9;
                                                                        r4 = mutex7;
                                                                        r4.unlock(null);
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    mutex9 = mutex16;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                th = th;
                                                                r4 = mutex7;
                                                                r4.unlock(null);
                                                                throw th;
                                                            }
                                                        } else {
                                                            Object obj14 = obj8;
                                                            Mutex mutex17 = mutex7;
                                                            try {
                                                                try {
                                                                    long length4 = dVar3.g().length();
                                                                    if (j24 == -1 || d2 >= j24 || length4 != d2) {
                                                                        i2 = 0;
                                                                    }
                                                                    str23 = str21;
                                                                    int i8 = i2;
                                                                    try {
                                                                        if (i8 != 0) {
                                                                            obj10 = obj14;
                                                                            StringBuilder sb4 = new StringBuilder();
                                                                            i3 = i8;
                                                                            sb4.append("Partial request for ");
                                                                            sb4.append(j24);
                                                                            sb4.append(" bytes returned complete file of ");
                                                                            sb4.append(d2);
                                                                            sb4.append(" bytes (verified on disk: ");
                                                                            sb4.append(length4);
                                                                            sb4.append(" bytes)");
                                                                            xb.a(sb4.toString(), (Throwable) null, 2, (Object) null);
                                                                            f2 = dVar3.c();
                                                                        } else {
                                                                            i3 = i8;
                                                                            obj10 = obj14;
                                                                            if (j24 != -1 && d2 < j24) {
                                                                                xb.a("Partial request returned fewer bytes than requested (" + d2 + " < " + j24 + ") but on-disk size (" + length4 + ") doesn't match. Storing as partial.", (Throwable) null, 2, (Object) null);
                                                                            }
                                                                            f2 = dVar3.f();
                                                                        }
                                                                        long j36 = d2;
                                                                        j26 = j25;
                                                                        j27 = (b6Var11.k.get() + longValue3) - j26;
                                                                        if (j27 > 0) {
                                                                            xb.a("Cache size limit check: Need to free " + j27 + " bytes for " + dVar3.b(), (Throwable) null, 2, (Object) null);
                                                                            w3 w3Var = b6Var11.d;
                                                                            n nVar = b6Var11.new n();
                                                                            gVar.b = b6Var11;
                                                                            gVar.c = url14;
                                                                            gVar.d = bVar18;
                                                                            gVar.e = dVar3;
                                                                            mutex10 = mutex17;
                                                                            gVar.f = mutex10;
                                                                            gVar.g = f2;
                                                                            gVar.j = j24;
                                                                            gVar.k = j26;
                                                                            b6 b6Var18 = b6Var11;
                                                                            file6 = f2;
                                                                            gVar.l = longValue3;
                                                                            gVar.m = j36;
                                                                            i5 = i3;
                                                                            gVar.o = i5;
                                                                            gVar.n = j27;
                                                                            gVar.r = 15;
                                                                            obj12 = w3Var.a(nVar, j27, gVar);
                                                                            coroutine_suspended = obj10;
                                                                            if (obj12 == coroutine_suspended) {
                                                                                return coroutine_suspended;
                                                                            }
                                                                            j30 = j36;
                                                                            bVar20 = bVar18;
                                                                            url16 = url14;
                                                                            b6Var13 = b6Var18;
                                                                            j31 = j24;
                                                                            j32 = longValue3;
                                                                            try {
                                                                                i6 = i5;
                                                                                longValue = ((Number) obj12).longValue();
                                                                                if (longValue <= 0) {
                                                                                    try {
                                                                                        obj10 = coroutine_suspended;
                                                                                        b6Var13.k.addAndGet(-longValue);
                                                                                        long j37 = b6Var13.k.get();
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        mutex11 = mutex10;
                                                                                        try {
                                                                                            sb5.append("Freed ");
                                                                                            sb5.append(longValue);
                                                                                            sb5.append(" bytes via LRU. New cache size: ");
                                                                                            sb5.append(j37);
                                                                                            xb.a(sb5.toString(), (Throwable) null, 2, (Object) null);
                                                                                        } catch (Throwable th10) {
                                                                                            th = th10;
                                                                                            th = th;
                                                                                            r4 = mutex11;
                                                                                            r4.unlock(null);
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th11) {
                                                                                        th = th11;
                                                                                        mutex11 = mutex10;
                                                                                    }
                                                                                } else {
                                                                                    obj10 = coroutine_suspended;
                                                                                    mutex11 = mutex10;
                                                                                }
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                            }
                                                                            try {
                                                                                if (b6Var13.k.get() + j32 <= j26) {
                                                                                    long j38 = b6Var13.k.get();
                                                                                    xb.b("Cache space insufficient after eviction: cacheKey=" + dVar3.b() + str23 + j32 + ", currentCacheSize=" + j38 + ", cacheSizeLimit=" + j26 + ", spaceNeeded=" + j27 + ", freedBytes=" + longValue, (Throwable) null, 2, (Object) null);
                                                                                    NonCancellable nonCancellable4 = NonCancellable.INSTANCE;
                                                                                    k kVar = new k(dVar3, null);
                                                                                    gVar.b = dVar3;
                                                                                    mutex10 = mutex11;
                                                                                    gVar.c = mutex10;
                                                                                    gVar.d = null;
                                                                                    gVar.e = null;
                                                                                    gVar.f = null;
                                                                                    gVar.g = null;
                                                                                    gVar.r = 16;
                                                                                    Object withContext = BuildersKt.withContext(nonCancellable4, kVar, gVar);
                                                                                    Object obj15 = obj10;
                                                                                    if (withContext == obj15) {
                                                                                        return obj15;
                                                                                    }
                                                                                    dVar10 = dVar3;
                                                                                    mutex8 = mutex10;
                                                                                    Result.Companion companion7 = Result.INSTANCE;
                                                                                    m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Cannot cache " + dVar10.b() + ". Not enough space freed after eviction.")));
                                                                                    mutex13 = mutex8;
                                                                                    mutex13.unlock(null);
                                                                                    return m8023constructorimpl2;
                                                                                }
                                                                                mutex10 = mutex11;
                                                                                i4 = i6;
                                                                                b6Var12 = b6Var13;
                                                                                j28 = j32;
                                                                                file5 = file6;
                                                                                bVar19 = bVar20;
                                                                                url15 = url16;
                                                                                j29 = j30;
                                                                                j24 = j31;
                                                                                try {
                                                                                    x3 x3Var4 = b6Var12.b;
                                                                                    File g4 = dVar3.g();
                                                                                    gVar.b = b6Var12;
                                                                                    gVar.c = url15;
                                                                                    gVar.d = bVar19;
                                                                                    gVar.e = dVar3;
                                                                                    gVar.f = mutex10;
                                                                                    gVar.g = file5;
                                                                                    gVar.j = j24;
                                                                                    gVar.k = j28;
                                                                                    gVar.l = j29;
                                                                                    gVar.o = i4;
                                                                                    b6 b6Var19 = b6Var12;
                                                                                    gVar.r = 17;
                                                                                    obj12 = x3Var4.b(g4, file5, gVar);
                                                                                    obj11 = obj10;
                                                                                    if (obj12 != obj11) {
                                                                                        return obj11;
                                                                                    }
                                                                                    url17 = url15;
                                                                                    dVar9 = dVar3;
                                                                                    j33 = j24;
                                                                                    bVar21 = bVar19;
                                                                                    file7 = file5;
                                                                                    b6Var14 = b6Var19;
                                                                                    if (((Boolean) obj12).booleanValue()) {
                                                                                        xb.b("Cache finalize failed: cacheKey=" + dVar9.b() + ", tempFile=" + dVar9.g().getAbsolutePath() + ", targetFile=" + file7.getAbsolutePath() + str17 + dVar9.g().exists() + str19 + (dVar9.g().exists() ? dVar9.g().length() : 0L), (Throwable) null, 2, (Object) null);
                                                                                        NonCancellable nonCancellable5 = NonCancellable.INSTANCE;
                                                                                        l lVar = new l(dVar9, null);
                                                                                        gVar.b = dVar9;
                                                                                        gVar.c = mutex10;
                                                                                        gVar.d = null;
                                                                                        gVar.e = null;
                                                                                        gVar.f = null;
                                                                                        gVar.g = null;
                                                                                        gVar.r = 18;
                                                                                        if (BuildersKt.withContext(nonCancellable5, lVar, gVar) == obj11) {
                                                                                            return obj11;
                                                                                        }
                                                                                        dVar12 = dVar9;
                                                                                        mutex8 = mutex10;
                                                                                        Result.Companion companion8 = Result.INSTANCE;
                                                                                        m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Failed to finalize cached file for " + dVar12.b())));
                                                                                        mutex13 = mutex8;
                                                                                        mutex13.unlock(null);
                                                                                        return m8023constructorimpl2;
                                                                                    }
                                                                                    b6Var14.k.addAndGet(j28);
                                                                                    if (j33 != -1 && i4 == 0) {
                                                                                        b bVar24 = new b(0L, j33 - 1, j29, file7, 0L, false, 16, null);
                                                                                        String url19 = url17.toString();
                                                                                        Intrinsics.checkNotNullExpressionValue(url19, str6);
                                                                                        b6Var14.a(url19, bVar24, bVar21);
                                                                                        mutex13 = mutex10;
                                                                                        xb.a("Successfully cached " + dVar9.b() + " (" + file7.getAbsolutePath() + ", " + j29 + " bytes total, " + j28 + " new). New cache size: " + b6Var14.k.get(), (Throwable) null, 2, (Object) null);
                                                                                        m8023constructorimpl2 = Result.m8023constructorimpl(file7);
                                                                                        mutex13.unlock(null);
                                                                                        return m8023constructorimpl2;
                                                                                    }
                                                                                    str24 = str6;
                                                                                    long currentTimeMillis = System.currentTimeMillis() + ((Number) b6Var14.i.mo4828invoke()).longValue();
                                                                                    Object obj16 = obj11;
                                                                                    String url20 = url17.toString();
                                                                                    Intrinsics.checkNotNullExpressionValue(url20, str24);
                                                                                    u3 u3Var2 = new u3(url20, currentTimeMillis);
                                                                                    x3 x3Var5 = b6Var14.b;
                                                                                    gVar.b = b6Var14;
                                                                                    url18 = url17;
                                                                                    gVar.c = url18;
                                                                                    gVar.d = bVar21;
                                                                                    gVar.e = dVar9;
                                                                                    gVar.f = mutex10;
                                                                                    gVar.g = file7;
                                                                                    gVar.j = j28;
                                                                                    gVar.k = j29;
                                                                                    gVar.r = 19;
                                                                                    if (x3Var5.a(url18, u3Var2, gVar) == obj16) {
                                                                                        return obj16;
                                                                                    }
                                                                                    b6Var15 = b6Var14;
                                                                                    dVar11 = dVar9;
                                                                                    long j39 = j29;
                                                                                    file8 = file7;
                                                                                    j34 = j39;
                                                                                    mutex12 = mutex10;
                                                                                    try {
                                                                                        b bVar25 = new b(0L, j34 - 1, j34, file8, 0L, true, 16, null);
                                                                                        String url21 = url18.toString();
                                                                                        Intrinsics.checkNotNullExpressionValue(url21, str24);
                                                                                        b6Var15.a(url21, bVar25, bVar21);
                                                                                        mutex13 = mutex12;
                                                                                        dVar9 = dVar11;
                                                                                        long j40 = j34;
                                                                                        b6Var14 = b6Var15;
                                                                                        file7 = file8;
                                                                                        j29 = j40;
                                                                                        xb.a("Successfully cached " + dVar9.b() + " (" + file7.getAbsolutePath() + ", " + j29 + " bytes total, " + j28 + " new). New cache size: " + b6Var14.k.get(), (Throwable) null, 2, (Object) null);
                                                                                        m8023constructorimpl2 = Result.m8023constructorimpl(file7);
                                                                                        mutex13.unlock(null);
                                                                                        return m8023constructorimpl2;
                                                                                    } catch (Throwable th13) {
                                                                                        th = th13;
                                                                                        mutex7 = mutex12;
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    r4 = mutex10;
                                                                                    r4.unlock(null);
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                                mutex10 = mutex11;
                                                                                th = th;
                                                                                r4 = mutex10;
                                                                                r4.unlock(null);
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            mutex10 = mutex17;
                                                                            j28 = longValue3;
                                                                            i4 = i3;
                                                                            bVar19 = bVar18;
                                                                            url15 = url14;
                                                                            b6Var12 = b6Var11;
                                                                            file5 = f2;
                                                                            j29 = j36;
                                                                            x3 x3Var42 = b6Var12.b;
                                                                            File g42 = dVar3.g();
                                                                            gVar.b = b6Var12;
                                                                            gVar.c = url15;
                                                                            gVar.d = bVar19;
                                                                            gVar.e = dVar3;
                                                                            gVar.f = mutex10;
                                                                            gVar.g = file5;
                                                                            gVar.j = j24;
                                                                            gVar.k = j28;
                                                                            gVar.l = j29;
                                                                            gVar.o = i4;
                                                                            b6 b6Var192 = b6Var12;
                                                                            gVar.r = 17;
                                                                            obj12 = x3Var42.b(g42, file5, gVar);
                                                                            obj11 = obj10;
                                                                            if (obj12 != obj11) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                        mutex7 = mutex17;
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    m8028isFailureimpl = mutex17;
                                                                    th = th;
                                                                    mutex7 = m8028isFailureimpl;
                                                                    r4 = mutex7;
                                                                    r4.unlock(null);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                m8028isFailureimpl = mutex17;
                                                            }
                                                        }
                                                        r4 = mutex7;
                                                        r4.unlock(null);
                                                        throw th;
                                                    }
                                                }
                                                j25 = j23;
                                                url14 = url13;
                                                d2 = dVar3.d() + longValue3;
                                                if (d2 > 0) {
                                                }
                                                r4 = mutex7;
                                                r4.unlock(null);
                                                throw th;
                                            }
                                            Object obj17 = obj8;
                                            Mutex mutex18 = mutex7;
                                            String str28 = str19;
                                            String str29 = str17;
                                            long length5 = dVar3.g().exists() ? dVar3.g().length() : 0L;
                                            xb.b("Download result null: cacheKey=" + dVar3.b() + str29 + dVar3.g().exists() + str28 + length5, (Throwable) null, 2, (Object) null);
                                            NonCancellable nonCancellable6 = NonCancellable.INSTANCE;
                                            m mVar = new m(dVar3, null);
                                            gVar.b = dVar3;
                                            gVar.c = mutex18;
                                            gVar.d = null;
                                            gVar.e = null;
                                            gVar.f = null;
                                            gVar.g = null;
                                            gVar.r = 13;
                                            if (BuildersKt.withContext(nonCancellable6, mVar, gVar) == obj17) {
                                                return obj17;
                                            }
                                            dVar7 = dVar3;
                                            mutex8 = mutex18;
                                            Result.Companion companion9 = Result.INSTANCE;
                                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Download succeeded but result was null for " + dVar7.b())));
                                            mutex13 = mutex8;
                                            mutex13.unlock(null);
                                            return m8023constructorimpl2;
                                        }
                                        str10 = url3;
                                        if (j4 != -1) {
                                            mutex4 = mutex3;
                                            j8 = j3;
                                            obj3 = coroutine_suspended;
                                            r48 = a2;
                                        } else {
                                            r48 = a2;
                                            obj3 = coroutine_suspended;
                                            j8 = j3;
                                            mutex4 = mutex3;
                                            try {
                                                a2 = b6Var.b.a(new URL(url4.getProtocol(), url4.getHost(), url4.getPort(), url4.getFile() + "?partial=" + j4));
                                            } catch (Throwable th19) {
                                                th = th19;
                                                mutex3 = mutex4;
                                                th2 = th;
                                                mutex2 = mutex3;
                                                r10 = mutex2;
                                                r10.unlock(null);
                                                throw th2;
                                            }
                                        }
                                        if (a2.exists() && a2.length() > 0) {
                                            if (j4 == -1) {
                                                break;
                                            } else {
                                                if (u3Var != null) {
                                                    try {
                                                        break;
                                                    } catch (Throwable th20) {
                                                        th = th20;
                                                        mutex2 = mutex4;
                                                        th2 = th;
                                                        r10 = mutex2;
                                                        r10.unlock(null);
                                                        throw th2;
                                                    }
                                                }
                                                xb.a("File for " + str7 + " became valid after acquiring lock. Returning cached file.", (Throwable) null, 2, (Object) null);
                                                x3 x3Var6 = b6Var.b;
                                                gVar.b = b6Var;
                                                gVar.c = url4;
                                                gVar.d = bVar3;
                                                Mutex mutex19 = mutex4;
                                                gVar.e = mutex19;
                                                gVar.f = a2;
                                                gVar.g = null;
                                                gVar.h = null;
                                                gVar.j = j4;
                                                long j41 = j8;
                                                gVar.k = j41;
                                                gVar.r = 5;
                                                coroutine_suspended = obj3;
                                                if (x3Var6.a(a2, gVar) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                url7 = url4;
                                                j13 = j41;
                                                mutex6 = mutex19;
                                                b6 b6Var20 = b6Var;
                                                bVar8 = bVar3;
                                                b6Var4 = b6Var20;
                                                aVar2 = new c.a(a2);
                                                b6Var3 = b6Var4;
                                                url6 = url7;
                                                j6 = j13;
                                                obj = coroutine_suspended;
                                                j7 = j4;
                                                r8 = mutex6;
                                                bVar5 = bVar8;
                                                aVar = aVar2;
                                                obj2 = null;
                                                c2 = 2;
                                                r8.unlock(obj2);
                                                if (!(aVar instanceof c.a)) {
                                                }
                                            }
                                            mutex13.unlock(null);
                                            return m8023constructorimpl2;
                                        }
                                        j9 = j8;
                                        mutex5 = mutex4;
                                        obj4 = obj3;
                                        if (j4 != -1 && u3Var != null && b6Var.d.a(u3Var)) {
                                            xb.a("Evicting expired file " + str7 + " before download.", (Throwable) null, 2, (Object) null);
                                            long length6 = r48.length();
                                            x3 x3Var7 = b6Var.b;
                                            gVar.b = b6Var;
                                            gVar.c = url4;
                                            gVar.d = bVar3;
                                            gVar.e = mutex5;
                                            gVar.f = str7;
                                            String str30 = str10;
                                            gVar.g = str30;
                                            b bVar26 = bVar3;
                                            Object obj18 = r48;
                                            gVar.h = obj18;
                                            gVar.i = a2;
                                            gVar.j = j4;
                                            gVar.k = j9;
                                            gVar.l = length6;
                                            ?? r482 = obj18;
                                            gVar.r = 6;
                                            obj12 = x3Var7.a(url4, gVar);
                                            if (obj12 == obj4) {
                                                return obj4;
                                            }
                                            obj5 = obj4;
                                            str12 = str30;
                                            bVar7 = bVar26;
                                            j11 = j9;
                                            file3 = a2;
                                            r10 = mutex5;
                                            j12 = length6;
                                            file4 = r482;
                                            j14 = r482;
                                            if (!((Boolean) obj12).booleanValue()) {
                                                if (j12 > 0) {
                                                    b6Var.k.addAndGet(-j12);
                                                }
                                                v3 v3Var = b6Var.e;
                                                m8 m8Var = m8.b;
                                                gVar.b = b6Var;
                                                gVar.c = url4;
                                                gVar.d = bVar7;
                                                gVar.e = r10;
                                                gVar.f = str7;
                                                gVar.g = str12;
                                                gVar.h = file4;
                                                gVar.i = file3;
                                                gVar.j = j4;
                                                j10 = j11;
                                                gVar.k = j10;
                                                str13 = str12;
                                                gVar.r = 7;
                                                Object a8 = v3Var.a(url4, m8Var, gVar);
                                                obj = obj5;
                                                if (a8 == obj) {
                                                    return obj;
                                                }
                                                b6Var5 = b6Var;
                                                str14 = str7;
                                                try {
                                                    b bVar27 = bVar7;
                                                    URL url22 = url4;
                                                    xb.a("Expired file " + str14 + " evicted. New size: " + b6Var5.k.get(), (Throwable) null, 2, (Object) null);
                                                    url4 = url22;
                                                    str7 = str14;
                                                    file = file4;
                                                    file2 = file3;
                                                    str11 = str13;
                                                    b6Var = b6Var5;
                                                    bVar6 = bVar27;
                                                    bVar12 = bVar27;
                                                    if (!b6Var.b.a(b6Var.h)) {
                                                    }
                                                    j6 = j19;
                                                    b6Var3 = b6Var;
                                                    aVar = bVar13;
                                                    j7 = j4;
                                                    obj2 = null;
                                                    bVar14 = bVar15;
                                                    r8 = bVar14;
                                                    bVar5 = bVar6;
                                                    url6 = url4;
                                                    r8.unlock(obj2);
                                                    if (!(aVar instanceof c.a)) {
                                                    }
                                                } catch (Throwable th21) {
                                                    th3 = th21;
                                                    th2 = th3;
                                                    r10.unlock(null);
                                                    throw th2;
                                                }
                                            } else {
                                                j10 = j11;
                                                obj = obj5;
                                                String str31 = str12;
                                                bVar6 = bVar7;
                                                file = file4;
                                                file2 = file3;
                                                str11 = str31;
                                                bVar12 = j14;
                                                if (!b6Var.b.a(b6Var.h)) {
                                                }
                                                j6 = j19;
                                                b6Var3 = b6Var;
                                                aVar = bVar13;
                                                j7 = j4;
                                                obj2 = null;
                                                bVar14 = bVar15;
                                                r8 = bVar14;
                                                bVar5 = bVar6;
                                                url6 = url4;
                                                r8.unlock(obj2);
                                                if (!(aVar instanceof c.a)) {
                                                }
                                            }
                                        } else {
                                            obj = obj4;
                                            file = r48;
                                            str11 = str10;
                                            file2 = a2;
                                            bVar6 = bVar3;
                                            j10 = j9;
                                            r10 = mutex5;
                                            bVar12 = r48;
                                            try {
                                                try {
                                                    if (!b6Var.b.a(b6Var.h)) {
                                                        long j42 = b6Var.h;
                                                        bVar15 = r10;
                                                        long j43 = b6Var.k.get();
                                                        StringBuilder sb6 = new StringBuilder();
                                                        j19 = j10;
                                                        sb6.append("Disk space insufficient: cacheKey=");
                                                        sb6.append(str7);
                                                        sb6.append(", requiredBytes=");
                                                        sb6.append(j42);
                                                        sb6.append(", currentCacheSizeBytes=");
                                                        sb6.append(j43);
                                                        xb.e(sb6.toString(), null, 2, null);
                                                        bVar13 = new c.b(new IOException("Not enough free space on device for " + str7 + ". Required: " + b6Var.h));
                                                        c2 = 2;
                                                    } else {
                                                        bVar12 = r10;
                                                        j19 = j10;
                                                        File a9 = b6Var.b.a();
                                                        if (a9 != null && a9.exists()) {
                                                            File file9 = new File(a9, "temp_" + System.nanoTime() + str9 + url4.hashCode() + ".tmp");
                                                            if (bVar6 != null && bVar6.a(j4)) {
                                                                xb.a("Resuming download for " + str7 + " from byte " + bVar6.a(), (Throwable) null, 2, (Object) null);
                                                                try {
                                                                    FilesKt.copyTo$default(bVar6.b(), file9, false, 0, 6, null);
                                                                    pair = TuplesKt.to(Boxing.boxLong(bVar6.a()), Boxing.boxLong(bVar6.a()));
                                                                } catch (Exception e22) {
                                                                    xb.e("Failed to copy existing data for resume, starting fresh download for " + str7, e22);
                                                                    pair = TuplesKt.to(Boxing.boxLong(0L), Boxing.boxLong(0L));
                                                                }
                                                            } else {
                                                                pair = TuplesKt.to(Boxing.boxLong(0L), Boxing.boxLong(0L));
                                                            }
                                                            long longValue4 = ((Number) pair.component1()).longValue();
                                                            long longValue5 = ((Number) pair.component2()).longValue();
                                                            xb.d("Starting download task for " + str7 + " to " + file9.getName() + " (resuming from byte " + longValue4 + ")", null, 2, null);
                                                            aVar = new c.C0215c(new d(file9, a9, longValue4, longValue5, file2, file, str7, str11));
                                                            j6 = j19;
                                                            b6Var3 = b6Var;
                                                            j7 = j4;
                                                            obj2 = null;
                                                            c2 = 2;
                                                            bVar14 = bVar12;
                                                            r8 = bVar14;
                                                            bVar5 = bVar6;
                                                            url6 = url4;
                                                            r8.unlock(obj2);
                                                            if (!(aVar instanceof c.a)) {
                                                            }
                                                        }
                                                        String str32 = null;
                                                        c2 = 2;
                                                        xb.b("Cache directory unavailable: cacheKey=" + str7 + ", cacheDir=" + str32 + ", exists=" + (a9 != null ? Boxing.boxBoolean(a9.exists()) : null), (Throwable) null, 2, (Object) null);
                                                        StringBuilder sb7 = new StringBuilder();
                                                        sb7.append("Cache directory not available for ");
                                                        sb7.append(str7);
                                                        bVar13 = new c.b(new IOException(sb7.toString()));
                                                        bVar15 = bVar12;
                                                    }
                                                    j6 = j19;
                                                    b6Var3 = b6Var;
                                                    aVar = bVar13;
                                                    j7 = j4;
                                                    obj2 = null;
                                                    bVar14 = bVar15;
                                                    r8 = bVar14;
                                                    bVar5 = bVar6;
                                                    url6 = url4;
                                                    r8.unlock(obj2);
                                                    if (!(aVar instanceof c.a)) {
                                                    }
                                                } catch (Throwable th22) {
                                                    th3 = th22;
                                                    r10 = bVar12;
                                                    th2 = th3;
                                                    r10.unlock(null);
                                                    throw th2;
                                                }
                                            } catch (Throwable th23) {
                                                th3 = th23;
                                            }
                                        }
                                    } catch (Throwable th24) {
                                        th = th24;
                                    }
                                }
                            } catch (Throwable th25) {
                                th = th25;
                                th2 = th;
                                mutex2 = mutex3;
                                r10 = mutex2;
                                r10.unlock(null);
                                throw th2;
                            }
                            break;
                        case 1:
                            str = ", tempFileSize=";
                            long j44 = gVar.k;
                            j4 = gVar.j;
                            Mutex mutex20 = (Mutex) gVar.e;
                            b bVar28 = (b) gVar.d;
                            URL url23 = (URL) gVar.c;
                            b6Var = (b6) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            bVar2 = bVar28;
                            url2 = url23;
                            str4 = ", requestedBytes=";
                            str5 = ", tempFileExists=";
                            mutex3 = mutex20;
                            str2 = ", message=";
                            str3 = ", errorType=";
                            j3 = j44;
                            url3 = url2.toString();
                            Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                            if (j4 != -1) {
                            }
                            if (bVar2 == null) {
                                break;
                            }
                            str8 = ", downloadedBytes=";
                            a2 = b6Var.b.a(url2);
                            str9 = "_";
                            x3 x3Var22 = b6Var.b;
                            gVar.b = b6Var;
                            gVar.c = url2;
                            gVar.d = bVar2;
                            gVar.e = mutex3;
                            gVar.f = str7;
                            gVar.g = url3;
                            gVar.h = a2;
                            gVar.j = j4;
                            gVar.k = j3;
                            b bVar222 = bVar2;
                            gVar.r = 3;
                            obj12 = x3Var22.b(url2, gVar);
                            if (obj12 != coroutine_suspended) {
                            }
                            break;
                        case 2:
                            str = ", tempFileSize=";
                            long j45 = gVar.k;
                            j5 = gVar.j;
                            r8 = (Mutex) gVar.e;
                            b bVar29 = (b) gVar.d;
                            url5 = (URL) gVar.c;
                            b6 b6Var21 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                b6Var2 = b6Var21;
                                str4 = ", requestedBytes=";
                                str5 = ", tempFileExists=";
                                str6 = "toString(...)";
                                bVar4 = bVar29;
                                str2 = ", message=";
                                str3 = ", errorType=";
                                j3 = j45;
                                b6Var3 = b6Var2;
                                url6 = url5;
                                j6 = j3;
                                str8 = ", downloadedBytes=";
                                c2 = 2;
                                aVar = new c.a(bVar4.b());
                                obj = coroutine_suspended;
                                j7 = j5;
                                bVar5 = bVar4;
                                obj2 = null;
                                r8.unlock(obj2);
                                if (!(aVar instanceof c.a)) {
                                }
                            } catch (Throwable th26) {
                                th2 = th26;
                                mutex2 = r8;
                                r10 = mutex2;
                                r10.unlock(null);
                                throw th2;
                            }
                            break;
                        case 3:
                            str = ", tempFileSize=";
                            long j46 = gVar.k;
                            j4 = gVar.j;
                            File file10 = (File) gVar.h;
                            String str33 = (String) gVar.g;
                            String str34 = (String) gVar.f;
                            Mutex mutex21 = (Mutex) gVar.e;
                            b bVar30 = (b) gVar.d;
                            URL url24 = (URL) gVar.c;
                            b6Var = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                str9 = "_";
                                str8 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                bVar3 = bVar30;
                                url4 = url24;
                                a2 = file10;
                                str7 = str34;
                                str4 = ", requestedBytes=";
                                str5 = ", tempFileExists=";
                                url3 = str33;
                                mutex3 = mutex21;
                                str2 = ", message=";
                                str3 = ", errorType=";
                                j3 = j46;
                                u3 u3Var3 = (u3) obj12;
                                if (j4 == -1) {
                                    break;
                                }
                                str10 = url3;
                                if (j4 != -1) {
                                }
                                if (a2.exists()) {
                                    if (j4 == -1) {
                                    }
                                    mutex13.unlock(null);
                                    return m8023constructorimpl2;
                                }
                                j9 = j8;
                                mutex5 = mutex4;
                                obj4 = obj3;
                                if (j4 != -1) {
                                }
                                obj = obj4;
                                file = r48;
                                str11 = str10;
                                file2 = a2;
                                bVar6 = bVar3;
                                j10 = j9;
                                r10 = mutex5;
                                bVar12 = r48;
                                if (!b6Var.b.a(b6Var.h)) {
                                }
                                j6 = j19;
                                b6Var3 = b6Var;
                                aVar = bVar13;
                                j7 = j4;
                                obj2 = null;
                                bVar14 = bVar15;
                                r8 = bVar14;
                                bVar5 = bVar6;
                                url6 = url4;
                                r8.unlock(obj2);
                                if (!(aVar instanceof c.a)) {
                                }
                            } catch (Throwable th27) {
                                th = th27;
                                mutex2 = mutex21;
                                th2 = th;
                                r10 = mutex2;
                                r10.unlock(null);
                                throw th2;
                            }
                            break;
                        case 4:
                            long j47 = gVar.k;
                            long j48 = gVar.j;
                            File file11 = (File) gVar.f;
                            mutex6 = (Mutex) gVar.e;
                            b bVar31 = (b) gVar.d;
                            URL url25 = (URL) gVar.c;
                            b6 b6Var22 = (b6) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            b6Var4 = b6Var22;
                            url7 = url25;
                            str5 = ", tempFileExists=";
                            str8 = ", downloadedBytes=";
                            str6 = "toString(...)";
                            bVar8 = bVar31;
                            a2 = file11;
                            j13 = j47;
                            str = ", tempFileSize=";
                            str2 = ", message=";
                            str3 = ", errorType=";
                            str4 = ", requestedBytes=";
                            j4 = j48;
                            aVar2 = new c.a(a2);
                            b6Var3 = b6Var4;
                            url6 = url7;
                            j6 = j13;
                            obj = coroutine_suspended;
                            j7 = j4;
                            r8 = mutex6;
                            bVar5 = bVar8;
                            aVar = aVar2;
                            obj2 = null;
                            c2 = 2;
                            r8.unlock(obj2);
                            if (!(aVar instanceof c.a)) {
                            }
                            break;
                        case 5:
                            long j49 = gVar.k;
                            long j50 = gVar.j;
                            File file12 = (File) gVar.f;
                            mutex6 = (Mutex) gVar.e;
                            b bVar32 = (b) gVar.d;
                            URL url26 = (URL) gVar.c;
                            b6 b6Var23 = (b6) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            b6Var4 = b6Var23;
                            url7 = url26;
                            str5 = ", tempFileExists=";
                            str8 = ", downloadedBytes=";
                            str6 = "toString(...)";
                            bVar8 = bVar32;
                            a2 = file12;
                            j13 = j49;
                            str = ", tempFileSize=";
                            str2 = ", message=";
                            str3 = ", errorType=";
                            str4 = ", requestedBytes=";
                            j4 = j50;
                            aVar2 = new c.a(a2);
                            b6Var3 = b6Var4;
                            url6 = url7;
                            j6 = j13;
                            obj = coroutine_suspended;
                            j7 = j4;
                            r8 = mutex6;
                            bVar5 = bVar8;
                            aVar = aVar2;
                            obj2 = null;
                            c2 = 2;
                            r8.unlock(obj2);
                            if (!(aVar instanceof c.a)) {
                            }
                            break;
                        case 6:
                            long j51 = gVar.l;
                            long j52 = gVar.k;
                            long j53 = gVar.j;
                            File file13 = (File) gVar.i;
                            long j54 = j53;
                            File file14 = (File) gVar.h;
                            String str35 = (String) gVar.g;
                            String str36 = (String) gVar.f;
                            Mutex mutex22 = (Mutex) gVar.e;
                            b bVar33 = (b) gVar.d;
                            URL url27 = (URL) gVar.c;
                            b6Var = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                str12 = str35;
                                str9 = "_";
                                obj5 = coroutine_suspended;
                                j11 = j52;
                                bVar7 = bVar33;
                                url4 = url27;
                                str3 = ", errorType=";
                                str4 = ", requestedBytes=";
                                str8 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                j12 = j51;
                                str7 = str36;
                                str = ", tempFileSize=";
                                str2 = ", message=";
                                file3 = file13;
                                r10 = mutex22;
                                j4 = j54;
                                file4 = file14;
                                str5 = ", tempFileExists=";
                                j14 = j54;
                                if (!((Boolean) obj12).booleanValue()) {
                                }
                            } catch (Throwable th28) {
                                th2 = th28;
                                mutex2 = mutex22;
                                r10 = mutex2;
                                r10.unlock(null);
                                throw th2;
                            }
                            break;
                        case 7:
                            long j55 = gVar.k;
                            long j56 = gVar.j;
                            File file15 = (File) gVar.i;
                            File file16 = (File) gVar.h;
                            String str37 = (String) gVar.g;
                            String str38 = (String) gVar.f;
                            Mutex mutex23 = (Mutex) gVar.e;
                            b bVar34 = (b) gVar.d;
                            URL url28 = (URL) gVar.c;
                            b6 b6Var24 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                b6Var5 = b6Var24;
                                str13 = str37;
                                str9 = "_";
                                obj = coroutine_suspended;
                                str8 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                j10 = j55;
                                url4 = url28;
                                str14 = str38;
                                bVar7 = bVar34;
                                str = ", tempFileSize=";
                                str2 = ", message=";
                                str5 = ", tempFileExists=";
                                file4 = file16;
                                r10 = mutex23;
                                str3 = ", errorType=";
                                str4 = ", requestedBytes=";
                                j4 = j56;
                                file3 = file15;
                                b bVar272 = bVar7;
                                URL url222 = url4;
                                xb.a("Expired file " + str14 + " evicted. New size: " + b6Var5.k.get(), (Throwable) null, 2, (Object) null);
                                url4 = url222;
                                str7 = str14;
                                file = file4;
                                file2 = file3;
                                str11 = str13;
                                b6Var = b6Var5;
                                bVar6 = bVar272;
                                bVar12 = bVar272;
                                if (!b6Var.b.a(b6Var.h)) {
                                }
                                j6 = j19;
                                b6Var3 = b6Var;
                                aVar = bVar13;
                                j7 = j4;
                                obj2 = null;
                                bVar14 = bVar15;
                                r8 = bVar14;
                                bVar5 = bVar6;
                                url6 = url4;
                                r8.unlock(obj2);
                                if (!(aVar instanceof c.a)) {
                                }
                            } catch (Throwable th29) {
                                th = th29;
                                mutex2 = mutex23;
                                th2 = th;
                                r10 = mutex2;
                                r10.unlock(null);
                                throw th2;
                            }
                            break;
                        case 8:
                            long j57 = gVar.k;
                            long j58 = gVar.j;
                            dVar4 = (d) gVar.e;
                            bVar11 = (b) gVar.d;
                            url12 = (URL) gVar.c;
                            b6Var9 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                url8 = url12;
                                str16 = ", requestedBytes=";
                                str17 = ", tempFileExists=";
                                str8 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                j15 = j57;
                                j16 = j58;
                                i2 = 1;
                                a4 = ((Result) obj12).getValue();
                                str19 = ", tempFileSize=";
                                str18 = ", errorType=";
                                str15 = ", message=";
                                obj = coroutine_suspended;
                                ResultKt.throwOnFailure(a4);
                                m8023constructorimpl = Result.m8023constructorimpl(a4);
                                b6Var10 = b6Var9;
                                url13 = url8;
                                j23 = j15;
                                j24 = j16;
                                obj8 = obj;
                                str21 = str8;
                                b bVar232 = bVar11;
                                dVar3 = dVar4;
                                bVar17 = bVar232;
                            } catch (CancellationException e23) {
                                cancellationException = e23;
                                obj = coroutine_suspended;
                                obj6 = obj;
                                dVar3 = dVar4;
                                throw cancellationException;
                            } catch (Exception e24) {
                                str16 = ", requestedBytes=";
                                str17 = ", tempFileExists=";
                                obj = coroutine_suspended;
                                str8 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                j15 = j57;
                                j16 = j58;
                                i2 = 1;
                                str19 = ", tempFileSize=";
                                str18 = ", errorType=";
                                str15 = ", message=";
                                exc3 = e24;
                                b6Var7 = b6Var9;
                                exc = exc3;
                                bVar10 = bVar11;
                                j17 = j15;
                                j18 = j16;
                                d dVar132 = dVar4;
                                url9 = url12;
                                dVar2 = dVar132;
                                String simpleName222 = exc.getClass().getSimpleName();
                                if (dVar2.g().exists()) {
                                }
                                String b3222 = dVar2.b();
                                j20 = j17;
                                long e8222 = dVar2.e();
                                long j35222 = j18;
                                String message222 = exc.getMessage();
                                StringBuilder sb222 = new StringBuilder();
                                bVar16 = bVar10;
                                sb222.append("Download failed: cacheKey=");
                                sb222.append(b3222);
                                sb222.append(", startByte=");
                                sb222.append(e8222);
                                str21 = str8;
                                sb222.append(str21);
                                sb222.append(length);
                                sb222.append(str18);
                                sb222.append(simpleName222);
                                String str27222 = str20;
                                sb222.append(str27222);
                                sb222.append(message222);
                                xb.b(sb222.toString(), exc);
                                if (dVar2.e() > 0) {
                                }
                                dVar5 = dVar2;
                                Exception exc4222 = exc;
                                url11 = url9;
                                b6Var10 = b6Var7;
                                str15 = str27222;
                                obj8 = obj7;
                                Result.Companion companion4222 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc4222));
                                j22 = j35222;
                                dVar3 = dVar5;
                                url13 = url11;
                                j23 = j20;
                                bVar17 = bVar16;
                                j24 = j22;
                                if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                }
                            }
                            if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                            }
                            break;
                        case 9:
                            long j59 = gVar.k;
                            long j60 = gVar.j;
                            exc2 = (Exception) gVar.f;
                            dVar3 = (d) gVar.e;
                            b bVar35 = (b) gVar.d;
                            URL url29 = (URL) gVar.c;
                            b6 b6Var25 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                bVar16 = bVar35;
                                b6Var10 = b6Var25;
                                url11 = url29;
                                str16 = ", requestedBytes=";
                                str17 = ", tempFileExists=";
                                obj8 = coroutine_suspended;
                                str6 = "toString(...)";
                                j21 = j60;
                                a5 = ((Result) obj12).getValue();
                                str19 = ", tempFileSize=";
                                str18 = ", errorType=";
                                str21 = ", downloadedBytes=";
                                j20 = j59;
                                i2 = 1;
                                str15 = ", message=";
                                if (!Result.m8028isFailureimpl(a5)) {
                                    ?? m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(a5);
                                    if (m8026exceptionOrNullimpl2 != 0) {
                                        exc2 = m8026exceptionOrNullimpl2;
                                    }
                                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(exc2));
                                } else {
                                    ResultKt.throwOnFailure(a5);
                                    m8023constructorimpl = Result.m8023constructorimpl(a5);
                                }
                                j22 = j21;
                                url13 = url11;
                                j23 = j20;
                                bVar17 = bVar16;
                                j24 = j22;
                                if (!Result.m8028isFailureimpl(m8023constructorimpl)) {
                                }
                            } catch (CancellationException e25) {
                                cancellationException2 = e25;
                                obj6 = coroutine_suspended;
                                nonCancellable = NonCancellable.INSTANCE;
                                hVar = new h(dVar3, null);
                                gVar.b = cancellationException2;
                                gVar.c = null;
                                gVar.d = null;
                                gVar.e = null;
                                gVar.f = null;
                                gVar.g = null;
                                gVar.h = null;
                                gVar.i = null;
                                gVar.r = 10;
                                if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj6) {
                                }
                            }
                            break;
                        case 10:
                            CancellationException cancellationException3 = (CancellationException) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            throw cancellationException3;
                        case 11:
                            m8026exceptionOrNullimpl = (Throwable) gVar.c;
                            dVar6 = (d) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            Result.Companion companion52 = Result.INSTANCE;
                            if (m8026exceptionOrNullimpl == null) {
                            }
                            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                        case 12:
                            long j61 = gVar.k;
                            long j62 = gVar.j;
                            mutex7 = (Mutex) gVar.g;
                            Object obj19 = gVar.f;
                            d dVar14 = (d) gVar.e;
                            b bVar36 = (b) gVar.d;
                            URL url30 = (URL) gVar.c;
                            b6 b6Var26 = (b6) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            b6Var11 = b6Var26;
                            bVar18 = bVar36;
                            str19 = ", tempFileSize=";
                            str17 = ", tempFileExists=";
                            obj8 = coroutine_suspended;
                            str21 = ", downloadedBytes=";
                            str6 = "toString(...)";
                            url13 = url30;
                            obj9 = obj19;
                            str22 = ", requestedBytes=";
                            dVar3 = dVar14;
                            j24 = j62;
                            j23 = j61;
                            i2 = 1;
                            m8028isFailureimpl = Result.m8028isFailureimpl(obj9);
                            if (m8028isFailureimpl != 0) {
                            }
                            l2 = (Long) obj9;
                            if (l2 == null) {
                            }
                            break;
                        case 13:
                            mutex8 = (Mutex) gVar.c;
                            dVar7 = (d) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            Result.Companion companion92 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Download succeeded but result was null for " + dVar7.b())));
                            mutex13 = mutex8;
                            mutex13.unlock(null);
                            return m8023constructorimpl2;
                        case 14:
                            mutex8 = (Mutex) gVar.c;
                            dVar8 = (d) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            Result.Companion companion62 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Downloaded file for " + dVar8.b() + " is empty.")));
                            mutex13 = mutex8;
                            mutex13.unlock(null);
                            return m8023constructorimpl2;
                        case 15:
                            long j63 = gVar.n;
                            int i9 = gVar.o;
                            long j64 = gVar.m;
                            long j65 = gVar.l;
                            long j66 = gVar.k;
                            long j67 = gVar.j;
                            File file17 = (File) gVar.g;
                            Mutex mutex24 = (Mutex) gVar.f;
                            d dVar15 = (d) gVar.e;
                            bVar20 = (b) gVar.d;
                            url16 = (URL) gVar.c;
                            b6Var13 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                i5 = i9;
                                j30 = j64;
                                str17 = ", tempFileExists=";
                                str23 = ", downloadedBytes=";
                                str6 = "toString(...)";
                                mutex10 = mutex24;
                                j32 = j65;
                                dVar3 = dVar15;
                                j27 = j63;
                                str19 = ", tempFileSize=";
                                j31 = j67;
                                j26 = j66;
                                file6 = file17;
                                i6 = i5;
                                longValue = ((Number) obj12).longValue();
                                if (longValue <= 0) {
                                }
                                if (b6Var13.k.get() + j32 <= j26) {
                                }
                            } catch (Throwable th30) {
                                th = th30;
                                r4 = mutex24;
                                break;
                            }
                            break;
                        case 16:
                            mutex8 = (Mutex) gVar.c;
                            dVar10 = (d) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            Result.Companion companion72 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Cannot cache " + dVar10.b() + ". Not enough space freed after eviction.")));
                            mutex13 = mutex8;
                            mutex13.unlock(null);
                            return m8023constructorimpl2;
                        case 17:
                            int i10 = gVar.o;
                            long j68 = gVar.l;
                            long j69 = gVar.k;
                            j33 = gVar.j;
                            File file18 = (File) gVar.g;
                            Mutex mutex25 = (Mutex) gVar.f;
                            d dVar16 = (d) gVar.e;
                            b bVar37 = (b) gVar.d;
                            URL url31 = (URL) gVar.c;
                            b6Var14 = (b6) gVar.b;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                str19 = ", tempFileSize=";
                                str17 = ", tempFileExists=";
                                obj11 = coroutine_suspended;
                                str6 = "toString(...)";
                                mutex10 = mutex25;
                                dVar9 = dVar16;
                                bVar21 = bVar37;
                                i4 = i10;
                                url17 = url31;
                                file7 = file18;
                                j28 = j69;
                                j29 = j68;
                                if (((Boolean) obj12).booleanValue()) {
                                }
                            } catch (Throwable th31) {
                                r4 = mutex25;
                                th = th31;
                                break;
                            }
                            break;
                        case 18:
                            mutex8 = (Mutex) gVar.c;
                            dVar12 = (d) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            Result.Companion companion82 = Result.INSTANCE;
                            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(new IOException("Failed to finalize cached file for " + dVar12.b())));
                            mutex13 = mutex8;
                            mutex13.unlock(null);
                            return m8023constructorimpl2;
                        case 19:
                            j34 = gVar.k;
                            long j70 = gVar.j;
                            file8 = (File) gVar.g;
                            mutex12 = (Mutex) gVar.f;
                            dVar11 = (d) gVar.e;
                            bVar21 = (b) gVar.d;
                            URL url32 = (URL) gVar.c;
                            b6Var15 = (b6) gVar.b;
                            ResultKt.throwOnFailure(obj12);
                            url18 = url32;
                            j28 = j70;
                            str24 = "toString(...)";
                            b bVar252 = new b(0L, j34 - 1, j34, file8, 0L, true, 16, null);
                            String url212 = url18.toString();
                            Intrinsics.checkNotNullExpressionValue(url212, str24);
                            b6Var15.a(url212, bVar252, bVar21);
                            mutex13 = mutex12;
                            dVar9 = dVar11;
                            long j402 = j34;
                            b6Var14 = b6Var15;
                            file7 = file8;
                            j29 = j402;
                            xb.a("Successfully cached " + dVar9.b() + " (" + file7.getAbsolutePath() + ", " + j29 + " bytes total, " + j28 + " new). New cache size: " + b6Var14.k.get(), (Throwable) null, 2, (Object) null);
                            m8023constructorimpl2 = Result.m8023constructorimpl(file7);
                            mutex13.unlock(null);
                            return m8023constructorimpl2;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (gVar.r) {
            }
        } catch (Throwable th32) {
            th2 = th32;
            mutex2 = mutex;
        }
        gVar = new g(continuation);
        Object obj122 = gVar.p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(URL url, long j2, Continuation continuation) {
        s sVar;
        int i2;
        String str;
        try {
            if (continuation instanceof s) {
                sVar = (s) continuation;
                int i3 = sVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    sVar.f = i3 - Integer.MIN_VALUE;
                    s sVar2 = sVar;
                    Object obj = sVar2.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = sVar2.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (j2 == -1) {
                            str = "complete file";
                        } else {
                            str = j2 + " bytes";
                        }
                        xb.a("Starting new download for " + str, (Throwable) null, 2, (Object) null);
                        b a2 = a(url, j2);
                        sVar2.b = url;
                        sVar2.c = j2;
                        sVar2.f = 1;
                        Object a3 = a(url, j2, a2, sVar2);
                        url = a3;
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = sVar2.c;
                        ResultKt.throwOnFailure(obj);
                        url = ((Result) obj).getValue();
                    }
                    return url;
                }
            }
            if (i2 != 0) {
            }
            return url;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            String valueOf = j2 == -1 ? "complete" : String.valueOf(j2);
            xb.b("New download failed: url=" + url + ", requestedBytes=" + valueOf + ", errorType=" + e3.getClass().getSimpleName() + ", message=" + e3.getMessage(), e3);
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e3));
        }
        sVar = new s(continuation);
        s sVar22 = sVar;
        Object obj2 = sVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sVar22.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:24|25))(1:26))(2:46|(2:48|49)(2:50|(1:52)(1:53)))|27|28|(3:30|31|32)(4:33|34|35|(1:37)(5:38|14|15|16|17))))|27|28|(0)(0))|55|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0035, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:28:0x006e, B:30:0x0076, B:33:0x0081, B:35:0x0086), top: B:27:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:28:0x006e, B:30:0x0076, B:33:0x0081, B:35:0x0086), top: B:27:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        o oVar;
        ?? coroutine_suspended;
        int i2;
        Mutex mutex;
        b6 b6Var;
        Mutex mutex2;
        Exception e2;
        Object a2;
        Mutex mutex3;
        b6 b6Var2;
        try {
            if (continuation instanceof o) {
                oVar = (o) continuation;
                int i3 = oVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.d;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = oVar.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.l.get()) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.m;
                        oVar.b = this;
                        oVar.c = mutex;
                        oVar.f = 1;
                        if (mutex.lock(null, oVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        b6Var = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) oVar.c;
                            b6Var2 = (b6) oVar.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex3 = mutex3;
                                long longValue = ((Number) obj).longValue();
                                b6Var2.k.set(longValue);
                                xb.a("Cache initialized. Current size: " + longValue + " bytes.", (Throwable) null, 2, (Object) null);
                                b6Var2.l.set(true);
                                coroutine_suspended = mutex3;
                            } catch (Exception e3) {
                                e2 = e3;
                                b6Var = b6Var2;
                                mutex2 = mutex3;
                                xb.b("Cache initialization failed: errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                                b6Var.l.set(false);
                                coroutine_suspended = mutex2;
                                Unit unit = Unit.INSTANCE;
                                coroutine_suspended.unlock(null);
                                return unit;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            coroutine_suspended.unlock(null);
                            return unit2;
                        }
                        Mutex mutex4 = (Mutex) oVar.c;
                        b6Var = (b6) oVar.b;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                    }
                    if (!b6Var.l.get()) {
                        Unit unit3 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit3;
                    }
                    xb.a("Initializing DefaultDownloaderCache state...", (Throwable) null, 2, (Object) null);
                    try {
                        x3 x3Var = b6Var.b;
                        oVar.b = b6Var;
                        oVar.c = mutex;
                        oVar.f = 2;
                        a2 = x3Var.a(oVar);
                    } catch (Exception e4) {
                        mutex2 = mutex;
                        e2 = e4;
                        xb.b("Cache initialization failed: errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                        b6Var.l.set(false);
                        coroutine_suspended = mutex2;
                        Unit unit22 = Unit.INSTANCE;
                        coroutine_suspended.unlock(null);
                        return unit22;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex;
                    obj = a2;
                    b6Var2 = b6Var;
                    long longValue2 = ((Number) obj).longValue();
                    b6Var2.k.set(longValue2);
                    xb.a("Cache initialized. Current size: " + longValue2 + " bytes.", (Throwable) null, 2, (Object) null);
                    b6Var2.l.set(true);
                    coroutine_suspended = mutex3;
                    Unit unit222 = Unit.INSTANCE;
                    coroutine_suspended.unlock(null);
                    return unit222;
                }
            }
            if (!b6Var.l.get()) {
            }
        } catch (Throwable th) {
            coroutine_suspended = mutex;
            th = th;
            coroutine_suspended.unlock(null);
            throw th;
        }
        oVar = new o(continuation);
        Object obj2 = oVar.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = oVar.f;
        if (i2 != 0) {
        }
    }

    public final Long a(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null)) {
            return StringsKt.toLongOrNull(StringsKt.substringAfterLast$default(str, "_", (String) null, 2, (Object) null));
        }
        return null;
    }

    public final b a(URL url, long j2) {
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        b bVar = (b) this.n.get(url2);
        if (bVar == null) {
            return null;
        }
        if (!bVar.b().exists()) {
            this.n.remove(url2);
            return null;
        }
        if (j2 == -1) {
            xb.a("Found cached download to resume complete file for " + url2 + ": " + bVar.a() + " bytes (complete=" + bVar.c() + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.b(j2)) {
            xb.a("Found suitable cached download for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.a(j2)) {
            xb.a("Found cached download to resume from for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        xb.a("Cached download exists but can't be used for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0344  */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.chartboost.sdk.impl.b6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.chartboost.sdk.impl.b6] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.chartboost.sdk.impl.b6] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r3v35, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    @Override // com.chartboost.sdk.impl.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, long j2, Continuation continuation) {
        p pVar;
        ?? r3;
        String str;
        ?? r32;
        Deferred deferred;
        String str2;
        URL url2;
        long j3;
        b6 b6Var;
        Deferred deferred2;
        b a2;
        String str3;
        File a3;
        u3 u3Var;
        String str4;
        b bVar;
        URL url3;
        b6 b6Var2;
        File file;
        b6 b6Var3;
        Deferred deferred3;
        b6 b6Var4;
        ?? r10;
        File file2;
        b bVar2;
        Object value;
        Object obj;
        Object obj2;
        try {
            if (continuation instanceof p) {
                pVar = (p) continuation;
                int i2 = pVar.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pVar.j = i2 - Integer.MIN_VALUE;
                    p pVar2 = pVar;
                    Object obj3 = pVar2.h;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = pVar2.j;
                    String str5 = "Removed download task reference for ";
                    switch (r3) {
                        case 0:
                            ResultKt.throwOnFailure(obj3);
                            pVar2.b = this;
                            url2 = url;
                            pVar2.c = url2;
                            j3 = j2;
                            pVar2.g = j3;
                            pVar2.j = 1;
                            if (a(pVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            b6Var = this;
                            str = url2.toString();
                            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                            if (j3 != -1) {
                                str = str + "_" + j3;
                            }
                            deferred2 = (Deferred) b6Var.j.get(str);
                            if (deferred2 == null) {
                                xb.a("Download already in progress for " + str + ", awaiting result.", (Throwable) null, 2, (Object) null);
                                pVar2.b = null;
                                pVar2.c = null;
                                pVar2.j = 2;
                                Object a4 = b6Var.a(url2, deferred2, pVar2);
                                return a4 == coroutine_suspended ? coroutine_suspended : a4;
                            }
                            Pair b2 = b6Var.b(url2, j3);
                            if (b2 != null) {
                                xb.a("Found suitable ongoing download: " + b2.getFirst() + " for request " + str, (Throwable) null, 2, (Object) null);
                                pVar2.b = null;
                                pVar2.c = null;
                                pVar2.j = 3;
                                Object a5 = b6Var.a(url2, j3, b2, pVar2);
                                return a5 == coroutine_suspended ? coroutine_suspended : a5;
                            }
                            a2 = b6Var.a(url2, j3);
                            if (j3 == -1) {
                                a3 = b6Var.b.a(url2);
                                str3 = "Removed download task reference for ";
                            } else {
                                str3 = "Removed download task reference for ";
                                a3 = b6Var.b.a(new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), url2.getFile() + "?partial=" + j3));
                            }
                            if (j3 == -1) {
                                x3 x3Var = b6Var.b;
                                pVar2.b = b6Var;
                                pVar2.c = url2;
                                pVar2.d = str;
                                pVar2.e = a2;
                                pVar2.f = a3;
                                pVar2.g = j3;
                                pVar2.j = 4;
                                Object b3 = x3Var.b(url2, pVar2);
                                if (b3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str4 = str;
                                bVar = a2;
                                url3 = url2;
                                obj3 = b3;
                                File file3 = a3;
                                b6Var2 = b6Var;
                                file = file3;
                                u3Var = (u3) obj3;
                                url2 = url3;
                                a2 = bVar;
                                str = str4;
                                b6 b6Var5 = b6Var2;
                                a3 = file;
                                b6Var3 = b6Var5;
                                if (a2 == null && a2.b(j3)) {
                                    xb.a("Found suitable cached download for " + str + ": " + a2.b().getName() + " (" + a2.a() + " bytes)", (Throwable) null, 2, (Object) null);
                                    x3 x3Var2 = b6Var3.b;
                                    File b4 = a2.b();
                                    pVar2.b = a2;
                                    pVar2.c = null;
                                    pVar2.d = null;
                                    pVar2.e = null;
                                    pVar2.f = null;
                                    pVar2.j = 5;
                                    if (x3Var2.a(b4, pVar2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    bVar2 = a2;
                                    Result.Companion companion = Result.INSTANCE;
                                    return Result.m8023constructorimpl(bVar2.b());
                                }
                                if (b6Var3.a(j3, a3)) {
                                    if (u3Var != null && b6Var3.d.a(u3Var)) {
                                        xb.a("Cache hit for " + str + ", but file has expired. Will be evicted during download.", (Throwable) null, 2, (Object) null);
                                    } else {
                                        xb.a("Cache hit for " + str + " at " + a3.getAbsolutePath(), (Throwable) null, 2, (Object) null);
                                        x3 x3Var3 = b6Var3.b;
                                        pVar2.b = a3;
                                        pVar2.c = null;
                                        pVar2.d = null;
                                        pVar2.e = null;
                                        pVar2.f = null;
                                        pVar2.j = 6;
                                        if (x3Var3.a(a3, pVar2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        file2 = a3;
                                        return Result.m8023constructorimpl(file2);
                                    }
                                } else {
                                    xb.a("Cache miss for " + str + ".", (Throwable) null, 2, (Object) null);
                                }
                                deferred = BuildersKt__Builders_commonKt.async$default(b6Var3.a, b6Var3.f, null, b6Var3.new q(url2, j3, a2, null), 2, null);
                                deferred3 = (Deferred) b6Var3.j.putIfAbsent(str, deferred);
                                if (deferred3 != null) {
                                    xb.a("Race condition detected for " + str + " download start. Cancelling redundant task and awaiting existing.", (Throwable) null, 2, (Object) null);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Race condition resolved by existing download for ");
                                    sb.append(str);
                                    JobKt__JobKt.cancel$default(deferred, sb.toString(), null, 2, null);
                                    pVar2.b = null;
                                    pVar2.c = null;
                                    pVar2.d = null;
                                    pVar2.e = null;
                                    pVar2.f = null;
                                    pVar2.j = 7;
                                    Object a6 = b6Var3.a(url2, deferred3, pVar2);
                                    return a6 == coroutine_suspended ? coroutine_suspended : a6;
                                }
                                xb.a("Successfully registered download task for " + str + ". Awaiting result.", (Throwable) null, 2, (Object) null);
                                try {
                                    pVar2.b = b6Var3;
                                    pVar2.c = str;
                                    pVar2.d = deferred;
                                    pVar2.e = null;
                                    pVar2.f = null;
                                    pVar2.j = 8;
                                    obj3 = deferred.await(pVar2);
                                } catch (CancellationException e2) {
                                    e = e2;
                                    str5 = str3;
                                    b6Var4 = b6Var3;
                                    str2 = str;
                                    r3 = deferred;
                                    xb.e("Download task cancelled by caller: cacheKey=" + str2, null, 2, null);
                                    r3.cancel(e);
                                    Result.Companion companion2 = Result.INSTANCE;
                                    obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                    b6Var4.j.remove(str2, r3);
                                    xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                    return obj;
                                } catch (Exception e3) {
                                    e = e3;
                                    str5 = str3;
                                    b6Var4 = b6Var3;
                                    str2 = str;
                                    r3 = deferred;
                                    xb.b("Download task await failed: cacheKey=" + str2 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                    Result.Companion companion3 = Result.INSTANCE;
                                    obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                    b6Var4.j.remove(str2, r3);
                                    xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    str5 = str3;
                                    r32 = b6Var3;
                                    r32.j.remove(str, deferred);
                                    xb.a(str5 + str + ".", (Throwable) null, 2, (Object) null);
                                    throw th;
                                }
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r10 = b6Var3;
                                str2 = str;
                                r3 = deferred;
                                try {
                                    value = ((Result) obj3).getValue();
                                    if (Result.m8029isSuccessimpl(value)) {
                                        try {
                                            x3 x3Var4 = r10.b;
                                            pVar2.b = r10;
                                            pVar2.c = str2;
                                            pVar2.d = r3;
                                            pVar2.e = value;
                                            pVar2.f = value;
                                            pVar2.j = 9;
                                            if (x3Var4.a((File) value, pVar2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } catch (CancellationException e4) {
                                            e = e4;
                                            b6Var4 = r10;
                                            str5 = str3;
                                            xb.e("Download task cancelled by caller: cacheKey=" + str2, null, 2, null);
                                            r3.cancel(e);
                                            Result.Companion companion22 = Result.INSTANCE;
                                            obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                            b6Var4.j.remove(str2, r3);
                                            xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                            return obj;
                                        } catch (Exception e5) {
                                            e = e5;
                                            b6Var4 = r10;
                                            str5 = str3;
                                            xb.b("Download task await failed: cacheKey=" + str2 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                            Result.Companion companion32 = Result.INSTANCE;
                                            obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                            b6Var4.j.remove(str2, r3);
                                            xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                            return obj;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            pVar2 = r10;
                                            str5 = str3;
                                            deferred = r3;
                                            r32 = pVar2;
                                            str = str2;
                                            r32.j.remove(str, deferred);
                                            xb.a(str5 + str + ".", (Throwable) null, 2, (Object) null);
                                            throw th;
                                        }
                                    }
                                    obj = value;
                                    b6Var4 = r10;
                                    obj2 = r3;
                                    b6Var4.j.remove(str2, obj2);
                                    xb.a(str3 + str2 + ".", (Throwable) null, 2, (Object) null);
                                } catch (CancellationException e6) {
                                    e = e6;
                                    str5 = str3;
                                    b6Var4 = r10;
                                    xb.e("Download task cancelled by caller: cacheKey=" + str2, null, 2, null);
                                    r3.cancel(e);
                                    Result.Companion companion222 = Result.INSTANCE;
                                    obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                    b6Var4.j.remove(str2, r3);
                                    xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                    return obj;
                                } catch (Exception e7) {
                                    e = e7;
                                    str5 = str3;
                                    b6Var4 = r10;
                                    xb.b("Download task await failed: cacheKey=" + str2 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                    Result.Companion companion322 = Result.INSTANCE;
                                    obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                    b6Var4.j.remove(str2, r3);
                                    xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str5 = str3;
                                    pVar2 = r10;
                                    deferred = r3;
                                    r32 = pVar2;
                                    str = str2;
                                    r32.j.remove(str, deferred);
                                    xb.a(str5 + str + ".", (Throwable) null, 2, (Object) null);
                                    throw th;
                                }
                                return obj;
                            }
                            u3Var = null;
                            b6Var3 = b6Var;
                            if (a2 == null) {
                            }
                            if (b6Var3.a(j3, a3)) {
                            }
                            deferred = BuildersKt__Builders_commonKt.async$default(b6Var3.a, b6Var3.f, null, b6Var3.new q(url2, j3, a2, null), 2, null);
                            deferred3 = (Deferred) b6Var3.j.putIfAbsent(str, deferred);
                            if (deferred3 != null) {
                            }
                            break;
                        case 1:
                            j3 = pVar2.g;
                            URL url4 = (URL) pVar2.c;
                            b6 b6Var6 = (b6) pVar2.b;
                            ResultKt.throwOnFailure(obj3);
                            url2 = url4;
                            b6Var = b6Var6;
                            str = url2.toString();
                            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                            if (j3 != -1) {
                            }
                            deferred2 = (Deferred) b6Var.j.get(str);
                            if (deferred2 == null) {
                            }
                            break;
                        case 2:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 3:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 4:
                            j3 = pVar2.g;
                            file = (File) pVar2.f;
                            bVar = (b) pVar2.e;
                            str4 = (String) pVar2.d;
                            url3 = (URL) pVar2.c;
                            b6Var2 = (b6) pVar2.b;
                            ResultKt.throwOnFailure(obj3);
                            str3 = "Removed download task reference for ";
                            u3Var = (u3) obj3;
                            url2 = url3;
                            a2 = bVar;
                            str = str4;
                            b6 b6Var52 = b6Var2;
                            a3 = file;
                            b6Var3 = b6Var52;
                            if (a2 == null) {
                            }
                            if (b6Var3.a(j3, a3)) {
                            }
                            deferred = BuildersKt__Builders_commonKt.async$default(b6Var3.a, b6Var3.f, null, b6Var3.new q(url2, j3, a2, null), 2, null);
                            deferred3 = (Deferred) b6Var3.j.putIfAbsent(str, deferred);
                            if (deferred3 != null) {
                            }
                            break;
                        case 5:
                            bVar2 = (b) pVar2.b;
                            ResultKt.throwOnFailure(obj3);
                            Result.Companion companion4 = Result.INSTANCE;
                            return Result.m8023constructorimpl(bVar2.b());
                        case 6:
                            file2 = (File) pVar2.b;
                            ResultKt.throwOnFailure(obj3);
                            return Result.m8023constructorimpl(file2);
                        case 7:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 8:
                            r3 = (Deferred) pVar2.d;
                            str2 = (String) pVar2.c;
                            r10 = (b6) pVar2.b;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                str3 = "Removed download task reference for ";
                                r3 = r3;
                                r10 = r10;
                                value = ((Result) obj3).getValue();
                                if (Result.m8029isSuccessimpl(value)) {
                                }
                                obj = value;
                                b6Var4 = r10;
                                obj2 = r3;
                                b6Var4.j.remove(str2, obj2);
                                xb.a(str3 + str2 + ".", (Throwable) null, 2, (Object) null);
                            } catch (CancellationException e8) {
                                e = e8;
                                b6Var4 = r10;
                                xb.e("Download task cancelled by caller: cacheKey=" + str2, null, 2, null);
                                r3.cancel(e);
                                Result.Companion companion2222 = Result.INSTANCE;
                                obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                b6Var4.j.remove(str2, r3);
                                xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            } catch (Exception e9) {
                                e = e9;
                                b6Var4 = r10;
                                xb.b("Download task await failed: cacheKey=" + str2 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                Result.Companion companion3222 = Result.INSTANCE;
                                obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                b6Var4.j.remove(str2, r3);
                                xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            } catch (Throwable th4) {
                                th = th4;
                                pVar2 = r10;
                                deferred = r3;
                                r32 = pVar2;
                                str = str2;
                                r32.j.remove(str, deferred);
                                xb.a(str5 + str + ".", (Throwable) null, 2, (Object) null);
                                throw th;
                            }
                            return obj;
                        case 9:
                            obj = pVar2.e;
                            r3 = (Deferred) pVar2.d;
                            str2 = (String) pVar2.c;
                            b6Var4 = (b6) pVar2.b;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                str3 = "Removed download task reference for ";
                                obj2 = r3;
                                b6Var4.j.remove(str2, obj2);
                                xb.a(str3 + str2 + ".", (Throwable) null, 2, (Object) null);
                            } catch (CancellationException e10) {
                                e = e10;
                                xb.e("Download task cancelled by caller: cacheKey=" + str2, null, 2, null);
                                r3.cancel(e);
                                Result.Companion companion22222 = Result.INSTANCE;
                                obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                b6Var4.j.remove(str2, r3);
                                xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            } catch (Exception e11) {
                                e = e11;
                                xb.b("Download task await failed: cacheKey=" + str2 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                Result.Companion companion32222 = Result.INSTANCE;
                                obj = Result.m8023constructorimpl(ResultKt.createFailure(e));
                                b6Var4.j.remove(str2, r3);
                                xb.a(str5 + str2 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            }
                            return obj;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r3) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        pVar = new p(continuation);
        p pVar22 = pVar;
        Object obj32 = pVar22.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = pVar22.j;
        String str52 = "Removed download task reference for ";
    }

    @Override // com.chartboost.sdk.impl.b7
    public Object a(URL url, Continuation continuation) {
        return b7.a.a(this, url, continuation);
    }

    @Override // com.chartboost.sdk.impl.b7
    public Flow a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.e.a(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, File file, long j2, long j3, File file2, Continuation continuation) {
        r rVar;
        int i2;
        File file3;
        Object a2;
        File file4 = file;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i3 = rVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.f = i3 - Integer.MIN_VALUE;
                r rVar2 = rVar;
                Object obj = rVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = rVar2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j2 == -1) {
                        if (j3 > 0) {
                            xb.a("Resuming complete download from byte " + j3, (Throwable) null, 2, (Object) null);
                            w8 w8Var = this.c;
                            rVar2.f = 1;
                            Object a3 = w8Var.a(url, file, j3, Long.MAX_VALUE, rVar2);
                            return a3 == coroutine_suspended ? coroutine_suspended : a3;
                        }
                        w8 w8Var2 = this.c;
                        rVar2.f = 2;
                        Object a4 = w8Var2.a(url, file4, rVar2);
                        return a4 == coroutine_suspended ? coroutine_suspended : a4;
                    }
                    if (1 > j3 || j3 >= j2) {
                        if (j3 >= j2) {
                            xb.a("Already have sufficient bytes (" + j3 + ") for requested " + j2, (Throwable) null, 2, (Object) null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8023constructorimpl(Boxing.boxLong(0L));
                        }
                        rVar2.f = 4;
                        Object a5 = this.c.a(url, file, 0L, j2 - 1, rVar2);
                        return a5 == coroutine_suspended ? coroutine_suspended : a5;
                    }
                    file3 = new File(file2, "temp_resume_" + System.nanoTime() + "_" + url.hashCode() + ".tmp");
                    rVar2.b = file4;
                    rVar2.c = file3;
                    rVar2.f = 3;
                    a2 = this.c.a(url, file3, j3, j2 - 1, rVar2);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    File file5 = (File) rVar2.c;
                    File file6 = (File) rVar2.b;
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                    file3 = file5;
                    file4 = file6;
                }
                if (!Result.m8029isSuccessimpl(a2)) {
                    try {
                        FilesKt.appendBytes(file4, FilesKt.readBytes(file3));
                        file3.delete();
                        return a2;
                    } catch (Exception e2) {
                        file3.delete();
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(e2));
                    }
                }
                file3.delete();
                return a2;
            }
        }
        rVar = new r(continuation);
        r rVar22 = rVar;
        Object obj2 = rVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = rVar22.f;
        if (i2 != 0) {
        }
        if (!Result.m8029isSuccessimpl(a2)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, b bVar, b bVar2) {
        b bVar3 = (b) this.n.get(str);
        if (bVar.c()) {
            xb.a("Storing complete download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            if (bVar3 != null && !Intrinsics.areEqual(bVar3.b(), bVar.b()) && bVar3.b().exists()) {
                long length = bVar3.b().length();
                if (bVar3.b().delete()) {
                    this.k.addAndGet(-length);
                    xb.a("Cleaned up old partial file. Freed " + length + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            this.n.put(str, bVar);
            return;
        }
        if (bVar3 == null) {
            xb.a("Storing first partial download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
        } else {
            if (bVar3.c()) {
                xb.a("Keeping existing complete download for " + str + " instead of partial (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else if (bVar.a() > bVar3.a()) {
                xb.a("Replacing smaller partial download for " + str + " (" + bVar3.a() + " -> " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else {
                xb.a("Keeping existing larger partial download for " + str + " (" + bVar3.a() + " vs " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            }
            if (!Intrinsics.areEqual(bVar3.b(), bVar.b()) && bVar.b().exists()) {
                long length2 = bVar.b().length();
                if (bVar.b().delete()) {
                    this.k.addAndGet(-length2);
                    xb.a("Cleaned up inferior new partial file. Freed " + length2 + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            if (bVar2 == null) {
                b bVar4 = (b) this.n.get(str);
                if (Intrinsics.areEqual(bVar2.b(), bVar.b())) {
                    return;
                }
                if (Intrinsics.areEqual(bVar2.b(), bVar4 != null ? bVar4.b() : null) || !bVar2.b().exists()) {
                    return;
                }
                long length3 = bVar2.b().length();
                if (bVar2.b().delete()) {
                    this.k.addAndGet(-length3);
                    xb.a("Cleaned up resumed partial file. Freed " + length3 + " bytes.", (Throwable) null, 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar3 != null && !Intrinsics.areEqual(bVar3.b(), bVar.b()) && bVar3.b().exists()) {
            long length4 = bVar3.b().length();
            if (bVar3.b().delete()) {
                this.k.addAndGet(-length4);
                xb.a("Cleaned up replaced partial file. Freed " + length4 + " bytes.", (Throwable) null, 2, (Object) null);
            }
        }
        this.n.put(str, bVar);
        if (bVar2 == null) {
        }
    }

    public final void a(URL url, File file, long j2, boolean z) {
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        xb.a("Updating download info for " + url2 + ": " + j2 + " bytes, complete=" + z, (Throwable) null, 2, (Object) null);
        b bVar = new b(0L, j2 - 1, j2, file, System.currentTimeMillis(), z);
        b bVar2 = (b) this.n.get(url2);
        if (bVar2 != null) {
            if (bVar.c() && !bVar2.c()) {
                xb.a("Replacing partial download with complete download for " + url2, (Throwable) null, 2, (Object) null);
                if (!Intrinsics.areEqual(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length);
                        xb.a("Cleaned up old partial file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.n.put(url2, bVar);
                this.k.addAndGet(j2);
                return;
            }
            if (bVar.a() > bVar2.a()) {
                xb.a("Replacing smaller download (" + bVar2.a() + ") with larger (" + bVar.a() + ") for " + url2, (Throwable) null, 2, (Object) null);
                if (!Intrinsics.areEqual(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length2 = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length2);
                        xb.a("Cleaned up old smaller file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.n.put(url2, bVar);
                this.k.addAndGet(j2 - bVar2.a());
                return;
            }
            xb.a("Keeping existing download for " + url2 + " (existing: " + bVar2.a() + ", new: " + bVar.a() + ")", (Throwable) null, 2, (Object) null);
            return;
        }
        xb.a("Storing new download info for " + url2, (Throwable) null, 2, (Object) null);
        this.n.put(url2, bVar);
        this.k.addAndGet(j2);
    }

    public final boolean a(long j2, File file) {
        return j2 != -1 ? !(!file.exists() || file.length() < j2) : !(!file.exists() || file.length() <= 0);
    }
}
