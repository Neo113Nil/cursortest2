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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/ConsentPane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/ConsentPane;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/ConsentPane;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ConsentPane$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final ConsentPane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsentPane$$serializer consentPane$$serializer = new ConsentPane$$serializer();
        INSTANCE = consentPane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.ConsentPane", consentPane$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("above_cta", false);
        pluginGeneratedSerialDescriptor.addElement("below_cta", true);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("data_access_notice", true);
        pluginGeneratedSerialDescriptor.addElement("legal_details_notice", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new KSerializer[]{markdownToHtmlSerializer, BuiltinSerializersKt.getNullable(markdownToHtmlSerializer), ConsentPaneBody$$serializer.INSTANCE, markdownToHtmlSerializer, BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE), LegalDetailsNotice$$serializer.INSTANCE, markdownToHtmlSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConsentPane deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ConsentPaneBody consentPaneBody = null;
        String str3 = null;
        DataAccessNotice dataAccessNotice = null;
        LegalDetailsNotice legalDetailsNotice = null;
        String str4 = null;
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
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MarkdownToHtmlSerializer.INSTANCE, str2);
                    i |= 2;
                    break;
                case 2:
                    consentPaneBody = (ConsentPaneBody) beginStructure.decodeSerializableElement(serialDescriptor, 2, ConsentPaneBody$$serializer.INSTANCE, consentPaneBody);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, str3);
                    i |= 8;
                    break;
                case 4:
                    dataAccessNotice = (DataAccessNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
                    i |= 16;
                    break;
                case 5:
                    legalDetailsNotice = (LegalDetailsNotice) beginStructure.decodeSerializableElement(serialDescriptor, 5, LegalDetailsNotice$$serializer.INSTANCE, legalDetailsNotice);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) beginStructure.decodeSerializableElement(serialDescriptor, 6, MarkdownToHtmlSerializer.INSTANCE, str4);
                    i |= 64;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ConsentPane(i, str, str2, consentPaneBody, str3, dataAccessNotice, legalDetailsNotice, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConsentPane value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        String str = value.aboveCta;
        DataAccessNotice dataAccessNotice = value.dataAccessNotice;
        String str2 = value.belowCta;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, markdownToHtmlSerializer, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, markdownToHtmlSerializer, str2);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 2, ConsentPaneBody$$serializer.INSTANCE, value.body);
        beginStructure.encodeSerializableElement(serialDescriptor, 3, markdownToHtmlSerializer, value.cta);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || dataAccessNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 5, LegalDetailsNotice$$serializer.INSTANCE, value.legalDetailsNotice);
        beginStructure.encodeSerializableElement(serialDescriptor, 6, markdownToHtmlSerializer, value.title);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
