package io.ktor.serialization.kotlinx.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.ChannelWriterContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.serialization.JsonConvertException;
import io.ktor.serialization.kotlinx.KotlinxSerializationExtension;
import io.ktor.serialization.kotlinx.SerializerLookupKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J9\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017JC\u0010\u0012\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001c2\n\u0010\f\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "format", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "jsonArraySymbolsMap", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "deserialize", "", HttpAuthHeader.Parameters.Charset, "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", FirebaseAnalytics.Param.CONTENT, "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serialize", "Lio/ktor/http/content/OutgoingContent;", "contentType", "Lio/ktor/http/ContentType;", "value", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "serializer", "Lkotlinx/serialization/KSerializer;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Ljava/nio/charset/Charset;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KotlinxSerializationJsonExtensions implements KotlinxSerializationExtension {
    private final Json format;
    private final Map<Charset, JsonArraySymbols> jsonArraySymbolsMap;

    public KotlinxSerializationJsonExtensions(Json format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        this.jsonArraySymbolsMap = new LinkedHashMap();
    }

    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public Object serialize(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, Continuation<? super OutgoingContent> continuation) {
        if (!Intrinsics.areEqual(charset, Charsets.UTF_8) || !Intrinsics.areEqual(typeInfo.getType(), Reflection.getOrCreateKotlinClass(Flow.class))) {
            return null;
        }
        return new ChannelWriterContent(new KotlinxSerializationJsonExtensions$serialize$2(this, obj, SerializerLookupKt.serializerForTypeInfo(this.format.getSerializersModule(), KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(typeInfo)), charset, null), ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deserialize(Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel, Continuation<Object> continuation) {
        KotlinxSerializationJsonExtensions$deserialize$1 kotlinxSerializationJsonExtensions$deserialize$1;
        int i;
        try {
            if (continuation instanceof KotlinxSerializationJsonExtensions$deserialize$1) {
                kotlinxSerializationJsonExtensions$deserialize$1 = (KotlinxSerializationJsonExtensions$deserialize$1) continuation;
                if ((kotlinxSerializationJsonExtensions$deserialize$1.label & Integer.MIN_VALUE) != 0) {
                    kotlinxSerializationJsonExtensions$deserialize$1.label -= Integer.MIN_VALUE;
                    Object obj = kotlinxSerializationJsonExtensions$deserialize$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = kotlinxSerializationJsonExtensions$deserialize$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!Intrinsics.areEqual(charset, Charsets.UTF_8) || !Intrinsics.areEqual(typeInfo.getType(), Reflection.getOrCreateKotlinClass(Sequence.class))) {
                            return null;
                        }
                        Json json = this.format;
                        kotlinxSerializationJsonExtensions$deserialize$1.label = 1;
                        obj = JsonExtensionsJvmKt.deserializeSequence(json, byteReadChannel, typeInfo, kotlinxSerializationJsonExtensions$deserialize$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (Throwable th) {
            throw new JsonConvertException("Illegal input: " + th.getMessage(), th);
        }
        kotlinxSerializationJsonExtensions$deserialize$1 = new KotlinxSerializationJsonExtensions$deserialize$1(this, continuation);
        Object obj2 = kotlinxSerializationJsonExtensions$deserialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationJsonExtensions$deserialize$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object serialize(Flow<? extends T> flow, KSerializer<T> kSerializer, Charset charset, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        KotlinxSerializationJsonExtensions$serialize$3 kotlinxSerializationJsonExtensions$serialize$3;
        Object coroutine_suspended;
        int i;
        Flow flow2;
        KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions;
        Charset charset2;
        JsonArraySymbols jsonArraySymbols;
        KSerializer<T> kSerializer2;
        KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
        byte[] endArray;
        ByteWriteChannel byteWriteChannel2 = byteWriteChannel;
        if (continuation instanceof KotlinxSerializationJsonExtensions$serialize$3) {
            kotlinxSerializationJsonExtensions$serialize$3 = (KotlinxSerializationJsonExtensions$serialize$3) continuation;
            if ((kotlinxSerializationJsonExtensions$serialize$3.label & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationJsonExtensions$serialize$3.label -= Integer.MIN_VALUE;
                Object obj = kotlinxSerializationJsonExtensions$serialize$3.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationJsonExtensions$serialize$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Map<Charset, JsonArraySymbols> map = this.jsonArraySymbolsMap;
                    JsonArraySymbols jsonArraySymbols2 = map.get(charset);
                    if (jsonArraySymbols2 == null) {
                        jsonArraySymbols2 = new JsonArraySymbols(charset);
                        map.put(charset, jsonArraySymbols2);
                    }
                    JsonArraySymbols jsonArraySymbols3 = jsonArraySymbols2;
                    byte[] beginArray = jsonArraySymbols3.getBeginArray();
                    kotlinxSerializationJsonExtensions$serialize$3.L$0 = this;
                    flow2 = flow;
                    kotlinxSerializationJsonExtensions$serialize$3.L$1 = flow2;
                    kotlinxSerializationJsonExtensions$serialize$3.L$2 = kSerializer;
                    kotlinxSerializationJsonExtensions$serialize$3.L$3 = charset;
                    kotlinxSerializationJsonExtensions$serialize$3.L$4 = byteWriteChannel2;
                    kotlinxSerializationJsonExtensions$serialize$3.L$5 = jsonArraySymbols3;
                    kotlinxSerializationJsonExtensions$serialize$3.label = 1;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel2, beginArray, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinxSerializationJsonExtensions = this;
                    charset2 = charset;
                    jsonArraySymbols = jsonArraySymbols3;
                    kSerializer2 = kSerializer;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        jsonArraySymbols = (JsonArraySymbols) kotlinxSerializationJsonExtensions$serialize$3.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) kotlinxSerializationJsonExtensions$serialize$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        endArray = jsonArraySymbols.getEndArray();
                        kotlinxSerializationJsonExtensions$serialize$3.L$0 = null;
                        kotlinxSerializationJsonExtensions$serialize$3.L$1 = null;
                        kotlinxSerializationJsonExtensions$serialize$3.label = 3;
                        if (ByteWriteChannelKt.writeFully(byteWriteChannel2, endArray, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    jsonArraySymbols = (JsonArraySymbols) kotlinxSerializationJsonExtensions$serialize$3.L$5;
                    byteWriteChannel2 = (ByteWriteChannel) kotlinxSerializationJsonExtensions$serialize$3.L$4;
                    Charset charset3 = (Charset) kotlinxSerializationJsonExtensions$serialize$3.L$3;
                    KSerializer<T> kSerializer3 = (KSerializer) kotlinxSerializationJsonExtensions$serialize$3.L$2;
                    flow2 = (Flow) kotlinxSerializationJsonExtensions$serialize$3.L$1;
                    KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions2 = (KotlinxSerializationJsonExtensions) kotlinxSerializationJsonExtensions$serialize$3.L$0;
                    ResultKt.throwOnFailure(obj);
                    charset2 = charset3;
                    kSerializer2 = kSerializer3;
                    kotlinxSerializationJsonExtensions = kotlinxSerializationJsonExtensions2;
                }
                kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = new KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(byteWriteChannel2, jsonArraySymbols, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
                kotlinxSerializationJsonExtensions$serialize$3.L$0 = byteWriteChannel2;
                kotlinxSerializationJsonExtensions$serialize$3.L$1 = jsonArraySymbols;
                kotlinxSerializationJsonExtensions$serialize$3.L$2 = null;
                kotlinxSerializationJsonExtensions$serialize$3.L$3 = null;
                kotlinxSerializationJsonExtensions$serialize$3.L$4 = null;
                kotlinxSerializationJsonExtensions$serialize$3.L$5 = null;
                kotlinxSerializationJsonExtensions$serialize$3.label = 2;
                if (flow2.collect(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                endArray = jsonArraySymbols.getEndArray();
                kotlinxSerializationJsonExtensions$serialize$3.L$0 = null;
                kotlinxSerializationJsonExtensions$serialize$3.L$1 = null;
                kotlinxSerializationJsonExtensions$serialize$3.label = 3;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel2, endArray, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        kotlinxSerializationJsonExtensions$serialize$3 = new KotlinxSerializationJsonExtensions$serialize$3(this, continuation);
        Object obj2 = kotlinxSerializationJsonExtensions$serialize$3.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationJsonExtensions$serialize$3.label;
        if (i != 0) {
        }
        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = new KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(byteWriteChannel2, jsonArraySymbols, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
        kotlinxSerializationJsonExtensions$serialize$3.L$0 = byteWriteChannel2;
        kotlinxSerializationJsonExtensions$serialize$3.L$1 = jsonArraySymbols;
        kotlinxSerializationJsonExtensions$serialize$3.L$2 = null;
        kotlinxSerializationJsonExtensions$serialize$3.L$3 = null;
        kotlinxSerializationJsonExtensions$serialize$3.L$4 = null;
        kotlinxSerializationJsonExtensions$serialize$3.L$5 = null;
        kotlinxSerializationJsonExtensions$serialize$3.label = 2;
        if (flow2.collect(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
        }
        endArray = jsonArraySymbols.getEndArray();
        kotlinxSerializationJsonExtensions$serialize$3.L$0 = null;
        kotlinxSerializationJsonExtensions$serialize$3.L$1 = null;
        kotlinxSerializationJsonExtensions$serialize$3.label = 3;
        if (ByteWriteChannelKt.writeFully(byteWriteChannel2, endArray, kotlinxSerializationJsonExtensions$serialize$3) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
