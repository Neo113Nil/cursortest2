package com.withpersona.sdk2.inquiry.ui.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class UiAddressAutocompleteWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ UiAddressAutocompleteWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAddressAutocompleteWorker$run$1(UiAddressAutocompleteWorker uiAddressAutocompleteWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uiAddressAutocompleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UiAddressAutocompleteWorker$run$1 uiAddressAutocompleteWorker$run$1 = new UiAddressAutocompleteWorker$run$1(this.this$0, continuation);
        uiAddressAutocompleteWorker$run$1.L$0 = obj;
        return uiAddressAutocompleteWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiAddressAutocompleteWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r1.emit(r3, r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r1.emit(r4, r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r12 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            UiAddressAutocompleteWorker uiAddressAutocompleteWorker = this.this$0;
            UiService uiService = uiAddressAutocompleteWorker.uiService;
            String str = uiAddressAutocompleteWorker.sessionToken;
            UiComponent uiComponent = uiAddressAutocompleteWorker.triggeringComponent;
            String str2 = uiAddressAutocompleteWorker.addressText;
            uiComponent.getClass();
            str2.getClass();
            AddressAutocompleteRequest addressAutocompleteRequest = new AddressAutocompleteRequest(new AddressAutocompleteRequest.Meta(uiComponent.getName(), str2));
            this.L$0 = flowCollector;
            this.label = 1;
            obj = uiService.getAddressSuggestions(str, addressAutocompleteRequest, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (response.rawResponse.isSuccessful) {
            AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) response.body;
            UiAddressAutocompleteWorker.Response.Success success = new UiAddressAutocompleteWorker.Response.Success(addressAutocompleteResponse != null ? addressAutocompleteResponse.meta.predictions : EmptyList.INSTANCE);
            this.L$0 = null;
            this.label = 3;
        } else {
            NetworkUtilsKt.toErrorInfo(response).getClass();
            UiAddressAutocompleteWorker.Response.Error error = new UiAddressAutocompleteWorker.Response.Error();
            this.L$0 = null;
            this.label = 2;
        }
    }
}
