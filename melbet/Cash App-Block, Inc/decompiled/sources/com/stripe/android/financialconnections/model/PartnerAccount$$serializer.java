package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/PartnerAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class PartnerAccount$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final PartnerAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PartnerAccount$$serializer partnerAccount$$serializer = new PartnerAccount$$serializer();
        INSTANCE = partnerAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.PartnerAccount", partnerAccount$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("authorization", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("subcategory", false);
        pluginGeneratedSerialDescriptor.addElement("supported_payment_method_types", false);
        pluginGeneratedSerialDescriptor.addElement("balance_amount", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("institution", true);
        pluginGeneratedSerialDescriptor.addElement("displayable_account_numbers", true);
        pluginGeneratedSerialDescriptor.addElement("initial_balance_amount", true);
        pluginGeneratedSerialDescriptor.addElement("institution_name", true);
        pluginGeneratedSerialDescriptor.addElement("allow_selection", true);
        pluginGeneratedSerialDescriptor.addElement("allow_selection_message", true);
        pluginGeneratedSerialDescriptor.addElement("next_pane_on_selection", true);
        pluginGeneratedSerialDescriptor.addElement("institution_url", true);
        pluginGeneratedSerialDescriptor.addElement("linked_account_id", true);
        pluginGeneratedSerialDescriptor.addElement("routing_number", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PartnerAccount.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Category.Serializer.INSTANCE), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE), lazyArr[5].getValue(), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsInstitution$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Status.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PartnerAccount deserialize(Decoder decoder) {
        String str;
        Integer num;
        int i;
        String str2;
        String str3;
        String str4;
        Integer num2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PartnerAccount.$childSerializers;
        String str5 = null;
        Integer num3 = null;
        String str6 = null;
        FinancialConnectionsInstitution financialConnectionsInstitution = null;
        Boolean bool = null;
        String str7 = null;
        int i2 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        FinancialConnectionsSessionManifest.Pane pane = null;
        String str11 = null;
        FinancialConnectionsAccount.Status status = null;
        Integer num4 = null;
        boolean z = true;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        FinancialConnectionsAccount.Category category = null;
        FinancialConnectionsAccount.Subcategory subcategory = null;
        List list = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    str2 = str5;
                    str3 = str14;
                    z = false;
                    num3 = num3;
                    num4 = num4;
                    str14 = str3;
                    str5 = str2;
                case 0:
                    str2 = str5;
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                    i2 |= 1;
                    num3 = num3;
                    num4 = num4;
                    str7 = str7;
                    str14 = str3;
                    str5 = str2;
                case 1:
                    str2 = str5;
                    str4 = str7;
                    num2 = num4;
                    category = (FinancialConnectionsAccount.Category) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category);
                    i2 |= 2;
                    subcategory = subcategory;
                    num4 = num2;
                    str7 = str4;
                    str5 = str2;
                case 2:
                    str2 = str5;
                    str4 = str7;
                    str12 = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                    str7 = str4;
                    str5 = str2;
                case 3:
                    str2 = str5;
                    str4 = str7;
                    str13 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                    str7 = str4;
                    str5 = str2;
                case 4:
                    str2 = str5;
                    str4 = str7;
                    num2 = num4;
                    subcategory = (FinancialConnectionsAccount.Subcategory) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, subcategory);
                    i2 |= 16;
                    num4 = num2;
                    str7 = str4;
                    str5 = str2;
                case 5:
                    str2 = str5;
                    str4 = str7;
                    num2 = num4;
                    list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), list);
                    i2 |= 32;
                    num4 = num2;
                    str7 = str4;
                    str5 = str2;
                case 6:
                    str2 = str5;
                    str4 = str7;
                    num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num4);
                    i2 |= 64;
                    str7 = str4;
                    str5 = str2;
                case 7:
                    str2 = str5;
                    str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str7);
                    i2 |= 128;
                    num4 = num4;
                    str5 = str2;
                case 8:
                    str = str7;
                    num = num4;
                    financialConnectionsInstitution = (FinancialConnectionsInstitution) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution);
                    i2 |= 256;
                    num4 = num;
                    str7 = str;
                case 9:
                    str = str7;
                    num = num4;
                    str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str6);
                    i2 |= 512;
                    num4 = num;
                    str7 = str;
                case 10:
                    str = str7;
                    num = num4;
                    num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num3);
                    i2 |= 1024;
                    num4 = num;
                    str7 = str;
                case 11:
                    str = str7;
                    num = num4;
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str5);
                    i2 |= 2048;
                    num4 = num;
                    str7 = str;
                case 12:
                    str = str7;
                    num = num4;
                    bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool);
                    i2 |= 4096;
                    num4 = num;
                    str7 = str;
                case 13:
                    str = str7;
                    num = num4;
                    str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str10);
                    i2 |= PKIFailureInfo.certRevoked;
                    num4 = num;
                    str7 = str;
                case 14:
                    str = str7;
                    num = num4;
                    pane = (FinancialConnectionsSessionManifest.Pane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
                    i2 |= 16384;
                    num4 = num;
                    str7 = str;
                case 15:
                    str = str7;
                    num = num4;
                    str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str8);
                    i = 32768;
                    i2 |= i;
                    num4 = num;
                    str7 = str;
                case 16:
                    str = str7;
                    num = num4;
                    str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str9);
                    i = 65536;
                    i2 |= i;
                    num4 = num;
                    str7 = str;
                case 17:
                    str = str7;
                    num = num4;
                    str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str11);
                    i = PKIFailureInfo.unsupportedVersion;
                    i2 |= i;
                    num4 = num;
                    str7 = str;
                case 18:
                    num = num4;
                    str = str7;
                    status = (FinancialConnectionsAccount.Status) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status);
                    i = PKIFailureInfo.transactionIdInUse;
                    i2 |= i;
                    num4 = num;
                    str7 = str;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        String str15 = str5;
        Integer num5 = num4;
        String str16 = str14;
        FinancialConnectionsAccount.Category category2 = category;
        FinancialConnectionsAccount.Subcategory subcategory2 = subcategory;
        beginStructure.endStructure(serialDescriptor);
        return new PartnerAccount(i2, str16, category2, str12, str13, subcategory2, list, num5, str7, financialConnectionsInstitution, str6, num3, str15, bool, str10, pane, str8, str9, str11, status);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PartnerAccount value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PartnerAccount.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        String str = value.authorization;
        FinancialConnectionsAccount.Status status = value.status;
        String str2 = value.routingNumber;
        String str3 = value.linkedAccountId;
        String str4 = value.institutionUrl;
        FinancialConnectionsSessionManifest.Pane pane = value.nextPaneOnSelection;
        String str5 = value.allowSelectionMessage;
        Boolean bool = value._allowSelection;
        String str6 = value.institutionName;
        Integer num = value.initialBalanceAmount;
        String str7 = value.displayableAccountNumbers;
        FinancialConnectionsInstitution financialConnectionsInstitution = value.institution;
        String str8 = value.currency;
        Integer num2 = value.balanceAmount;
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, value.category);
        beginStructure.encodeStringElement(serialDescriptor, 2, value.id);
        beginStructure.encodeStringElement(serialDescriptor, 3, value.name);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, value.subcategory);
        beginStructure.encodeSerializableElement(serialDescriptor, 5, (KSerializer) lazyArr[5].getValue(), value.supportedPaymentMethodTypes);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str8 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, str8);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsInstitution != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str7 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, str7);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str6 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str6);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || pane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 14, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || status != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
