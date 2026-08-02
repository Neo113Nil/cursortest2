package defpackage;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"FinancialConnectionsGenericInfoScreen.Footer.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;LFinancialConnectionsGenericInfoScreen$Footer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)LFinancialConnectionsGenericInfoScreen$Footer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* synthetic */ class FinancialConnectionsGenericInfoScreen$Footer$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$Footer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsGenericInfoScreen$Footer$$serializer financialConnectionsGenericInfoScreen$Footer$$serializer = new FinancialConnectionsGenericInfoScreen$Footer$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$Footer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen.Footer", financialConnectionsGenericInfoScreen$Footer$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", true);
        pluginGeneratedSerialDescriptor.addElement("primary_cta", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_cta", true);
        pluginGeneratedSerialDescriptor.addElement("below_cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE);
        FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer financialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer = FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(financialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer), BuiltinSerializersKt.getNullable(financialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsGenericInfoScreen.Footer deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction = null;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction2 = null;
        String str2 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, str);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                genericInfoAction = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                genericInfoAction2 = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction2);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen.Footer(i, str, genericInfoAction, genericInfoAction2, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen.Footer value) {
        encoder.getClass();
        value.getClass();
        String str = value.belowCta;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction = value.secondaryCta;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction2 = value.primaryCta;
        String str2 = value.disclaimer;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || genericInfoAction2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || genericInfoAction != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
