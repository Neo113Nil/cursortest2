package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.Constraints;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Constraints $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, Continuation<? super NetworkRequestConstraintController$track$1> continuation) {
        super(2, continuation);
        this.$constraints = constraints;
        this.this$0 = networkRequestConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, continuation);
        networkRequestConstraintController$track$1.L$0 = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ConstraintsState> producerScope, Continuation<? super Unit> continuation) {
        return ((NetworkRequestConstraintController$track$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Job launch$default;
        ConnectivityManager connectivityManager;
        final Function0<Unit> addCallback;
        ConnectivityManager connectivityManager2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
            if (requiredNetworkRequest != null) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, producerScope, null), 3, null);
                Function1<? super ConstraintsState, Unit> function1 = new Function1() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = NetworkRequestConstraintController$track$1.invokeSuspend$lambda$0(Job.this, producerScope, (ConstraintsState) obj2);
                        return invokeSuspend$lambda$0;
                    }
                };
                if (Build.VERSION.SDK_INT >= 30) {
                    SharedNetworkCallback sharedNetworkCallback = SharedNetworkCallback.INSTANCE;
                    connectivityManager2 = this.this$0.connManager;
                    addCallback = sharedNetworkCallback.addCallback(connectivityManager2, requiredNetworkRequest, function1);
                } else {
                    IndividualNetworkCallback.Companion companion = IndividualNetworkCallback.INSTANCE;
                    connectivityManager = this.this$0.connManager;
                    addCallback = companion.addCallback(connectivityManager, requiredNetworkRequest, function1);
                }
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = NetworkRequestConstraintController$track$1.invokeSuspend$lambda$1(Function0.this);
                        return invokeSuspend$lambda$1;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                return Unit.INSTANCE;
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
    public static final Unit invokeSuspend$lambda$0(Job job, ProducerScope producerScope, ConstraintsState constraintsState) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        producerScope.mo11095trySendJP2dKIU(constraintsState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
