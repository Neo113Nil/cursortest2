package defpackage;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.Image$$serializer;
import defpackage.FinancialConnectionsGenericInfoScreen;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"FinancialConnectionsGenericInfoScreen.Header.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen$Header;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;LFinancialConnectionsGenericInfoScreen$Header;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)LFinancialConnectionsGenericInfoScreen$Header;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* synthetic */ class FinancialConnectionsGenericInfoScreen$Header$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$Header$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsGenericInfoScreen$Header$$serializer financialConnectionsGenericInfoScreen$Header$$serializer = new FinancialConnectionsGenericInfoScreen$Header$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$Header$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen.Header", financialConnectionsGenericInfoScreen$Header$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE), BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) FinancialConnectionsGenericInfoScreen.Header.$childSerializers[3].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsGenericInfoScreen.Header deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsGenericInfoScreen.Header.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Image image = null;
        Alignment alignment = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MarkdownToHtmlSerializer.INSTANCE, str2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                image = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, image);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                alignment = (Alignment) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), alignment);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen.Header(i, str, str2, image, alignment);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen.Header value) {
        encoder.getClass();
        value.getClass();
        Alignment alignment = value.alignment;
        Image image = value.icon;
        String str = value.subtitle;
        String str2 = value.title;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsGenericInfoScreen.Header.$childSerializers;
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, MarkdownToHtmlSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, image);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || alignment != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), alignment);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
