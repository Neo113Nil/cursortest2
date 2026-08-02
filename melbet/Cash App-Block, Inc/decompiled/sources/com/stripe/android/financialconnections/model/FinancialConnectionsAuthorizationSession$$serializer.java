package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Deprecated;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsAuthorizationSession$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsAuthorizationSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsAuthorizationSession$$serializer financialConnectionsAuthorizationSession$$serializer = new FinancialConnectionsAuthorizationSession$$serializer();
        INSTANCE = financialConnectionsAuthorizationSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession", financialConnectionsAuthorizationSession$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("next_pane", false);
        pluginGeneratedSerialDescriptor.addElement("flow", true);
        pluginGeneratedSerialDescriptor.addElement("institution_skip_account_selection", true);
        pluginGeneratedSerialDescriptor.addElement("show_partner_disclosure", true);
        pluginGeneratedSerialDescriptor.addElement("skip_account_selection", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("url_qr_code", true);
        pluginGeneratedSerialDescriptor.addElement("is_oauth", true);
        pluginGeneratedSerialDescriptor.addElement("display", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, nullable, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(Display$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsAuthorizationSession deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Display display = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        String str = null;
        FinancialConnectionsSessionManifest.Pane pane = null;
        String str2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    pane = (FinancialConnectionsSessionManifest.Pane) beginStructure.decodeSerializableElement(serialDescriptor, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool3);
                    i |= 16;
                    break;
                case 5:
                    bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool4);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str4);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool);
                    i |= 256;
                    break;
                case 9:
                    display = (Display) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Display$$serializer.INSTANCE, display);
                    i |= 512;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsAuthorizationSession(i, str, pane, str2, bool2, bool3, bool4, str3, str4, bool, display);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsAuthorizationSession value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.id;
        Display display = value.display;
        Boolean bool = value._isOAuth;
        String str2 = value.urlQrCode;
        String str3 = value.url;
        Boolean bool2 = value.skipAccountSelection;
        Boolean bool3 = value.showPartnerDisclosure;
        Boolean bool4 = value.institutionSkipAccountSelection;
        String str4 = value.flow;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, value.nextPane);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || !Intrinsics.areEqual(bool, Boolean.FALSE)) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || display != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 9, Display$$serializer.INSTANCE, display);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
