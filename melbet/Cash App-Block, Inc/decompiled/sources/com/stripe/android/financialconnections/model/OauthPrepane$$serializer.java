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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/OauthPrepane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/OauthPrepane;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/OauthPrepane;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class OauthPrepane$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final OauthPrepane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OauthPrepane$$serializer oauthPrepane$$serializer = new OauthPrepane$$serializer();
        INSTANCE = oauthPrepane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.OauthPrepane", oauthPrepane$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("institution_icon", true);
        pluginGeneratedSerialDescriptor.addElement("partner_notice", true);
        pluginGeneratedSerialDescriptor.addElement("data_access_notice", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(PartnerNotice$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new KSerializer[]{Body$$serializer.INSTANCE, Cta$$serializer.INSTANCE, nullable, nullable2, nullable3, markdownToHtmlSerializer, markdownToHtmlSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final OauthPrepane deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        Body body = null;
        Cta cta = null;
        Image image = null;
        PartnerNotice partnerNotice = null;
        DataAccessNotice dataAccessNotice = null;
        String str = null;
        String str2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    body = (Body) beginStructure.decodeSerializableElement(serialDescriptor, 0, Body$$serializer.INSTANCE, body);
                    i |= 1;
                    break;
                case 1:
                    cta = (Cta) beginStructure.decodeSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta);
                    i |= 2;
                    break;
                case 2:
                    image = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, image);
                    i |= 4;
                    break;
                case 3:
                    partnerNotice = (PartnerNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PartnerNotice$$serializer.INSTANCE, partnerNotice);
                    i |= 8;
                    break;
                case 4:
                    dataAccessNotice = (DataAccessNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
                    i |= 16;
                    break;
                case 5:
                    str = (String) beginStructure.decodeSerializableElement(serialDescriptor, 5, MarkdownToHtmlSerializer.INSTANCE, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 6, MarkdownToHtmlSerializer.INSTANCE, str2);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new OauthPrepane(i, body, cta, image, partnerNotice, dataAccessNotice, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OauthPrepane value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Body$$serializer body$$serializer = Body$$serializer.INSTANCE;
        Body body = value.body;
        DataAccessNotice dataAccessNotice = value.dataAccessNotice;
        PartnerNotice partnerNotice = value.partnerNotice;
        Image image = value.institutionIcon;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, body$$serializer, body);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, value.cta);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, image);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || partnerNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, PartnerNotice$$serializer.INSTANCE, partnerNotice);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || dataAccessNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
        }
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        beginStructure.encodeSerializableElement(serialDescriptor, 5, markdownToHtmlSerializer, value.title);
        beginStructure.encodeSerializableElement(serialDescriptor, 6, markdownToHtmlSerializer, value.subtitle);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
