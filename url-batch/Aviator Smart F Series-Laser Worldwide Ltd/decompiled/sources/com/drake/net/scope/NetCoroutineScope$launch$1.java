package com.drake.net.scope;

import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.i0;
import y5.g;
import y5.w;

@d(c = "com.drake.net.scope.NetCoroutineScope$launch$1", f = "NetCoroutineScope.kt", i = {0}, l = {66, 76}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class NetCoroutineScope$launch$1 extends SuspendLambda implements p {
    final /* synthetic */ p $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetCoroutineScope this$0;

    @d(c = "com.drake.net.scope.NetCoroutineScope$launch$1$1", f = "NetCoroutineScope.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.drake.net.scope.NetCoroutineScope$launch$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ NetCoroutineScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetCoroutineScope netCoroutineScope, c cVar) {
            super(2, cVar);
            this.this$0 = netCoroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            NetCoroutineScope netCoroutineScope;
            NetCoroutineScope netCoroutineScope2;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            ?? r12 = this.label;
            boolean z7 = true;
            try {
            } catch (Exception unused) {
                z7 = false;
                netCoroutineScope = r12;
            }
            if (r12 == 0) {
                g.throwOnFailure(obj);
                i0 i0Var = (i0) this.L$0;
                NetCoroutineScope netCoroutineScope3 = this.this$0;
                p preview = netCoroutineScope3.getPreview();
                netCoroutineScope = netCoroutineScope3;
                if (preview != null) {
                    this.L$0 = netCoroutineScope3;
                    this.L$1 = netCoroutineScope3;
                    this.label = 1;
                    if (preview.invoke(i0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    netCoroutineScope2 = netCoroutineScope3;
                }
                netCoroutineScope.setPreviewSucceed(z7);
                NetCoroutineScope netCoroutineScope4 = this.this$0;
                netCoroutineScope4.previewFinish(netCoroutineScope4.getPreviewSucceed());
                return w.INSTANCE;
            }
            if (r12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            netCoroutineScope2 = (NetCoroutineScope) this.L$1;
            g.throwOnFailure(obj);
            r12 = netCoroutineScope2;
            netCoroutineScope = r12;
            netCoroutineScope.setPreviewSucceed(z7);
            NetCoroutineScope netCoroutineScope42 = this.this$0;
            netCoroutineScope42.previewFinish(netCoroutineScope42.getPreviewSucceed());
            return w.INSTANCE;
        }

        @Override // f6.p
        public final Object invoke(i0 i0Var, c cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetCoroutineScope$launch$1(NetCoroutineScope netCoroutineScope, p pVar, c cVar) {
        super(2, cVar);
        this.this$0 = netCoroutineScope;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        NetCoroutineScope$launch$1 netCoroutineScope$launch$1 = new NetCoroutineScope$launch$1(this.this$0, this.$block, cVar);
        netCoroutineScope$launch$1.L$0 = obj;
        return netCoroutineScope$launch$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        i0 i0Var;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            g.throwOnFailure(obj);
            i0Var = (i0) this.L$0;
            this.this$0.start();
            if (this.this$0.getPreview() != null && this.this$0.getPreviewEnabled()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.L$0 = i0Var;
                this.label = 1;
                if (f2.supervisorScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.throwOnFailure(obj);
                return w.INSTANCE;
            }
            i0Var = (i0) this.L$0;
            g.throwOnFailure(obj);
        }
        p pVar = this.$block;
        this.L$0 = null;
        this.label = 2;
        if (pVar.invoke(i0Var, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, c cVar) {
        return ((NetCoroutineScope$launch$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
