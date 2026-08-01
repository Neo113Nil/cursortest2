package io.ktor.serialization.kotlinx.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", FirebaseAnalytics.Param.INDEX, "", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1<T> implements FlowCollector<T> {
    final /* synthetic */ ByteWriteChannel $channel$inlined;
    final /* synthetic */ Charset $charset$inlined;
    final /* synthetic */ JsonArraySymbols $jsonArraySymbols$inlined;
    final /* synthetic */ KSerializer $serializer$inlined;
    private int index;
    final /* synthetic */ KotlinxSerializationJsonExtensions this$0;

    /* compiled from: Collect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 1}, l = {124, 127}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this.emit(null, this);
        }
    }

    public KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(ByteWriteChannel byteWriteChannel, JsonArraySymbols jsonArraySymbols, KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, KSerializer kSerializer, Charset charset) {
        this.$channel$inlined = byteWriteChannel;
        this.$jsonArraySymbols$inlined = jsonArraySymbols;
        this.this$0 = kotlinxSerializationJsonExtensions;
        this.$serializer$inlined = kSerializer;
        this.$charset$inlined = charset;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object coroutine_suspended;
        int i;
        T t2;
        KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1<T> kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
        KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1<T> kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$12;
        Json json;
        ByteWriteChannel byteWriteChannel;
        byte[] encodeToByteArray;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = this.index;
                    this.index = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    if (i2 <= 0) {
                        t2 = t;
                        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = this;
                        json = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this$0.format;
                        String encodeToString = json.encodeToString(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$serializer$inlined, t2);
                        byteWriteChannel = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined;
                        if (Intrinsics.areEqual(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$charset$inlined, Charsets.UTF_8)) {
                            encodeToByteArray = StringsKt.encodeToByteArray(encodeToString);
                        } else {
                            CharsetEncoder newEncoder = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$charset$inlined.newEncoder();
                            Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
                            encodeToByteArray = CharsetJVMKt.encodeToByteArray(newEncoder, encodeToString, 0, encodeToString.length());
                        }
                        anonymousClass1.L$0 = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (ByteWriteChannelKt.writeFully(byteWriteChannel, encodeToByteArray, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined.flush();
                        return Unit.INSTANCE;
                    }
                    ByteWriteChannel byteWriteChannel2 = this.$channel$inlined;
                    byte[] objectSeparator = this.$jsonArraySymbols$inlined.getObjectSeparator();
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = t;
                    anonymousClass1.label = 1;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel2, objectSeparator, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$12 = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = (KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(obj);
                        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined.flush();
                        return Unit.INSTANCE;
                    }
                    t = (T) anonymousClass1.L$1;
                    kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$12 = (KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                t2 = t;
                kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$12;
                json = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this$0.format;
                String encodeToString2 = json.encodeToString(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$serializer$inlined, t2);
                byteWriteChannel = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined;
                if (Intrinsics.areEqual(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$charset$inlined, Charsets.UTF_8)) {
                }
                anonymousClass1.L$0 = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, encodeToByteArray, anonymousClass1) == coroutine_suspended) {
                }
                kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined.flush();
                return Unit.INSTANCE;
            }
        }
        anonymousClass1 = new AnonymousClass1(continuation);
        Object obj2 = anonymousClass1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.label;
        if (i != 0) {
        }
        t2 = t;
        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$12;
        json = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this$0.format;
        String encodeToString22 = json.encodeToString(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$serializer$inlined, t2);
        byteWriteChannel = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined;
        if (Intrinsics.areEqual(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$charset$inlined, Charsets.UTF_8)) {
        }
        anonymousClass1.L$0 = kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (ByteWriteChannelKt.writeFully(byteWriteChannel, encodeToByteArray, anonymousClass1) == coroutine_suspended) {
        }
        kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.$channel$inlined.flush();
        return Unit.INSTANCE;
    }
}
