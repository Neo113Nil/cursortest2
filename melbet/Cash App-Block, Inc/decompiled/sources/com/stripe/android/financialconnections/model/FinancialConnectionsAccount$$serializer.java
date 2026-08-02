package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsAccount$$serializer implements GeneratedSerializer {
    public static final FinancialConnectionsAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsAccount$$serializer financialConnectionsAccount$$serializer = new FinancialConnectionsAccount$$serializer();
        INSTANCE = financialConnectionsAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", financialConnectionsAccount$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement("created", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("institution_name", false);
        pluginGeneratedSerialDescriptor.addElement("livemode", false);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("subcategory", true);
        pluginGeneratedSerialDescriptor.addElement("supported_payment_method_types", false);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("balance_refresh", true);
        pluginGeneratedSerialDescriptor.addElement("display_name", true);
        pluginGeneratedSerialDescriptor.addElement("last4", true);
        pluginGeneratedSerialDescriptor.addElement("ownership", true);
        pluginGeneratedSerialDescriptor.addElement("ownership_refresh", true);
        pluginGeneratedSerialDescriptor.addElement("permissions", true);
        pluginGeneratedSerialDescriptor.addElement("object", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FinancialConnectionsAccount.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{FinancialConnectionsAccount.Category.Serializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, FinancialConnectionsAccount.Status.Serializer.INSTANCE, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, lazyArr[7].getValue(), BuiltinSerializersKt.getNullable(Balance$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BalanceRefresh$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OwnershipRefresh$$serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[14].getValue()), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsAccount deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsAccount.$childSerializers;
        String str3 = null;
        String str4 = null;
        BalanceRefresh balanceRefresh = null;
        Balance balance = null;
        String str5 = null;
        List list = null;
        int i = 0;
        FinancialConnectionsAccount.Category category = null;
        OwnershipRefresh ownershipRefresh = null;
        List list2 = null;
        String str6 = null;
        boolean z2 = false;
        FinancialConnectionsAccount.Status status = null;
        FinancialConnectionsAccount.Subcategory subcategory = null;
        boolean z3 = true;
        int i2 = 0;
        String str7 = null;
        String str8 = null;
        while (z3) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    str = str6;
                    z3 = false;
                    str6 = str;
                case 0:
                    str2 = str6;
                    z = z2;
                    category = (FinancialConnectionsAccount.Category) beginStructure.decodeSerializableElement(serialDescriptor, 0, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category);
                    i |= 1;
                    str6 = str2;
                    z2 = z;
                case 1:
                    str = str6;
                    i2 = beginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                    str6 = str;
                case 2:
                    str = str6;
                    str7 = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    str6 = str;
                case 3:
                    str6 = beginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                case 4:
                    str = str6;
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    str6 = str;
                case 5:
                    str2 = str6;
                    z = z2;
                    status = (FinancialConnectionsAccount.Status) beginStructure.decodeSerializableElement(serialDescriptor, 5, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status);
                    i |= 32;
                    str6 = str2;
                    z2 = z;
                case 6:
                    str2 = str6;
                    z = z2;
                    subcategory = (FinancialConnectionsAccount.Subcategory) beginStructure.decodeSerializableElement(serialDescriptor, 6, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, subcategory);
                    i |= 64;
                    str6 = str2;
                    z2 = z;
                case 7:
                    str2 = str6;
                    z = z2;
                    list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), list);
                    i |= 128;
                    str6 = str2;
                    z2 = z;
                case 8:
                    str2 = str6;
                    z = z2;
                    balance = (Balance) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, Balance$$serializer.INSTANCE, balance);
                    i |= 256;
                    str6 = str2;
                    z2 = z;
                case 9:
                    str2 = str6;
                    z = z2;
                    balanceRefresh = (BalanceRefresh) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BalanceRefresh$$serializer.INSTANCE, balanceRefresh);
                    i |= 512;
                    str6 = str2;
                    z2 = z;
                case 10:
                    str2 = str6;
                    z = z2;
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str4);
                    i |= 1024;
                    str6 = str2;
                    z2 = z;
                case 11:
                    str2 = str6;
                    z = z2;
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str3);
                    i |= 2048;
                    str6 = str2;
                    z2 = z;
                case 12:
                    str2 = str6;
                    z = z2;
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str5);
                    i |= 4096;
                    str6 = str2;
                    z2 = z;
                case 13:
                    str2 = str6;
                    z = z2;
                    ownershipRefresh = (OwnershipRefresh) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, OwnershipRefresh$$serializer.INSTANCE, ownershipRefresh);
                    i |= PKIFailureInfo.certRevoked;
                    str6 = str2;
                    z2 = z;
                case 14:
                    str2 = str6;
                    z = z2;
                    list2 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), list2);
                    i |= 16384;
                    str6 = str2;
                    z2 = z;
                case 15:
                    str = str6;
                    str8 = beginStructure.decodeStringElement(serialDescriptor, 15);
                    i |= 32768;
                    str6 = str;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsAccount(i, category, i2, str7, str6, z2, status, subcategory, list, balance, balanceRefresh, str4, str3, str5, ownershipRefresh, list2, str8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsAccount value) {
        encoder.getClass();
        value.getClass();
        FinancialConnectionsAccount.Category category = value.category;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsAccount.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || category != FinancialConnectionsAccount.Category.UNKNOWN) {
            beginStructure.encodeSerializableElement(serialDescriptor, 0, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category);
        }
        int i = value.created;
        List list = value.permissions;
        OwnershipRefresh ownershipRefresh = value.ownershipRefresh;
        String str = value.ownership;
        String str2 = value.last4;
        String str3 = value.displayName;
        BalanceRefresh balanceRefresh = value.balanceRefresh;
        Balance balance = value.balance;
        FinancialConnectionsAccount.Subcategory subcategory = value.subcategory;
        FinancialConnectionsAccount.Status status = value.status;
        beginStructure.encodeIntElement(1, i, serialDescriptor);
        beginStructure.encodeStringElement(serialDescriptor, 2, value.id);
        beginStructure.encodeStringElement(serialDescriptor, 3, value.institutionName);
        beginStructure.encodeBooleanElement(serialDescriptor, 4, value.livemode);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || status != FinancialConnectionsAccount.Status.UNKNOWN) {
            beginStructure.encodeSerializableElement(serialDescriptor, 5, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || subcategory != FinancialConnectionsAccount.Subcategory.UNKNOWN) {
            beginStructure.encodeSerializableElement(serialDescriptor, 6, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, subcategory);
        }
        beginStructure.encodeSerializableElement(serialDescriptor, 7, (KSerializer) lazyArr[7].getValue(), value.supportedPaymentMethodTypes);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || balance != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, Balance$$serializer.INSTANCE, balance);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || balanceRefresh != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 9, BalanceRefresh$$serializer.INSTANCE, balanceRefresh);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || ownershipRefresh != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 13, OwnershipRefresh$$serializer.INSTANCE, ownershipRefresh);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || list != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), list);
        }
        beginStructure.encodeStringElement(serialDescriptor, 15, value.object);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
