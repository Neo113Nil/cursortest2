package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/NetworkingLinkSignupPane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class NetworkingLinkSignupPane$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final NetworkingLinkSignupPane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NetworkingLinkSignupPane$$serializer networkingLinkSignupPane$$serializer = new NetworkingLinkSignupPane$$serializer();
        INSTANCE = networkingLinkSignupPane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.NetworkingLinkSignupPane", networkingLinkSignupPane$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("above_cta", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("skip_cta", false);
        pluginGeneratedSerialDescriptor.addElement("legal_details_notice", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(LegalDetailsNotice$$serializer.INSTANCE);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new KSerializer[]{markdownToHtmlSerializer, NetworkingLinkSignupBody$$serializer.INSTANCE, markdownToHtmlSerializer, markdownToHtmlSerializer, markdownToHtmlSerializer, nullable};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NetworkingLinkSignupPane deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        NetworkingLinkSignupBody networkingLinkSignupBody = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        LegalDetailsNotice legalDetailsNotice = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) beginStructure.decodeSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, str);
                    i |= 1;
                    break;
                case 1:
                    networkingLinkSignupBody = (NetworkingLinkSignupBody) beginStructure.decodeSerializableElement(serialDescriptor, 1, NetworkingLinkSignupBody$$serializer.INSTANCE, networkingLinkSignupBody);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 4, MarkdownToHtmlSerializer.INSTANCE, str4);
                    i |= 16;
                    break;
                case 5:
                    legalDetailsNotice = (LegalDetailsNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LegalDetailsNotice$$serializer.INSTANCE, legalDetailsNotice);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new NetworkingLinkSignupPane(i, str, networkingLinkSignupBody, str2, str3, str4, legalDetailsNotice);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NetworkingLinkSignupPane value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        String str = value.title;
        LegalDetailsNotice legalDetailsNotice = value.legalDetailsNotice;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, markdownToHtmlSerializer, str);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, NetworkingLinkSignupBody$$serializer.INSTANCE, value.body);
        beginStructure.encodeSerializableElement(serialDescriptor, 2, markdownToHtmlSerializer, value.aboveCta);
        beginStructure.encodeSerializableElement(serialDescriptor, 3, markdownToHtmlSerializer, value.cta);
        beginStructure.encodeSerializableElement(serialDescriptor, 4, markdownToHtmlSerializer, value.skipCta);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || legalDetailsNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, LegalDetailsNotice$$serializer.INSTANCE, legalDetailsNotice);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
