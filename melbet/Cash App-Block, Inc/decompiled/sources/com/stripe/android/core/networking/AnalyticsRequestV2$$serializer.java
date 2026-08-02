package com.stripe.android.core.networking;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.StripeRequest;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/core/networking/AnalyticsRequestV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class AnalyticsRequestV2$$serializer implements GeneratedSerializer {
    public static final AnalyticsRequestV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AnalyticsRequestV2$$serializer analyticsRequestV2$$serializer = new AnalyticsRequestV2$$serializer();
        INSTANCE = analyticsRequestV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.core.networking.AnalyticsRequestV2", analyticsRequestV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("eventName", false);
        pluginGeneratedSerialDescriptor.addElement("clientId", false);
        pluginGeneratedSerialDescriptor.addElement("origin", false);
        pluginGeneratedSerialDescriptor.addElement("created", false);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        pluginGeneratedSerialDescriptor.addElement("postParameters", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("mimeType", true);
        pluginGeneratedSerialDescriptor.addElement("retryResponseCodes", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = AnalyticsRequestV2.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, JsonElementSerializer.INSTANCE, stringSerializer, lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AnalyticsRequestV2 deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = AnalyticsRequestV2.$childSerializers;
        double d = 0.0d;
        Iterable iterable = null;
        StripeRequest.MimeType mimeType = null;
        boolean z = true;
        Map map = null;
        StripeRequest.Method method = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        JsonElement jsonElement = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    str3 = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    d = beginStructure.decodeDoubleElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    jsonElement = (JsonElement) beginStructure.decodeSerializableElement(serialDescriptor, 4, JsonElementSerializer.INSTANCE, jsonElement);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    map = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    method = (StripeRequest.Method) beginStructure.decodeSerializableElement(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), method);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    mimeType = (StripeRequest.MimeType) beginStructure.decodeSerializableElement(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), mimeType);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    iterable = (Iterable) beginStructure.decodeSerializableElement(serialDescriptor, 9, (KSerializer) lazyArr2[9].getValue(), iterable);
                    i |= 512;
                    break;
                case 10:
                    str5 = beginStructure.decodeStringElement(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
            lazyArr2 = lazyArr;
        }
        beginStructure.endStructure(serialDescriptor);
        return new AnalyticsRequestV2(i, str, str2, str3, d, jsonElement, str4, map, method, mimeType, iterable, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, kotlin.collections.MapsKt__MapsKt.mapOf(new kotlin.Pair("Content-Type", androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m("application/x-www-form-urlencoded; charset=", kotlin.text.Charsets.UTF_8.name())), new kotlin.Pair("origin", r1), new kotlin.Pair("User-Agent", "Stripe/v1 android/23.9.1"))) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, AnalyticsRequestV2 value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AnalyticsRequestV2.$childSerializers;
        String str = value.eventName;
        String str2 = value.url;
        Iterable iterable = value.retryResponseCodes;
        StripeRequest.MimeType mimeType = value.mimeType;
        StripeRequest.Method method = value.method;
        Map map = value.headers;
        String str3 = value.postParameters;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.clientId);
        String str4 = value.origin;
        beginStructure.encodeStringElement(serialDescriptor, 2, str4);
        beginStructure.encodeDoubleElement(serialDescriptor, 3, value.created);
        beginStructure.encodeSerializableElement(serialDescriptor, 4, JsonElementSerializer.INSTANCE, value.params);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(str3, value.createPostParams())) {
            beginStructure.encodeStringElement(serialDescriptor, 5, str3);
        }
        if (!beginStructure.shouldEncodeElementDefault(serialDescriptor)) {
            StripeRequest.MimeType mimeType2 = StripeRequest.MimeType.Form;
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), map);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || method != StripeRequest.Method.POST) {
            beginStructure.encodeSerializableElement(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), method);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || mimeType != StripeRequest.MimeType.Form) {
            beginStructure.encodeSerializableElement(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), mimeType);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(iterable, new IntRange(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429, 1))) {
            beginStructure.encodeSerializableElement(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), iterable);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(str2, "https://r.stripe.com/0")) {
            beginStructure.encodeStringElement(serialDescriptor, 10, str2);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
