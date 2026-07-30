package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.i0;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ i $shared;
    final /* synthetic */ r $started;
    final /* synthetic */ e $upstream;
    int label;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements f6.p {
        /* synthetic */ int I$0;
        int label;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i8, kotlin.coroutines.c cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i8), cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.a.boxBoolean(this.I$0 > 0);
        }

        @Override // f6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (kotlin.coroutines.c) obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements f6.p {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ i $shared;
        final /* synthetic */ e $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(e eVar, i iVar, T t7, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$upstream = eVar;
            this.$shared = iVar;
            this.$initialValue = t7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                int i9 = a.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i9 == 1) {
                    e eVar = this.$upstream;
                    i iVar = this.$shared;
                    this.label = 1;
                    if (eVar.collect(iVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i9 == 3) {
                    Object obj2 = this.$initialValue;
                    if (obj2 == o.NO_VALUE) {
                        this.$shared.resetReplayCache();
                    } else {
                        this.$shared.tryEmit(obj2);
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            return y5.w.INSTANCE;
        }

        @Override // f6.p
        public final Object invoke(SharingCommand sharingCommand, kotlin.coroutines.c cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(y5.w.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ShareKt$launchSharing$1(r rVar, e eVar, i iVar, T t7, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$started = rVar;
        this.$upstream = eVar;
        this.$shared = iVar;
        this.$initialValue = t7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        e eVar;
        i iVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    y5.g.throwOnFailure(obj);
                    eVar = this.$upstream;
                    iVar = this.$shared;
                    this.label = 3;
                    if (eVar.collect(iVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }
                if (i8 != 3 && i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            y5.g.throwOnFailure(obj);
            return y5.w.INSTANCE;
        }
        y5.g.throwOnFailure(obj);
        r rVar = this.$started;
        r.a aVar = r.Companion;
        if (rVar == aVar.getEagerly()) {
            e eVar2 = this.$upstream;
            i iVar2 = this.$shared;
            this.label = 1;
            if (eVar2.collect(iVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (this.$started == aVar.getLazily()) {
            t subscriptionCount = this.$shared.getSubscriptionCount();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 2;
            if (g.first(subscriptionCount, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = this.$upstream;
            iVar = this.$shared;
            this.label = 3;
            if (eVar.collect(iVar, this) == coroutine_suspended) {
            }
        } else {
            e distinctUntilChanged = g.distinctUntilChanged(this.$started.command(this.$shared.getSubscriptionCount()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, null);
            this.label = 4;
            if (g.collectLatest(distinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
