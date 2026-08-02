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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/DataAccessNotice.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class DataAccessNotice$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final DataAccessNotice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DataAccessNotice$$serializer dataAccessNotice$$serializer = new DataAccessNotice$$serializer();
        INSTANCE = dataAccessNotice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.DataAccessNotice", dataAccessNotice$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("connected_account_notice", true);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", true);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new KSerializer[]{nullable, markdownToHtmlSerializer, BuiltinSerializersKt.getNullable(markdownToHtmlSerializer), DataAccessNoticeBody$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ConnectedAccessNotice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(markdownToHtmlSerializer), markdownToHtmlSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DataAccessNotice deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        Image image = null;
        String str = null;
        String str2 = null;
        DataAccessNoticeBody dataAccessNoticeBody = null;
        ConnectedAccessNotice connectedAccessNotice = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    image = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Image$$serializer.INSTANCE, image);
                    i |= 1;
                    break;
                case 1:
                    str = (String) beginStructure.decodeSerializableElement(serialDescriptor, 1, MarkdownToHtmlSerializer.INSTANCE, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    dataAccessNoticeBody = (DataAccessNoticeBody) beginStructure.decodeSerializableElement(serialDescriptor, 3, DataAccessNoticeBody$$serializer.INSTANCE, dataAccessNoticeBody);
                    i |= 8;
                    break;
                case 4:
                    connectedAccessNotice = (ConnectedAccessNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ConnectedAccessNotice$$serializer.INSTANCE, connectedAccessNotice);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, MarkdownToHtmlSerializer.INSTANCE, str3);
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
        return new DataAccessNotice(i, image, str, str2, dataAccessNoticeBody, connectedAccessNotice, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DataAccessNotice value) {
        encoder.getClass();
        value.getClass();
        Image image = value.icon;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, Image$$serializer.INSTANCE, image);
        }
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        String str = value.title;
        String str2 = value.disclaimer;
        ConnectedAccessNotice connectedAccessNotice = value.connectedAccountNotice;
        String str3 = value.subtitle;
        beginStructure.encodeSerializableElement(serialDescriptor, 1, markdownToHtmlSerializer, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, markdownToHtmlSerializer, str3);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 3, DataAccessNoticeBody$$serializer.INSTANCE, value.body);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || connectedAccessNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ConnectedAccessNotice$$serializer.INSTANCE, connectedAccessNotice);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, markdownToHtmlSerializer, str2);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 6, markdownToHtmlSerializer, value.cta);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
