package defpackage;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Text.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* synthetic */ class FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer financialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer = new FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen.Body.Entry.Text", financialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FinancialConnectionsGenericInfoScreen.Body.Entry.Text.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue());
        KSerializer nullable2 = BuiltinSerializersKt.getNullable((KSerializer) lazyArr[3].getValue());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, nullable, nullable2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsGenericInfoScreen.Body.Entry.Text deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsGenericInfoScreen.Body.Entry.Text.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Alignment alignment = null;
        Size size = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                alignment = (Alignment) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), alignment);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                size = (Size) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), size);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen.Body.Entry.Text(i, str, str2, alignment, size);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen.Body.Entry.Text value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsGenericInfoScreen.Body.Entry.Text.$childSerializers;
        String str = value.id;
        Size size = value.size;
        Alignment alignment = value.alignment;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.text);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || alignment != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (KSerializer) lazyArr[2].getValue(), alignment);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || size != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), size);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
