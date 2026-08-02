package com.stripe.android.uicore.address;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/uicore/address/CountryAddressSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/uicore/address/CountryAddressSchema;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/uicore/address/CountryAddressSchema;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class CountryAddressSchema$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final CountryAddressSchema$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CountryAddressSchema$$serializer countryAddressSchema$$serializer = new CountryAddressSchema$$serializer();
        INSTANCE = countryAddressSchema$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.uicore.address.CountryAddressSchema", countryAddressSchema$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("required", false);
        pluginGeneratedSerialDescriptor.addElement("schema", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer) CountryAddressSchema.$childSerializers[0].getValue()), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FieldSchema$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CountryAddressSchema deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CountryAddressSchema.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        FieldType fieldType = null;
        FieldSchema fieldSchema = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                fieldType = (FieldType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), fieldType);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                z2 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                fieldSchema = (FieldSchema) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FieldSchema$$serializer.INSTANCE, fieldSchema);
                i |= 4;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new CountryAddressSchema(i, fieldType, z2, fieldSchema);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CountryAddressSchema value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        KSerializer kSerializer = (KSerializer) CountryAddressSchema.$childSerializers[0].getValue();
        FieldType fieldType = value.f1447type;
        FieldSchema fieldSchema = value.schema;
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, kSerializer, fieldType);
        beginStructure.encodeBooleanElement(serialDescriptor, 1, value.required);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || fieldSchema != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, FieldSchema$$serializer.INSTANCE, fieldSchema);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
