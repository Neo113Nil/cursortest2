package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsSession$$serializer implements GeneratedSerializer {
    public static final FinancialConnectionsSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsSession$$serializer financialConnectionsSession$$serializer = new FinancialConnectionsSession$$serializer();
        INSTANCE = financialConnectionsSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsSession", financialConnectionsSession$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("client_secret", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("linked_accounts", true);
        pluginGeneratedSerialDescriptor.addElement("accounts", true);
        pluginGeneratedSerialDescriptor.addElement("livemode", false);
        pluginGeneratedSerialDescriptor.addElement("payment_account", true);
        pluginGeneratedSerialDescriptor.addElement("return_url", true);
        pluginGeneratedSerialDescriptor.addElement("bank_account_token", true);
        pluginGeneratedSerialDescriptor.addElement("manual_entry", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("status_details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(financialConnectionsAccountList$$serializer), BuiltinSerializersKt.getNullable(financialConnectionsAccountList$$serializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(PaymentAccountSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JsonAsStringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ManualEntry$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSession.Status.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsSession deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        FinancialConnectionsSession.StatusDetails statusDetails = null;
        FinancialConnectionsSession.Status status = null;
        boolean z2 = true;
        ManualEntry manualEntry = null;
        int i = 0;
        String str = null;
        String str2 = null;
        FinancialConnectionsAccountList financialConnectionsAccountList = null;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = null;
        boolean z3 = false;
        PaymentAccount paymentAccount = null;
        String str3 = null;
        String str4 = null;
        while (z2) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    z = z2;
                    financialConnectionsAccountList = (FinancialConnectionsAccountList) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    financialConnectionsAccountList2 = (FinancialConnectionsAccountList) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList2);
                    i |= 8;
                    break;
                case 4:
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    z = z2;
                    paymentAccount = (PaymentAccount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PaymentAccountSerializer.INSTANCE, paymentAccount);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonAsStringSerializer.INSTANCE, str4);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    manualEntry = (ManualEntry) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ManualEntry$$serializer.INSTANCE, manualEntry);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    status = (FinancialConnectionsSession.Status) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FinancialConnectionsSession.Status.Serializer.INSTANCE, status);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    statusDetails = (FinancialConnectionsSession.StatusDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, statusDetails);
                    i |= 1024;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
            z2 = z;
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsSession(i, str, str2, financialConnectionsAccountList, financialConnectionsAccountList2, z3, paymentAccount, str3, str4, manualEntry, status, statusDetails);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.clientSecret;
        FinancialConnectionsSession.StatusDetails statusDetails = value.statusDetails;
        FinancialConnectionsSession.Status status = value.status;
        ManualEntry manualEntry = value.manualEntry;
        String str2 = value.bankAccountToken;
        String str3 = value.returnUrl;
        PaymentAccount paymentAccount = value.paymentAccount;
        FinancialConnectionsAccountList financialConnectionsAccountList = value.accountsNew;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = value.accountsOld;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.id);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsAccountList2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsAccountList != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList);
        }
        beginStructure.encodeBooleanElement(serialDescriptor, 4, value.livemode);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || paymentAccount != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, PaymentAccountSerializer.INSTANCE, paymentAccount);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, JsonAsStringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || manualEntry != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, ManualEntry$$serializer.INSTANCE, manualEntry);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || status != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 9, FinancialConnectionsSession.Status.Serializer.INSTANCE, status);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || statusDetails != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, statusDetails);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
