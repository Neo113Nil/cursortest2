package com.stripe.android.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/model/ConsumerSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsumerSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/model/ConsumerSession;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/model/ConsumerSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ConsumerSession$$serializer implements GeneratedSerializer {
    public static final ConsumerSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsumerSession$$serializer consumerSession$$serializer = new ConsumerSession$$serializer();
        INSTANCE = consumerSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsumerSession", consumerSession$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("client_secret", true);
        pluginGeneratedSerialDescriptor.addElement("email_address", false);
        pluginGeneratedSerialDescriptor.addElement("redacted_formatted_phone_number", false);
        pluginGeneratedSerialDescriptor.addElement("redacted_phone_number", false);
        pluginGeneratedSerialDescriptor.addElement("unredacted_phone_number", true);
        pluginGeneratedSerialDescriptor.addElement("phone_number_country", true);
        pluginGeneratedSerialDescriptor.addElement("verification_sessions", true);
        pluginGeneratedSerialDescriptor.addElement("mobile_fallback_webview_params", true);
        pluginGeneratedSerialDescriptor.addElement("current_authentication_level", true);
        pluginGeneratedSerialDescriptor.addElement("minimum_authentication_level", true);
        pluginGeneratedSerialDescriptor.addElement("link_brand", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ConsumerSession.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), lazyArr[6].getValue(), BuiltinSerializersKt.getNullable(MobileFallbackWebviewParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[8].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[9].getValue()), BuiltinSerializersKt.getNullable(LinkBrand.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConsumerSession deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        boolean z;
        Lazy[] lazyArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr3 = ConsumerSession.$childSerializers;
        LinkBrand linkBrand = null;
        ConsumerSession.AuthenticationLevel authenticationLevel = null;
        ConsumerSession.AuthenticationLevel authenticationLevel2 = null;
        boolean z2 = true;
        MobileFallbackWebviewParams mobileFallbackWebviewParams = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        while (z2) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z2 = false;
                case 0:
                    lazyArr = lazyArr3;
                    z = z2;
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 1:
                    lazyArr2 = lazyArr3;
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    lazyArr3 = lazyArr2;
                case 2:
                    lazyArr2 = lazyArr3;
                    str3 = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    lazyArr3 = lazyArr2;
                case 3:
                    lazyArr2 = lazyArr3;
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    lazyArr3 = lazyArr2;
                case 4:
                    lazyArr = lazyArr3;
                    z = z2;
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                    i |= 16;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 5:
                    lazyArr = lazyArr3;
                    z = z2;
                    str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str6);
                    i |= 32;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 6:
                    lazyArr = lazyArr3;
                    z = z2;
                    list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), list);
                    i |= 64;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 7:
                    lazyArr = lazyArr3;
                    z = z2;
                    mobileFallbackWebviewParams = (MobileFallbackWebviewParams) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, MobileFallbackWebviewParams$$serializer.INSTANCE, mobileFallbackWebviewParams);
                    i |= 128;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 8:
                    lazyArr = lazyArr3;
                    z = z2;
                    authenticationLevel2 = (ConsumerSession.AuthenticationLevel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), authenticationLevel2);
                    i |= 256;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 9:
                    lazyArr = lazyArr3;
                    z = z2;
                    authenticationLevel = (ConsumerSession.AuthenticationLevel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), authenticationLevel);
                    i |= 512;
                    lazyArr3 = lazyArr;
                    z2 = z;
                case 10:
                    lazyArr = lazyArr3;
                    z = z2;
                    linkBrand = (LinkBrand) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LinkBrand.Serializer.INSTANCE, linkBrand);
                    i |= 1024;
                    lazyArr3 = lazyArr;
                    z2 = z;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ConsumerSession(i, str, str2, str3, str4, str5, str6, list, mobileFallbackWebviewParams, authenticationLevel2, authenticationLevel, linkBrand);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConsumerSession value) {
        encoder.getClass();
        value.getClass();
        String str = value.clientSecret;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ConsumerSession.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            beginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        String str2 = value.emailAddress;
        LinkBrand linkBrand = value.linkBrand;
        ConsumerSession.AuthenticationLevel authenticationLevel = value.minimumAuthenticationLevel;
        ConsumerSession.AuthenticationLevel authenticationLevel2 = value.currentAuthenticationLevel;
        MobileFallbackWebviewParams mobileFallbackWebviewParams = value.mobileFallbackWebviewParams;
        List list = value.verificationSessions;
        String str3 = value.phoneNumberCountry;
        String str4 = value.unredactedPhoneNumber;
        beginStructure.encodeStringElement(serialDescriptor, 1, str2);
        beginStructure.encodeStringElement(serialDescriptor, 2, value.redactedFormattedPhoneNumber);
        beginStructure.encodeStringElement(serialDescriptor, 3, value.redactedPhoneNumber);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(list, EmptyList.INSTANCE)) {
            beginStructure.encodeSerializableElement(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), list);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || mobileFallbackWebviewParams != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, MobileFallbackWebviewParams$$serializer.INSTANCE, mobileFallbackWebviewParams);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || authenticationLevel2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (KSerializer) lazyArr[8].getValue(), authenticationLevel2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || authenticationLevel != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (KSerializer) lazyArr[9].getValue(), authenticationLevel);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || linkBrand != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 10, LinkBrand.Serializer.INSTANCE, linkBrand);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
