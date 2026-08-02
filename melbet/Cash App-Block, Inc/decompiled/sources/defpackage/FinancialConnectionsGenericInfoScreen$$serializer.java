package defpackage;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import defpackage.FinancialConnectionsGenericInfoScreen;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"FinancialConnectionsGenericInfoScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;LFinancialConnectionsGenericInfoScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)LFinancialConnectionsGenericInfoScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class FinancialConnectionsGenericInfoScreen$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsGenericInfoScreen$$serializer financialConnectionsGenericInfoScreen$$serializer = new FinancialConnectionsGenericInfoScreen$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen", financialConnectionsGenericInfoScreen$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("header", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement(Footer.f1485type, true);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsGenericInfoScreen deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        FinancialConnectionsGenericInfoScreen.Header header = null;
        FinancialConnectionsGenericInfoScreen.Body body = null;
        FinancialConnectionsGenericInfoScreen.Footer footer = null;
        FinancialConnectionsGenericInfoScreen.Options options = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                header = (FinancialConnectionsGenericInfoScreen.Header) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE, header);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                body = (FinancialConnectionsGenericInfoScreen.Body) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE, body);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                footer = (FinancialConnectionsGenericInfoScreen.Footer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE, footer);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                options = (FinancialConnectionsGenericInfoScreen.Options) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE, options);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen(i, str, header, body, footer, options);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.id;
        FinancialConnectionsGenericInfoScreen.Options options = value.options;
        FinancialConnectionsGenericInfoScreen.Footer footer = value.footer;
        FinancialConnectionsGenericInfoScreen.Body body = value.body;
        FinancialConnectionsGenericInfoScreen.Header header = value.header;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || header != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE, header);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || body != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE, body);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || footer != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE, footer);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || options != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE, options);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
