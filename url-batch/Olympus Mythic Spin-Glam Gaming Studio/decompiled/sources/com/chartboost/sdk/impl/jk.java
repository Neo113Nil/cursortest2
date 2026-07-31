package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes10.dex */
public final class jk {
    public final b a;
    public float b;
    public final CoroutineDispatcher c;
    public final Lazy d;
    public long e;
    public long f;
    public Job g;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {
        public static final a b = new a();

        public a() {
            super(3, kk.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final of invoke(hk p0, th p1, u8 u8Var) {
            of b2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            b2 = kk.b(p0, p1, u8Var);
            return b2;
        }
    }

    public interface b {
        void d();
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jk.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            jk.this.b();
            return Unit.INSTANCE;
        }
    }

    public jk(hk videoAsset, b listener, float f, th tempHelper, u8 u8Var, CoroutineDispatcher coroutineDispatcher, Function3 randomAccessFileFactory) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(randomAccessFileFactory, "randomAccessFileFactory");
        this.a = listener;
        this.b = f;
        this.c = coroutineDispatcher;
        this.d = LazyKt.lazy(new d(randomAccessFileFactory, videoAsset, tempHelper, u8Var));
        this.e = videoAsset.c();
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ Function3 b;
        public final /* synthetic */ hk c;
        public final /* synthetic */ th d;
        public final /* synthetic */ u8 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function3 function3, hk hkVar, th thVar, u8 u8Var) {
            super(0);
            this.b = function3;
            this.c = hkVar;
            this.d = thVar;
            this.e = u8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final of mo4828invoke() {
            return (of) this.b.invoke(this.c, this.d, this.e);
        }
    }

    public final of d() {
        return (of) this.d.getValue();
    }

    public final void c() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.c), null, null, new c(null), 3, null);
        this.g = launch$default;
    }

    public final void b() {
        of d2 = d();
        long c2 = d2 != null ? d2.c() : 0L;
        long j = this.e;
        if (c2 == j) {
            f();
        } else if ((c2 - this.f) / j > this.b) {
            f();
        } else {
            c();
        }
    }

    public /* synthetic */ jk(hk hkVar, b bVar, float f, th thVar, u8 u8Var, CoroutineDispatcher coroutineDispatcher, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hkVar, bVar, (i & 4) != 0 ? 0.01f : f, (i & 8) != 0 ? new th() : thVar, u8Var, (i & 32) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 64) != 0 ? a.b : function3);
    }

    public final void f() {
        this.f = 0L;
        e();
        this.a.d();
    }

    public final void a() {
        if (this.f == 0) {
            of d2 = d();
            this.f = d2 != null ? d2.c() : 0L;
        }
    }

    public final void e() {
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.g = null;
    }

    public final void a(int i) {
        long j = this.e;
        if (j <= 0 || i <= 0) {
            return;
        }
        float f = j / 1000000.0f;
        this.b = ((f / 1000.0f) / ((i / 60000.0f) * 0.0075f)) / (f * 8);
    }
}
