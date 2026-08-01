package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetry$intercept$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {298, 314}, m = "invokeSuspend", n = {"$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class HttpRequestRetry$intercept$1 extends SuspendLambda implements Function3<Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ HttpClient $client;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ HttpRequestRetry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestRetry$intercept$1(HttpRequestRetry httpRequestRetry, HttpClient httpClient, Continuation<? super HttpRequestRetry$intercept$1> continuation) {
        super(3, continuation);
        this.this$0 = httpRequestRetry;
        this.$client = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1 = new HttpRequestRetry$intercept$1(this.this$0, this.$client, continuation);
        httpRequestRetry$intercept$1.L$0 = sender;
        httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
        return httpRequestRetry$intercept$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(4:38|39|40|41)|9|10|11|12|13|(1:15)|17|(1:19)(4:20|21|22|(1:24)(12:25|6|7|(0)|9|10|11|12|13|(0)|17|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:38)|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0182, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a4, code lost:
    
        r10 = r10 + 1;
        r4 = new io.ktor.client.plugins.HttpRequestRetry.RetryEventData(r15, r10, null, r21);
        r7 = r10;
        r8 = r11;
        r9 = r12;
        r10 = r13;
        r11 = r16;
        r12 = r17;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0239, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0191, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        r16 = r12;
        r17 = r13;
        r18 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016c A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #1 {all -> 0x0182, blocks: (B:13:0x0158, B:17:0x0161, B:20:0x016c), top: B:12:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0201 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0202 -> B:6:0x020b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AttributeKey attributeKey;
        AttributeKey attributeKey2;
        AttributeKey attributeKey3;
        AttributeKey attributeKey4;
        Function2 function2;
        AttributeKey attributeKey5;
        Sender sender;
        HttpRequestBuilder httpRequestBuilder;
        int i;
        Function2 function22;
        HttpRequestRetry.RetryEventData retryEventData;
        Function3 function3;
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1;
        Function3 function32;
        int i2;
        Sender sender2;
        HttpRequestBuilder httpRequestBuilder2;
        Function3 function33;
        HttpRequestBuilder httpRequestBuilder3;
        Function3 function34;
        Function2 function23;
        Function2 function24;
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$12;
        int i3;
        Throwable th;
        int i4;
        boolean shouldRetryOnException;
        Function2 function25;
        Object obj2;
        boolean shouldRetry;
        Logger logger;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        boolean z = true;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            Sender sender3 = (Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) this.L$1;
            Attributes attributes = httpRequestBuilder4.getAttributes();
            attributeKey = HttpRequestRetryKt.ShouldRetryPerRequestAttributeKey;
            Function3 function35 = (Function3) attributes.getOrNull(attributeKey);
            if (function35 == null) {
                function35 = this.this$0.shouldRetry;
            }
            Attributes attributes2 = httpRequestBuilder4.getAttributes();
            attributeKey2 = HttpRequestRetryKt.ShouldRetryOnExceptionPerRequestAttributeKey;
            Function3 function36 = (Function3) attributes2.getOrNull(attributeKey2);
            if (function36 == null) {
                function36 = this.this$0.shouldRetryOnException;
            }
            Attributes attributes3 = httpRequestBuilder4.getAttributes();
            attributeKey3 = HttpRequestRetryKt.MaxRetriesPerRequestAttributeKey;
            Integer num = (Integer) attributes3.getOrNull(attributeKey3);
            int intValue = num != null ? num.intValue() : this.this$0.maxRetries;
            Attributes attributes4 = httpRequestBuilder4.getAttributes();
            attributeKey4 = HttpRequestRetryKt.RetryDelayPerRequestAttributeKey;
            function2 = (Function2) attributes4.getOrNull(attributeKey4);
            if (function2 == null) {
                function2 = this.this$0.delayMillis;
            }
            Attributes attributes5 = httpRequestBuilder4.getAttributes();
            attributeKey5 = HttpRequestRetryKt.ModifyRequestPerRequestAttributeKey;
            Function2 function26 = (Function2) attributes5.getOrNull(attributeKey5);
            if (function26 == null) {
                function26 = this.this$0.modifyRequest;
            }
            sender = sender3;
            httpRequestBuilder = httpRequestBuilder4;
            i = intValue;
            function22 = function26;
            retryEventData = null;
            function3 = function36;
            httpRequestRetry$intercept$1 = this;
            function32 = function35;
            i2 = 0;
            httpRequestBuilder3 = httpRequestRetry$intercept$1.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
            }
            HttpRequestRetry$intercept$1 httpRequestRetry$intercept$13 = httpRequestRetry$intercept$1;
            httpRequestRetry$intercept$1.L$0 = sender;
            httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
            httpRequestRetry$intercept$1.L$2 = function32;
            httpRequestRetry$intercept$1.L$3 = function3;
            httpRequestRetry$intercept$1.L$4 = function2;
            httpRequestRetry$intercept$1.L$5 = function22;
            httpRequestRetry$intercept$1.L$6 = httpRequestBuilder3;
            httpRequestRetry$intercept$1.I$0 = i2;
            httpRequestRetry$intercept$1.I$1 = i;
            httpRequestRetry$intercept$1.label = 1;
            obj2 = sender.execute(httpRequestBuilder3, httpRequestRetry$intercept$13);
            if (obj2 == coroutine_suspended) {
            }
            HttpClientCall httpClientCall = (HttpClientCall) obj2;
            shouldRetry = httpRequestRetry$intercept$1.this$0.shouldRetry(i2, i, function32, httpClientCall);
            if (shouldRetry) {
            }
        } else if (i5 == 1) {
            i = this.I$1;
            i2 = this.I$0;
            HttpRequestBuilder httpRequestBuilder5 = (HttpRequestBuilder) this.L$6;
            function22 = (Function2) this.L$5;
            function2 = (Function2) this.L$4;
            function3 = (Function3) this.L$3;
            function32 = (Function3) this.L$2;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            sender = (Sender) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                httpRequestBuilder3 = httpRequestBuilder5;
                httpRequestRetry$intercept$1 = this;
            } catch (Throwable th2) {
                httpRequestBuilder3 = httpRequestBuilder5;
                function33 = function32;
                httpRequestBuilder2 = httpRequestBuilder;
                sender2 = sender;
                th = th2;
                i4 = i;
                function24 = function22;
                function23 = function2;
                function34 = function3;
                httpRequestRetry$intercept$12 = this;
                i3 = i2;
                Throwable th3 = th;
                shouldRetryOnException = httpRequestRetry$intercept$12.this$0.shouldRetryOnException(i3, i4, function34, httpRequestBuilder3, th3);
                if (!shouldRetryOnException) {
                }
            }
            HttpClientCall httpClientCall2 = (HttpClientCall) obj2;
            shouldRetry = httpRequestRetry$intercept$1.this$0.shouldRetry(i2, i, function32, httpClientCall2);
            if (shouldRetry) {
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = this.I$1;
            int i7 = this.I$0;
            HttpRequestRetry.RetryEventData retryEventData2 = (HttpRequestRetry.RetryEventData) this.L$6;
            Function2 function27 = (Function2) this.L$5;
            Function2 function28 = (Function2) this.L$4;
            Function3 function37 = (Function3) this.L$3;
            Function3 function38 = (Function3) this.L$2;
            HttpRequestBuilder httpRequestBuilder6 = (HttpRequestBuilder) this.L$1;
            Sender sender4 = (Sender) this.L$0;
            ResultKt.throwOnFailure(obj);
            sender = sender4;
            httpRequestBuilder = httpRequestBuilder6;
            function32 = function38;
            function3 = function37;
            function2 = function28;
            function22 = function27;
            httpRequestRetry$intercept$1 = this;
            int i8 = i6;
            retryEventData = retryEventData2;
            i2 = i7;
            char c = 2;
            logger = HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            z = true;
            i = i8;
            httpRequestBuilder3 = httpRequestRetry$intercept$1.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
                try {
                } catch (Throwable th4) {
                    th = th4;
                    function33 = function32;
                    httpRequestBuilder2 = httpRequestBuilder;
                    sender2 = sender;
                    function24 = function22;
                    function23 = function2;
                    function34 = function3;
                    i3 = i2;
                    httpRequestRetry$intercept$12 = httpRequestRetry$intercept$1;
                    th = th;
                    i4 = i;
                    Throwable th32 = th;
                    shouldRetryOnException = httpRequestRetry$intercept$12.this$0.shouldRetryOnException(i3, i4, function34, httpRequestBuilder3, th32);
                    if (!shouldRetryOnException) {
                    }
                }
                function22.invoke(new HttpRequestRetry.ModifyRequestContext(httpRequestBuilder, retryEventData.getResponse(), retryEventData.getCause(), retryEventData.getRetryCount()), httpRequestBuilder3);
            }
            HttpRequestRetry$intercept$1 httpRequestRetry$intercept$132 = httpRequestRetry$intercept$1;
            httpRequestRetry$intercept$1.L$0 = sender;
            httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
            httpRequestRetry$intercept$1.L$2 = function32;
            httpRequestRetry$intercept$1.L$3 = function3;
            httpRequestRetry$intercept$1.L$4 = function2;
            httpRequestRetry$intercept$1.L$5 = function22;
            httpRequestRetry$intercept$1.L$6 = httpRequestBuilder3;
            httpRequestRetry$intercept$1.I$0 = i2;
            httpRequestRetry$intercept$1.I$1 = i;
            httpRequestRetry$intercept$1.label = 1;
            obj2 = sender.execute(httpRequestBuilder3, httpRequestRetry$intercept$132);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            HttpClientCall httpClientCall22 = (HttpClientCall) obj2;
            shouldRetry = httpRequestRetry$intercept$1.this$0.shouldRetry(i2, i, function32, httpClientCall22);
            if (shouldRetry) {
                return httpClientCall22;
            }
            i2++;
            HttpRequestRetry.RetryEventData retryEventData3 = new HttpRequestRetry.RetryEventData(httpRequestBuilder3, i2, httpClientCall22.getResponse(), null);
            i4 = i;
            Sender sender5 = sender;
            function34 = function3;
            Function3 function39 = function32;
            HttpRequestBuilder httpRequestBuilder7 = httpRequestBuilder;
            Sender sender6 = sender5;
            httpRequestRetry$intercept$1.$client.getMonitor().raise(HttpRequestRetry.INSTANCE.getHttpRequestRetryEvent(), retryEventData3);
            HttpRequestRetry.DelayContext delayContext = new HttpRequestRetry.DelayContext(retryEventData3.getRequest(), retryEventData3.getResponse(), retryEventData3.getCause());
            function25 = httpRequestRetry$intercept$1.this$0.delay;
            Object invoke = function2.invoke(delayContext, Boxing.boxInt(i2));
            httpRequestRetry$intercept$1.L$0 = sender6;
            httpRequestRetry$intercept$1.L$1 = httpRequestBuilder7;
            httpRequestRetry$intercept$1.L$2 = function39;
            httpRequestRetry$intercept$1.L$3 = function34;
            httpRequestRetry$intercept$1.L$4 = function2;
            httpRequestRetry$intercept$1.L$5 = function22;
            httpRequestRetry$intercept$1.L$6 = retryEventData3;
            httpRequestRetry$intercept$1.I$0 = i2;
            httpRequestRetry$intercept$1.I$1 = i4;
            c = 2;
            httpRequestRetry$intercept$1.label = 2;
            if (function25.invoke(invoke, httpRequestRetry$intercept$1) != coroutine_suspended) {
                return coroutine_suspended;
            }
            i8 = i4;
            retryEventData = retryEventData3;
            HttpRequestBuilder httpRequestBuilder8 = httpRequestBuilder7;
            function32 = function39;
            function3 = function34;
            sender = sender6;
            httpRequestBuilder = httpRequestBuilder8;
            logger = HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            z = true;
            i = i8;
            httpRequestBuilder3 = httpRequestRetry$intercept$1.this$0.prepareRequest(httpRequestBuilder);
            if (retryEventData != null) {
            }
            HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1322 = httpRequestRetry$intercept$1;
            httpRequestRetry$intercept$1.L$0 = sender;
            httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
            httpRequestRetry$intercept$1.L$2 = function32;
            httpRequestRetry$intercept$1.L$3 = function3;
            httpRequestRetry$intercept$1.L$4 = function2;
            httpRequestRetry$intercept$1.L$5 = function22;
            httpRequestRetry$intercept$1.L$6 = httpRequestBuilder3;
            httpRequestRetry$intercept$1.I$0 = i2;
            httpRequestRetry$intercept$1.I$1 = i;
            httpRequestRetry$intercept$1.label = 1;
            obj2 = sender.execute(httpRequestBuilder3, httpRequestRetry$intercept$1322);
            if (obj2 == coroutine_suspended) {
            }
            HttpClientCall httpClientCall222 = (HttpClientCall) obj2;
            shouldRetry = httpRequestRetry$intercept$1.this$0.shouldRetry(i2, i, function32, httpClientCall222);
            if (shouldRetry) {
            }
        }
    }
}
