package com.stripe.android.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.model.LinkBrand;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/model/ConsumerSessionLookup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/model/ConsumerSessionLookup;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/model/ConsumerSessionLookup;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ConsumerSessionLookup$$serializer implements GeneratedSerializer {
    public static final ConsumerSessionLookup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsumerSessionLookup$$serializer consumerSessionLookup$$serializer = new ConsumerSessionLookup$$serializer();
        INSTANCE = consumerSessionLookup$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsumerSessionLookup", consumerSessionLookup$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("exists", false);
        pluginGeneratedSerialDescriptor.addElement("consumer_session", true);
        pluginGeneratedSerialDescriptor.addElement("error_message", true);
        pluginGeneratedSerialDescriptor.addElement("publishable_key", true);
        pluginGeneratedSerialDescriptor.addElement("displayable_payment_details", true);
        pluginGeneratedSerialDescriptor.addElement("consent_ui", true);
        pluginGeneratedSerialDescriptor.addElement("suggested_email", true);
        pluginGeneratedSerialDescriptor.addElement("link_brand", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(ConsumerSession$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DisplayablePaymentDetails$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConsentUi$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LinkBrand.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConsumerSessionLookup deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        ConsumerSessionLookup consumerSessionLookup = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ConsumerSession consumerSession = null;
        String str = null;
        String str2 = null;
        DisplayablePaymentDetails displayablePaymentDetails = null;
        ConsentUi consentUi = null;
        String str3 = null;
        LinkBrand linkBrand = null;
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
                    consumerSession = (ConsumerSession) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConsumerSession$$serializer.INSTANCE, consumerSession);
                    i |= 2;
                    break;
                case 2:
                    str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
                    i |= 8;
                    break;
                case 4:
                    displayablePaymentDetails = (DisplayablePaymentDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DisplayablePaymentDetails$$serializer.INSTANCE, displayablePaymentDetails);
                    i |= 16;
                    break;
                case 5:
                    consentUi = (ConsentUi) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ConsentUi$$serializer.INSTANCE, consentUi);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
                    i |= 64;
                    break;
                case 7:
                    linkBrand = (LinkBrand) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LinkBrand.Serializer.INSTANCE, linkBrand);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return consumerSessionLookup;
            }
            consumerSessionLookup = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new ConsumerSessionLookup(i, z2, consumerSession, str, str2, displayablePaymentDetails, consentUi, str3, linkBrand);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConsumerSessionLookup value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.exists;
        LinkBrand linkBrand = value.linkBrand;
        String str = value.suggestedEmail;
        ConsentUi consentUi = value.consentUi;
        DisplayablePaymentDetails displayablePaymentDetails = value.displayablePaymentDetails;
        String str2 = value.publishableKey;
        String str3 = value.errorMessage;
        ConsumerSession consumerSession = value.consumerSession;
        beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || consumerSession != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ConsumerSession$$serializer.INSTANCE, consumerSession);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || displayablePaymentDetails != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, DisplayablePaymentDetails$$serializer.INSTANCE, displayablePaymentDetails);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || consentUi != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ConsentUi$$serializer.INSTANCE, consentUi);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || linkBrand != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, LinkBrand.Serializer.INSTANCE, linkBrand);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
