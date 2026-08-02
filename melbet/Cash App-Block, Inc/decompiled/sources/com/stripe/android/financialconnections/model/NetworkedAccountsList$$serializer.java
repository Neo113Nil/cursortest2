package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccountsList.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class NetworkedAccountsList$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final NetworkedAccountsList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NetworkedAccountsList$$serializer networkedAccountsList$$serializer = new NetworkedAccountsList$$serializer();
        INSTANCE = networkedAccountsList$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.NetworkedAccountsList", networkedAccountsList$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("display", true);
        pluginGeneratedSerialDescriptor.addElement("next_pane_on_add_account", true);
        pluginGeneratedSerialDescriptor.addElement("partner_to_core_auths", true);
        pluginGeneratedSerialDescriptor.addElement("acquire_consent_on_primary_cta_click", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = NetworkedAccountsList.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.getNullable(Display$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NetworkedAccountsList deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = NetworkedAccountsList.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        Display display = null;
        FinancialConnectionsSessionManifest.Pane pane = null;
        Map map = null;
        Boolean bool = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                display = (Display) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Display$$serializer.INSTANCE, display);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                pane = (FinancialConnectionsSessionManifest.Pane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                map = (Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), map);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new NetworkedAccountsList(i, list, display, pane, map, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NetworkedAccountsList value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = NetworkedAccountsList.$childSerializers;
        KSerializer kSerializer = (KSerializer) lazyArr[0].getValue();
        List list = value.data;
        Boolean bool = value.acquireConsentOnPrimaryCtaClick;
        Map map = value.partnerToCoreAuths;
        FinancialConnectionsSessionManifest.Pane pane = value.nextPaneOnAddAccount;
        Display display = value.display;
        beginStructure.encodeSerializableElement(serialDescriptor, 0, kSerializer, list);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || display != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, Display$$serializer.INSTANCE, display);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || pane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || map != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), map);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(bool, Boolean.FALSE)) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
