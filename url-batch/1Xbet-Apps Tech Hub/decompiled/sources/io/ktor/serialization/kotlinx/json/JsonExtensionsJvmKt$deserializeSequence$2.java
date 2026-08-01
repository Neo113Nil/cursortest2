package io.ktor.serialization.kotlinx.json;

import io.ktor.serialization.kotlinx.SerializerLookupKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JvmStreamsKt;

/* compiled from: JsonExtensionsJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class JsonExtensionsJvmKt$deserializeSequence$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Sequence<? extends Object>>, Object> {
    final /* synthetic */ ByteReadChannel $content;
    final /* synthetic */ Json $format;
    final /* synthetic */ TypeInfo $typeInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonExtensionsJvmKt$deserializeSequence$2(ByteReadChannel byteReadChannel, TypeInfo typeInfo, Json json, Continuation<? super JsonExtensionsJvmKt$deserializeSequence$2> continuation) {
        super(2, continuation);
        this.$content = byteReadChannel;
        this.$typeInfo = typeInfo;
        this.$format = json;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsonExtensionsJvmKt$deserializeSequence$2(this.$content, this.$typeInfo, this.$format, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Sequence<? extends Object>> continuation) {
        return ((JsonExtensionsJvmKt$deserializeSequence$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return JvmStreamsKt.decodeToSequence$default(this.$format, BlockingKt.toInputStream$default(this.$content, null, 1, null), SerializerLookupKt.serializerForTypeInfo(this.$format.getSerializersModule(), KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(this.$typeInfo)), null, 4, null);
    }
}
