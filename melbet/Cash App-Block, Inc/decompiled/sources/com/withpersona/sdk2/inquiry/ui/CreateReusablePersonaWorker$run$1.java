package com.withpersona.sdk2.inquiry.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherResult;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.network.Metadata;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
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
public final class CreateReusablePersonaWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CreateReusablePersonaWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateReusablePersonaWorker$run$1(CreateReusablePersonaWorker createReusablePersonaWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = createReusablePersonaWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateReusablePersonaWorker$run$1 createReusablePersonaWorker$run$1 = new CreateReusablePersonaWorker$run$1(this.this$0, continuation);
        createReusablePersonaWorker$run$1.L$0 = obj;
        return createReusablePersonaWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateReusablePersonaWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00db, code lost:
    
        if (r1.emit(com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker.Output.Complete.INSTANCE, r8) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cd, code lost:
    
        if (r9 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r5, r6, r8) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f6, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
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
        CreateReusablePersonaWorker createReusablePersonaWorker = this.this$0;
        Continuation continuation = null;
        try {
        } catch (Exception unused) {
            CreateReusablePersonaWorker.Output.Error error = new CreateReusablePersonaWorker.Output.Error(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
            this.L$0 = null;
            this.label = 2;
        }
        switch (r1) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                UiService uiService = createReusablePersonaWorker.uiService;
                String str = createReusablePersonaWorker.inquiryId;
                String str2 = createReusablePersonaWorker.sessionToken;
                this.L$0 = flowCollector3;
                this.label = 1;
                obj = uiService.fetchOneTimeLinkCodeForPersonasCreate(str, str2, this);
                r1 = flowCollector3;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                response = (Response) obj;
                if (!response.rawResponse.isSuccessful) {
                    OneTimeLinkCodeResponse oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) response.body;
                    String str3 = (oneTimeLinkCodeResponse == null || (metadata = oneTimeLinkCodeResponse.meta) == null) ? null : metadata.oneTimeLinkCode;
                    if (str3 != null) {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                        InquiryViewModel.AnonymousClass1 anonymousClass1 = new InquiryViewModel.AnonymousClass1(createReusablePersonaWorker, str3, continuation, 29);
                        this.L$0 = r1;
                        this.label = 5;
                        flowCollector = r1;
                        break;
                    } else {
                        CreateReusablePersonaWorker.Output.Error error2 = new CreateReusablePersonaWorker.Output.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    }
                } else {
                    CreateReusablePersonaWorker.Output.Error error3 = new CreateReusablePersonaWorker.Output.Error(NetworkUtilsKt.toErrorInfo(response));
                    this.L$0 = null;
                    this.label = 3;
                    break;
                }
                return coroutineSingletons;
            case 1:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                r1 = flowCollector4;
                response = (Response) obj;
                if (!response.rawResponse.isSuccessful) {
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
