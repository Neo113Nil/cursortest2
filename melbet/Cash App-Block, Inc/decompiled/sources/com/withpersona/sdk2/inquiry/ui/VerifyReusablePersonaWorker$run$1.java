package com.withpersona.sdk2.inquiry.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherResult;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.Metadata;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class VerifyReusablePersonaWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ VerifyReusablePersonaWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyReusablePersonaWorker$run$1(VerifyReusablePersonaWorker verifyReusablePersonaWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = verifyReusablePersonaWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerifyReusablePersonaWorker$run$1 verifyReusablePersonaWorker$run$1 = new VerifyReusablePersonaWorker$run$1(this.this$0, continuation);
        verifyReusablePersonaWorker$run$1.L$0 = obj;
        return verifyReusablePersonaWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VerifyReusablePersonaWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0120, code lost:
    
        if (r1.emit(com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker.Output.Complete.INSTANCE, r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0112, code lost:
    
        if (r13 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r1.emit(r2, r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r5, r6, r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r1.emit(r13, r12) != r0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Response response;
        Metadata metadata;
        FlowCollector flowCollector;
        Object collection;
        FlowCollector flowCollector2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        VerifyReusablePersonaWorker verifyReusablePersonaWorker = this.this$0;
        try {
        } catch (Exception unused) {
            VerifyReusablePersonaWorker.Output.Error error = new VerifyReusablePersonaWorker.Output.Error(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
            this.L$0 = null;
            this.label = 2;
        }
        switch (r1) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                UiService uiService = verifyReusablePersonaWorker.uiService;
                String str = verifyReusablePersonaWorker.inquiryId;
                String str2 = verifyReusablePersonaWorker.sessionToken;
                Map map = verifyReusablePersonaWorker.componentParams;
                map.getClass();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new OneTimeLinkCodeForPersonasRequest.NamedComponentParam((String) entry.getKey(), (ComponentParam) entry.getValue()));
                }
                OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequest = new OneTimeLinkCodeForPersonasRequest(new OneTimeLinkCodeForPersonasRequest.Meta(new OneTimeLinkCodeForPersonasRequest.TransitionParams(arrayList)));
                this.L$0 = flowCollector3;
                this.label = 1;
                obj = uiService.fetchOneTimeLinkCodeForPersonasVerify(str, str2, oneTimeLinkCodeForPersonasRequest, this);
                r1 = flowCollector3;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                response = (Response) obj;
                if (response.rawResponse.isSuccessful) {
                    VerifyReusablePersonaWorker.Output.Error error2 = new VerifyReusablePersonaWorker.Output.Error(NetworkUtilsKt.toErrorInfo(response));
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else {
                    OneTimeLinkCodeResponse oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) response.body;
                    String str3 = (oneTimeLinkCodeResponse == null || (metadata = oneTimeLinkCodeResponse.meta) == null) ? null : metadata.oneTimeLinkCode;
                    if (str3 == null) {
                        VerifyReusablePersonaWorker.Output.Error error3 = new VerifyReusablePersonaWorker.Output.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    } else {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(verifyReusablePersonaWorker, str3, (Continuation) null);
                        this.L$0 = r1;
                        this.label = 5;
                        flowCollector = r1;
                        break;
                    }
                }
                return coroutineSingletons;
            case 1:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                r1 = flowCollector4;
                response = (Response) obj;
                if (response.rawResponse.isSuccessful) {
                }
                return coroutineSingletons;
            case 2:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                flowCollector = flowCollector5;
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new CustomTabsLauncherResult(), 1);
                this.L$0 = flowCollector;
                this.label = 6;
                collection = FlowKt__CollectionKt.toCollection(take, new ArrayList(), this);
                flowCollector2 = flowCollector;
                break;
            case 6:
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                flowCollector2 = flowCollector6;
                this.L$0 = null;
                this.label = 7;
                break;
            case 7:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
