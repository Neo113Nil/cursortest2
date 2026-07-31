package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes11.dex */
public final class hd implements gd {
    public static final a f = new a(null);
    public final Handler a;
    public final long b;
    public final CoroutineScope c;
    public Runnable d;
    public Job e;

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

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
            c cVar = hd.this.new c(continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                Runnable c = hd.this.c();
                if (c != null) {
                    c.run();
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    long j = hd.this.b;
                    this.c = coroutineScope;
                    this.b = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Runnable c2 = hd.this.c();
                    if (c2 != null) {
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public hd(Handler handler, long j, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = handler;
        this.b = j;
        this.c = scope;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Runnable c() {
        return this.d;
    }

    @Override // com.chartboost.sdk.impl.gd
    public void start() {
        a();
    }

    @Override // com.chartboost.sdk.impl.gd
    public void cancel() {
        b();
    }

    public /* synthetic */ hd(Handler handler, long j, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i & 2) != 0 ? 200L : j, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default(null, 1, null))) : coroutineScope);
    }

    @Override // com.chartboost.sdk.impl.gd
    public void pause() {
        b();
        Runnable c2 = c();
        if (c2 != null) {
            this.a.post(c2);
        }
    }

    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            xb.a("Unexpected error when scheduling mraid recurring task.", th);
        }

        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    public final void d() {
        Job launch$default;
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, new b(CoroutineExceptionHandler.Key), null, new c(null), 2, null);
        this.e = launch$default;
    }

    @Override // com.chartboost.sdk.impl.gd
    public void a() {
        d();
    }

    public final void b() {
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // com.chartboost.sdk.impl.gd
    public void a(Runnable runnable) {
        this.d = runnable;
    }
}
