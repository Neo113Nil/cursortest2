package io.ktor.client.plugins.json;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.utils.EmptyContent;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: JsonPlugin.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "payload"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.json.JsonPlugin$Plugin$install$1", f = "JsonPlugin.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class JsonPlugin$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonPlugin $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonPlugin$Plugin$install$1(JsonPlugin jsonPlugin, Continuation<? super JsonPlugin$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = jsonPlugin;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        JsonPlugin$Plugin$install$1 jsonPlugin$Plugin$install$1 = new JsonPlugin$Plugin$install$1(this.$plugin, continuation);
        jsonPlugin$Plugin$install$1.L$0 = pipelineContext;
        jsonPlugin$Plugin$install$1.L$1 = obj;
        return jsonPlugin$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set;
        ContentType contentType;
        EmptyContent write;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            Iterator<T> it = this.$plugin.getAcceptContentTypes().iterator();
            while (it.hasNext()) {
                UtilsKt.accept((HttpMessageBuilder) pipelineContext.getContext(), (ContentType) it.next());
            }
            set = this.$plugin.ignoredTypes;
            if (!set.contains(Reflection.getOrCreateKotlinClass(obj2.getClass())) && (contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext())) != null && this.$plugin.canHandle$ktor_client_json(contentType)) {
                ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(HttpHeaders.INSTANCE.getContentType());
                if (Intrinsics.areEqual(obj2, Unit.INSTANCE)) {
                    write = EmptyContent.INSTANCE;
                } else {
                    write = obj2 instanceof EmptyContent ? EmptyContent.INSTANCE : this.$plugin.getSerializer().write(obj2, contentType);
                }
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(write, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
