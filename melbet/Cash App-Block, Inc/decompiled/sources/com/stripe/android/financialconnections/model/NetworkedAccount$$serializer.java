package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.FinancialConnectionsGenericInfoScreen$$serializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class NetworkedAccount$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final NetworkedAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NetworkedAccount$$serializer networkedAccount$$serializer = new NetworkedAccount$$serializer();
        INSTANCE = networkedAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.NetworkedAccount", networkedAccount$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("allow_selection", false);
        pluginGeneratedSerialDescriptor.addElement("caption", true);
        pluginGeneratedSerialDescriptor.addElement("selection_cta", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("selection_cta_icon", true);
        pluginGeneratedSerialDescriptor.addElement("account_icon", true);
        pluginGeneratedSerialDescriptor.addElement("data_access_notice", true);
        pluginGeneratedSerialDescriptor.addElement("drawer_on_selection", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, nullable, nullable2, BuiltinSerializersKt.getNullable(image$$serializer), BuiltinSerializersKt.getNullable(image$$serializer), BuiltinSerializersKt.getNullable(image$$serializer), BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NetworkedAccount deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        NetworkedAccount networkedAccount = null;
        boolean z = true;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Image image = null;
        Image image2 = null;
        Image image3 = null;
        DataAccessNotice dataAccessNotice = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
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
                    image3 = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Image$$serializer.INSTANCE, image3);
                    i |= 64;
                    break;
                case 7:
                    dataAccessNotice = (DataAccessNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
                    i |= 128;
                    break;
                case 8:
                    financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, financialConnectionsGenericInfoScreen);
                    i |= 256;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return networkedAccount;
            }
            networkedAccount = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new NetworkedAccount(i, str, z2, str2, str3, image, image2, image3, dataAccessNotice, financialConnectionsGenericInfoScreen);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NetworkedAccount value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.id;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = value.drawerOnSelection;
        DataAccessNotice dataAccessNotice = value.dataAccessNotice;
        Image image = value.accountIcon;
        Image image2 = value.selectionCtaIcon;
        Image image3 = value.icon;
        String str2 = value.selectionCta;
        String str3 = value.caption;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeBooleanElement(serialDescriptor, 1, value.allowSelection);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, Image$$serializer.INSTANCE, image3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, Image$$serializer.INSTANCE, image2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, Image$$serializer.INSTANCE, image);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || dataAccessNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsGenericInfoScreen != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, financialConnectionsGenericInfoScreen);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
