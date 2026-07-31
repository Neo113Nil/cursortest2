package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.tk;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class uk implements tk {
    public final g1 a;
    public final tk.b b;
    public final CoroutineDispatcher c;
    public Job d;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ uk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, uk ukVar, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = ukVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
            L1a:
                long r3 = r5.c
                r5.b = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                com.chartboost.sdk.impl.uk r6 = r5.d
                com.chartboost.sdk.impl.g1 r6 = com.chartboost.sdk.impl.uk.a(r6)
                if (r6 == 0) goto L1a
                com.chartboost.sdk.impl.uk r1 = r5.d
                com.chartboost.sdk.impl.tk$b r1 = com.chartboost.sdk.impl.uk.b(r1)
                long r3 = r1.a()
                r6.a(r3)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.uk.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public uk(g1 g1Var, tk.b videoProgress, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(videoProgress, "videoProgress");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.a = g1Var;
        this.b = videoProgress;
        this.c = coroutineDispatcher;
    }

    public /* synthetic */ uk(g1 g1Var, tk.b bVar, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : g1Var, bVar, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.tk
    public void a(long j) {
        Job launch$default;
        xb.a("startProgressUpdate()", (Throwable) null, 2, (Object) null);
        if (this.d != null) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.c), null, null, new a(j, this, null), 3, null);
        this.d = launch$default;
    }

    @Override // com.chartboost.sdk.impl.tk
    public void a() {
        xb.a("stopProgressUpdate()", (Throwable) null, 2, (Object) null);
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.d = null;
    }
}
