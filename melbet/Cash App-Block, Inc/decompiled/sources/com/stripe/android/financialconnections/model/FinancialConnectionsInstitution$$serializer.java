package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsInstitution.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsInstitution$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsInstitution$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsInstitution$$serializer financialConnectionsInstitution$$serializer = new FinancialConnectionsInstitution$$serializer();
        INSTANCE = financialConnectionsInstitution$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsInstitution", financialConnectionsInstitution$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("featured", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("mobile_handoff_capable", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("featured_order", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(image$$serializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(image$$serializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, booleanSerializer, stringSerializer, nullable, nullable2, nullable3, nullable4};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsInstitution deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        FinancialConnectionsInstitution financialConnectionsInstitution = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        Image image = null;
        Image image2 = null;
        Integer num = null;
        String str3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    image = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Image$$serializer.INSTANCE, image);
                    i |= 16;
                    break;
                case 5:
                    image2 = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Image$$serializer.INSTANCE, image2);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str3);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return financialConnectionsInstitution;
            }
            financialConnectionsInstitution = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsInstitution(i, z2, str, z3, str2, image, image2, num, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsInstitution value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.featured;
        String str = value.url;
        Integer num = value.featuredOrder;
        Image image = value.logo;
        Image image2 = value.icon;
        beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.id);
        beginStructure.encodeBooleanElement(serialDescriptor, 2, value.mobileHandoffCapable);
        beginStructure.encodeStringElement(serialDescriptor, 3, value.name);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, Image$$serializer.INSTANCE, image2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, Image$$serializer.INSTANCE, image);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
