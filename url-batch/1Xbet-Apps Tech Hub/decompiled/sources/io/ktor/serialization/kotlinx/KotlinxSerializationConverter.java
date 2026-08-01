package io.ktor.serialization.kotlinx;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.ByteArrayContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.JsonConvertException;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.InputKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.StringFormat;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J:\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0002J7\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "format", "Lkotlinx/serialization/SerialFormat;", "(Lkotlinx/serialization/SerialFormat;)V", "extensions", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "deserialize", "", HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", FirebaseAnalytics.Param.CONTENT, "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serialize", "Lio/ktor/http/content/OutgoingContent;", "contentType", "Lio/ktor/http/ContentType;", "value", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeContent", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "serializer", "Lkotlinx/serialization/KSerializer;", "serializeNullable", "ktor-serialization-kotlinx"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KotlinxSerializationConverter implements ContentConverter {
    private final List<KotlinxSerializationExtension> extensions;
    private final SerialFormat format;

    public KotlinxSerializationConverter(SerialFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        this.extensions = ExtensionsKt.extensions(format);
        if (!((format instanceof BinaryFormat) || (format instanceof StringFormat))) {
            throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
        }
    }

    @Override // io.ktor.serialization.ContentConverter
    @Deprecated(level = DeprecationLevel.WARNING, message = "Please override and use serializeNullable instead", replaceWith = @ReplaceWith(expression = "serializeNullable(charset, typeInfo, contentType, value)", imports = {}))
    public Object serialize(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, Continuation<? super OutgoingContent> continuation) {
        return serializeNullable(contentType, charset, typeInfo, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object serializeNullable(final ContentType contentType, final Charset charset, final TypeInfo typeInfo, final Object obj, Continuation<? super OutgoingContent> continuation) {
        KotlinxSerializationConverter$serializeNullable$1 kotlinxSerializationConverter$serializeNullable$1;
        int i;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        ContentType contentType2;
        Charset charset2;
        Object obj2;
        OutgoingContent outgoingContent;
        KSerializer<?> guessSerializer;
        if (continuation instanceof KotlinxSerializationConverter$serializeNullable$1) {
            kotlinxSerializationConverter$serializeNullable$1 = (KotlinxSerializationConverter$serializeNullable$1) continuation;
            if ((kotlinxSerializationConverter$serializeNullable$1.label & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationConverter$serializeNullable$1.label -= Integer.MIN_VALUE;
                Object obj3 = kotlinxSerializationConverter$serializeNullable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationConverter$serializeNullable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    final Flow asFlow = FlowKt.asFlow(this.extensions);
                    Flow<OutgoingContent> flow = new Flow<OutgoingContent>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OutgoingContent> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, contentType, charset, typeInfo, obj), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ Charset $charset$inlined;
                            final /* synthetic */ ContentType $contentType$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ TypeInfo $typeInfo$inlined;
                            final /* synthetic */ Object $value$inlined;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
                            /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$contentType$inlined = contentType;
                                this.$charset$inlined = charset;
                                this.$typeInfo$inlined = typeInfo;
                                this.$value$inlined = obj;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                Object obj2;
                                Object coroutine_suspended;
                                int i;
                                FlowCollector flowCollector;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        obj2 = anonymousClass1.result;
                                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                            KotlinxSerializationExtension kotlinxSerializationExtension = (KotlinxSerializationExtension) obj;
                                            ContentType contentType = this.$contentType$inlined;
                                            Charset charset = this.$charset$inlined;
                                            TypeInfo typeInfo = this.$typeInfo$inlined;
                                            Object obj3 = this.$value$inlined;
                                            anonymousClass1.L$0 = flowCollector2;
                                            anonymousClass1.label = 1;
                                            Object serialize = kotlinxSerializationExtension.serialize(contentType, charset, typeInfo, obj3, anonymousClass1);
                                            if (serialize == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            obj2 = serialize;
                                            flowCollector = flowCollector2;
                                        } else {
                                            if (i != 1) {
                                                if (i != 2) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj2);
                                                return Unit.INSTANCE;
                                            }
                                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                            ResultKt.throwOnFailure(obj2);
                                            flowCollector = flowCollector3;
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                obj2 = anonymousClass1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    KotlinxSerializationConverter$serializeNullable$fromExtension$2 kotlinxSerializationConverter$serializeNullable$fromExtension$2 = new KotlinxSerializationConverter$serializeNullable$fromExtension$2(null);
                    kotlinxSerializationConverter$serializeNullable$1.L$0 = this;
                    kotlinxSerializationConverter$serializeNullable$1.L$1 = contentType;
                    kotlinxSerializationConverter$serializeNullable$1.L$2 = charset;
                    kotlinxSerializationConverter$serializeNullable$1.L$3 = typeInfo;
                    kotlinxSerializationConverter$serializeNullable$1.L$4 = obj;
                    kotlinxSerializationConverter$serializeNullable$1.label = 1;
                    obj3 = FlowKt.firstOrNull(flow, kotlinxSerializationConverter$serializeNullable$fromExtension$2, kotlinxSerializationConverter$serializeNullable$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinxSerializationConverter = this;
                    contentType2 = contentType;
                    charset2 = charset;
                    obj2 = obj;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = kotlinxSerializationConverter$serializeNullable$1.L$4;
                    typeInfo = (TypeInfo) kotlinxSerializationConverter$serializeNullable$1.L$3;
                    Charset charset3 = (Charset) kotlinxSerializationConverter$serializeNullable$1.L$2;
                    ContentType contentType3 = (ContentType) kotlinxSerializationConverter$serializeNullable$1.L$1;
                    KotlinxSerializationConverter kotlinxSerializationConverter2 = (KotlinxSerializationConverter) kotlinxSerializationConverter$serializeNullable$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    contentType2 = contentType3;
                    charset2 = charset3;
                    obj2 = obj4;
                    kotlinxSerializationConverter = kotlinxSerializationConverter2;
                }
                outgoingContent = (OutgoingContent) obj3;
                if (outgoingContent == null) {
                    return outgoingContent;
                }
                try {
                    guessSerializer = SerializerLookupKt.serializerForTypeInfo(kotlinxSerializationConverter.format.getSerializersModule(), typeInfo);
                } catch (SerializationException unused) {
                    guessSerializer = SerializerLookupKt.guessSerializer(obj2, kotlinxSerializationConverter.format.getSerializersModule());
                }
                return kotlinxSerializationConverter.serializeContent(guessSerializer, kotlinxSerializationConverter.format, obj2, contentType2, charset2);
            }
        }
        kotlinxSerializationConverter$serializeNullable$1 = new KotlinxSerializationConverter$serializeNullable$1(this, continuation);
        Object obj32 = kotlinxSerializationConverter$serializeNullable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationConverter$serializeNullable$1.label;
        if (i != 0) {
        }
        outgoingContent = (OutgoingContent) obj32;
        if (outgoingContent == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:13:0x00d0, B:15:0x00d7, B:18:0x00e6, B:20:0x00ea, B:22:0x00f7, B:23:0x0114), top: B:12:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:13:0x00d0, B:15:0x00d7, B:18:0x00e6, B:20:0x00ea, B:22:0x00f7, B:23:0x0114), top: B:12:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deserialize(Charset charset, TypeInfo typeInfo, final ByteReadChannel byteReadChannel, Continuation<Object> continuation) {
        KotlinxSerializationConverter$deserialize$1 kotlinxSerializationConverter$deserialize$1;
        KotlinxSerializationConverter$deserialize$1 kotlinxSerializationConverter$deserialize$12;
        Object obj;
        Object coroutine_suspended;
        int i;
        ByteReadChannel byteReadChannel2;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        Charset charset2;
        KSerializer<?> kSerializer;
        SerialFormat serialFormat;
        final Charset charset3 = charset;
        final TypeInfo typeInfo2 = typeInfo;
        if (continuation instanceof KotlinxSerializationConverter$deserialize$1) {
            kotlinxSerializationConverter$deserialize$1 = (KotlinxSerializationConverter$deserialize$1) continuation;
            if ((kotlinxSerializationConverter$deserialize$1.label & Integer.MIN_VALUE) != 0) {
                kotlinxSerializationConverter$deserialize$1.label -= Integer.MIN_VALUE;
                kotlinxSerializationConverter$deserialize$12 = kotlinxSerializationConverter$deserialize$1;
                obj = kotlinxSerializationConverter$deserialize$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kotlinxSerializationConverter$deserialize$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow asFlow = FlowKt.asFlow(this.extensions);
                    Flow<Object> flow = new Flow<Object>() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, charset3, typeInfo2, byteReadChannel), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ Charset $charset$inlined;
                            final /* synthetic */ ByteReadChannel $content$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ TypeInfo $typeInfo$inlined;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
                            /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$charset$inlined = charset;
                                this.$typeInfo$inlined = typeInfo;
                                this.$content$inlined = byteReadChannel;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                Object obj2;
                                Object coroutine_suspended;
                                int i;
                                FlowCollector flowCollector;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        obj2 = anonymousClass1.result;
                                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                            Charset charset = this.$charset$inlined;
                                            TypeInfo typeInfo = this.$typeInfo$inlined;
                                            ByteReadChannel byteReadChannel = this.$content$inlined;
                                            anonymousClass1.L$0 = flowCollector2;
                                            anonymousClass1.label = 1;
                                            Object deserialize = ((KotlinxSerializationExtension) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                                            if (deserialize == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            obj2 = deserialize;
                                            flowCollector = flowCollector2;
                                        } else {
                                            if (i != 1) {
                                                if (i != 2) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj2);
                                                return Unit.INSTANCE;
                                            }
                                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                            ResultKt.throwOnFailure(obj2);
                                            flowCollector = flowCollector3;
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                obj2 = anonymousClass1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new KotlinxSerializationConverter$deserialize$fromExtension$2(byteReadChannel, null);
                    kotlinxSerializationConverter$deserialize$12.L$0 = this;
                    kotlinxSerializationConverter$deserialize$12.L$1 = charset3;
                    kotlinxSerializationConverter$deserialize$12.L$2 = typeInfo2;
                    kotlinxSerializationConverter$deserialize$12.L$3 = byteReadChannel;
                    kotlinxSerializationConverter$deserialize$12.label = 1;
                    obj = FlowKt.firstOrNull(flow, kotlinxSerializationConverter$deserialize$fromExtension$2, kotlinxSerializationConverter$deserialize$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    kotlinxSerializationConverter = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kSerializer = (KSerializer) kotlinxSerializationConverter$deserialize$12.L$2;
                        charset2 = (Charset) kotlinxSerializationConverter$deserialize$12.L$1;
                        kotlinxSerializationConverter = (KotlinxSerializationConverter) kotlinxSerializationConverter$deserialize$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteReadPacket byteReadPacket = (ByteReadPacket) obj;
                        try {
                            serialFormat = kotlinxSerializationConverter.format;
                            if (!(serialFormat instanceof StringFormat)) {
                                return ((StringFormat) serialFormat).decodeFromString(kSerializer, StringsKt.readText$default(byteReadPacket, charset2, 0, 2, (Object) null));
                            }
                            if (serialFormat instanceof BinaryFormat) {
                                return ((BinaryFormat) serialFormat).decodeFromByteArray(kSerializer, StringsKt.readBytes$default(byteReadPacket, 0, 1, null));
                            }
                            InputKt.discard(byteReadPacket);
                            throw new IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
                        } catch (Throwable th) {
                            throw new JsonConvertException("Illegal input: " + th.getMessage(), th);
                        }
                    }
                    ByteReadChannel byteReadChannel3 = (ByteReadChannel) kotlinxSerializationConverter$deserialize$12.L$3;
                    typeInfo2 = (TypeInfo) kotlinxSerializationConverter$deserialize$12.L$2;
                    Charset charset4 = (Charset) kotlinxSerializationConverter$deserialize$12.L$1;
                    KotlinxSerializationConverter kotlinxSerializationConverter2 = (KotlinxSerializationConverter) kotlinxSerializationConverter$deserialize$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteReadChannel2 = byteReadChannel3;
                    charset3 = charset4;
                    kotlinxSerializationConverter = kotlinxSerializationConverter2;
                }
                if (!(!kotlinxSerializationConverter.extensions.isEmpty()) && (obj != null || byteReadChannel2.isClosedForRead())) {
                    return obj;
                }
                KSerializer<?> serializerForTypeInfo = SerializerLookupKt.serializerForTypeInfo(kotlinxSerializationConverter.format.getSerializersModule(), typeInfo2);
                kotlinxSerializationConverter$deserialize$12.L$0 = kotlinxSerializationConverter;
                kotlinxSerializationConverter$deserialize$12.L$1 = charset3;
                kotlinxSerializationConverter$deserialize$12.L$2 = serializerForTypeInfo;
                kotlinxSerializationConverter$deserialize$12.L$3 = null;
                kotlinxSerializationConverter$deserialize$12.label = 2;
                obj = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel2, 0L, kotlinxSerializationConverter$deserialize$12, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                charset2 = charset3;
                kSerializer = serializerForTypeInfo;
                ByteReadPacket byteReadPacket2 = (ByteReadPacket) obj;
                serialFormat = kotlinxSerializationConverter.format;
                if (!(serialFormat instanceof StringFormat)) {
                }
            }
        }
        kotlinxSerializationConverter$deserialize$1 = new KotlinxSerializationConverter$deserialize$1(this, continuation);
        kotlinxSerializationConverter$deserialize$12 = kotlinxSerializationConverter$deserialize$1;
        obj = kotlinxSerializationConverter$deserialize$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kotlinxSerializationConverter$deserialize$12.label;
        if (i != 0) {
        }
        if (!(!kotlinxSerializationConverter.extensions.isEmpty())) {
        }
        KSerializer<?> serializerForTypeInfo2 = SerializerLookupKt.serializerForTypeInfo(kotlinxSerializationConverter.format.getSerializersModule(), typeInfo2);
        kotlinxSerializationConverter$deserialize$12.L$0 = kotlinxSerializationConverter;
        kotlinxSerializationConverter$deserialize$12.L$1 = charset3;
        kotlinxSerializationConverter$deserialize$12.L$2 = serializerForTypeInfo2;
        kotlinxSerializationConverter$deserialize$12.L$3 = null;
        kotlinxSerializationConverter$deserialize$12.label = 2;
        obj = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel2, 0L, kotlinxSerializationConverter$deserialize$12, 1, null);
        if (obj != coroutine_suspended) {
        }
    }

    private final OutgoingContent.ByteArrayContent serializeContent(KSerializer<?> serializer, SerialFormat format, Object value, ContentType contentType, Charset charset) {
        if (format instanceof StringFormat) {
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new TextContent(((StringFormat) format).encodeToString(serializer, value), ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, 4, null);
        }
        if (format instanceof BinaryFormat) {
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new ByteArrayContent(((BinaryFormat) format).encodeToByteArray(serializer, value), contentType, null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + format).toString());
    }
}
