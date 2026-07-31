package gbcorp.c312.merkmarker.info.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: GTSLYNetworkMonitor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor$isConnected$1", f = "GTSLYNetworkMonitor.kt", i = {0, 0, 0}, l = {47}, m = "invokeSuspend", n = {"$this$callbackFlow", "callback", "request"}, nl = {50}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYNetworkMonitor$isConnected$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GTSLYNetworkMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYNetworkMonitor$isConnected$1(GTSLYNetworkMonitor gTSLYNetworkMonitor, Continuation<? super GTSLYNetworkMonitor$isConnected$1> continuation) {
        super(2, continuation);
        this.this$0 = gTSLYNetworkMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GTSLYNetworkMonitor$isConnected$1 gTSLYNetworkMonitor$isConnected$1 = new GTSLYNetworkMonitor$isConnected$1(this.this$0, continuation);
        gTSLYNetworkMonitor$isConnected$1.L$0 = obj;
        return gTSLYNetworkMonitor$isConnected$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return ((GTSLYNetworkMonitor$isConnected$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor$isConnected$1$callback$1, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConnectivityManager connectivityManager;
        final ProducerScope producerScope = (ProducerScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final GTSLYNetworkMonitor gTSLYNetworkMonitor = this.this$0;
            final ?? r8 = new ConnectivityManager.NetworkCallback() { // from class: gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor$isConnected$1$callback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    producerScope.mo11095trySendJP2dKIU(Boolean.valueOf(gTSLYNetworkMonitor.checkValidated()));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    producerScope.mo11095trySendJP2dKIU(false);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                    producerScope.mo11095trySendJP2dKIU(Boolean.valueOf(gTSLYNetworkMonitor.checkValidated()));
                }
            };
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            connectivityManager = this.this$0.connectivityManager;
            connectivityManager.registerNetworkCallback(build, (ConnectivityManager.NetworkCallback) r8);
            producerScope.mo11095trySendJP2dKIU(Boxing.boxBoolean(this.this$0.checkValidated()));
            final GTSLYNetworkMonitor gTSLYNetworkMonitor2 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(r8);
            this.L$2 = SpillingKt.nullOutSpilledVariable(build);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: gbcorp.c312.merkmarker.info.util.GTSLYNetworkMonitor$isConnected$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = GTSLYNetworkMonitor$isConnected$1.invokeSuspend$lambda$0(GTSLYNetworkMonitor.this, r8);
                    return invokeSuspend$lambda$0;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(GTSLYNetworkMonitor gTSLYNetworkMonitor, GTSLYNetworkMonitor$isConnected$1$callback$1 gTSLYNetworkMonitor$isConnected$1$callback$1) {
        ConnectivityManager connectivityManager;
        connectivityManager = gTSLYNetworkMonitor.connectivityManager;
        connectivityManager.unregisterNetworkCallback(gTSLYNetworkMonitor$isConnected$1$callback$1);
        return Unit.INSTANCE;
    }
}
