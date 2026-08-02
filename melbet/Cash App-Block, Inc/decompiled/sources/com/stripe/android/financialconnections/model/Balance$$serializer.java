package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.Balance;
import java.util.Map;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/Balance.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/Balance;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/Balance;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/Balance;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class Balance$$serializer implements GeneratedSerializer {
    public static final Balance$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Balance$$serializer balance$$serializer = new Balance$$serializer();
        INSTANCE = balance$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.Balance", balance$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("as_of", false);
        pluginGeneratedSerialDescriptor.addElement("current", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("cash", true);
        pluginGeneratedSerialDescriptor.addElement("credit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = Balance.$childSerializers;
        return new KSerializer[]{IntSerializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue(), BuiltinSerializersKt.getNullable(CashBalance$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CreditBalance$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Balance deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = Balance.$childSerializers;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Map map = null;
        Balance.Type type2 = null;
        CashBalance cashBalance = null;
        CreditBalance creditBalance = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                i2 = beginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                map = (Map) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), map);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                type2 = (Balance.Type) beginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), type2);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                cashBalance = (CashBalance) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CashBalance$$serializer.INSTANCE, cashBalance);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                creditBalance = (CreditBalance) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CreditBalance$$serializer.INSTANCE, creditBalance);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new Balance(i, i2, map, type2, cashBalance, creditBalance);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Balance value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = Balance.$childSerializers;
        int i = value.asOf;
        CreditBalance creditBalance = value.credit;
        CashBalance cashBalance = value.cash;
        Balance.Type type2 = value.f1432type;
        beginStructure.encodeIntElement(0, i, serialDescriptor);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), value.current);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || type2 != Balance.Type.UNKNOWN) {
            beginStructure.encodeSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), type2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || cashBalance != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, CashBalance$$serializer.INSTANCE, cashBalance);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || creditBalance != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, CreditBalance$$serializer.INSTANCE, creditBalance);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
