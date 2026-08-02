package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class LinkAccountSessionPaymentAccount$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final LinkAccountSessionPaymentAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LinkAccountSessionPaymentAccount$$serializer linkAccountSessionPaymentAccount$$serializer = new LinkAccountSessionPaymentAccount$$serializer();
        INSTANCE = linkAccountSessionPaymentAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount", linkAccountSessionPaymentAccount$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("microdeposit_verification_method", true);
        pluginGeneratedSerialDescriptor.addElement("networking_successful", true);
        pluginGeneratedSerialDescriptor.addElement("next_pane", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, LinkAccountSessionPaymentAccount.$childSerializers[1].getValue(), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LinkAccountSessionPaymentAccount deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LinkAccountSessionPaymentAccount.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod = null;
        Boolean bool = null;
        FinancialConnectionsSessionManifest.Pane pane = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                microdepositVerificationMethod = (LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod) beginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), microdepositVerificationMethod);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                pane = (FinancialConnectionsSessionManifest.Pane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new LinkAccountSessionPaymentAccount(i, str, microdepositVerificationMethod, bool, pane);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LinkAccountSessionPaymentAccount value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LinkAccountSessionPaymentAccount.$childSerializers;
        String str = value.id;
        FinancialConnectionsSessionManifest.Pane pane = value.nextPane;
        Boolean bool = value.networkingSuccessful;
        LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod = value.microdepositVerificationMethod;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || microdepositVerificationMethod != LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.UNKNOWN) {
            beginStructure.encodeSerializableElement(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), microdepositVerificationMethod);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || pane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
