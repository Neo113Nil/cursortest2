package com.squareup.cash.treehouse.flows;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/squareup/cash/treehouse/flows/BlockerScreenSpec.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/squareup/cash/treehouse/flows/BlockerScreenSpec;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/squareup/cash/treehouse/flows/BlockerScreenSpec;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/squareup/cash/treehouse/flows/BlockerScreenSpec;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class BlockerScreenSpec$$serializer implements GeneratedSerializer {
    public static final BlockerScreenSpec$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BlockerScreenSpec$$serializer blockerScreenSpec$$serializer = new BlockerScreenSpec$$serializer();
        INSTANCE = blockerScreenSpec$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.squareup.cash.treehouse.flows.BlockerScreenSpec", blockerScreenSpec$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("flowToken", false);
        pluginGeneratedSerialDescriptor.addElement("path", false);
        pluginGeneratedSerialDescriptor.addElement("parameters", true);
        pluginGeneratedSerialDescriptor.addElement("blockerId", true);
        pluginGeneratedSerialDescriptor.addElement("clientScenarioInt", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAnalyticsName", true);
        pluginGeneratedSerialDescriptor.addElement("proposedTreehouseFlowToken", true);
        pluginGeneratedSerialDescriptor.addElement("plasmaFlowToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BlockerScreenSpec.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue()), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BlockerScreenSpec deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BlockerScreenSpec.$childSerializers;
        BlockerScreenSpec blockerScreenSpec = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        ByteString byteString = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    byteString = (ByteString) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), byteString);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str4);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return blockerScreenSpec;
            }
            blockerScreenSpec = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new BlockerScreenSpec(i, str2, str3, byteString, str4, num, str5, str6, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BlockerScreenSpec value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BlockerScreenSpec.$childSerializers;
        String str = value.flowToken;
        String str2 = value.plasmaFlowToken;
        String str3 = value.proposedTreehouseFlowToken;
        String str4 = value.sourceAnalyticsName;
        Integer num = value.clientScenarioInt;
        String str5 = value.blockerId;
        ByteString byteString = value.parameters;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.path);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || byteString != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), byteString);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str2);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
