package dev.hyo.openiap.store;

import com.onesignal.core.internal.config.ConfigModelStoreKt;
import dev.hyo.openiap.InitConnectionConfig;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.OpenIapProtocol;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Ldev/hyo/openiap/InitConnectionConfig;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$initConnection$1", f = "OpenIapStore.kt", i = {0}, l = {226}, m = "invokeSuspend", n = {ConfigModelStoreKt.CONFIG_NAME_SPACE}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapStore$initConnection$1 extends SuspendLambda implements Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$initConnection$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$initConnection$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapStore$initConnection$1 openIapStore$initConnection$1 = new OpenIapStore$initConnection$1(this.this$0, continuation);
        openIapStore$initConnection$1.L$0 = obj;
        return openIapStore$initConnection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InitConnectionConfig initConnectionConfig, Continuation<? super Boolean> continuation) {
        return ((OpenIapStore$initConnection$1) create(initConnectionConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapProtocol openIapProtocol;
        MutableStateFlow mutableStateFlow;
        InitConnectionConfig initConnectionConfig = (InitConnectionConfig) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$initConnection$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = OpenIapStore$initConnection$1.invokeSuspend$lambda$0((LoadingStates) obj2);
                            return invokeSuspend$lambda$0;
                        }
                    });
                    OpenIapLog.INSTANCE.i("OpenIapStore.initConnection: Calling module.initConnection...", "OpenIapStore");
                    openIapProtocol = this.this$0.module;
                    Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> initConnection = openIapProtocol.getInitConnection();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(initConnectionConfig);
                    this.label = 1;
                    obj = initConnection.invoke(initConnectionConfig, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                OpenIapLog.INSTANCE.i("OpenIapStore.initConnection: module.initConnection returned: " + booleanValue, "OpenIapStore");
                mutableStateFlow = this.this$0._isConnected;
                mutableStateFlow.setValue(Boxing.boxBoolean(booleanValue));
                this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$initConnection$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = OpenIapStore$initConnection$1.invokeSuspend$lambda$1((LoadingStates) obj2);
                        return invokeSuspend$lambda$1;
                    }
                });
                return Boxing.boxBoolean(booleanValue);
            } catch (Exception e) {
                OpenIapLog.INSTANCE.e("OpenIapStore.initConnection: Exception", e, "OpenIapStore");
                this.this$0.setError(e.getMessage());
                throw e;
            }
        } catch (Throwable th) {
            this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$initConnection$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = OpenIapStore$initConnection$1.invokeSuspend$lambda$1((LoadingStates) obj2);
                    return invokeSuspend$lambda$1;
                }
            });
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(LoadingStates loadingStates) {
        loadingStates.setInitConnection(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(LoadingStates loadingStates) {
        loadingStates.setInitConnection(false);
        return Unit.INSTANCE;
    }
}
