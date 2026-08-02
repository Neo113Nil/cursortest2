package com.squareup.cash.treehouse.flows;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl$$serializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/squareup/cash/treehouse/flows/FlowSpec.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/flows/FlowSpec;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/treehouse/flows/FlowSpec;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/treehouse/flows/FlowSpec;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowSpec$$serializer implements GeneratedSerializer {
    public static final FlowSpec$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FlowSpec$$serializer flowSpec$$serializer = new FlowSpec$$serializer();
        INSTANCE = flowSpec$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.treehouse.flows.FlowSpec", flowSpec$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("flowToken", false);
        pluginGeneratedSerialDescriptor.addElement("scenarioPlan", false);
        pluginGeneratedSerialDescriptor.addElement("clientScenarioInt", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAnalyticsName", true);
        pluginGeneratedSerialDescriptor.addElement("exitScreen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FlowSpec.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, lazyArr[1].getValue(), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ClientRouteUrl$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FlowSpec deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FlowSpec.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        ByteString byteString = null;
        Integer num = null;
        String str2 = null;
        ClientRouteUrl clientRouteUrl = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                byteString = (ByteString) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), byteString);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                clientRouteUrl = (ClientRouteUrl) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ClientRouteUrl$$serializer.INSTANCE, clientRouteUrl);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FlowSpec(i, str, byteString, num, str2, clientRouteUrl);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FlowSpec value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FlowSpec.$childSerializers;
        String str = value.flowToken;
        ClientRouteUrl clientRouteUrl = value.exitScreen;
        String str2 = value.sourceAnalyticsName;
        Integer num = value.clientScenarioInt;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), value.scenarioPlan);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || clientRouteUrl != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ClientRouteUrl$$serializer.INSTANCE, clientRouteUrl);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
