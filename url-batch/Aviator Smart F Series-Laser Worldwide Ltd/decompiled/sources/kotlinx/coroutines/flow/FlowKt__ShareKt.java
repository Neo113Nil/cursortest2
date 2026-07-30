package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.y;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__ShareKt {
    public static final <T> n asSharedFlow(i iVar) {
        return new k(iVar, null);
    }

    public static final <T> t asStateFlow(j jVar) {
        return new l(jVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> q configureSharing$FlowKt__ShareKt(e eVar, int i8) {
        int coerceAtLeast;
        ChannelFlow channelFlow;
        e dropChannelOperators;
        coerceAtLeast = j6.v.coerceAtLeast(i8, kotlinx.coroutines.channels.b.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        int i9 = coerceAtLeast - i8;
        if (!(eVar instanceof ChannelFlow) || (dropChannelOperators = (channelFlow = (ChannelFlow) eVar).dropChannelOperators()) == null) {
            return new q(eVar, i9, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
        }
        int i10 = channelFlow.capacity;
        if (i10 != -3 && i10 != -2 && i10 != 0) {
            i9 = i10;
        } else if (channelFlow.onBufferOverflow != BufferOverflow.SUSPEND) {
            if (i8 == 0) {
                i9 = 1;
            }
            i9 = 0;
        }
        return new q(dropChannelOperators, i9, channelFlow.onBufferOverflow, channelFlow.context);
    }

    private static final <T> l1 launchSharing$FlowKt__ShareKt(i0 i0Var, CoroutineContext coroutineContext, e eVar, i iVar, r rVar, T t7) {
        return kotlinx.coroutines.g.launch(i0Var, coroutineContext, kotlin.jvm.internal.s.areEqual(rVar, r.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(rVar, eVar, iVar, t7, null));
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(i0 i0Var, CoroutineContext coroutineContext, e eVar, kotlinx.coroutines.w wVar) {
        kotlinx.coroutines.i.launch$default(i0Var, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(eVar, wVar, null), 2, null);
    }

    public static final <T> n onSubscription(n nVar, f6.p pVar) {
        return new SubscribedSharedFlow(nVar, pVar);
    }

    public static final <T> n shareIn(e eVar, i0 i0Var, r rVar, int i8) {
        q configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(eVar, i8);
        i MutableSharedFlow = o.MutableSharedFlow(i8, configureSharing$FlowKt__ShareKt.extraBufferCapacity, configureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new k(MutableSharedFlow, launchSharing$FlowKt__ShareKt(i0Var, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, rVar, o.NO_VALUE));
    }

    public static /* synthetic */ n shareIn$default(e eVar, i0 i0Var, r rVar, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return g.shareIn(eVar, i0Var, rVar, i8);
    }

    public static final <T> t stateIn(e eVar, i0 i0Var, r rVar, T t7) {
        q configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(eVar, 1);
        j MutableStateFlow = u.MutableStateFlow(t7);
        return new l(MutableStateFlow, launchSharing$FlowKt__ShareKt(i0Var, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, rVar, t7));
    }

    public static final <T> Object stateIn(e eVar, i0 i0Var, kotlin.coroutines.c cVar) {
        q configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(eVar, 1);
        kotlinx.coroutines.w CompletableDeferred$default = y.CompletableDeferred$default(null, 1, null);
        launchSharingDeferred$FlowKt__ShareKt(i0Var, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, CompletableDeferred$default);
        return CompletableDeferred$default.await(cVar);
    }
}
