package gbcorp.c312.merkmarker.info.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import gbcorp.c312.merkmarker.info.data.model.GTSLYUrlState;
import gbcorp.c312.merkmarker.info.data.service.GTSLYApiService;
import gbcorp.c312.merkmarker.info.data.service.GTSLYRequest;
import gbcorp.c312.merkmarker.info.data.service.GTSLYResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: GTSLYPrepRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$install$2", f = "GTSLYPrepRepository.kt", i = {1}, l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, 69}, m = "invokeSuspend", n = {"request"}, nl = {68, 71}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYPrepRepository$install$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ GTSLYPrepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYPrepRepository$install$2(GTSLYPrepRepository gTSLYPrepRepository, String str, Continuation<? super GTSLYPrepRepository$install$2> continuation) {
        super(2, continuation);
        this.this$0 = gTSLYPrepRepository;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GTSLYPrepRepository$install$2(this.this$0, this.$token, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GTSLYPrepRepository$install$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GTSLYApiService gTSLYApiService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception unused) {
            this.this$0.storeUrlStateValue(GTSLYUrlState.ACCESS_DENIED_URL_VALUE);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.buildRequest(this.$token, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Response response = (Response) obj;
                GTSLYResponse gTSLYResponse = (GTSLYResponse) response.body();
                String url = gTSLYResponse != null ? gTSLYResponse.getUrl() : null;
                if (!response.isSuccessful() || url == null) {
                    this.this$0.storeUrlStateValue(GTSLYUrlState.ACCESS_DENIED_URL_VALUE);
                } else {
                    this.this$0.storeUrlStateValue(url);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        GTSLYRequest gTSLYRequest = (GTSLYRequest) obj;
        gTSLYApiService = this.this$0.gtslyApiService;
        this.L$0 = SpillingKt.nullOutSpilledVariable(gTSLYRequest);
        this.label = 2;
        obj = gTSLYApiService.install(gTSLYRequest, this);
    }
}
